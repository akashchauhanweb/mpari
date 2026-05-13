package com.zepto;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class g44 extends Thread {
    private final g90 mCache;
    private final od5 mDelivery;
    private final t34 mNetwork;
    private final BlockingQueue<ic5> mQueue;
    private volatile boolean mQuit = false;

    public g44(BlockingQueue<ic5> blockingQueue, t34 t34Var, g90 g90Var, od5 od5Var) {
        this.mQueue = blockingQueue;
        this.mNetwork = t34Var;
        this.mCache = g90Var;
        this.mDelivery = od5Var;
    }

    @TargetApi(14)
    private void addTrafficStatsTag(ic5 ic5Var) {
        TrafficStats.setThreadStatsTag(ic5Var.getTrafficStatsTag());
    }

    private void parseAndDeliverNetworkError(ic5 ic5Var, bu7 bu7Var) {
        this.mDelivery.postError(ic5Var, ic5Var.parseNetworkError(bu7Var));
    }

    private void processRequest() throws InterruptedException {
        processRequest(this.mQueue.take());
    }

    public void quit() {
        this.mQuit = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.mQuit) {
                    Thread.currentThread().interrupt();
                    return;
                }
                cu7.e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public void processRequest(ic5 ic5Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ic5Var.sendEvent(3);
        try {
            try {
                try {
                    ic5Var.addMarker("network-queue-take");
                } catch (Exception e) {
                    cu7.e(e, "Unhandled exception %s", e.toString());
                    bu7 bu7Var = new bu7(e);
                    bu7Var.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.mDelivery.postError(ic5Var, bu7Var);
                    ic5Var.notifyListenerResponseNotUsable();
                }
            } catch (bu7 e2) {
                e2.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
                parseAndDeliverNetworkError(ic5Var, e2);
                ic5Var.notifyListenerResponseNotUsable();
            }
            if (ic5Var.isCanceled()) {
                ic5Var.finish("network-discard-cancelled");
                ic5Var.notifyListenerResponseNotUsable();
                return;
            }
            addTrafficStatsTag(ic5Var);
            m44 m44VarPerformRequest = this.mNetwork.performRequest(ic5Var);
            ic5Var.addMarker("network-http-complete");
            if (m44VarPerformRequest.notModified && ic5Var.hasHadResponseDelivered()) {
                ic5Var.finish("not-modified");
                ic5Var.notifyListenerResponseNotUsable();
                return;
            }
            id5 networkResponse = ic5Var.parseNetworkResponse(m44VarPerformRequest);
            ic5Var.addMarker("network-parse-complete");
            if (ic5Var.shouldCache() && networkResponse.cacheEntry != null) {
                this.mCache.put(ic5Var.getCacheKey(), networkResponse.cacheEntry);
                ic5Var.addMarker("network-cache-written");
            }
            ic5Var.markDelivered();
            this.mDelivery.postResponse(ic5Var, networkResponse);
            ic5Var.notifyListenerResponseReceived(networkResponse);
        } finally {
            ic5Var.sendEvent(4);
        }
    }
}
