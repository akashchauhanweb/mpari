package com.zepto;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class nk0 {
    public static final nk0 A;
    public static final nk0 A0;
    public static final nk0 B;
    public static final nk0 B0;
    public static final nk0 C;
    public static final nk0 C0;
    public static final nk0 D;
    public static final nk0 D0;
    public static final nk0 E;
    public static final nk0 E0;
    public static final nk0 F;
    public static final nk0 F0;
    public static final nk0 G;
    public static final nk0 G0;
    public static final nk0 H;
    public static final nk0 H0;
    public static final nk0 I;
    public static final nk0 I0;
    public static final nk0 J;
    public static final nk0 J0;
    public static final nk0 K;
    public static final nk0 K0;
    public static final nk0 L;
    public static final nk0 L0;
    public static final nk0 M;
    public static final nk0 M0;
    public static final nk0 N;
    public static final nk0 N0;
    public static final nk0 O;
    public static final nk0 O0;
    public static final nk0 P;
    public static final nk0 P0;
    public static final nk0 Q;
    public static final nk0 Q0;
    public static final nk0 R;
    public static final nk0 R0;
    public static final nk0 S;
    public static final nk0 S0;
    public static final nk0 T;
    public static final nk0 T0;
    public static final nk0 U;
    public static final nk0 U0;
    public static final nk0 V;
    public static final nk0 V0;
    public static final nk0 W;
    public static final nk0 W0;
    public static final nk0 X;
    public static final nk0 X0;
    public static final nk0 Y;
    public static final nk0 Y0;
    public static final nk0 Z;
    public static final nk0 Z0;
    public static final nk0 a0;
    public static final nk0 a1;
    public static final Comparator b;
    public static final nk0 b0;
    public static final nk0 b1;
    public static final Map c;
    public static final nk0 c0;
    public static final nk0 c1;
    public static final nk0 d;
    public static final nk0 d0;
    public static final nk0 d1;
    public static final nk0 e;
    public static final nk0 e0;
    public static final nk0 e1;
    public static final nk0 f;
    public static final nk0 f0;
    public static final nk0 f1;
    public static final nk0 g;
    public static final nk0 g0;
    public static final nk0 g1;
    public static final nk0 h;
    public static final nk0 h0;
    public static final nk0 h1;
    public static final nk0 i;
    public static final nk0 i0;
    public static final nk0 i1;
    public static final nk0 j;
    public static final nk0 j0;
    public static final nk0 j1;
    public static final nk0 k;
    public static final nk0 k0;
    public static final nk0 k1;
    public static final nk0 l;
    public static final nk0 l0;
    public static final nk0 l1;
    public static final nk0 m;
    public static final nk0 m0;
    public static final nk0 m1;
    public static final nk0 n;
    public static final nk0 n0;
    public static final nk0 n1;
    public static final nk0 o;
    public static final nk0 o0;
    public static final nk0 o1;
    public static final nk0 p;
    public static final nk0 p0;
    public static final nk0 p1;
    public static final nk0 q;
    public static final nk0 q0;
    public static final nk0 q1;
    public static final nk0 r;
    public static final nk0 r0;
    public static final nk0 r1;
    public static final nk0 s;
    public static final nk0 s0;
    public static final b s1;
    public static final nk0 t;
    public static final nk0 t0;
    public static final nk0 u;
    public static final nk0 u0;
    public static final nk0 v;
    public static final nk0 v0;
    public static final nk0 w;
    public static final nk0 w0;
    public static final nk0 x;
    public static final nk0 x0;
    public static final nk0 y;
    public static final nk0 y0;
    public static final nk0 z;
    public static final nk0 z0;
    public final String a;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String a, String b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            int iMin = Math.min(a.length(), b.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = a.charAt(i);
                char cCharAt2 = b.charAt(i);
                if (cCharAt != cCharAt2) {
                    return Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = a.length();
            int length2 = b.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized nk0 b(String javaName) {
            nk0 nk0Var;
            try {
                Intrinsics.checkNotNullParameter(javaName, "javaName");
                nk0Var = (nk0) nk0.c.get(javaName);
                if (nk0Var == null) {
                    nk0Var = (nk0) nk0.c.get(e(javaName));
                    if (nk0Var == null) {
                        nk0Var = new nk0(javaName, null);
                    }
                    nk0.c.put(javaName, nk0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
            return nk0Var;
        }

        public final Comparator c() {
            return nk0.b;
        }

        public final nk0 d(String str, int i) {
            nk0 nk0Var = new nk0(str, null);
            nk0.c.put(str, nk0Var);
            return nk0Var;
        }

        public final String e(String str) {
            if (StringsKt__StringsJVMKt.startsWith$default(str, "TLS_", false, 2, null)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                return sb.toString();
            }
            if (!StringsKt__StringsJVMKt.startsWith$default(str, "SSL_", false, 2, null)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TLS_");
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring2);
            return sb2.toString();
        }
    }

    static {
        b bVar = new b(null);
        s1 = bVar;
        b = new a();
        c = new LinkedHashMap();
        d = bVar.d("SSL_RSA_WITH_NULL_MD5", 1);
        e = bVar.d("SSL_RSA_WITH_NULL_SHA", 2);
        f = bVar.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        g = bVar.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        h = bVar.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        i = bVar.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        j = bVar.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        k = bVar.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        l = bVar.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m = bVar.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        n = bVar.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        o = bVar.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        p = bVar.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        q = bVar.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        r = bVar.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        s = bVar.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        t = bVar.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        u = bVar.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        v = bVar.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        w = bVar.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        x = bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        y = bVar.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        z = bVar.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        A = bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        B = bVar.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        C = bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        D = bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        E = bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        F = bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        G = bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        H = bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        I = bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        J = bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        K = bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        L = bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        M = bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        N = bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        O = bVar.d("TLS_RSA_WITH_NULL_SHA256", 59);
        P = bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        Q = bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        R = bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        S = bVar.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        T = bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        U = bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        V = bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        W = bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        X = bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        Y = bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        Z = bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        a0 = bVar.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        b0 = bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        c0 = bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        d0 = bVar.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        e0 = bVar.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        f0 = bVar.d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        g0 = bVar.d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        h0 = bVar.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        i0 = bVar.d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        j0 = bVar.d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        k0 = bVar.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        l0 = bVar.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m0 = bVar.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        n0 = bVar.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        o0 = bVar.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        p0 = bVar.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        q0 = bVar.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", KotlinVersion.MAX_COMPONENT_VALUE);
        r0 = bVar.d("TLS_FALLBACK_SCSV", 22016);
        s0 = bVar.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        t0 = bVar.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        u0 = bVar.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        v0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        w0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        x0 = bVar.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        y0 = bVar.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        z0 = bVar.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        A0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        B0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        C0 = bVar.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        D0 = bVar.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        E0 = bVar.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        F0 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        G0 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        H0 = bVar.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        I0 = bVar.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        J0 = bVar.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        K0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        L0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        M0 = bVar.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        N0 = bVar.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        O0 = bVar.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        P0 = bVar.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        Q0 = bVar.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        R0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        S0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        T0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        U0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        V0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        W0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        X0 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        Y0 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        Z0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        a1 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        b1 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        c1 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        d1 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        e1 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        f1 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        g1 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        h1 = bVar.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        i1 = bVar.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        j1 = bVar.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        k1 = bVar.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        l1 = bVar.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m1 = bVar.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        n1 = bVar.d("TLS_AES_128_GCM_SHA256", 4865);
        o1 = bVar.d("TLS_AES_256_GCM_SHA384", 4866);
        p1 = bVar.d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        q1 = bVar.d("TLS_AES_128_CCM_SHA256", 4868);
        r1 = bVar.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public nk0(String str) {
        this.a = str;
    }

    public final String c() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    public /* synthetic */ nk0(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
