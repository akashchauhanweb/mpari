package com.zepto;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class tj2 {
    public static int a = 4225;
    public static final Object b = new Object();
    public static zk8 c;
    public static HandlerThread d;
    public static boolean e;

    public static int a() {
        return a;
    }

    public static tj2 b(Context context) {
        synchronized (b) {
            try {
                if (c == null) {
                    c = new zk8(context.getApplicationContext(), e ? c().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static HandlerThread c() {
        synchronized (b) {
            try {
                HandlerThread handlerThread = d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                d = handlerThread2;
                handlerThread2.start();
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d(nj8 nj8Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        d(new nj8(str, str2, i, z), serviceConnection, str3);
    }

    public abstract boolean f(nj8 nj8Var, ServiceConnection serviceConnection, String str, Executor executor);
}
