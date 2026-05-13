package com.zepto;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class kx7 {
    public static final String a;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ jx7 e;
        public final /* synthetic */ yy7 f;
        public final /* synthetic */ mg4 g;

        /* JADX INFO: renamed from: com.zepto.kx7$a$a, reason: collision with other inner class name */
        public static final class C0100a implements pd2 {
            public final /* synthetic */ mg4 a;
            public final /* synthetic */ yy7 b;

            public C0100a(mg4 mg4Var, yy7 yy7Var) {
                this.a = mg4Var;
                this.b = yy7Var;
            }

            @Override // com.zepto.pd2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object c(nx0 nx0Var, Continuation continuation) {
                this.a.b(this.b, nx0Var);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jx7 jx7Var, yy7 yy7Var, mg4 mg4Var, Continuation continuation) {
            super(2, continuation);
            this.e = jx7Var;
            this.f = yy7Var;
            this.g = mg4Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                od2 od2VarB = this.e.b(this.f);
                C0100a c0100a = new C0100a(this.g, this.f);
                this.c = 1;
                if (od2VarB.a(c0100a, this) == coroutine_suspended) {
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

    static {
        String strI = rn3.i("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WorkConstraintsTracker\")");
        a = strI;
    }

    public static final e43 b(jx7 jx7Var, yy7 spec, sz0 dispatcher, mg4 listener) {
        Intrinsics.checkNotNullParameter(jx7Var, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        jt0 jt0VarB = m43.b(null, 1, null);
        f80.d(zz0.a(dispatcher.plus(jt0VarB)), null, null, new a(jx7Var, spec, listener, null), 3, null);
        return jt0VarB;
    }
}
