package com.zepto;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class u70 implements a80, z70, Cloneable, ByteChannel {
    public vu5 c;
    public long e;

    public static final class b extends OutputStream {
        public b() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return u70.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            u70.this.J(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            u70.this.a(data, i, i2);
        }
    }

    public long A0(t80 targetBytes, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long jL0 = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        vu5 vu5Var = this.c;
        if (vu5Var == null) {
            return -1L;
        }
        if (L0() - j < j) {
            jL0 = L0();
            while (jL0 > j) {
                vu5Var = vu5Var.g;
                Intrinsics.checkNotNull(vu5Var);
                jL0 -= (long) (vu5Var.c - vu5Var.b);
            }
            if (targetBytes.t() == 2) {
                byte bE = targetBytes.e(0);
                byte bE2 = targetBytes.e(1);
                while (jL0 < L0()) {
                    byte[] bArr = vu5Var.a;
                    i = (int) ((((long) vu5Var.b) + j) - jL0);
                    int i3 = vu5Var.c;
                    while (i < i3) {
                        byte b2 = bArr[i];
                        if (b2 == bE || b2 == bE2) {
                            i2 = vu5Var.b;
                        } else {
                            i++;
                        }
                    }
                    jL0 += (long) (vu5Var.c - vu5Var.b);
                    vu5Var = vu5Var.f;
                    Intrinsics.checkNotNull(vu5Var);
                    j = jL0;
                }
                return -1L;
            }
            byte[] bArrK = targetBytes.k();
            while (jL0 < L0()) {
                byte[] bArr2 = vu5Var.a;
                i = (int) ((((long) vu5Var.b) + j) - jL0);
                int i4 = vu5Var.c;
                while (i < i4) {
                    byte b3 = bArr2[i];
                    for (byte b4 : bArrK) {
                        if (b3 == b4) {
                            i2 = vu5Var.b;
                        }
                    }
                    i++;
                }
                jL0 += (long) (vu5Var.c - vu5Var.b);
                vu5Var = vu5Var.f;
                Intrinsics.checkNotNull(vu5Var);
                j = jL0;
            }
            return -1L;
        }
        while (true) {
            long j2 = ((long) (vu5Var.c - vu5Var.b)) + jL0;
            if (j2 > j) {
                break;
            }
            vu5Var = vu5Var.f;
            Intrinsics.checkNotNull(vu5Var);
            jL0 = j2;
        }
        if (targetBytes.t() == 2) {
            byte bE3 = targetBytes.e(0);
            byte bE4 = targetBytes.e(1);
            while (jL0 < L0()) {
                byte[] bArr3 = vu5Var.a;
                i = (int) ((((long) vu5Var.b) + j) - jL0);
                int i5 = vu5Var.c;
                while (i < i5) {
                    byte b5 = bArr3[i];
                    if (b5 == bE3 || b5 == bE4) {
                        i2 = vu5Var.b;
                    } else {
                        i++;
                    }
                }
                jL0 += (long) (vu5Var.c - vu5Var.b);
                vu5Var = vu5Var.f;
                Intrinsics.checkNotNull(vu5Var);
                j = jL0;
            }
            return -1L;
        }
        byte[] bArrK2 = targetBytes.k();
        while (jL0 < L0()) {
            byte[] bArr4 = vu5Var.a;
            i = (int) ((((long) vu5Var.b) + j) - jL0);
            int i6 = vu5Var.c;
            while (i < i6) {
                byte b6 = bArr4[i];
                for (byte b7 : bArrK2) {
                    if (b6 == b7) {
                        i2 = vu5Var.b;
                    }
                }
                i++;
            }
            jL0 += (long) (vu5Var.c - vu5Var.b);
            vu5Var = vu5Var.f;
            Intrinsics.checkNotNull(vu5Var);
            j = jL0;
        }
        return -1L;
        return ((long) (i - i2)) + jL0;
    }

    public OutputStream B0() {
        return new b();
    }

    public boolean C0(long j, t80 bytes, int i, int i2) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || L0() - j < i2 || bytes.t() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (x0(((long) i3) + j) != bytes.e(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public void D0(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // com.zepto.a80
    public String E() {
        return W(LongCompanionObject.MAX_VALUE);
    }

    public int E0() {
        return g.c(readInt());
    }

    public short F0() {
        return g.d(readShort());
    }

    @Override // com.zepto.a80
    public byte[] G() {
        return K(L0());
    }

    public String G0(long j, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(j >= 0 && j <= ((long) IntCompanionObject.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.e < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        vu5 vu5Var = this.c;
        Intrinsics.checkNotNull(vu5Var);
        int i = vu5Var.b;
        if (((long) i) + j > vu5Var.c) {
            return new String(K(j), charset);
        }
        int i2 = (int) j;
        String str = new String(vu5Var.a, i, i2, charset);
        int i3 = vu5Var.b + i2;
        vu5Var.b = i3;
        this.e -= j;
        if (i3 == vu5Var.c) {
            this.c = vu5Var.b();
            yu5.b(vu5Var);
        }
        return str;
    }

    @Override // com.zepto.z70
    public long H(y46 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(this, ConstantsKt.DEFAULT_BUFFER_SIZE);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public String H0() {
        return G0(this.e, Charsets.UTF_8);
    }

    @Override // com.zepto.a80
    public boolean I() {
        return this.e == 0;
    }

    public String I0(long j) throws EOFException {
        return G0(j, Charsets.UTF_8);
    }

    public int J0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (L0() == 0) {
            throw new EOFException();
        }
        byte bX0 = x0(0L);
        if ((bX0 & ByteCompanionObject.MIN_VALUE) == 0) {
            i = bX0 & ByteCompanionObject.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((bX0 & 224) == 192) {
            i = bX0 & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bX0 & 240) == 224) {
            i = bX0 & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bX0 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bX0 & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (L0() < j) {
            throw new EOFException("size < " + i2 + ": " + L0() + " (to read code point prefixed 0x" + g.e(bX0) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bX02 = x0(j2);
            if ((bX02 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bX02 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 <= i && 57343 >= i) || i < i3) {
            return 65533;
        }
        return i;
    }

    @Override // com.zepto.a80
    public byte[] K(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) IntCompanionObject.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (L0() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        D0(bArr);
        return bArr;
    }

    public final void K0(long j) {
        this.e = j;
    }

    public final long L0() {
        return this.e;
    }

    public final t80 M0() {
        if (L0() <= ((long) IntCompanionObject.MAX_VALUE)) {
            return N0((int) L0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + L0()).toString());
    }

    public final t80 N0(int i) {
        if (i == 0) {
            return t80.g;
        }
        g.b(L0(), 0L, i);
        vu5 vu5Var = this.c;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(vu5Var);
            int i5 = vu5Var.c;
            int i6 = vu5Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            vu5Var = vu5Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        vu5 vu5Var2 = this.c;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(vu5Var2);
            bArr[i7] = vu5Var2.a;
            i2 += vu5Var2.c - vu5Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = vu5Var2.b;
            vu5Var2.d = true;
            i7++;
            vu5Var2 = vu5Var2.f;
        }
        return new zu5(bArr, iArr);
    }

    public final vu5 O0(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        vu5 vu5Var = this.c;
        if (vu5Var != null) {
            Intrinsics.checkNotNull(vu5Var);
            vu5 vu5Var2 = vu5Var.g;
            Intrinsics.checkNotNull(vu5Var2);
            return (vu5Var2.c + i > 8192 || !vu5Var2.e) ? vu5Var2.c(yu5.c()) : vu5Var2;
        }
        vu5 vu5VarC = yu5.c();
        this.c = vu5VarC;
        vu5VarC.g = vu5VarC;
        vu5VarC.f = vu5VarC;
        return vu5VarC;
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public u70 h0(t80 byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.x(this, 0, byteString.t());
        return this;
    }

    @Override // com.zepto.d36
    public void Q(u70 source, long j) {
        vu5 vu5Var;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        g.b(source.L0(), 0L, j);
        while (j > 0) {
            vu5 vu5Var2 = source.c;
            Intrinsics.checkNotNull(vu5Var2);
            int i = vu5Var2.c;
            Intrinsics.checkNotNull(source.c);
            if (j < i - r2.b) {
                vu5 vu5Var3 = this.c;
                if (vu5Var3 != null) {
                    Intrinsics.checkNotNull(vu5Var3);
                    vu5Var = vu5Var3.g;
                } else {
                    vu5Var = null;
                }
                if (vu5Var != null && vu5Var.e) {
                    if ((((long) vu5Var.c) + j) - ((long) (vu5Var.d ? 0 : vu5Var.b)) <= ConstantsKt.DEFAULT_BUFFER_SIZE) {
                        vu5 vu5Var4 = source.c;
                        Intrinsics.checkNotNull(vu5Var4);
                        vu5Var4.f(vu5Var, (int) j);
                        source.K0(source.L0() - j);
                        K0(L0() + j);
                        return;
                    }
                }
                vu5 vu5Var5 = source.c;
                Intrinsics.checkNotNull(vu5Var5);
                source.c = vu5Var5.e((int) j);
            }
            vu5 vu5Var6 = source.c;
            Intrinsics.checkNotNull(vu5Var6);
            long j2 = vu5Var6.c - vu5Var6.b;
            source.c = vu5Var6.b();
            vu5 vu5Var7 = this.c;
            if (vu5Var7 == null) {
                this.c = vu5Var6;
                vu5Var6.g = vu5Var6;
                vu5Var6.f = vu5Var6;
            } else {
                Intrinsics.checkNotNull(vu5Var7);
                vu5 vu5Var8 = vu5Var7.g;
                Intrinsics.checkNotNull(vu5Var8);
                vu5Var8.c(vu5Var6).a();
            }
            source.K0(source.L0() - j2);
            K0(L0() + j2);
            j -= j2;
        }
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public u70 O(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return a(source, 0, source.length);
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public u70 a(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        g.b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            vu5 vu5VarO0 = O0(1);
            int iMin = Math.min(i3 - i, 8192 - vu5VarO0.c);
            int i4 = i + iMin;
            ArraysKt___ArraysJvmKt.copyInto(source, vu5VarO0.a, vu5VarO0.c, i, i4);
            vu5VarO0.c += iMin;
            i = i4;
        }
        K0(L0() + j);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3 A[EDGE_INSN: B:48:0x00b3->B:38:0x00b3 BREAK  A[LOOP:0: B:5:0x0011->B:50:?], SYNTHETIC] */
    @Override // com.zepto.a80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long S() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.L0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc1
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L11:
            com.zepto.vu5 r7 = r15.c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.a
            int r9 = r7.b
            int r10 = r7.c
        L1c:
            if (r9 >= r10) goto L9f
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L6f
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L6f
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L42
            if (r13 != 0) goto L3c
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L3c
            goto L42
        L3c:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L7b
        L42:
            com.zepto.u70 r0 = new com.zepto.u70
            r0.<init>()
            com.zepto.u70 r0 = r0.n0(r3)
            com.zepto.u70 r0 = r0.J(r11)
            if (r1 != 0) goto L54
            r0.readByte()
        L54:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.H0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L80
            if (r0 != 0) goto L80
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L7b:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L1c
        L80:
            if (r0 == 0) goto L84
            r2 = r13
            goto L9f
        L84:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = com.zepto.g.e(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            if (r9 != r10) goto Lab
            com.zepto.vu5 r8 = r7.b()
            r15.c = r8
            com.zepto.yu5.b(r7)
            goto Lad
        Lab:
            r7.b = r9
        Lad:
            if (r2 != 0) goto Lb3
            com.zepto.vu5 r7 = r15.c
            if (r7 != 0) goto L11
        Lb3:
            long r5 = r15.L0()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.K0(r5)
            if (r1 == 0) goto Lbf
            goto Lc0
        Lbf:
            long r3 = -r3
        Lc0:
            return r3
        Lc1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.u70.S():long");
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public u70 J(int i) {
        vu5 vu5VarO0 = O0(1);
        byte[] bArr = vu5VarO0.a;
        int i2 = vu5VarO0.c;
        vu5VarO0.c = i2 + 1;
        bArr[i2] = (byte) i;
        K0(L0() + 1);
        return this;
    }

    @Override // com.zepto.a80
    public long T(d36 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long jL0 = L0();
        if (jL0 > 0) {
            sink.Q(this, jL0);
        }
        return jL0;
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public u70 n0(long j) {
        boolean z;
        if (j == 0) {
            return J(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return l0("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        vu5 vu5VarO0 = O0(i);
        byte[] bArr = vu5VarO0.a;
        int i2 = vu5VarO0.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = v70.a()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = (byte) 45;
        }
        vu5VarO0.c += i;
        K0(L0() + ((long) i));
        return this;
    }

    public final long U() {
        long jL0 = L0();
        if (jL0 == 0) {
            return 0L;
        }
        vu5 vu5Var = this.c;
        Intrinsics.checkNotNull(vu5Var);
        vu5 vu5Var2 = vu5Var.g;
        Intrinsics.checkNotNull(vu5Var2);
        int i = vu5Var2.c;
        if (i < 8192 && vu5Var2.e) {
            jL0 -= (long) (i - vu5Var2.b);
        }
        return jL0;
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public u70 k(long j) {
        if (j == 0) {
            return J(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        vu5 vu5VarO0 = O0(i);
        byte[] bArr = vu5VarO0.a;
        int i2 = vu5VarO0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = v70.a()[(int) (15 & j)];
            j >>>= 4;
        }
        vu5VarO0.c += i;
        K0(L0() + ((long) i));
        return this;
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public u70 writeInt(int i) {
        vu5 vu5VarO0 = O0(4);
        byte[] bArr = vu5VarO0.a;
        int i2 = vu5VarO0.c;
        bArr[i2] = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        vu5VarO0.c = i2 + 4;
        K0(L0() + 4);
        return this;
    }

    @Override // com.zepto.a80
    public String W(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j2 = j + 1;
        }
        byte b2 = (byte) 10;
        long jY0 = y0(b2, 0L, j2);
        if (jY0 != -1) {
            return v70.b(this, jY0);
        }
        if (j2 < L0() && x0(j2 - 1) == ((byte) 13) && x0(j2) == b2) {
            return v70.b(this, j2);
        }
        u70 u70Var = new u70();
        m0(u70Var, 0L, Math.min(32, L0()));
        throw new EOFException("\\n not found: limit=" + Math.min(L0(), j) + " content=" + u70Var.p().j() + Typography.ellipsis);
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public u70 t(int i) {
        vu5 vu5VarO0 = O0(2);
        byte[] bArr = vu5VarO0.a;
        int i2 = vu5VarO0.c;
        bArr[i2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        vu5VarO0.c = i2 + 2;
        K0(L0() + 2);
        return this;
    }

    public u70 X0(String string, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return a1(string, i, i2);
        }
        String strSubstring = string.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (strSubstring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return a(bytes, 0, bytes.length);
    }

    public u70 Y0(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return X0(string, 0, string.length(), charset);
    }

    @Override // com.zepto.a80
    public boolean Z(long j, t80 bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return C0(j, bytes, 0, bytes.t());
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public u70 l0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return a1(string, 0, string.length());
    }

    public u70 a1(String string, int i, int i2) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        while (i < i2) {
            char cCharAt = string.charAt(i);
            if (cCharAt < 128) {
                vu5 vu5VarO0 = O0(1);
                byte[] bArr = vu5VarO0.a;
                int i3 = vu5VarO0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt;
                while (i4 < iMin) {
                    char cCharAt2 = string.charAt(i4);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) cCharAt2;
                    i4++;
                }
                int i5 = vu5VarO0.c;
                int i6 = (i3 + i4) - i5;
                vu5VarO0.c = i5 + i6;
                K0(L0() + ((long) i6));
                i = i4;
            } else {
                if (cCharAt < 2048) {
                    vu5 vu5VarO02 = O0(2);
                    byte[] bArr2 = vu5VarO02.a;
                    int i7 = vu5VarO02.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    vu5VarO02.c = i7 + 2;
                    K0(L0() + 2);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    vu5 vu5VarO03 = O0(3);
                    byte[] bArr3 = vu5VarO03.a;
                    int i8 = vu5VarO03.c;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    vu5VarO03.c = i8 + 3;
                    K0(L0() + 3);
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        J(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        vu5 vu5VarO04 = O0(4);
                        byte[] bArr4 = vu5VarO04.a;
                        int i11 = vu5VarO04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        vu5VarO04.c = i11 + 4;
                        K0(L0() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public u70 b1(int i) {
        if (i < 128) {
            J(i);
        } else if (i < 2048) {
            vu5 vu5VarO0 = O0(2);
            byte[] bArr = vu5VarO0.a;
            int i2 = vu5VarO0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            vu5VarO0.c = i2 + 2;
            K0(L0() + 2);
        } else if (55296 <= i && 57343 >= i) {
            J(63);
        } else if (i < 65536) {
            vu5 vu5VarO02 = O0(3);
            byte[] bArr2 = vu5VarO02.a;
            int i3 = vu5VarO02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            vu5VarO02.c = i3 + 3;
            K0(L0() + 3);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + g.f(i));
            }
            vu5 vu5VarO03 = O0(4);
            byte[] bArr3 = vu5VarO03.a;
            int i4 = vu5VarO03.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            vu5VarO03.c = i4 + 4;
            K0(L0() + 4);
        }
        return this;
    }

    @Override // com.zepto.a80
    public u70 c() {
        return this;
    }

    @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void d() throws EOFException {
        skip(L0());
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public u70 clone() {
        return k0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u70) {
            u70 u70Var = (u70) obj;
            if (L0() == u70Var.L0()) {
                if (L0() == 0) {
                    return true;
                }
                vu5 vu5Var = this.c;
                Intrinsics.checkNotNull(vu5Var);
                vu5 vu5Var2 = u70Var.c;
                Intrinsics.checkNotNull(vu5Var2);
                int i = vu5Var.b;
                int i2 = vu5Var2.b;
                long j = 0;
                while (j < L0()) {
                    long jMin = Math.min(vu5Var.c - i, vu5Var2.c - i2);
                    long j2 = 0;
                    while (j2 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (vu5Var.a[i] == vu5Var2.a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == vu5Var.c) {
                        vu5Var = vu5Var.f;
                        Intrinsics.checkNotNull(vu5Var);
                        i = vu5Var.b;
                    }
                    if (i2 == vu5Var2.c) {
                        vu5Var2 = vu5Var2.f;
                        Intrinsics.checkNotNull(vu5Var2);
                        i2 = vu5Var2.b;
                    }
                    j += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.zepto.z70, com.zepto.d36, java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        vu5 vu5Var = this.c;
        if (vu5Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vu5Var.c;
            for (int i3 = vu5Var.b; i3 < i2; i3++) {
                i = (i * 31) + vu5Var.a[i3];
            }
            vu5Var = vu5Var.f;
            Intrinsics.checkNotNull(vu5Var);
        } while (vu5Var != this.c);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.zepto.a80
    public void j0(long j) throws EOFException {
        if (this.e < j) {
            throw new EOFException();
        }
    }

    public final u70 k0() {
        u70 u70Var = new u70();
        if (L0() != 0) {
            vu5 vu5Var = this.c;
            Intrinsics.checkNotNull(vu5Var);
            vu5 vu5VarD = vu5Var.d();
            u70Var.c = vu5VarD;
            vu5VarD.g = vu5VarD;
            vu5VarD.f = vu5VarD;
            for (vu5 vu5Var2 = vu5Var.f; vu5Var2 != vu5Var; vu5Var2 = vu5Var2.f) {
                vu5 vu5Var3 = vu5VarD.g;
                Intrinsics.checkNotNull(vu5Var3);
                Intrinsics.checkNotNull(vu5Var2);
                vu5Var3.c(vu5Var2.d());
            }
            u70Var.K0(L0());
        }
        return u70Var;
    }

    public final u70 m0(u70 out, long j, long j2) {
        Intrinsics.checkNotNullParameter(out, "out");
        g.b(L0(), j, j2);
        if (j2 != 0) {
            out.K0(out.L0() + j2);
            vu5 vu5Var = this.c;
            while (true) {
                Intrinsics.checkNotNull(vu5Var);
                int i = vu5Var.c;
                int i2 = vu5Var.b;
                if (j < i - i2) {
                    break;
                }
                j -= (long) (i - i2);
                vu5Var = vu5Var.f;
            }
            while (j2 > 0) {
                Intrinsics.checkNotNull(vu5Var);
                vu5 vu5VarD = vu5Var.d();
                int i3 = vu5VarD.b + ((int) j);
                vu5VarD.b = i3;
                vu5VarD.c = Math.min(i3 + ((int) j2), vu5VarD.c);
                vu5 vu5Var2 = out.c;
                if (vu5Var2 == null) {
                    vu5VarD.g = vu5VarD;
                    vu5VarD.f = vu5VarD;
                    out.c = vu5VarD;
                } else {
                    Intrinsics.checkNotNull(vu5Var2);
                    vu5 vu5Var3 = vu5Var2.g;
                    Intrinsics.checkNotNull(vu5Var3);
                    vu5Var3.c(vu5VarD);
                }
                j2 -= (long) (vu5VarD.c - vu5VarD.b);
                vu5Var = vu5Var.f;
                j = 0;
            }
        }
        return this;
    }

    @Override // com.zepto.a80
    public t80 p() {
        return q(L0());
    }

    @Override // com.zepto.z70
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public u70 R() {
        return this;
    }

    @Override // com.zepto.a80
    public t80 q(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) IntCompanionObject.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (L0() < j) {
            throw new EOFException();
        }
        if (j < ConstantsKt.DEFAULT_BLOCK_SIZE) {
            return new t80(K(j));
        }
        t80 t80VarN0 = N0((int) j);
        skip(j);
        return t80VarN0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        vu5 vu5Var = this.c;
        if (vu5Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), vu5Var.c - vu5Var.b);
        sink.put(vu5Var.a, vu5Var.b, iMin);
        int i = vu5Var.b + iMin;
        vu5Var.b = i;
        this.e -= (long) iMin;
        if (i == vu5Var.c) {
            this.c = vu5Var.b();
            yu5.b(vu5Var);
        }
        return iMin;
    }

    @Override // com.zepto.a80
    public byte readByte() throws EOFException {
        if (L0() == 0) {
            throw new EOFException();
        }
        vu5 vu5Var = this.c;
        Intrinsics.checkNotNull(vu5Var);
        int i = vu5Var.b;
        int i2 = vu5Var.c;
        int i3 = i + 1;
        byte b2 = vu5Var.a[i];
        K0(L0() - 1);
        if (i3 == i2) {
            this.c = vu5Var.b();
            yu5.b(vu5Var);
        } else {
            vu5Var.b = i3;
        }
        return b2;
    }

    @Override // com.zepto.a80
    public int readInt() throws EOFException {
        if (L0() < 4) {
            throw new EOFException();
        }
        vu5 vu5Var = this.c;
        Intrinsics.checkNotNull(vu5Var);
        int i = vu5Var.b;
        int i2 = vu5Var.c;
        if (i2 - i < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        byte[] bArr = vu5Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & UByte.MAX_VALUE) | i4;
        K0(L0() - 4);
        if (i5 == i2) {
            this.c = vu5Var.b();
            yu5.b(vu5Var);
        } else {
            vu5Var.b = i5;
        }
        return i6;
    }

    @Override // com.zepto.a80
    public short readShort() throws EOFException {
        if (L0() < 2) {
            throw new EOFException();
        }
        vu5 vu5Var = this.c;
        Intrinsics.checkNotNull(vu5Var);
        int i = vu5Var.b;
        int i2 = vu5Var.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
        }
        byte[] bArr = vu5Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & UByte.MAX_VALUE) | i4;
        K0(L0() - 2);
        if (i5 == i2) {
            this.c = vu5Var.b();
            yu5.b(vu5Var);
        } else {
            vu5Var.b = i5;
        }
        return (short) i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[EDGE_INSN: B:43:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // com.zepto.a80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long s0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.L0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            com.zepto.vu5 r6 = r14.c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            com.zepto.u70 r0 = new com.zepto.u70
            r0.<init>()
            com.zepto.u70 r0 = r0.k(r4)
            com.zepto.u70 r0 = r0.J(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.H0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = com.zepto.g.e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            com.zepto.vu5 r7 = r6.b()
            r14.c = r7
            com.zepto.yu5.b(r6)
            goto La8
        La6:
            r6.b = r8
        La8:
            if (r1 != 0) goto Lae
            com.zepto.vu5 r6 = r14.c
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r14.L0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.K0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.u70.s0():long");
    }

    @Override // com.zepto.a80
    public void skip(long j) throws EOFException {
        while (j > 0) {
            vu5 vu5Var = this.c;
            if (vu5Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, vu5Var.c - vu5Var.b);
            long j2 = iMin;
            K0(L0() - j2);
            j -= j2;
            int i = vu5Var.b + iMin;
            vu5Var.b = i;
            if (i == vu5Var.c) {
                this.c = vu5Var.b();
                yu5.b(vu5Var);
            }
        }
    }

    @Override // com.zepto.a80
    public String t0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return G0(this.e, charset);
    }

    @Override // com.zepto.y46
    public cg6 timeout() {
        return cg6.d;
    }

    public String toString() {
        return M0().toString();
    }

    @Override // com.zepto.a80
    public boolean u(long j) {
        return this.e >= j;
    }

    @Override // com.zepto.a80
    public InputStream u0() {
        return new a();
    }

    @Override // com.zepto.a80
    public int v0(th4 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iD = v70.d(this, options, false, 2, null);
        if (iD == -1) {
            return -1;
        }
        skip(options.n()[iD].t());
        return iD;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            vu5 vu5VarO0 = O0(1);
            int iMin = Math.min(i, 8192 - vu5VarO0.c);
            source.get(vu5VarO0.a, vu5VarO0.c, iMin);
            i -= iMin;
            vu5VarO0.c += iMin;
        }
        this.e += (long) iRemaining;
        return iRemaining;
    }

    public final byte x0(long j) {
        g.b(L0(), j, 1L);
        vu5 vu5Var = this.c;
        if (vu5Var == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (L0() - j < j) {
            long jL0 = L0();
            while (jL0 > j) {
                vu5Var = vu5Var.g;
                Intrinsics.checkNotNull(vu5Var);
                jL0 -= (long) (vu5Var.c - vu5Var.b);
            }
            Intrinsics.checkNotNull(vu5Var);
            return vu5Var.a[(int) ((((long) vu5Var.b) + j) - jL0)];
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (vu5Var.c - vu5Var.b)) + j2;
            if (j3 > j) {
                Intrinsics.checkNotNull(vu5Var);
                return vu5Var.a[(int) ((((long) vu5Var.b) + j) - j2)];
            }
            vu5Var = vu5Var.f;
            Intrinsics.checkNotNull(vu5Var);
            j2 = j3;
        }
    }

    public long y0(byte b2, long j, long j2) {
        vu5 vu5Var;
        int i;
        long jL0 = 0;
        if (!(0 <= j && j2 >= j)) {
            throw new IllegalArgumentException(("size=" + L0() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > L0()) {
            j2 = L0();
        }
        if (j == j2 || (vu5Var = this.c) == null) {
            return -1L;
        }
        if (L0() - j < j) {
            jL0 = L0();
            while (jL0 > j) {
                vu5Var = vu5Var.g;
                Intrinsics.checkNotNull(vu5Var);
                jL0 -= (long) (vu5Var.c - vu5Var.b);
            }
            while (jL0 < j2) {
                byte[] bArr = vu5Var.a;
                int iMin = (int) Math.min(vu5Var.c, (((long) vu5Var.b) + j2) - jL0);
                i = (int) ((((long) vu5Var.b) + j) - jL0);
                while (i < iMin) {
                    if (bArr[i] != b2) {
                        i++;
                    }
                }
                jL0 += (long) (vu5Var.c - vu5Var.b);
                vu5Var = vu5Var.f;
                Intrinsics.checkNotNull(vu5Var);
                j = jL0;
            }
            return -1L;
        }
        while (true) {
            long j3 = ((long) (vu5Var.c - vu5Var.b)) + jL0;
            if (j3 > j) {
                break;
            }
            vu5Var = vu5Var.f;
            Intrinsics.checkNotNull(vu5Var);
            jL0 = j3;
        }
        while (jL0 < j2) {
            byte[] bArr2 = vu5Var.a;
            int iMin2 = (int) Math.min(vu5Var.c, (((long) vu5Var.b) + j2) - jL0);
            i = (int) ((((long) vu5Var.b) + j) - jL0);
            while (i < iMin2) {
                if (bArr2[i] != b2) {
                    i++;
                }
            }
            jL0 += (long) (vu5Var.c - vu5Var.b);
            vu5Var = vu5Var.f;
            Intrinsics.checkNotNull(vu5Var);
            j = jL0;
        }
        return -1L;
        return ((long) (i - vu5Var.b)) + jL0;
    }

    public long z0(t80 targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return A0(targetBytes, 0L);
    }

    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(u70.this.L0(), IntCompanionObject.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (u70.this.L0() > 0) {
                return u70.this.readByte() & UByte.MAX_VALUE;
            }
            return -1;
        }

        public String toString() {
            return u70.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i, int i2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return u70.this.read(sink, i, i2);
        }
    }

    public int read(byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        g.b(sink.length, i, i2);
        vu5 vu5Var = this.c;
        if (vu5Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, vu5Var.c - vu5Var.b);
        byte[] bArr = vu5Var.a;
        int i3 = vu5Var.b;
        ArraysKt___ArraysJvmKt.copyInto(bArr, sink, i, i3, i3 + iMin);
        vu5Var.b += iMin;
        K0(L0() - ((long) iMin));
        if (vu5Var.b != vu5Var.c) {
            return iMin;
        }
        this.c = vu5Var.b();
        yu5.b(vu5Var);
        return iMin;
    }

    @Override // com.zepto.y46
    public long read(u70 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (L0() == 0) {
            return -1L;
        }
        if (j > L0()) {
            j = L0();
        }
        sink.Q(this, j);
        return j;
    }
}
