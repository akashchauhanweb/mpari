package com.zepto;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vu5 {
    public static final a h = new a(null);
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public vu5 f;
    public vu5 g;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public vu5() {
        this.a = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        this.e = true;
        this.d = false;
    }

    public final void a() {
        vu5 vu5Var = this.g;
        int i = 0;
        if (!(vu5Var != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        Intrinsics.checkNotNull(vu5Var);
        if (vu5Var.e) {
            int i2 = this.c - this.b;
            vu5 vu5Var2 = this.g;
            Intrinsics.checkNotNull(vu5Var2);
            int i3 = 8192 - vu5Var2.c;
            vu5 vu5Var3 = this.g;
            Intrinsics.checkNotNull(vu5Var3);
            if (!vu5Var3.d) {
                vu5 vu5Var4 = this.g;
                Intrinsics.checkNotNull(vu5Var4);
                i = vu5Var4.b;
            }
            if (i2 > i3 + i) {
                return;
            }
            vu5 vu5Var5 = this.g;
            Intrinsics.checkNotNull(vu5Var5);
            f(vu5Var5, i2);
            b();
            yu5.b(this);
        }
    }

    public final vu5 b() {
        vu5 vu5Var = this.f;
        if (vu5Var == this) {
            vu5Var = null;
        }
        vu5 vu5Var2 = this.g;
        Intrinsics.checkNotNull(vu5Var2);
        vu5Var2.f = this.f;
        vu5 vu5Var3 = this.f;
        Intrinsics.checkNotNull(vu5Var3);
        vu5Var3.g = this.g;
        this.f = null;
        this.g = null;
        return vu5Var;
    }

    public final vu5 c(vu5 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.g = this;
        segment.f = this.f;
        vu5 vu5Var = this.f;
        Intrinsics.checkNotNull(vu5Var);
        vu5Var.g = segment;
        this.f = segment;
        return segment;
    }

    public final vu5 d() {
        this.d = true;
        return new vu5(this.a, this.b, this.c, true, false);
    }

    public final vu5 e(int i) {
        vu5 vu5VarC;
        if (!(i > 0 && i <= this.c - this.b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i >= 1024) {
            vu5VarC = d();
        } else {
            vu5VarC = yu5.c();
            byte[] bArr = this.a;
            byte[] bArr2 = vu5VarC.a;
            int i2 = this.b;
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
        }
        vu5VarC.c = vu5VarC.b + i;
        this.b += i;
        vu5 vu5Var = this.g;
        Intrinsics.checkNotNull(vu5Var);
        vu5Var.c(vu5VarC);
        return vu5VarC;
    }

    public final void f(vu5 sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = sink.c;
        if (i2 + i > 8192) {
            if (sink.d) {
                throw new IllegalArgumentException();
            }
            int i3 = sink.b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.a;
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i3, i2, 2, (Object) null);
            sink.c -= sink.b;
            sink.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = sink.a;
        int i4 = sink.c;
        int i5 = this.b;
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr3, i4, i5, i5 + i);
        sink.c += i;
        this.b += i;
    }

    public vu5(byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = data;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
