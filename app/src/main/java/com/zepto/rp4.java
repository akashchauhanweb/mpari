package com.zepto;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class rp4 {
    public byte[] c;
    public int e;

    public rp4(int i) {
        this.e = i;
    }

    public boolean a() {
        switch (this.e) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                return true;
            case 7:
            default:
                return false;
        }
    }

    public byte[] b() {
        return this.c;
    }

    public kk4 c() {
        return null;
    }

    public boolean d() {
        return this.e == 5;
    }

    public boolean e() {
        return this.e == 6;
    }

    public boolean f() {
        return this.e == 10;
    }

    public boolean g() {
        return this.e == 4;
    }

    public boolean h() {
        return this.e == 8;
    }

    public boolean i() {
        return this.e == 2;
    }

    public void j(String str) {
        this.c = xo4.c(str, null);
    }

    public void k(pq4 pq4Var, OutputStream outputStream) throws IOException {
        byte[] bArr = this.c;
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public int l() {
        return this.e;
    }

    public String toString() {
        byte[] bArr = this.c;
        return bArr == null ? super.toString() : xo4.d(bArr, null);
    }

    public rp4(int i, String str) {
        this.e = i;
        this.c = xo4.c(str, null);
    }

    public rp4(int i, byte[] bArr) {
        this.c = bArr;
        this.e = i;
    }
}
