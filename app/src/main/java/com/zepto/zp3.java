package com.zepto;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.zepto.vw2;

/* JADX INFO: loaded from: classes.dex */
public class zp3 extends p2 {
    public static final Parcelable.Creator<zp3> CREATOR = new vi8();
    public LatLng c;
    public String e;
    public String f;
    public r60 g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public View s;
    public int t;
    public String u;
    public float v;

    public zp3() {
        this.h = 0.5f;
        this.i = 1.0f;
        this.k = true;
        this.l = false;
        this.m = 0.0f;
        this.n = 0.5f;
        this.o = 0.0f;
        this.p = 1.0f;
        this.r = 0;
    }

    public float c() {
        return this.p;
    }

    public float d() {
        return this.h;
    }

    public float e() {
        return this.i;
    }

    public float f() {
        return this.n;
    }

    public float g() {
        return this.o;
    }

    public LatLng h() {
        return this.c;
    }

    public float i() {
        return this.m;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.e;
    }

    public float l() {
        return this.q;
    }

    public boolean m() {
        return this.j;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.k;
    }

    public zp3 p(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.c = latLng;
        return this;
    }

    public zp3 q(String str) {
        this.e = str;
        return this;
    }

    public final int r() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.n(parcel, 2, h(), i, false);
        ki5.o(parcel, 3, k(), false);
        ki5.o(parcel, 4, j(), false);
        r60 r60Var = this.g;
        ki5.i(parcel, 5, r60Var == null ? null : r60Var.a().asBinder(), false);
        ki5.g(parcel, 6, d());
        ki5.g(parcel, 7, e());
        ki5.c(parcel, 8, m());
        ki5.c(parcel, 9, o());
        ki5.c(parcel, 10, n());
        ki5.g(parcel, 11, i());
        ki5.g(parcel, 12, f());
        ki5.g(parcel, 13, g());
        ki5.g(parcel, 14, c());
        ki5.g(parcel, 15, l());
        ki5.j(parcel, 17, this.r);
        ki5.i(parcel, 18, hf4.p0(this.s).asBinder(), false);
        ki5.j(parcel, 19, this.t);
        ki5.o(parcel, 20, this.u, false);
        ki5.g(parcel, 21, this.v);
        ki5.b(parcel, iA);
    }

    public zp3(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3, float f8) {
        this.h = 0.5f;
        this.i = 1.0f;
        this.k = true;
        this.l = false;
        this.m = 0.0f;
        this.n = 0.5f;
        this.o = 0.0f;
        this.p = 1.0f;
        this.r = 0;
        this.c = latLng;
        this.e = str;
        this.f = str2;
        if (iBinder == null) {
            this.g = null;
        } else {
            this.g = new r60(vw2.a.d(iBinder));
        }
        this.h = f;
        this.i = f2;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = f3;
        this.n = f4;
        this.o = f5;
        this.p = f6;
        this.q = f7;
        this.t = i2;
        this.r = i;
        vw2 vw2VarD = vw2.a.d(iBinder2);
        this.s = vw2VarD != null ? (View) hf4.j(vw2VarD) : null;
        this.u = str3;
        this.v = f8;
    }
}
