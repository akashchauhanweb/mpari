package com.zepto;

import com.zepto.ds2;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wj {
    public final ds2 a;
    public final List b;
    public final List c;
    public final rs1 d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final vb0 h;
    public final xz i;
    public final Proxy j;
    public final ProxySelector k;

    public wj(String uriHost, int i, rs1 dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, vb0 vb0Var, xz proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.d = dns;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = vb0Var;
        this.i = proxyAuthenticator;
        this.j = proxy;
        this.k = proxySelector;
        this.a = new ds2.a().q(sSLSocketFactory != null ? "https" : "http").g(uriHost).m(i).c();
        this.b = et6.P(protocols);
        this.c = et6.P(connectionSpecs);
    }

    public final vb0 a() {
        return this.h;
    }

    public final List b() {
        return this.c;
    }

    public final rs1 c() {
        return this.d;
    }

    public final boolean d(wj that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.d, that.d) && Intrinsics.areEqual(this.i, that.i) && Intrinsics.areEqual(this.b, that.b) && Intrinsics.areEqual(this.c, that.c) && Intrinsics.areEqual(this.k, that.k) && Intrinsics.areEqual(this.j, that.j) && Intrinsics.areEqual(this.f, that.f) && Intrinsics.areEqual(this.g, that.g) && Intrinsics.areEqual(this.h, that.h) && this.a.n() == that.a.n();
    }

    public final HostnameVerifier e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof wj) {
            wj wjVar = (wj) obj;
            if (Intrinsics.areEqual(this.a, wjVar.a) && d(wjVar)) {
                return true;
            }
        }
        return false;
    }

    public final List f() {
        return this.b;
    }

    public final Proxy g() {
        return this.j;
    }

    public final xz h() {
        return this.i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.i.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.k.hashCode()) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.h);
    }

    public final ProxySelector i() {
        return this.k;
    }

    public final SocketFactory j() {
        return this.e;
    }

    public final SSLSocketFactory k() {
        return this.f;
    }

    public final ds2 l() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.a.i());
        sb2.append(':');
        sb2.append(this.a.n());
        sb2.append(", ");
        if (this.j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.k;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
