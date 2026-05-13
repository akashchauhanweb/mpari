package com.zepto;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class gl2 {
    public static final a e = new a(null);
    public final Lazy a;
    public final ng6 b;
    public final nk0 c;
    public final List d;

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.gl2$a$a, reason: collision with other inner class name */
        public static final class C0085a extends Lambda implements Function0 {
            public final /* synthetic */ List c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0085a(List list) {
                super(0);
                this.c = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.c;
            }
        }

        public static final class b extends Lambda implements Function0 {
            public final /* synthetic */ List c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.c = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.c;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gl2 a(ng6 tlsVersion, nk0 cipherSuite, List peerCertificates, List localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            return new gl2(tlsVersion, cipherSuite, et6.P(localCertificates), new C0085a(et6.P(peerCertificates)));
        }

        public final gl2 b(SSLSession handshake) throws IOException {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int iHashCode = cipherSuite.hashCode();
            if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            nk0 nk0VarB = nk0.s1.b(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            ng6 ng6VarA = ng6.k.a(protocol);
            try {
                listEmptyList = c(handshake.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            return new gl2(ng6VarA, nk0VarB, c(handshake.getLocalCertificates()), new b(listEmptyList));
        }

        public final List c(Certificate[] certificateArr) {
            return certificateArr != null ? et6.t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ Function0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0) {
            super(0);
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                return (List) this.c.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
    }

    public gl2(ng6 tlsVersion, nk0 cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.b = tlsVersion;
        this.c = cipherSuite;
        this.d = localCertificates;
        this.a = LazyKt__LazyJVMKt.lazy(new b(peerCertificatesFn));
    }

    public final nk0 a() {
        return this.c;
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    public final List c() {
        return this.d;
    }

    public final List d() {
        return (List) this.a.getValue();
    }

    public final ng6 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof gl2) {
            gl2 gl2Var = (gl2) obj;
            if (gl2Var.b == this.b && Intrinsics.areEqual(gl2Var.c, this.c) && Intrinsics.areEqual(gl2Var.d(), d()) && Intrinsics.areEqual(gl2Var.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + d().hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(string);
        sb.append(' ');
        sb.append("localCertificates=");
        List list = this.d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
