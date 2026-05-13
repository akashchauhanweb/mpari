package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class si6 {
    public static WeakReference d;
    public final SharedPreferences a;
    public u06 b;
    public final Executor c;

    public si6(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized si6 a(Context context, Executor executor) {
        si6 si6Var;
        try {
            WeakReference weakReference = d;
            si6Var = weakReference != null ? (si6) weakReference.get() : null;
            if (si6Var == null) {
                si6Var = new si6(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                si6Var.c();
                d = new WeakReference(si6Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return si6Var;
    }

    public synchronized ri6 b() {
        return ri6.a(this.b.e());
    }

    public final synchronized void c() {
        this.b = u06.c(this.a, "topic_operation_queue", ",", this.c);
    }

    public synchronized boolean d(ri6 ri6Var) {
        return this.b.f(ri6Var.e());
    }
}
