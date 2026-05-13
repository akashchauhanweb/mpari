package com.zepto;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e00 {
    public static final a m = new a(null);
    public o96 a;
    public final Handler b;
    public Runnable c;
    public final Object d;
    public long e;
    public final Executor f;
    public int g;
    public long h;
    public n96 i;
    public boolean j;
    public final Runnable k;
    public final Runnable l;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e00(long j, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.b = new Handler(Looper.getMainLooper());
        this.d = new Object();
        this.e = autoCloseTimeUnit.toMillis(j);
        this.f = autoCloseExecutor;
        this.h = SystemClock.uptimeMillis();
        this.k = new Runnable() { // from class: com.zepto.c00
            @Override // java.lang.Runnable
            public final void run() {
                e00.f(this.c);
            }
        };
        this.l = new Runnable() { // from class: com.zepto.d00
            @Override // java.lang.Runnable
            public final void run() {
                e00.c(this.c);
            }
        };
    }

    public static final void c(e00 this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.h < this$0.e) {
                    return;
                }
                if (this$0.g != 0) {
                    return;
                }
                Runnable runnable = this$0.c;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                }
                n96 n96Var = this$0.i;
                if (n96Var != null && n96Var.isOpen()) {
                    n96Var.close();
                }
                this$0.i = null;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void f(e00 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f.execute(this$0.l);
    }

    public final void d() {
        synchronized (this.d) {
            try {
                this.j = true;
                n96 n96Var = this.i;
                if (n96Var != null) {
                    n96Var.close();
                }
                this.i = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            try {
                int i = this.g;
                if (i <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
                }
                int i2 = i - 1;
                this.g = i2;
                if (i2 == 0) {
                    if (this.i == null) {
                        return;
                    } else {
                        this.b.postDelayed(this.k, this.e);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final n96 h() {
        return this.i;
    }

    public final o96 i() {
        o96 o96Var = this.a;
        if (o96Var != null) {
            return o96Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    public final n96 j() {
        synchronized (this.d) {
            this.b.removeCallbacks(this.k);
            this.g++;
            if (!(!this.j)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            n96 n96Var = this.i;
            if (n96Var != null && n96Var.isOpen()) {
                return n96Var;
            }
            n96 n96VarO0 = i().o0();
            this.i = n96VarO0;
            return n96VarO0;
        }
    }

    public final void k(o96 delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        n(delegateOpenHelper);
    }

    public final boolean l() {
        return !this.j;
    }

    public final void m(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.c = onAutoClose;
    }

    public final void n(o96 o96Var) {
        Intrinsics.checkNotNullParameter(o96Var, "<set-?>");
        this.a = o96Var;
    }
}
