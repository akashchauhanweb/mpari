package com.zepto;

import com.google.android.gms.common.api.Status;
import com.zepto.xw2;

/* JADX INFO: loaded from: classes.dex */
public final class ec8 extends xw2.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ rc6 b;

    public ec8(ud8 ud8Var, Object obj, rc6 rc6Var) {
        this.a = obj;
        this.b = rc6Var;
    }

    @Override // com.zepto.xw2
    public final void P(Status status) {
        ed6.b(status, this.a, this.b);
    }
}
