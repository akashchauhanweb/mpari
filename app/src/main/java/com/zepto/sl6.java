package com.zepto;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sl6 implements Executor {
    public final Executor c;
    public final ArrayDeque e;
    public Runnable f;
    public final Object g;

    public sl6(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.c = executor;
        this.e = new ArrayDeque();
        this.g = new Object();
    }

    public static final void b(Runnable command, sl6 this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.g) {
            try {
                Object objPoll = this.e.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f = runnable;
                if (objPoll != null) {
                    this.c.execute(runnable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.g) {
            try {
                this.e.offer(new Runnable() { // from class: com.zepto.rl6
                    @Override // java.lang.Runnable
                    public final void run() {
                        sl6.b(command, this);
                    }
                });
                if (this.f == null) {
                    c();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
