package com.zepto;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class sz0 extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final a c = new a(null);

    public static final class a extends AbstractCoroutineContextKey {

        /* JADX INFO: renamed from: com.zepto.sz0$a$a, reason: collision with other inner class name */
        public static final class C0120a extends Lambda implements Function1 {
            public static final C0120a c = new C0120a();

            public C0120a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final sz0 invoke(CoroutineContext.Element element) {
                if (element instanceof sz0) {
                    return (sz0) element;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
            super(ContinuationInterceptor.INSTANCE, C0120a.c);
        }
    }

    public sz0() {
        super(ContinuationInterceptor.INSTANCE);
    }

    public sz0 A0(int i) {
        kf3.a(i);
        return new jf3(this, i);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final Continuation interceptContinuation(Continuation continuation) {
        return new jk1(this, continuation);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((jk1) continuation).r();
    }

    public String toString() {
        return me1.a(this) + '@' + me1.b(this);
    }

    public abstract void x0(CoroutineContext coroutineContext, Runnable runnable);

    public void y0(CoroutineContext coroutineContext, Runnable runnable) {
        x0(coroutineContext, runnable);
    }

    public boolean z0(CoroutineContext coroutineContext) {
        return true;
    }
}
