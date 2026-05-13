package com.zepto;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lf6 {
    public static final s96 a = new s96("NO_THREAD_ELEMENTS");
    public static final Function2 b = a.c;
    public static final Function2 c = b.c;
    public static final Function2 d = c.c;

    public static final class a extends Lambda implements Function2 {
        public static final a c = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            if (!(element instanceof kf6)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
        }
    }

    public static final class b extends Lambda implements Function2 {
        public static final b c = new b();

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kf6 invoke(kf6 kf6Var, CoroutineContext.Element element) {
            if (kf6Var != null) {
                return kf6Var;
            }
            if (element instanceof kf6) {
                return (kf6) element;
            }
            return null;
        }
    }

    public static final class c extends Lambda implements Function2 {
        public static final c c = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rf6 invoke(rf6 rf6Var, CoroutineContext.Element element) {
            if (element instanceof kf6) {
                kf6 kf6Var = (kf6) element;
                rf6Var.a(kf6Var, kf6Var.p0(rf6Var.a));
            }
            return rf6Var;
        }
    }

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof rf6) {
            ((rf6) obj).b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, c);
        Intrinsics.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((kf6) objFold).n(coroutineContext, obj);
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, b);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new rf6(coroutineContext, ((Number) obj).intValue()), d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((kf6) obj).p0(coroutineContext);
    }
}
