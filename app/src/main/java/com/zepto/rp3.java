package com.zepto;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rp3 implements oo6 {
    public final qx0 c;
    public final boolean e;

    public final class a extends mo6 {
        public final mo6 a;
        public final mo6 b;
        public final se4 c;

        public a(pk2 pk2Var, Type type, mo6 mo6Var, Type type2, mo6 mo6Var2, se4 se4Var) {
            this.a = new qo6(pk2Var, mo6Var, type);
            this.b = new qo6(pk2Var, mo6Var2, type2);
            this.c = se4Var;
        }

        public final String d(e53 e53Var) {
            if (!e53Var.z()) {
                if (e53Var.u()) {
                    return "null";
                }
                throw new AssertionError();
            }
            q53 q53VarN = e53Var.n();
            if (q53VarN.a0()) {
                return String.valueOf(q53VarN.D());
            }
            if (q53VarN.P()) {
                return Boolean.toString(q53VarN.B());
            }
            if (q53VarN.d0()) {
                return q53VarN.O();
            }
            throw new AssertionError();
        }

        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Map map) throws IOException {
            if (map == null) {
                a63Var.m0();
                return;
            }
            if (!rp3.this.e) {
                a63Var.m();
                for (Map.Entry entry : map.entrySet()) {
                    a63Var.e0(String.valueOf(entry.getKey()));
                    this.b.c(a63Var, entry.getValue());
                }
                a63Var.B();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry entry2 : map.entrySet()) {
                e53 e53VarB = this.a.b(entry2.getKey());
                arrayList.add(e53VarB);
                arrayList2.add(entry2.getValue());
                z |= e53VarB.r() || e53VarB.w();
            }
            if (!z) {
                a63Var.m();
                int size = arrayList.size();
                while (i < size) {
                    a63Var.e0(d((e53) arrayList.get(i)));
                    this.b.c(a63Var, arrayList2.get(i));
                    i++;
                }
                a63Var.B();
                return;
            }
            a63Var.j();
            int size2 = arrayList.size();
            while (i < size2) {
                a63Var.j();
                w76.a((e53) arrayList.get(i), a63Var);
                this.b.c(a63Var, arrayList2.get(i));
                a63Var.w();
                i++;
            }
            a63Var.w();
        }
    }

    public rp3(qx0 qx0Var, boolean z) {
        this.c = qx0Var;
        this.e = z;
    }

    @Override // com.zepto.oo6
    public mo6 a(pk2 pk2Var, uo6 uo6Var) {
        Type typeD = uo6Var.d();
        Class clsC = uo6Var.c();
        if (!Map.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type[] typeArrJ = d.j(typeD, clsC);
        return new a(pk2Var, typeArrJ[0], b(pk2Var, typeArrJ[0]), typeArrJ[1], pk2Var.f(uo6.b(typeArrJ[1])), this.c.b(uo6Var));
    }

    public final mo6 b(pk2 pk2Var, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? to6.f : pk2Var.f(uo6.b(type));
    }
}
