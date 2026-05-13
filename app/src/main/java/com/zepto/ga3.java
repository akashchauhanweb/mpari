package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ga3 extends fa3 {
    public static a o;
    public static a[] p;
    public final byte[] e;
    public final ja3 f;
    public final ca3 g;
    public final int h;
    public final byte[] i;
    public final Map j;
    public final int k;
    public final wj1 l;
    public int m;
    public ha3 n;

    public static class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    static {
        a aVar = new a(1);
        o = aVar;
        a[] aVarArr = new a[129];
        p = aVarArr;
        aVarArr[1] = aVar;
        int i = 2;
        while (true) {
            a[] aVarArr2 = p;
            if (i >= aVarArr2.length) {
                return;
            }
            aVarArr2[i] = new a(i);
            i++;
        }
    }

    public ga3(ja3 ja3Var, ca3 ca3Var, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f = ja3Var;
        this.g = ca3Var;
        this.m = i;
        this.e = wx.d(bArr);
        this.h = i2;
        this.i = wx.d(bArr2);
        this.k = 1 << (ja3Var.c() + 1);
        this.j = new WeakHashMap();
        this.l = ak1.a(ja3Var.b());
    }

    public static ga3 e(Object obj) throws Throwable {
        if (obj instanceof ga3) {
            return (ga3) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("expected version 0 lms private key");
            }
            ja3 ja3VarE = ja3.e(dataInputStream.readInt());
            ca3 ca3VarE = ca3.e(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i = dataInputStream.readInt();
            int i2 = dataInputStream.readInt();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IllegalStateException("secret length less than zero");
            }
            if (i3 <= dataInputStream.available()) {
                byte[] bArr2 = new byte[i3];
                dataInputStream.readFully(bArr2);
                return new ga3(ja3VarE, ca3VarE, i, bArr, i2, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream.available());
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return e(x76.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                ga3 ga3VarE = e(dataInputStream3);
                dataInputStream3.close();
                return ga3VarE;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ga3 f(byte[] bArr, byte[] bArr2) throws Throwable {
        ga3 ga3VarE = e(bArr);
        ga3VarE.n = ha3.a(bArr2);
        return ga3VarE;
    }

    public final byte[] a(int i) {
        int iC = 1 << j().c();
        if (i >= iC) {
            em3.a(d(), this.l);
            em3.c(i, this.l);
            em3.b((short) -32126, this.l);
            em3.a(ka3.a(h(), d(), i - iC, g()), this.l);
            byte[] bArr = new byte[this.l.c()];
            this.l.a(bArr, 0);
            return bArr;
        }
        int i2 = i * 2;
        byte[] bArrB = b(i2);
        byte[] bArrB2 = b(i2 + 1);
        em3.a(d(), this.l);
        em3.c(i, this.l);
        em3.b((short) -31869, this.l);
        em3.a(bArrB, this.l);
        em3.a(bArrB2, this.l);
        byte[] bArr2 = new byte[this.l.c()];
        this.l.a(bArr2, 0);
        return bArr2;
    }

    public byte[] b(int i) {
        if (i >= this.k) {
            return a(i);
        }
        a[] aVarArr = p;
        return c(i < aVarArr.length ? aVarArr[i] : new a(i));
    }

    public final byte[] c(a aVar) {
        synchronized (this.j) {
            try {
                byte[] bArr = (byte[]) this.j.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArrA = a(aVar.a);
                this.j.put(aVar, bArrA);
                return bArrA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] d() {
        return wx.d(this.e);
    }

    public boolean equals(Object obj) {
        ha3 ha3Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ga3 ga3Var = (ga3) obj;
        if (this.m != ga3Var.m || this.h != ga3Var.h || !wx.a(this.e, ga3Var.e)) {
            return false;
        }
        ja3 ja3Var = this.f;
        if (ja3Var == null ? ga3Var.f != null : !ja3Var.equals(ga3Var.f)) {
            return false;
        }
        ca3 ca3Var = this.g;
        if (ca3Var == null ? ga3Var.g != null : !ca3Var.equals(ga3Var.g)) {
            return false;
        }
        if (!wx.a(this.i, ga3Var.i)) {
            return false;
        }
        ha3 ha3Var2 = this.n;
        if (ha3Var2 == null || (ha3Var = ga3Var.n) == null) {
            return true;
        }
        return ha3Var2.equals(ha3Var);
    }

    public byte[] g() {
        return wx.d(this.i);
    }

    @Override // com.zepto.fa3, com.zepto.u12
    public byte[] getEncoded() {
        return vu0.f().i(0).i(this.f.f()).i(this.g.f()).d(this.e).i(this.m).i(this.h).i(this.i.length).d(this.i).b();
    }

    public ca3 h() {
        return this.g;
    }

    public int hashCode() {
        int iK = ((this.m * 31) + wx.k(this.e)) * 31;
        ja3 ja3Var = this.f;
        int iHashCode = (iK + (ja3Var != null ? ja3Var.hashCode() : 0)) * 31;
        ca3 ca3Var = this.g;
        int iHashCode2 = (((((iHashCode + (ca3Var != null ? ca3Var.hashCode() : 0)) * 31) + this.h) * 31) + wx.k(this.i)) * 31;
        ha3 ha3Var = this.n;
        return iHashCode2 + (ha3Var != null ? ha3Var.hashCode() : 0);
    }

    public ha3 i() {
        ha3 ha3Var;
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new ha3(this.f, this.g, c(o), this.e);
                }
                ha3Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ha3Var;
    }

    public ja3 j() {
        return this.f;
    }
}
