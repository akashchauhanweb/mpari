package com.zepto;

import com.zepto.t80;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class vb0 {
    public final Set a;
    public final ub0 b;
    public static final b d = new b(null);
    public static final vb0 c = new a().b();

    public static final class a {
        public final List a = new ArrayList();

        public final a a(String pattern, String... pins) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.a.add(new c(pattern, str));
            }
            return this;
        }

        public final vb0 b() {
            return new vb0(CollectionsKt___CollectionsKt.toSet(this.a), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + c((X509Certificate) certificate).a();
        }

        public final t80 b(X509Certificate sha1Hash) {
            Intrinsics.checkNotNullParameter(sha1Hash, "$this$sha1Hash");
            t80.a aVar = t80.h;
            PublicKey publicKey = sha1Hash.getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return t80.a.f(aVar, encoded, 0, 0, 3, null).r();
        }

        public final t80 c(X509Certificate sha256Hash) {
            Intrinsics.checkNotNullParameter(sha256Hash, "$this$sha256Hash");
            t80.a aVar = t80.h;
            PublicKey publicKey = sha256Hash.getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return t80.a.f(aVar, encoded, 0, 0, 3, null).s();
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final t80 c;

        public c(String pattern, String pin) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (!((StringsKt__StringsJVMKt.startsWith$default(pattern, "*.", false, 2, null) && StringsKt__StringsKt.indexOf$default((CharSequence) pattern, "*", 1, false, 4, (Object) null) == -1) || (StringsKt__StringsJVMKt.startsWith$default(pattern, "**.", false, 2, null) && StringsKt__StringsKt.indexOf$default((CharSequence) pattern, "*", 2, false, 4, (Object) null) == -1) || StringsKt__StringsKt.indexOf$default((CharSequence) pattern, "*", 0, false, 6, (Object) null) == -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + pattern).toString());
            }
            String strE = hr2.e(pattern);
            if (strE == null) {
                throw new IllegalArgumentException("Invalid pattern: " + pattern);
            }
            this.a = strE;
            if (StringsKt__StringsJVMKt.startsWith$default(pin, "sha1/", false, 2, null)) {
                this.b = "sha1";
                t80.a aVar = t80.h;
                String strSubstring = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                t80 t80VarA = aVar.a(strSubstring);
                if (t80VarA != null) {
                    this.c = t80VarA;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            if (!StringsKt__StringsJVMKt.startsWith$default(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            this.b = "sha256";
            t80.a aVar2 = t80.h;
            String strSubstring2 = pin.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            t80 t80VarA2 = aVar2.a(strSubstring2);
            if (t80VarA2 != null) {
                this.c = t80VarA2;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + pin);
        }

        public final t80 a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c(String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (StringsKt__StringsJVMKt.startsWith$default(this.a, "**.", false, 2, null)) {
                int length = this.a.length() - 3;
                int length2 = hostname.length() - length;
                if (!StringsKt__StringsJVMKt.regionMatches$default(hostname, hostname.length() - length, this.a, 3, length, false, 16, (Object) null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!StringsKt__StringsJVMKt.startsWith$default(this.a, "*.", false, 2, null)) {
                    return Intrinsics.areEqual(hostname, this.a);
                }
                int length3 = this.a.length() - 1;
                int length4 = hostname.length() - length3;
                if (!StringsKt__StringsJVMKt.regionMatches$default(hostname, hostname.length() - length3, this.a, 1, length3, false, 16, (Object) null) || StringsKt__StringsKt.lastIndexOf$default((CharSequence) hostname, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return ((Intrinsics.areEqual(this.a, cVar.a) ^ true) || (Intrinsics.areEqual(this.b, cVar.b) ^ true) || (Intrinsics.areEqual(this.c, cVar.c) ^ true)) ? false : true;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return this.b + '/' + this.c.a();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ List e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, String str) {
            super(0);
            this.e = list;
            this.f = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List listA;
            ub0 ub0VarD = vb0.this.d();
            if (ub0VarD == null || (listA = ub0VarD.a(this.e, this.f)) == null) {
                listA = this.e;
            }
            List<Certificate> list = listA;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Certificate certificate : list) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public vb0(Set pins, ub0 ub0Var) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.a = pins;
        this.b = ub0Var;
    }

    public final void a(String hostname, List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        b(hostname, new d(peerCertificates, hostname));
    }

    public final void b(String hostname, Function0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            t80 t80VarC = null;
            t80 t80VarB = null;
            for (c cVar : listC) {
                String strB = cVar.b();
                int iHashCode = strB.hashCode();
                if (iHashCode != -903629273) {
                    if (iHashCode != 3528965 || !strB.equals("sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                    }
                    if (t80VarB == null) {
                        t80VarB = d.b(x509Certificate);
                    }
                    if (Intrinsics.areEqual(cVar.a(), t80VarB)) {
                        return;
                    }
                } else {
                    if (!strB.equals("sha256")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                    }
                    if (t80VarC == null) {
                        t80VarC = d.c(x509Certificate);
                    }
                    if (Intrinsics.areEqual(cVar.a(), t80VarC)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(d.a(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            Intrinsics.checkNotNullExpressionValue(subjectDN, "element.subjectDN");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (c cVar2 : listC) {
            sb.append("\n    ");
            sb.append(cVar2);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.a;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList();
                }
                TypeIntrinsics.asMutableList(listEmptyList).add(obj);
            }
        }
        return listEmptyList;
    }

    public final ub0 d() {
        return this.b;
    }

    public final vb0 e(ub0 certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.b, certificateChainCleaner) ? this : new vb0(this.a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof vb0) {
            vb0 vb0Var = (vb0) obj;
            if (Intrinsics.areEqual(vb0Var.a, this.a) && Intrinsics.areEqual(vb0Var.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.a.hashCode()) * 41;
        ub0 ub0Var = this.b;
        return iHashCode + (ub0Var != null ? ub0Var.hashCode() : 0);
    }

    public /* synthetic */ vb0(Set set, ub0 ub0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : ub0Var);
    }
}
