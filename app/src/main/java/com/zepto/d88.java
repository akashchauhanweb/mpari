package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class d88 {
    public static final Map o = new HashMap();
    public final Context a;
    public final z68 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final s78 i;
    public ServiceConnection m;
    public IInterface n;
    public final List d = new ArrayList();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public final IBinder.DeathRecipient k = new IBinder.DeathRecipient() { // from class: com.zepto.i78
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d88.i(this.a);
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public d88(Context context, z68 z68Var, String str, Intent intent, s78 s78Var, q78 q78Var) {
        this.a = context;
        this.b = z68Var;
        this.c = str;
        this.h = intent;
        this.i = s78Var;
    }

    public static /* synthetic */ void i(d88 d88Var) {
        d88Var.b.d("reportBinderDeath", new Object[0]);
        wb0.a(d88Var.j.get());
        d88Var.b.d("%s : Binder has died.", d88Var.c);
        Iterator it = d88Var.d.iterator();
        while (it.hasNext()) {
            ((d78) it.next()).c(d88Var.t());
        }
        d88Var.d.clear();
        d88Var.u();
    }

    public static /* bridge */ /* synthetic */ void n(d88 d88Var, d78 d78Var) {
        if (d88Var.n != null || d88Var.g) {
            if (!d88Var.g) {
                d78Var.run();
                return;
            } else {
                d88Var.b.d("Waiting to bind to the service.", new Object[0]);
                d88Var.d.add(d78Var);
                return;
            }
        }
        d88Var.b.d("Initiate binding to the service.", new Object[0]);
        d88Var.d.add(d78Var);
        a88 a88Var = new a88(d88Var, null);
        d88Var.m = a88Var;
        d88Var.g = true;
        if (d88Var.a.bindService(d88Var.h, a88Var, 1)) {
            return;
        }
        d88Var.b.d("Failed to bind to the service.", new Object[0]);
        d88Var.g = false;
        Iterator it = d88Var.d.iterator();
        while (it.hasNext()) {
            ((d78) it.next()).c(new f88());
        }
        d88Var.d.clear();
    }

    public static /* bridge */ /* synthetic */ void o(d88 d88Var) {
        d88Var.b.d("linkToDeath", new Object[0]);
        try {
            d88Var.n.asBinder().linkToDeath(d88Var.k, 0);
        } catch (RemoteException e) {
            d88Var.b.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void p(d88 d88Var) {
        d88Var.b.d("unlinkToDeath", new Object[0]);
        d88Var.n.asBinder().unlinkToDeath(d88Var.k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.n;
    }

    public final void q(d78 d78Var, final rh8 rh8Var) {
        synchronized (this.f) {
            this.e.add(rh8Var);
            rh8Var.a().a(new ig4() { // from class: com.zepto.k78
                @Override // com.zepto.ig4
                public final void a(pc6 pc6Var) {
                    this.a.r(rh8Var, pc6Var);
                }
            });
        }
        synchronized (this.f) {
            try {
                if (this.l.getAndIncrement() > 0) {
                    this.b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c().post(new m78(this, d78Var.b(), d78Var));
    }

    public final /* synthetic */ void r(rh8 rh8Var, pc6 pc6Var) {
        synchronized (this.f) {
            this.e.remove(rh8Var);
        }
    }

    public final void s(rh8 rh8Var) {
        synchronized (this.f) {
            this.e.remove(rh8Var);
        }
        synchronized (this.f) {
            try {
                if (this.l.get() > 0 && this.l.decrementAndGet() > 0) {
                    this.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new o78(this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final RemoteException t() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    public final void u() {
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((rh8) it.next()).d(t());
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
