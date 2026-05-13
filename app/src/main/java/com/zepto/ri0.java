package com.zepto;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ri0 {
    public static final li0 a(int i, w70 w70Var, Function1 function1) {
        li0 x70Var;
        if (i == -2) {
            x70Var = w70Var == w70.SUSPEND ? new x70(li0.a.a(), function1) : new gw0(1, w70Var, function1);
        } else {
            if (i == -1) {
                if (w70Var == w70.SUSPEND) {
                    return new gw0(1, w70.DROP_OLDEST, function1);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? w70Var == w70.SUSPEND ? new x70(i, function1) : new gw0(i, w70Var, function1) : new x70(IntCompanionObject.MAX_VALUE, function1);
            }
            x70Var = w70Var == w70.SUSPEND ? new x70(0, function1) : new gw0(1, w70Var, function1);
        }
        return x70Var;
    }

    public static /* synthetic */ li0 b(int i, w70 w70Var, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            w70Var = w70.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return a(i, w70Var, function1);
    }
}
