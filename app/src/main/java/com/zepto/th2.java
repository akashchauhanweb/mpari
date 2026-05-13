package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class th2 {
    public final Executor a;
    public final Function0 b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public final List g;
    public final Runnable h;

    public th2(Executor executor, Function0 reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.a = executor;
        this.b = reportFullyDrawn;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new Runnable() { // from class: com.zepto.sh2
            @Override // java.lang.Runnable
            public final void run() {
                th2.d(this.c);
            }
        };
    }

    public static final void d(th2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.c) {
            try {
                this$0.e = false;
                if (this$0.d == 0 && !this$0.f) {
                    this$0.b.invoke();
                    this$0.b();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.g.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }
}
