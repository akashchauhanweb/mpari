package com.zepto;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.zepto.nh4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r22 implements Runnable {
    public static final String f = rn3.i("EnqueueRunnable");
    public final mx7 c;
    public final oh4 e;

    public r22(mx7 mx7Var) {
        this(mx7Var, new oh4());
    }

    public static boolean b(mx7 mx7Var) {
        boolean zC = c(mx7Var.g(), mx7Var.f(), (String[]) mx7.l(mx7Var).toArray(new String[0]), mx7Var.d(), mx7Var.b());
        mx7Var.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(com.zepto.jy7 r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, com.zepto.s62 r22) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.r22.c(com.zepto.jy7, java.util.List, java.lang.String[], java.lang.String, com.zepto.s62):boolean");
    }

    public static boolean e(mx7 mx7Var) {
        List<mx7> listE = mx7Var.e();
        boolean zE = false;
        if (listE != null) {
            for (mx7 mx7Var2 : listE) {
                if (mx7Var2.j()) {
                    rn3.e().k(f, "Already enqueued work ids (" + TextUtils.join(", ", mx7Var2.c()) + ")");
                } else {
                    zE |= e(mx7Var2);
                }
            }
        }
        return b(mx7Var) | zE;
    }

    public boolean a() {
        jy7 jy7VarG = this.c.g();
        WorkDatabase workDatabaseN = jy7VarG.n();
        workDatabaseN.e();
        try {
            s22.a(workDatabaseN, jy7VarG.g(), this.c);
            boolean zE = e(this.c);
            workDatabaseN.A();
            return zE;
        } finally {
            workDatabaseN.i();
        }
    }

    public nh4 d() {
        return this.e;
    }

    public void f() {
        jy7 jy7VarG = this.c.g();
        xo5.h(jy7VarG.g(), jy7VarG.n(), jy7VarG.l());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.c.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.c + ")");
            }
            if (a()) {
                wk4.c(this.c.g().f(), RescheduleReceiver.class, true);
                f();
            }
            this.e.a(nh4.a);
        } catch (Throwable th) {
            this.e.a(new nh4.b.a(th));
        }
    }

    public r22(mx7 mx7Var, oh4 oh4Var) {
        this.c = mx7Var;
        this.e = oh4Var;
    }
}
