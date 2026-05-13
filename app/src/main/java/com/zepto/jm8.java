package com.zepto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class jm8 extends zi8 implements pm8 {
    public jm8() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.zepto.zi8
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                f0(parcel.readInt(), (Bundle) jj8.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                f(parcel.readInt(), (Bundle) jj8.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                i0(parcel.readInt(), (Bundle) jj8.a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                n(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                o0((Bundle) jj8.a(parcel, creator), (Bundle) jj8.a(parcel, creator));
                return true;
            case 7:
                c0((Bundle) jj8.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                u((Bundle) jj8.a(parcel, creator2), (Bundle) jj8.a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                F((Bundle) jj8.a(parcel, creator3), (Bundle) jj8.a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Y((Bundle) jj8.a(parcel, creator4), (Bundle) jj8.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                l((Bundle) jj8.a(parcel, creator5), (Bundle) jj8.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                j0((Bundle) jj8.a(parcel, creator6), (Bundle) jj8.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                V((Bundle) jj8.a(parcel, creator7), (Bundle) jj8.a(parcel, creator7));
                return true;
            case 15:
                b((Bundle) jj8.a(parcel, Bundle.CREATOR));
                return true;
        }
    }
}
