package com.zepto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nw0 {
    public static final nk0[] e;
    public static final nk0[] f;
    public static final nw0 g;
    public static final nw0 h;
    public static final nw0 i;
    public static final nw0 j;
    public static final b k = new b(null);
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    public static final class a {
        public boolean a;
        public String[] b;
        public String[] c;
        public boolean d;

        public a(boolean z) {
            this.a = z;
        }

        public final nw0 a() {
            return new nw0(this.a, this.d, this.b, this.c);
        }

        public final a b(nk0... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (nk0 nk0Var : cipherSuites) {
                arrayList.add(nk0Var.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = cipherSuites.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.b = (String[]) objClone;
            return this;
        }

        public final a d(boolean z) {
            if (!this.a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.d = z;
            return this;
        }

        public final a e(ng6... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (ng6 ng6Var : tlsVersions) {
                arrayList.add(ng6Var.a());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = tlsVersions.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.c = (String[]) objClone;
            return this;
        }

        public a(nw0 connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.a = connectionSpec.f();
            this.b = connectionSpec.c;
            this.c = connectionSpec.d;
            this.d = connectionSpec.h();
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        nk0 nk0Var = nk0.n1;
        nk0 nk0Var2 = nk0.o1;
        nk0 nk0Var3 = nk0.p1;
        nk0 nk0Var4 = nk0.Z0;
        nk0 nk0Var5 = nk0.d1;
        nk0 nk0Var6 = nk0.a1;
        nk0 nk0Var7 = nk0.e1;
        nk0 nk0Var8 = nk0.k1;
        nk0 nk0Var9 = nk0.j1;
        nk0[] nk0VarArr = {nk0Var, nk0Var2, nk0Var3, nk0Var4, nk0Var5, nk0Var6, nk0Var7, nk0Var8, nk0Var9};
        e = nk0VarArr;
        nk0[] nk0VarArr2 = {nk0Var, nk0Var2, nk0Var3, nk0Var4, nk0Var5, nk0Var6, nk0Var7, nk0Var8, nk0Var9, nk0.K0, nk0.L0, nk0.i0, nk0.j0, nk0.G, nk0.K, nk0.k};
        f = nk0VarArr2;
        a aVarB = new a(true).b((nk0[]) Arrays.copyOf(nk0VarArr, nk0VarArr.length));
        ng6 ng6Var = ng6.TLS_1_3;
        ng6 ng6Var2 = ng6.TLS_1_2;
        g = aVarB.e(ng6Var, ng6Var2).d(true).a();
        h = new a(true).b((nk0[]) Arrays.copyOf(nk0VarArr2, nk0VarArr2.length)).e(ng6Var, ng6Var2).d(true).a();
        i = new a(true).b((nk0[]) Arrays.copyOf(nk0VarArr2, nk0VarArr2.length)).e(ng6Var, ng6Var2, ng6.TLS_1_1, ng6.TLS_1_0).d(true).a();
        j = new a(false).a();
    }

    public nw0(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void c(SSLSocket sslSocket, boolean z) throws CloneNotSupportedException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        nw0 nw0VarG = g(sslSocket, z);
        if (nw0VarG.i() != null) {
            sslSocket.setEnabledProtocols(nw0VarG.d);
        }
        if (nw0VarG.d() != null) {
            sslSocket.setEnabledCipherSuites(nw0VarG.c);
        }
    }

    public final List d() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(nk0.s1.b(str));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !et6.r(strArr, socket.getEnabledProtocols(), ComparisonsKt__ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || et6.r(strArr2, socket.getEnabledCipherSuites(), nk0.s1.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof nw0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.a;
        nw0 nw0Var = (nw0) obj;
        if (z != nw0Var.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, nw0Var.c) && Arrays.equals(this.d, nw0Var.d) && this.b == nw0Var.b);
    }

    public final boolean f() {
        return this.a;
    }

    public final nw0 g(SSLSocket sSLSocket, boolean z) throws CloneNotSupportedException {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = et6.B(enabledCipherSuites, this.c, nk0.s1.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = et6.B(enabledProtocols, this.d, ComparisonsKt__ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iU = et6.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", nk0.s1.c());
        if (z && iU != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iU];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = et6.l(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarC = aVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarC.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ng6.k.a(str));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
