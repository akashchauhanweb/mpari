package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class yk2 extends fa3 {
    public final int e;
    public final ha3 f;

    public yk2(int i, ha3 ha3Var) {
        super(false);
        this.e = i;
        this.f = ha3Var;
    }

    public static yk2 a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof yk2) {
            return (yk2) obj;
        }
        if (obj instanceof DataInputStream) {
            return new yk2(((DataInputStream) obj).readInt(), ha3.a(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(x76.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
        }
        try {
            yk2 yk2VarA = a(dataInputStream);
            dataInputStream.close();
            return yk2VarA;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                dataInputStream2.close();
            }
            throw th;
        }
    }

    public int b() {
        return this.e;
    }

    public ha3 c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yk2 yk2Var = (yk2) obj;
        if (this.e != yk2Var.e) {
            return false;
        }
        return this.f.equals(yk2Var.f);
    }

    @Override // com.zepto.fa3, com.zepto.u12
    public byte[] getEncoded() {
        return vu0.f().i(this.e).d(this.f.getEncoded()).b();
    }

    public int hashCode() {
        return (this.e * 31) + this.f.hashCode();
    }
}
