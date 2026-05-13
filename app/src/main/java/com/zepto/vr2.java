package com.zepto;

import com.zepto.lr2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vr2 implements Closeable {
    public final u70 c;
    public int e;
    public boolean f;
    public final lr2.b g;
    public final z70 h;
    public final boolean i;
    public static final a k = new a(null);
    public static final Logger j = Logger.getLogger(qr2.class.getName());

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public vr2(z70 sink, boolean z) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.h = sink;
        this.i = z;
        u70 u70Var = new u70();
        this.c = u70Var;
        this.e = 16384;
        this.g = new lr2.b(0, false, u70Var, 3, null);
    }

    public final synchronized void B(boolean z, int i, List headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f) {
            throw new IOException("closed");
        }
        this.g.g(headerBlock);
        long jL0 = this.c.L0();
        long jMin = Math.min(this.e, jL0);
        int i2 = jL0 == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        n(i, (int) jMin, 1, i2);
        this.h.Q(this.c, jMin);
        if (jL0 > jMin) {
            m0(i, jL0 - jMin);
        }
    }

    public final int D() {
        return this.e;
    }

    public final synchronized void P(boolean z, int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        n(0, 8, 6, z ? 1 : 0);
        this.h.writeInt(i);
        this.h.writeInt(i2);
        this.h.flush();
    }

    public final synchronized void U(int i, int i2, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f) {
            throw new IOException("closed");
        }
        this.g.g(requestHeaders);
        long jL0 = this.c.L0();
        int iMin = (int) Math.min(((long) this.e) - 4, jL0);
        long j2 = iMin;
        n(i, iMin + 4, 5, jL0 == j2 ? 4 : 0);
        this.h.writeInt(i2 & IntCompanionObject.MAX_VALUE);
        this.h.Q(this.c, j2);
        if (jL0 > j2) {
            m0(i, jL0 - j2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f = true;
        this.h.close();
    }

    public final synchronized void d(vz5 peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f) {
                throw new IOException("closed");
            }
            this.e = peerSettings.e(this.e);
            if (peerSettings.b() != -1) {
                this.g.e(peerSettings.b());
            }
            n(0, 0, 4, 1);
            this.h.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d0(int i, y22 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f) {
            throw new IOException("closed");
        }
        if (!(errorCode.a() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        n(i, 4, 3, 0);
        this.h.writeInt(errorCode.a());
        this.h.flush();
    }

    public final synchronized void e() {
        try {
            if (this.f) {
                throw new IOException("closed");
            }
            if (this.i) {
                Logger logger = j;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(et6.q(">> CONNECTION " + qr2.a.j(), new Object[0]));
                }
                this.h.h0(qr2.a);
                this.h.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e0(vz5 settings) {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f) {
                throw new IOException("closed");
            }
            int i = 0;
            n(0, settings.i() * 6, 4, 0);
            while (i < 10) {
                if (settings.f(i)) {
                    this.h.t(i != 4 ? i != 7 ? i : 4 : 3);
                    this.h.writeInt(settings.a(i));
                }
                i++;
            }
            this.h.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.h.flush();
    }

    public final synchronized void j(boolean z, int i, u70 u70Var, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        m(i, z ? 1 : 0, u70Var, i2);
    }

    public final synchronized void k0(int i, long j2) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (!(j2 != 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        n(i, 4, 8, 0);
        this.h.writeInt((int) j2);
        this.h.flush();
    }

    public final void m(int i, int i2, u70 u70Var, int i3) {
        n(i, i3, 0, i2);
        if (i3 > 0) {
            z70 z70Var = this.h;
            Intrinsics.checkNotNull(u70Var);
            z70Var.Q(u70Var, i3);
        }
    }

    public final void m0(int i, long j2) {
        while (j2 > 0) {
            long jMin = Math.min(this.e, j2);
            j2 -= jMin;
            n(i, (int) jMin, 9, j2 == 0 ? 4 : 0);
            this.h.Q(this.c, jMin);
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        Logger logger = j;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(qr2.e.c(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.e)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.e + ": " + i2).toString());
        }
        if (!((((int) 2147483648L) & i) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        et6.W(this.h, i2);
        this.h.J(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.h.J(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.h.writeInt(i & IntCompanionObject.MAX_VALUE);
    }

    public final synchronized void w(int i, y22 errorCode, byte[] debugData) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f) {
                throw new IOException("closed");
            }
            if (!(errorCode.a() != -1)) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            n(0, debugData.length + 8, 7, 0);
            this.h.writeInt(i);
            this.h.writeInt(errorCode.a());
            if (!(debugData.length == 0)) {
                this.h.O(debugData);
            }
            this.h.flush();
        } finally {
        }
    }
}
