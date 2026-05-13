package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends u0 implements y {
    public static final j1 e = new a(x.class, 3);
    public static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 c(x0 x0Var) {
            return x0Var.m0();
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return x.g0(z41Var.j0());
        }
    }

    public x(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.c = wx.r(bArr, (byte) i);
    }

    public static x g0(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i = bArr[0] & UByte.MAX_VALUE;
        if (i > 0) {
            if (i > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b = bArr[length - 1];
            if (b != ((byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i) & b))) {
                return new p51(bArr, false);
            }
        }
        return new q41(bArr, false);
    }

    public static x i0(e1 e1Var, boolean z) {
        return (x) e.e(e1Var, z);
    }

    public static x j0(Object obj) {
        if (obj == null || (obj instanceof x)) {
            return (x) obj;
        }
        if (obj instanceof a0) {
            u0 u0VarM = ((a0) obj).m();
            if (u0VarM instanceof x) {
                return (x) u0VarM;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (x) e.b((byte[]) obj);
            } catch (IOException e2) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e2.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.zepto.u0
    public u0 e0() {
        return new q41(this.c, false);
    }

    @Override // com.zepto.u0
    public u0 f0() {
        return new p51(this.c, false);
    }

    public byte[] h0() {
        byte[] bArr = this.c;
        if (bArr.length == 1) {
            return q0.f;
        }
        int i = bArr[0] & UByte.MAX_VALUE;
        byte[] bArrH = wx.h(bArr, 1, bArr.length);
        int length = bArrH.length - 1;
        bArrH[length] = (byte) (((byte) (KotlinVersion.MAX_COMPONENT_VALUE << i)) & bArrH[length]);
        return bArrH;
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        byte[] bArr = this.c;
        if (bArr.length < 2) {
            return 1;
        }
        int i = bArr[0] & UByte.MAX_VALUE;
        int length = bArr.length - 1;
        return (wx.l(bArr, 0, length) * 257) ^ ((byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i) & bArr[length]));
    }

    public byte[] k0() {
        byte[] bArr = this.c;
        if (bArr[0] == 0) {
            return wx.h(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String l0() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b = encoded[i];
                char[] cArr = f;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e2) {
            throw new t0("Internal error encoding BitString: " + e2.getMessage(), e2);
        }
    }

    @Override // com.zepto.y
    public int n() {
        return this.c[0] & UByte.MAX_VALUE;
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return m();
    }

    public String toString() {
        return l0();
    }

    @Override // com.zepto.y
    public InputStream u() {
        byte[] bArr = this.c;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (!(u0Var instanceof x)) {
            return false;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((x) u0Var).c;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = bArr[0] & UByte.MAX_VALUE;
        byte b = bArr[i];
        int i4 = KotlinVersion.MAX_COMPONENT_VALUE << i3;
        return ((byte) (b & i4)) == ((byte) (bArr2[i] & i4));
    }

    public x(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i = bArr[0] & UByte.MAX_VALUE;
            if (i > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.c = bArr;
    }
}
