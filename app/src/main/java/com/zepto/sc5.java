package com.zepto;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sc5 {
    public static final sc5 a = new sc5();

    public final String a(kc5 request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.h());
        sb.append(' ');
        sc5 sc5Var = a;
        if (sc5Var.b(request, proxyType)) {
            sb.append(request.k());
        } else {
            sb.append(sc5Var.c(request.k()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean b(kc5 kc5Var, Proxy.Type type) {
        return !kc5Var.g() && type == Proxy.Type.HTTP;
    }

    public final String c(ds2 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
