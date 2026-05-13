package com.zepto;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class iu4 {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static String f(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void g() {
        h("Must not be called on the main application thread");
    }

    public static void h(String str) {
        if (d98.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static Object i(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object j(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void k(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void l(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
