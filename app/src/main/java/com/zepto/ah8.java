package com.zepto;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ah8 extends t58 {
    public final /* synthetic */ t40 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah8(t40 t40Var, int i, Bundle bundle) {
        super(t40Var, i, null);
        this.g = t40Var;
    }

    @Override // com.zepto.t58
    public final void f(lw0 lw0Var) {
        if (this.g.q() && t40.d0(this.g)) {
            t40.Z(this.g, 16);
        } else {
            this.g.p.b(lw0Var);
            this.g.I(lw0Var);
        }
    }

    @Override // com.zepto.t58
    public final boolean g() {
        this.g.p.b(lw0.h);
        return true;
    }
}
