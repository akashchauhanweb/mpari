package com.zepto;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xv0 {
    public vp7 a;
    public boolean b;
    public Integer c;
    public boolean d;
    public final boolean e;
    public Double f;
    public Double g;
    public List h;

    public xv0(vp7 quality, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List videoNames) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(videoNames, "videoNames");
        this.a = quality;
        this.b = z;
        this.c = num;
        this.d = z2;
        this.e = z3;
        this.f = d;
        this.g = d2;
        this.h = videoNames;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final vp7 c() {
        return this.a;
    }

    public final Integer d() {
        return this.c;
    }

    public final Double e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv0)) {
            return false;
        }
        xv0 xv0Var = (xv0) obj;
        return this.a == xv0Var.a && this.b == xv0Var.b && Intrinsics.areEqual(this.c, xv0Var.c) && this.d == xv0Var.d && this.e == xv0Var.e && Intrinsics.areEqual((Object) this.f, (Object) xv0Var.f) && Intrinsics.areEqual((Object) this.g, (Object) xv0Var.g) && Intrinsics.areEqual(this.h, xv0Var.h);
    }

    public final List f() {
        return this.h;
    }

    public final Double g() {
        return this.g;
    }

    public final boolean h() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        Integer num = this.c;
        int iHashCode2 = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.d;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        int i2 = (iHashCode2 + r12) * 31;
        boolean z3 = this.e;
        int i3 = (i2 + (z3 ? 1 : z3)) * 31;
        Double d = this.f;
        int iHashCode3 = (i3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        return ((iHashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "Configuration(quality=" + this.a + ", isMinBitrateCheckEnabled=" + this.b + ", videoBitrateInMbps=" + this.c + ", disableAudio=" + this.d + ", keepOriginalResolution=" + this.e + ", videoHeight=" + this.f + ", videoWidth=" + this.g + ", videoNames=" + this.h + ')';
    }

    public /* synthetic */ xv0(vp7 vp7Var, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? vp7.MEDIUM : vp7Var, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : d2, list);
    }
}
