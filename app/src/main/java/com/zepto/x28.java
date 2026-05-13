package com.zepto;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class x28 implements jg4 {
    public final ak2 a;
    public final int b;
    public final iq c;
    public final long d;
    public final long e;

    public x28(ak2 ak2Var, int i, iq iqVar, long j, long j2, String str, String str2) {
        this.a = ak2Var;
        this.b = i;
        this.c = iqVar;
        this.d = j;
        this.e = j2;
    }

    public static x28 b(ak2 ak2Var, int i, iq iqVar) {
        boolean zF;
        if (!ak2Var.f()) {
            return null;
        }
        te5 te5VarA = se5.b().a();
        if (te5VarA == null) {
            zF = true;
        } else {
            if (!te5VarA.e()) {
                return null;
            }
            zF = te5VarA.f();
            i28 i28VarW = ak2Var.w(iqVar);
            if (i28VarW != null) {
                if (!(i28VarW.u() instanceof t40)) {
                    return null;
                }
                t40 t40Var = (t40) i28VarW.u();
                if (t40Var.G() && !t40Var.g()) {
                    pw0 pw0VarC = c(i28VarW, t40Var, i);
                    if (pw0VarC == null) {
                        return null;
                    }
                    i28VarW.F();
                    zF = pw0VarC.g();
                }
            }
        }
        return new x28(ak2Var, i, iqVar, zF ? System.currentTimeMillis() : 0L, zF ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static pw0 c(i28 i28Var, t40 t40Var, int i) {
        int[] iArrD;
        int[] iArrE;
        pw0 pw0VarE = t40Var.E();
        if (pw0VarE == null || !pw0VarE.f() || ((iArrD = pw0VarE.d()) != null ? !ux.a(iArrD, i) : !((iArrE = pw0VarE.e()) == null || !ux.a(iArrE, i))) || i28Var.s() >= pw0VarE.c()) {
            return null;
        }
        return pw0VarE;
    }

    @Override // com.zepto.jg4
    public final void a(Task task) {
        i28 i28VarW;
        int iG;
        int i;
        int i2;
        int iC;
        long j;
        long j2;
        int iElapsedRealtime;
        if (this.a.f()) {
            te5 te5VarA = se5.b().a();
            if ((te5VarA == null || te5VarA.e()) && (i28VarW = this.a.w(this.c)) != null && (i28VarW.u() instanceof t40)) {
                t40 t40Var = (t40) i28VarW.u();
                int i3 = 0;
                boolean zF = this.d > 0;
                int iW = t40Var.w();
                if (te5VarA != null) {
                    zF &= te5VarA.f();
                    int iC2 = te5VarA.c();
                    int iD = te5VarA.d();
                    iG = te5VarA.g();
                    if (t40Var.G() && !t40Var.g()) {
                        pw0 pw0VarC = c(i28VarW, t40Var, this.b);
                        if (pw0VarC == null) {
                            return;
                        }
                        boolean z = pw0VarC.g() && this.d > 0;
                        iD = pw0VarC.c();
                        zF = z;
                    }
                    i2 = iC2;
                    i = iD;
                } else {
                    iG = 0;
                    i = 100;
                    i2 = 5000;
                }
                ak2 ak2Var = this.a;
                if (task.o()) {
                    iC = 0;
                } else {
                    if (task.m()) {
                        i3 = 100;
                    } else {
                        Exception excJ = task.j();
                        if (excJ instanceof eq) {
                            Status statusA = ((eq) excJ).a();
                            int iE = statusA.e();
                            lw0 lw0VarC = statusA.c();
                            iC = lw0VarC == null ? -1 : lw0VarC.c();
                            i3 = iE;
                        } else {
                            i3 = 101;
                        }
                    }
                    iC = -1;
                }
                if (zF) {
                    long j3 = this.d;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
                    j = j3;
                    j2 = jCurrentTimeMillis;
                } else {
                    j = 0;
                    j2 = 0;
                    iElapsedRealtime = -1;
                }
                ak2Var.G(new vt3(this.b, i3, iC, j, j2, null, null, iW, iElapsedRealtime), iG, i2, i);
            }
        }
    }
}
