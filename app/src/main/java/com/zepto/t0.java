package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class t0 extends IllegalStateException {
    public Throwable c;

    public t0(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.c;
    }

    public t0(String str, Throwable th) {
        super(str);
        this.c = th;
    }
}
