package com.zepto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class ap4 extends uo4 {
    public pq4 m;
    public gp4 n;

    public ap4() {
        super(lp4.b3);
    }

    public static ap4 v(pq4 pq4Var, String str, String str2, byte[] bArr) {
        return w(pq4Var, str, str2, bArr, 9);
    }

    public static ap4 w(pq4 pq4Var, String str, String str2, byte[] bArr, int i) {
        return x(pq4Var, str, str2, bArr, null, null, i);
    }

    public static ap4 x(pq4 pq4Var, String str, String str2, byte[] bArr, String str3, uo4 uo4Var, int i) throws Throwable {
        wo4 wo4Var;
        InputStream inputStream;
        InputStream inputStreamOpenStream;
        ap4 ap4Var = new ap4();
        ap4Var.m = pq4Var;
        ap4Var.r(lp4.Q2, new hq4(str2));
        ap4Var.A(str2, false);
        InputStream inputStream2 = null;
        gp4 gp4Var = null;
        try {
            if (bArr == null) {
                gp4 gp4VarK = pq4Var.K();
                if (new File(str).canRead()) {
                    inputStreamOpenStream = new FileInputStream(str);
                } else if (str.startsWith("file:/") || str.startsWith("http://") || str.startsWith("https://") || str.startsWith("jar:")) {
                    inputStreamOpenStream = new URL(str).openStream();
                } else {
                    inputStreamOpenStream = s40.q(str);
                    if (inputStreamOpenStream == null) {
                        throw new IOException(dt3.b("1.not.found.as.file.or.resource", str));
                    }
                }
                wo4Var = new wo4(inputStreamOpenStream, pq4Var);
                inputStream = inputStreamOpenStream;
                gp4Var = gp4VarK;
            } else {
                wo4Var = new wo4(bArr);
                inputStream = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            wo4Var.r(lp4.sa, lp4.A2);
            wo4Var.v(i);
            uo4 uo4Var2 = new uo4();
            if (uo4Var != null) {
                uo4Var2.p(uo4Var);
            }
            if (bArr != null) {
                uo4Var2.r(lp4.V8, new op4(wo4Var.w()));
                wo4Var.r(lp4.b7, uo4Var2);
            } else {
                wo4Var.r(lp4.b7, gp4Var);
            }
            if (str3 != null) {
                wo4Var.r(lp4.v9, new lp4(str3));
            }
            gp4 gp4VarA = pq4Var.n(wo4Var).a();
            if (bArr == null) {
                wo4Var.y();
                uo4Var2.r(lp4.V8, new op4(wo4Var.w()));
                pq4Var.o(uo4Var2, gp4Var);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            uo4 uo4Var3 = new uo4();
            uo4Var3.r(lp4.Q2, gp4VarA);
            uo4Var3.r(lp4.xa, gp4VarA);
            ap4Var.r(lp4.w2, uo4Var3);
            return ap4Var;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public static ap4 y(pq4 pq4Var, String str) {
        ap4 ap4Var = new ap4();
        ap4Var.m = pq4Var;
        ap4Var.r(lp4.Q2, new hq4(str));
        ap4Var.A(str, false);
        return ap4Var;
    }

    public void A(String str, boolean z) {
        r(lp4.xa, new hq4(str, z ? "UnicodeBig" : "PDF"));
    }

    public gp4 z() {
        gp4 gp4Var = this.n;
        if (gp4Var != null) {
            return gp4Var;
        }
        gp4 gp4VarA = this.m.n(this).a();
        this.n = gp4VarA;
        return gp4VarA;
    }
}
