package com.zepto;

import android.os.Process;
import com.zepto.g90;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class l90 extends Thread {
    private static final boolean DEBUG = cu7.DEBUG;
    private final g90 mCache;
    private final BlockingQueue<ic5> mCacheQueue;
    private final od5 mDelivery;
    private final BlockingQueue<ic5> mNetworkQueue;
    private volatile boolean mQuit = false;
    private final lu7 mWaitingRequestManager;

    public class a implements Runnable {
        final /* synthetic */ ic5 val$request;

        public a(ic5 ic5Var) {
            this.val$request = ic5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                l90.this.mNetworkQueue.put(this.val$request);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public l90(BlockingQueue<ic5> blockingQueue, BlockingQueue<ic5> blockingQueue2, g90 g90Var, od5 od5Var) {
        this.mCacheQueue = blockingQueue;
        this.mNetworkQueue = blockingQueue2;
        this.mCache = g90Var;
        this.mDelivery = od5Var;
        this.mWaitingRequestManager = new lu7(this, blockingQueue2, od5Var);
    }

    private void processRequest() throws InterruptedException {
        processRequest(this.mCacheQueue.take());
    }

    public void quit() {
        this.mQuit = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (DEBUG) {
            cu7.v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.mCache.initialize();
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.mQuit) {
                    Thread.currentThread().interrupt();
                    return;
                }
                cu7.e("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public void processRequest(ic5 ic5Var) throws InterruptedException {
        ic5Var.addMarker("cache-queue-take");
        ic5Var.sendEvent(1);
        try {
            if (ic5Var.isCanceled()) {
                ic5Var.finish("cache-discard-canceled");
                return;
            }
            g90.a aVar = this.mCache.get(ic5Var.getCacheKey());
            if (aVar == null) {
                ic5Var.addMarker("cache-miss");
                if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(ic5Var)) {
                    this.mNetworkQueue.put(ic5Var);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.isExpired(jCurrentTimeMillis)) {
                ic5Var.addMarker("cache-hit-expired");
                ic5Var.setCacheEntry(aVar);
                if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(ic5Var)) {
                    this.mNetworkQueue.put(ic5Var);
                }
                return;
            }
            ic5Var.addMarker("cache-hit");
            id5 networkResponse = ic5Var.parseNetworkResponse(new m44(aVar.data, aVar.responseHeaders));
            ic5Var.addMarker("cache-hit-parsed");
            if (!networkResponse.isSuccess()) {
                ic5Var.addMarker("cache-parsing-failed");
                this.mCache.invalidate(ic5Var.getCacheKey(), true);
                ic5Var.setCacheEntry(null);
                if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(ic5Var)) {
                    this.mNetworkQueue.put(ic5Var);
                }
                return;
            }
            if (!aVar.refreshNeeded(jCurrentTimeMillis)) {
                this.mDelivery.postResponse(ic5Var, networkResponse);
            } else {
                ic5Var.addMarker("cache-hit-refresh-needed");
                ic5Var.setCacheEntry(aVar);
                networkResponse.intermediate = true;
                if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(ic5Var)) {
                    this.mDelivery.postResponse(ic5Var, networkResponse, new a(ic5Var));
                } else {
                    this.mDelivery.postResponse(ic5Var, networkResponse);
                }
            }
        } finally {
            ic5Var.sendEvent(2);
        }
    }
}
