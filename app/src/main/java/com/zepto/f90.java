package com.zepto;

import com.zepto.gk1;
import com.zepto.is4;
import com.zepto.kc5;
import com.zepto.ld5;
import com.zepto.pl2;
import com.zepto.t80;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class f90 implements Closeable, Flushable {
    public static final c j = new c(null);
    public final gk1 c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public static final class a extends nd5 {
        public final a80 c;
        public final gk1.d e;
        public final String f;
        public final String g;

        /* JADX INFO: renamed from: com.zepto.f90$a$a, reason: collision with other inner class name */
        public static final class C0083a extends pf2 {
            public final /* synthetic */ y46 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0083a(y46 y46Var, y46 y46Var2) {
                super(y46Var2);
                this.e = y46Var;
            }

            @Override // com.zepto.pf2, com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.e().close();
                super.close();
            }
        }

        public a(gk1.d snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.e = snapshot;
            this.f = str;
            this.g = str2;
            y46 y46VarE = snapshot.e(1);
            this.c = zf4.d(new C0083a(y46VarE, y46VarE));
        }

        @Override // com.zepto.nd5
        public long contentLength() {
            String str = this.g;
            if (str != null) {
                return et6.R(str, -1L);
            }
            return -1L;
        }

        @Override // com.zepto.nd5
        public ls3 contentType() {
            String str = this.f;
            if (str != null) {
                return ls3.g.b(str);
            }
            return null;
        }

        public final gk1.d e() {
            return this.e;
        }

        @Override // com.zepto.nd5
        public a80 source() {
            return this.c;
        }
    }

    public final class b implements p90 {
        public final d36 a;
        public final d36 b;
        public boolean c;
        public final gk1.b d;
        public final /* synthetic */ f90 e;

        public static final class a extends of2 {
            public a(d36 d36Var) {
                super(d36Var);
            }

            @Override // com.zepto.of2, com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (b.this.e) {
                    if (b.this.d()) {
                        return;
                    }
                    b.this.e(true);
                    f90 f90Var = b.this.e;
                    f90Var.D(f90Var.m() + 1);
                    super.close();
                    b.this.d.b();
                }
            }
        }

        public b(f90 f90Var, gk1.b editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.e = f90Var;
            this.d = editor;
            d36 d36VarF = editor.f(1);
            this.a = d36VarF;
            this.b = new a(d36VarF);
        }

        @Override // com.zepto.p90
        public d36 a() {
            return this.b;
        }

        @Override // com.zepto.p90
        public void b() {
            synchronized (this.e) {
                if (this.c) {
                    return;
                }
                this.c = true;
                f90 f90Var = this.e;
                f90Var.B(f90Var.j() + 1);
                et6.j(this.a);
                try {
                    this.d.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean d() {
            return this.c;
        }

        public final void e(boolean z) {
            this.c = z;
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(ld5 hasVaryAll) {
            Intrinsics.checkNotNullParameter(hasVaryAll, "$this$hasVaryAll");
            return d(hasVaryAll.U()).contains("*");
        }

        public final String b(ds2 url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return t80.h.d(url.toString()).m().j();
        }

        public final int c(a80 source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long jS = source.S();
                String strE = source.E();
                if (jS >= 0 && jS <= IntCompanionObject.MAX_VALUE && strE.length() <= 0) {
                    return (int) jS;
                }
                throw new IOException("expected an int but was \"" + jS + strE + Typography.quote);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Set d(pl2 pl2Var) {
            int size = pl2Var.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (StringsKt__StringsJVMKt.equals("Vary", pl2Var.m(i), true)) {
                    String strU = pl2Var.u(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    for (String str : StringsKt__StringsKt.split$default((CharSequence) strU, new char[]{','}, false, 0, 6, (Object) null)) {
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        treeSet.add(StringsKt__StringsKt.trim((CharSequence) str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : SetsKt__SetsKt.emptySet();
        }

        public final pl2 e(pl2 pl2Var, pl2 pl2Var2) {
            Set setD = d(pl2Var2);
            if (setD.isEmpty()) {
                return et6.b;
            }
            pl2.a aVar = new pl2.a();
            int size = pl2Var.size();
            for (int i = 0; i < size; i++) {
                String strM = pl2Var.m(i);
                if (setD.contains(strM)) {
                    aVar.a(strM, pl2Var.u(i));
                }
            }
            return aVar.e();
        }

        public final pl2 f(ld5 varyHeaders) {
            Intrinsics.checkNotNullParameter(varyHeaders, "$this$varyHeaders");
            ld5 ld5VarK0 = varyHeaders.k0();
            Intrinsics.checkNotNull(ld5VarK0);
            return e(ld5VarK0.z0().e(), varyHeaders.U());
        }

        public final boolean g(ld5 cachedResponse, pl2 cachedRequest, kc5 newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.U());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!Intrinsics.areEqual(cachedRequest.w(str), newRequest.f(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    public f90(File directory, long j2, tb2 fileSystem) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.c = new gk1(fileSystem, directory, 201105, 2, j2, cd6.h);
    }

    public final void B(int i) {
        this.f = i;
    }

    public final void D(int i) {
        this.e = i;
    }

    public final synchronized void P() {
        this.h++;
    }

    public final synchronized void U(q90 cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.i++;
            if (cacheStrategy.b() != null) {
                this.g++;
            } else if (cacheStrategy.a() != null) {
                this.h++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    public final void d(gk1.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final void d0(ld5 cached, ld5 network) {
        gk1.b bVarD;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        d dVar = new d(network);
        nd5 nd5VarD = cached.d();
        if (nd5VarD == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            bVarD = ((a) nd5VarD).e().d();
            if (bVarD != null) {
                try {
                    dVar.f(bVarD);
                    bVarD.b();
                } catch (IOException unused) {
                    d(bVarD);
                }
            }
        } catch (IOException unused2) {
            bVarD = null;
        }
    }

    public final ld5 e(kc5 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            gk1.d dVarM0 = this.c.m0(j.b(request.k()));
            if (dVarM0 != null) {
                try {
                    d dVar = new d(dVarM0.e(0));
                    ld5 ld5VarD = dVar.d(dVarM0);
                    if (dVar.b(request, ld5VarD)) {
                        return ld5VarD;
                    }
                    nd5 nd5VarD = ld5VarD.d();
                    if (nd5VarD != null) {
                        et6.j(nd5VarD);
                    }
                    return null;
                } catch (IOException unused) {
                    et6.j(dVarM0);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Flushable
    public void flush() {
        this.c.flush();
    }

    public final int j() {
        return this.f;
    }

    public final int m() {
        return this.e;
    }

    public final p90 n(ld5 response) {
        gk1.b bVarK0;
        Intrinsics.checkNotNullParameter(response, "response");
        String strH = response.z0().h();
        if (as2.a.a(response.z0().h())) {
            try {
                w(response.z0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(strH, "GET")) {
            return null;
        }
        c cVar = j;
        if (cVar.a(response)) {
            return null;
        }
        d dVar = new d(response);
        try {
            bVarK0 = gk1.k0(this.c, cVar.b(response.z0().k()), 0L, 2, null);
            if (bVarK0 == null) {
                return null;
            }
            try {
                dVar.f(bVarK0);
                return new b(this, bVarK0);
            } catch (IOException unused2) {
                d(bVarK0);
                return null;
            }
        } catch (IOException unused3) {
            bVarK0 = null;
        }
    }

    public final void w(kc5 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.c.H0(j.b(request.k()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f90(File directory, long j2) {
        this(directory, j2, tb2.a);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    public static final class d {
        public static final String k;
        public static final String l;
        public static final a m = new a(null);
        public final String a;
        public final pl2 b;
        public final String c;
        public final kx4 d;
        public final int e;
        public final String f;
        public final pl2 g;
        public final gl2 h;
        public final long i;
        public final long j;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            is4.a aVar = is4.c;
            sb.append(aVar.g().g());
            sb.append("-Sent-Millis");
            k = sb.toString();
            l = aVar.g().g() + "-Received-Millis";
        }

        public d(y46 rawSource) {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                a80 a80VarD = zf4.d(rawSource);
                this.a = a80VarD.E();
                this.c = a80VarD.E();
                pl2.a aVar = new pl2.a();
                int iC = f90.j.c(a80VarD);
                for (int i = 0; i < iC; i++) {
                    aVar.c(a80VarD.E());
                }
                this.b = aVar.e();
                j76 j76VarA = j76.d.a(a80VarD.E());
                this.d = j76VarA.a;
                this.e = j76VarA.b;
                this.f = j76VarA.c;
                pl2.a aVar2 = new pl2.a();
                int iC2 = f90.j.c(a80VarD);
                for (int i2 = 0; i2 < iC2; i2++) {
                    aVar2.c(a80VarD.E());
                }
                String str = k;
                String strF = aVar2.f(str);
                String str2 = l;
                String strF2 = aVar2.f(str2);
                aVar2.h(str);
                aVar2.h(str2);
                this.i = strF != null ? Long.parseLong(strF) : 0L;
                this.j = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.g = aVar2.e();
                if (a()) {
                    String strE = a80VarD.E();
                    if (strE.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strE + Typography.quote);
                    }
                    this.h = gl2.e.a(!a80VarD.I() ? ng6.k.a(a80VarD.E()) : ng6.SSL_3_0, nk0.s1.b(a80VarD.E()), c(a80VarD), c(a80VarD));
                } else {
                    this.h = null;
                }
                rawSource.close();
            } catch (Throwable th) {
                rawSource.close();
                throw th;
            }
        }

        public final boolean a() {
            return StringsKt__StringsJVMKt.startsWith$default(this.a, "https://", false, 2, null);
        }

        public final boolean b(kc5 request, ld5 response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.areEqual(this.a, request.k().toString()) && Intrinsics.areEqual(this.c, request.h()) && f90.j.g(response, this.b, request);
        }

        public final List c(a80 a80Var) throws IOException {
            int iC = f90.j.c(a80Var);
            if (iC == -1) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i = 0; i < iC; i++) {
                    String strE = a80Var.E();
                    u70 u70Var = new u70();
                    t80 t80VarA = t80.h.a(strE);
                    Intrinsics.checkNotNull(t80VarA);
                    u70Var.h0(t80VarA);
                    arrayList.add(certificateFactory.generateCertificate(u70Var.u0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final ld5 d(gk1.d snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String strJ = this.g.j(xr2.HEADER_CONTENT_TYPE);
            String strJ2 = this.g.j("Content-Length");
            return new ld5.a().r(new kc5.a().j(this.a).f(this.c, null).e(this.b).b()).p(this.d).g(this.e).m(this.f).k(this.g).b(new a(snapshot, strJ, strJ2)).i(this.h).s(this.i).q(this.j).c();
        }

        public final void e(z70 z70Var, List list) throws IOException {
            try {
                z70Var.n0(list.size()).J(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] bytes = ((Certificate) list.get(i)).getEncoded();
                    t80.a aVar = t80.h;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    z70Var.l0(t80.a.f(aVar, bytes, 0, 0, 3, null).a()).J(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void f(gk1.b editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            z70 z70VarC = zf4.c(editor.f(0));
            try {
                z70VarC.l0(this.a).J(10);
                z70VarC.l0(this.c).J(10);
                z70VarC.n0(this.b.size()).J(10);
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    z70VarC.l0(this.b.m(i)).l0(": ").l0(this.b.u(i)).J(10);
                }
                z70VarC.l0(new j76(this.d, this.e, this.f).toString()).J(10);
                z70VarC.n0(this.g.size() + 2).J(10);
                int size2 = this.g.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    z70VarC.l0(this.g.m(i2)).l0(": ").l0(this.g.u(i2)).J(10);
                }
                z70VarC.l0(k).l0(": ").n0(this.i).J(10);
                z70VarC.l0(l).l0(": ").n0(this.j).J(10);
                if (a()) {
                    z70VarC.J(10);
                    gl2 gl2Var = this.h;
                    Intrinsics.checkNotNull(gl2Var);
                    z70VarC.l0(gl2Var.a().c()).J(10);
                    e(z70VarC, this.h.d());
                    e(z70VarC, this.h.c());
                    z70VarC.l0(this.h.e().a()).J(10);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(z70VarC, null);
            } finally {
            }
        }

        public d(ld5 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.a = response.z0().k().toString();
            this.b = f90.j.f(response);
            this.c = response.z0().h();
            this.d = response.x0();
            this.e = response.n();
            this.f = response.e0();
            this.g = response.U();
            this.h = response.B();
            this.i = response.A0();
            this.j = response.y0();
        }
    }
}
