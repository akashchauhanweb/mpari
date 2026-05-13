package com.zepto;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class vd2 {
    public static final Function1 a = b.c;
    public static final Function2 b = a.c;

    public static final class a extends Lambda implements Function2 {
        public static final a c = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b c = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    public static final od2 a(od2 od2Var) {
        return od2Var instanceof v66 ? od2Var : b(od2Var, a, b);
    }

    public static final od2 b(od2 od2Var, Function1 function1, Function2 function2) {
        if (od2Var instanceof wk1) {
            wk1 wk1Var = (wk1) od2Var;
            if (wk1Var.b == function1 && wk1Var.c == function2) {
                return od2Var;
            }
        }
        return new wk1(od2Var, function1, function2);
    }
}
