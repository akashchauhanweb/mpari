package com.zepto;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aq4 {
    public ArrayList a = new ArrayList();
    public ArrayList b = new ArrayList();
    public int c = 10;
    public pq4 d;
    public gp4 e;

    public aq4(pq4 pq4Var) {
        this.d = pq4Var;
    }

    public void a(uo4 uo4Var) {
        try {
            if (this.a.size() % this.c == 0) {
                this.b.add(this.d.K());
            }
            uo4Var.r(lp4.c7, (gp4) this.b.get(r0.size() - 1));
            gp4 gp4VarV = this.d.v();
            this.d.o(uo4Var, gp4VarV);
            this.a.add(gp4VarV);
        } catch (Exception e) {
            throw new p52(e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public gp4 b() throws IOException {
        int size;
        int i;
        if (this.a.isEmpty()) {
            throw new IOException(dt3.b("the.document.has.no.pages", new Object[0]));
        }
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.a;
        ArrayList arrayList3 = new ArrayList();
        int i2 = 1;
        while (true) {
            int i3 = this.c;
            i2 *= i3;
            int size2 = arrayList2.size();
            int i4 = this.c;
            int i5 = size2 % i4;
            if (i5 != 0) {
                i4 = i5;
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                if (i6 == arrayList.size() - 1) {
                    size = this.a.size() % i2;
                    if (size == 0) {
                        size = i2;
                    }
                    i = i4;
                } else {
                    size = i2;
                    i = i3;
                }
                uo4 uo4Var = new uo4(lp4.Y6);
                uo4Var.r(lp4.q1, new op4(size));
                ko4 ko4Var = new ko4();
                int i7 = i6 * i3;
                ko4Var.r().addAll(arrayList2.subList(i7, i + i7));
                uo4Var.r(lp4.a5, ko4Var);
                if (arrayList.size() > 1) {
                    if (i6 % this.c == 0) {
                        arrayList3.add(this.d.K());
                    }
                    uo4Var.r(lp4.c7, (rp4) arrayList3.get(i6 / this.c));
                } else {
                    uo4Var.r(lp4.R4, new hq4(bu1.n()));
                }
                this.d.o(uo4Var, (gp4) arrayList.get(i6));
            }
            if (arrayList.size() == 1) {
                gp4 gp4Var = (gp4) arrayList.get(0);
                this.e = gp4Var;
                return gp4Var;
            }
            arrayList2 = arrayList;
            arrayList = arrayList3;
            arrayList3 = new ArrayList();
        }
    }
}
