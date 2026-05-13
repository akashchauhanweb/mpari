package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.ld5;
import com.zepto.pl2;
import com.zepto.q90;
import com.zepto.v03;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m90 implements v03 {
    public static final a b = new a(null);
    public final f90 a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pl2 c(pl2 pl2Var, pl2 pl2Var2) {
            pl2.a aVar = new pl2.a();
            int size = pl2Var.size();
            for (int i = 0; i < size; i++) {
                String strM = pl2Var.m(i);
                String strU = pl2Var.u(i);
                if ((!StringsKt__StringsJVMKt.equals("Warning", strM, true) || !StringsKt__StringsJVMKt.startsWith$default(strU, VContant.MAINSCREEN, false, 2, null)) && (d(strM) || !e(strM) || pl2Var2.j(strM) == null)) {
                    aVar.d(strM, strU);
                }
            }
            int size2 = pl2Var2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strM2 = pl2Var2.m(i2);
                if (!d(strM2) && e(strM2)) {
                    aVar.d(strM2, pl2Var2.u(i2));
                }
            }
            return aVar.e();
        }

        public final boolean d(String str) {
            return StringsKt__StringsJVMKt.equals("Content-Length", str, true) || StringsKt__StringsJVMKt.equals("Content-Encoding", str, true) || StringsKt__StringsJVMKt.equals(xr2.HEADER_CONTENT_TYPE, str, true);
        }

        public final boolean e(String str) {
            return (StringsKt__StringsJVMKt.equals("Connection", str, true) || StringsKt__StringsJVMKt.equals("Keep-Alive", str, true) || StringsKt__StringsJVMKt.equals("Proxy-Authenticate", str, true) || StringsKt__StringsJVMKt.equals("Proxy-Authorization", str, true) || StringsKt__StringsJVMKt.equals("TE", str, true) || StringsKt__StringsJVMKt.equals("Trailers", str, true) || StringsKt__StringsJVMKt.equals("Transfer-Encoding", str, true) || StringsKt__StringsJVMKt.equals("Upgrade", str, true)) ? false : true;
        }

        public final ld5 f(ld5 ld5Var) {
            return (ld5Var != null ? ld5Var.d() : null) != null ? ld5Var.m0().b(null).c() : ld5Var;
        }
    }

    public static final class b implements y46 {
        public boolean c;
        public final /* synthetic */ a80 e;
        public final /* synthetic */ p90 f;
        public final /* synthetic */ z70 g;

        public b(a80 a80Var, p90 p90Var, z70 z70Var) {
            this.e = a80Var;
            this.f = p90Var;
            this.g = z70Var;
        }

        @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.c && !et6.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.c = true;
                this.f.b();
            }
            this.e.close();
        }

        @Override // com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                long j2 = this.e.read(sink, j);
                if (j2 != -1) {
                    sink.m0(this.g.c(), sink.L0() - j2, j2);
                    this.g.R();
                    return j2;
                }
                if (!this.c) {
                    this.c = true;
                    this.g.close();
                }
                return -1L;
            } catch (IOException e) {
                if (!this.c) {
                    this.c = true;
                    this.f.b();
                }
                throw e;
            }
        }

        @Override // com.zepto.y46
        public cg6 timeout() {
            return this.e.timeout();
        }
    }

    public m90(f90 f90Var) {
        this.a = f90Var;
    }

    @Override // com.zepto.v03
    public ld5 a(v03.a chain) {
        v42 v42VarO;
        nd5 nd5VarD;
        nd5 nd5VarD2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        da0 da0VarCall = chain.call();
        f90 f90Var = this.a;
        ld5 ld5VarE = f90Var != null ? f90Var.e(chain.request()) : null;
        q90 q90VarB = new q90.b(System.currentTimeMillis(), chain.request(), ld5VarE).b();
        kc5 kc5VarB = q90VarB.b();
        ld5 ld5VarA = q90VarB.a();
        f90 f90Var2 = this.a;
        if (f90Var2 != null) {
            f90Var2.U(q90VarB);
        }
        i55 i55Var = (i55) (da0VarCall instanceof i55 ? da0VarCall : null);
        if (i55Var == null || (v42VarO = i55Var.o()) == null) {
            v42VarO = v42.a;
        }
        if (ld5VarE != null && ld5VarA == null && (nd5VarD2 = ld5VarE.d()) != null) {
            et6.j(nd5VarD2);
        }
        if (kc5VarB == null && ld5VarA == null) {
            ld5 ld5VarC = new ld5.a().r(chain.request()).p(kx4.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(et6.c).s(-1L).q(System.currentTimeMillis()).c();
            v42VarO.A(da0VarCall, ld5VarC);
            return ld5VarC;
        }
        if (kc5VarB == null) {
            Intrinsics.checkNotNull(ld5VarA);
            ld5 ld5VarC2 = ld5VarA.m0().d(b.f(ld5VarA)).c();
            v42VarO.b(da0VarCall, ld5VarC2);
            return ld5VarC2;
        }
        if (ld5VarA != null) {
            v42VarO.a(da0VarCall, ld5VarA);
        } else if (this.a != null) {
            v42VarO.c(da0VarCall);
        }
        try {
            ld5 ld5VarA2 = chain.a(kc5VarB);
            if (ld5VarA2 == null && ld5VarE != null && nd5VarD != null) {
            }
            if (ld5VarA != null) {
                if (ld5VarA2 != null && ld5VarA2.n() == 304) {
                    ld5.a aVarM0 = ld5VarA.m0();
                    a aVar = b;
                    ld5 ld5VarC3 = aVarM0.k(aVar.c(ld5VarA.U(), ld5VarA2.U())).s(ld5VarA2.A0()).q(ld5VarA2.y0()).d(aVar.f(ld5VarA)).n(aVar.f(ld5VarA2)).c();
                    nd5 nd5VarD3 = ld5VarA2.d();
                    Intrinsics.checkNotNull(nd5VarD3);
                    nd5VarD3.close();
                    f90 f90Var3 = this.a;
                    Intrinsics.checkNotNull(f90Var3);
                    f90Var3.P();
                    this.a.d0(ld5VarA, ld5VarC3);
                    v42VarO.b(da0VarCall, ld5VarC3);
                    return ld5VarC3;
                }
                nd5 nd5VarD4 = ld5VarA.d();
                if (nd5VarD4 != null) {
                    et6.j(nd5VarD4);
                }
            }
            Intrinsics.checkNotNull(ld5VarA2);
            ld5.a aVarM02 = ld5VarA2.m0();
            a aVar2 = b;
            ld5 ld5VarC4 = aVarM02.d(aVar2.f(ld5VarA)).n(aVar2.f(ld5VarA2)).c();
            if (this.a != null) {
                if (yr2.b(ld5VarC4) && q90.c.a(ld5VarC4, kc5VarB)) {
                    ld5 ld5VarB = b(this.a.n(ld5VarC4), ld5VarC4);
                    if (ld5VarA != null) {
                        v42VarO.c(da0VarCall);
                    }
                    return ld5VarB;
                }
                if (as2.a.a(kc5VarB.h())) {
                    try {
                        this.a.w(kc5VarB);
                    } catch (IOException unused) {
                    }
                }
            }
            return ld5VarC4;
        } finally {
            if (ld5VarE != null && (nd5VarD = ld5VarE.d()) != null) {
                et6.j(nd5VarD);
            }
        }
    }

    public final ld5 b(p90 p90Var, ld5 ld5Var) {
        if (p90Var == null) {
            return ld5Var;
        }
        d36 d36VarA = p90Var.a();
        nd5 nd5VarD = ld5Var.d();
        Intrinsics.checkNotNull(nd5VarD);
        b bVar = new b(nd5VarD.source(), p90Var, zf4.c(d36VarA));
        return ld5Var.m0().b(new o55(ld5.P(ld5Var, xr2.HEADER_CONTENT_TYPE, null, 2, null), ld5Var.d().contentLength(), zf4.d(bVar))).c();
    }
}
