package com.zepto;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.zepto.yf3;

/* JADX INFO: loaded from: classes.dex */
public final class ud8 extends sj2 {
    public final w26 I;
    public final w26 J;
    public final w26 K;

    public ud8(Context context, Looper looper, tq0 tq0Var, jw0 jw0Var, lg4 lg4Var) {
        super(context, looper, 23, tq0Var, jw0Var, lg4Var);
        this.I = new w26();
        this.J = new w26();
        this.K = new w26();
    }

    @Override // com.zepto.t40
    public final String B() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.zepto.t40
    public final String C() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.zepto.t40
    public final void J(int i) {
        super.J(i);
        synchronized (this.I) {
            this.I.clear();
        }
        synchronized (this.J) {
            this.J.clear();
        }
        synchronized (this.K) {
            this.K.clear();
        }
    }

    @Override // com.zepto.t40
    public final boolean O() {
        return true;
    }

    @Override // com.zepto.t40, com.zepto.yp.f
    public final int f() {
        return 11717000;
    }

    public final void h0(yf3.a aVar, boolean z, rc6 rc6Var) {
        synchronized (this.J) {
            try {
                ed8 ed8Var = (ed8) this.J.remove(aVar);
                if (ed8Var == null) {
                    rc6Var.c(Boolean.FALSE);
                    return;
                }
                ed8Var.q0();
                if (!z) {
                    rc6Var.c(Boolean.TRUE);
                } else if (i0(fj8.j)) {
                    ((yj8) A()).m(wd8.c(null, ed8Var, null, null), new ec8(this, Boolean.TRUE, rc6Var));
                } else {
                    ((yj8) A()).v(new ee8(2, null, null, ed8Var, null, new kc8(Boolean.TRUE, rc6Var), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i0(w82 w82Var) {
        w82 w82Var2;
        w82[] w82VarArrH = h();
        if (w82VarArrH == null) {
            return false;
        }
        int length = w82VarArrH.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                w82Var2 = null;
                break;
            }
            w82Var2 = w82VarArrH[i];
            if (w82Var.c().equals(w82Var2.c())) {
                break;
            }
            i++;
        }
        return w82Var2 != null && w82Var2.d() >= w82Var.d();
    }

    public final void j0(bb3 bb3Var, rc6 rc6Var) {
        v();
        if (i0(fj8.f)) {
            ((yj8) A()).O(bb3Var, new hc8(this, rc6Var));
        } else {
            rc6Var.c(((yj8) A()).a());
        }
    }

    public final void k0(xc8 xc8Var, LocationRequest locationRequest, rc6 rc6Var) {
        ed8 ed8Var;
        yf3 yf3VarA = xc8Var.a();
        yf3.a aVarB = yf3VarA.b();
        aVarB.getClass();
        boolean zI0 = i0(fj8.j);
        synchronized (this.J) {
            try {
                ed8 ed8Var2 = (ed8) this.J.get(aVarB);
                if (ed8Var2 == null || zI0) {
                    ed8 ed8Var3 = new ed8(xc8Var);
                    this.J.put(aVarB, ed8Var3);
                    ed8Var = ed8Var3;
                } else {
                    ed8Var2.p0(yf3VarA);
                    ed8Var = ed8Var2;
                    ed8Var2 = null;
                }
                v();
                String strA = aVarB.a();
                if (zI0) {
                    ((yj8) A()).p(wd8.c(ed8Var2, ed8Var, null, strA), locationRequest, new ec8(this, null, rc6Var));
                } else {
                    yj8 yj8Var = (yj8) A();
                    LocationRequest.a aVar = new LocationRequest.a(locationRequest);
                    aVar.f(null);
                    yj8Var.v(new ee8(1, ae8.c(null, aVar.a()), null, ed8Var, null, new pc8(rc6Var, ed8Var), strA));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.t40
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof yj8 ? (yj8) iInterfaceQueryLocalInterface : new pj8(iBinder);
    }

    @Override // com.zepto.t40
    public final w82[] s() {
        return fj8.l;
    }
}
