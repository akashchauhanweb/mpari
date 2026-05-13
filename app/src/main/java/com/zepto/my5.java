package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface my5 {

    public static final class a {
        public static /* synthetic */ boolean a(my5 my5Var, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return my5Var.b(th);
        }
    }

    boolean b(Throwable th);

    void e(Function1 function1);

    Object h(Object obj);

    Object i(Object obj, Continuation continuation);

    boolean l();
}
