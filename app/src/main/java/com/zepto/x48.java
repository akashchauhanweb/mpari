package com.zepto;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class x48 extends sj2 {
    public final vd6 I;

    public x48(Context context, Looper looper, tq0 tq0Var, vd6 vd6Var, jw0 jw0Var, lg4 lg4Var) {
        super(context, looper, 270, tq0Var, jw0Var, lg4Var);
        this.I = vd6Var;
    }

    @Override // com.zepto.t40
    public final String B() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.zepto.t40
    public final String C() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.zepto.t40
    public final boolean F() {
        return true;
    }

    @Override // com.zepto.t40, com.zepto.yp.f
    public final int f() {
        return 203400000;
    }

    @Override // com.zepto.t40
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof h48 ? (h48) iInterfaceQueryLocalInterface : new h48(iBinder);
    }

    @Override // com.zepto.t40
    public final w82[] s() {
        return v38.b;
    }

    @Override // com.zepto.t40
    public final Bundle x() {
        return this.I.b();
    }
}
