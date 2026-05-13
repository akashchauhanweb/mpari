package com.zepto;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface e43 extends CoroutineContext.Element {
    public static final b d = b.c;

    public static final class a {
        public static /* synthetic */ void a(e43 e43Var, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            e43Var.d(cancellationException);
        }

        public static Object b(e43 e43Var, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(e43Var, obj, function2);
        }

        public static CoroutineContext.Element c(e43 e43Var, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.get(e43Var, key);
        }

        public static /* synthetic */ uk1 d(e43 e43Var, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return e43Var.P(z, z2, function1);
        }

        public static CoroutineContext e(e43 e43Var, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(e43Var, key);
        }

        public static CoroutineContext f(e43 e43Var, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(e43Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.Key {
        public static final /* synthetic */ b c = new b();
    }

    uk1 P(boolean z, boolean z2, Function1 function1);

    CancellationException U();

    void d(CancellationException cancellationException);

    boolean isActive();

    uk1 j(Function1 function1);

    boolean start();

    xj0 w(zj0 zj0Var);
}
