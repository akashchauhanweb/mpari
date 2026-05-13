package com.zepto;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s26 {
    public final b a = new b();
    public final Constructor b;

    public static class a extends ArrayList {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    public static class b extends ArrayList {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public a get(int i) {
            for (int size = size(); size <= i; size++) {
                add(new a());
            }
            return (a) super.get(i);
        }

        public final int T() {
            if (f0() > 0) {
                return get(0).size();
            }
            return 0;
        }

        public void a0(gl4 gl4Var, int i) {
            a aVar = get(i);
            if (aVar != null) {
                aVar.add(gl4Var);
            }
        }

        public final int f0() {
            return size();
        }

        public gl4 z(int i, int i2) {
            return (gl4) get(i).get(i2);
        }
    }

    public s26(Constructor constructor) {
        this.b = constructor;
    }

    public List a() {
        return b(new b());
    }

    public final List b(b bVar) {
        if (this.a.isEmpty()) {
            return e();
        }
        c(bVar, 0);
        return f(bVar);
    }

    public final void c(b bVar, int i) {
        d(bVar, new a(), i);
    }

    public final void d(b bVar, a aVar, int i) {
        a aVar2 = this.a.get(i);
        int size = aVar2.size();
        if (this.a.f0() - 1 <= i) {
            i(bVar, aVar, i);
            return;
        }
        for (int i2 = 0; i2 < size; i2++) {
            a aVar3 = new a(aVar);
            if (aVar != null) {
                aVar3.add((gl4) aVar2.get(i2));
                d(bVar, aVar3, i + 1);
            }
        }
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        q26 q26Var = new q26(this.b);
        if (h()) {
            arrayList.add(q26Var);
        }
        return arrayList;
    }

    public final List f(b bVar) throws sx0 {
        ArrayList arrayList = new ArrayList();
        int iT = bVar.T();
        int iF0 = bVar.f0();
        for (int i = 0; i < iT; i++) {
            q26 q26Var = new q26(this.b);
            for (int i2 = 0; i2 < iF0; i2++) {
                gl4 gl4VarZ = bVar.z(i2, i);
                String strB = gl4VarZ.b();
                if (q26Var.contains(gl4VarZ.getKey())) {
                    throw new sx0("Parameter '%s' is a duplicate in %s", strB, this.b);
                }
                q26Var.j(gl4VarZ);
            }
            arrayList.add(q26Var);
        }
        return arrayList;
    }

    public void g(gl4 gl4Var, int i) {
        this.a.a0(gl4Var, i);
    }

    public boolean h() {
        return this.b.getParameterTypes().length == this.a.f0();
    }

    public final void i(b bVar, a aVar, int i) {
        a aVar2 = this.a.get(i);
        int size = aVar.size();
        int size2 = aVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            for (int i3 = 0; i3 < size; i3++) {
                bVar.get(i3).add((gl4) aVar.get(i3));
            }
            bVar.get(i).add((gl4) aVar2.get(i2));
        }
    }
}
