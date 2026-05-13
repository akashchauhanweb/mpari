package com.zepto;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wg1 implements f46 {
    public f46 a;
    public final a b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        f46 b(SSLSocket sSLSocket);
    }

    public wg1(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.b = socketAdapterFactory;
    }

    @Override // com.zepto.f46
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.b.a(sslSocket);
    }

    @Override // com.zepto.f46
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        f46 f46VarE = e(sslSocket);
        if (f46VarE != null) {
            return f46VarE.b(sslSocket);
        }
        return null;
    }

    @Override // com.zepto.f46
    public boolean c() {
        return true;
    }

    @Override // com.zepto.f46
    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        f46 f46VarE = e(sslSocket);
        if (f46VarE != null) {
            f46VarE.d(sslSocket, str, protocols);
        }
    }

    public final synchronized f46 e(SSLSocket sSLSocket) {
        try {
            if (this.a == null && this.b.a(sSLSocket)) {
                this.a = this.b.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
