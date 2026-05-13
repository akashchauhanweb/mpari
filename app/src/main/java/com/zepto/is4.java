package com.zepto;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class is4 {
    public static volatile is4 a;
    public static final Logger b;
    public static final a c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((kx4) obj) != kx4.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kx4) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            u70 u70Var = new u70();
            for (String str : b(protocols)) {
                u70Var.J(str.length());
                u70Var.l0(str);
            }
            return u70Var.G();
        }

        public final is4 d() {
            fp.c.b();
            is4 is4VarA = to.f.a();
            if (is4VarA != null) {
                return is4VarA;
            }
            is4 is4VarA2 = jp.g.a();
            Intrinsics.checkNotNull(is4VarA2);
            return is4VarA2;
        }

        public final is4 e() {
            kh4 kh4VarA;
            l70 l70VarA;
            tw0 tw0VarB;
            if (j() && (tw0VarB = tw0.f.b()) != null) {
                return tw0VarB;
            }
            if (i() && (l70VarA = l70.f.a()) != null) {
                return l70VarA;
            }
            if (k() && (kh4VarA = kh4.f.a()) != null) {
                return kh4VarA;
            }
            d43 d43VarA = d43.e.a();
            if (d43VarA != null) {
                return d43VarA;
            }
            is4 is4VarA = a43.i.a();
            return is4VarA != null ? is4VarA : new is4();
        }

        public final is4 f() {
            return h() ? d() : e();
        }

        public final is4 g() {
            return is4.a;
        }

        public final boolean h() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            Provider provider = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return Intrinsics.areEqual("BC", provider.getName());
        }

        public final boolean j() {
            Provider provider = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return Intrinsics.areEqual("Conscrypt", provider.getName());
        }

        public final boolean k() {
            Provider provider = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return Intrinsics.areEqual("OpenJSSE", provider.getName());
        }
    }

    static {
        a aVar = new a(null);
        c = aVar;
        a = aVar.f();
        b = Logger.getLogger(yf4.class.getName());
    }

    public static /* synthetic */ void l(is4 is4Var, String str, int i, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        is4Var.k(str, i, th);
    }

    public void b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public ub0 c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new b50(d(trustManager));
    }

    public ho6 d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new g50((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void k(String message, int i, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void m(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
