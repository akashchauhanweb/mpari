package com.zepto;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ep3 {
    public static final boolean a = false;

    public static final xu3 a(Throwable th, String str) throws Throwable {
        if (a) {
            return new xu3(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ xu3 b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(bp3 bp3Var) {
        return bp3Var.B0() instanceof xu3;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final bp3 e(cp3 cp3Var, List list) {
        try {
            return cp3Var.b(list);
        } catch (Throwable th) {
            return a(th, cp3Var.a());
        }
    }
}
