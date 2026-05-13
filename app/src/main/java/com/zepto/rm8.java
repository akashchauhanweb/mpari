package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class rm8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        WorkSource workSource = new WorkSource();
        int iQ = 102;
        long jS = 3600000;
        long jS2 = 600000;
        long jS3 = 0;
        long jS4 = Long.MAX_VALUE;
        long jS5 = Long.MAX_VALUE;
        int iQ2 = Integer.MAX_VALUE;
        float fM = 0.0f;
        boolean zJ = false;
        int iQ3 = 0;
        int iQ4 = 0;
        boolean zJ2 = false;
        long jS6 = -1;
        String strD = null;
        od8 od8Var = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 2:
                    jS = ji5.s(parcel, iO);
                    break;
                case 3:
                    jS2 = ji5.s(parcel, iO);
                    break;
                case 4:
                default:
                    ji5.u(parcel, iO);
                    break;
                case 5:
                    jS4 = ji5.s(parcel, iO);
                    break;
                case 6:
                    iQ2 = ji5.q(parcel, iO);
                    break;
                case 7:
                    fM = ji5.m(parcel, iO);
                    break;
                case 8:
                    jS3 = ji5.s(parcel, iO);
                    break;
                case 9:
                    zJ = ji5.j(parcel, iO);
                    break;
                case 10:
                    jS5 = ji5.s(parcel, iO);
                    break;
                case 11:
                    jS6 = ji5.s(parcel, iO);
                    break;
                case 12:
                    iQ3 = ji5.q(parcel, iO);
                    break;
                case 13:
                    iQ4 = ji5.q(parcel, iO);
                    break;
                case 14:
                    strD = ji5.d(parcel, iO);
                    break;
                case 15:
                    zJ2 = ji5.j(parcel, iO);
                    break;
                case 16:
                    workSource = (WorkSource) ji5.c(parcel, iO, WorkSource.CREATOR);
                    break;
                case 17:
                    od8Var = (od8) ji5.c(parcel, iO, od8.CREATOR);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new LocationRequest(iQ, jS, jS2, jS3, jS4, jS5, iQ2, fM, zJ, jS6, iQ3, iQ4, strD, zJ2, workSource, od8Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
