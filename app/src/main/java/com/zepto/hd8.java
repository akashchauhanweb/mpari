package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class hd8 {
    public static l58 a;

    public static synchronized l58 a(Context context) {
        try {
            if (a == null) {
                gb8 gb8Var = new gb8(null);
                gb8Var.b(new mk8(pb8.a(context)));
                a = gb8Var.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
