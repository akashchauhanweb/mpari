package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ia3 implements u12 {
    public final int c;
    public final da3 e;
    public final ja3 f;
    public final byte[][] g;

    public ia3(int i, da3 da3Var, ja3 ja3Var, byte[][] bArr) {
        this.c = i;
        this.e = da3Var;
        this.f = ja3Var;
        this.g = bArr;
    }

    public static ia3 a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof ia3) {
            return (ia3) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int i = dataInputStream2.readInt();
            da3 da3VarA = da3.a(obj);
            ja3 ja3VarE = ja3.e(dataInputStream2.readInt());
            int iC = ja3VarE.c();
            byte[][] bArr = new byte[iC][];
            for (int i2 = 0; i2 < iC; i2++) {
                byte[] bArr2 = new byte[ja3VarE.d()];
                bArr[i2] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new ia3(i, da3VarA, ja3VarE, bArr);
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
            ia3 ia3VarA = a(dataInputStream);
            dataInputStream.close();
            return ia3VarA;
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
        ia3 ia3Var = (ia3) obj;
        if (this.c != ia3Var.c) {
            return false;
        }
        da3 da3Var = this.e;
        if (da3Var == null ? ia3Var.e != null : !da3Var.equals(ia3Var.e)) {
            return false;
        }
        ja3 ja3Var = this.f;
        if (ja3Var == null ? ia3Var.f == null : ja3Var.equals(ia3Var.f)) {
            return Arrays.deepEquals(this.g, ia3Var.g);
        }
        return false;
    }

    @Override // com.zepto.u12
    public byte[] getEncoded() {
        return vu0.f().i(this.c).d(this.e.getEncoded()).i(this.f.f()).e(this.g).b();
    }

    public int hashCode() {
        int i = this.c * 31;
        da3 da3Var = this.e;
        int iHashCode = (i + (da3Var != null ? da3Var.hashCode() : 0)) * 31;
        ja3 ja3Var = this.f;
        return ((iHashCode + (ja3Var != null ? ja3Var.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.g);
    }
}
