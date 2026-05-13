package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.fi8;
import com.zepto.ki5;
import com.zepto.p2;

/* JADX INFO: loaded from: classes.dex */
public final class LatLng extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new fi8();
    public final double c;
    public final double e;

    public LatLng(double d, double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.e = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.e = d2;
        }
        this.c = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.c) == Double.doubleToLongBits(latLng.c) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(latLng.e);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((int) j) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.c + "," + this.e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        double d = this.c;
        int iA = ki5.a(parcel);
        ki5.f(parcel, 2, d);
        ki5.f(parcel, 3, this.e);
        ki5.b(parcel, iA);
    }
}
