package com.zepto;

import com.zepto.v03;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zr2 implements v03 {
    public volatile Set a;
    public volatile a b;
    public final b c;

    public enum a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface b {
        public static final a b = new a(null);
        public static final b a = new a.C0133a();

        public static final class a {

            /* JADX INFO: renamed from: com.zepto.zr2$b$a$a, reason: collision with other inner class name */
            public static final class C0133a implements b {
                @Override // com.zepto.zr2.b
                public void a(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    is4.l(is4.c.g(), message, 0, null, 6, null);
                }
            }

            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        void a(String str);
    }

    public zr2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.zepto.v03
    public ld5 a(v03.a chain) throws Exception {
        String str;
        char c;
        String string;
        Charset UTF_8;
        Charset UTF_82;
        Intrinsics.checkNotNullParameter(chain, "chain");
        a aVar = this.b;
        kc5 kc5VarRequest = chain.request();
        if (aVar == a.NONE) {
            return chain.a(kc5VarRequest);
        }
        boolean z = aVar == a.BODY;
        boolean z2 = z || aVar == a.HEADERS;
        lc5 lc5VarA = kc5VarRequest.a();
        iw0 iw0VarB = chain.b();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(kc5VarRequest.h());
        sb.append(' ');
        sb.append(kc5VarRequest.k());
        sb.append(iw0VarB != null ? " " + iw0VarB.a() : "");
        String string2 = sb.toString();
        if (!z2 && lc5VarA != null) {
            string2 = string2 + " (" + lc5VarA.contentLength() + "-byte body)";
        }
        this.c.a(string2);
        if (z2) {
            pl2 pl2VarE = kc5VarRequest.e();
            if (lc5VarA != null) {
                ls3 ls3VarContentType = lc5VarA.contentType();
                if (ls3VarContentType != null && pl2VarE.j(xr2.HEADER_CONTENT_TYPE) == null) {
                    this.c.a("Content-Type: " + ls3VarContentType);
                }
                if (lc5VarA.contentLength() != -1 && pl2VarE.j("Content-Length") == null) {
                    this.c.a("Content-Length: " + lc5VarA.contentLength());
                }
            }
            int size = pl2VarE.size();
            for (int i = 0; i < size; i++) {
                c(pl2VarE, i);
            }
            if (!z || lc5VarA == null) {
                this.c.a("--> END " + kc5VarRequest.h());
            } else if (b(kc5VarRequest.e())) {
                this.c.a("--> END " + kc5VarRequest.h() + " (encoded body omitted)");
            } else if (lc5VarA.isDuplex()) {
                this.c.a("--> END " + kc5VarRequest.h() + " (duplex request body omitted)");
            } else if (lc5VarA.isOneShot()) {
                this.c.a("--> END " + kc5VarRequest.h() + " (one-shot body omitted)");
            } else {
                u70 u70Var = new u70();
                lc5VarA.writeTo(u70Var);
                ls3 ls3VarContentType2 = lc5VarA.contentType();
                if (ls3VarContentType2 == null || (UTF_82 = ls3VarContentType2.c(StandardCharsets.UTF_8)) == null) {
                    UTF_82 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
                }
                this.c.a("");
                if (ct6.a(u70Var)) {
                    this.c.a(u70Var.t0(UTF_82));
                    this.c.a("--> END " + kc5VarRequest.h() + " (" + lc5VarA.contentLength() + "-byte body)");
                } else {
                    this.c.a("--> END " + kc5VarRequest.h() + " (binary " + lc5VarA.contentLength() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            ld5 ld5VarA = chain.a(kc5VarRequest);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            nd5 nd5VarD = ld5VarA.d();
            Intrinsics.checkNotNull(nd5VarD);
            long jContentLength = nd5VarD.contentLength();
            String str2 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            b bVar = this.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(ld5VarA.n());
            if (ld5VarA.e0().length() == 0) {
                str = "-byte body omitted)";
                string = "";
                c = ' ';
            } else {
                String strE0 = ld5VarA.e0();
                StringBuilder sb3 = new StringBuilder();
                str = "-byte body omitted)";
                c = ' ';
                sb3.append(String.valueOf(' '));
                sb3.append(strE0);
                string = sb3.toString();
            }
            sb2.append(string);
            sb2.append(c);
            sb2.append(ld5VarA.z0().k());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z2 ? "" : ", " + str2 + " body");
            sb2.append(')');
            bVar.a(sb2.toString());
            if (z2) {
                pl2 pl2VarU = ld5VarA.U();
                int size2 = pl2VarU.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c(pl2VarU, i2);
                }
                if (!z || !yr2.b(ld5VarA)) {
                    this.c.a("<-- END HTTP");
                } else if (b(ld5VarA.U())) {
                    this.c.a("<-- END HTTP (encoded body omitted)");
                } else {
                    a80 a80VarSource = nd5VarD.source();
                    a80VarSource.u(LongCompanionObject.MAX_VALUE);
                    u70 u70VarC = a80VarSource.c();
                    Long l = null;
                    if (StringsKt__StringsJVMKt.equals("gzip", pl2VarU.j("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(u70VarC.L0());
                        uk2 uk2Var = new uk2(u70VarC.clone());
                        try {
                            u70VarC = new u70();
                            u70VarC.H(uk2Var);
                            CloseableKt.closeFinally(uk2Var, null);
                            l = lValueOf;
                        } finally {
                        }
                    }
                    ls3 ls3VarContentType3 = nd5VarD.contentType();
                    if (ls3VarContentType3 == null || (UTF_8 = ls3VarContentType3.c(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    }
                    if (!ct6.a(u70VarC)) {
                        this.c.a("");
                        this.c.a("<-- END HTTP (binary " + u70VarC.L0() + str);
                        return ld5VarA;
                    }
                    if (jContentLength != 0) {
                        this.c.a("");
                        this.c.a(u70VarC.clone().t0(UTF_8));
                    }
                    if (l != null) {
                        this.c.a("<-- END HTTP (" + u70VarC.L0() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.c.a("<-- END HTTP (" + u70VarC.L0() + "-byte body)");
                    }
                }
            }
            return ld5VarA;
        } catch (Exception e) {
            this.c.a("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public final boolean b(pl2 pl2Var) {
        String strJ = pl2Var.j("Content-Encoding");
        return (strJ == null || StringsKt__StringsJVMKt.equals(strJ, "identity", true) || StringsKt__StringsJVMKt.equals(strJ, "gzip", true)) ? false : true;
    }

    public final void c(pl2 pl2Var, int i) {
        String strU = this.a.contains(pl2Var.m(i)) ? "██" : pl2Var.u(i);
        this.c.a(pl2Var.m(i) + ": " + strU);
    }

    public final zr2 d(a level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.b = level;
        return this;
    }

    public zr2(b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.c = logger;
        this.a = SetsKt__SetsKt.emptySet();
        this.b = a.NONE;
    }

    public /* synthetic */ zr2(b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b.a : bVar);
    }
}
