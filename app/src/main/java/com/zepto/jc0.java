package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class jc0 extends xu7 {
    public ArrayList k;
    public int l;

    public jc0(jx0 jx0Var, int i) {
        super(jx0Var);
        this.k = new ArrayList();
        this.f = i;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0153  */
    @Override // com.zepto.xu7, com.zepto.ii1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.zepto.ii1 r27) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.jc0.a(com.zepto.ii1):void");
    }

    @Override // com.zepto.xu7
    public void d() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((xu7) it.next()).d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        jx0 jx0Var = ((xu7) this.k.get(0)).b;
        jx0 jx0Var2 = ((xu7) this.k.get(size - 1)).b;
        if (this.f == 0) {
            yw0 yw0Var = jx0Var.O;
            yw0 yw0Var2 = jx0Var2.Q;
            oi1 oi1VarI = i(yw0Var, 0);
            int iF = yw0Var.f();
            jx0 jx0VarR = r();
            if (jx0VarR != null) {
                iF = jx0VarR.O.f();
            }
            if (oi1VarI != null) {
                b(this.h, oi1VarI, iF);
            }
            oi1 oi1VarI2 = i(yw0Var2, 0);
            int iF2 = yw0Var2.f();
            jx0 jx0VarS = s();
            if (jx0VarS != null) {
                iF2 = jx0VarS.Q.f();
            }
            if (oi1VarI2 != null) {
                b(this.i, oi1VarI2, -iF2);
            }
        } else {
            yw0 yw0Var3 = jx0Var.P;
            yw0 yw0Var4 = jx0Var2.R;
            oi1 oi1VarI3 = i(yw0Var3, 1);
            int iF3 = yw0Var3.f();
            jx0 jx0VarR2 = r();
            if (jx0VarR2 != null) {
                iF3 = jx0VarR2.P.f();
            }
            if (oi1VarI3 != null) {
                b(this.h, oi1VarI3, iF3);
            }
            oi1 oi1VarI4 = i(yw0Var4, 1);
            int iF4 = yw0Var4.f();
            jx0 jx0VarS2 = s();
            if (jx0VarS2 != null) {
                iF4 = jx0VarS2.R.f();
            }
            if (oi1VarI4 != null) {
                b(this.i, oi1VarI4, -iF4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // com.zepto.xu7
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            ((xu7) this.k.get(i)).e();
        }
    }

    @Override // com.zepto.xu7
    public void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((xu7) it.next()).f();
        }
    }

    @Override // com.zepto.xu7
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            xu7 xu7Var = (xu7) this.k.get(i);
            j = j + ((long) xu7Var.h.f) + xu7Var.j() + ((long) xu7Var.i.f);
        }
        return j;
    }

    @Override // com.zepto.xu7
    public boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!((xu7) this.k.get(i)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        jx0 jx0Var;
        jx0 jx0Var2 = this.b;
        jx0 jx0VarL = jx0Var2.L(this.f);
        while (true) {
            jx0 jx0Var3 = jx0VarL;
            jx0Var = jx0Var2;
            jx0Var2 = jx0Var3;
            if (jx0Var2 == null) {
                break;
            } else {
                jx0VarL = jx0Var2.L(this.f);
            }
        }
        this.b = jx0Var;
        this.k.add(jx0Var.N(this.f));
        jx0 jx0VarJ = jx0Var.J(this.f);
        while (jx0VarJ != null) {
            this.k.add(jx0VarJ.N(this.f));
            jx0VarJ = jx0VarJ.J(this.f);
        }
        for (xu7 xu7Var : this.k) {
            int i = this.f;
            if (i == 0) {
                xu7Var.b.c = this;
            } else if (i == 1) {
                xu7Var.b.d = this;
            }
        }
        if (this.f == 0 && ((kx0) this.b.K()).P1() && this.k.size() > 1) {
            ArrayList arrayList = this.k;
            this.b = ((xu7) arrayList.get(arrayList.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.z() : this.b.S();
    }

    public final jx0 r() {
        for (int i = 0; i < this.k.size(); i++) {
            xu7 xu7Var = (xu7) this.k.get(i);
            if (xu7Var.b.V() != 8) {
                return xu7Var.b;
            }
        }
        return null;
    }

    public final jx0 s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            xu7 xu7Var = (xu7) this.k.get(size);
            if (xu7Var.b.V() != 8) {
                return xu7Var.b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (xu7 xu7Var : this.k) {
            sb.append("<");
            sb.append(xu7Var);
            sb.append("> ");
        }
        return sb.toString();
    }
}
