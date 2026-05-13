package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.if4;
import com.zepto.ki5;
import com.zepto.p2;
import com.zepto.xm8;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends p2 implements ReflectedParcelable {
    public final List c;
    public static final List e = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new xm8();

    public LocationResult(List list) {
        this.c = list;
    }

    public List c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.c.equals(locationResult.c);
        }
        if (this.c.size() != locationResult.c.size()) {
            return false;
        }
        Iterator it = locationResult.c.iterator();
        for (Location location : this.c) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !if4.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return if4.b(this.c);
    }

    public String toString() {
        return "LocationResult".concat(String.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.r(parcel, 1, c(), false);
        ki5.b(parcel, iA);
    }
}
