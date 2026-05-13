package com.zepto;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.zepto.yp;
import com.zepto.zj2;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class sj2 extends t40 implements yp.f {
    public final tq0 F;
    public final Set G;
    public final Account H;

    public sj2(Context context, Looper looper, int i, tq0 tq0Var, zj2.a aVar, zj2.b bVar) {
        this(context, looper, i, tq0Var, (jw0) aVar, (lg4) bVar);
    }

    @Override // com.zepto.yp.f
    public Set b() {
        return k() ? this.G : Collections.emptySet();
    }

    public Set f0(Set set) {
        return set;
    }

    public final Set g0(Set set) {
        Set setF0 = f0(set);
        Iterator it = setF0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setF0;
    }

    @Override // com.zepto.t40
    public final Account r() {
        return this.H;
    }

    @Override // com.zepto.t40
    public final Executor t() {
        return null;
    }

    @Override // com.zepto.t40
    public final Set z() {
        return this.G;
    }

    public sj2(Context context, Looper looper, int i, tq0 tq0Var, jw0 jw0Var, lg4 lg4Var) {
        this(context, looper, tj2.b(context), xj2.l(), i, tq0Var, (jw0) iu4.i(jw0Var), (lg4) iu4.i(lg4Var));
    }

    public sj2(Context context, Looper looper, tj2 tj2Var, xj2 xj2Var, int i, tq0 tq0Var, jw0 jw0Var, lg4 lg4Var) {
        super(context, looper, tj2Var, xj2Var, i, jw0Var == null ? null : new c48(jw0Var), lg4Var == null ? null : new g48(lg4Var), tq0Var.h());
        this.F = tq0Var;
        this.H = tq0Var.a();
        this.G = g0(tq0Var.c());
    }
}
