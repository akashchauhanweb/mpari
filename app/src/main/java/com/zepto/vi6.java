package com.zepto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class vi6 implements Runnable {
    public static final Object i = new Object();
    public static Boolean j;
    public static Boolean k;
    public final Context c;
    public final lt3 e;
    public final PowerManager.WakeLock f;
    public final ui6 g;
    public final long h;

    public class a extends BroadcastReceiver {
        public vi6 a;

        public a(vi6 vi6Var) {
            this.a = vi6Var;
        }

        public void a() {
            if (vi6.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            vi6.this.c.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                vi6 vi6Var = this.a;
                if (vi6Var == null) {
                    return;
                }
                if (vi6Var.i()) {
                    if (vi6.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.a.g.l(this.a, 0L);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vi6(ui6 ui6Var, Context context, lt3 lt3Var, long j2) {
        this.g = ui6Var;
        this.c = context;
        this.h = j2;
        this.e = lt3Var;
        this.f = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (i) {
            try {
                Boolean bool = k;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                k = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z;
    }

    public static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (i) {
            try {
                Boolean bool = j;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                j = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.c     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.vi6.i():boolean");
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.c)) {
            this.f.acquire(ww0.a);
        }
        try {
            try {
                try {
                    this.g.m(true);
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    this.g.m(false);
                    if (!h(this.c)) {
                        return;
                    } else {
                        wakeLock = this.f;
                    }
                }
                if (!this.e.g()) {
                    this.g.m(false);
                    if (h(this.c)) {
                        try {
                            this.f.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (f(this.c) && !i()) {
                    new a(this).a();
                    if (h(this.c)) {
                        try {
                            this.f.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.g.p()) {
                    this.g.m(false);
                } else {
                    this.g.q(this.h);
                }
                if (h(this.c)) {
                    wakeLock = this.f;
                    wakeLock.release();
                }
            } catch (Throwable th) {
                if (h(this.c)) {
                    try {
                        this.f.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
