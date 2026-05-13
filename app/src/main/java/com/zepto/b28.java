package com.zepto;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b28 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        Uri uri = null;
        String strD5 = null;
        String strD6 = null;
        ArrayList arrayListG = null;
        String strD7 = null;
        String strD8 = null;
        long jS = 0;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 2:
                    strD = ji5.d(parcel, iO);
                    break;
                case 3:
                    strD2 = ji5.d(parcel, iO);
                    break;
                case 4:
                    strD3 = ji5.d(parcel, iO);
                    break;
                case 5:
                    strD4 = ji5.d(parcel, iO);
                    break;
                case 6:
                    uri = (Uri) ji5.c(parcel, iO, Uri.CREATOR);
                    break;
                case 7:
                    strD5 = ji5.d(parcel, iO);
                    break;
                case 8:
                    jS = ji5.s(parcel, iO);
                    break;
                case 9:
                    strD6 = ji5.d(parcel, iO);
                    break;
                case 10:
                    arrayListG = ji5.g(parcel, iO, Scope.CREATOR);
                    break;
                case 11:
                    strD7 = ji5.d(parcel, iO);
                    break;
                case 12:
                    strD8 = ji5.d(parcel, iO);
                    break;
                default:
                    ji5.u(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new GoogleSignInAccount(iQ, strD, strD2, strD3, strD4, uri, strD5, jS, strD6, arrayListG, strD7, strD8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
