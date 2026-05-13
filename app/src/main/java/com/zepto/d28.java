package com.zepto;

import com.zepto.w30;

/* JADX INFO: loaded from: classes.dex */
public final class d28 implements w30.a {
    public final /* synthetic */ ak2 a;

    public d28(ak2 ak2Var) {
        this.a = ak2Var;
    }

    @Override // com.zepto.w30.a
    public final void a(boolean z) {
        ak2 ak2Var = this.a;
        ak2Var.p.sendMessage(ak2Var.p.obtainMessage(1, Boolean.valueOf(z)));
    }
}
