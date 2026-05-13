package com.zepto;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: loaded from: classes3.dex */
public final class tw0 extends is4 {
    public static final boolean e;
    public static final a f;
    public final Provider d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }

        public final tw0 b() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (c()) {
                return new tw0(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean c() {
            return tw0.e;
        }
    }

    public static final class b implements ConscryptHostnameVerifier {
        public static final b a = new b();
    }

    static {
        a aVar = new a(null);
        f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        e = z;
    }

    public tw0() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "Conscrypt.newProvider()");
        this.d = providerNewProvider;
    }

    @Override // com.zepto.is4
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = is4.c.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // com.zepto.is4
    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.h(sslSocket);
    }

    @Override // com.zepto.is4
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // com.zepto.is4
    public SSLSocketFactory o(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContextN = n();
        sSLContextN.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // com.zepto.is4
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.a);
            return x509TrustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public /* synthetic */ tw0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
