package com.zepto;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lx0 {
    public static final b i = new b(null);
    public static final lx0 j = new lx0(null, false, false, false, 15, null);
    public final s44 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    public static final class a {
        public boolean a;
        public boolean b;
        public boolean d;
        public boolean e;
        public s44 c = s44.NOT_REQUIRED;
        public long f = -1;
        public long g = -1;
        public Set h = new LinkedHashSet();

        public final lx0 a() {
            Set set = CollectionsKt___CollectionsKt.toSet(this.h);
            long j = this.f;
            long j2 = this.g;
            return new lx0(this.c, this.a, this.b, this.d, this.e, j, j2, set);
        }

        public final a b(s44 networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.c = networkType;
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c {
        public final Uri a;
        public final boolean b;

        public c(Uri uri, boolean z) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.a = uri;
            this.b = z;
        }

        public final Uri a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
        }
    }

    public /* synthetic */ lx0(s44 s44Var, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? s44.NOT_REQUIRED : s44Var, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3);
    }

    public final long a() {
        return this.g;
    }

    public final long b() {
        return this.f;
    }

    public final Set c() {
        return this.h;
    }

    public final s44 d() {
        return this.a;
    }

    public final boolean e() {
        return !this.h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(lx0.class, obj.getClass())) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        if (this.b == lx0Var.b && this.c == lx0Var.c && this.d == lx0Var.d && this.e == lx0Var.e && this.f == lx0Var.f && this.g == lx0Var.g && this.a == lx0Var.a) {
            return Intrinsics.areEqual(this.h, lx0Var.h);
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.b;
    }

    public final boolean h() {
        return this.c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j2 = this.f;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.h.hashCode();
    }

    public final boolean i() {
        return this.e;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.b + ", requiresDeviceIdle=" + this.c + ", requiresBatteryNotLow=" + this.d + ", requiresStorageNotLow=" + this.e + ", contentTriggerUpdateDelayMillis=" + this.f + ", contentTriggerMaxDelayMillis=" + this.g + ", contentUriTriggers=" + this.h + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lx0(s44 requiredNetworkType, boolean z, boolean z2, boolean z3) {
        this(requiredNetworkType, z, false, z2, z3);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lx0(s44 requiredNetworkType, boolean z, boolean z2, boolean z3, boolean z4) {
        this(requiredNetworkType, z, z2, z3, z4, -1L, 0L, null, 192, null);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ lx0(s44 s44Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? s44.NOT_REQUIRED : s44Var, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) == 0 ? z4 : false, (i2 & 32) != 0 ? -1L : j2, (i2 & 64) == 0 ? j3 : -1L, (i2 & 128) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }

    public lx0(s44 requiredNetworkType, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.a = requiredNetworkType;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = contentUriTriggers;
    }

    public lx0(lx0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.b = other.b;
        this.c = other.c;
        this.a = other.a;
        this.d = other.d;
        this.e = other.e;
        this.h = other.h;
        this.f = other.f;
        this.g = other.g;
    }
}
