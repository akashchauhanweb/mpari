package com.zepto;

import com.zepto.kc5;
import com.zepto.ld5;
import com.zepto.v03;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class q70 implements v03 {
    public final lz0 a;

    public q70(lz0 cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.a = cookieJar;
    }

    @Override // com.zepto.v03
    public ld5 a(v03.a chain) {
        nd5 nd5VarD;
        Intrinsics.checkNotNullParameter(chain, "chain");
        kc5 kc5VarRequest = chain.request();
        kc5.a aVarI = kc5VarRequest.i();
        lc5 lc5VarA = kc5VarRequest.a();
        if (lc5VarA != null) {
            ls3 ls3VarContentType = lc5VarA.contentType();
            if (ls3VarContentType != null) {
                aVarI.d(xr2.HEADER_CONTENT_TYPE, ls3VarContentType.toString());
            }
            long jContentLength = lc5VarA.contentLength();
            if (jContentLength != -1) {
                aVarI.d("Content-Length", String.valueOf(jContentLength));
                aVarI.g("Transfer-Encoding");
            } else {
                aVarI.d("Transfer-Encoding", "chunked");
                aVarI.g("Content-Length");
            }
        }
        boolean z = false;
        if (kc5VarRequest.d("Host") == null) {
            aVarI.d("Host", et6.O(kc5VarRequest.k(), false, 1, null));
        }
        if (kc5VarRequest.d("Connection") == null) {
            aVarI.d("Connection", "Keep-Alive");
        }
        if (kc5VarRequest.d("Accept-Encoding") == null && kc5VarRequest.d("Range") == null) {
            aVarI.d("Accept-Encoding", "gzip");
            z = true;
        }
        List listB = this.a.b(kc5VarRequest.k());
        if (!listB.isEmpty()) {
            aVarI.d("Cookie", b(listB));
        }
        if (kc5VarRequest.d("User-Agent") == null) {
            aVarI.d("User-Agent", "okhttp/4.9.2");
        }
        ld5 ld5VarA = chain.a(aVarI.b());
        yr2.f(this.a, kc5VarRequest.k(), ld5VarA.U());
        ld5.a aVarR = ld5VarA.m0().r(kc5VarRequest);
        if (z && StringsKt__StringsJVMKt.equals("gzip", ld5.P(ld5VarA, "Content-Encoding", null, 2, null), true) && yr2.b(ld5VarA) && (nd5VarD = ld5VarA.d()) != null) {
            uk2 uk2Var = new uk2(nd5VarD.source());
            aVarR.k(ld5VarA.U().n().h("Content-Encoding").h("Content-Length").e());
            aVarR.b(new o55(ld5.P(ld5VarA, xr2.HEADER_CONTENT_TYPE, null, 2, null), -1L, zf4.d(uk2Var)));
        }
        return aVarR.c();
    }

    public final String b(List list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            kz0 kz0Var = (kz0) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(kz0Var.e());
            sb.append('=');
            sb.append(kz0Var.g());
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
