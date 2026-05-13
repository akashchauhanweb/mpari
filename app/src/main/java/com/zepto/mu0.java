package com.zepto;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mu0 implements ou0 {
    public static /* synthetic */ Object c(String str, ut0 ut0Var, cu0 cu0Var) {
        try {
            hd2.b(str);
            return ut0Var.h().a(cu0Var);
        } finally {
            hd2.a();
        }
    }

    @Override // com.zepto.ou0
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final ut0 ut0VarT : componentRegistrar.getComponents()) {
            final String strI = ut0VarT.i();
            if (strI != null) {
                ut0VarT = ut0VarT.t(new iu0() { // from class: com.zepto.lu0
                    @Override // com.zepto.iu0
                    public final Object a(cu0 cu0Var) {
                        return mu0.c(strI, ut0VarT, cu0Var);
                    }
                });
            }
            arrayList.add(ut0VarT);
        }
        return arrayList;
    }
}
