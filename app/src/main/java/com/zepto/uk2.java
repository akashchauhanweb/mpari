package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uk2 implements y46 {
    public byte c;
    public final h55 e;
    public final Inflater f;
    public final oy2 g;
    public final CRC32 h;

    public uk2(y46 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        h55 h55Var = new h55(source);
        this.e = h55Var;
        Inflater inflater = new Inflater(true);
        this.f = inflater;
        this.g = new oy2(h55Var, inflater);
        this.h = new CRC32();
    }

    @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.close();
    }

    public final void d(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(this, *args)");
        throw new IOException(str2);
    }

    public final void e() throws IOException {
        this.e.j0(10L);
        byte bX0 = this.e.c.x0(3L);
        boolean z = ((bX0 >> 1) & 1) == 1;
        if (z) {
            m(this.e.c, 0L, 10L);
        }
        d("ID1ID2", 8075, this.e.readShort());
        this.e.skip(8L);
        if (((bX0 >> 2) & 1) == 1) {
            this.e.j0(2L);
            if (z) {
                m(this.e.c, 0L, 2L);
            }
            long jF0 = this.e.c.F0();
            this.e.j0(jF0);
            if (z) {
                m(this.e.c, 0L, jF0);
            }
            this.e.skip(jF0);
        }
        if (((bX0 >> 3) & 1) == 1) {
            long jD = this.e.d((byte) 0);
            if (jD == -1) {
                throw new EOFException();
            }
            if (z) {
                m(this.e.c, 0L, jD + 1);
            }
            this.e.skip(jD + 1);
        }
        if (((bX0 >> 4) & 1) == 1) {
            long jD2 = this.e.d((byte) 0);
            if (jD2 == -1) {
                throw new EOFException();
            }
            if (z) {
                m(this.e.c, 0L, jD2 + 1);
            }
            this.e.skip(jD2 + 1);
        }
        if (z) {
            d("FHCRC", this.e.n(), (short) this.h.getValue());
            this.h.reset();
        }
    }

    public final void j() throws IOException {
        d("CRC", this.e.m(), (int) this.h.getValue());
        d("ISIZE", this.e.m(), (int) this.f.getBytesWritten());
    }

    public final void m(u70 u70Var, long j, long j2) {
        vu5 vu5Var = u70Var.c;
        Intrinsics.checkNotNull(vu5Var);
        while (true) {
            int i = vu5Var.c;
            int i2 = vu5Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            vu5Var = vu5Var.f;
            Intrinsics.checkNotNull(vu5Var);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) vu5Var.b) + j);
            int iMin = (int) Math.min(vu5Var.c - i3, j2);
            this.h.update(vu5Var.a, i3, iMin);
            j2 -= (long) iMin;
            vu5Var = vu5Var.f;
            Intrinsics.checkNotNull(vu5Var);
            j = 0;
        }
    }

    @Override // com.zepto.y46
    public long read(u70 sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.c == 0) {
            e();
            this.c = (byte) 1;
        }
        if (this.c == 1) {
            long jL0 = sink.L0();
            long j2 = this.g.read(sink, j);
            if (j2 != -1) {
                m(sink, jL0, j2);
                return j2;
            }
            this.c = (byte) 2;
        }
        if (this.c == 2) {
            j();
            this.c = (byte) 3;
            if (!this.e.I()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.zepto.y46
    public cg6 timeout() {
        return this.e.timeout();
    }
}
