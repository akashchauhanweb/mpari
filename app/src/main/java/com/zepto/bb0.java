package com.zepto;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb0 {
    public static final void a(ya0 ya0Var, uk1 uk1Var) {
        ya0Var.o(new vk1(uk1Var));
    }

    public static final za0 b(Continuation continuation) {
        if (!(continuation instanceof jk1)) {
            return new za0(continuation, 1);
        }
        za0 za0VarK = ((jk1) continuation).k();
        if (za0VarK != null) {
            if (!za0VarK.J()) {
                za0VarK = null;
            }
            if (za0VarK != null) {
                return za0VarK;
            }
        }
        return new za0(continuation, 2);
    }
}
