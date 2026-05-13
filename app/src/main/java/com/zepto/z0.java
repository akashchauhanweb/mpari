package com.zepto;

import com.zepto.wx;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 extends u0 implements Iterable {
    public static final j1 f = new a(z0.class, 17);
    public final a0[] c;
    public final boolean e;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 c(x0 x0Var) {
            return x0Var.p0();
        }
    }

    public class b implements Enumeration {
        public int a = 0;

        public b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.a < z0.this.c.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.a;
            a0[] a0VarArr = z0.this.c;
            if (i >= a0VarArr.length) {
                throw new NoSuchElementException();
            }
            this.a = i + 1;
            return a0VarArr[i];
        }
    }

    public class c implements a1 {
        public int c = 0;
        public final /* synthetic */ int e;

        public c(int i) {
            this.e = i;
        }

        @Override // com.zepto.a0
        public u0 m() {
            return z0.this;
        }

        @Override // com.zepto.ey2
        public u0 r() {
            return z0.this;
        }
    }

    public z0() {
        this.c = b0.d;
        this.e = true;
    }

    public static byte[] g0(a0 a0Var) {
        try {
            return a0Var.m().w("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static z0 h0(e1 e1Var, boolean z) {
        return (z0) f.e(e1Var, z);
    }

    public static boolean j0(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & (-33);
        int i2 = bArr2[0] & (-33);
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b2 = bArr[i3];
            byte b3 = bArr2[i3];
            if (b2 != b3) {
                return (b2 & UByte.MAX_VALUE) < (b3 & UByte.MAX_VALUE);
            }
        }
        return (bArr[iMin] & UByte.MAX_VALUE) <= (bArr2[iMin] & UByte.MAX_VALUE);
    }

    public static void l0(a0[] a0VarArr) {
        int i;
        int length = a0VarArr.length;
        if (length < 2) {
            return;
        }
        a0 a0Var = a0VarArr[0];
        a0 a0Var2 = a0VarArr[1];
        byte[] bArrG0 = g0(a0Var);
        byte[] bArrG02 = g0(a0Var2);
        if (j0(bArrG02, bArrG0)) {
            a0Var2 = a0Var;
            a0Var = a0Var2;
            bArrG02 = bArrG0;
            bArrG0 = bArrG02;
        }
        for (int i2 = 2; i2 < length; i2++) {
            a0 a0Var3 = a0VarArr[i2];
            byte[] bArrG03 = g0(a0Var3);
            if (j0(bArrG02, bArrG03)) {
                a0VarArr[i2 - 2] = a0Var;
                a0Var = a0Var2;
                bArrG0 = bArrG02;
                a0Var2 = a0Var3;
                bArrG02 = bArrG03;
            } else if (j0(bArrG0, bArrG03)) {
                a0VarArr[i2 - 2] = a0Var;
                a0Var = a0Var3;
                bArrG0 = bArrG03;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    a0 a0Var4 = a0VarArr[i3 - 2];
                    if (j0(g0(a0Var4), bArrG03)) {
                        break;
                    }
                    a0VarArr[i] = a0Var4;
                    i3 = i;
                }
                a0VarArr[i] = a0Var3;
            }
        }
        a0VarArr[length - 2] = a0Var;
        a0VarArr[length - 1] = a0Var2;
    }

    @Override // com.zepto.u0
    public boolean D() {
        return true;
    }

    @Override // com.zepto.u0
    public u0 e0() {
        a0[] a0VarArr;
        if (this.e) {
            a0VarArr = this.c;
        } else {
            a0VarArr = (a0[]) this.c.clone();
            l0(a0VarArr);
        }
        return new e51(true, a0VarArr);
    }

    @Override // com.zepto.u0
    public u0 f0() {
        return new pb1(this.e, this.c);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        int length = this.c.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += this.c[length].m().hashCode();
        }
    }

    public Enumeration i0() {
        return new b();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new wx.a(m0());
    }

    public a1 k0() {
        return new c(size());
    }

    public a0[] m0() {
        return b0.b(this.c);
    }

    public int size() {
        return this.c.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.c[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (!(u0Var instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) u0Var;
        int size = size();
        if (z0Var.size() != size) {
            return false;
        }
        e51 e51Var = (e51) e0();
        e51 e51Var2 = (e51) z0Var.e0();
        for (int i = 0; i < size; i++) {
            u0 u0VarM = e51Var.c[i].m();
            u0 u0VarM2 = e51Var2.c[i].m();
            if (u0VarM != u0VarM2 && !u0VarM.z(u0VarM2)) {
                return false;
            }
        }
        return true;
    }

    public z0(b0 b0Var, boolean z) {
        a0[] a0VarArrG;
        if (b0Var == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z || b0Var.f() < 2) {
            a0VarArrG = b0Var.g();
        } else {
            a0VarArrG = b0Var.c();
            l0(a0VarArrG);
        }
        this.c = a0VarArrG;
        this.e = z || a0VarArrG.length < 2;
    }

    public z0(boolean z, a0[] a0VarArr) {
        this.c = a0VarArr;
        this.e = z || a0VarArr.length < 2;
    }
}
