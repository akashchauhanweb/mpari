package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class co6 implements nw3 {
    public y62 c;
    public qa3 e;
    public qa3 f;
    public qw3 g;
    public a h;
    public ps4 i;
    public si1 j;
    public String k;
    public String l;
    public ma3 m;
    public ma3 n;
    public int o;

    public static class a extends ArrayList {
    }

    public co6(ps4 ps4Var, si1 si1Var) {
        this(ps4Var, si1Var, null, null, 1);
    }

    @Override // com.zepto.nw3
    public boolean A(String str) {
        return this.g.containsKey(str);
    }

    public final void B(Class cls) throws bm4 {
        for (ma3 ma3Var : this.f) {
            if (ma3Var != null) {
                z(ma3Var);
            }
        }
        for (ma3 ma3Var2 : this.e) {
            if (ma3Var2 != null) {
                z(ma3Var2);
            }
        }
        ma3 ma3Var3 = this.m;
        if (ma3Var3 != null) {
            z(ma3Var3);
        }
    }

    @Override // com.zepto.nw3
    public boolean C(String str) {
        return this.f.containsKey(str);
    }

    public final void D(Class cls) throws j02 {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            int i = 1;
            for (nw3 nw3Var : (pw3) it.next()) {
                if (nw3Var != null) {
                    String name = nw3Var.getName();
                    int index = nw3Var.getIndex();
                    int i2 = i + 1;
                    if (index != i) {
                        throw new j02("Path section '%s[%s]' is out of sequence in %s", name, Integer.valueOf(index), cls);
                    }
                    nw3Var.F(cls);
                    i = i2;
                }
            }
        }
    }

    @Override // com.zepto.nw3
    public boolean E() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            for (nw3 nw3Var : (pw3) it.next()) {
                if (nw3Var != null && !nw3Var.isEmpty()) {
                    return true;
                }
            }
        }
        return !this.g.isEmpty();
    }

    @Override // com.zepto.nw3
    public void F(Class cls) throws j02, dz, bm4, ve6 {
        B(cls);
        u(cls);
        w(cls);
        D(cls);
        O(cls);
    }

    @Override // com.zepto.nw3
    public boolean G(String str) {
        return this.e.containsKey(str);
    }

    @Override // com.zepto.nw3
    public nw3 H(y62 y62Var) {
        nw3 nw3VarY = y(y62Var.getFirst(), y62Var.getIndex());
        if (y62Var.x()) {
            y62 y62VarV = y62Var.V(1, 0);
            if (nw3VarY != null) {
                return nw3VarY.H(y62VarV);
            }
        }
        return nw3VarY;
    }

    public final void O(Class cls) throws ve6 {
        if (this.m != null) {
            if (!this.f.isEmpty()) {
                throw new ve6("Text annotation %s used with elements in %s", this.m, cls);
            }
            if (E()) {
                throw new ve6("Text annotation %s can not be used with paths in %s", this.m, cls);
            }
        }
    }

    @Override // com.zepto.nw3
    public qw3 Q() {
        return this.g.Q();
    }

    @Override // com.zepto.nw3
    public qa3 c() {
        return this.e.u();
    }

    @Override // com.zepto.nw3
    public y62 d() {
        return this.c;
    }

    @Override // com.zepto.nw3
    public int getIndex() {
        return this.o;
    }

    @Override // com.zepto.nw3
    public String getName() {
        return this.k;
    }

    @Override // com.zepto.nw3
    public String getPrefix() {
        return this.l;
    }

    @Override // com.zepto.nw3
    public ma3 getText() {
        ma3 ma3Var = this.n;
        return ma3Var != null ? ma3Var : this.m;
    }

    @Override // com.zepto.nw3
    public qa3 h() {
        return this.f.u();
    }

    @Override // com.zepto.nw3
    public nw3 i(String str, String str2, int i) {
        nw3 nw3VarY = this.g.y(str, i);
        return nw3VarY == null ? j(str, str2, i) : nw3VarY;
    }

    @Override // com.zepto.nw3
    public boolean isEmpty() {
        if (this.m == null && this.f.isEmpty() && this.e.isEmpty()) {
            return !E();
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.h.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList.iterator();
    }

    public final nw3 j(String str, String str2, int i) {
        co6 co6Var = new co6(this.i, this.j, str, str2, i);
        if (str != null) {
            this.g.r(str, co6Var);
            this.h.add(str);
        }
        return co6Var;
    }

    @Override // com.zepto.nw3
    public void k(ma3 ma3Var) throws j02, dz, ve6 {
        if (ma3Var.f()) {
            m(ma3Var);
        } else if (ma3Var.g()) {
            r(ma3Var);
        } else {
            n(ma3Var);
        }
    }

    public void m(ma3 ma3Var) throws dz {
        String name = ma3Var.getName();
        if (this.e.get(name) != 0) {
            throw new dz("Duplicate annotation of name '%s' on %s", name, ma3Var);
        }
        this.e.put(name, ma3Var);
    }

    public void n(ma3 ma3Var) throws j02 {
        String name = ma3Var.getName();
        if (this.f.get(name) != 0) {
            throw new j02("Duplicate annotation of name '%s' on %s", name, ma3Var);
        }
        if (!this.h.contains(name)) {
            this.h.add(name);
        }
        if (ma3Var.q()) {
            this.n = ma3Var;
        }
        this.f.put(name, ma3Var);
    }

    public void r(ma3 ma3Var) throws ve6 {
        if (this.m != null) {
            throw new ve6("Duplicate text annotation on %s", ma3Var);
        }
        this.m = ma3Var;
    }

    @Override // com.zepto.nw3
    public void s(String str) {
        this.e.put(str, null);
    }

    public String toString() {
        return String.format("model '%s[%s]'", this.k, Integer.valueOf(this.o));
    }

    public final void u(Class cls) throws dz {
        for (K k : this.e.keySet()) {
            if (((ma3) this.e.get(k)) == null) {
                throw new dz("Ordered attribute '%s' does not exist in %s", k, cls);
            }
            y62 y62Var = this.c;
            if (y62Var != null) {
                y62Var.a(k);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(Class cls) throws j02 {
        for (K k : this.f.keySet()) {
            pw3 pw3Var = (pw3) this.g.get(k);
            ma3 ma3Var = (ma3) this.f.get(k);
            if (pw3Var == null && ma3Var == null) {
                throw new j02("Ordered element '%s' does not exist in %s", k, cls);
            }
            if (pw3Var != null && ma3Var != null && !pw3Var.isEmpty()) {
                throw new j02("Element '%s' is also a path name in %s", k, cls);
            }
            y62 y62Var = this.c;
            if (y62Var != null) {
                y62Var.e(k);
            }
        }
    }

    @Override // com.zepto.nw3
    public nw3 y(String str, int i) {
        return this.g.y(str, i);
    }

    public final void z(ma3 ma3Var) throws bm4 {
        y62 y62VarD = ma3Var.d();
        y62 y62Var = this.c;
        if (y62Var == null) {
            this.c = y62VarD;
            return;
        }
        String strB = y62Var.b();
        String strB2 = y62VarD.b();
        if (!strB.equals(strB2)) {
            throw new bm4("Path '%s' does not match '%s' in %s", strB, strB2, this.j);
        }
    }

    public co6(ps4 ps4Var, si1 si1Var, String str, String str2, int i) {
        this.e = new qa3(ps4Var);
        this.f = new qa3(ps4Var);
        this.g = new qw3(si1Var);
        this.h = new a();
        this.j = si1Var;
        this.i = ps4Var;
        this.l = str2;
        this.o = i;
        this.k = str;
    }
}
