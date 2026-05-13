package com.zepto;

import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gh4 {

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ Function1 c;
        public final /* synthetic */ Object e;
        public final /* synthetic */ CoroutineContext f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
            super(1);
            this.c = function1;
            this.e = obj;
            this.f = coroutineContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            gh4.b(this.c, this.e, this.f);
        }
    }

    public static final Function1 a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        return new a(function1, obj, coroutineContext);
    }

    public static final void b(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        np6 np6VarC = c(function1, obj, null);
        if (np6VarC != null) {
            wz0.a(coroutineContext, np6VarC);
        }
    }

    public static final np6 c(Function1 function1, Object obj, np6 np6Var) {
        try {
            function1.invoke(obj);
        } catch (Throwable th) {
            if (np6Var == null || np6Var.getCause() == th) {
                return new np6("Exception in undelivered element handler for " + obj, th);
            }
            ExceptionsKt__ExceptionsKt.addSuppressed(np6Var, th);
        }
        return np6Var;
    }

    public static /* synthetic */ np6 d(Function1 function1, Object obj, np6 np6Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            np6Var = null;
        }
        return c(function1, obj, np6Var);
    }
}
