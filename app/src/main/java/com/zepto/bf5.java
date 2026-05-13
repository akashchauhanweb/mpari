package com.zepto;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bf5 {
    public final wj a;
    public final Proxy b;
    public final InetSocketAddress c;

    public bf5(wj address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.a = address;
        this.b = proxy;
        this.c = socketAddress;
    }

    public final wj a() {
        return this.a;
    }

    public final Proxy b() {
        return this.b;
    }

    public final boolean c() {
        return this.a.k() != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bf5) {
            bf5 bf5Var = (bf5) obj;
            if (Intrinsics.areEqual(bf5Var.a, this.a) && Intrinsics.areEqual(bf5Var.b, this.b) && Intrinsics.areEqual(bf5Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Route{" + this.c + '}';
    }
}
