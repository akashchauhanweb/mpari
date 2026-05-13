package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vz5 {
    public static final a c = new a(null);
    public int a;
    public final int[] b = new int[10];

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int a(int i) {
        return this.b[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.a & 16) != 0 ? this.b[4] : IntCompanionObject.MAX_VALUE;
    }

    public final int e(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    public final boolean f(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final void g(vz5 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (other.f(i)) {
                h(i, other.a(i));
            }
        }
    }

    public final vz5 h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.a);
    }
}
