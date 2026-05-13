package com.zepto;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.zepto.l66;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jp extends is4 {
    public static final boolean f;
    public static final a g = new a(null);
    public final List d;
    public final yq0 e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final is4 a() {
            if (b()) {
                return new jp();
            }
            return null;
        }

        public final boolean b() {
            return jp.f;
        }
    }

    public static final class b implements ho6 {
        public final X509TrustManager a;
        public final Method b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.a = trustManager;
            this.b = findByIssuerAndSignatureMethod;
        }

        @Override // com.zepto.ho6
        public X509Certificate a(X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.b.invoke(this.a, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.a;
            int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.b;
            return iHashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ")";
        }
    }

    static {
        boolean z = false;
        if (is4.c.h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f = z;
    }

    public jp() {
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new f46[]{l66.a.b(l66.j, null, 1, null), new wg1(lp.g.d()), new wg1(uw0.b.a()), new wg1(o70.b.a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((f46) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
        this.e = yq0.d.a();
    }

    @Override // com.zepto.is4
    public ub0 c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        yo yoVarA = yo.d.a(trustManager);
        return yoVarA != null ? yoVarA : super.c(trustManager);
    }

    @Override // com.zepto.is4
    public ho6 d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            method.setAccessible(true);
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // com.zepto.is4
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((f46) next).a(sslSocket)) {
                    break;
                }
            }
        }
        f46 f46Var = (f46) next;
        if (f46Var != null) {
            f46Var.d(sslSocket, str, protocols);
        }
    }

    @Override // com.zepto.is4
    public void f(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    @Override // com.zepto.is4
    public String h(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((f46) next).a(sslSocket)) {
                break;
            }
        }
        f46 f46Var = (f46) next;
        if (f46Var != null) {
            return f46Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.zepto.is4
    public Object i(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.e.a(closer);
    }

    @Override // com.zepto.is4
    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // com.zepto.is4
    public void m(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.e.b(obj)) {
            return;
        }
        is4.l(this, message, 5, null, 4, null);
    }
}
