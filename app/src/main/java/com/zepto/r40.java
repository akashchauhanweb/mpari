package com.zepto;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class r40 {
    public static final r40 a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final r40 b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final r40 c = new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    public static final r40 d = new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    public static final r40 e = new b("base16()", "0123456789ABCDEF");

    public static final class a {
        public final String a;
        public final char[] b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;
        public final boolean[] h;

        public a(String str, char[] cArr) {
            this.a = (String) ju4.j(str);
            this.b = (char[]) ju4.j(cArr);
            try {
                int iD = l03.d(cArr.length, RoundingMode.UNNECESSARY);
                this.d = iD;
                int iMin = Math.min(8, Integer.lowestOneBit(iD));
                try {
                    this.e = 8 / iMin;
                    this.f = iD / iMin;
                    this.c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        ju4.f(c < 128, "Non-ASCII character: %s", c);
                        ju4.f(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.g = bArr;
                    boolean[] zArr = new boolean[this.e];
                    for (int i2 = 0; i2 < this.f; i2++) {
                        zArr[l03.a(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                    }
                    this.h = zArr;
                } catch (ArithmeticException e) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                }
            } catch (ArithmeticException e2) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        public char b(int i) {
            return this.b[i];
        }

        public boolean c(char c) {
            byte[] bArr = this.g;
            return c < bArr.length && bArr[c] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.b, ((a) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class b extends d {
        public final char[] h;

        public b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // com.zepto.r40.d, com.zepto.r40
        public void d(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            ju4.j(appendable);
            ju4.m(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & UByte.MAX_VALUE;
                appendable.append(this.h[i4]);
                appendable.append(this.h[i4 | 256]);
            }
        }

        public b(a aVar) {
            super(aVar, null);
            this.h = new char[ConstantsKt.MINIMUM_BLOCK_SIZE];
            ju4.d(aVar.b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.h[i] = aVar.b(i >>> 4);
                this.h[i | 256] = aVar.b(i & 15);
            }
        }
    }

    public static final class c extends d {
        public c(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // com.zepto.r40.d, com.zepto.r40
        public void d(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            ju4.j(appendable);
            int i3 = i + i2;
            ju4.m(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 2;
                int i5 = ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i] & UByte.MAX_VALUE) << 16);
                i += 3;
                int i6 = i5 | (bArr[i4] & UByte.MAX_VALUE);
                appendable.append(this.f.b(i6 >>> 18));
                appendable.append(this.f.b((i6 >>> 12) & 63));
                appendable.append(this.f.b((i6 >>> 6) & 63));
                appendable.append(this.f.b(i6 & 63));
                i2 -= 3;
            }
            if (i < i3) {
                f(appendable, bArr, i, i3 - i);
            }
        }

        public c(a aVar, Character ch) {
            super(aVar, ch);
            ju4.d(aVar.b.length == 64);
        }
    }

    public static class d extends r40 {
        public final a f;
        public final Character g;

        public d(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // com.zepto.r40
        public void d(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            ju4.j(appendable);
            ju4.m(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                f(appendable, bArr, i + i3, Math.min(this.f.f, i2 - i3));
                i3 += this.f.f;
            }
        }

        @Override // com.zepto.r40
        public int e(int i) {
            a aVar = this.f;
            return aVar.e * l03.a(i, aVar.f, RoundingMode.CEILING);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f.equals(dVar.f) && jf4.a(this.g, dVar.g);
        }

        public void f(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            ju4.j(appendable);
            ju4.m(i, i + i2, bArr.length);
            int i3 = 0;
            ju4.d(i2 <= this.f.f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & UByte.MAX_VALUE))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f.d;
            while (i3 < i2 * 8) {
                a aVar = this.f;
                appendable.append(aVar.b(((int) (j >>> (i5 - i3))) & aVar.c));
                i3 += this.f.d;
            }
            if (this.g != null) {
                while (i3 < this.f.f * 8) {
                    appendable.append(this.g.charValue());
                    i3 += this.f.d;
                }
            }
        }

        public int hashCode() {
            return this.f.hashCode() ^ jf4.b(this.g);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f.toString());
            if (8 % this.f.d != 0) {
                if (this.g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public d(a aVar, Character ch) {
            this.f = (a) ju4.j(aVar);
            ju4.g(ch == null || !aVar.c(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.g = ch;
        }
    }

    public static r40 a() {
        return a;
    }

    public String b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public final String c(byte[] bArr, int i, int i2) {
        ju4.m(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(e(i2));
        try {
            d(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract void d(Appendable appendable, byte[] bArr, int i, int i2);

    public abstract int e(int i);
}
