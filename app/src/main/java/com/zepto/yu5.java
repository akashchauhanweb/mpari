package com.zepto;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yu5 {
    public static final int c;
    public static final AtomicReference[] d;
    public static final yu5 e = new yu5();
    public static final int a = 65536;
    public static final vu5 b = new vu5(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        c = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        d = atomicReferenceArr;
    }

    public static final void b(vu5 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (!(segment.f == null && segment.g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.d) {
            return;
        }
        AtomicReference atomicReferenceA = e.a();
        vu5 vu5Var = (vu5) atomicReferenceA.get();
        if (vu5Var == b) {
            return;
        }
        int i = vu5Var != null ? vu5Var.c : 0;
        if (i >= a) {
            return;
        }
        segment.f = vu5Var;
        segment.b = 0;
        segment.c = i + ConstantsKt.DEFAULT_BUFFER_SIZE;
        if (bf3.a(atomicReferenceA, vu5Var, segment)) {
            return;
        }
        segment.f = null;
    }

    public static final vu5 c() {
        AtomicReference atomicReferenceA = e.a();
        vu5 vu5Var = b;
        vu5 vu5Var2 = (vu5) atomicReferenceA.getAndSet(vu5Var);
        if (vu5Var2 == vu5Var) {
            return new vu5();
        }
        if (vu5Var2 == null) {
            atomicReferenceA.set(null);
            return new vu5();
        }
        atomicReferenceA.set(vu5Var2.f);
        vu5Var2.f = null;
        vu5Var2.c = 0;
        return vu5Var2;
    }

    public final AtomicReference a() {
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        return d[(int) (threadCurrentThread.getId() & (((long) c) - 1))];
    }
}
