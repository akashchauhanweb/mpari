package com.zepto;

import android.location.Location;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class hc8 extends ik8 {
    public final /* synthetic */ rc6 a;

    public hc8(ud8 ud8Var, rc6 rc6Var) {
        this.a = rc6Var;
    }

    @Override // com.zepto.sk8
    public final void x(Status status, Location location) {
        ed6.b(status, location, this.a);
    }
}
