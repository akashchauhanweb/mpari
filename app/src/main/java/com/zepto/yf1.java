package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class yf1 extends to5 {
    public static final yf1 k = new yf1();

    public yf1() {
        super(hd6.c, hd6.d, hd6.e, hd6.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.zepto.sz0
    public String toString() {
        return "Dispatchers.Default";
    }
}
