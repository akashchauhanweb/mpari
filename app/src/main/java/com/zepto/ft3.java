package com.zepto;

import com.zepto.lx;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ft3 implements dp5 {
    public final at3 a;
    public final up6 b;
    public final boolean c;
    public final h72 d;

    public ft3(up6 up6Var, h72 h72Var, at3 at3Var) {
        this.b = up6Var;
        this.c = h72Var.e(at3Var);
        this.d = h72Var;
        this.a = at3Var;
    }

    private int k(up6 up6Var, Object obj) {
        return up6Var.i(up6Var.g(obj));
    }

    private void l(up6 up6Var, h72 h72Var, Object obj, d55 d55Var, g72 g72Var) {
        Object objF = up6Var.f(obj);
        mb2 mb2VarD = h72Var.d(obj);
        while (d55Var.o() != Integer.MAX_VALUE) {
            try {
                if (!n(d55Var, g72Var, h72Var, mb2VarD, up6Var, objF)) {
                    return;
                }
            } finally {
                up6Var.o(obj, objF);
            }
        }
    }

    public static ft3 m(up6 up6Var, h72 h72Var, at3 at3Var) {
        return new ft3(up6Var, h72Var, at3Var);
    }

    @Override // com.zepto.dp5
    public void a(Object obj, Object obj2) {
        mp5.F(this.b, obj, obj2);
        if (this.c) {
            mp5.D(this.d, obj, obj2);
        }
    }

    @Override // com.zepto.dp5
    public void b(Object obj, byte[] bArr, int i, int i2, lx.a aVar) {
        ri2 ri2Var = (ri2) obj;
        if (ri2Var.unknownFields == vp6.c()) {
            ri2Var.unknownFields = vp6.k();
        }
        wb0.a(obj);
        throw null;
    }

    @Override // com.zepto.dp5
    public void c(Object obj, nz7 nz7Var) {
        Iterator itF = this.d.c(obj).f();
        if (itF.hasNext()) {
            wb0.a(((Map.Entry) itF.next()).getKey());
            throw null;
        }
        o(this.b, obj, nz7Var);
    }

    @Override // com.zepto.dp5
    public void d(Object obj, d55 d55Var, g72 g72Var) {
        l(this.b, this.d, obj, d55Var, g72Var);
    }

    @Override // com.zepto.dp5
    public void e(Object obj) {
        this.b.j(obj);
        this.d.f(obj);
    }

    @Override // com.zepto.dp5
    public final boolean f(Object obj) {
        return this.d.c(obj).e();
    }

    @Override // com.zepto.dp5
    public boolean g(Object obj, Object obj2) {
        if (!this.b.g(obj).equals(this.b.g(obj2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(obj).equals(this.d.c(obj2));
        }
        return true;
    }

    @Override // com.zepto.dp5
    public int h(Object obj) {
        int iK = k(this.b, obj);
        return this.c ? iK + this.d.c(obj).b() : iK;
    }

    @Override // com.zepto.dp5
    public Object i() {
        at3 at3Var = this.a;
        return at3Var instanceof ri2 ? ((ri2) at3Var).J() : at3Var.e().D();
    }

    @Override // com.zepto.dp5
    public int j(Object obj) {
        int iHashCode = this.b.g(obj).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(obj).hashCode() : iHashCode;
    }

    public final boolean n(d55 d55Var, g72 g72Var, h72 h72Var, mb2 mb2Var, up6 up6Var, Object obj) throws b13 {
        int tag = d55Var.getTag();
        if (tag != zw7.a) {
            if (zw7.b(tag) != 2) {
                return d55Var.z();
            }
            Object objB = h72Var.b(g72Var, this.a, zw7.a(tag));
            if (objB == null) {
                return up6Var.m(obj, d55Var);
            }
            h72Var.h(d55Var, objB, g72Var, mb2Var);
            return true;
        }
        Object objB2 = null;
        int iW = 0;
        s80 s80VarU = null;
        while (d55Var.o() != Integer.MAX_VALUE) {
            int tag2 = d55Var.getTag();
            if (tag2 == zw7.c) {
                iW = d55Var.w();
                objB2 = h72Var.b(g72Var, this.a, iW);
            } else if (tag2 == zw7.d) {
                if (objB2 != null) {
                    h72Var.h(d55Var, objB2, g72Var, mb2Var);
                } else {
                    s80VarU = d55Var.u();
                }
            } else if (!d55Var.z()) {
                break;
            }
        }
        if (d55Var.getTag() != zw7.b) {
            throw b13.b();
        }
        if (s80VarU != null) {
            if (objB2 != null) {
                h72Var.i(s80VarU, objB2, g72Var, mb2Var);
            } else {
                up6Var.d(obj, iW, s80VarU);
            }
        }
        return true;
    }

    public final void o(up6 up6Var, Object obj, nz7 nz7Var) {
        up6Var.s(up6Var.g(obj), nz7Var);
    }
}
