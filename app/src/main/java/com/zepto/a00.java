package com.zepto;

import android.util.Log;
import android.widget.Toast;
import com.zepto.jt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateParsingException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a00 {
    public static final by2 M = by2.a().d(1, "NONE").d(2, "OAEP").d(3, "PSS").d(4, "PKCS1 ENCRYPT").d(5, "PKCS1 SIGN").d(64, "PKCS7").a();
    public static final by2 N = by2.a().d(0, "NONE").d(3, "SHA224").d(4, "SHA256").d(5, "SHA384").d(6, "SHA512").a();
    public static final by2 O = by2.a().d(1, "DECRYPT").d(0, "ENCRYPT").d(2, "SIGN").d(3, "VERIFY").d(5, "WRAP").a();
    public ry A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public String a = "AuthorizationList";
    public Set b;
    public Integer c;
    public Integer d;
    public Set e;
    public Set f;
    public Integer g;
    public Long h;
    public Date i;
    public Date j;
    public Date k;
    public Boolean l;
    public Integer m;
    public Integer n;
    public Boolean o;
    public Boolean p;
    public byte[] q;
    public Date r;
    public Integer s;
    public Boolean t;
    public Boolean u;
    public re5 v;
    public Integer w;
    public Integer x;
    public Integer y;
    public Integer z;

    public a00(a0 a0Var) throws CertificateParsingException {
        if (!(a0Var instanceof x0)) {
            throw new CertificateParsingException("Expected sequence for authorization list, found " + a0Var.getClass().getName());
        }
        y0 y0VarL0 = ((x0) a0Var).l0();
        for (e1 e1VarR = r(y0VarL0); e1VarR != null; e1VarR = r(y0VarL0)) {
            int iQ0 = e1VarR.q0();
            u0 u0VarL = l(e1VarR);
            u0 u0VarG = g(e1VarR);
            if (u0VarL == null) {
                if (u0VarG == null) {
                    jt.a aVar = jt.c;
                    if (aVar.r() != null) {
                        aVar.r().runOnUiThread(new Runnable() { // from class: com.zepto.zz
                            @Override // java.lang.Runnable
                            public final void run() {
                                a00.n();
                            }
                        });
                    }
                    u0VarL = null;
                } else {
                    u0VarL = u0VarG;
                }
            }
            if (iQ0 == 1) {
                this.b = yx.j(u0VarL);
            } else if (iQ0 == 2) {
                this.c = Integer.valueOf(yx.i(u0VarL));
            } else if (iQ0 == 3) {
                this.d = Integer.valueOf(yx.i(u0VarL));
            } else if (iQ0 == 5) {
                this.e = yx.j(u0VarL);
            } else if (iQ0 == 6) {
                this.f = yx.j(u0VarL);
            } else if (iQ0 == 10) {
                this.g = Integer.valueOf(yx.i(u0VarL));
            } else if (iQ0 == 200) {
                this.h = yx.k(u0VarL);
            } else if (iQ0 == 303) {
                this.u = Boolean.TRUE;
            } else if (iQ0 == 600) {
                this.p = Boolean.TRUE;
            } else if (iQ0 != 601) {
                switch (iQ0) {
                    case 400:
                        this.i = yx.h(u0VarL);
                        break;
                    case 401:
                        this.j = yx.h(u0VarL);
                        break;
                    case 402:
                        this.k = yx.h(u0VarL);
                        break;
                    default:
                        switch (iQ0) {
                            case 503:
                                this.l = Boolean.TRUE;
                                break;
                            case 504:
                                this.m = Integer.valueOf(yx.i(u0VarL));
                                break;
                            case 505:
                                this.n = Integer.valueOf(yx.i(u0VarL));
                                break;
                            case 506:
                                this.o = Boolean.TRUE;
                                break;
                            case 507:
                                this.J = Boolean.TRUE;
                                break;
                            case 508:
                                this.K = Boolean.TRUE;
                                break;
                            case 509:
                                this.L = Boolean.TRUE;
                                break;
                            default:
                                switch (iQ0) {
                                    case 701:
                                        this.r = yx.h(u0VarL);
                                        break;
                                    case 702:
                                        this.s = Integer.valueOf(yx.i(u0VarL));
                                        break;
                                    case 703:
                                        this.t = Boolean.TRUE;
                                        break;
                                    case 704:
                                        try {
                                            this.v = new re5(u0VarL);
                                        } catch (CertificateParsingException e) {
                                            Log.e("TAG", "Root of trust parsing failure" + e);
                                            this.v = null;
                                        }
                                        break;
                                    case 705:
                                        this.w = Integer.valueOf(yx.i(u0VarL));
                                        break;
                                    case 706:
                                        this.x = Integer.valueOf(yx.i(u0VarL));
                                        break;
                                    default:
                                        switch (iQ0) {
                                            case 709:
                                                this.A = new ry(yx.c(yx.g(u0VarL)));
                                                break;
                                            case 710:
                                                this.B = k(u0VarL);
                                                break;
                                            case 711:
                                                this.C = k(u0VarL);
                                                break;
                                            case 712:
                                                this.G = k(u0VarL);
                                                break;
                                            case 713:
                                                this.D = k(u0VarL);
                                                break;
                                            case 714:
                                                this.E = k(u0VarL);
                                                break;
                                            case 715:
                                                this.F = k(u0VarL);
                                                break;
                                            case 716:
                                                this.H = k(u0VarL);
                                                break;
                                            case 717:
                                                this.I = k(u0VarL);
                                                break;
                                            case 718:
                                                this.y = Integer.valueOf(yx.i(u0VarL));
                                                break;
                                            case 719:
                                                this.z = Integer.valueOf(yx.i(u0VarL));
                                                break;
                                            default:
                                                throw new CertificateParsingException("Unknown tag " + iQ0 + " found");
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.q = yx.g(u0VarL);
            }
        }
    }

    public static String b(int i) {
        if (i == 1) {
            return "RSA";
        }
        if (i == 3) {
            return "ECDSA";
        }
        if (i == 128) {
            return "HMAC";
        }
        if (i == 32) {
            return "AES";
        }
        if (i == 33) {
            return "3DES";
        }
        return "Unknown (" + i + ")";
    }

    public static String c(Set set) {
        return m(or0.b(set, zh2.a(N, "Unknown")));
    }

    public static String d(Integer num) {
        if (num == null) {
            return "NULL";
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return "secp224r1";
        }
        if (iIntValue == 1) {
            return "secp256r1";
        }
        if (iIntValue == 2) {
            return "secp384r1";
        }
        if (iIntValue == 3) {
            return "secp521r1";
        }
        return "unknown (" + num + ")";
    }

    public static String e(Date date) {
        return DateFormat.getDateTimeInstance().format(date);
    }

    public static String m(Collection collection) {
        return "[" + t43.e(", ").c(collection) + "]";
    }

    public static /* synthetic */ void n() {
        Toast.makeText(jt.c.C(), "ASN1Primitive Obj Failed", 0).show();
    }

    public static String o(int i) {
        if (i == 0) {
            return "Generated";
        }
        if (i == 2) {
            return "Imported";
        }
        if (i == 3) {
            return "Unknown (KM0)";
        }
        if (i == 4) {
            return "Securely Imported";
        }
        return "Unknown (" + i + ")";
    }

    public static String p(Set set) {
        return m(or0.b(set, zh2.a(M, "Unknown")));
    }

    public static a0 q(y0 y0Var) throws CertificateParsingException {
        try {
            return y0Var.readObject();
        } catch (IOException e) {
            throw new CertificateParsingException("Failed to parse ASN1 sequence", e);
        }
    }

    public static e1 r(y0 y0Var) throws CertificateParsingException {
        a0 a0VarQ = q(y0Var);
        if (a0VarQ == null || (a0VarQ instanceof e1)) {
            return (e1) a0VarQ;
        }
        throw new CertificateParsingException("Expected tagged object, found " + a0VarQ.getClass().getName());
    }

    public static String s(Set set) {
        return m(or0.b(set, zh2.a(O, "Unknown")));
    }

    public static String t(int i) {
        ArrayList arrayListF = bg3.f();
        if ((i & 2) != 0) {
            arrayListF.add("Biometric");
        }
        if ((i & 1) != 0) {
            arrayListF.add("Password");
        }
        return m(arrayListF);
    }

    public ry f() {
        return this.A;
    }

    public u0 g(e1 e1Var) {
        try {
            return (u0) e1.class.getMethod("k0", new Class[0]).invoke(e1Var, new Object[0]);
        } catch (IllegalAccessException e) {
            nn3.a.f(this.a, e.toString());
            return null;
        } catch (NoSuchMethodException e2) {
            nn3.a.f(this.a, e2.toString());
            return null;
        } catch (InvocationTargetException e3) {
            nn3.a.f(this.a, e3.toString());
            return null;
        }
    }

    public Set h() {
        return this.e;
    }

    public Set i() {
        return this.b;
    }

    public re5 j() {
        return this.v;
    }

    public final String k(u0 u0Var) throws CertificateParsingException {
        try {
            return yx.l(u0Var);
        } catch (UnsupportedEncodingException e) {
            throw new CertificateParsingException("Error parsing ASN.1 value", e);
        }
    }

    public u0 l(e1 e1Var) {
        try {
            return (u0) e1.class.getMethod("o0", new Class[0]).invoke(e1Var, new Object[0]);
        } catch (IllegalAccessException e) {
            nn3.a.f(this.a, e.toString());
            return null;
        } catch (NoSuchMethodException e2) {
            nn3.a.f(this.a, e2.toString());
            return null;
        } catch (InvocationTargetException e3) {
            nn3.a.f(this.a, e3.toString());
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c != null) {
            sb.append("\nAlgorithm: ");
            sb.append(b(this.c.intValue()));
        }
        if (this.d != null) {
            sb.append("\nKeySize: ");
            sb.append(this.d);
        }
        Set set = this.b;
        if (set != null && !set.isEmpty()) {
            sb.append("\nPurposes: ");
            sb.append(s(this.b));
        }
        Set set2 = this.e;
        if (set2 != null && !set2.isEmpty()) {
            sb.append("\nDigests: ");
            sb.append(c(this.e));
        }
        Set set3 = this.f;
        if (set3 != null && !set3.isEmpty()) {
            sb.append("\nPadding modes: ");
            sb.append(p(this.f));
        }
        if (this.g != null) {
            sb.append("\nEC Curve: ");
            sb.append(d(this.g));
        }
        if (this.h != null) {
            sb.append("\nRSA exponent: ");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append("\nActive: ");
            sb.append(e(this.i));
        }
        if (this.j != null) {
            sb.append("\nOrigination expire: ");
            sb.append(e(this.j));
        }
        if (this.k != null) {
            sb.append("\nUsage expire: ");
            sb.append(e(this.k));
        }
        if (this.l != null) {
            sb.append("\nNo Auth Required: true");
        } else if (this.m != null) {
            sb.append("\nAuth types: ");
            sb.append(t(this.m.intValue()));
            if (this.n != null) {
                sb.append("\nAuth timeout: ");
                sb.append(this.n);
            }
            if (this.o != null) {
                sb.append("\nAllow While On Body: true");
            }
        }
        if (this.p != null) {
            sb.append("\nAll Applications: true");
        }
        if (this.q != null) {
            sb.append("\nApplication ID: ");
            sb.append(new String(this.q, StandardCharsets.UTF_8));
        }
        if (this.r != null) {
            sb.append("\nCreated: ");
            sb.append(e(this.r));
        }
        if (this.s != null) {
            sb.append("\nOrigin: ");
            sb.append(o(this.s.intValue()));
        }
        if (this.t != null) {
            sb.append("\nRollback resistant: true");
        }
        if (this.u != null) {
            sb.append("\nRollback resistance: true");
        }
        if (this.v != null) {
            sb.append("\nRoot of Trust:\n");
            sb.append(this.v);
        }
        if (this.w != null) {
            sb.append("\nOS Version: ");
            sb.append(this.w);
        }
        if (this.x != null) {
            sb.append("\nOS Patchlevel: ");
            sb.append(this.x);
        }
        if (this.y != null) {
            sb.append("\nVendor Patchlevel: ");
            sb.append(this.y);
        }
        if (this.z != null) {
            sb.append("\nBoot Patchlevel: ");
            sb.append(this.z);
        }
        if (this.A != null) {
            sb.append("\nAttestation Application Id:\n");
            sb.append(this.A);
        }
        if (this.J != null) {
            sb.append("\nUser presence required");
        }
        if (this.K != null) {
            sb.append("\nConfirmation required");
        }
        if (this.L != null) {
            sb.append("\nUnlocked Device Required");
        }
        if (this.B != null) {
            sb.append("\nBrand: ");
            sb.append(this.B);
        }
        if (this.C != null) {
            sb.append("\nDevice type: ");
            sb.append(this.C);
        }
        if (this.G != null) {
            sb.append("\nProduct: ");
            sb.append(this.G);
        }
        if (this.D != null) {
            sb.append("\nSerial: ");
            sb.append(this.D);
        }
        if (this.E != null) {
            sb.append("\nIMEI: ");
            sb.append(this.E);
        }
        if (this.F != null) {
            sb.append("\nMEID: ");
            sb.append(this.F);
        }
        if (this.H != null) {
            sb.append("\nManufacturer: ");
            sb.append(this.H);
        }
        if (this.I != null) {
            sb.append("\nModel: ");
            sb.append(this.I);
        }
        return sb.toString();
    }
}
