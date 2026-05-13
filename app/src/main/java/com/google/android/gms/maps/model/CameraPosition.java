package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.i58;
import com.zepto.if4;
import com.zepto.iu4;
import com.zepto.ki5;
import com.zepto.p2;

/* JADX INFO: loaded from: classes.dex */
public final class CameraPosition extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new i58();
    public final LatLng c;
    public final float e;
    public final float f;
    public final float g;

    public static final class a {
        public LatLng a;
        public float b;
        public float c;
        public float d;

        public a a(float f) {
            this.d = f;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.a, this.b, this.c, this.d);
        }

        public a c(LatLng latLng) {
            this.a = (LatLng) iu4.j(latLng, "location must not be null.");
            return this;
        }

        public a d(float f) {
            this.c = f;
            return this;
        }

        public a e(float f) {
            this.b = f;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        iu4.j(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        iu4.c(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.c = latLng;
        this.e = f;
        this.f = f2 + 0.0f;
        this.g = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public static a c() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.c.equals(cameraPosition.c) && Float.floatToIntBits(this.e) == Float.floatToIntBits(cameraPosition.e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(cameraPosition.f) && Float.floatToIntBits(this.g) == Float.floatToIntBits(cameraPosition.g);
    }

    public int hashCode() {
        return if4.b(this.c, Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g));
    }

    public String toString() {
        return if4.c(this).a("target", this.c).a("zoom", Float.valueOf(this.e)).a("tilt", Float.valueOf(this.f)).a("bearing", Float.valueOf(this.g)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        LatLng latLng = this.c;
        int iA = ki5.a(parcel);
        ki5.n(parcel, 2, latLng, i, false);
        ki5.g(parcel, 3, this.e);
        ki5.g(parcel, 4, this.f);
        ki5.g(parcel, 5, this.g);
        ki5.b(parcel, iA);
    }
}
