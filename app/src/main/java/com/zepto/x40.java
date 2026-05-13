package com.zepto;

import java.util.Arrays;
import java.util.Objects;
import kotlin.io.ConstantsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x40 {
    public static final er0 h = er0.LENIENT;
    public static final byte[] i = {13, 10};
    public final byte a = Base64.padSymbol;
    public final byte b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final er0 g;

    public static class a {
        public int a;
        public long b;
        public byte[] c;
        public int d;
        public int e;
        public boolean f;
        public int g;
        public int h;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.c), Integer.valueOf(this.g), Boolean.valueOf(this.f), Integer.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.h), Integer.valueOf(this.d), Integer.valueOf(this.e));
        }
    }

    public x40(int i2, int i3, int i4, int i5, byte b, er0 er0Var) {
        this.c = i2;
        this.d = i3;
        this.e = (i4 <= 0 || i5 <= 0) ? 0 : (i4 / i3) * i3;
        this.f = i5;
        this.b = b;
        Objects.requireNonNull(er0Var, "codecPolicy");
        this.g = er0Var;
    }

    public static int b(int i2, int i3) {
        return Integer.compare(i2 + IntCompanionObject.MIN_VALUE, i3 + IntCompanionObject.MIN_VALUE);
    }

    public static int d(int i2) {
        if (i2 >= 0) {
            if (i2 > 2147483639) {
                return i2;
            }
            return 2147483639;
        }
        throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i2) & 4294967295L));
    }

    public static byte[] p(a aVar, int i2) {
        int length = aVar.c.length * 2;
        if (b(length, i2) < 0) {
            length = i2;
        }
        if (b(length, 2147483639) > 0) {
            length = d(i2);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = aVar.c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        aVar.c = bArr;
        return bArr;
    }

    public int a(a aVar) {
        if (aVar.c != null) {
            return aVar.d - aVar.e;
        }
        return 0;
    }

    public boolean c(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.b == b || m(b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void e(byte[] bArr, int i2, int i3, a aVar);

    public byte[] f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        e(bArr, 0, bArr.length, aVar);
        e(bArr, 0, -1, aVar);
        int i2 = aVar.d;
        byte[] bArr2 = new byte[i2];
        o(bArr2, 0, i2, aVar);
        return bArr2;
    }

    public abstract void g(byte[] bArr, int i2, int i3, a aVar);

    public byte[] h(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : i(bArr, 0, bArr.length);
    }

    public byte[] i(byte[] bArr, int i2, int i3) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        g(bArr, i2, i3, aVar);
        g(bArr, i2, -1, aVar);
        int i4 = aVar.d - aVar.e;
        byte[] bArr2 = new byte[i4];
        o(bArr2, 0, i4, aVar);
        return bArr2;
    }

    public byte[] j(int i2, a aVar) {
        byte[] bArr = aVar.c;
        if (bArr == null) {
            aVar.c = new byte[Math.max(i2, k())];
            aVar.d = 0;
            aVar.e = 0;
        } else {
            int i3 = aVar.d;
            if ((i3 + i2) - bArr.length > 0) {
                return p(aVar, i3 + i2);
            }
        }
        return aVar.c;
    }

    public int k() {
        return ConstantsKt.DEFAULT_BUFFER_SIZE;
    }

    public long l(byte[] bArr) {
        int length = bArr.length;
        long j = ((long) (((length + r0) - 1) / this.c)) * ((long) this.d);
        int i2 = this.e;
        return i2 > 0 ? j + ((((((long) i2) + j) - 1) / ((long) i2)) * ((long) this.f)) : j;
    }

    public abstract boolean m(byte b);

    public boolean n() {
        return this.g == er0.STRICT;
    }

    public int o(byte[] bArr, int i2, int i3, a aVar) {
        if (aVar.c == null) {
            return aVar.f ? -1 : 0;
        }
        int iMin = Math.min(a(aVar), i3);
        System.arraycopy(aVar.c, aVar.e, bArr, i2, iMin);
        int i4 = aVar.e + iMin;
        aVar.e = i4;
        if (i4 >= aVar.d) {
            aVar.c = null;
        }
        return iMin;
    }
}
