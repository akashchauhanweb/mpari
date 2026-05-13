package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public abstract class qz0 {

    public static final class a extends Lambda implements Function2 {
        public static final a c = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            return coroutineContext.plus(element);
        }
    }

    public static final class b extends Lambda implements Function2 {
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef objectRef, boolean z) {
            super(2);
            this.c = objectRef;
            this.e = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            return coroutineContext.plus(element);
        }
    }

    public static final class c extends Lambda implements Function2 {
        public static final c c = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z, CoroutineContext.Element element) {
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean zC = c(coroutineContext);
        boolean zC2 = c(coroutineContext2);
        if (!zC && !zC2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new b(objectRef, z));
        if (zC2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, a.c);
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    public static final String b(CoroutineContext coroutineContext) {
        return null;
    }

    public static final boolean c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, c.c)).booleanValue();
    }

    public static final CoroutineContext d(yz0 yz0Var, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(yz0Var.c(), coroutineContext, true);
        return (coroutineContextA == qk1.a() || coroutineContextA.get(ContinuationInterceptor.INSTANCE) != null) ? coroutineContextA : coroutineContextA.plus(qk1.a());
    }

    public static final CoroutineContext e(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !c(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    public static final op6 f(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof lk1) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof op6) {
                return (op6) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final op6 g(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(qp6.c) == null) {
            return null;
        }
        op6 op6VarF = f((CoroutineStackFrame) continuation);
        if (op6VarF != null) {
            op6VarF.H0(coroutineContext, obj);
        }
        return op6VarF;
    }
}
