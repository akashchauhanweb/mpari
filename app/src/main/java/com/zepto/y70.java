package com.zepto;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y70 {
    public static final ui0 a = new ui0(-1, null, null, 0);
    public static final int b = na6.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
    public static final int c = na6.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
    public static final s96 d = new s96("BUFFERED");
    public static final s96 e = new s96("SHOULD_BUFFER");
    public static final s96 f = new s96("S_RESUMING_BY_RCV");
    public static final s96 g = new s96("RESUMING_BY_EB");
    public static final s96 h = new s96("POISONED");
    public static final s96 i = new s96("DONE_RCV");
    public static final s96 j = new s96("INTERRUPTED_SEND");
    public static final s96 k = new s96("INTERRUPTED_RCV");
    public static final s96 l = new s96("CHANNEL_CLOSED");
    public static final s96 m = new s96("SUSPEND");
    public static final s96 n = new s96("SUSPEND_NO_WAITER");
    public static final s96 o = new s96("FAILED");
    public static final s96 p = new s96("NO_RECEIVE_RESULT");
    public static final s96 q = new s96("CLOSE_HANDLER_CLOSED");
    public static final s96 r = new s96("CLOSE_HANDLER_INVOKED");
    public static final s96 s = new s96("NO_CLOSE_CAUSE");

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {
        public static final a c = new a();

        public a() {
            super(2, y70.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final ui0 a(long j, ui0 ui0Var) {
            return y70.x(j, ui0Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (ui0) obj2);
        }
    }

    public static final long A(int i2) {
        if (i2 != 0) {
            return i2 != Integer.MAX_VALUE ? i2 : LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    public static final boolean B(ya0 ya0Var, Object obj, Function1 function1) {
        Object objA = ya0Var.a(obj, null, function1);
        if (objA == null) {
            return false;
        }
        ya0Var.p(objA);
        return true;
    }

    public static /* synthetic */ boolean C(ya0 ya0Var, Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        return B(ya0Var, obj, function1);
    }

    public static final long v(long j2, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j2;
    }

    public static final long w(long j2, int i2) {
        return (((long) i2) << 60) + j2;
    }

    public static final ui0 x(long j2, ui0 ui0Var) {
        return new ui0(j2, ui0Var, ui0Var.u(), 0);
    }

    public static final KFunction y() {
        return a.c;
    }

    public static final s96 z() {
        return l;
    }
}
