package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class b22 extends IllegalStateException {
    public Throwable c;

    public b22(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.c;
    }
}
