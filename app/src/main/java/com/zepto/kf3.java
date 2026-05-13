package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kf3 {
    public static final void a(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }
}
