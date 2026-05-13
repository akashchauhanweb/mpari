package com.zepto;

import com.zepto.wx;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends u0 implements Iterable {
    public static final j1 e = new a(x0.class, 16);
    public a0[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 c(x0 x0Var) {
            return x0Var;
        }
    }

    public class b implements Enumeration {
        public int a = 0;

        public b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.a < x0.this.c.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.a;
            a0[] a0VarArr = x0.this.c;
            if (i >= a0VarArr.length) {
                throw new NoSuchElementException();
            }
            this.a = i + 1;
            return a0VarArr[i];
        }
    }

    public class c implements y0 {
        public int c = 0;
        public final /* synthetic */ int e;

        public c(int i) {
            this.e = i;
        }

        @Override // com.zepto.a0
        public u0 m() {
            return x0.this;
        }

        @Override // com.zepto.ey2
        public u0 r() {
            return x0.this;
        }

        @Override // com.zepto.y0
        public a0 readObject() {
            int i = this.e;
            int i2 = this.c;
            if (i == i2) {
                return null;
            }
            a0[] a0VarArr = x0.this.c;
            this.c = i2 + 1;
            a0 a0Var = a0VarArr[i2];
            return a0Var instanceof x0 ? ((x0) a0Var).l0() : a0Var instanceof z0 ? ((z0) a0Var).k0() : a0Var;
        }
    }

    public x0() {
        this.c = b0.d;
    }

    public static x0 i0(Object obj) {
        if (obj == null || (obj instanceof x0)) {
            return (x0) obj;
        }
        if (obj instanceof a0) {
            u0 u0VarM = ((a0) obj).m();
            if (u0VarM instanceof x0) {
                return (x0) u0VarM;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (x0) e.b((byte[]) obj);
            } catch (IOException e2) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e2.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.zepto.u0
    public boolean D() {
        return true;
    }

    @Override // com.zepto.u0
    public u0 e0() {
        return new d51(this.c, false);
    }

    @Override // com.zepto.u0
    public u0 f0() {
        return new fa1(this.c, false);
    }

    public x[] g0() {
        int size = size();
        x[] xVarArr = new x[size];
        for (int i = 0; i < size; i++) {
            xVarArr[i] = x.j0(this.c[i]);
        }
        return xVarArr;
    }

    public q0[] h0() {
        int size = size();
        q0[] q0VarArr = new q0[size];
        for (int i = 0; i < size; i++) {
            q0VarArr[i] = q0.i0(this.c[i]);
        }
        return q0VarArr;
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
            iHashCode = (iHashCode * 257) ^ this.c[length].m().hashCode();
        }
    }

    public Iterator iterator() {
        return new wx.a(this.c);
    }

    public a0 j0(int i) {
        return this.c[i];
    }

    public Enumeration k0() {
        return new b();
    }

    public y0 l0() {
        return new c(size());
    }

    public abstract x m0();

    public abstract e0 n0();

    public abstract q0 o0();

    public abstract z0 p0();

    public a0[] q0() {
        return this.c;
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
        if (!(u0Var instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) u0Var;
        int size = size();
        if (x0Var.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            u0 u0VarM = this.c[i].m();
            u0 u0VarM2 = x0Var.c[i].m();
            if (u0VarM != u0VarM2 && !u0VarM.z(u0VarM2)) {
                return false;
            }
        }
        return true;
    }

    public x0(a0 a0Var) {
        if (a0Var == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.c = new a0[]{a0Var};
    }

    public x0(b0 b0Var) {
        if (b0Var == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.c = b0Var.g();
    }

    public x0(a0[] a0VarArr, boolean z) {
        this.c = z ? b0.b(a0VarArr) : a0VarArr;
    }
}
