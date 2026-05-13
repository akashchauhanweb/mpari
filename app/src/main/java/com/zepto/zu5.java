package com.zepto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zu5 extends t80 {
    public final transient byte[][] i;
    public final transient int[] j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu5(byte[][] segments, int[] directory) {
        super(t80.g.f());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.i = segments;
        this.j = directory;
    }

    public byte[] A() {
        byte[] bArr = new byte[t()];
        int length = z().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = y()[length + i];
            int i5 = y()[i];
            int i6 = i5 - i2;
            ArraysKt___ArraysJvmKt.copyInto(z()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final t80 B() {
        return new t80(A());
    }

    @Override // com.zepto.t80
    public String a() {
        return B().a();
    }

    @Override // com.zepto.t80
    public t80 c(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = z().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = y()[length + i];
            int i4 = y()[i];
            messageDigest.update(z()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest.digest()");
        return new t80(bArrDigest);
    }

    @Override // com.zepto.t80
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t80) {
            t80 t80Var = (t80) obj;
            if (t80Var.t() == t() && n(0, t80Var, 0, t())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zepto.t80
    public int h() {
        return y()[z().length - 1];
    }

    @Override // com.zepto.t80
    public int hashCode() {
        int iG = g();
        if (iG != 0) {
            return iG;
        }
        int length = z().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = y()[length + i];
            int i5 = y()[i];
            byte[] bArr = z()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        p(i2);
        return i2;
    }

    @Override // com.zepto.t80
    public String j() {
        return B().j();
    }

    @Override // com.zepto.t80
    public byte[] k() {
        return A();
    }

    @Override // com.zepto.t80
    public byte l(int i) {
        g.b(y()[z().length - 1], i, 1L);
        int iB = av5.b(this, i);
        return z()[iB][(i - (iB == 0 ? 0 : y()[iB - 1])) + y()[z().length + iB]];
    }

    @Override // com.zepto.t80
    public boolean n(int i, t80 other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > t() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iB = av5.b(this, i);
        while (i < i4) {
            int i5 = iB == 0 ? 0 : y()[iB - 1];
            int i6 = y()[iB] - i5;
            int i7 = y()[z().length + iB];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!other.o(i2, z()[iB], i7 + (i - i5), iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iB++;
        }
        return true;
    }

    @Override // com.zepto.t80
    public boolean o(int i, byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > t() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iB = av5.b(this, i);
        while (i < i4) {
            int i5 = iB == 0 ? 0 : y()[iB - 1];
            int i6 = y()[iB] - i5;
            int i7 = y()[z().length + iB];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!g.a(z()[iB], i7 + (i - i5), other, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iB++;
        }
        return true;
    }

    @Override // com.zepto.t80
    public String toString() {
        return B().toString();
    }

    @Override // com.zepto.t80
    public t80 v() {
        return B().v();
    }

    @Override // com.zepto.t80
    public void x(u70 buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i3 = i2 + i;
        int iB = av5.b(this, i);
        while (i < i3) {
            int i4 = iB == 0 ? 0 : y()[iB - 1];
            int i5 = y()[iB] - i4;
            int i6 = y()[z().length + iB];
            int iMin = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            vu5 vu5Var = new vu5(z()[iB], i7, i7 + iMin, true, false);
            vu5 vu5Var2 = buffer.c;
            if (vu5Var2 == null) {
                vu5Var.g = vu5Var;
                vu5Var.f = vu5Var;
                buffer.c = vu5Var;
            } else {
                Intrinsics.checkNotNull(vu5Var2);
                vu5 vu5Var3 = vu5Var2.g;
                Intrinsics.checkNotNull(vu5Var3);
                vu5Var3.c(vu5Var);
            }
            i += iMin;
            iB++;
        }
        buffer.K0(buffer.L0() + ((long) t()));
    }

    public final int[] y() {
        return this.j;
    }

    public final byte[][] z() {
        return this.i;
    }
}
