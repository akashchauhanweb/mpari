package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.zepto.bb3;
import com.zepto.wj2;
import com.zepto.yf3;
import com.zepto.yp;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ea8 extends wj2 implements bi2 {
    public static final yp.g k;
    public static final yp l;

    static {
        yp.g gVar = new yp.g();
        k = gVar;
        l = new yp("LocationServices.API", new y98(), gVar);
    }

    public ea8(Activity activity) {
        super(activity, l, (yp.d) yp.d.a, wj2.a.c);
    }

    @Override // com.zepto.bi2
    public final Task b() {
        return h(qc6.a().b(new d85() { // from class: com.zepto.p98
            @Override // com.zepto.d85
            public final void c(Object obj, Object obj2) {
                ((ud8) obj).j0(new bb3.a().a(), (rc6) obj2);
            }
        }).e(2414).a());
    }

    @Override // com.zepto.bi2
    public final Task d(qm3 qm3Var) {
        return j(zf3.b(qm3Var, qm3.class.getSimpleName()), 2418).h(new Executor() { // from class: com.zepto.w98
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new cz0() { // from class: com.zepto.m98
            @Override // com.zepto.cz0
            public final Object a(Task task) {
                yp.g gVar = ea8.k;
                return null;
            }
        });
    }

    @Override // com.zepto.bi2
    public final Task e(LocationRequest locationRequest, qm3 qm3Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            iu4.j(looper, "invalid null looper");
        }
        return q(locationRequest, zf3.a(qm3Var, looper, qm3.class.getSimpleName()));
    }

    public final Task q(final LocationRequest locationRequest, yf3 yf3Var) {
        final ca8 ca8Var = new ca8(this, yf3Var, new aa8() { // from class: com.zepto.k88
            @Override // com.zepto.aa8
            public final void a(ud8 ud8Var, yf3.a aVar, boolean z, rc6 rc6Var) {
                ud8Var.h0(aVar, z, rc6Var);
            }
        });
        return i(t75.a().b(new d85() { // from class: com.zepto.m88
            @Override // com.zepto.d85
            public final void c(Object obj, Object obj2) {
                yp.g gVar = ea8.k;
                ((ud8) obj).k0(ca8Var, locationRequest, (rc6) obj2);
            }
        }).d(ca8Var).e(yf3Var).c(2436).a());
    }

    public ea8(Context context) {
        super(context, l, yp.d.a, wj2.a.c);
    }
}
