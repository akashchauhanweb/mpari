package com.zepto;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class s0 {
    public OutputStream a;

    public s0(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static s0 a(OutputStream outputStream) {
        return new s0(outputStream);
    }

    public static s0 b(OutputStream outputStream, String str) {
        return str.equals("DER") ? new b51(outputStream) : str.equals("DL") ? new c91(outputStream) : new s0(outputStream);
    }

    public static int f(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int g(boolean z, int i) {
        return (z ? 1 : 0) + f(i) + i;
    }

    public static int h(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public void c() {
    }

    public b51 d() {
        return new b51(this.a);
    }

    public c91 e() {
        return new c91(this.a);
    }

    public final void i(int i) throws IOException {
        this.a.write(i);
    }

    public final void j(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    public final void k(int i) throws IOException {
        if (i < 128) {
            i(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                j(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void l(a0[] a0VarArr) {
        for (a0 a0Var : a0VarArr) {
            a0Var.m().B(this, true);
        }
    }

    public final void m(boolean z, int i, byte b) throws IOException {
        s(z, i);
        k(1);
        i(b);
    }

    public final void n(boolean z, int i, byte b, byte[] bArr, int i2, int i3) throws IOException {
        s(z, i);
        k(i3 + 1);
        i(b);
        j(bArr, i2, i3);
    }

    public final void o(boolean z, int i, byte[] bArr) {
        s(z, i);
        k(bArr.length);
        j(bArr, 0, bArr.length);
    }

    public final void p(boolean z, int i, byte[] bArr, int i2, int i3) throws IOException {
        s(z, i);
        k(i3);
        j(bArr, i2, i3);
    }

    public final void q(boolean z, int i, byte[] bArr, int i2, int i3, byte b) throws IOException {
        s(z, i);
        k(i3 + 1);
        j(bArr, i2, i3);
        i(b);
    }

    public final void r(boolean z, int i, a0[] a0VarArr) throws IOException {
        s(z, i);
        i(128);
        l(a0VarArr);
        i(0);
        i(0);
    }

    public final void s(boolean z, int i) throws IOException {
        if (z) {
            i(i);
        }
    }

    public final void t(boolean z, int i, int i2) throws IOException {
        if (z) {
            if (i2 < 31) {
                i(i | i2);
                return;
            }
            byte[] bArr = new byte[6];
            int i3 = 5;
            bArr[5] = (byte) (i2 & 127);
            while (i2 > 127) {
                i2 >>>= 7;
                i3--;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            }
            int i4 = i3 - 1;
            bArr[i4] = (byte) (31 | i);
            j(bArr, i4, 6 - i4);
        }
    }

    public void u(u0 u0Var, boolean z) {
        u0Var.B(this, z);
    }

    public void v(u0[] u0VarArr) {
        for (u0 u0Var : u0VarArr) {
            u0Var.B(this, true);
        }
    }
}
