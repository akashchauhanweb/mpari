package com.zepto;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.zepto.yf3;
import com.zepto.yp;
import com.zepto.zj2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i28 implements zj2.a, zj2.b {
    public final yp.f b;
    public final iq c;
    public final v18 d;
    public final int g;
    public final j38 h;
    public boolean i;
    public final /* synthetic */ ak2 m;
    public final Queue a = new LinkedList();
    public final Set e = new HashSet();
    public final Map f = new HashMap();
    public final List j = new ArrayList();
    public lw0 k = null;
    public int l = 0;

    public i28(ak2 ak2Var, wj2 wj2Var) {
        this.m = ak2Var;
        yp.f fVarN = wj2Var.n(ak2Var.p.getLooper(), this);
        this.b = fVarN;
        this.c = wj2Var.k();
        this.d = new v18();
        this.g = wj2Var.m();
        if (fVarN.k()) {
            this.h = wj2Var.o(ak2Var.g, ak2Var.p);
        } else {
            this.h = null;
        }
    }

    public static /* bridge */ /* synthetic */ void A(i28 i28Var, k28 k28Var) {
        if (i28Var.j.contains(k28Var) && !i28Var.i) {
            if (i28Var.b.isConnected()) {
                i28Var.h();
            } else {
                i28Var.D();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void B(i28 i28Var, k28 k28Var) {
        w82[] w82VarArrG;
        if (i28Var.j.remove(k28Var)) {
            i28Var.m.p.removeMessages(15, k28Var);
            i28Var.m.p.removeMessages(16, k28Var);
            w82 w82Var = k28Var.b;
            ArrayList arrayList = new ArrayList(i28Var.a.size());
            for (j48 j48Var : i28Var.a) {
                if ((j48Var instanceof q28) && (w82VarArrG = ((q28) j48Var).g(i28Var)) != null && ux.b(w82VarArrG, w82Var)) {
                    arrayList.add(j48Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                j48 j48Var2 = (j48) arrayList.get(i);
                i28Var.a.remove(j48Var2);
                j48Var2.b(new jq6(w82Var));
            }
        }
    }

    public final void C() {
        iu4.d(this.m.p);
        this.k = null;
    }

    public final void D() {
        iu4.d(this.m.p);
        if (this.b.isConnected() || this.b.g()) {
            return;
        }
        try {
            ak2 ak2Var = this.m;
            int iB = ak2Var.i.b(ak2Var.g, this.b);
            if (iB == 0) {
                ak2 ak2Var2 = this.m;
                yp.f fVar = this.b;
                m28 m28Var = new m28(ak2Var2, fVar, this.c);
                if (fVar.k()) {
                    ((j38) iu4.i(this.h)).s0(m28Var);
                }
                try {
                    this.b.n(m28Var);
                    return;
                } catch (SecurityException e) {
                    G(new lw0(10), e);
                    return;
                }
            }
            lw0 lw0Var = new lw0(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + lw0Var.toString());
            G(lw0Var, null);
        } catch (IllegalStateException e2) {
            G(new lw0(10), e2);
        }
    }

    public final void E(j48 j48Var) {
        iu4.d(this.m.p);
        if (this.b.isConnected()) {
            if (o(j48Var)) {
                l();
                return;
            } else {
                this.a.add(j48Var);
                return;
            }
        }
        this.a.add(j48Var);
        lw0 lw0Var = this.k;
        if (lw0Var == null || !lw0Var.f()) {
            D();
        } else {
            G(this.k, null);
        }
    }

    public final void F() {
        this.l++;
    }

    public final void G(lw0 lw0Var, Exception exc) {
        iu4.d(this.m.p);
        j38 j38Var = this.h;
        if (j38Var != null) {
            j38Var.t0();
        }
        C();
        this.m.i.c();
        e(lw0Var);
        if ((this.b instanceof x48) && lw0Var.c() != 24) {
            this.m.d = true;
            ak2 ak2Var = this.m;
            ak2Var.p.sendMessageDelayed(ak2Var.p.obtainMessage(19), 300000L);
        }
        if (lw0Var.c() == 4) {
            f(ak2.s);
            return;
        }
        if (this.a.isEmpty()) {
            this.k = lw0Var;
            return;
        }
        if (exc != null) {
            iu4.d(this.m.p);
            g(null, exc, false);
            return;
        }
        if (!this.m.q) {
            f(ak2.h(this.c, lw0Var));
            return;
        }
        g(ak2.h(this.c, lw0Var), null, true);
        if (this.a.isEmpty() || p(lw0Var) || this.m.g(lw0Var, this.g)) {
            return;
        }
        if (lw0Var.c() == 18) {
            this.i = true;
        }
        if (!this.i) {
            f(ak2.h(this.c, lw0Var));
        } else {
            ak2 ak2Var2 = this.m;
            ak2Var2.p.sendMessageDelayed(Message.obtain(ak2Var2.p, 9, this.c), this.m.a);
        }
    }

    public final void H(lw0 lw0Var) {
        iu4.d(this.m.p);
        yp.f fVar = this.b;
        fVar.c("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(lw0Var));
        G(lw0Var, null);
    }

    public final void I() {
        iu4.d(this.m.p);
        if (this.i) {
            D();
        }
    }

    public final void J() {
        iu4.d(this.m.p);
        f(ak2.r);
        this.d.d();
        for (yf3.a aVar : (yf3.a[]) this.f.keySet().toArray(new yf3.a[0])) {
            E(new f48(aVar, new rc6()));
        }
        e(new lw0(4));
        if (this.b.isConnected()) {
            this.b.a(new h28(this));
        }
    }

    public final void K() {
        iu4.d(this.m.p);
        if (this.i) {
            n();
            ak2 ak2Var = this.m;
            f(ak2Var.h.f(ak2Var.g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.b.c("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.b.k();
    }

    public final boolean a() {
        return q(true);
    }

    public final w82 b(w82[] w82VarArr) {
        if (w82VarArr != null && w82VarArr.length != 0) {
            w82[] w82VarArrH = this.b.h();
            if (w82VarArrH == null) {
                w82VarArrH = new w82[0];
            }
            nx nxVar = new nx(w82VarArrH.length);
            for (w82 w82Var : w82VarArrH) {
                nxVar.put(w82Var.c(), Long.valueOf(w82Var.d()));
            }
            for (w82 w82Var2 : w82VarArr) {
                Long l = (Long) nxVar.get(w82Var2.c());
                if (l == null || l.longValue() < w82Var2.d()) {
                    return w82Var2;
                }
            }
        }
        return null;
    }

    @Override // com.zepto.lg4
    public final void c(lw0 lw0Var) {
        G(lw0Var, null);
    }

    @Override // com.zepto.jw0
    public final void d(int i) {
        if (Looper.myLooper() == this.m.p.getLooper()) {
            k(i);
        } else {
            this.m.p.post(new f28(this, i));
        }
    }

    public final void e(lw0 lw0Var) {
        Iterator it = this.e.iterator();
        if (!it.hasNext()) {
            this.e.clear();
            return;
        }
        wb0.a(it.next());
        if (if4.a(lw0Var, lw0.h)) {
            this.b.i();
        }
        throw null;
    }

    public final void f(Status status) {
        iu4.d(this.m.p);
        g(status, null, false);
    }

    public final void g(Status status, Exception exc, boolean z) {
        iu4.d(this.m.p);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j48 j48Var = (j48) it.next();
            if (!z || j48Var.a == 2) {
                if (status != null) {
                    j48Var.a(status);
                } else {
                    j48Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j48 j48Var = (j48) arrayList.get(i);
            if (!this.b.isConnected()) {
                return;
            }
            if (o(j48Var)) {
                this.a.remove(j48Var);
            }
        }
    }

    public final void i() {
        C();
        e(lw0.h);
        n();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            a38 a38Var = (a38) it.next();
            if (b(a38Var.a.c()) != null) {
                it.remove();
            } else {
                try {
                    a38Var.a.d(this.b, new rc6());
                } catch (DeadObjectException unused) {
                    d(3);
                    this.b.c("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        h();
        l();
    }

    @Override // com.zepto.jw0
    public final void j(Bundle bundle) {
        if (Looper.myLooper() == this.m.p.getLooper()) {
            i();
        } else {
            this.m.p.post(new e28(this));
        }
    }

    public final void k(int i) {
        C();
        this.i = true;
        this.d.c(i, this.b.j());
        ak2 ak2Var = this.m;
        ak2Var.p.sendMessageDelayed(Message.obtain(ak2Var.p, 9, this.c), this.m.a);
        ak2 ak2Var2 = this.m;
        ak2Var2.p.sendMessageDelayed(Message.obtain(ak2Var2.p, 11, this.c), this.m.b);
        this.m.i.c();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((a38) it.next()).c.run();
        }
    }

    public final void l() {
        this.m.p.removeMessages(12, this.c);
        ak2 ak2Var = this.m;
        ak2Var.p.sendMessageDelayed(ak2Var.p.obtainMessage(12, this.c), this.m.c);
    }

    public final void m(j48 j48Var) {
        j48Var.d(this.d, L());
        try {
            j48Var.c(this);
        } catch (DeadObjectException unused) {
            d(1);
            this.b.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void n() {
        if (this.i) {
            this.m.p.removeMessages(11, this.c);
            this.m.p.removeMessages(9, this.c);
            this.i = false;
        }
    }

    public final boolean o(j48 j48Var) {
        if (!(j48Var instanceof q28)) {
            m(j48Var);
            return true;
        }
        q28 q28Var = (q28) j48Var;
        w82 w82VarB = b(q28Var.g(this));
        if (w82VarB == null) {
            m(j48Var);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + w82VarB.c() + ", " + w82VarB.d() + ").");
        if (!this.m.q || !q28Var.f(this)) {
            q28Var.b(new jq6(w82VarB));
            return true;
        }
        k28 k28Var = new k28(this.c, w82VarB, null);
        int iIndexOf = this.j.indexOf(k28Var);
        if (iIndexOf >= 0) {
            k28 k28Var2 = (k28) this.j.get(iIndexOf);
            this.m.p.removeMessages(15, k28Var2);
            ak2 ak2Var = this.m;
            ak2Var.p.sendMessageDelayed(Message.obtain(ak2Var.p, 15, k28Var2), this.m.a);
            return false;
        }
        this.j.add(k28Var);
        ak2 ak2Var2 = this.m;
        ak2Var2.p.sendMessageDelayed(Message.obtain(ak2Var2.p, 15, k28Var), this.m.a);
        ak2 ak2Var3 = this.m;
        ak2Var3.p.sendMessageDelayed(Message.obtain(ak2Var3.p, 16, k28Var), this.m.b);
        lw0 lw0Var = new lw0(2, null);
        if (p(lw0Var)) {
            return false;
        }
        this.m.g(lw0Var, this.g);
        return false;
    }

    public final boolean p(lw0 lw0Var) {
        synchronized (ak2.t) {
            try {
                ak2 ak2Var = this.m;
                if (ak2Var.m == null || !ak2Var.n.contains(this.c)) {
                    return false;
                }
                this.m.m.s(lw0Var, this.g);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q(boolean z) {
        iu4.d(this.m.p);
        if (!this.b.isConnected() || this.f.size() != 0) {
            return false;
        }
        if (!this.d.e()) {
            this.b.c("Timing out service connection.");
            return true;
        }
        if (z) {
            l();
        }
        return false;
    }

    public final int r() {
        return this.g;
    }

    public final int s() {
        return this.l;
    }

    public final yp.f u() {
        return this.b;
    }

    public final Map w() {
        return this.f;
    }
}
