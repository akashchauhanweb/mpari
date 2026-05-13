package com.zepto;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b63 implements Closeable, Flushable {
    public static final Pattern m = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] n = new String[128];
    public static final String[] o;
    public final Writer c;
    public int[] e = new int[32];
    public int f = 0;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public String k;
    public boolean l;

    static {
        for (int i = 0; i <= 31; i++) {
            n[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b63(Writer writer) {
        y0(6);
        this.h = ":";
        this.l = true;
        Objects.requireNonNull(writer, "out == null");
        this.c = writer;
    }

    public static boolean d0(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public final void A0(boolean z) {
        this.j = z;
    }

    public b63 B() {
        return n(3, 5, '}');
    }

    public final void B0(String str) {
        if (str.length() == 0) {
            this.g = null;
            this.h = ":";
        } else {
            this.g = str;
            this.h = ": ";
        }
    }

    public final void C0(boolean z) {
        this.i = z;
    }

    public final boolean D() {
        return this.l;
    }

    public final void D0(boolean z) {
        this.l = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.j
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.zepto.b63.o
            goto L9
        L7:
            java.lang.String[] r0 = com.zepto.b63.n
        L9:
            java.io.Writer r1 = r8.c
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.c
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.c
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.c
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.c
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.b63.E0(java.lang.String):void");
    }

    public b63 F0(double d) throws IOException {
        L0();
        if (this.i || !(Double.isNaN(d) || Double.isInfinite(d))) {
            e();
            this.c.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public b63 G0(long j) throws IOException {
        L0();
        e();
        this.c.write(Long.toString(j));
        return this;
    }

    public b63 H0(Boolean bool) throws IOException {
        if (bool == null) {
            return m0();
        }
        L0();
        e();
        this.c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public b63 I0(Number number) throws IOException {
        if (number == null) {
            return m0();
        }
        L0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!d0(cls) && !m.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.i) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        e();
        this.c.append((CharSequence) string);
        return this;
    }

    public b63 J0(String str) throws IOException {
        if (str == null) {
            return m0();
        }
        L0();
        e();
        E0(str);
        return this;
    }

    public b63 K0(boolean z) throws IOException {
        L0();
        e();
        this.c.write(z ? "true" : "false");
        return this;
    }

    public final void L0() throws IOException {
        if (this.k != null) {
            d();
            E0(this.k);
            this.k = null;
        }
    }

    public final boolean P() {
        return this.j;
    }

    public boolean U() {
        return this.i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.close();
        int i = this.f;
        if (i > 1 || (i == 1 && this.e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f = 0;
    }

    public final void d() throws IOException {
        int iX0 = x0();
        if (iX0 == 5) {
            this.c.write(44);
        } else if (iX0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k0();
        z0(4);
    }

    public final void e() throws IOException {
        int iX0 = x0();
        if (iX0 == 1) {
            z0(2);
            k0();
            return;
        }
        if (iX0 == 2) {
            this.c.append(',');
            k0();
        } else {
            if (iX0 == 4) {
                this.c.append((CharSequence) this.h);
                z0(5);
                return;
            }
            if (iX0 != 6) {
                if (iX0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.i) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            z0(7);
        }
    }

    public b63 e0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.k != null) {
            throw new IllegalStateException();
        }
        if (this.f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.k = str;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.c.flush();
    }

    public b63 j() throws IOException {
        L0();
        return p0(1, '[');
    }

    public final void k0() throws IOException {
        if (this.g == null) {
            return;
        }
        this.c.write(10);
        int i = this.f;
        for (int i2 = 1; i2 < i; i2++) {
            this.c.write(this.g);
        }
    }

    public b63 m() throws IOException {
        L0();
        return p0(3, '{');
    }

    public b63 m0() throws IOException {
        if (this.k != null) {
            if (!this.l) {
                this.k = null;
                return this;
            }
            L0();
        }
        e();
        this.c.write("null");
        return this;
    }

    public final b63 n(int i, int i2, char c) throws IOException {
        int iX0 = x0();
        if (iX0 != i2 && iX0 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Dangling name: " + this.k);
        }
        this.f--;
        if (iX0 == i2) {
            k0();
        }
        this.c.write(c);
        return this;
    }

    public final b63 p0(int i, char c) throws IOException {
        e();
        y0(i);
        this.c.write(c);
        return this;
    }

    public b63 w() {
        return n(1, 2, ']');
    }

    public final int x0() {
        int i = this.f;
        if (i != 0) {
            return this.e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void y0(int i) {
        int i2 = this.f;
        int[] iArr = this.e;
        if (i2 == iArr.length) {
            this.e = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.e;
        int i3 = this.f;
        this.f = i3 + 1;
        iArr2[i3] = i;
    }

    public final void z0(int i) {
        this.e[this.f - 1] = i;
    }
}
