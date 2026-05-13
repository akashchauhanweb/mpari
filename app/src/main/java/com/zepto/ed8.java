package com.zepto;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
public final class ed8 extends tk8 {
    public final xc8 a;

    public ed8(xc8 xc8Var) {
        this.a = xc8Var;
    }

    @Override // com.zepto.cl8
    public final void B(LocationAvailability locationAvailability) {
        this.a.a().c(new bd8(this, locationAvailability));
    }

    @Override // com.zepto.cl8
    public final void g() {
        this.a.a().c(new dd8(this));
    }

    @Override // com.zepto.cl8
    public final void n0(LocationResult locationResult) {
        this.a.a().c(new zc8(this, locationResult));
    }

    public final ed8 p0(yf3 yf3Var) {
        this.a.b(yf3Var);
        return this;
    }

    public final void q0() {
        this.a.a().a();
    }
}
