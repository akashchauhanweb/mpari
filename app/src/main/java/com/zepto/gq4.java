package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class gq4 extends uo4 {
    public static final byte[] u;
    public static final byte[] v;
    public static final int w;
    public InputStream p;
    public gp4 q;
    public pq4 s;
    public int t;
    public boolean m = false;
    public int n = 0;
    public ByteArrayOutputStream o = null;
    public int r = -1;

    static {
        byte[] bArrF = wt1.f("stream\n");
        u = bArrF;
        byte[] bArrF2 = wt1.f("\nendstream");
        v = bArrF2;
        w = bArrF.length + bArrF2.length;
    }

    public gq4(byte[] bArr) {
        this.e = 7;
        this.c = bArr;
        this.t = bArr.length;
        r(lp4.l5, new op4(bArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.DeflaterOutputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // com.zepto.uo4, com.zepto.rp4
    public void k(pq4 pq4Var, OutputStream outputStream) throws IOException {
        Deflater deflater;
        OutputStream deflaterOutputStream;
        ?? r3;
        if (this.p != null && this.m) {
            r(lp4.c3, lp4.s3);
        }
        if (pq4Var != null) {
            pq4Var.A();
        }
        m(lp4.l5);
        x(pq4Var, outputStream);
        outputStream.write(u);
        if (this.p != null) {
            this.t = 0;
            sj4 sj4Var = new sj4(outputStream);
            if (this.m) {
                deflater = new Deflater(this.n);
                deflaterOutputStream = new DeflaterOutputStream(sj4Var, deflater, 32768);
                r3 = deflaterOutputStream;
            } else {
                deflater = null;
                deflaterOutputStream = sj4Var;
                r3 = 0;
            }
            byte[] bArr = new byte[4192];
            while (true) {
                int i = this.p.read(bArr);
                if (i <= 0) {
                    break;
                }
                deflaterOutputStream.write(bArr, 0, i);
                this.t += i;
            }
            if (r3 != 0) {
                r3.finish();
                deflater.end();
            }
            this.r = sj4Var.d();
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.o;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.writeTo(outputStream);
            } else {
                outputStream.write(this.c);
            }
        }
        outputStream.write(v);
    }

    @Override // com.zepto.uo4, com.zepto.rp4
    public String toString() {
        lp4 lp4Var = lp4.sa;
        if (m(lp4Var) == null) {
            return "Stream";
        }
        return "Stream of type: " + m(lp4Var);
    }

    public void v(int i) {
        if (bu1.p && !this.m) {
            this.n = i;
            if (this.p != null) {
                this.m = true;
                return;
            }
            lp4 lp4Var = lp4.c3;
            rp4 rp4VarA = bq4.a(m(lp4Var));
            if (rp4VarA != null) {
                if (rp4VarA.g()) {
                    if (lp4.s3.equals(rp4VarA)) {
                        return;
                    }
                } else {
                    if (!rp4VarA.d()) {
                        throw new RuntimeException(dt3.b("stream.could.not.be.compressed.filter.is.not.a.name.or.array", new Object[0]));
                    }
                    if (((ko4) rp4VarA).q(lp4.s3)) {
                        return;
                    }
                }
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater(i);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                ByteArrayOutputStream byteArrayOutputStream2 = this.o;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.writeTo(deflaterOutputStream);
                } else {
                    deflaterOutputStream.write(this.c);
                }
                deflaterOutputStream.close();
                deflater.end();
                this.o = byteArrayOutputStream;
                this.c = null;
                r(lp4.l5, new op4(byteArrayOutputStream.size()));
                if (rp4VarA == null) {
                    r(lp4Var, lp4.s3);
                } else {
                    ko4 ko4Var = new ko4(rp4VarA);
                    ko4Var.m(lp4.s3);
                    r(lp4Var, ko4Var);
                }
                this.m = true;
            } catch (IOException e) {
                throw new p52(e);
            }
        }
    }

    public int w() {
        return this.t;
    }

    public void x(pq4 pq4Var, OutputStream outputStream) {
        super.k(pq4Var, outputStream);
    }

    public void y() throws IOException {
        if (this.p == null) {
            throw new UnsupportedOperationException(dt3.b("writelength.can.only.be.called.in.a.contructed.pdfstream.inputstream.pdfwriter", new Object[0]));
        }
        int i = this.r;
        if (i == -1) {
            throw new IOException(dt3.b("writelength.can.only.be.called.after.output.of.the.stream.body", new Object[0]));
        }
        this.s.p(new op4(i), this.q, false);
    }

    public gq4(InputStream inputStream, pq4 pq4Var) {
        this.e = 7;
        this.p = inputStream;
        this.s = pq4Var;
        gp4 gp4VarK = pq4Var.K();
        this.q = gp4VarK;
        r(lp4.l5, gp4VarK);
    }

    public gq4() {
        this.e = 7;
    }
}
