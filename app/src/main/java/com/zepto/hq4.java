package com.zepto;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public class hq4 extends rp4 {
    public String f;
    public String g;
    public String h;
    public int i;
    public int j;
    public boolean k;

    public hq4() {
        super(3);
        this.f = "";
        this.g = null;
        this.h = "PDF";
        this.i = 0;
        this.j = 0;
        this.k = false;
    }

    @Override // com.zepto.rp4
    public byte[] b() {
        if (this.c == null) {
            String str = this.h;
            if (str != null && str.equals("UnicodeBig") && xo4.e(this.f)) {
                this.c = xo4.c(this.f, "PDF");
            } else {
                this.c = xo4.c(this.f, this.h);
            }
        }
        return this.c;
    }

    @Override // com.zepto.rp4
    public void k(pq4 pq4Var, OutputStream outputStream) throws IOException {
        byte[] bArrB = b();
        if (pq4Var != null) {
            pq4Var.A();
        }
        if (!this.k) {
            outputStream.write(po4.l(bArrB));
            return;
        }
        o80 o80Var = new o80();
        o80Var.e(Typography.less);
        for (byte b : bArrB) {
            o80Var.U(b);
        }
        o80Var.e(Typography.greater);
        outputStream.write(o80Var.y0());
    }

    @Override // com.zepto.rp4
    public String toString() {
        return this.f;
    }

    public hq4(String str) {
        super(3);
        this.g = null;
        this.h = "PDF";
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.f = str;
    }

    public hq4(String str, String str2) {
        super(3);
        this.g = null;
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.f = str;
        this.h = str2;
    }
}
