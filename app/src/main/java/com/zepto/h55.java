package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class h55 implements a80 {
    public final u70 c;
    public boolean e;
    public final y46 f;

    public h55(y46 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f = source;
        this.c = new u70();
    }

    @Override // com.zepto.a80
    public String E() {
        return W(LongCompanionObject.MAX_VALUE);
    }

    @Override // com.zepto.a80
    public byte[] G() {
        this.c.H(this.f);
        return this.c.G();
    }

    @Override // com.zepto.a80
    public boolean I() {
        if (!this.e) {
            return this.c.I() && this.f.read(this.c, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.zepto.a80
    public byte[] K(long j) throws EOFException {
        j0(j);
        return this.c.K(j);
    }

    @Override // com.zepto.a80
    public long S() throws EOFException {
        byte bX0;
        j0(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!u(j2)) {
                break;
            }
            bX0 = this.c.x0(j);
            if ((bX0 < ((byte) 48) || bX0 > ((byte) 57)) && !(j == 0 && bX0 == ((byte) 45))) {
                break;
            }
            j = j2;
        }
        if (j == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9] or '-' character but was 0x");
            String string = Integer.toString(bX0, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.c.S();
    }

    @Override // com.zepto.a80
    public long T(d36 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (this.f.read(this.c, ConstantsKt.DEFAULT_BUFFER_SIZE) != -1) {
            long jU = this.c.U();
            if (jU > 0) {
                j += jU;
                sink.Q(this.c, jU);
            }
        }
        if (this.c.L0() <= 0) {
            return j;
        }
        long jL0 = j + this.c.L0();
        u70 u70Var = this.c;
        sink.Q(u70Var, u70Var.L0());
        return jL0;
    }

    @Override // com.zepto.a80
    public String W(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jE = e(b, 0L, j2);
        if (jE != -1) {
            return v70.b(this.c, jE);
        }
        if (j2 < LongCompanionObject.MAX_VALUE && u(j2) && this.c.x0(j2 - 1) == ((byte) 13) && u(1 + j2) && this.c.x0(j2) == b) {
            return v70.b(this.c, j2);
        }
        u70 u70Var = new u70();
        u70 u70Var2 = this.c;
        u70Var2.m0(u70Var, 0L, Math.min(32, u70Var2.L0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.c.L0(), j) + " content=" + u70Var.p().j() + "…");
    }

    @Override // com.zepto.a80
    public boolean Z(long j, t80 bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return j(j, bytes, 0, bytes.t());
    }

    @Override // com.zepto.a80
    public u70 c() {
        return this.c;
    }

    @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f.close();
        this.c.d();
    }

    public long d(byte b) {
        return e(b, 0L, LongCompanionObject.MAX_VALUE);
    }

    public long e(byte b, long j, long j2) {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j && j2 >= j)) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long jY0 = this.c.y0(b, j, j2);
            if (jY0 != -1) {
                return jY0;
            }
            long jL0 = this.c.L0();
            if (jL0 >= j2 || this.f.read(this.c, ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
            j = Math.max(j, jL0);
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.e;
    }

    public boolean j(long j, t80 bytes, int i, int i2) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j >= 0 && i >= 0 && i2 >= 0 && bytes.t() - i >= i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (u(1 + j2) && this.c.x0(j2) == bytes.e(i + i3)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.zepto.a80
    public void j0(long j) throws EOFException {
        if (!u(j)) {
            throw new EOFException();
        }
    }

    public int m() throws EOFException {
        j0(4L);
        return this.c.E0();
    }

    public short n() throws EOFException {
        j0(2L);
        return this.c.F0();
    }

    @Override // com.zepto.a80
    public t80 p() {
        this.c.H(this.f);
        return this.c.p();
    }

    @Override // com.zepto.a80
    public t80 q(long j) throws EOFException {
        j0(j);
        return this.c.q(j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.c.L0() == 0 && this.f.read(this.c, ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.c.read(sink);
    }

    @Override // com.zepto.a80
    public byte readByte() throws EOFException {
        j0(1L);
        return this.c.readByte();
    }

    @Override // com.zepto.a80
    public int readInt() throws EOFException {
        j0(4L);
        return this.c.readInt();
    }

    @Override // com.zepto.a80
    public short readShort() throws EOFException {
        j0(2L);
        return this.c.readShort();
    }

    @Override // com.zepto.a80
    public long s0() throws EOFException {
        byte bX0;
        j0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!u(i2)) {
                break;
            }
            bX0 = this.c.x0(i);
            if ((bX0 < ((byte) 48) || bX0 > ((byte) 57)) && ((bX0 < ((byte) 97) || bX0 > ((byte) 102)) && (bX0 < ((byte) 65) || bX0 > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bX0, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.c.s0();
    }

    @Override // com.zepto.a80
    public void skip(long j) throws EOFException {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.c.L0() == 0 && this.f.read(this.c, ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.c.L0());
            this.c.skip(jMin);
            j -= jMin;
        }
    }

    @Override // com.zepto.a80
    public String t0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.c.H(this.f);
        return this.c.t0(charset);
    }

    @Override // com.zepto.y46
    public cg6 timeout() {
        return this.f.timeout();
    }

    public String toString() {
        return "buffer(" + this.f + ')';
    }

    @Override // com.zepto.a80
    public boolean u(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.c.L0() < j) {
            if (this.f.read(this.c, ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.zepto.a80
    public InputStream u0() {
        return new a();
    }

    @Override // com.zepto.a80
    public int v0(th4 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iC = v70.c(this.c, options, true);
            if (iC != -2) {
                if (iC != -1) {
                    this.c.skip(options.n()[iC].t());
                    return iC;
                }
            } else if (this.f.read(this.c, ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // com.zepto.y46
    public long read(u70 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.c.L0() == 0 && this.f.read(this.c, ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
            return -1L;
        }
        return this.c.read(sink, Math.min(j, this.c.L0()));
    }

    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            h55 h55Var = h55.this;
            if (h55Var.e) {
                throw new IOException("closed");
            }
            return (int) Math.min(h55Var.c.L0(), IntCompanionObject.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            h55.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            h55 h55Var = h55.this;
            if (h55Var.e) {
                throw new IOException("closed");
            }
            if (h55Var.c.L0() == 0) {
                h55 h55Var2 = h55.this;
                if (h55Var2.f.read(h55Var2.c, ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1;
                }
            }
            return h55.this.c.readByte() & UByte.MAX_VALUE;
        }

        public String toString() {
            return h55.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!h55.this.e) {
                g.b(data.length, i, i2);
                if (h55.this.c.L0() == 0) {
                    h55 h55Var = h55.this;
                    if (h55Var.f.read(h55Var.c, ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                }
                return h55.this.c.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
