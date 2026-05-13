package com.zepto;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class og1 implements vr6 {
    public final String a;
    public final nj2 b;

    public og1(Set set, nj2 nj2Var) {
        this.a = e(set);
        this.b = nj2Var;
    }

    public static ut0 c() {
        return ut0.e(vr6.class).b(hi1.l(ue3.class)).e(new iu0() { // from class: com.zepto.ng1
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return og1.d(cu0Var);
            }
        }).d();
    }

    public static /* synthetic */ vr6 d(cu0 cu0Var) {
        return new og1(cu0Var.c(ue3.class), nj2.a());
    }

    public static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ue3 ue3Var = (ue3) it.next();
            sb.append(ue3Var.b());
            sb.append('/');
            sb.append(ue3Var.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.zepto.vr6
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + e(this.b.b());
    }
}
