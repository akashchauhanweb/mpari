package com.zepto;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kk0 implements ev4 {
    public static final kk0 a = new kk0();

    public static class b implements jk0 {
        public final dv4 a;

        public b(dv4 dv4Var) {
            this.a = dv4Var;
        }
    }

    public static void d() {
        u75.n(a);
    }

    @Override // com.zepto.ev4
    public Class a() {
        return jk0.class;
    }

    @Override // com.zepto.ev4
    public Class c() {
        return jk0.class;
    }

    @Override // com.zepto.ev4
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jk0 b(dv4 dv4Var) throws GeneralSecurityException {
        if (dv4Var == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (dv4Var.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = dv4Var.c().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new b(dv4Var);
    }
}
