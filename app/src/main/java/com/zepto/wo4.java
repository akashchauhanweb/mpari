package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class wo4 extends gq4 {
    public wo4(InputStream inputStream, pq4 pq4Var) {
        super(inputStream, pq4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.DeflaterOutputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // com.zepto.gq4, com.zepto.uo4, com.zepto.rp4
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
        outputStream.write(gq4.u);
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
        outputStream.write(gq4.v);
    }

    public wo4(byte[] bArr) {
        super(bArr);
    }
}
