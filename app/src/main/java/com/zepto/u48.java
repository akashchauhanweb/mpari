package com.zepto;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.zepto.qc6;
import com.zepto.wj2;
import com.zepto.yp;

/* JADX INFO: loaded from: classes.dex */
public final class u48 extends wj2 implements ud6 {
    public static final yp.g k;
    public static final yp.a l;
    public static final yp m;

    static {
        yp.g gVar = new yp.g();
        k = gVar;
        r48 r48Var = new r48();
        l = r48Var;
        m = new yp("ClientTelemetry.API", r48Var, gVar);
    }

    public u48(Context context, vd6 vd6Var) {
        super(context, m, vd6Var, wj2.a.c);
    }

    @Override // com.zepto.ud6
    public final Task a(final sd6 sd6Var) {
        qc6.a aVarA = qc6.a();
        aVarA.d(v38.a);
        aVarA.c(false);
        aVarA.b(new d85() { // from class: com.zepto.o48
            @Override // com.zepto.d85
            public final void c(Object obj, Object obj2) {
                sd6 sd6Var2 = sd6Var;
                yp.g gVar = u48.k;
                ((h48) ((x48) obj).A()).p0(sd6Var2);
                ((rc6) obj2).c(null);
            }
        });
        return g(aVarA.a());
    }
}
