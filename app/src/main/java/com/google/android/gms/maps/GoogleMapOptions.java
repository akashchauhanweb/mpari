package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.zepto.h58;
import com.zepto.if4;
import com.zepto.ki5;
import com.zepto.l15;
import com.zepto.m68;
import com.zepto.p2;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleMapOptions extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new m68();
    public static final Integer w = Integer.valueOf(Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 236, 233, 225));
    public Boolean c;
    public Boolean e;
    public int f;
    public CameraPosition g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Boolean o;
    public Boolean p;
    public Float q;
    public Float r;
    public LatLngBounds s;
    public Boolean t;
    public Integer u;
    public String v;

    public GoogleMapOptions() {
        this.f = -1;
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = null;
        this.v = null;
    }

    public static CameraPosition D(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, l15.a);
        int i = l15.g;
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(i) ? typedArrayObtainAttributes.getFloat(i, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(l15.h) ? typedArrayObtainAttributes.getFloat(r0, 0.0f) : 0.0f);
        CameraPosition.a aVarC = CameraPosition.c();
        aVarC.c(latLng);
        int i2 = l15.j;
        if (typedArrayObtainAttributes.hasValue(i2)) {
            aVarC.e(typedArrayObtainAttributes.getFloat(i2, 0.0f));
        }
        int i3 = l15.d;
        if (typedArrayObtainAttributes.hasValue(i3)) {
            aVarC.a(typedArrayObtainAttributes.getFloat(i3, 0.0f));
        }
        int i4 = l15.i;
        if (typedArrayObtainAttributes.hasValue(i4)) {
            aVarC.d(typedArrayObtainAttributes.getFloat(i4, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return aVarC.b();
    }

    public static LatLngBounds E(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, l15.a);
        int i = l15.m;
        Float fValueOf = typedArrayObtainAttributes.hasValue(i) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i, 0.0f)) : null;
        int i2 = l15.n;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(i2) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i2, 0.0f)) : null;
        int i3 = l15.k;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(i3) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i3, 0.0f)) : null;
        int i4 = l15.l;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(i4) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i4, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public static GoogleMapOptions g(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, l15.a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = l15.q;
        if (typedArrayObtainAttributes.hasValue(i)) {
            googleMapOptions.s(typedArrayObtainAttributes.getInt(i, -1));
        }
        int i2 = l15.A;
        if (typedArrayObtainAttributes.hasValue(i2)) {
            googleMapOptions.A(typedArrayObtainAttributes.getBoolean(i2, false));
        }
        int i3 = l15.z;
        if (typedArrayObtainAttributes.hasValue(i3)) {
            googleMapOptions.z(typedArrayObtainAttributes.getBoolean(i3, false));
        }
        int i4 = l15.r;
        if (typedArrayObtainAttributes.hasValue(i4)) {
            googleMapOptions.f(typedArrayObtainAttributes.getBoolean(i4, true));
        }
        int i5 = l15.t;
        if (typedArrayObtainAttributes.hasValue(i5)) {
            googleMapOptions.v(typedArrayObtainAttributes.getBoolean(i5, true));
        }
        int i6 = l15.v;
        if (typedArrayObtainAttributes.hasValue(i6)) {
            googleMapOptions.x(typedArrayObtainAttributes.getBoolean(i6, true));
        }
        int i7 = l15.u;
        if (typedArrayObtainAttributes.hasValue(i7)) {
            googleMapOptions.w(typedArrayObtainAttributes.getBoolean(i7, true));
        }
        int i8 = l15.w;
        if (typedArrayObtainAttributes.hasValue(i8)) {
            googleMapOptions.y(typedArrayObtainAttributes.getBoolean(i8, true));
        }
        int i9 = l15.y;
        if (typedArrayObtainAttributes.hasValue(i9)) {
            googleMapOptions.C(typedArrayObtainAttributes.getBoolean(i9, true));
        }
        int i10 = l15.x;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            googleMapOptions.B(typedArrayObtainAttributes.getBoolean(i10, true));
        }
        int i11 = l15.o;
        if (typedArrayObtainAttributes.hasValue(i11)) {
            googleMapOptions.p(typedArrayObtainAttributes.getBoolean(i11, false));
        }
        int i12 = l15.s;
        if (typedArrayObtainAttributes.hasValue(i12)) {
            googleMapOptions.r(typedArrayObtainAttributes.getBoolean(i12, true));
        }
        int i13 = l15.b;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            googleMapOptions.c(typedArrayObtainAttributes.getBoolean(i13, false));
        }
        int i14 = l15.f;
        if (typedArrayObtainAttributes.hasValue(i14)) {
            googleMapOptions.u(typedArrayObtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(i14)) {
            googleMapOptions.t(typedArrayObtainAttributes.getFloat(l15.e, Float.POSITIVE_INFINITY));
        }
        int i15 = l15.c;
        if (typedArrayObtainAttributes.hasValue(i15)) {
            googleMapOptions.d(Integer.valueOf(typedArrayObtainAttributes.getColor(i15, w.intValue())));
        }
        int i16 = l15.p;
        if (typedArrayObtainAttributes.hasValue(i16) && (string = typedArrayObtainAttributes.getString(i16)) != null && !string.isEmpty()) {
            googleMapOptions.q(string);
        }
        googleMapOptions.o(E(context, attributeSet));
        googleMapOptions.e(D(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions A(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions B(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions C(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions c(boolean z) {
        this.p = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions d(Integer num) {
        this.u = num;
        return this;
    }

    public GoogleMapOptions e(CameraPosition cameraPosition) {
        this.g = cameraPosition;
        return this;
    }

    public GoogleMapOptions f(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public Integer h() {
        return this.u;
    }

    public CameraPosition i() {
        return this.g;
    }

    public LatLngBounds j() {
        return this.s;
    }

    public String k() {
        return this.v;
    }

    public int l() {
        return this.f;
    }

    public Float m() {
        return this.r;
    }

    public Float n() {
        return this.q;
    }

    public GoogleMapOptions o(LatLngBounds latLngBounds) {
        this.s = latLngBounds;
        return this;
    }

    public GoogleMapOptions p(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions q(String str) {
        this.v = str;
        return this;
    }

    public GoogleMapOptions r(boolean z) {
        this.o = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions s(int i) {
        this.f = i;
        return this;
    }

    public GoogleMapOptions t(float f) {
        this.r = Float.valueOf(f);
        return this;
    }

    public String toString() {
        return if4.c(this).a("MapType", Integer.valueOf(this.f)).a("LiteMode", this.n).a("Camera", this.g).a("CompassEnabled", this.i).a("ZoomControlsEnabled", this.h).a("ScrollGesturesEnabled", this.j).a("ZoomGesturesEnabled", this.k).a("TiltGesturesEnabled", this.l).a("RotateGesturesEnabled", this.m).a("ScrollGesturesEnabledDuringRotateOrZoom", this.t).a("MapToolbarEnabled", this.o).a("AmbientEnabled", this.p).a("MinZoomPreference", this.q).a("MaxZoomPreference", this.r).a("BackgroundColor", this.u).a("LatLngBoundsForCameraTarget", this.s).a("ZOrderOnTop", this.c).a("UseViewLifecycleInFragment", this.e).toString();
    }

    public GoogleMapOptions u(float f) {
        this.q = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions v(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions w(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.e(parcel, 2, h58.a(this.c));
        ki5.e(parcel, 3, h58.a(this.e));
        ki5.j(parcel, 4, l());
        ki5.n(parcel, 5, i(), i, false);
        ki5.e(parcel, 6, h58.a(this.h));
        ki5.e(parcel, 7, h58.a(this.i));
        ki5.e(parcel, 8, h58.a(this.j));
        ki5.e(parcel, 9, h58.a(this.k));
        ki5.e(parcel, 10, h58.a(this.l));
        ki5.e(parcel, 11, h58.a(this.m));
        ki5.e(parcel, 12, h58.a(this.n));
        ki5.e(parcel, 14, h58.a(this.o));
        ki5.e(parcel, 15, h58.a(this.p));
        ki5.h(parcel, 16, n(), false);
        ki5.h(parcel, 17, m(), false);
        ki5.n(parcel, 18, j(), i, false);
        ki5.e(parcel, 19, h58.a(this.t));
        ki5.l(parcel, 20, h(), false);
        ki5.o(parcel, 21, k(), false);
        ki5.b(parcel, iA);
    }

    public GoogleMapOptions x(boolean z) {
        this.t = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions y(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions z(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.f = -1;
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = null;
        this.v = null;
        this.c = h58.b(b);
        this.e = h58.b(b2);
        this.f = i;
        this.g = cameraPosition;
        this.h = h58.b(b3);
        this.i = h58.b(b4);
        this.j = h58.b(b5);
        this.k = h58.b(b6);
        this.l = h58.b(b7);
        this.m = h58.b(b8);
        this.n = h58.b(b9);
        this.o = h58.b(b10);
        this.p = h58.b(b11);
        this.q = f;
        this.r = f2;
        this.s = latLngBounds;
        this.t = h58.b(b12);
        this.u = num;
        this.v = str;
    }
}
