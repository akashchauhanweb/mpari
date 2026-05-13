package com.zepto;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class x78 extends p78 {
    public final /* synthetic */ i88 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x78(i88 i88Var, rh8 rh8Var) {
        super(i88Var, rh8Var);
        this.c = i88Var;
    }

    @Override // com.zepto.p78, com.zepto.pm8
    public final void Y(Bundle bundle, Bundle bundle2) {
        super.Y(bundle, bundle2);
        if (!this.c.f.compareAndSet(true, false)) {
            i88.g.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.g();
        }
    }

    @Override // com.zepto.p78, com.zepto.pm8
    public final void c0(Bundle bundle) {
        this.c.e.s(this.a);
        int i = bundle.getInt("error_code");
        i88.g.b("onError(%d)", Integer.valueOf(i));
        this.a.d(new ay(i));
    }
}
