package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nl8 extends pi8 implements dm8 {
    public nl8(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // com.zepto.dm8
    public final void D(String str, Bundle bundle, pm8 pm8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        jj8.b(parcelC, bundle);
        jj8.c(parcelC, pm8Var);
        d(5, parcelC);
    }

    @Override // com.zepto.dm8
    public final void J(String str, List list, Bundle bundle, pm8 pm8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeTypedList(list);
        jj8.b(parcelC, bundle);
        jj8.c(parcelC, pm8Var);
        d(14, parcelC);
    }

    @Override // com.zepto.dm8
    public final void R(String str, Bundle bundle, pm8 pm8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        jj8.b(parcelC, bundle);
        jj8.c(parcelC, pm8Var);
        d(10, parcelC);
    }

    @Override // com.zepto.dm8
    public final void Z(String str, Bundle bundle, Bundle bundle2, pm8 pm8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        jj8.b(parcelC, bundle);
        jj8.b(parcelC, bundle2);
        jj8.c(parcelC, pm8Var);
        d(9, parcelC);
    }

    @Override // com.zepto.dm8
    public final void e0(String str, Bundle bundle, Bundle bundle2, pm8 pm8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        jj8.b(parcelC, bundle);
        jj8.b(parcelC, bundle2);
        jj8.c(parcelC, pm8Var);
        d(11, parcelC);
    }

    @Override // com.zepto.dm8
    public final void l0(String str, Bundle bundle, Bundle bundle2, pm8 pm8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        jj8.b(parcelC, bundle);
        jj8.b(parcelC, bundle2);
        jj8.c(parcelC, pm8Var);
        d(7, parcelC);
    }

    @Override // com.zepto.dm8
    public final void q(String str, Bundle bundle, Bundle bundle2, pm8 pm8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        jj8.b(parcelC, bundle);
        jj8.b(parcelC, bundle2);
        jj8.c(parcelC, pm8Var);
        d(6, parcelC);
    }
}
