package com.zepto;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class rw1 {
    public final nw1 a;
    public long b;
    public long c;
    public InputStream d;
    public ob2 e;
    public wr2 f;
    public long g;
    public int h;
    public String i;
    public boolean j;
    public String k;

    public rw1(nw1 nw1Var) {
        this.a = nw1Var;
    }

    public static rw1 d(nw1 nw1Var) {
        return new rw1(nw1Var);
    }

    public final boolean a(cw1 cw1Var) {
        if (this.h != 416 && !h(cw1Var)) {
            return false;
        }
        if (cw1Var != null) {
            j();
        }
        f();
        this.a.A(0L);
        this.a.E(0L);
        wr2 wr2VarC = ju0.d().c();
        this.f = wr2VarC;
        wr2VarC.P(this.a);
        wr2 wr2VarC2 = ot6.c(this.f, this.a);
        this.f = wr2VarC2;
        this.h = wr2VarC2.w();
        return true;
    }

    public final void b(ob2 ob2Var) {
        wr2 wr2Var = this.f;
        if (wr2Var != null) {
            try {
                wr2Var.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (ob2Var != null) {
            try {
                try {
                    n(ob2Var);
                } catch (Throwable th) {
                    try {
                        ob2Var.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        if (ob2Var != null) {
            try {
                ob2Var.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    public final String c(InputStream inputStream) throws Throwable {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (IOException unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException | NullPointerException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException unused3) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException | NullPointerException unused4) {
            }
        }
        return sb.toString();
    }

    public final void e() {
        cw1 cw1Var = new cw1();
        cw1Var.m(this.a.n());
        cw1Var.p(this.a.y());
        cw1Var.k(this.i);
        cw1Var.i(this.a.m());
        cw1Var.l(this.a.p());
        cw1Var.j(this.a.o());
        cw1Var.o(this.g);
        cw1Var.n(System.currentTimeMillis());
        ju0.d().b().d(cw1Var);
    }

    public final void f() {
        File file = new File(this.k);
        if (file.exists()) {
            file.delete();
        }
    }

    public final cw1 g() {
        return ju0.d().b().b(this.a.n());
    }

    public final boolean h(cw1 cw1Var) {
        return (this.i == null || cw1Var == null || cw1Var.c() == null || cw1Var.c().equals(this.i)) ? false : true;
    }

    public final boolean i() {
        int i = this.h;
        return i >= 200 && i < 300;
    }

    public final void j() {
        ju0.d().b().remove(this.a.n());
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x021b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:10:0x0022, B:12:0x0049, B:14:0x004f, B:21:0x006b, B:22:0x0079, B:24:0x0090, B:27:0x0099, B:29:0x00a1, B:30:0x00a5, B:34:0x00c7, B:36:0x00cd, B:37:0x00f4, B:39:0x0103, B:40:0x0106, B:42:0x010c, B:43:0x0119, B:46:0x011f, B:47:0x0122, B:49:0x012a, B:50:0x012f, B:52:0x0137, B:53:0x013c, B:55:0x0153, B:57:0x0159, B:59:0x0163, B:61:0x016d, B:62:0x0171, B:63:0x0174, B:65:0x017e, B:67:0x0188, B:68:0x0193, B:70:0x019b, B:71:0x01a0, B:73:0x01a8, B:74:0x01ad, B:76:0x01b7, B:78:0x01d3, B:80:0x01dc, B:82:0x01fe, B:83:0x0203, B:85:0x020d, B:87:0x0217, B:89:0x021b, B:90:0x021e), top: B:95:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.jd5 k() {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.rw1.k():com.zepto.jd5");
    }

    public final void l() {
        this.a.w();
        h76 h76Var = h76.QUEUED;
    }

    public final void m() {
        this.j = this.h == 206;
    }

    public final void n(ob2 ob2Var) {
        try {
            ob2Var.b();
            if (this.j) {
                ju0.d().b().a(this.a.n(), this.a.o(), System.currentTimeMillis());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void o(ob2 ob2Var) {
        long jO = this.a.o();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jO - this.c;
        long j2 = jCurrentTimeMillis - this.b;
        if (j <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH || j2 <= 2000) {
            return;
        }
        n(ob2Var);
        this.c = jO;
        this.b = jCurrentTimeMillis;
    }
}
