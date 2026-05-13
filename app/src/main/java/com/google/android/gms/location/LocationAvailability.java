package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.if4;
import com.zepto.ki5;
import com.zepto.l68;
import com.zepto.lm8;
import com.zepto.p2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends p2 implements ReflectedParcelable {
    public final int c;
    public final int e;
    public final long f;
    public int g;
    public final l68[] h;
    public static final LocationAvailability i = new LocationAvailability(0, 1, 1, 0, null, true);
    public static final LocationAvailability j = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new lm8();

    public LocationAvailability(int i2, int i3, int i4, long j2, l68[] l68VarArr, boolean z) {
        this.g = i2 < 1000 ? 0 : 1000;
        this.c = i3;
        this.e = i4;
        this.f = j2;
        this.h = l68VarArr;
    }

    public boolean c() {
        return this.g < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.c == locationAvailability.c && this.e == locationAvailability.e && this.f == locationAvailability.f && this.g == locationAvailability.g && Arrays.equals(this.h, locationAvailability.h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return if4.b(Integer.valueOf(this.g));
    }

    public String toString() {
        return "LocationAvailability[" + c() + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.j(parcel, 2, this.e);
        ki5.m(parcel, 3, this.f);
        ki5.j(parcel, 4, this.g);
        ki5.q(parcel, 5, this.h, i2, false);
        ki5.c(parcel, 6, c());
        ki5.b(parcel, iA);
    }
}
