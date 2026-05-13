package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends IOException {
    public Throwable c;

    public d0(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.c;
    }

    public d0(String str, Throwable th) {
        super(str);
        this.c = th;
    }
}
