package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class o43 extends ot0 implements uk1, gy2 {
    public p43 g;

    @Override // com.zepto.gy2
    public v94 a() {
        return null;
    }

    @Override // com.zepto.uk1
    public void b() {
        s().q0(this);
    }

    @Override // com.zepto.gy2
    public boolean isActive() {
        return true;
    }

    public final p43 s() {
        p43 p43Var = this.g;
        if (p43Var != null) {
            return p43Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public final void t(p43 p43Var) {
        this.g = p43Var;
    }

    @Override // com.zepto.fn3
    public String toString() {
        return me1.a(this) + '@' + me1.b(this) + "[job@" + me1.b(s()) + ']';
    }
}
