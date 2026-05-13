package com.zepto;

import com.zepto.ld5;
import com.zepto.pl2;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sr2 implements s52 {
    public volatile ur2 a;
    public final kx4 b;
    public volatile boolean c;
    public final j55 d;
    public final m55 e;
    public final rr2 f;
    public static final a i = new a(null);
    public static final List g = et6.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = et6.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(kc5 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            pl2 pl2VarE = request.e();
            ArrayList arrayList = new ArrayList(pl2VarE.size() + 4);
            arrayList.add(new ll2(ll2.f, request.h()));
            arrayList.add(new ll2(ll2.g, sc5.a.c(request.k())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new ll2(ll2.i, strD));
            }
            arrayList.add(new ll2(ll2.h, request.k().r()));
            int size = pl2VarE.size();
            for (int i = 0; i < size; i++) {
                String strM = pl2VarE.m(i);
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                if (strM == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = strM.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!sr2.g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(pl2VarE.u(i), "trailers"))) {
                    arrayList.add(new ll2(lowerCase, pl2VarE.u(i)));
                }
            }
            return arrayList;
        }

        public final ld5.a b(pl2 headerBlock, kx4 protocol) throws ProtocolException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            pl2.a aVar = new pl2.a();
            int size = headerBlock.size();
            j76 j76VarA = null;
            for (int i = 0; i < size; i++) {
                String strM = headerBlock.m(i);
                String strU = headerBlock.u(i);
                if (Intrinsics.areEqual(strM, ":status")) {
                    j76VarA = j76.d.a("HTTP/1.1 " + strU);
                } else if (!sr2.h.contains(strM)) {
                    aVar.d(strM, strU);
                }
            }
            if (j76VarA != null) {
                return new ld5.a().p(protocol).g(j76VarA.b).m(j76VarA.c).k(aVar.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public sr2(yf4 client, j55 connection, m55 chain, rr2 http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.d = connection;
        this.e = chain;
        this.f = http2Connection;
        List listZ = client.z();
        kx4 kx4Var = kx4.H2_PRIOR_KNOWLEDGE;
        this.b = listZ.contains(kx4Var) ? kx4Var : kx4.HTTP_2;
    }

    @Override // com.zepto.s52
    public long a(ld5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (yr2.b(response)) {
            return et6.s(response);
        }
        return 0L;
    }

    @Override // com.zepto.s52
    public void b() {
        ur2 ur2Var = this.a;
        Intrinsics.checkNotNull(ur2Var);
        ur2Var.n().close();
    }

    @Override // com.zepto.s52
    public void c() {
        this.f.flush();
    }

    @Override // com.zepto.s52
    public void cancel() {
        this.c = true;
        ur2 ur2Var = this.a;
        if (ur2Var != null) {
            ur2Var.f(y22.CANCEL);
        }
    }

    @Override // com.zepto.s52
    public d36 d(kc5 request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        ur2 ur2Var = this.a;
        Intrinsics.checkNotNull(ur2Var);
        return ur2Var.n();
    }

    @Override // com.zepto.s52
    public void e(kc5 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.a != null) {
            return;
        }
        this.a = this.f.P0(i.a(request), request.a() != null);
        if (this.c) {
            ur2 ur2Var = this.a;
            Intrinsics.checkNotNull(ur2Var);
            ur2Var.f(y22.CANCEL);
            throw new IOException("Canceled");
        }
        ur2 ur2Var2 = this.a;
        Intrinsics.checkNotNull(ur2Var2);
        cg6 cg6VarV = ur2Var2.v();
        long jH = this.e.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cg6VarV.g(jH, timeUnit);
        ur2 ur2Var3 = this.a;
        Intrinsics.checkNotNull(ur2Var3);
        ur2Var3.E().g(this.e.j(), timeUnit);
    }

    @Override // com.zepto.s52
    public y46 f(ld5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ur2 ur2Var = this.a;
        Intrinsics.checkNotNull(ur2Var);
        return ur2Var.p();
    }

    @Override // com.zepto.s52
    public ld5.a g(boolean z) throws ProtocolException {
        ur2 ur2Var = this.a;
        Intrinsics.checkNotNull(ur2Var);
        ld5.a aVarB = i.b(ur2Var.C(), this.b);
        if (z && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // com.zepto.s52
    public j55 h() {
        return this.d;
    }
}
