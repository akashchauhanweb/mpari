package com.zepto;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ef5 {
    public static final a i = new a(null);
    public List a;
    public int b;
    public List c;
    public final List d;
    public final wj e;
    public final cf5 f;
    public final da0 g;
    public final v42 h;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress socketHost) {
            Intrinsics.checkNotNullParameter(socketHost, "$this$socketHost");
            InetAddress address = socketHost.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = socketHost.getHostName();
            Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
            return hostName;
        }
    }

    public static final class b {
        public int a;
        public final List b;

        public b(List routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.b = routes;
        }

        public final List a() {
            return this.b;
        }

        public final boolean b() {
            return this.a < this.b.size();
        }

        public final bf5 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.b;
            int i = this.a;
            this.a = i + 1;
            return (bf5) list.get(i);
        }
    }

    public static final class c extends Lambda implements Function0 {
        public final /* synthetic */ Proxy e;
        public final /* synthetic */ ds2 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Proxy proxy, ds2 ds2Var) {
            super(0);
            this.e = proxy;
            this.f = ds2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Proxy proxy = this.e;
            if (proxy != null) {
                return CollectionsKt__CollectionsJVMKt.listOf(proxy);
            }
            URI uriS = this.f.s();
            if (uriS.getHost() == null) {
                return et6.t(Proxy.NO_PROXY);
            }
            List<Proxy> listSelect = ef5.this.e.i().select(uriS);
            List<Proxy> list = listSelect;
            return (list == null || list.isEmpty()) ? et6.t(Proxy.NO_PROXY) : et6.P(listSelect);
        }
    }

    public ef5(wj address, cf5 routeDatabase, da0 call, v42 eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.e = address;
        this.f = routeDatabase;
        this.g = call;
        this.h = eventListener;
        this.a = CollectionsKt__CollectionsKt.emptyList();
        this.c = CollectionsKt__CollectionsKt.emptyList();
        this.d = new ArrayList();
        g(address.l(), address.g());
    }

    public final boolean b() {
        return c() || (this.d.isEmpty() ^ true);
    }

    public final boolean c() {
        return this.b < this.a.size();
    }

    public final b d() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            Proxy proxyE = e();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                bf5 bf5Var = new bf5(this.e, proxyE, (InetSocketAddress) it.next());
                if (this.f.c(bf5Var)) {
                    this.d.add(bf5Var);
                } else {
                    arrayList.add(bf5Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.d);
            this.d.clear();
        }
        return new b(arrayList);
    }

    public final Proxy e() throws SocketException, UnknownHostException {
        if (c()) {
            List list = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            Proxy proxy = (Proxy) list.get(i2);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.e.l().i() + "; exhausted proxy configurations: " + this.a);
    }

    public final void f(Proxy proxy) throws SocketException, UnknownHostException {
        String strI;
        int iN;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strI = this.e.l().i();
            iN = this.e.l().n();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strI = i.a(inetSocketAddress);
            iN = inetSocketAddress.getPort();
        }
        if (1 > iN || 65535 < iN) {
            throw new SocketException("No route to " + strI + ':' + iN + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strI, iN));
            return;
        }
        this.h.n(this.g, strI);
        List listA = this.e.c().a(strI);
        if (listA.isEmpty()) {
            throw new UnknownHostException(this.e.c() + " returned no addresses for " + strI);
        }
        this.h.m(this.g, strI, listA);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iN));
        }
    }

    public final void g(ds2 ds2Var, Proxy proxy) {
        c cVar = new c(proxy, ds2Var);
        this.h.p(this.g, ds2Var);
        List listInvoke = cVar.invoke();
        this.a = listInvoke;
        this.b = 0;
        this.h.o(this.g, ds2Var, listInvoke);
    }
}
