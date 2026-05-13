package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class lz7 {
    public static lz7 b = new lz7();
    public xk4 a = null;

    public static xk4 a(Context context) {
        return b.b(context);
    }

    public final synchronized xk4 b(Context context) {
        try {
            if (this.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.a = new xk4(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
