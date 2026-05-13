package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q31 extends Exception {
    public Throwable c;

    public q31(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.c;
    }
}
