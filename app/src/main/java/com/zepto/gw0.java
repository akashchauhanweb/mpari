package com.zepto;

import com.zepto.si0;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public class gw0 extends x70 {
    public final int p;
    public final w70 q;

    public gw0(int i, w70 w70Var, Function1 function1) {
        super(i, function1);
        this.p = i;
        this.q = w70Var;
        if (w70Var == w70.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(x70.class).getSimpleName() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    public static /* synthetic */ Object J0(gw0 gw0Var, Object obj, Continuation continuation) throws Throwable {
        np6 np6VarD;
        Object objM0 = gw0Var.M0(obj, true);
        if (!(objM0 instanceof si0.a)) {
            return Unit.INSTANCE;
        }
        si0.e(objM0);
        Function1 function1 = gw0Var.e;
        if (function1 == null || (np6VarD = gh4.d(function1, obj, null, 2, null)) == null) {
            throw gw0Var.P();
        }
        ExceptionsKt__ExceptionsKt.addSuppressed(np6VarD, gw0Var.P());
        throw np6VarD;
    }

    public final Object K0(Object obj, boolean z) {
        Function1 function1;
        np6 np6VarD;
        Object objH = super.h(obj);
        if (si0.i(objH) || si0.h(objH)) {
            return objH;
        }
        if (!z || (function1 = this.e) == null || (np6VarD = gh4.d(function1, obj, null, 2, null)) == null) {
            return si0.b.c(Unit.INSTANCE);
        }
        throw np6VarD;
    }

    public final Object L0(Object obj) {
        ui0 ui0Var;
        Object obj2 = y70.d;
        ui0 ui0Var2 = (ui0) x70.k.get(this);
        while (true) {
            long andIncrement = x70.g.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean Z = Z(andIncrement);
            int i = y70.b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ui0Var2.f != j2) {
                ui0 ui0VarK = K(j2, ui0Var2);
                if (ui0VarK != null) {
                    ui0Var = ui0VarK;
                } else if (Z) {
                    return si0.b.a(P());
                }
            } else {
                ui0Var = ui0Var2;
            }
            int iE0 = E0(ui0Var, i2, obj, j, obj2, Z);
            if (iE0 == 0) {
                ui0Var.b();
                return si0.b.c(Unit.INSTANCE);
            }
            if (iE0 == 1) {
                return si0.b.c(Unit.INSTANCE);
            }
            if (iE0 == 2) {
                if (Z) {
                    ui0Var.p();
                    return si0.b.a(P());
                }
                ju7 ju7Var = obj2 instanceof ju7 ? (ju7) obj2 : null;
                if (ju7Var != null) {
                    o0(ju7Var, ui0Var, i2);
                }
                G((ui0Var.f * ((long) i)) + ((long) i2));
                return si0.b.c(Unit.INSTANCE);
            }
            if (iE0 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iE0 == 4) {
                if (j < O()) {
                    ui0Var.b();
                }
                return si0.b.a(P());
            }
            if (iE0 == 5) {
                ui0Var.b();
            }
            ui0Var2 = ui0Var;
        }
    }

    public final Object M0(Object obj, boolean z) {
        return this.q == w70.DROP_LATEST ? K0(obj, z) : L0(obj);
    }

    @Override // com.zepto.x70
    public boolean a0() {
        return this.q == w70.DROP_OLDEST;
    }

    @Override // com.zepto.x70, com.zepto.my5
    public Object h(Object obj) {
        return M0(obj, false);
    }

    @Override // com.zepto.x70, com.zepto.my5
    public Object i(Object obj, Continuation continuation) {
        return J0(this, obj, continuation);
    }
}
