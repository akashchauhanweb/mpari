package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nf8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        List listO = af8.O();
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        od8 od8Var = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 2:
                    iQ2 = ji5.q(parcel, iO);
                    break;
                case 3:
                    strD = ji5.d(parcel, iO);
                    break;
                case 4:
                    strD2 = ji5.d(parcel, iO);
                    break;
                case 5:
                    iQ3 = ji5.q(parcel, iO);
                    break;
                case 6:
                    strD3 = ji5.d(parcel, iO);
                    break;
                case 7:
                    od8Var = (od8) ji5.c(parcel, iO, od8.CREATOR);
                    break;
                case 8:
                    listO = ji5.g(parcel, iO, w82.CREATOR);
                    break;
                default:
                    ji5.u(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new od8(iQ, iQ2, strD, strD2, strD3, iQ3, listO, od8Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new od8[i];
    }
}
