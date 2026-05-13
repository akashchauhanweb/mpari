package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.zepto.az4;
import com.zepto.bw4;
import com.zepto.ej6;
import com.zepto.hy7;
import com.zepto.jy7;
import com.zepto.kk2;
import com.zepto.ky7;
import com.zepto.qy5;
import com.zepto.ro5;
import com.zepto.uc6;
import com.zepto.xo5;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0030a extends FunctionReferenceImpl implements Function6 {
        public static final C0030a c = new C0030a();

        public C0030a() {
            super(6, a.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // kotlin.jvm.functions.Function6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context p0, androidx.work.a p1, uc6 p2, WorkDatabase p3, ej6 p4, bw4 p5) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            Intrinsics.checkNotNullParameter(p4, "p4");
            Intrinsics.checkNotNullParameter(p5, "p5");
            return a.b(p0, p1, p2, p3, p4, p5);
        }
    }

    public static final List b(Context context, androidx.work.a aVar, uc6 uc6Var, WorkDatabase workDatabase, ej6 ej6Var, bw4 bw4Var) {
        ro5 ro5VarC = xo5.c(context, workDatabase, aVar);
        Intrinsics.checkNotNullExpressionValue(ro5VarC, "createBestAvailableBackg…kDatabase, configuration)");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new ro5[]{ro5VarC, new kk2(context, aVar, ej6Var, bw4Var, new hy7(bw4Var, uc6Var), uc6Var)});
    }

    public static final jy7 c(Context context, androidx.work.a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return e(context, configuration, null, null, null, null, null, 124, null);
    }

    public static final jy7 d(Context context, androidx.work.a configuration, uc6 workTaskExecutor, WorkDatabase workDatabase, ej6 trackers, bw4 processor, Function6 schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new jy7(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ jy7 e(Context context, androidx.work.a aVar, uc6 uc6Var, WorkDatabase workDatabase, ej6 ej6Var, bw4 bw4Var, Function6 function6, int i, Object obj) {
        WorkDatabase workDatabaseB;
        ej6 ej6Var2;
        uc6 ky7Var = (i & 4) != 0 ? new ky7(aVar.m()) : uc6Var;
        if ((i & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            qy5 qy5VarB = ky7Var.b();
            Intrinsics.checkNotNullExpressionValue(qy5VarB, "workTaskExecutor.serialTaskExecutor");
            workDatabaseB = companion.b(applicationContext, qy5VarB, aVar.a(), context.getResources().getBoolean(az4.a));
        } else {
            workDatabaseB = workDatabase;
        }
        if ((i & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            ej6Var2 = new ej6(applicationContext2, ky7Var, null, null, null, null, 60, null);
        } else {
            ej6Var2 = ej6Var;
        }
        return d(context, aVar, ky7Var, workDatabaseB, ej6Var2, (i & 32) != 0 ? new bw4(context.getApplicationContext(), aVar, ky7Var, workDatabaseB) : bw4Var, (i & 64) != 0 ? C0030a.c : function6);
    }
}
