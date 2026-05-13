package com.zepto;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class w33 implements xz {
    public final rs1 d;

    public w33(rs1 defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.d = defaultDns;
    }

    @Override // com.zepto.xz
    public kc5 a(bf5 bf5Var, ld5 response) {
        Proxy proxy;
        rs1 rs1VarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        wj wjVarA;
        Intrinsics.checkNotNullParameter(response, "response");
        List<xc0> listM = response.m();
        kc5 kc5VarZ0 = response.z0();
        ds2 ds2VarK = kc5VarZ0.k();
        boolean z = response.n() == 407;
        if (bf5Var == null || (proxy = bf5Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (xc0 xc0Var : listM) {
            if (StringsKt__StringsJVMKt.equals("Basic", xc0Var.c(), true)) {
                if (bf5Var == null || (wjVarA = bf5Var.a()) == null || (rs1VarC = wjVarA.c()) == null) {
                    rs1VarC = this.d;
                }
                if (z) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, ds2VarK, rs1VarC), inetSocketAddress.getPort(), ds2VarK.r(), xc0Var.b(), xc0Var.c(), ds2VarK.t(), Authenticator.RequestorType.PROXY);
                } else {
                    String strI = ds2VarK.i();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strI, b(proxy, ds2VarK, rs1VarC), ds2VarK.n(), ds2VarK.r(), xc0Var.b(), xc0Var.c(), ds2VarK.t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return kc5VarZ0.i().d(str, j31.a(userName, new String(password), xc0Var.a())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, ds2 ds2Var, rs1 rs1Var) {
        Proxy.Type type = proxy.type();
        if (type != null && v33.a[type.ordinal()] == 1) {
            return (InetAddress) CollectionsKt___CollectionsKt.first(rs1Var.a(ds2Var.i()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "(address() as InetSocketAddress).address");
        return address;
    }

    public /* synthetic */ w33(rs1 rs1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? rs1.a : rs1Var);
    }
}
