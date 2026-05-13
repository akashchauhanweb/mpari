package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class o78 extends d78 {
    public final /* synthetic */ d88 e;

    public o78(d88 d88Var) {
        this.e = d88Var;
    }

    @Override // com.zepto.d78
    public final void a() {
        d88 d88Var = this.e;
        if (d88Var.n != null) {
            d88Var.b.d("Unbind from service.", new Object[0]);
            d88 d88Var2 = this.e;
            d88Var2.a.unbindService(d88Var2.m);
            this.e.g = false;
            this.e.n = null;
            this.e.m = null;
        }
        this.e.u();
    }
}
