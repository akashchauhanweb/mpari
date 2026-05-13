package com.zepto;

import com.zepto.jx0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class nk2 {
    public static wu7 a(jx0 jx0Var, int i, ArrayList arrayList, wu7 wu7Var) {
        int iS1;
        int i2 = i == 0 ? jx0Var.I0 : jx0Var.J0;
        if (i2 != -1 && (wu7Var == null || i2 != wu7Var.b)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                wu7 wu7Var2 = (wu7) arrayList.get(i3);
                if (wu7Var2.c() == i2) {
                    if (wu7Var != null) {
                        wu7Var.g(i, wu7Var2);
                        arrayList.remove(wu7Var);
                    }
                    wu7Var = wu7Var2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return wu7Var;
        }
        if (wu7Var == null) {
            if ((jx0Var instanceof zl2) && (iS1 = ((zl2) jx0Var).s1(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    wu7 wu7Var3 = (wu7) arrayList.get(i4);
                    if (wu7Var3.c() == iS1) {
                        wu7Var = wu7Var3;
                        break;
                    }
                    i4++;
                }
            }
            if (wu7Var == null) {
                wu7Var = new wu7(i);
            }
            arrayList.add(wu7Var);
        }
        if (wu7Var.a(jx0Var)) {
            if (jx0Var instanceof sk2) {
                sk2 sk2Var = (sk2) jx0Var;
                sk2Var.r1().c(sk2Var.s1() == 0 ? 1 : 0, arrayList, wu7Var);
            }
            if (i == 0) {
                jx0Var.I0 = wu7Var.c();
                jx0Var.O.c(i, arrayList, wu7Var);
                jx0Var.Q.c(i, arrayList, wu7Var);
            } else {
                jx0Var.J0 = wu7Var.c();
                jx0Var.P.c(i, arrayList, wu7Var);
                jx0Var.S.c(i, arrayList, wu7Var);
                jx0Var.R.c(i, arrayList, wu7Var);
            }
            jx0Var.V.c(i, arrayList, wu7Var);
        }
        return wu7Var;
    }

    public static wu7 b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wu7 wu7Var = (wu7) arrayList.get(i2);
            if (i == wu7Var.b) {
                return wu7Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(com.zepto.kx0 r16, com.zepto.e50.b r17) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.nk2.c(com.zepto.kx0, com.zepto.e50$b):boolean");
    }

    public static boolean d(jx0.b bVar, jx0.b bVar2, jx0.b bVar3, jx0.b bVar4) {
        jx0.b bVar5;
        jx0.b bVar6;
        jx0.b bVar7 = jx0.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = jx0.b.WRAP_CONTENT) || (bVar3 == jx0.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = jx0.b.WRAP_CONTENT) || (bVar4 == jx0.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
