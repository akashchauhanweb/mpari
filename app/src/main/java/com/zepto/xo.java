package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo {
    public static boolean a;
    public static final Class b = a("libcore.io.Memory");
    public static final boolean c;

    static {
        c = (a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return b;
    }

    public static boolean c() {
        return a || !(b == null || c);
    }
}
