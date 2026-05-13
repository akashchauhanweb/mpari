package com.zepto;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b88 extends p78 {
    public final int c;
    public final String d;
    public final int e;
    public final /* synthetic */ i88 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b88(i88 i88Var, rh8 rh8Var, int i, String str, int i2) {
        super(i88Var, rh8Var);
        this.f = i88Var;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // com.zepto.p78, com.zepto.pm8
    public final void c0(Bundle bundle) {
        this.f.d.s(this.a);
        i88.g.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i = this.e;
        if (i > 0) {
            this.f.k(this.c, this.d, i - 1);
        }
    }
}
