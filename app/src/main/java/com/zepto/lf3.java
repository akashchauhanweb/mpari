package com.zepto;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lf3 extends InputStream {
    public final InputStream c;
    public int e;

    public lf3(InputStream inputStream, int i) {
        this.c = inputStream;
        this.e = i;
    }

    public int d() {
        return this.e;
    }

    public void e(boolean z) {
        InputStream inputStream = this.c;
        if (inputStream instanceof jy2) {
            ((jy2) inputStream).m(z);
        }
    }
}
