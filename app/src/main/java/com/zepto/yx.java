package com.zepto;

import com.zepto.cy2;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Set;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class yx {
    public static int a(BigInteger bigInteger) throws CertificateParsingException {
        if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) > 0 || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new CertificateParsingException("INTEGER out of bounds");
        }
        return bigInteger.intValue();
    }

    public static long b(BigInteger bigInteger) throws CertificateParsingException {
        if (bigInteger.compareTo(BigInteger.valueOf(LongCompanionObject.MAX_VALUE)) > 0 || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new CertificateParsingException("INTEGER out of bounds");
        }
        return bigInteger.longValue();
    }

    public static a0 c(byte[] bArr) throws CertificateParsingException {
        try {
            j0 j0Var = new j0(bArr);
            try {
                u0 u0VarP = j0Var.P();
                j0Var.close();
                return u0VarP;
            } finally {
            }
        } catch (IOException e) {
            throw new CertificateParsingException("Failed to parse Encodable", e);
        }
    }

    public static x0 d(byte[] bArr) throws CertificateParsingException {
        try {
            j0 j0Var = new j0(bArr);
            try {
                x0 x0VarE = e(j0Var);
                j0Var.close();
                return x0VarE;
            } finally {
            }
        } catch (IOException e) {
            throw new CertificateParsingException("Failed to parse SEQUENCE", e);
        }
    }

    public static x0 e(j0 j0Var) throws CertificateParsingException, IOException {
        u0 u0VarP = j0Var.P();
        if (!(u0VarP instanceof q0)) {
            throw new CertificateParsingException("Expected octet stream, found " + u0VarP.getClass().getName());
        }
        j0 j0Var2 = new j0(((q0) u0VarP).j0());
        try {
            u0 u0VarP2 = j0Var2.P();
            if (u0VarP2 instanceof x0) {
                x0 x0Var = (x0) u0VarP2;
                j0Var2.close();
                return x0Var;
            }
            throw new CertificateParsingException("Expected sequence, found " + u0VarP2.getClass().getName());
        } catch (Throwable th) {
            try {
                j0Var2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean f(a0 a0Var) throws CertificateParsingException {
        if (!(a0Var instanceof z)) {
            throw new CertificateParsingException("Expected boolean, found " + a0Var.getClass().getName());
        }
        z zVar = (z) a0Var;
        if (zVar.a0(z.g)) {
            return true;
        }
        if (zVar.a0(z.f)) {
            return false;
        }
        throw new CertificateParsingException("DER-encoded boolean values must contain either 0x00 or 0xFF");
    }

    public static byte[] g(a0 a0Var) throws CertificateParsingException {
        if (a0Var == null || !(a0Var instanceof z41)) {
            throw new CertificateParsingException("Expected DEROctetString");
        }
        return ((q0) a0Var).j0();
    }

    public static Date h(u0 u0Var) {
        return new Date(k(u0Var).longValue());
    }

    public static int i(a0 a0Var) throws CertificateParsingException {
        if (a0Var instanceof k0) {
            return a(((k0) a0Var).j0());
        }
        if (a0Var instanceof c0) {
            return a(((c0) a0Var).h0());
        }
        throw new CertificateParsingException("Integer value expected, " + a0Var.getClass().getName() + " found.");
    }

    public static Set j(a0 a0Var) throws CertificateParsingException {
        if (!(a0Var instanceof z0)) {
            throw new CertificateParsingException("Expected set, found " + a0Var.getClass().getName());
        }
        cy2.a aVarB = cy2.B();
        Enumeration enumerationI0 = ((z0) a0Var).i0();
        while (enumerationI0.hasMoreElements()) {
            aVarB.d(Integer.valueOf(i((k0) enumerationI0.nextElement())));
        }
        return aVarB.g();
    }

    public static Long k(a0 a0Var) throws CertificateParsingException {
        if (a0Var instanceof k0) {
            return Long.valueOf(b(((k0) a0Var).j0()));
        }
        throw new CertificateParsingException("Integer value expected, " + a0Var.getClass().getName() + " found.");
    }

    public static String l(a0 a0Var) throws CertificateParsingException {
        if (a0Var instanceof q0) {
            return new String(((q0) a0Var).j0(), StandardCharsets.UTF_8);
        }
        throw new CertificateParsingException("Expected octet string, found " + a0Var.getClass().getName());
    }
}
