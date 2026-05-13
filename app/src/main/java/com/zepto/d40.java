package com.zepto;

import com.zepto.x40;
import kotlin.KotlinVersion;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class d40 extends x40 {
    public static final byte[] o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] q = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public final byte[] j;
    public final byte[] k;
    public final byte[] l;
    public final int m;
    public final int n;

    public d40() {
        this(0);
    }

    public static byte[] q(byte[] bArr) {
        return new d40().f(bArr);
    }

    public static byte[] r(byte[] bArr) {
        return s(bArr, false);
    }

    public static byte[] s(byte[] bArr, boolean z) {
        return t(bArr, z, false);
    }

    public static byte[] t(byte[] bArr, boolean z, boolean z2) {
        return u(bArr, z, z2, IntCompanionObject.MAX_VALUE);
    }

    public static byte[] u(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        d40 d40Var = z ? new d40(z2) : new d40(0, x40.i, z2);
        long jL = d40Var.l(bArr);
        if (jL <= i) {
            return d40Var.h(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + jL + ") than the specified maximum size of " + i);
    }

    @Override // com.zepto.x40
    public void e(byte[] bArr, int i, int i2, x40.a aVar) {
        byte b;
        if (aVar.f) {
            return;
        }
        if (i2 < 0) {
            aVar.f = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] bArrJ = j(this.m, aVar);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == this.b) {
                aVar.f = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = q;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (aVar.h + 1) % 4;
                    aVar.h = i5;
                    int i6 = (aVar.a << 6) + b;
                    aVar.a = i6;
                    if (i5 == 0) {
                        int i7 = aVar.d;
                        bArrJ[i7] = (byte) ((i6 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        bArrJ[i7 + 1] = (byte) ((i6 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        aVar.d = i7 + 3;
                        bArrJ[i7 + 2] = (byte) (i6 & KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!aVar.f || aVar.h == 0) {
            return;
        }
        byte[] bArrJ2 = j(this.m, aVar);
        int i8 = aVar.h;
        if (i8 == 1) {
            w();
            return;
        }
        if (i8 == 2) {
            v(15, aVar);
            int i9 = aVar.a >> 4;
            aVar.a = i9;
            int i10 = aVar.d;
            aVar.d = i10 + 1;
            bArrJ2[i10] = (byte) (i9 & KotlinVersion.MAX_COMPONENT_VALUE);
            return;
        }
        if (i8 != 3) {
            throw new IllegalStateException("Impossible modulus " + aVar.h);
        }
        v(3, aVar);
        int i11 = aVar.a;
        int i12 = i11 >> 2;
        aVar.a = i12;
        int i13 = aVar.d;
        bArrJ2[i13] = (byte) ((i11 >> 10) & KotlinVersion.MAX_COMPONENT_VALUE);
        aVar.d = i13 + 2;
        bArrJ2[i13 + 1] = (byte) (i12 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @Override // com.zepto.x40
    public void g(byte[] bArr, int i, int i2, x40.a aVar) {
        if (aVar.f) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] bArrJ = j(this.n, aVar);
                int i4 = (aVar.h + 1) % 3;
                aVar.h = i4;
                int i5 = i + 1;
                int i6 = bArr[i];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (aVar.a << 8) + i6;
                aVar.a = i7;
                if (i4 == 0) {
                    int i8 = aVar.d;
                    byte[] bArr2 = this.j;
                    bArrJ[i8] = bArr2[(i7 >> 18) & 63];
                    bArrJ[i8 + 1] = bArr2[(i7 >> 12) & 63];
                    int i9 = i8 + 3;
                    bArrJ[i8 + 2] = bArr2[(i7 >> 6) & 63];
                    int i10 = i8 + 4;
                    aVar.d = i10;
                    bArrJ[i9] = bArr2[i7 & 63];
                    int i11 = aVar.g + 4;
                    aVar.g = i11;
                    int i12 = this.e;
                    if (i12 > 0 && i12 <= i11) {
                        byte[] bArr3 = this.l;
                        System.arraycopy(bArr3, 0, bArrJ, i10, bArr3.length);
                        aVar.d += this.l.length;
                        aVar.g = 0;
                    }
                }
                i3++;
                i = i5;
            }
            return;
        }
        aVar.f = true;
        if (aVar.h == 0 && this.e == 0) {
            return;
        }
        byte[] bArrJ2 = j(this.n, aVar);
        int i13 = aVar.d;
        int i14 = aVar.h;
        if (i14 != 0) {
            if (i14 == 1) {
                byte[] bArr4 = this.j;
                int i15 = aVar.a;
                bArrJ2[i13] = bArr4[(i15 >> 2) & 63];
                int i16 = i13 + 2;
                aVar.d = i16;
                bArrJ2[i13 + 1] = bArr4[(i15 << 4) & 63];
                if (bArr4 == o) {
                    byte b = this.b;
                    bArrJ2[i16] = b;
                    aVar.d = i13 + 4;
                    bArrJ2[i13 + 3] = b;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("Impossible modulus " + aVar.h);
                }
                byte[] bArr5 = this.j;
                int i17 = aVar.a;
                bArrJ2[i13] = bArr5[(i17 >> 10) & 63];
                bArrJ2[i13 + 1] = bArr5[(i17 >> 4) & 63];
                int i18 = i13 + 3;
                aVar.d = i18;
                bArrJ2[i13 + 2] = bArr5[(i17 << 2) & 63];
                if (bArr5 == o) {
                    aVar.d = i13 + 4;
                    bArrJ2[i18] = this.b;
                }
            }
        }
        int i19 = aVar.g;
        int i20 = aVar.d;
        int i21 = i19 + (i20 - i13);
        aVar.g = i21;
        if (this.e <= 0 || i21 <= 0) {
            return;
        }
        byte[] bArr6 = this.l;
        System.arraycopy(bArr6, 0, bArrJ2, i20, bArr6.length);
        aVar.d += this.l.length;
    }

    @Override // com.zepto.x40
    public boolean m(byte b) {
        if (b >= 0) {
            byte[] bArr = this.k;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public final void v(int i, x40.a aVar) {
        if (n() && (i & aVar.a) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    public final void w() {
        if (n()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
        }
    }

    public d40(boolean z) {
        this(76, x40.i, z);
    }

    public d40(int i) {
        this(i, x40.i);
    }

    public d40(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public d40(int i, byte[] bArr, boolean z) {
        this(i, bArr, z, x40.h);
    }

    public d40(int i, byte[] bArr, boolean z, er0 er0Var) {
        super(3, 4, i, bArr == null ? 0 : bArr.length, Base64.padSymbol, er0Var);
        this.k = q;
        if (bArr == null) {
            this.n = 4;
            this.l = null;
        } else {
            if (c(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + g86.b(bArr) + "]");
            }
            if (i > 0) {
                this.n = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.l = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.n = 4;
                this.l = null;
            }
        }
        this.m = this.n - 1;
        this.j = z ? p : o;
    }
}
