package com.zepto;

import com.zepto.g90;
import com.zepto.ic5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class lu7 implements ic5.b {
    private final l90 mCacheDispatcher;
    private final BlockingQueue<ic5> mNetworkQueue;
    private final tc5 mRequestQueue;
    private final od5 mResponseDelivery;
    private final Map<String, List<ic5>> mWaitingRequests;

    public lu7(tc5 tc5Var) {
        this.mWaitingRequests = new HashMap();
        this.mRequestQueue = tc5Var;
        this.mResponseDelivery = tc5Var.getResponseDelivery();
        this.mCacheDispatcher = null;
        this.mNetworkQueue = null;
    }

    public synchronized boolean maybeAddToWaitingRequests(ic5 ic5Var) {
        try {
            String cacheKey = ic5Var.getCacheKey();
            if (!this.mWaitingRequests.containsKey(cacheKey)) {
                this.mWaitingRequests.put(cacheKey, null);
                ic5Var.setNetworkRequestCompleteListener(this);
                if (cu7.DEBUG) {
                    cu7.d("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List<ic5> arrayList = this.mWaitingRequests.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            ic5Var.addMarker("waiting-for-response");
            arrayList.add(ic5Var);
            this.mWaitingRequests.put(cacheKey, arrayList);
            if (cu7.DEBUG) {
                cu7.d("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.zepto.ic5.b
    public synchronized void onNoUsableResponseReceived(ic5 ic5Var) {
        BlockingQueue<ic5> blockingQueue;
        try {
            String cacheKey = ic5Var.getCacheKey();
            List<ic5> listRemove = this.mWaitingRequests.remove(cacheKey);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (cu7.DEBUG) {
                    cu7.v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), cacheKey);
                }
                ic5 ic5VarRemove = listRemove.remove(0);
                this.mWaitingRequests.put(cacheKey, listRemove);
                ic5VarRemove.setNetworkRequestCompleteListener(this);
                tc5 tc5Var = this.mRequestQueue;
                if (tc5Var != null) {
                    tc5Var.sendRequestOverNetwork(ic5VarRemove);
                } else if (this.mCacheDispatcher != null && (blockingQueue = this.mNetworkQueue) != null) {
                    try {
                        blockingQueue.put(ic5VarRemove);
                    } catch (InterruptedException e) {
                        cu7.e("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        this.mCacheDispatcher.quit();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.zepto.ic5.b
    public void onResponseReceived(ic5 ic5Var, id5 id5Var) {
        List<ic5> listRemove;
        g90.a aVar = id5Var.cacheEntry;
        if (aVar == null || aVar.isExpired()) {
            onNoUsableResponseReceived(ic5Var);
            return;
        }
        String cacheKey = ic5Var.getCacheKey();
        synchronized (this) {
            listRemove = this.mWaitingRequests.remove(cacheKey);
        }
        if (listRemove != null) {
            if (cu7.DEBUG) {
                cu7.v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), cacheKey);
            }
            Iterator<ic5> it = listRemove.iterator();
            while (it.hasNext()) {
                this.mResponseDelivery.postResponse(it.next(), id5Var);
            }
        }
    }

    public lu7(l90 l90Var, BlockingQueue<ic5> blockingQueue, od5 od5Var) {
        this.mWaitingRequests = new HashMap();
        this.mRequestQueue = null;
        this.mResponseDelivery = od5Var;
        this.mCacheDispatcher = l90Var;
        this.mNetworkQueue = blockingQueue;
    }
}
