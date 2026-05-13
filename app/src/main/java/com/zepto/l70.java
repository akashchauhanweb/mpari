package com.zepto;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class l70 extends is4 {
    public static final boolean e;
    public static final a f;
    public final Provider d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l70 a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b()) {
                return new l70(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean b() {
            return l70.e;
        }
    }

    static {
        a aVar = new a(null);
        f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        e = z;
    }

    public l70() {
        this.d = new BouncyCastleJsseProvider();
    }

    @Override // com.zepto.is4
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!(sslSocket instanceof BCSSLSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
        BCSSLParameters sslParameters = bCSSLSocket.getParameters();
        List listB = is4.c.b(protocols);
        Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
        Object[] array = listB.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sslParameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(sslParameters);
    }

    @Override // com.zepto.is4
    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!(sslSocket instanceof BCSSLSocket)) {
            return super.h(sslSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.zepto.is4
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // com.zepto.is4
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        factory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public /* synthetic */ l70(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
