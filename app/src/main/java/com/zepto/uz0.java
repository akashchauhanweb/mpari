package com.zepto;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uz0 {
    public static final Collection a = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.asSequence(ServiceLoader.load(tz0.class, tz0.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
