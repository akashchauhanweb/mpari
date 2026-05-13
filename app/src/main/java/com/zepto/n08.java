package com.zepto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class n08 implements Serializable {
    public final int c;
    public final byte[] e;

    public n08(int i, byte[] bArr) {
        this.c = i;
        this.e = bArr;
    }

    public int a() {
        return this.c;
    }

    public byte[] b() {
        return v08.c(this.e);
    }
}
