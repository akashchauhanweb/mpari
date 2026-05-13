package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ha3 extends fa3 {
    public final ja3 e;
    public final ca3 f;
    public final byte[] g;
    public final byte[] h;

    public ha3(ja3 ja3Var, ca3 ca3Var, byte[] bArr, byte[] bArr2) {
        super(false);
        this.e = ja3Var;
        this.f = ca3Var;
        this.g = wx.d(bArr2);
        this.h = wx.d(bArr);
    }

    public static ha3 a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof ha3) {
            return (ha3) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            ja3 ja3VarE = ja3.e(dataInputStream2.readInt());
            ca3 ca3VarE = ca3.e(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[ja3VarE.d()];
            dataInputStream2.readFully(bArr2);
            return new ha3(ja3VarE, ca3VarE, bArr2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(x76.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream3 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
        }
        try {
            ha3 ha3VarA = a(dataInputStream);
            dataInputStream.close();
            return ha3VarA;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 != null) {
                dataInputStream3.close();
            }
            throw th;
        }
    }

    public byte[] b() {
        return vu0.f().i(this.e.f()).i(this.f.f()).d(this.g).d(this.h).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ha3 ha3Var = (ha3) obj;
        if (this.e.equals(ha3Var.e) && this.f.equals(ha3Var.f) && wx.a(this.g, ha3Var.g)) {
            return wx.a(this.h, ha3Var.h);
        }
        return false;
    }

    @Override // com.zepto.fa3, com.zepto.u12
    public byte[] getEncoded() {
        return b();
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.f.hashCode()) * 31) + wx.k(this.g)) * 31) + wx.k(this.h);
    }
}
