package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class hn8 extends pi8 {
    public hn8(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void b(Bundle bundle) {
        Parcel parcelC = c();
        jj8.b(parcelC, bundle);
        d(4, parcelC);
    }

    public final void c0(Bundle bundle) {
        Parcel parcelC = c();
        jj8.b(parcelC, bundle);
        d(3, parcelC);
    }

    public final void l(Bundle bundle, Bundle bundle2) {
        Parcel parcelC = c();
        jj8.b(parcelC, bundle);
        jj8.b(parcelC, bundle2);
        d(2, parcelC);
    }
}
