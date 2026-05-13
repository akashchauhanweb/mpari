package com.zepto;

import com.zepto.lr2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class tr2 implements Closeable {
    public static final Logger h;
    public static final a i = new a(null);
    public final b c;
    public final lr2.a e;
    public final a80 f;
    public final boolean g;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return tr2.h;
        }

        public final int b(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    public static final class b implements y46 {
        public int c;
        public int e;
        public int f;
        public int g;
        public int h;
        public final a80 i;

        public b(a80 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.i = source;
        }

        public final void B(int i) {
            this.f = i;
        }

        @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final int d() {
            return this.g;
        }

        public final void e() throws IOException {
            int i = this.f;
            int iH = et6.H(this.i);
            this.g = iH;
            this.c = iH;
            int iB = et6.b(this.i.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            this.e = et6.b(this.i.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            a aVar = tr2.i;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(qr2.e.c(true, this.f, this.c, iB, this.e));
            }
            int i2 = this.i.readInt() & IntCompanionObject.MAX_VALUE;
            this.f = i2;
            if (iB == 9) {
                if (i2 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        public final void j(int i) {
            this.e = i;
        }

        public final void m(int i) {
            this.g = i;
        }

        public final void n(int i) {
            this.c = i;
        }

        @Override // com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i = this.g;
                if (i != 0) {
                    long j2 = this.i.read(sink, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.g -= (int) j2;
                    return j2;
                }
                this.i.skip(this.h);
                this.h = 0;
                if ((this.e & 4) != 0) {
                    return -1L;
                }
                e();
            }
        }

        @Override // com.zepto.y46
        public cg6 timeout() {
            return this.i.timeout();
        }

        public final void w(int i) {
            this.h = i;
        }
    }

    public interface c {
        void a();

        void b(boolean z, int i, a80 a80Var, int i2);

        void c(boolean z, int i, int i2);

        void d(int i, int i2, int i3, boolean z);

        void e(int i, y22 y22Var, t80 t80Var);

        void f(boolean z, vz5 vz5Var);

        void g(boolean z, int i, int i2, List list);

        void h(int i, y22 y22Var);

        void i(int i, long j);

        void j(int i, int i2, List list);
    }

    static {
        Logger logger = Logger.getLogger(qr2.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(Http2::class.java.name)");
        h = logger;
    }

    public tr2(a80 source, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f = source;
        this.g = z;
        b bVar = new b(source);
        this.c = bVar;
        this.e = new lr2.a(bVar, ConstantsKt.DEFAULT_BLOCK_SIZE, 0, 4, null);
    }

    public final void B(c cVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i3 & 1) != 0;
        int iB = (i3 & 8) != 0 ? et6.b(this.f.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        if ((i3 & 32) != 0) {
            P(cVar, i4);
            i2 -= 5;
        }
        cVar.g(z, i4, -1, w(i.b(i2, i3, iB), iB, i3, i4));
    }

    public final void D(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i2);
        }
        if (i4 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.c((i3 & 1) != 0, this.f.readInt(), this.f.readInt());
    }

    public final void P(c cVar, int i2) {
        int i3 = this.f.readInt();
        cVar.d(i2, i3 & IntCompanionObject.MAX_VALUE, et6.b(this.f.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) + 1, (((int) 2147483648L) & i3) != 0);
    }

    public final void U(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 == 5) {
            if (i4 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            P(cVar, i4);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i2 + " != 5");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f.close();
    }

    public final void d0(c cVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (i3 & 8) != 0 ? et6.b(this.f.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        cVar.j(i4, this.f.readInt() & IntCompanionObject.MAX_VALUE, w(i.b(i2 - 4, i3, iB), iB, i3, i4));
    }

    public final boolean e(boolean z, c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f.j0(9L);
            int iH = et6.H(this.f);
            if (iH > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iH);
            }
            int iB = et6.b(this.f.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            int iB2 = et6.b(this.f.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            int i2 = this.f.readInt() & IntCompanionObject.MAX_VALUE;
            Logger logger = h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(qr2.e.c(true, i2, iH, iB, iB2));
            }
            if (z && iB != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + qr2.e.b(iB));
            }
            switch (iB) {
                case 0:
                    m(handler, iH, iB2, i2);
                    return true;
                case 1:
                    B(handler, iH, iB2, i2);
                    return true;
                case 2:
                    U(handler, iH, iB2, i2);
                    return true;
                case 3:
                    e0(handler, iH, iB2, i2);
                    return true;
                case 4:
                    k0(handler, iH, iB2, i2);
                    return true;
                case 5:
                    d0(handler, iH, iB2, i2);
                    return true;
                case 6:
                    D(handler, iH, iB2, i2);
                    return true;
                case 7:
                    n(handler, iH, iB2, i2);
                    return true;
                case 8:
                    m0(handler, iH, iB2, i2);
                    return true;
                default:
                    this.f.skip(iH);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void e0(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i2 + " != 4");
        }
        if (i4 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i5 = this.f.readInt();
        y22 y22VarA = y22.t.a(i5);
        if (y22VarA != null) {
            cVar.h(i4, y22VarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i5);
    }

    public final void j(c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.g) {
            if (!e(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        a80 a80Var = this.f;
        t80 t80Var = qr2.a;
        t80 t80VarQ = a80Var.q(t80Var.t());
        Logger logger = h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(et6.q("<< CONNECTION " + t80VarQ.j(), new Object[0]));
        }
        if (!Intrinsics.areEqual(t80Var, t80VarQ)) {
            throw new IOException("Expected a connection header but was " + t80VarQ.w());
        }
    }

    public final void k0(c cVar, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i3 & 1) != 0) {
            if (i2 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.a();
            return;
        }
        if (i2 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i2);
        }
        vz5 vz5Var = new vz5();
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, i2), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (true) {
                int iC = et6.c(this.f.readShort(), 65535);
                i5 = this.f.readInt();
                if (iC != 2) {
                    if (iC == 3) {
                        iC = 4;
                    } else if (iC != 4) {
                        if (iC == 5 && (i5 < 16384 || i5 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i5 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iC = 7;
                    }
                } else if (i5 != 0 && i5 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                vz5Var.h(iC, i5);
                if (first == last) {
                    break;
                } else {
                    first += step;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i5);
        }
        cVar.f(false, vz5Var);
    }

    public final void m(c cVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (i3 & 8) != 0 ? et6.b(this.f.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        cVar.b(z, i4, this.f, i.b(i2, i3, iB));
        this.f.skip(iB);
    }

    public final void m0(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i2);
        }
        long jD = et6.d(this.f.readInt(), 2147483647L);
        if (jD == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.i(i4, jD);
    }

    public final void n(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i2);
        }
        if (i4 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i5 = this.f.readInt();
        int i6 = this.f.readInt();
        int i7 = i2 - 8;
        y22 y22VarA = y22.t.a(i6);
        if (y22VarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i6);
        }
        t80 t80VarQ = t80.g;
        if (i7 > 0) {
            t80VarQ = this.f.q(i7);
        }
        cVar.e(i5, y22VarA, t80VarQ);
    }

    public final List w(int i2, int i3, int i4, int i5) throws IOException {
        this.c.m(i2);
        b bVar = this.c;
        bVar.n(bVar.d());
        this.c.w(i3);
        this.c.j(i4);
        this.c.B(i5);
        this.e.k();
        return this.e.e();
    }
}
