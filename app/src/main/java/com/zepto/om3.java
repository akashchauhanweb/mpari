package com.zepto;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class om3 {
    public static lm3 a(lm3 lm3Var, lm3 lm3Var2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < lm3Var.f() + lm3Var2.f()) {
            Locale localeC = i < lm3Var.f() ? lm3Var.c(i) : lm3Var2.c(i - lm3Var.f());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i++;
        }
        return lm3.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static lm3 b(lm3 lm3Var, lm3 lm3Var2) {
        return (lm3Var == null || lm3Var.e()) ? lm3.d() : a(lm3Var, lm3Var2);
    }
}
