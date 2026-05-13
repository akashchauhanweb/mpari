package com.zepto;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class wu7 {
    public static int g;
    public int b;
    public int d;
    public ArrayList a = new ArrayList();
    public boolean c = false;
    public ArrayList e = null;
    public int f = -1;

    public class a {
        public WeakReference a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public a(jx0 jx0Var, nf3 nf3Var, int i) {
            this.a = new WeakReference(jx0Var);
            this.b = nf3Var.x(jx0Var.O);
            this.c = nf3Var.x(jx0Var.P);
            this.d = nf3Var.x(jx0Var.Q);
            this.e = nf3Var.x(jx0Var.R);
            this.f = nf3Var.x(jx0Var.S);
            this.g = i;
        }
    }

    public wu7(int i) {
        int i2 = g;
        g = i2 + 1;
        this.b = i2;
        this.d = i;
    }

    public boolean a(jx0 jx0Var) {
        if (this.a.contains(jx0Var)) {
            return false;
        }
        this.a.add(jx0Var);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.a.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                wu7 wu7Var = (wu7) arrayList.get(i);
                if (this.f == wu7Var.b) {
                    g(this.d, wu7Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public final String e() {
        int i = this.d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    public int f(nf3 nf3Var, int i) {
        if (this.a.size() == 0) {
            return 0;
        }
        return j(nf3Var, this.a, i);
    }

    public void g(int i, wu7 wu7Var) {
        for (jx0 jx0Var : this.a) {
            wu7Var.a(jx0Var);
            if (i == 0) {
                jx0Var.I0 = wu7Var.c();
            } else {
                jx0Var.J0 = wu7Var.c();
            }
        }
        this.f = wu7Var.b;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(int i) {
        this.d = i;
    }

    public final int j(nf3 nf3Var, ArrayList arrayList, int i) {
        int iX;
        int iX2;
        kx0 kx0Var = (kx0) ((jx0) arrayList.get(0)).K();
        nf3Var.D();
        kx0Var.g(nf3Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((jx0) arrayList.get(i2)).g(nf3Var, false);
        }
        if (i == 0 && kx0Var.W0 > 0) {
            hc0.b(kx0Var, nf3Var, arrayList, 0);
        }
        if (i == 1 && kx0Var.X0 > 0) {
            hc0.b(kx0Var, nf3Var, arrayList, 1);
        }
        try {
            nf3Var.z();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new a((jx0) arrayList.get(i3), nf3Var, i));
        }
        if (i == 0) {
            iX = nf3Var.x(kx0Var.O);
            iX2 = nf3Var.x(kx0Var.Q);
            nf3Var.D();
        } else {
            iX = nf3Var.x(kx0Var.P);
            iX2 = nf3Var.x(kx0Var.R);
            nf3Var.D();
        }
        return iX2 - iX;
    }

    public String toString() {
        String str = e() + " [" + this.b + "] <";
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((jx0) it.next()).t();
        }
        return str + " >";
    }
}
