package com.zepto;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xj8 implements ServiceConnection, il8 {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final nj8 e;
    public ComponentName f;
    public final /* synthetic */ zk8 g;

    public xj8(zk8 zk8Var, nj8 nj8Var) {
        this.g = zk8Var;
        this.e = nj8Var;
    }

    public final int a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.f;
    }

    public final IBinder c() {
        return this.d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (ls4.k()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            zk8 zk8Var = this.g;
            boolean zD = zk8Var.j.d(zk8Var.g, str, this.e.c(zk8Var.g), this, this.e.a(), executor);
            this.c = zD;
            if (zD) {
                this.g.h.sendMessageDelayed(this.g.h.obtainMessage(1, this.e), this.g.l);
            } else {
                this.b = 2;
                try {
                    zk8 zk8Var2 = this.g;
                    zk8Var2.j.c(zk8Var2.g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.g.h.removeMessages(1, this.e);
        zk8 zk8Var = this.g;
        zk8Var.j.c(zk8Var.g, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.f) {
            try {
                this.g.h.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.f) {
            try {
                this.g.h.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
