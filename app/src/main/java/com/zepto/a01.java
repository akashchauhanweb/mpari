package com.zepto;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public enum a01 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a01.values().length];
            try {
                iArr[a01.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a01.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a01.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a01.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public final void b(Function2 function2, Object obj, Continuation continuation) throws Throwable {
        int i = a.a[ordinal()];
        if (i == 1) {
            cb0.d(function2, obj, continuation, null, 4, null);
            return;
        }
        if (i == 2) {
            ContinuationKt.startCoroutine(function2, obj, continuation);
        } else if (i == 3) {
            pp6.a(function2, obj, continuation);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean c() {
        return this == LAZY;
    }
}
