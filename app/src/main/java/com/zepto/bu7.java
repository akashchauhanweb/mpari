package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class bu7 extends Exception {
    public final m44 networkResponse;
    private long networkTimeMs;

    public bu7() {
        this.networkResponse = null;
    }

    public long getNetworkTimeMs() {
        return this.networkTimeMs;
    }

    public void setNetworkTimeMs(long j) {
        this.networkTimeMs = j;
    }

    public bu7(m44 m44Var) {
        this.networkResponse = m44Var;
    }

    public bu7(String str) {
        super(str);
        this.networkResponse = null;
    }

    public bu7(String str, Throwable th) {
        super(str, th);
        this.networkResponse = null;
    }

    public bu7(Throwable th) {
        super(th);
        this.networkResponse = null;
    }
}
