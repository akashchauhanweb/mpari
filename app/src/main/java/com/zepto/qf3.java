package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class qf3 implements f02 {
    public ArrayList c;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public fk0 k;
    public String l;
    public String m;
    public float n;
    public float o;
    public float p;

    public qf3() {
        this(false, false);
    }

    @Override // com.zepto.f02
    public boolean O() {
        return true;
    }

    public boolean a(f02 f02Var) {
        if (!(f02Var instanceof sf3)) {
            if (!(f02Var instanceof qf3)) {
                return false;
            }
            qf3 qf3Var = (qf3) f02Var;
            qf3Var.g(qf3Var.b() + this.p);
            this.j--;
            return this.c.add(qf3Var);
        }
        sf3 sf3Var = (sf3) f02Var;
        if (this.e || this.f) {
            fk0 fk0Var = new fk0(this.l, this.k.d());
            int size = this.j + this.c.size();
            if (this.f) {
                fk0Var.a(he5.c(size, this.g));
            } else {
                fk0Var.a(String.valueOf(size));
            }
            fk0Var.a(this.m);
            sf3Var.K0(fk0Var);
        } else {
            sf3Var.K0(this.k);
        }
        sf3Var.J0(this.p, this.h);
        sf3Var.B0(0.0f);
        return this.c.add(sf3Var);
    }

    @Override // com.zepto.f02
    public ArrayList a0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((f02) it.next()).a0());
        }
        return arrayList;
    }

    public float b() {
        return this.n;
    }

    public float c() {
        return this.o;
    }

    public ArrayList d() {
        return this.c;
    }

    public boolean e() {
        return this.i;
    }

    public void f() {
        float fMax = 0.0f;
        for (f02 f02Var : this.c) {
            if (f02Var instanceof sf3) {
                fMax = Math.max(fMax, ((sf3) f02Var).q0());
            }
        }
        for (f02 f02Var2 : this.c) {
            if (f02Var2 instanceof sf3) {
                ((sf3) f02Var2).A0(fMax);
            }
        }
    }

    public void g(float f) {
        this.n = f;
    }

    public void h(float f) {
        this.o = f;
    }

    public void i(String str) {
        this.k = new fk0(str);
    }

    @Override // com.zepto.f02
    public boolean u(r02 r02Var) {
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                r02Var.d((f02) it.next());
            }
            return true;
        } catch (cu1 unused) {
            return false;
        }
    }

    @Override // com.zepto.f02
    public int z() {
        return 14;
    }

    public qf3(boolean z, boolean z2) {
        this.c = new ArrayList();
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = 1;
        this.k = new fk0("- ");
        this.l = "";
        this.m = ". ";
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.e = z;
        this.f = z2;
        this.h = true;
        this.i = true;
    }
}
