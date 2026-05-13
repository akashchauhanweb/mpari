package com.zepto;

import com.zepto.cy2;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public class qy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final byte[] e;
    public final byte[] f;
    public final a00 g;
    public final a00 h;
    public final Set i;

    public qy(X509Certificate x509Certificate) throws CertificateParsingException {
        x0 x0VarC = c(x509Certificate);
        this.i = h(x509Certificate);
        this.a = yx.i(x0VarC.j0(0));
        this.b = yx.i(x0VarC.j0(1));
        this.c = yx.i(x0VarC.j0(2));
        this.d = yx.i(x0VarC.j0(3));
        this.e = yx.g(x0VarC.j0(4));
        this.f = yx.g(x0VarC.j0(5));
        this.g = new a00(x0VarC.j0(6));
        this.h = new a00(x0VarC.j0(7));
    }

    public static /* synthetic */ boolean f(String str) {
        return !"2.5.29.15".equals(str);
    }

    public static /* synthetic */ boolean g(String str) {
        return !"1.3.6.1.4.1.11129.2.1.17".equals(str);
    }

    public static String i(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unkown" : "StrongBox" : "TEE" : "Software";
    }

    public final x0 c(X509Certificate x509Certificate) throws CertificateParsingException {
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
        if (extensionValue == null || extensionValue.length == 0) {
            throw new CertificateParsingException("Did not find extension with OID 1.3.6.1.4.1.11129.2.1.17");
        }
        return yx.d(extensionValue);
    }

    public a00 d() {
        return this.g;
    }

    public a00 e() {
        return this.h;
    }

    public final Set h(X509Certificate x509Certificate) {
        return new cy2.a().e(x509Certificate.getCriticalExtensionOIDs().stream().filter(new Predicate() { // from class: com.zepto.oy
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return qy.f((String) obj);
            }
        }).iterator()).e(x509Certificate.getNonCriticalExtensionOIDs().stream().filter(new Predicate() { // from class: com.zepto.py
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return qy.g((String) obj);
            }
        }).iterator()).g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Attest version: " + this.a);
        sb.append("\nAttest security: " + i(this.b));
        sb.append("\nKM version: " + this.c);
        sb.append("\nKM security: " + i(this.d));
        sb.append("\nChallenge");
        String str = new String(this.e, StandardCharsets.UTF_8);
        if (xi0.a().c(str)) {
            sb.append(": [" + str + "]");
        } else {
            sb.append(" (base64): [" + r40.a().b(this.e) + "]");
        }
        if (this.f != null) {
            sb.append("\nUnique ID (base64): [" + r40.a().b(this.f) + "]");
        }
        sb.append("\n-- SW enforced --");
        sb.append(this.g);
        sb.append("\n-- TEE enforced --");
        sb.append(this.h);
        return sb.toString();
    }
}
