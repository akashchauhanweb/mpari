package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public enum os3 {
    NO_CACHE(1),
    NO_STORE(2);

    public final int c;

    os3(int i) {
        this.c = i;
    }

    public static boolean a(int i) {
        return (i & NO_CACHE.c) == 0;
    }

    public static boolean b(int i) {
        return (i & NO_STORE.c) == 0;
    }
}
