package com.zepto;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vv0 {
    public static final s96 a = new s96("CLOSED");

    public static final wv0 b(wv0 wv0Var) {
        while (true) {
            Object objF = wv0Var.f();
            if (objF == a) {
                return wv0Var;
            }
            wv0 wv0Var2 = (wv0) objF;
            if (wv0Var2 != null) {
                wv0Var = wv0Var2;
            } else if (wv0Var.j()) {
                return wv0Var;
            }
        }
    }

    public static final Object c(wu5 wu5Var, long j, Function2 function2) {
        while (true) {
            if (wu5Var.f >= j && !wu5Var.h()) {
                return xu5.a(wu5Var);
            }
            Object objF = wu5Var.f();
            if (objF == a) {
                return xu5.a(a);
            }
            wu5 wu5Var2 = (wu5) ((wv0) objF);
            if (wu5Var2 == null) {
                wu5Var2 = (wu5) function2.invoke(Long.valueOf(wu5Var.f + 1), wu5Var);
                if (wu5Var.l(wu5Var2)) {
                    if (wu5Var.h()) {
                        wu5Var.k();
                    }
                }
            }
            wu5Var = wu5Var2;
        }
    }
}
