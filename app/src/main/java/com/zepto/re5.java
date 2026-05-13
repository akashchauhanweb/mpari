package com.zepto;

import java.security.cert.CertificateParsingException;

/* JADX INFO: loaded from: classes.dex */
public class re5 {
    public final byte[] a;
    public final boolean b;
    public final int c;
    public final byte[] d;

    public re5(a0 a0Var) throws CertificateParsingException {
        if (!(a0Var instanceof x0)) {
            throw new CertificateParsingException("Expected sequence for root of trust, found " + a0Var.getClass().getName());
        }
        x0 x0Var = (x0) a0Var;
        this.a = yx.g(x0Var.j0(0));
        this.b = yx.f(x0Var.j0(1));
        this.c = yx.i(x0Var.j0(2));
        if (x0Var.size() == 3) {
            this.d = null;
        } else {
            this.d = yx.g(x0Var.j0(3));
        }
    }

    public static String c(int i) {
        if (i == 0) {
            return "Verified";
        }
        if (i == 1) {
            return "Self-signed";
        }
        if (i == 2) {
            return "Unverified";
        }
        if (i == 3) {
            return "Failed";
        }
        return "Unknown (" + i + ")";
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Verified boot Key: ");
        sb.append(r40.a().b(this.a));
        sb.append(" (base64)");
        sb.append('\n');
        sb.append("Device locked: ");
        sb.append(this.b);
        sb.append('\n');
        sb.append("Verified boot state: ");
        sb.append(c(this.c));
        sb.append('\n');
        if (this.d != null) {
            sb.append("Verified boot hash: ");
            sb.append(r40.a().b(this.d));
            sb.append(" (base64)");
        }
        return sb.toString();
    }
}
