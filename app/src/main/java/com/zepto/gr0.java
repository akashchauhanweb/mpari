package com.zepto;

import com.zepto.b13;
import com.zepto.kp3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class gr0 implements d55 {
    public final fr0 a;
    public int b;
    public int c;
    public int d = 0;

    public gr0(fr0 fr0Var) {
        fr0 fr0Var2 = (fr0) x03.b(fr0Var, "input");
        this.a = fr0Var2;
        fr0Var2.d = this;
    }

    public static gr0 M(fr0 fr0Var) {
        gr0 gr0Var = fr0Var.d;
        return gr0Var != null ? gr0Var : new gr0(fr0Var);
    }

    @Override // com.zepto.d55
    public int A() throws b13.a {
        T(5);
        return this.a.v();
    }

    @Override // com.zepto.d55
    public void B(List list) throws b13.a {
        int iB;
        if (zw7.b(this.b) != 2) {
            throw b13.e();
        }
        do {
            list.add(u());
            if (this.a.e()) {
                return;
            } else {
                iB = this.a.B();
            }
        } while (iB == this.b);
        this.d = iB;
    }

    @Override // com.zepto.d55
    public void C(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof hu1)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 1) {
                do {
                    list.add(Double.valueOf(this.a.o()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iC = this.a.C();
            V(iC);
            int iD = this.a.d() + iC;
            do {
                list.add(Double.valueOf(this.a.o()));
            } while (this.a.d() < iD);
            return;
        }
        hu1 hu1Var = (hu1) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 1) {
            do {
                hu1Var.m(this.a.o());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iC2 = this.a.C();
        V(iC2);
        int iD2 = this.a.d() + iC2;
        do {
            hu1Var.m(this.a.o());
        } while (this.a.d() < iD2);
    }

    @Override // com.zepto.d55
    public void D(Map map, kp3.a aVar, g72 g72Var) throws b13.a {
        T(2);
        this.a.l(this.a.C());
        throw null;
    }

    @Override // com.zepto.d55
    public void E(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof eo3)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iD = this.a.d() + this.a.C();
            do {
                list.add(Long.valueOf(this.a.u()));
            } while (this.a.d() < iD);
            S(iD);
            return;
        }
        eo3 eo3Var = (eo3) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 0) {
            do {
                eo3Var.m(this.a.u());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iD2 = this.a.d() + this.a.C();
        do {
            eo3Var.m(this.a.u());
        } while (this.a.d() < iD2);
        S(iD2);
    }

    @Override // com.zepto.d55
    public void F(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof eo3)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iC = this.a.C();
            V(iC);
            int iD = this.a.d() + iC;
            do {
                list.add(Long.valueOf(this.a.w()));
            } while (this.a.d() < iD);
            return;
        }
        eo3 eo3Var = (eo3) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 1) {
            do {
                eo3Var.m(this.a.w());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iC2 = this.a.C();
        V(iC2);
        int iD2 = this.a.d() + iC2;
        do {
            eo3Var.m(this.a.w());
        } while (this.a.d() < iD2);
    }

    @Override // com.zepto.d55
    public long G() throws b13.a {
        T(0);
        return this.a.u();
    }

    @Override // com.zepto.d55
    public String H() throws b13.a {
        T(2);
        return this.a.A();
    }

    @Override // com.zepto.d55
    public void I(List list, dp5 dp5Var, g72 g72Var) throws b13.a {
        int iB;
        if (zw7.b(this.b) != 3) {
            throw b13.e();
        }
        int i = this.b;
        do {
            list.add(P(dp5Var, g72Var));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                iB = this.a.B();
            }
        } while (iB == i);
        this.d = iB;
    }

    @Override // com.zepto.d55
    public void J(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof eo3)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.r()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iC = this.a.C();
            V(iC);
            int iD = this.a.d() + iC;
            do {
                list.add(Long.valueOf(this.a.r()));
            } while (this.a.d() < iD);
            return;
        }
        eo3 eo3Var = (eo3) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 1) {
            do {
                eo3Var.m(this.a.r());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iC2 = this.a.C();
        V(iC2);
        int iD2 = this.a.d() + iC2;
        do {
            eo3Var.m(this.a.r());
        } while (this.a.d() < iD2);
    }

    @Override // com.zepto.d55
    public void K(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof j03)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.t()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iD = this.a.d() + this.a.C();
            do {
                list.add(Integer.valueOf(this.a.t()));
            } while (this.a.d() < iD);
            S(iD);
            return;
        }
        j03 j03Var = (j03) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 0) {
            do {
                j03Var.m(this.a.t());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iD2 = this.a.d() + this.a.C();
        do {
            j03Var.m(this.a.t());
        } while (this.a.d() < iD2);
        S(iD2);
    }

    @Override // com.zepto.d55
    public void L(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof j03)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.p()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iD = this.a.d() + this.a.C();
            do {
                list.add(Integer.valueOf(this.a.p()));
            } while (this.a.d() < iD);
            S(iD);
            return;
        }
        j03 j03Var = (j03) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 0) {
            do {
                j03Var.m(this.a.p());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iD2 = this.a.d() + this.a.C();
        do {
            j03Var.m(this.a.p());
        } while (this.a.d() < iD2);
        S(iD2);
    }

    public final void N(Object obj, dp5 dp5Var, g72 g72Var) {
        int i = this.c;
        this.c = zw7.c(zw7.a(this.b), 4);
        try {
            dp5Var.d(obj, this, g72Var);
            if (this.b == this.c) {
            } else {
                throw b13.h();
            }
        } finally {
            this.c = i;
        }
    }

    public final void O(Object obj, dp5 dp5Var, g72 g72Var) throws b13 {
        int iC = this.a.C();
        fr0 fr0Var = this.a;
        if (fr0Var.a >= fr0Var.b) {
            throw b13.i();
        }
        int iL = fr0Var.l(iC);
        this.a.a++;
        dp5Var.d(obj, this, g72Var);
        this.a.a(0);
        r5.a--;
        this.a.k(iL);
    }

    public final Object P(dp5 dp5Var, g72 g72Var) {
        Object objI = dp5Var.i();
        N(objI, dp5Var, g72Var);
        dp5Var.e(objI);
        return objI;
    }

    public final Object Q(dp5 dp5Var, g72 g72Var) throws b13 {
        Object objI = dp5Var.i();
        O(objI, dp5Var, g72Var);
        dp5Var.e(objI);
        return objI;
    }

    public void R(List list, boolean z) throws b13.a {
        int iB;
        int iB2;
        if (zw7.b(this.b) != 2) {
            throw b13.e();
        }
        if (!(list instanceof sb3) || z) {
            do {
                list.add(z ? H() : readString());
                if (this.a.e()) {
                    return;
                } else {
                    iB = this.a.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        sb3 sb3Var = (sb3) list;
        do {
            sb3Var.c0(u());
            if (this.a.e()) {
                return;
            } else {
                iB2 = this.a.B();
            }
        } while (iB2 == this.b);
        this.d = iB2;
    }

    public final void S(int i) throws b13 {
        if (this.a.d() != i) {
            throw b13.m();
        }
    }

    public final void T(int i) throws b13.a {
        if (zw7.b(this.b) != i) {
            throw b13.e();
        }
    }

    public final void U(int i) throws b13 {
        if ((i & 3) != 0) {
            throw b13.h();
        }
    }

    public final void V(int i) throws b13 {
        if ((i & 7) != 0) {
            throw b13.h();
        }
    }

    @Override // com.zepto.d55
    public void a(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof j03)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.x()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iD = this.a.d() + this.a.C();
            do {
                list.add(Integer.valueOf(this.a.x()));
            } while (this.a.d() < iD);
            S(iD);
            return;
        }
        j03 j03Var = (j03) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 0) {
            do {
                j03Var.m(this.a.x());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iD2 = this.a.d() + this.a.C();
        do {
            j03Var.m(this.a.x());
        } while (this.a.d() < iD2);
        S(iD2);
    }

    @Override // com.zepto.d55
    public int b() throws b13.a {
        T(0);
        return this.a.p();
    }

    @Override // com.zepto.d55
    public long c() throws b13.a {
        T(0);
        return this.a.D();
    }

    @Override // com.zepto.d55
    public void d(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof j03)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 2) {
                int iC = this.a.C();
                U(iC);
                int iD = this.a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw b13.e();
            }
            do {
                list.add(Integer.valueOf(this.a.q()));
                if (this.a.e()) {
                    return;
                } else {
                    iB = this.a.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        j03 j03Var = (j03) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 2) {
            int iC2 = this.a.C();
            U(iC2);
            int iD2 = this.a.d() + iC2;
            do {
                j03Var.m(this.a.q());
            } while (this.a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw b13.e();
        }
        do {
            j03Var.m(this.a.q());
            if (this.a.e()) {
                return;
            } else {
                iB2 = this.a.B();
            }
        } while (iB2 == this.b);
        this.d = iB2;
    }

    @Override // com.zepto.d55
    public long e() throws b13.a {
        T(1);
        return this.a.r();
    }

    @Override // com.zepto.d55
    public void f(Object obj, dp5 dp5Var, g72 g72Var) throws b13 {
        T(2);
        O(obj, dp5Var, g72Var);
    }

    @Override // com.zepto.d55
    public void g(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof j03)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 2) {
                int iC = this.a.C();
                U(iC);
                int iD = this.a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw b13.e();
            }
            do {
                list.add(Integer.valueOf(this.a.v()));
                if (this.a.e()) {
                    return;
                } else {
                    iB = this.a.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        j03 j03Var = (j03) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 2) {
            int iC2 = this.a.C();
            U(iC2);
            int iD2 = this.a.d() + iC2;
            do {
                j03Var.m(this.a.v());
            } while (this.a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw b13.e();
        }
        do {
            j03Var.m(this.a.v());
            if (this.a.e()) {
                return;
            } else {
                iB2 = this.a.B();
            }
        } while (iB2 == this.b);
        this.d = iB2;
    }

    @Override // com.zepto.d55
    public int getTag() {
        return this.b;
    }

    @Override // com.zepto.d55
    public int h() throws b13.a {
        T(0);
        return this.a.x();
    }

    @Override // com.zepto.d55
    public void i(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof eo3)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.y()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iD = this.a.d() + this.a.C();
            do {
                list.add(Long.valueOf(this.a.y()));
            } while (this.a.d() < iD);
            S(iD);
            return;
        }
        eo3 eo3Var = (eo3) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 0) {
            do {
                eo3Var.m(this.a.y());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iD2 = this.a.d() + this.a.C();
        do {
            eo3Var.m(this.a.y());
        } while (this.a.d() < iD2);
        S(iD2);
    }

    @Override // com.zepto.d55
    public long j() throws b13.a {
        T(0);
        return this.a.y();
    }

    @Override // com.zepto.d55
    public void k(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof j03)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.C()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iD = this.a.d() + this.a.C();
            do {
                list.add(Integer.valueOf(this.a.C()));
            } while (this.a.d() < iD);
            S(iD);
            return;
        }
        j03 j03Var = (j03) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 0) {
            do {
                j03Var.m(this.a.C());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iD2 = this.a.d() + this.a.C();
        do {
            j03Var.m(this.a.C());
        } while (this.a.d() < iD2);
        S(iD2);
    }

    @Override // com.zepto.d55
    public void l(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof e70)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.m()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iD = this.a.d() + this.a.C();
            do {
                list.add(Boolean.valueOf(this.a.m()));
            } while (this.a.d() < iD);
            S(iD);
            return;
        }
        e70 e70Var = (e70) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 0) {
            do {
                e70Var.m(this.a.m());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iD2 = this.a.d() + this.a.C();
        do {
            e70Var.m(this.a.m());
        } while (this.a.d() < iD2);
        S(iD2);
    }

    @Override // com.zepto.d55
    public int m() throws b13.a {
        T(5);
        return this.a.q();
    }

    @Override // com.zepto.d55
    public boolean n() throws b13.a {
        T(0);
        return this.a.m();
    }

    @Override // com.zepto.d55
    public int o() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        int i2 = this.b;
        return (i2 == 0 || i2 == this.c) ? IntCompanionObject.MAX_VALUE : zw7.a(i2);
    }

    @Override // com.zepto.d55
    public void p(List list) throws b13.a {
        R(list, false);
    }

    @Override // com.zepto.d55
    public long q() throws b13.a {
        T(1);
        return this.a.w();
    }

    @Override // com.zepto.d55
    public void r(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof eo3)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.D()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iB = this.a.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b13.e();
            }
            int iD = this.a.d() + this.a.C();
            do {
                list.add(Long.valueOf(this.a.D()));
            } while (this.a.d() < iD);
            S(iD);
            return;
        }
        eo3 eo3Var = (eo3) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 0) {
            do {
                eo3Var.m(this.a.D());
                if (this.a.e()) {
                    return;
                } else {
                    iB2 = this.a.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b13.e();
        }
        int iD2 = this.a.d() + this.a.C();
        do {
            eo3Var.m(this.a.D());
        } while (this.a.d() < iD2);
        S(iD2);
    }

    @Override // com.zepto.d55
    public double readDouble() throws b13.a {
        T(1);
        return this.a.o();
    }

    @Override // com.zepto.d55
    public float readFloat() throws b13.a {
        T(5);
        return this.a.s();
    }

    @Override // com.zepto.d55
    public String readString() throws b13.a {
        T(2);
        return this.a.z();
    }

    @Override // com.zepto.d55
    public void s(List list, dp5 dp5Var, g72 g72Var) throws b13.a {
        int iB;
        if (zw7.b(this.b) != 2) {
            throw b13.e();
        }
        int i = this.b;
        do {
            list.add(Q(dp5Var, g72Var));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                iB = this.a.B();
            }
        } while (iB == i);
        this.d = iB;
    }

    @Override // com.zepto.d55
    public void t(List list) throws b13.a {
        R(list, true);
    }

    @Override // com.zepto.d55
    public s80 u() throws b13.a {
        T(2);
        return this.a.n();
    }

    @Override // com.zepto.d55
    public void v(List list) throws b13 {
        int iB;
        int iB2;
        if (!(list instanceof jd2)) {
            int iB3 = zw7.b(this.b);
            if (iB3 == 2) {
                int iC = this.a.C();
                U(iC);
                int iD = this.a.d() + iC;
                do {
                    list.add(Float.valueOf(this.a.s()));
                } while (this.a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw b13.e();
            }
            do {
                list.add(Float.valueOf(this.a.s()));
                if (this.a.e()) {
                    return;
                } else {
                    iB = this.a.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        jd2 jd2Var = (jd2) list;
        int iB4 = zw7.b(this.b);
        if (iB4 == 2) {
            int iC2 = this.a.C();
            U(iC2);
            int iD2 = this.a.d() + iC2;
            do {
                jd2Var.m(this.a.s());
            } while (this.a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw b13.e();
        }
        do {
            jd2Var.m(this.a.s());
            if (this.a.e()) {
                return;
            } else {
                iB2 = this.a.B();
            }
        } while (iB2 == this.b);
        this.d = iB2;
    }

    @Override // com.zepto.d55
    public int w() throws b13.a {
        T(0);
        return this.a.C();
    }

    @Override // com.zepto.d55
    public int x() throws b13.a {
        T(0);
        return this.a.t();
    }

    @Override // com.zepto.d55
    public void y(Object obj, dp5 dp5Var, g72 g72Var) throws b13.a {
        T(3);
        N(obj, dp5Var, g72Var);
    }

    @Override // com.zepto.d55
    public boolean z() {
        int i;
        if (this.a.e() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.E(i);
    }
}
