package com.zepto;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oi0 implements od2 {
    public final CoroutineContext a;
    public final int b;
    public final w70 c;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public /* synthetic */ Object e;
        public final /* synthetic */ pd2 f;
        public final /* synthetic */ oi0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pd2 pd2Var, oi0 oi0Var, Continuation continuation) {
            super(2, continuation);
            this.f = pd2Var;
            this.g = oi0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f, this.g, continuation);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                yz0 yz0Var = (yz0) this.e;
                pd2 pd2Var = this.f;
                t55 t55VarH = this.g.h(yz0Var);
                this.c = 1;
                if (sd2.e(pd2Var, t55VarH, this) == coroutine_suspended) {
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

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public /* synthetic */ Object e;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ew4 ew4Var, Continuation continuation) {
            return ((b) create(ew4Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = oi0.this.new b(continuation);
            bVar.e = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ew4 ew4Var = (ew4) this.e;
                oi0 oi0Var = oi0.this;
                this.c = 1;
                if (oi0Var.e(ew4Var, this) == coroutine_suspended) {
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

    public oi0(CoroutineContext coroutineContext, int i, w70 w70Var) {
        this.a = coroutineContext;
        this.b = i;
        this.c = w70Var;
    }

    public static /* synthetic */ Object d(oi0 oi0Var, pd2 pd2Var, Continuation continuation) {
        Object objC = zz0.c(new a(pd2Var, oi0Var, null), continuation);
        return objC == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Unit.INSTANCE;
    }

    @Override // com.zepto.od2
    public Object a(pd2 pd2Var, Continuation continuation) {
        return d(this, pd2Var, continuation);
    }

    public String c() {
        return null;
    }

    public abstract Object e(ew4 ew4Var, Continuation continuation);

    public final Function2 f() {
        return new b(null);
    }

    public final int g() {
        int i = this.b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public t55 h(yz0 yz0Var) {
        return cw4.c(yz0Var, this.a, g(), this.c, a01.ATOMIC, null, f(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        if (this.a != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.a);
        }
        if (this.b != -3) {
            arrayList.add("capacity=" + this.b);
        }
        if (this.c != w70.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.c);
        }
        return me1.a(this) + '[' + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
