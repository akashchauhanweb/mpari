package com.zepto;

import com.zepto.kc5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class ae5 implements v03 {
    public static final a b = new a(null);
    public final yf4 a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ae5(yf4 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.a = client;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.q();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.l() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.i(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.i(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        com.zepto.et6.j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.m0().o(r7.m0().b(null).c()).c();
     */
    @Override // com.zepto.v03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.ld5 a(com.zepto.v03.a r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ae5.a(com.zepto.v03$a):com.zepto.ld5");
    }

    public final kc5 b(ld5 ld5Var, String str) {
        String strP;
        ds2 ds2VarQ;
        if (!this.a.r() || (strP = ld5.P(ld5Var, "Location", null, 2, null)) == null || (ds2VarQ = ld5Var.z0().k().q(strP)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(ds2VarQ.r(), ld5Var.z0().k().r()) && !this.a.s()) {
            return null;
        }
        kc5.a aVarI = ld5Var.z0().i();
        if (as2.b(str)) {
            int iN = ld5Var.n();
            as2 as2Var = as2.a;
            boolean z = as2Var.d(str) || iN == 308 || iN == 307;
            if (!as2Var.c(str) || iN == 308 || iN == 307) {
                aVarI.f(str, z ? ld5Var.z0().a() : null);
            } else {
                aVarI.f("GET", null);
            }
            if (!z) {
                aVarI.g("Transfer-Encoding");
                aVarI.g("Content-Length");
                aVarI.g(xr2.HEADER_CONTENT_TYPE);
            }
        }
        if (!et6.g(ld5Var.z0().k(), ds2VarQ)) {
            aVarI.g("Authorization");
        }
        return aVarI.i(ds2VarQ).b();
    }

    public final kc5 c(ld5 ld5Var, r52 r52Var) throws ProtocolException {
        j55 j55VarH;
        bf5 bf5VarA = (r52Var == null || (j55VarH = r52Var.h()) == null) ? null : j55VarH.A();
        int iN = ld5Var.n();
        String strH = ld5Var.z0().h();
        if (iN != 307 && iN != 308) {
            if (iN == 401) {
                return this.a.d().a(bf5VarA, ld5Var);
            }
            if (iN == 421) {
                lc5 lc5VarA = ld5Var.z0().a();
                if ((lc5VarA != null && lc5VarA.isOneShot()) || r52Var == null || !r52Var.k()) {
                    return null;
                }
                r52Var.h().y();
                return ld5Var.z0();
            }
            if (iN == 503) {
                ld5 ld5VarP0 = ld5Var.p0();
                if ((ld5VarP0 == null || ld5VarP0.n() != 503) && g(ld5Var, IntCompanionObject.MAX_VALUE) == 0) {
                    return ld5Var.z0();
                }
                return null;
            }
            if (iN == 407) {
                Intrinsics.checkNotNull(bf5VarA);
                if (bf5VarA.b().type() == Proxy.Type.HTTP) {
                    return this.a.C().a(bf5VarA, ld5Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iN == 408) {
                if (!this.a.G()) {
                    return null;
                }
                lc5 lc5VarA2 = ld5Var.z0().a();
                if (lc5VarA2 != null && lc5VarA2.isOneShot()) {
                    return null;
                }
                ld5 ld5VarP02 = ld5Var.p0();
                if ((ld5VarP02 == null || ld5VarP02.n() != 408) && g(ld5Var, 0) <= 0) {
                    return ld5Var.z0();
                }
                return null;
            }
            switch (iN) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(ld5Var, strH);
    }

    public final boolean d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean e(IOException iOException, i55 i55Var, kc5 kc5Var, boolean z) {
        if (this.a.G()) {
            return !(z && f(iOException, kc5Var)) && d(iOException, z) && i55Var.z();
        }
        return false;
    }

    public final boolean f(IOException iOException, kc5 kc5Var) {
        lc5 lc5VarA = kc5Var.a();
        return (lc5VarA != null && lc5VarA.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    public final int g(ld5 ld5Var, int i) {
        String strP = ld5.P(ld5Var, "Retry-After", null, 2, null);
        if (strP == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(strP)) {
            return IntCompanionObject.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strP);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }
}
