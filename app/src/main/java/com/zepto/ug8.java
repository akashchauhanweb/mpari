package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ug8 implements bv {
    public final vk8 a;
    public final t88 b;
    public final Context c;
    public final Handler d = new Handler(Looper.getMainLooper());

    public ug8(vk8 vk8Var, t88 t88Var, Context context) {
        this.a = vk8Var;
        this.b = t88Var;
        this.c = context;
    }

    @Override // com.zepto.bv
    public final boolean a(av avVar, int i, Activity activity, int i2) {
        dv dvVarC = dv.c(i);
        if (activity == null) {
            return false;
        }
        return f(avVar, new rf8(this, activity), dvVarC, i2);
    }

    @Override // com.zepto.bv
    public final pc6 b() {
        return this.a.f(this.c.getPackageName());
    }

    @Override // com.zepto.bv
    public final synchronized void c(yz2 yz2Var) {
        this.b.e(yz2Var);
    }

    @Override // com.zepto.bv
    public final pc6 d() {
        return this.a.g(this.c.getPackageName());
    }

    @Override // com.zepto.bv
    public final synchronized void e(yz2 yz2Var) {
        this.b.c(yz2Var);
    }

    public final boolean f(av avVar, s03 s03Var, dv dvVar, int i) {
        if (avVar == null || s03Var == null || dvVar == null || !avVar.e(dvVar) || avVar.j()) {
            return false;
        }
        avVar.i();
        s03Var.a(avVar.g(dvVar).getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }
}
