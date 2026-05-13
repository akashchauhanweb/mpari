package com.zepto;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.zepto.yp;
import com.zepto.zj2;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j38 extends u28 implements zj2.a, zj2.b {
    public static final yp.a h = n38.c;
    public final Context a;
    public final Handler b;
    public final yp.a c;
    public final Set d;
    public final tq0 e;
    public r38 f;
    public i38 g;

    public j38(Context context, Handler handler, tq0 tq0Var) {
        yp.a aVar = h;
        this.a = context;
        this.b = handler;
        this.e = (tq0) iu4.j(tq0Var, "ClientSettings must not be null");
        this.d = tq0Var.e();
        this.c = aVar;
    }

    public static /* bridge */ /* synthetic */ void r0(j38 j38Var, l48 l48Var) {
        lw0 lw0VarC = l48Var.c();
        if (lw0VarC.g()) {
            d58 d58Var = (d58) iu4.i(l48Var.d());
            lw0 lw0VarC2 = d58Var.c();
            if (!lw0VarC2.g()) {
                String strValueOf = String.valueOf(lw0VarC2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                j38Var.g.c(lw0VarC2);
                j38Var.f.disconnect();
                return;
            }
            j38Var.g.a(d58Var.d(), j38Var.d);
        } else {
            j38Var.g.c(lw0VarC);
        }
        j38Var.f.disconnect();
    }

    @Override // com.zepto.s38
    public final void W(l48 l48Var) {
        this.b.post(new h38(this, l48Var));
    }

    @Override // com.zepto.lg4
    public final void c(lw0 lw0Var) {
        this.g.c(lw0Var);
    }

    @Override // com.zepto.jw0
    public final void d(int i) {
        this.f.disconnect();
    }

    @Override // com.zepto.jw0
    public final void j(Bundle bundle) {
        this.f.m(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.zepto.r38, com.zepto.yp$f] */
    public final void s0(i38 i38Var) {
        r38 r38Var = this.f;
        if (r38Var != null) {
            r38Var.disconnect();
        }
        this.e.i(Integer.valueOf(System.identityHashCode(this)));
        yp.a aVar = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        tq0 tq0Var = this.e;
        this.f = aVar.b(context, looper, tq0Var, tq0Var.f(), this, this);
        this.g = i38Var;
        Set set = this.d;
        if (set == null || set.isEmpty()) {
            this.b.post(new g38(this));
        } else {
            this.f.l();
        }
    }

    public final void t0() {
        r38 r38Var = this.f;
        if (r38Var != null) {
            r38Var.disconnect();
        }
    }
}
