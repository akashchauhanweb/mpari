package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class en3 {
    public static final Object a = new s96("CONDITION_FALSE");

    public static final Object a() {
        return a;
    }

    public static final fn3 b(Object obj) {
        fn3 fn3Var;
        h85 h85Var = obj instanceof h85 ? (h85) obj : null;
        if (h85Var != null && (fn3Var = h85Var.a) != null) {
            return fn3Var;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (fn3) obj;
    }
}
