package com.zepto;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p06 {
    public static final s96 a = new s96("NO_VALUE");

    public static final sy3 a(int i, int i2, w70 w70Var) {
        if (i < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        if (i > 0 || i2 > 0 || w70Var == w70.SUSPEND) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = IntCompanionObject.MAX_VALUE;
            }
            return new o06(i, i3, w70Var);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + w70Var).toString());
    }

    public static /* synthetic */ sy3 b(int i, int i2, w70 w70Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            w70Var = w70.SUSPEND;
        }
        return a(i, i2, w70Var);
    }

    public static final Object e(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void f(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
