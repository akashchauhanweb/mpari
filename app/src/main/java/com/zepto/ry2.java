package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ry2 implements z.b {
    public final ar7[] b;

    public ry2(ar7... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.b = initializers;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 b(Class modelClass, h31 extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        zq7 zq7Var = null;
        for (ar7 ar7Var : this.b) {
            if (Intrinsics.areEqual(ar7Var.a(), modelClass)) {
                Object objInvoke = ar7Var.b().invoke(extras);
                zq7Var = objInvoke instanceof zq7 ? (zq7) objInvoke : null;
            }
        }
        if (zq7Var != null) {
            return zq7Var;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
