package androidx.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.c;
import com.zepto.e43;
import com.zepto.f80;
import com.zepto.jt0;
import com.zepto.m43;
import com.zepto.n43;
import com.zepto.nz5;
import com.zepto.qk1;
import com.zepto.sz0;
import com.zepto.xf3;
import com.zepto.yz0;
import com.zepto.zz0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001f\u001a\u00020\u00188\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Lcom/zepto/xf3;", "Landroidx/work/c$a;", "n", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zepto/pe2;", "t", "d", "", "l", "Lcom/zepto/jt0;", "e", "Lcom/zepto/jt0;", "getJob$work_runtime_release", "()Lcom/zepto/jt0;", "job", "Lcom/zepto/nz5;", "f", "Lcom/zepto/nz5;", "v", "()Lcom/zepto/nz5;", "future", "Lcom/zepto/sz0;", "g", "Lcom/zepto/sz0;", "s", "()Lcom/zepto/sz0;", "getCoroutineContext$annotations", "()V", "coroutineContext", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoroutineWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineWorker.kt\nandroidx/work/CoroutineWorker\n+ 2 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,144:1\n40#2,8:145\n48#2:162\n60#2,7:163\n40#2,8:172\n48#2:189\n60#2,7:190\n314#3,9:153\n323#3,2:170\n314#3,9:180\n323#3,2:197\n*S KotlinDebug\n*F\n+ 1 CoroutineWorker.kt\nandroidx/work/CoroutineWorker\n*L\n110#1:145,8\n110#1:162\n110#1:163,7\n125#1:172,8\n125#1:189\n125#1:190,7\n110#1:153,9\n110#1:170,2\n125#1:180,9\n125#1:197,2\n*E\n"})
public abstract class CoroutineWorker extends c {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final jt0 job;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final nz5 future;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final sz0 coroutineContext;

    public static final class a extends SuspendLambda implements Function2 {
        public Object c;
        public int e;
        public final /* synthetic */ n43 f;
        public final /* synthetic */ CoroutineWorker g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n43 n43Var, CoroutineWorker coroutineWorker, Continuation continuation) {
            super(2, continuation);
            this.f = n43Var;
            this.g = coroutineWorker;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            n43 n43Var;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                n43 n43Var2 = this.f;
                CoroutineWorker coroutineWorker = this.g;
                this.c = n43Var2;
                this.e = 1;
                Object objT = coroutineWorker.t(this);
                if (objT == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n43Var = n43Var2;
                obj = objT;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n43Var = (n43) this.c;
                ResultKt.throwOnFailure(obj);
            }
            n43Var.c(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CoroutineWorker.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.c = 1;
                    obj = coroutineWorker.r(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CoroutineWorker.this.getFuture().p((c.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture().q(th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = m43.b(null, 1, null);
        nz5 nz5VarT = nz5.t();
        Intrinsics.checkNotNullExpressionValue(nz5VarT, "create()");
        this.future = nz5VarT;
        nz5VarT.a(new Runnable() { // from class: com.zepto.b01
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker.q(this.c);
            }
        }, h().b());
        this.coroutineContext = qk1.a();
    }

    public static final void q(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            e43.a.a(this$0.job, null, 1, null);
        }
    }

    public static /* synthetic */ Object u(CoroutineWorker coroutineWorker, Continuation continuation) {
        throw new IllegalStateException("Not implemented");
    }

    @Override // androidx.work.c
    public final xf3 d() {
        jt0 jt0VarB = m43.b(null, 1, null);
        yz0 yz0VarA = zz0.a(getCoroutineContext().plus(jt0VarB));
        n43 n43Var = new n43(jt0VarB, null, 2, null);
        f80.d(yz0VarA, null, null, new a(n43Var, this, null), 3, null);
        return n43Var;
    }

    @Override // androidx.work.c
    public final void l() {
        super.l();
        this.future.cancel(false);
    }

    @Override // androidx.work.c
    public final xf3 n() {
        f80.d(zz0.a(getCoroutineContext().plus(this.job)), null, null, new b(null), 3, null);
        return this.future;
    }

    public abstract Object r(Continuation continuation);

    /* JADX INFO: renamed from: s, reason: from getter */
    public sz0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object t(Continuation continuation) {
        return u(this, continuation);
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final nz5 getFuture() {
        return this.future;
    }
}
