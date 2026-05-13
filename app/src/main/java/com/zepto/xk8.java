package com.zepto;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class xk8 extends zi8 implements gl8 {
    public xk8() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.zepto.zi8
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            b((Bundle) jj8.a(parcel, Bundle.CREATOR));
            return true;
        }
        if (i != 3) {
            return false;
        }
        w((Bundle) jj8.a(parcel, Bundle.CREATOR));
        return true;
    }
}
