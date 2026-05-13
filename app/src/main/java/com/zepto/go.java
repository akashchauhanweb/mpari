package com.zepto;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class go {
    public static String a(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (i < array.length - 1) {
                    sb.append(", ");
                } else if (i == array.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array[i].toString());
        }
        return sb.toString();
    }

    public static String b(j22 j22Var, Collection collection) {
        return "Unsupported JWE encryption method " + j22Var + ", must be " + a(collection);
    }

    public static String c(l33 l33Var, Collection collection) {
        return "Unsupported JWE algorithm " + l33Var + ", must be " + a(collection);
    }
}
