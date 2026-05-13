package com.zepto;

import com.zepto.wg1;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class o70 implements f46 {
    public static final b b = new b(null);
    public static final wg1.a a = new a();

    public static final class a implements wg1.a {
        @Override // com.zepto.wg1.a
        public boolean a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return l70.f.b() && (sslSocket instanceof BCSSLSocket);
        }

        @Override // com.zepto.wg1.a
        public f46 b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new o70();
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wg1.a a() {
            return o70.a;
        }
    }

    @Override // com.zepto.f46
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // com.zepto.f46
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.zepto.f46
    public boolean c() {
        return l70.f.b();
    }

    @Override // com.zepto.f46
    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters sslParameters = bCSSLSocket.getParameters();
            Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
            Object[] array = is4.c.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sslParameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(sslParameters);
        }
    }
}
