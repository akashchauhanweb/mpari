package com.zepto;

import com.zepto.nx0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class zw0 {
    public final dx0 a;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public /* synthetic */ Object e;

        /* JADX INFO: renamed from: com.zepto.zw0$a$a, reason: collision with other inner class name */
        public static final class C0135a extends Lambda implements Function0 {
            public final /* synthetic */ zw0 c;
            public final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0135a(zw0 zw0Var, b bVar) {
                super(0);
                this.c = zw0Var;
                this.e = bVar;
            }

            public final void a() {
                this.c.a.f(this.e);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public static final class b implements bx0 {
            public final /* synthetic */ zw0 a;
            public final /* synthetic */ ew4 b;

            public b(zw0 zw0Var, ew4 ew4Var) {
                this.a = zw0Var;
                this.b = ew4Var;
            }

            @Override // com.zepto.bx0
            public void a(Object obj) {
                this.b.m().h(this.a.e(obj) ? new nx0.b(this.a.b()) : nx0.a.a);
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ew4 ew4Var, Continuation continuation) {
            return ((a) create(ew4Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = zw0.this.new a(continuation);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ew4 ew4Var = (ew4) this.e;
                b bVar = new b(zw0.this, ew4Var);
                zw0.this.a.c(bVar);
                C0135a c0135a = new C0135a(zw0.this, bVar);
                this.c = 1;
                if (cw4.a(ew4Var, c0135a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public zw0(dx0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.a = tracker;
    }

    public abstract int b();

    public abstract boolean c(yy7 yy7Var);

    public final boolean d(yy7 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return c(workSpec) && e(this.a.e());
    }

    public abstract boolean e(Object obj);

    public final od2 f() {
        return sd2.c(new a(null));
    }
}
