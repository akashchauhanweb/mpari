package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class da3 implements u12 {
    public final ca3 c;
    public final byte[] e;
    public final byte[] f;

    public da3(ca3 ca3Var, byte[] bArr, byte[] bArr2) {
        this.c = ca3Var;
        this.e = bArr;
        this.f = bArr2;
    }

    public static da3 a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof da3) {
            return (da3) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            ca3 ca3VarE = ca3.e(dataInputStream2.readInt());
            byte[] bArr = new byte[ca3VarE.c()];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[ca3VarE.d() * ca3VarE.c()];
            dataInputStream2.readFully(bArr2);
            return new da3(ca3VarE, bArr, bArr2);
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
            da3 da3VarA = a(dataInputStream);
            dataInputStream.close();
            return da3VarA;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 != null) {
                dataInputStream3.close();
            }
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        da3 da3Var = (da3) obj;
        ca3 ca3Var = this.c;
        if (ca3Var == null ? da3Var.c != null : !ca3Var.equals(da3Var.c)) {
            return false;
        }
        if (Arrays.equals(this.e, da3Var.e)) {
            return Arrays.equals(this.f, da3Var.f);
        }
        return false;
    }

    @Override // com.zepto.u12
    public byte[] getEncoded() {
        return vu0.f().i(this.c.f()).d(this.e).d(this.f).b();
    }

    public int hashCode() {
        ca3 ca3Var = this.c;
        return ((((ca3Var != null ? ca3Var.hashCode() : 0) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f);
    }
}
