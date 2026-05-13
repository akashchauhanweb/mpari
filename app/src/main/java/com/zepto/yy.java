package com.zepto;

import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateParsingException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class yy implements Comparable {
    public final String c;
    public final long e;

    public yy(a0 a0Var) throws CertificateParsingException {
        if (!(a0Var instanceof x0)) {
            throw new CertificateParsingException("Expected sequence for AttestationPackageInfo, found " + a0Var.getClass().getName());
        }
        x0 x0Var = (x0) a0Var;
        try {
            this.c = yx.l(x0Var.j0(0));
            this.e = yx.k(x0Var.j0(1)).longValue();
        } catch (UnsupportedEncodingException e) {
            throw new CertificateParsingException("Converting octet stream to String triggered an UnsupportedEncodingException", e);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(yy yyVar) {
        int iCompareTo = this.c.compareTo(yyVar.c);
        return iCompareTo != 0 ? iCompareTo : Long.compare(this.e, yyVar.e);
    }

    public String b() {
        return this.c;
    }

    public long c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy)) {
            return false;
        }
        yy yyVar = (yy) obj;
        return Objects.equals(this.c, yyVar.c) && this.e == yyVar.e;
    }

    public int hashCode() {
        return Objects.hash(this.c, Long.valueOf(this.e));
    }

    public String toString() {
        return b() + " (version code " + c() + ")\n";
    }
}
