package com.zepto;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class rj1 {
    public static final String a;

    static {
        String strI = rn3.i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"DiagnosticsWrkr\")");
        a = strI;
    }

    public static final String c(yy7 yy7Var, String str, Integer num, String str2) {
        return '\n' + yy7Var.a + "\t " + yy7Var.c + "\t " + num + "\t " + yy7Var.b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    public static final String d(ny7 ny7Var, dz7 dz7Var, da6 da6Var, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yy7 yy7Var = (yy7) it.next();
            ca6 ca6VarC = da6Var.c(bz7.a(yy7Var));
            sb.append(c(yy7Var, CollectionsKt___CollectionsKt.joinToString$default(ny7Var.b(yy7Var.a), ",", null, null, 0, null, null, 62, null), ca6VarC != null ? Integer.valueOf(ca6VarC.c) : null, CollectionsKt___CollectionsKt.joinToString$default(dz7Var.d(yy7Var.a), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
