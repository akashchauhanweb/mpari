package com.zepto;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v42 {
    public static final b b = new b(null);
    public static final v42 a = new a();

    public static final class a extends v42 {
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface c {
        v42 a(da0 da0Var);
    }

    public void A(da0 call, ld5 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void B(da0 call, gl2 gl2Var) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void C(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void a(da0 call, ld5 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void b(da0 call, ld5 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void c(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void d(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void e(da0 call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void f(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void g(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void h(da0 call, InetSocketAddress inetSocketAddress, Proxy proxy, kx4 kx4Var) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void i(da0 call, InetSocketAddress inetSocketAddress, Proxy proxy, kx4 kx4Var, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void j(da0 call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void k(da0 call, iw0 connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void l(da0 call, iw0 connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void m(da0 call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void n(da0 call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void o(da0 call, ds2 url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void p(da0 call, ds2 url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void q(da0 call, long j) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void r(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void s(da0 call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void t(da0 call, kc5 request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void u(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void v(da0 call, long j) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void w(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void x(da0 call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void y(da0 call, ld5 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void z(da0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
