package com.zepto;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.zepto.yf3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ak2 implements Handler.Callback {
    public static final Status r = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status s = new Status(4, "The user must be signed in to make this API call.");
    public static final Object t = new Object();
    public static ak2 u;
    public sd6 e;
    public ud6 f;
    public final Context g;
    public final xj2 h;
    public final n48 i;
    public final Handler p;
    public volatile boolean q;
    public long a = 5000;
    public long b = 120000;
    public long c = 10000;
    public boolean d = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public w18 m = null;
    public final Set n = new qx();
    public final Set o = new qx();

    public ak2(Context context, Looper looper, xj2 xj2Var) {
        this.q = true;
        this.g = context;
        b58 b58Var = new b58(looper, this);
        this.p = b58Var;
        this.h = xj2Var;
        this.i = new n48(xj2Var);
        if (hj1.a(context)) {
            this.q = false;
        }
        b58Var.sendMessage(b58Var.obtainMessage(6));
    }

    public static Status h(iq iqVar, lw0 lw0Var) {
        return new Status(lw0Var, "API: " + iqVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(lw0Var));
    }

    public static ak2 x(Context context) {
        ak2 ak2Var;
        synchronized (t) {
            try {
                if (u == null) {
                    u = new ak2(context.getApplicationContext(), tj2.c().getLooper(), xj2.l());
                }
                ak2Var = u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ak2Var;
    }

    public final Task A(wj2 wj2Var, yf3.a aVar, int i) {
        rc6 rc6Var = new rc6();
        l(rc6Var, i, wj2Var);
        f48 f48Var = new f48(aVar, rc6Var);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(13, new z28(f48Var, this.k.get(), wj2Var)));
        return rc6Var.a();
    }

    public final void F(wj2 wj2Var, int i, qc6 qc6Var, rc6 rc6Var, i76 i76Var) {
        l(rc6Var, qc6Var.d(), wj2Var);
        b48 b48Var = new b48(i, qc6Var, rc6Var, i76Var);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(4, new z28(b48Var, this.k.get(), wj2Var)));
    }

    public final void G(vt3 vt3Var, int i, long j, int i2) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(18, new y28(vt3Var, i, j, i2)));
    }

    public final void H(lw0 lw0Var, int i) {
        if (g(lw0Var, i)) {
            return;
        }
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(5, i, 0, lw0Var));
    }

    public final void a() {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(wj2 wj2Var) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(7, wj2Var));
    }

    public final void c(w18 w18Var) {
        synchronized (t) {
            try {
                if (this.m != w18Var) {
                    this.m = w18Var;
                    this.n.clear();
                }
                this.n.addAll(w18Var.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(w18 w18Var) {
        synchronized (t) {
            try {
                if (this.m == w18Var) {
                    this.m = null;
                    this.n.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        if (this.d) {
            return false;
        }
        te5 te5VarA = se5.b().a();
        if (te5VarA != null && !te5VarA.e()) {
            return false;
        }
        int iA = this.i.a(this.g, 203400000);
        return iA == -1 || iA == 0;
    }

    public final boolean g(lw0 lw0Var, int i) {
        return this.h.v(this.g, lw0Var, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        i28 i28Var = null;
        switch (i) {
            case 1:
                this.c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.p.removeMessages(12);
                for (iq iqVar : this.l.keySet()) {
                    Handler handler = this.p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, iqVar), this.c);
                }
                return true;
            case 2:
                wb0.a(message.obj);
                throw null;
            case 3:
                for (i28 i28Var2 : this.l.values()) {
                    i28Var2.C();
                    i28Var2.D();
                }
                return true;
            case 4:
            case 8:
            case 13:
                z28 z28Var = (z28) message.obj;
                i28 i28VarI = (i28) this.l.get(z28Var.c.k());
                if (i28VarI == null) {
                    i28VarI = i(z28Var.c);
                }
                if (!i28VarI.L() || this.k.get() == z28Var.b) {
                    i28VarI.E(z28Var.a);
                } else {
                    z28Var.a.a(r);
                    i28VarI.J();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                lw0 lw0Var = (lw0) message.obj;
                Iterator it = this.l.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        i28 i28Var3 = (i28) it.next();
                        if (i28Var3.r() == i2) {
                            i28Var = i28Var3;
                        }
                    }
                }
                if (i28Var == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                } else if (lw0Var.c() == 13) {
                    i28Var.f(new Status(17, "Error resolution was canceled by the user, original error message: " + this.h.d(lw0Var.c()) + ": " + lw0Var.d()));
                } else {
                    i28Var.f(h(i28Var.c, lw0Var));
                }
                return true;
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    w30.c((Application) this.g.getApplicationContext());
                    w30.b().a(new d28(this));
                    if (!w30.b().e(true)) {
                        this.c = 300000L;
                    }
                }
                return true;
            case 7:
                i((wj2) message.obj);
                return true;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    ((i28) this.l.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it2 = this.o.iterator();
                while (it2.hasNext()) {
                    i28 i28Var4 = (i28) this.l.remove((iq) it2.next());
                    if (i28Var4 != null) {
                        i28Var4.J();
                    }
                }
                this.o.clear();
                return true;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    ((i28) this.l.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    ((i28) this.l.get(message.obj)).a();
                }
                return true;
            case 14:
                wb0.a(message.obj);
                throw null;
            case 15:
                k28 k28Var = (k28) message.obj;
                if (this.l.containsKey(k28Var.a)) {
                    i28.A((i28) this.l.get(k28Var.a), k28Var);
                }
                return true;
            case 16:
                k28 k28Var2 = (k28) message.obj;
                if (this.l.containsKey(k28Var2.a)) {
                    i28.B((i28) this.l.get(k28Var2.a), k28Var2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                y28 y28Var = (y28) message.obj;
                if (y28Var.c == 0) {
                    j().a(new sd6(y28Var.b, Arrays.asList(y28Var.a)));
                } else {
                    sd6 sd6Var = this.e;
                    if (sd6Var != null) {
                        List listD = sd6Var.d();
                        if (sd6Var.c() != y28Var.b || (listD != null && listD.size() >= y28Var.d)) {
                            this.p.removeMessages(17);
                            k();
                        } else {
                            this.e.e(y28Var.a);
                        }
                    }
                    if (this.e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(y28Var.a);
                        this.e = new sd6(y28Var.b, arrayList);
                        Handler handler2 = this.p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), y28Var.c);
                    }
                }
                return true;
            case 19:
                this.d = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }

    public final i28 i(wj2 wj2Var) {
        iq iqVarK = wj2Var.k();
        i28 i28Var = (i28) this.l.get(iqVarK);
        if (i28Var == null) {
            i28Var = new i28(this, wj2Var);
            this.l.put(iqVarK, i28Var);
        }
        if (i28Var.L()) {
            this.o.add(iqVarK);
        }
        i28Var.D();
        return i28Var;
    }

    public final ud6 j() {
        if (this.f == null) {
            this.f = td6.a(this.g);
        }
        return this.f;
    }

    public final void k() {
        sd6 sd6Var = this.e;
        if (sd6Var != null) {
            if (sd6Var.c() > 0 || f()) {
                j().a(sd6Var);
            }
            this.e = null;
        }
    }

    public final void l(rc6 rc6Var, int i, wj2 wj2Var) {
        x28 x28VarB;
        if (i == 0 || (x28VarB = x28.b(this, i, wj2Var.k())) == null) {
            return;
        }
        Task taskA = rc6Var.a();
        final Handler handler = this.p;
        handler.getClass();
        taskA.c(new Executor() { // from class: com.zepto.c28
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, x28VarB);
    }

    public final int m() {
        return this.j.getAndIncrement();
    }

    public final i28 w(iq iqVar) {
        return (i28) this.l.get(iqVar);
    }

    public final Task z(wj2 wj2Var, s75 s75Var, dq6 dq6Var, Runnable runnable) {
        rc6 rc6Var = new rc6();
        l(rc6Var, s75Var.e(), wj2Var);
        y38 y38Var = new y38(new a38(s75Var, dq6Var, runnable), rc6Var);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(8, new z28(y38Var, this.k.get(), wj2Var)));
        return rc6Var.a();
    }
}
