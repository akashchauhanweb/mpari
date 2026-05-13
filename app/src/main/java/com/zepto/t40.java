package com.zepto;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class t40 {
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public yl8 g;
    public final Context h;
    public final Looper i;
    public final tj2 j;
    public final yj2 k;
    public final Handler l;
    public ow2 o;
    public c p;
    public IInterface q;
    public lf8 s;
    public final a u;
    public final b v;
    public final int w;
    public final String x;
    public volatile String y;
    public static final w82[] E = new w82[0];
    public static final String[] D = {"service_esmobile", "service_googleme"};
    public volatile String f = null;
    public final Object m = new Object();
    public final Object n = new Object();
    public final ArrayList r = new ArrayList();
    public int t = 1;
    public lw0 z = null;
    public boolean A = false;
    public volatile di8 B = null;
    public AtomicInteger C = new AtomicInteger(0);

    public interface a {
        void d(int i);

        void j(Bundle bundle);
    }

    public interface b {
        void c(lw0 lw0Var);
    }

    public interface c {
        void b(lw0 lw0Var);
    }

    public class d implements c {
        public d() {
        }

        @Override // com.zepto.t40.c
        public final void b(lw0 lw0Var) {
            if (lw0Var.g()) {
                t40 t40Var = t40.this;
                t40Var.d(null, t40Var.z());
            } else if (t40.this.v != null) {
                t40.this.v.c(lw0Var);
            }
        }
    }

    public interface e {
        void a();
    }

    public t40(Context context, Looper looper, tj2 tj2Var, yj2 yj2Var, int i, a aVar, b bVar, String str) {
        iu4.j(context, "Context must not be null");
        this.h = context;
        iu4.j(looper, "Looper must not be null");
        this.i = looper;
        iu4.j(tj2Var, "Supervisor must not be null");
        this.j = tj2Var;
        iu4.j(yj2Var, "API availability must not be null");
        this.k = yj2Var;
        this.l = new c98(this, looper);
        this.w = i;
        this.u = aVar;
        this.v = bVar;
        this.x = str;
    }

    public static /* bridge */ /* synthetic */ void Y(t40 t40Var, di8 di8Var) {
        t40Var.B = di8Var;
        if (t40Var.O()) {
            pw0 pw0Var = di8Var.g;
            se5.b().c(pw0Var == null ? null : pw0Var.h());
        }
    }

    public static /* bridge */ /* synthetic */ void Z(t40 t40Var, int i) {
        int i2;
        int i3;
        synchronized (t40Var.m) {
            i2 = t40Var.t;
        }
        if (i2 == 3) {
            t40Var.A = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = t40Var.l;
        handler.sendMessage(handler.obtainMessage(i3, t40Var.C.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean c0(t40 t40Var, int i, int i2, IInterface iInterface) {
        synchronized (t40Var.m) {
            try {
                if (t40Var.t != i) {
                    return false;
                }
                t40Var.e0(i2, iInterface);
                return true;
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean d0(t40 t40Var) {
        if (t40Var.A || TextUtils.isEmpty(t40Var.B()) || TextUtils.isEmpty(t40Var.y())) {
            return false;
        }
        try {
            Class.forName(t40Var.B());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final IInterface A() {
        IInterface iInterface;
        synchronized (this.m) {
            try {
                if (this.t == 5) {
                    throw new DeadObjectException();
                }
                o();
                iInterface = this.q;
                iu4.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String B();

    public abstract String C();

    public String D() {
        return "com.google.android.gms";
    }

    public pw0 E() {
        di8 di8Var = this.B;
        if (di8Var == null) {
            return null;
        }
        return di8Var.g;
    }

    public boolean F() {
        return f() >= 211700000;
    }

    public boolean G() {
        return this.B != null;
    }

    public void H(IInterface iInterface) {
        this.c = System.currentTimeMillis();
    }

    public void I(lw0 lw0Var) {
        this.d = lw0Var.c();
        this.e = System.currentTimeMillis();
    }

    public void J(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    public void K(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new pg8(this, i, iBinder, bundle)));
    }

    public boolean L() {
        return false;
    }

    public void M(String str) {
        this.y = str;
    }

    public void N(int i) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i));
    }

    public boolean O() {
        return false;
    }

    public final String T() {
        String str = this.x;
        return str == null ? this.h.getClass().getName() : str;
    }

    public void a(e eVar) {
        eVar.a();
    }

    public final void a0(int i, Bundle bundle, int i2) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new ah8(this, i, null)));
    }

    public void c(String str) {
        this.f = str;
        disconnect();
    }

    public void d(kw2 kw2Var, Set set) {
        Bundle bundleX = x();
        int i = this.w;
        String str = this.y;
        int i2 = yj2.a;
        Scope[] scopeArr = kj2.r;
        Bundle bundle = new Bundle();
        w82[] w82VarArr = kj2.s;
        kj2 kj2Var = new kj2(6, i, i2, null, null, scopeArr, bundle, null, w82VarArr, w82VarArr, true, 0, false, str);
        kj2Var.g = this.h.getPackageName();
        kj2Var.j = bundleX;
        if (set != null) {
            kj2Var.i = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            Account accountR = r();
            if (accountR == null) {
                accountR = new Account("<<default account>>", "com.google");
            }
            kj2Var.k = accountR;
            if (kw2Var != null) {
                kj2Var.h = kw2Var.asBinder();
            }
        } else if (L()) {
            kj2Var.k = r();
        }
        kj2Var.l = E;
        kj2Var.m = s();
        if (O()) {
            kj2Var.p = true;
        }
        try {
            synchronized (this.n) {
                try {
                    ow2 ow2Var = this.o;
                    if (ow2Var != null) {
                        ow2Var.r(new kd8(this, this.C.get()), kj2Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            N(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            K(8, null, null, this.C.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            K(8, null, null, this.C.get());
        }
    }

    public void disconnect() {
        this.C.incrementAndGet();
        synchronized (this.r) {
            try {
                int size = this.r.size();
                for (int i = 0; i < size; i++) {
                    ((xa8) this.r.get(i)).d();
                }
                this.r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.n) {
            this.o = null;
        }
        e0(1, null);
    }

    public boolean e() {
        return true;
    }

    public final void e0(int i, IInterface iInterface) {
        yl8 yl8Var;
        iu4.a((i == 4) == (iInterface != null));
        synchronized (this.m) {
            try {
                this.t = i;
                this.q = iInterface;
                if (i == 1) {
                    lf8 lf8Var = this.s;
                    if (lf8Var != null) {
                        tj2 tj2Var = this.j;
                        String strC = this.g.c();
                        iu4.i(strC);
                        tj2Var.e(strC, this.g.b(), this.g.a(), lf8Var, T(), this.g.d());
                        this.s = null;
                    }
                } else if (i == 2 || i == 3) {
                    lf8 lf8Var2 = this.s;
                    if (lf8Var2 != null && (yl8Var = this.g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + yl8Var.c() + " on " + yl8Var.b());
                        tj2 tj2Var2 = this.j;
                        String strC2 = this.g.c();
                        iu4.i(strC2);
                        tj2Var2.e(strC2, this.g.b(), this.g.a(), lf8Var2, T(), this.g.d());
                        this.C.incrementAndGet();
                    }
                    lf8 lf8Var3 = new lf8(this, this.C.get());
                    this.s = lf8Var3;
                    yl8 yl8Var2 = (this.t != 3 || y() == null) ? new yl8(D(), C(), false, tj2.a(), F()) : new yl8(v().getPackageName(), y(), true, tj2.a(), false);
                    this.g = yl8Var2;
                    if (yl8Var2.d() && f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.c())));
                    }
                    tj2 tj2Var3 = this.j;
                    String strC3 = this.g.c();
                    iu4.i(strC3);
                    if (!tj2Var3.f(new nj8(strC3, this.g.b(), this.g.a(), this.g.d()), lf8Var3, T(), t())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.g.c() + " on " + this.g.b());
                        a0(16, null, this.C.get());
                    }
                } else if (i == 4) {
                    iu4.i(iInterface);
                    H(iInterface);
                }
            } finally {
            }
        }
    }

    public abstract int f();

    public boolean g() {
        boolean z;
        synchronized (this.m) {
            int i = this.t;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final w82[] h() {
        di8 di8Var = this.B;
        if (di8Var == null) {
            return null;
        }
        return di8Var.e;
    }

    public String i() {
        yl8 yl8Var;
        if (!isConnected() || (yl8Var = this.g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return yl8Var.b();
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 4;
        }
        return z;
    }

    public String j() {
        return this.f;
    }

    public boolean k() {
        return false;
    }

    public void n(c cVar) {
        iu4.j(cVar, "Connection progress callbacks cannot be null.");
        this.p = cVar;
        e0(2, null);
    }

    public final void o() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface p(IBinder iBinder);

    public boolean q() {
        return false;
    }

    public abstract Account r();

    public w82[] s() {
        return E;
    }

    public abstract Executor t();

    public Bundle u() {
        return null;
    }

    public final Context v() {
        return this.h;
    }

    public int w() {
        return this.w;
    }

    public Bundle x() {
        return new Bundle();
    }

    public String y() {
        return null;
    }

    public abstract Set z();
}
