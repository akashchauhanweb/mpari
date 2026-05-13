package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class k58 {
    public static d68 a;

    public static synchronized d68 a(Context context) {
        try {
            if (a == null) {
                ym8 ym8Var = new ym8(null);
                ym8Var.a(new oh8(pb8.a(context)));
                a = ym8Var.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
