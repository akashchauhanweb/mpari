package com.zepto;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class tc5 {
    private static final int DEFAULT_NETWORK_THREAD_POOL_SIZE = 4;
    private final g90 mCache;
    private l90 mCacheDispatcher;
    private final PriorityBlockingQueue<ic5> mCacheQueue;
    private final Set<ic5> mCurrentRequests;
    private final od5 mDelivery;
    private final g44[] mDispatchers;
    private final List<b> mEventListeners;
    private final List<d> mFinishedListeners;
    private final t34 mNetwork;
    private final PriorityBlockingQueue<ic5> mNetworkQueue;
    private final AtomicInteger mSequenceGenerator;

    public class a implements c {
        final /* synthetic */ Object val$tag;

        public a(Object obj) {
            this.val$tag = obj;
        }

        @Override // com.zepto.tc5.c
        public boolean apply(ic5 ic5Var) {
            return ic5Var.getTag() == this.val$tag;
        }
    }

    public interface b {
    }

    public interface c {
        boolean apply(ic5 ic5Var);
    }

    public interface d {
    }

    public tc5(g90 g90Var, t34 t34Var, int i, od5 od5Var) {
        this.mSequenceGenerator = new AtomicInteger();
        this.mCurrentRequests = new HashSet();
        this.mCacheQueue = new PriorityBlockingQueue<>();
        this.mNetworkQueue = new PriorityBlockingQueue<>();
        this.mFinishedListeners = new ArrayList();
        this.mEventListeners = new ArrayList();
        this.mCache = g90Var;
        this.mNetwork = t34Var;
        this.mDispatchers = new g44[i];
        this.mDelivery = od5Var;
    }

    public <T> ic5 add(ic5 ic5Var) {
        ic5Var.setRequestQueue(this);
        synchronized (this.mCurrentRequests) {
            this.mCurrentRequests.add(ic5Var);
        }
        ic5Var.setSequence(getSequenceNumber());
        ic5Var.addMarker("add-to-queue");
        sendRequestEvent(ic5Var, 0);
        beginRequest(ic5Var);
        return ic5Var;
    }

    public void addRequestEventListener(b bVar) {
        synchronized (this.mEventListeners) {
            this.mEventListeners.add(bVar);
        }
    }

    @Deprecated
    public <T> void addRequestFinishedListener(d dVar) {
        synchronized (this.mFinishedListeners) {
            this.mFinishedListeners.add(dVar);
        }
    }

    public <T> void beginRequest(ic5 ic5Var) {
        if (ic5Var.shouldCache()) {
            this.mCacheQueue.add(ic5Var);
        } else {
            sendRequestOverNetwork(ic5Var);
        }
    }

    public void cancelAll(c cVar) {
        synchronized (this.mCurrentRequests) {
            try {
                for (ic5 ic5Var : this.mCurrentRequests) {
                    if (cVar.apply(ic5Var)) {
                        ic5Var.cancel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> void finish(ic5 ic5Var) {
        synchronized (this.mCurrentRequests) {
            this.mCurrentRequests.remove(ic5Var);
        }
        synchronized (this.mFinishedListeners) {
            Iterator<d> it = this.mFinishedListeners.iterator();
            if (it.hasNext()) {
                wb0.a(it.next());
                throw null;
            }
        }
        sendRequestEvent(ic5Var, 5);
    }

    public g90 getCache() {
        return this.mCache;
    }

    public od5 getResponseDelivery() {
        return this.mDelivery;
    }

    public int getSequenceNumber() {
        return this.mSequenceGenerator.incrementAndGet();
    }

    public void removeRequestEventListener(b bVar) {
        synchronized (this.mEventListeners) {
            this.mEventListeners.remove(bVar);
        }
    }

    @Deprecated
    public <T> void removeRequestFinishedListener(d dVar) {
        synchronized (this.mFinishedListeners) {
            this.mFinishedListeners.remove(dVar);
        }
    }

    public void sendRequestEvent(ic5 ic5Var, int i) {
        synchronized (this.mEventListeners) {
            try {
                Iterator<b> it = this.mEventListeners.iterator();
                if (it.hasNext()) {
                    wb0.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> void sendRequestOverNetwork(ic5 ic5Var) {
        this.mNetworkQueue.add(ic5Var);
    }

    public void start() {
        stop();
        l90 l90Var = new l90(this.mCacheQueue, this.mNetworkQueue, this.mCache, this.mDelivery);
        this.mCacheDispatcher = l90Var;
        l90Var.start();
        for (int i = 0; i < this.mDispatchers.length; i++) {
            g44 g44Var = new g44(this.mNetworkQueue, this.mNetwork, this.mCache, this.mDelivery);
            this.mDispatchers[i] = g44Var;
            g44Var.start();
        }
    }

    public void stop() {
        l90 l90Var = this.mCacheDispatcher;
        if (l90Var != null) {
            l90Var.quit();
        }
        for (g44 g44Var : this.mDispatchers) {
            if (g44Var != null) {
                g44Var.quit();
            }
        }
    }

    public void cancelAll(Object obj) {
        if (obj != null) {
            cancelAll((c) new a(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public tc5(g90 g90Var, t34 t34Var, int i) {
        this(g90Var, t34Var, i, new d62(new Handler(Looper.getMainLooper())));
    }

    public tc5(g90 g90Var, t34 t34Var) {
        this(g90Var, t34Var, 4);
    }
}
