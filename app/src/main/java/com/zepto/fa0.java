package com.zepto;

import com.zepto.ld5;
import com.zepto.v03;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fa0 implements v03 {
    public final boolean a;

    public fa0(boolean z) {
        this.a = z;
    }

    @Override // com.zepto.v03
    public ld5 a(v03.a chain) throws ProtocolException {
        boolean z;
        ld5.a aVarP;
        Intrinsics.checkNotNullParameter(chain, "chain");
        m55 m55Var = (m55) chain;
        r52 r52VarG = m55Var.g();
        Intrinsics.checkNotNull(r52VarG);
        kc5 kc5VarI = m55Var.i();
        lc5 lc5VarA = kc5VarI.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r52VarG.t(kc5VarI);
        if (!as2.b(kc5VarI.h()) || lc5VarA == null) {
            r52VarG.n();
            z = true;
            aVarP = null;
        } else {
            if (StringsKt__StringsJVMKt.equals("100-continue", kc5VarI.d("Expect"), true)) {
                r52VarG.f();
                aVarP = r52VarG.p(true);
                r52VarG.r();
                z = false;
            } else {
                z = true;
                aVarP = null;
            }
            if (aVarP != null) {
                r52VarG.n();
                if (!r52VarG.h().w()) {
                    r52VarG.m();
                }
            } else if (lc5VarA.isDuplex()) {
                r52VarG.f();
                lc5VarA.writeTo(zf4.c(r52VarG.c(kc5VarI, true)));
            } else {
                z70 z70VarC = zf4.c(r52VarG.c(kc5VarI, false));
                lc5VarA.writeTo(z70VarC);
                z70VarC.close();
            }
        }
        if (lc5VarA == null || !lc5VarA.isDuplex()) {
            r52VarG.e();
        }
        if (aVarP == null) {
            aVarP = r52VarG.p(false);
            Intrinsics.checkNotNull(aVarP);
            if (z) {
                r52VarG.r();
                z = false;
            }
        }
        ld5 ld5VarC = aVarP.r(kc5VarI).i(r52VarG.h().s()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
        int iN = ld5VarC.n();
        if (iN == 100) {
            ld5.a aVarP2 = r52VarG.p(false);
            Intrinsics.checkNotNull(aVarP2);
            if (z) {
                r52VarG.r();
            }
            ld5VarC = aVarP2.r(kc5VarI).i(r52VarG.h().s()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
            iN = ld5VarC.n();
        }
        r52VarG.q(ld5VarC);
        ld5 ld5VarC2 = (this.a && iN == 101) ? ld5VarC.m0().b(et6.c).c() : ld5VarC.m0().b(r52VarG.o(ld5VarC)).c();
        if (StringsKt__StringsJVMKt.equals("close", ld5VarC2.z0().d("Connection"), true) || StringsKt__StringsJVMKt.equals("close", ld5.P(ld5VarC2, "Connection", null, 2, null), true)) {
            r52VarG.m();
        }
        if (iN == 204 || iN == 205) {
            nd5 nd5VarD = ld5VarC2.d();
            if ((nd5VarD != null ? nd5VarD.contentLength() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iN);
                sb.append(" had non-zero Content-Length: ");
                nd5 nd5VarD2 = ld5VarC2.d();
                sb.append(nd5VarD2 != null ? Long.valueOf(nd5VarD2.contentLength()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return ld5VarC2;
    }
}
