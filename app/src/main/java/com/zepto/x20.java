package com.zepto;

import com.zepto.hl2;
import com.zepto.la3;
import com.zepto.pe4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class x20 implements Serializable {
    public transient fu7 c;
    public final int e;
    public final List f;
    public int g;
    public n08 h;
    public List i;
    public Map j;
    public Stack k;
    public Map l;
    public int m;
    public boolean n;
    public transient int o;

    public x20(x20 x20Var) {
        this.c = new fu7(x20Var.c.d());
        this.e = x20Var.e;
        this.g = x20Var.g;
        this.h = x20Var.h;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        arrayList.addAll(x20Var.i);
        this.j = new TreeMap();
        for (Integer num : x20Var.j.keySet()) {
            this.j.put(num, (LinkedList) ((LinkedList) x20Var.j.get(num)).clone());
        }
        Stack stack = new Stack();
        this.k = stack;
        stack.addAll(x20Var.k);
        this.f = new ArrayList();
        Iterator it = x20Var.f.iterator();
        while (it.hasNext()) {
            this.f.add(((z20) it.next()).clone());
        }
        this.l = new TreeMap(x20Var.l);
        this.m = x20Var.m;
        this.o = x20Var.o;
        this.n = x20Var.n;
    }

    public final z20 a() {
        z20 z20Var = null;
        for (z20 z20Var2 : this.f) {
            if (!z20Var2.f() && z20Var2.g() && (z20Var == null || z20Var2.b() < z20Var.b() || (z20Var2.b() == z20Var.b() && z20Var2.c() < z20Var.c()))) {
                z20Var = z20Var2;
            }
        }
        return z20Var;
    }

    public int b() {
        return this.m;
    }

    public int c() {
        return this.o;
    }

    public x20 d(byte[] bArr, byte[] bArr2, pe4 pe4Var) {
        return new x20(this, bArr, bArr2, pe4Var);
    }

    public final void e(byte[] bArr, byte[] bArr2, pe4 pe4Var) {
        if (pe4Var == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        la3 la3Var = (la3) ((la3.b) ((la3.b) new la3.b().g(pe4Var.b())).h(pe4Var.c())).l();
        hl2 hl2Var = (hl2) ((hl2.b) ((hl2.b) new hl2.b().g(pe4Var.b())).h(pe4Var.c())).k();
        for (int i = 0; i < (1 << this.e); i++) {
            pe4Var = (pe4) ((pe4.b) ((pe4.b) ((pe4.b) new pe4.b().g(pe4Var.b())).h(pe4Var.c())).p(i).n(pe4Var.e()).o(pe4Var.f()).f(pe4Var.a())).l();
            fu7 fu7Var = this.c;
            fu7Var.h(fu7Var.g(bArr2, pe4Var), bArr);
            iu7 iu7VarE = this.c.e(pe4Var);
            la3Var = (la3) ((la3.b) ((la3.b) ((la3.b) new la3.b().g(la3Var.b())).h(la3Var.c())).n(i).o(la3Var.f()).p(la3Var.g()).f(la3Var.a())).l();
            n08 n08VarA = o08.a(this.c, iu7VarE, la3Var);
            hl2Var = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var.b())).h(hl2Var.c())).n(i).f(hl2Var.a())).k();
            while (!this.k.isEmpty() && ((n08) this.k.peek()).a() == n08VarA.a()) {
                int iA = i / (1 << n08VarA.a());
                if (iA == 1) {
                    this.i.add(n08VarA);
                }
                if (iA == 3 && n08VarA.a() < this.e - this.g) {
                    ((z20) this.f.get(n08VarA.a())).h(n08VarA);
                }
                if (iA >= 3 && (iA & 1) == 1 && n08VarA.a() >= this.e - this.g && n08VarA.a() <= this.e - 2) {
                    if (this.j.get(Integer.valueOf(n08VarA.a())) == null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(n08VarA);
                        this.j.put(Integer.valueOf(n08VarA.a()), linkedList);
                    } else {
                        ((LinkedList) this.j.get(Integer.valueOf(n08VarA.a()))).add(n08VarA);
                    }
                }
                hl2 hl2Var2 = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var.b())).h(hl2Var.c())).m(hl2Var.e()).n((hl2Var.f() - 1) / 2).f(hl2Var.a())).k();
                n08 n08VarB = o08.b(this.c, (n08) this.k.pop(), n08VarA, hl2Var2);
                n08 n08Var = new n08(n08VarB.a() + 1, n08VarB.b());
                hl2Var = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var2.b())).h(hl2Var2.c())).m(hl2Var2.e() + 1).n(hl2Var2.f()).f(hl2Var2.a())).k();
                n08VarA = n08Var;
            }
            this.k.push(n08VarA);
        }
        this.h = (n08) this.k.pop();
    }

    public final void f(byte[] bArr, byte[] bArr2, pe4 pe4Var) {
        List list;
        Object objRemoveFirst;
        if (pe4Var == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.n) {
            throw new IllegalStateException("index already used");
        }
        int i = this.m;
        if (i > this.o - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int iB = v08.b(i, this.e);
        if (((this.m >> (iB + 1)) & 1) == 0 && iB < this.e - 1) {
            this.l.put(Integer.valueOf(iB), this.i.get(iB));
        }
        la3 la3Var = (la3) ((la3.b) ((la3.b) new la3.b().g(pe4Var.b())).h(pe4Var.c())).l();
        hl2 hl2Var = (hl2) ((hl2.b) ((hl2.b) new hl2.b().g(pe4Var.b())).h(pe4Var.c())).k();
        if (iB == 0) {
            pe4Var = (pe4) ((pe4.b) ((pe4.b) ((pe4.b) new pe4.b().g(pe4Var.b())).h(pe4Var.c())).p(this.m).n(pe4Var.e()).o(pe4Var.f()).f(pe4Var.a())).l();
            fu7 fu7Var = this.c;
            fu7Var.h(fu7Var.g(bArr2, pe4Var), bArr);
            this.i.set(0, o08.a(this.c, this.c.e(pe4Var), (la3) ((la3.b) ((la3.b) ((la3.b) new la3.b().g(la3Var.b())).h(la3Var.c())).n(this.m).o(la3Var.f()).p(la3Var.g()).f(la3Var.a())).l()));
        } else {
            int i2 = iB - 1;
            hl2 hl2Var2 = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var.b())).h(hl2Var.c())).m(i2).n(this.m >> iB).f(hl2Var.a())).k();
            fu7 fu7Var2 = this.c;
            fu7Var2.h(fu7Var2.g(bArr2, pe4Var), bArr);
            n08 n08VarB = o08.b(this.c, (n08) this.i.get(i2), (n08) this.l.get(Integer.valueOf(i2)), hl2Var2);
            this.i.set(iB, new n08(n08VarB.a() + 1, n08VarB.b()));
            this.l.remove(Integer.valueOf(i2));
            for (int i3 = 0; i3 < iB; i3++) {
                if (i3 < this.e - this.g) {
                    list = this.i;
                    objRemoveFirst = ((z20) this.f.get(i3)).d();
                } else {
                    list = this.i;
                    objRemoveFirst = ((LinkedList) this.j.get(Integer.valueOf(i3))).removeFirst();
                }
                list.set(i3, objRemoveFirst);
            }
            int iMin = Math.min(iB, this.e - this.g);
            for (int i4 = 0; i4 < iMin; i4++) {
                int i5 = this.m + 1 + ((1 << i4) * 3);
                if (i5 < (1 << this.e)) {
                    ((z20) this.f.get(i4)).e(i5);
                }
            }
        }
        for (int i6 = 0; i6 < ((this.e - this.g) >> 1); i6++) {
            z20 z20VarA = a();
            if (z20VarA != null) {
                z20VarA.i(this.k, this.c, bArr, bArr2, pe4Var);
            }
        }
        this.m++;
    }

    public final void g() {
        if (this.i == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.j == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.k == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.l == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!v08.l(this.e, this.m)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public x20 h(p0 p0Var) {
        return new x20(this, p0Var);
    }

    public x20(x20 x20Var, p0 p0Var) {
        this.c = new fu7(new hu7(p0Var));
        this.e = x20Var.e;
        this.g = x20Var.g;
        this.h = x20Var.h;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        arrayList.addAll(x20Var.i);
        this.j = new TreeMap();
        for (Integer num : x20Var.j.keySet()) {
            this.j.put(num, (LinkedList) ((LinkedList) x20Var.j.get(num)).clone());
        }
        Stack stack = new Stack();
        this.k = stack;
        stack.addAll(x20Var.k);
        this.f = new ArrayList();
        Iterator it = x20Var.f.iterator();
        while (it.hasNext()) {
            this.f.add(((z20) it.next()).clone());
        }
        this.l = new TreeMap(x20Var.l);
        this.m = x20Var.m;
        this.o = x20Var.o;
        this.n = x20Var.n;
        g();
    }

    public x20(x20 x20Var, byte[] bArr, byte[] bArr2, pe4 pe4Var) {
        this.c = new fu7(x20Var.c.d());
        this.e = x20Var.e;
        this.g = x20Var.g;
        this.h = x20Var.h;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        arrayList.addAll(x20Var.i);
        this.j = new TreeMap();
        for (Integer num : x20Var.j.keySet()) {
            this.j.put(num, (LinkedList) ((LinkedList) x20Var.j.get(num)).clone());
        }
        Stack stack = new Stack();
        this.k = stack;
        stack.addAll(x20Var.k);
        this.f = new ArrayList();
        Iterator it = x20Var.f.iterator();
        while (it.hasNext()) {
            this.f.add(((z20) it.next()).clone());
        }
        this.l = new TreeMap(x20Var.l);
        this.m = x20Var.m;
        this.o = x20Var.o;
        this.n = false;
        f(bArr, bArr2, pe4Var);
    }

    public x20(fu7 fu7Var, int i, int i2, int i3) {
        this.c = fu7Var;
        this.e = i;
        this.o = i3;
        this.g = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.i = new ArrayList();
                this.j = new TreeMap();
                this.k = new Stack();
                this.f = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f.add(new z20(i5));
                }
                this.l = new TreeMap();
                this.m = 0;
                this.n = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public x20(q08 q08Var, int i, int i2) {
        this(q08Var.i(), q08Var.b(), q08Var.c(), i2);
        this.o = i;
        this.m = i2;
        this.n = true;
    }

    public x20(q08 q08Var, byte[] bArr, byte[] bArr2, pe4 pe4Var) {
        this(q08Var.i(), q08Var.b(), q08Var.c(), (1 << q08Var.b()) - 1);
        e(bArr, bArr2, pe4Var);
    }

    public x20(q08 q08Var, byte[] bArr, byte[] bArr2, pe4 pe4Var, int i) {
        this(q08Var.i(), q08Var.b(), q08Var.c(), (1 << q08Var.b()) - 1);
        e(bArr, bArr2, pe4Var);
        while (this.m < i) {
            f(bArr, bArr2, pe4Var);
            this.n = false;
        }
    }
}
