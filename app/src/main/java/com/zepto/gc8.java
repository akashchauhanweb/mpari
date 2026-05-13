package com.zepto;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class gc8 implements Closeable {
    public abstract long d();

    public abstract InputStream e(long j, long j2);

    public final synchronized InputStream j() {
        return e(0L, d());
    }
}
