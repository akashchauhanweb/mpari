package com.zepto;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.zepto.wj2;
import com.zepto.yp;

/* JADX INFO: loaded from: classes.dex */
public final class qb8 extends wj2 implements xz5 {
    public qb8(Activity activity) {
        super(activity, ea8.l, (yp.d) yp.d.a, wj2.a.c);
    }

    @Override // com.zepto.xz5
    public final Task c(final xm3 xm3Var) {
        return h(qc6.a().b(new d85() { // from class: com.zepto.nb8
            @Override // com.zepto.d85
            public final void c(Object obj, Object obj2) {
                xm3 xm3Var2 = xm3Var;
                ud8 ud8Var = (ud8) obj;
                rc6 rc6Var = (rc6) obj2;
                iu4.b(xm3Var2 != null, "locationSettingsRequest can't be null");
                ((yj8) ud8Var.A()).H(xm3Var2, new sc8(rc6Var), null);
            }
        }).e(2426).a());
    }
}
