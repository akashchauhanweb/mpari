package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ae8 extends p2 {
    public static final Parcelable.Creator<ae8> CREATOR = new ce8();
    public LocationRequest c;

    public ae8(LocationRequest locationRequest, List list, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, long j) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pq0 pq0Var = (pq0) it.next();
                    wy7.a(workSource, pq0Var.c, pq0Var.e);
                }
            }
            aVar.h(workSource);
        }
        if (z) {
            aVar.b(1);
        }
        if (z2) {
            aVar.g(2);
        }
        if (str != null) {
            aVar.f(str);
        } else if (str2 != null) {
            aVar.f(str2);
        }
        if (z3) {
            aVar.e(true);
        }
        if (z4) {
            aVar.d(true);
        }
        if (j != LongCompanionObject.MAX_VALUE) {
            aVar.c(j);
        }
        this.c = aVar.a();
    }

    public static ae8 c(String str, LocationRequest locationRequest) {
        return new ae8(locationRequest, null, false, false, null, false, false, null, LongCompanionObject.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ae8) {
            return if4.a(this.c, ((ae8) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.n(parcel, 1, this.c, i, false);
        ki5.b(parcel, iA);
    }
}
