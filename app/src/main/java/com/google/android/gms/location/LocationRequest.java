package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.f78;
import com.zepto.if4;
import com.zepto.iu4;
import com.zepto.ke8;
import com.zepto.ki5;
import com.zepto.od8;
import com.zepto.p2;
import com.zepto.rm8;
import com.zepto.w68;
import com.zepto.wy7;
import com.zepto.zj8;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new rm8();
    public int c;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    public float j;
    public boolean k;
    public long l;
    public final int m;
    public final int n;
    public final String o;
    public final boolean p;
    public final WorkSource q;
    public final od8 r;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public static LocationRequest c() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public static String x(long j) {
        return j == LongCompanionObject.MAX_VALUE ? "∞" : ke8.a(j);
    }

    public long d() {
        return this.h;
    }

    public int e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.c == locationRequest.c && ((n() || this.e == locationRequest.e) && this.f == locationRequest.f && m() == locationRequest.m() && ((!m() || this.g == locationRequest.g) && this.h == locationRequest.h && this.i == locationRequest.i && this.j == locationRequest.j && this.k == locationRequest.k && this.m == locationRequest.m && this.n == locationRequest.n && this.p == locationRequest.p && this.q.equals(locationRequest.q) && if4.a(this.o, locationRequest.o) && if4.a(this.r, locationRequest.r)))) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.e;
    }

    public long g() {
        return this.l;
    }

    public long h() {
        return this.g;
    }

    public int hashCode() {
        return if4.b(Integer.valueOf(this.c), Long.valueOf(this.e), Long.valueOf(this.f), this.q);
    }

    public int i() {
        return this.i;
    }

    public float j() {
        return this.j;
    }

    public long k() {
        return this.f;
    }

    public int l() {
        return this.c;
    }

    public boolean m() {
        long j = this.g;
        return j > 0 && (j >> 1) >= this.e;
    }

    public boolean n() {
        return this.c == 105;
    }

    public boolean o() {
        return this.k;
    }

    public LocationRequest p(long j) {
        iu4.c(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.f = j;
        return this;
    }

    public LocationRequest q(long j) {
        iu4.b(j >= 0, "intervalMillis must be greater than or equal to 0");
        long j2 = this.f;
        long j3 = this.e;
        if (j2 == j3 / 6) {
            this.f = j / 6;
        }
        if (this.l == j3) {
            this.l = j;
        }
        this.e = j;
        return this;
    }

    public LocationRequest r(int i) {
        w68.a(i);
        this.c = i;
        return this;
    }

    public final int s() {
        return this.n;
    }

    public final WorkSource t() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (n()) {
            sb.append(w68.b(this.c));
        } else {
            sb.append("@");
            if (m()) {
                ke8.b(this.e, sb);
                sb.append("/");
                ke8.b(this.g, sb);
            } else {
                ke8.b(this.e, sb);
            }
            sb.append(" ");
            sb.append(w68.b(this.c));
        }
        if (n() || this.f != this.e) {
            sb.append(", minUpdateInterval=");
            sb.append(x(this.f));
        }
        if (this.j > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.j);
        }
        if (!n() ? this.l != this.e : this.l != LongCompanionObject.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(x(this.l));
        }
        if (this.h != LongCompanionObject.MAX_VALUE) {
            sb.append(", duration=");
            ke8.b(this.h, sb);
        }
        if (this.i != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.i);
        }
        if (this.n != 0) {
            sb.append(", ");
            sb.append(f78.a(this.n));
        }
        if (this.m != 0) {
            sb.append(", ");
            sb.append(zj8.b(this.m));
        }
        if (this.k) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.p) {
            sb.append(", bypass");
        }
        if (this.o != null) {
            sb.append(", moduleId=");
            sb.append(this.o);
        }
        if (!wy7.d(this.q)) {
            sb.append(", ");
            sb.append(this.q);
        }
        if (this.r != null) {
            sb.append(", impersonation=");
            sb.append(this.r);
        }
        sb.append(']');
        return sb.toString();
    }

    public final od8 u() {
        return this.r;
    }

    public final String v() {
        return this.o;
    }

    public final boolean w() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, l());
        ki5.m(parcel, 2, f());
        ki5.m(parcel, 3, k());
        ki5.j(parcel, 6, i());
        ki5.g(parcel, 7, j());
        ki5.m(parcel, 8, h());
        ki5.c(parcel, 9, o());
        ki5.m(parcel, 10, d());
        ki5.m(parcel, 11, g());
        ki5.j(parcel, 12, e());
        ki5.j(parcel, 13, this.n);
        ki5.o(parcel, 14, this.o, false);
        ki5.c(parcel, 15, this.p);
        ki5.n(parcel, 16, this.q, i, false);
        ki5.n(parcel, 17, this.r, i, false);
        ki5.b(parcel, iA);
    }

    public static final class a {
        public int a;
        public long b;
        public long c;
        public long d;
        public long e;
        public int f;
        public float g;
        public boolean h;
        public long i;
        public int j;
        public int k;
        public String l;
        public boolean m;
        public WorkSource n;
        public od8 o;

        public a(int i, long j) {
            iu4.b(j >= 0, "intervalMillis must be greater than or equal to 0");
            w68.a(i);
            this.a = i;
            this.b = j;
            this.c = -1L;
            this.d = 0L;
            this.e = LongCompanionObject.MAX_VALUE;
            this.f = IntCompanionObject.MAX_VALUE;
            this.g = 0.0f;
            this.h = true;
            this.i = -1L;
            this.j = 0;
            this.k = 0;
            this.l = null;
            this.m = false;
            this.n = null;
            this.o = null;
        }

        public LocationRequest a() {
            int i = this.a;
            long j = this.b;
            long jMin = this.c;
            if (jMin == -1) {
                jMin = j;
            } else if (i != 105) {
                jMin = Math.min(jMin, j);
            }
            long jMax = Math.max(this.d, this.b);
            long j2 = this.e;
            int i2 = this.f;
            float f = this.g;
            boolean z = this.h;
            long j3 = this.i;
            return new LocationRequest(i, j, jMin, jMax, LongCompanionObject.MAX_VALUE, j2, i2, f, z, j3 == -1 ? this.b : j3, this.j, this.k, this.l, this.m, new WorkSource(this.n), this.o);
        }

        public a b(int i) {
            zj8.a(i);
            this.j = i;
            return this;
        }

        public a c(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            iu4.b(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.i = j;
            return this;
        }

        public a d(boolean z) {
            this.h = z;
            return this;
        }

        public final a e(boolean z) {
            this.m = z;
            return this;
        }

        public final a f(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.l = str;
            }
            return this;
        }

        public final a g(int i) {
            int i2;
            boolean z = true;
            if (i == 0 || i == 1) {
                i2 = i;
            } else {
                i2 = 2;
                if (i == 2) {
                    i = 2;
                } else {
                    z = false;
                    i2 = i;
                }
            }
            iu4.c(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            this.k = i2;
            return this;
        }

        public final a h(WorkSource workSource) {
            this.n = workSource;
            return this;
        }

        public a(LocationRequest locationRequest) {
            this.a = locationRequest.l();
            this.b = locationRequest.f();
            this.c = locationRequest.k();
            this.d = locationRequest.h();
            this.e = locationRequest.d();
            this.f = locationRequest.i();
            this.g = locationRequest.j();
            this.h = locationRequest.o();
            this.i = locationRequest.g();
            this.j = locationRequest.e();
            this.k = locationRequest.s();
            this.l = locationRequest.v();
            this.m = locationRequest.w();
            this.n = locationRequest.t();
            this.o = locationRequest.u();
        }
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, String str, boolean z2, WorkSource workSource, od8 od8Var) {
        this.c = i;
        long j7 = j;
        this.e = j7;
        this.f = j2;
        this.g = j3;
        this.h = j4 == LongCompanionObject.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.i = i2;
        this.j = f;
        this.k = z;
        this.l = j6 != -1 ? j6 : j7;
        this.m = i3;
        this.n = i4;
        this.o = str;
        this.p = z2;
        this.q = workSource;
        this.r = od8Var;
    }
}
