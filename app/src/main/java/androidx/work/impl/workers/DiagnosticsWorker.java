package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import com.zepto.da6;
import com.zepto.dz7;
import com.zepto.jy7;
import com.zepto.ny7;
import com.zepto.rj1;
import com.zepto.rn3;
import com.zepto.zy7;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a p() {
        jy7 jy7VarI = jy7.i(a());
        Intrinsics.checkNotNullExpressionValue(jy7VarI, "getInstance(applicationContext)");
        WorkDatabase workDatabaseN = jy7VarI.n();
        Intrinsics.checkNotNullExpressionValue(workDatabaseN, "workManager.workDatabase");
        zy7 zy7VarH = workDatabaseN.H();
        ny7 ny7VarF = workDatabaseN.F();
        dz7 dz7VarI = workDatabaseN.I();
        da6 da6VarE = workDatabaseN.E();
        List listJ = zy7VarH.j(jy7VarI.g().a().a() - TimeUnit.DAYS.toMillis(1L));
        List listC = zy7VarH.c();
        List listV = zy7VarH.v(200);
        if (!listJ.isEmpty()) {
            rn3.e().f(rj1.a, "Recently completed work:\n\n");
            rn3.e().f(rj1.a, rj1.d(ny7VarF, dz7VarI, da6VarE, listJ));
        }
        if (!listC.isEmpty()) {
            rn3.e().f(rj1.a, "Running work:\n\n");
            rn3.e().f(rj1.a, rj1.d(ny7VarF, dz7VarI, da6VarE, listC));
        }
        if (!listV.isEmpty()) {
            rn3.e().f(rj1.a, "Enqueued work:\n\n");
            rn3.e().f(rj1.a, rj1.d(ny7VarF, dz7VarI, da6VarE, listV));
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success()");
        return aVarC;
    }
}
