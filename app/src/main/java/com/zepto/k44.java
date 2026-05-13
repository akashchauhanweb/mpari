package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public enum k44 {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    public final int c;

    k44(int i) {
        this.c = i;
    }

    public static boolean a(int i) {
        return (i & OFFLINE.c) != 0;
    }

    public static boolean b(int i) {
        return (i & NO_CACHE.c) == 0;
    }

    public static boolean c(int i) {
        return (i & NO_STORE.c) == 0;
    }
}
