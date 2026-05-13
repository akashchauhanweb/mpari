package com.zepto;

import android.content.Context;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class nv0 {
    public static final nv0 a = new nv0();

    public static final class a extends Lambda implements Function1 {
        public static final a c = new a();

        public a() {
            super(1);
        }

        public final void a(hv0 receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            df1.b(receiver, 0, 0, null, 0, 15, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((hv0) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public yz0 c;
        public int e;
        public final /* synthetic */ Function1 f;
        public final /* synthetic */ Context g;
        public final /* synthetic */ File h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Context context, File file, Continuation continuation) {
            super(2, continuation);
            this.f = function1;
            this.g = context;
            this.h = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation completion) {
            Intrinsics.checkParameterIsNotNull(completion, "completion");
            b bVar = new b(this.f, this.g, this.h, completion);
            bVar.c = (yz0) obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            hv0 hv0Var = new hv0();
            this.f.invoke(hv0Var);
            File fileD = it6.d(this.g, this.h);
            for (xw0 xw0Var : hv0Var.b()) {
                while (!xw0Var.b(fileD)) {
                    fileD = xw0Var.a(fileD);
                }
            }
            return fileD;
        }
    }

    public static /* synthetic */ Object b(nv0 nv0Var, Context context, File file, CoroutineContext coroutineContext, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            coroutineContext = qk1.b();
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i & 8) != 0) {
            function1 = a.c;
        }
        return nv0Var.a(context, file, coroutineContext2, function1, continuation);
    }

    public final Object a(Context context, File file, CoroutineContext coroutineContext, Function1 function1, Continuation continuation) {
        return e80.e(coroutineContext, new b(function1, context, file, null), continuation);
    }
}
