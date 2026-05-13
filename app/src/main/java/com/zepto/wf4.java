package com.zepto;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class wf4 implements HostnameVerifier {
    public static final wf4 a = new wf4();

    public final List a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt___CollectionsKt.plus((Collection) c(certificate, 7), (Iterable) c(certificate, 2));
    }

    public final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List c(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!Intrinsics.areEqual(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public final boolean d(String str) {
        return str.length() == ((int) at6.b(str, 0, 0, 3, null));
    }

    public final boolean e(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return et6.f(host) ? h(host, certificate) : g(host, certificate);
    }

    public final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt__StringsJVMKt.startsWith$default(str, ".", false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !StringsKt__StringsJVMKt.startsWith$default(str2, ".", false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(str2, "..", false, 2, null)) {
            if (!StringsKt__StringsJVMKt.endsWith$default(str, ".", false, 2, null)) {
                str = str + ".";
            }
            String str3 = str;
            if (!StringsKt__StringsJVMKt.endsWith$default(str2, ".", false, 2, null)) {
                str2 = str2 + ".";
            }
            String strB = b(str2);
            if (!StringsKt__StringsKt.contains$default((CharSequence) strB, (CharSequence) "*", false, 2, (Object) null)) {
                return Intrinsics.areEqual(str3, strB);
            }
            if (!StringsKt__StringsJVMKt.startsWith$default(strB, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) strB, '*', 1, false, 4, (Object) null) != -1 || str3.length() < strB.length() || Intrinsics.areEqual("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
            if (!StringsKt__StringsJVMKt.endsWith$default(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, '.', length + (-1), false, 4, (Object) null) == -1;
        }
        return false;
    }

    public final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List listC = c(x509Certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(String str, X509Certificate x509Certificate) {
        String strE = hr2.e(str);
        List listC = c(x509Certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(strE, hr2.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return e(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
