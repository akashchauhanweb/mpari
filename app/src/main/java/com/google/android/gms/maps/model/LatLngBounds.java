package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.if4;
import com.zepto.iu4;
import com.zepto.ki5;
import com.zepto.p2;
import com.zepto.xh8;

/* JADX INFO: loaded from: classes.dex */
public final class LatLngBounds extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new xh8();
    public final LatLng c;
    public final LatLng e;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        iu4.j(latLng, "southwest must not be null.");
        iu4.j(latLng2, "northeast must not be null.");
        double d = latLng2.c;
        double d2 = latLng.c;
        iu4.c(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.c));
        this.c = latLng;
        this.e = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.c.equals(latLngBounds.c) && this.e.equals(latLngBounds.e);
    }

    public int hashCode() {
        return if4.b(this.c, this.e);
    }

    public String toString() {
        return if4.c(this).a("southwest", this.c).a("northeast", this.e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        LatLng latLng = this.c;
        int iA = ki5.a(parcel);
        ki5.n(parcel, 2, latLng, i, false);
        ki5.n(parcel, 3, this.e, i, false);
        ki5.b(parcel, iA);
    }
}
