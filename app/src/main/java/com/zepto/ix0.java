package com.zepto;

import androidx.work.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ix0 {
    public static final String a;

    static {
        String strI = rn3.i("ConstraintTrkngWrkr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        a = strI;
    }

    public static final boolean d(nz5 nz5Var) {
        return nz5Var.p(c.a.a());
    }

    public static final boolean e(nz5 nz5Var) {
        return nz5Var.p(c.a.b());
    }
}
