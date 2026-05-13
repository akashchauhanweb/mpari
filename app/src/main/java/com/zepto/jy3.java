package com.zepto;

import com.zepto.ls3;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jy3 extends lc5 {
    public static final ls3 f;
    public static final ls3 g;
    public static final ls3 h;
    public static final ls3 i;
    public static final ls3 j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final b n = new b(null);
    public final ls3 a;
    public long b;
    public final t80 c;
    public final ls3 d;
    public final List e;

    public static final class a {
        public final t80 a;
        public ls3 b;
        public final List c;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(pl2 pl2Var, lc5 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            b(c.c.a(pl2Var, body));
            return this;
        }

        public final a b(c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.c.add(part);
            return this;
        }

        public final jy3 c() {
            if (!this.c.isEmpty()) {
                return new jy3(this.a, this.b, et6.P(this.c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a d(ls3 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.h(), "multipart")) {
                this.b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.a = t80.h.d(boundary);
            this.b = jy3.f;
            this.c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "UUID.randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c {
        public static final a c = new a(null);
        public final pl2 a;
        public final lc5 b;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(pl2 pl2Var, lc5 body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!((pl2Var != null ? pl2Var.j(xr2.HEADER_CONTENT_TYPE) : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((pl2Var != null ? pl2Var.j("Content-Length") : null) == null) {
                    return new c(pl2Var, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
        }

        public c(pl2 pl2Var, lc5 lc5Var) {
            this.a = pl2Var;
            this.b = lc5Var;
        }

        public final lc5 a() {
            return this.b;
        }

        public final pl2 b() {
            return this.a;
        }

        public /* synthetic */ c(pl2 pl2Var, lc5 lc5Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(pl2Var, lc5Var);
        }
    }

    static {
        ls3.a aVar = ls3.g;
        f = aVar.a("multipart/mixed");
        g = aVar.a("multipart/alternative");
        h = aVar.a("multipart/digest");
        i = aVar.a("multipart/parallel");
        j = aVar.a("multipart/form-data");
        k = new byte[]{(byte) 58, (byte) 32};
        l = new byte[]{(byte) 13, (byte) 10};
        byte b2 = (byte) 45;
        m = new byte[]{b2, b2};
    }

    public jy3(t80 boundaryByteString, ls3 type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.c = boundaryByteString;
        this.d = type;
        this.e = parts;
        this.a = ls3.g.a(type + "; boundary=" + a());
        this.b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long b(z70 z70Var, boolean z) throws EOFException {
        u70 u70Var;
        if (z) {
            z70Var = new u70();
            u70Var = z70Var;
        } else {
            u70Var = 0;
        }
        int size = this.e.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = (c) this.e.get(i2);
            pl2 pl2VarB = cVar.b();
            lc5 lc5VarA = cVar.a();
            Intrinsics.checkNotNull(z70Var);
            z70Var.O(m);
            z70Var.h0(this.c);
            z70Var.O(l);
            if (pl2VarB != null) {
                int size2 = pl2VarB.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    z70Var.l0(pl2VarB.m(i3)).O(k).l0(pl2VarB.u(i3)).O(l);
                }
            }
            ls3 ls3VarContentType = lc5VarA.contentType();
            if (ls3VarContentType != null) {
                z70Var.l0("Content-Type: ").l0(ls3VarContentType.toString()).O(l);
            }
            long jContentLength = lc5VarA.contentLength();
            if (jContentLength != -1) {
                z70Var.l0("Content-Length: ").n0(jContentLength).O(l);
            } else if (z) {
                Intrinsics.checkNotNull(u70Var);
                u70Var.d();
                return -1L;
            }
            byte[] bArr = l;
            z70Var.O(bArr);
            if (z) {
                j2 += jContentLength;
            } else {
                lc5VarA.writeTo(z70Var);
            }
            z70Var.O(bArr);
        }
        Intrinsics.checkNotNull(z70Var);
        byte[] bArr2 = m;
        z70Var.O(bArr2);
        z70Var.h0(this.c);
        z70Var.O(bArr2);
        z70Var.O(l);
        if (!z) {
            return j2;
        }
        Intrinsics.checkNotNull(u70Var);
        long jL0 = j2 + u70Var.L0();
        u70Var.d();
        return jL0;
    }

    public final String a() {
        return this.c.w();
    }

    @Override // com.zepto.lc5
    public long contentLength() throws EOFException {
        long j2 = this.b;
        if (j2 != -1) {
            return j2;
        }
        long jB = b(null, true);
        this.b = jB;
        return jB;
    }

    @Override // com.zepto.lc5
    public ls3 contentType() {
        return this.a;
    }

    @Override // com.zepto.lc5
    public void writeTo(z70 sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b(sink, false);
    }
}
