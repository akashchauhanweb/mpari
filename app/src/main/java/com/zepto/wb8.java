package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class wb8 {
    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
