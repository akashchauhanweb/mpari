package com.zepto;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo5 {
    public static final String a = rn3.i("Schedulers");

    public static ro5 c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        ka6 ka6Var = new ka6(context, workDatabase, aVar);
        wk4.c(context, SystemJobService.class, true);
        rn3.e().a(a, "Created SystemJobScheduler and enabled SystemJobService");
        return ka6Var;
    }

    public static /* synthetic */ void d(List list, ay7 ay7Var, androidx.work.a aVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ro5) it.next()).a(ay7Var.b());
        }
        h(aVar, workDatabase, list);
    }

    public static /* synthetic */ void e(Executor executor, final List list, final androidx.work.a aVar, final WorkDatabase workDatabase, final ay7 ay7Var, boolean z) {
        executor.execute(new Runnable() { // from class: com.zepto.wo5
            @Override // java.lang.Runnable
            public final void run() {
                xo5.d(list, ay7Var, aVar, workDatabase);
            }
        });
    }

    public static void f(zy7 zy7Var, xq0 xq0Var, List list) {
        if (list.size() > 0) {
            long jA = xq0Var.a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zy7Var.f(((yy7) it.next()).a, jA);
            }
        }
    }

    public static void g(final List list, bw4 bw4Var, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        bw4Var.e(new x52() { // from class: com.zepto.vo5
            @Override // com.zepto.x52
            public final void d(ay7 ay7Var, boolean z) {
                xo5.e(executor, list, aVar, workDatabase, ay7Var, z);
            }
        });
    }

    public static void h(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        zy7 zy7VarH = workDatabase.H();
        workDatabase.e();
        try {
            List listI = zy7VarH.i();
            f(zy7VarH, aVar.a(), listI);
            List listL = zy7VarH.l(aVar.h());
            f(zy7VarH, aVar.a(), listL);
            if (listI != null) {
                listL.addAll(listI);
            }
            List listV = zy7VarH.v(200);
            workDatabase.A();
            workDatabase.i();
            if (listL.size() > 0) {
                yy7[] yy7VarArr = (yy7[]) listL.toArray(new yy7[listL.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ro5 ro5Var = (ro5) it.next();
                    if (ro5Var.e()) {
                        ro5Var.c(yy7VarArr);
                    }
                }
            }
            if (listV.size() > 0) {
                yy7[] yy7VarArr2 = (yy7[]) listV.toArray(new yy7[listV.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ro5 ro5Var2 = (ro5) it2.next();
                    if (!ro5Var2.e()) {
                        ro5Var2.c(yy7VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.i();
            throw th;
        }
    }
}
