package androidx.lifecycle;

import androidx.lifecycle.h;
import com.zepto.df3;
import com.zepto.f80;
import com.zepto.m43;
import com.zepto.qk1;
import com.zepto.ye3;
import com.zepto.yz0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ye3 implements k {
    public final h c;
    public final CoroutineContext e;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public /* synthetic */ Object e;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = i.this.new a(continuation);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            yz0 yz0Var = (yz0) this.e;
            if (i.this.i().b().compareTo(h.b.INITIALIZED) >= 0) {
                i.this.i().a(i.this);
            } else {
                m43.d(yz0Var.c(), null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    public i(h lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.c = lifecycle;
        this.e = coroutineContext;
        if (i().b() == h.b.DESTROYED) {
            m43.d(c(), null, 1, null);
        }
    }

    @Override // com.zepto.yz0
    public CoroutineContext c() {
        return this.e;
    }

    @Override // androidx.lifecycle.k
    public void e(df3 source, h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (i().b().compareTo(h.b.DESTROYED) <= 0) {
            i().d(this);
            m43.d(c(), null, 1, null);
        }
    }

    public h i() {
        return this.c;
    }

    public final void j() {
        f80.d(this, qk1.c().B0(), null, new a(null), 2, null);
    }
}
