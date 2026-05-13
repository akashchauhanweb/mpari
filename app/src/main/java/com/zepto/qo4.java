package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class qo4 extends gq4 {
    public static final byte[] x = wt1.f("q\n");
    public static final byte[] y = wt1.f("Q\n");
    public static final byte[] z = wt1.f("0 1 -1 0 ");
    public static final byte[] A = wt1.f("-1 0 0 -1 ");
    public static final byte[] B = wt1.f("0 -1 1 0 ");
    public static final byte[] C = wt1.f(" cm\n");

    public qo4(po4 po4Var, po4 po4Var2, po4 po4Var3, po4 po4Var4, i65 i65Var) throws y30 {
        Deflater deflater;
        OutputStream deflaterOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.o = byteArrayOutputStream;
            if (bu1.p) {
                this.m = true;
                this.n = po4Var3.s().u();
                Deflater deflater2 = new Deflater(this.n);
                deflater = deflater2;
                deflaterOutputStream = new DeflaterOutputStream(this.o, deflater2);
            } else {
                deflater = null;
                deflaterOutputStream = byteArrayOutputStream;
            }
            int iV = i65Var.v();
            if (iV == 90) {
                deflaterOutputStream.write(z);
                deflaterOutputStream.write(wt1.f(o80.e0(i65Var.w())));
                deflaterOutputStream.write(32);
                deflaterOutputStream.write(48);
                deflaterOutputStream.write(C);
            } else if (iV == 180) {
                deflaterOutputStream.write(A);
                deflaterOutputStream.write(wt1.f(o80.e0(i65Var.s())));
                deflaterOutputStream.write(32);
                deflaterOutputStream.write(wt1.f(o80.e0(i65Var.w())));
                deflaterOutputStream.write(C);
            } else if (iV == 270) {
                deflaterOutputStream.write(B);
                deflaterOutputStream.write(48);
                deflaterOutputStream.write(32);
                deflaterOutputStream.write(wt1.f(o80.e0(i65Var.s())));
                deflaterOutputStream.write(C);
            }
            if (po4Var.d0() > 0) {
                deflaterOutputStream.write(x);
                po4Var.p().z0(deflaterOutputStream);
                deflaterOutputStream.write(y);
            }
            if (po4Var2.d0() > 0) {
                deflaterOutputStream.write(x);
                po4Var2.p().z0(deflaterOutputStream);
                deflaterOutputStream.write(y);
            }
            if (po4Var3 != null) {
                deflaterOutputStream.write(x);
                po4Var3.p().z0(deflaterOutputStream);
                deflaterOutputStream.write(y);
            }
            if (po4Var4.d0() > 0) {
                po4Var4.p().z0(deflaterOutputStream);
            }
            deflaterOutputStream.close();
            if (deflater != null) {
                deflater.end();
            }
            r(lp4.l5, new op4(this.o.size()));
            if (this.m) {
                r(lp4.c3, lp4.s3);
            }
        } catch (Exception e) {
            throw new y30(e.getMessage());
        }
    }
}
