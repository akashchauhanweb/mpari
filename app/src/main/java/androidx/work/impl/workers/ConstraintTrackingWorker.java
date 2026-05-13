package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.zepto.e43;
import com.zepto.ej6;
import com.zepto.ix0;
import com.zepto.jx7;
import com.zepto.jy7;
import com.zepto.kx7;
import com.zepto.mg4;
import com.zepto.nx0;
import com.zepto.nz5;
import com.zepto.rn3;
import com.zepto.sz0;
import com.zepto.x96;
import com.zepto.xf3;
import com.zepto.yy7;
import com.zepto.zy7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R8\u0010\u001e\u001a&\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00040\u0004 \u001b*\u0012\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/c;", "Lcom/zepto/mg4;", "Lcom/zepto/xf3;", "Landroidx/work/c$a;", "n", "", "l", "Lcom/zepto/yy7;", "workSpec", "Lcom/zepto/nx0;", "state", "b", "s", "Landroidx/work/WorkerParameters;", "e", "Landroidx/work/WorkerParameters;", "workerParameters", "", "f", "Ljava/lang/Object;", "lock", "", "g", "Z", "areConstraintsUnmet", "Lcom/zepto/nz5;", "kotlin.jvm.PlatformType", "h", "Lcom/zepto/nz5;", "future", "<set-?>", "i", "Landroidx/work/c;", "getDelegate", "()Landroidx/work/c;", "delegate", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
public final class ConstraintTrackingWorker extends c implements mg4 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final WorkerParameters workerParameters;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Object lock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public volatile boolean areConstraintsUnmet;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final nz5 future;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public c delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = nz5.t();
    }

    public static final void t(e43 job) {
        Intrinsics.checkNotNullParameter(job, "$job");
        job.d(null);
    }

    public static final void u(ConstraintTrackingWorker this$0, xf3 innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            try {
                if (this$0.areConstraintsUnmet) {
                    nz5 future = this$0.future;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    ix0.e(future);
                } else {
                    this$0.future.r(innerFuture);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void v(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s();
    }

    @Override // com.zepto.mg4
    public void b(yy7 workSpec, nx0 state) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(state, "state");
        rn3.e().a(ix0.a, "Constraints changed for " + workSpec);
        if (state instanceof nx0.b) {
            synchronized (this.lock) {
                this.areConstraintsUnmet = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.work.c
    public void l() {
        super.l();
        c cVar = this.delegate;
        if (cVar == null || cVar.j()) {
            return;
        }
        cVar.o(Build.VERSION.SDK_INT >= 31 ? g() : 0);
    }

    @Override // androidx.work.c
    public xf3 n() {
        c().execute(new Runnable() { // from class: com.zepto.fx0
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.v(this.c);
            }
        });
        nz5 future = this.future;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    public final void s() {
        if (this.future.isCancelled()) {
            return;
        }
        String strM = f().m("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        rn3 rn3VarE = rn3.e();
        Intrinsics.checkNotNullExpressionValue(rn3VarE, "get()");
        if (strM == null || strM.length() == 0) {
            rn3VarE.c(ix0.a, "No worker to delegate to.");
            nz5 future = this.future;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            ix0.d(future);
            return;
        }
        c cVarB = i().b(a(), strM, this.workerParameters);
        this.delegate = cVarB;
        if (cVarB == null) {
            rn3VarE.a(ix0.a, "No worker to delegate to.");
            nz5 future2 = this.future;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            ix0.d(future2);
            return;
        }
        jy7 jy7VarI = jy7.i(a());
        Intrinsics.checkNotNullExpressionValue(jy7VarI, "getInstance(applicationContext)");
        zy7 zy7VarH = jy7VarI.n().H();
        String string = e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        yy7 yy7VarM = zy7VarH.m(string);
        if (yy7VarM == null) {
            nz5 future3 = this.future;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            ix0.d(future3);
            return;
        }
        ej6 ej6VarM = jy7VarI.m();
        Intrinsics.checkNotNullExpressionValue(ej6VarM, "workManagerImpl.trackers");
        jx7 jx7Var = new jx7(ej6VarM);
        sz0 sz0VarD = jy7VarI.o().d();
        Intrinsics.checkNotNullExpressionValue(sz0VarD, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
        final e43 e43VarB = kx7.b(jx7Var, yy7VarM, sz0VarD, this);
        this.future.a(new Runnable() { // from class: com.zepto.gx0
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.t(e43VarB);
            }
        }, new x96());
        if (!jx7Var.a(yy7VarM)) {
            rn3VarE.a(ix0.a, "Constraints not met for delegate " + strM + ". Requesting retry.");
            nz5 future4 = this.future;
            Intrinsics.checkNotNullExpressionValue(future4, "future");
            ix0.e(future4);
            return;
        }
        rn3VarE.a(ix0.a, "Constraints met for delegate " + strM);
        try {
            c cVar = this.delegate;
            Intrinsics.checkNotNull(cVar);
            final xf3 xf3VarN = cVar.n();
            Intrinsics.checkNotNullExpressionValue(xf3VarN, "delegate!!.startWork()");
            xf3VarN.a(new Runnable() { // from class: com.zepto.hx0
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.u(this.c, xf3VarN);
                }
            }, c());
        } catch (Throwable th) {
            rn3VarE.b(ix0.a, "Delegated worker " + strM + " threw exception in startWork.", th);
            synchronized (this.lock) {
                try {
                    if (!this.areConstraintsUnmet) {
                        nz5 future5 = this.future;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        ix0.d(future5);
                    } else {
                        rn3VarE.a(ix0.a, "Constraints were unmet, Retrying.");
                        nz5 future6 = this.future;
                        Intrinsics.checkNotNullExpressionValue(future6, "future");
                        ix0.e(future6);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
