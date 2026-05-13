package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class we3 {

    public interface a {
        String a(Object obj);
    }

    public static ut0 b(String str, String str2) {
        return ut0.l(ue3.a(str, str2), ue3.class);
    }

    public static ut0 c(final String str, final a aVar) {
        return ut0.m(ue3.class).b(hi1.j(Context.class)).e(new iu0() { // from class: com.zepto.ve3
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return we3.d(str, aVar, cu0Var);
            }
        }).d();
    }

    public static /* synthetic */ ue3 d(String str, a aVar, cu0 cu0Var) {
        return ue3.a(str, aVar.a((Context) cu0Var.a(Context.class)));
    }
}
