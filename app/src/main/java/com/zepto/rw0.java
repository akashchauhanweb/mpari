package com.zepto;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class rw0 {
    public static final Object b = new Object();
    public static volatile rw0 c;
    public ConcurrentHashMap a = new ConcurrentHashMap();

    public static rw0 b() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new rw0();
                    }
                } finally {
                }
            }
        }
        rw0 rw0Var = c;
        iu4.i(rw0Var);
        return rw0Var;
    }

    public static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof il8);
    }

    public static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return (!ls4.i() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.a.get(serviceConnection));
        } finally {
            this.a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return f(context, str, intent, serviceConnection, i, true, executor);
    }

    public final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((lz7.a(context).b(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zH = h(context, intent, serviceConnection, i, executor);
            if (zH) {
                return zH;
            }
            return false;
        } finally {
            this.a.remove(serviceConnection, serviceConnection);
        }
    }
}
