package com.zepto;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public final class cl2 extends dl2 {
    private volatile cl2 _immediate;
    public final Handler e;
    public final String f;
    public final boolean g;
    public final cl2 h;

    public static final class a implements Runnable {
        public final /* synthetic */ ya0 c;
        public final /* synthetic */ cl2 e;

        public a(ya0 ya0Var, cl2 cl2Var) {
            this.c = ya0Var;
            this.e = cl2Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.f(this.e, Unit.INSTANCE);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public final /* synthetic */ Runnable e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.e = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            cl2.this.e.removeCallbacks(this.e);
        }
    }

    public cl2(Handler handler, String str, boolean z) {
        super(null);
        this.e = handler;
        this.f = str;
        this.g = z;
        this._immediate = z ? this : null;
        cl2 cl2Var = this._immediate;
        if (cl2Var == null) {
            cl2Var = new cl2(handler, str, true);
            this._immediate = cl2Var;
        }
        this.h = cl2Var;
    }

    @Override // com.zepto.ah1
    public void D(long j, ya0 ya0Var) {
        a aVar = new a(ya0Var, this);
        if (this.e.postDelayed(aVar, RangesKt___RangesKt.coerceAtMost(j, DurationKt.MAX_MILLIS))) {
            ya0Var.o(new b(aVar));
        } else {
            E0(ya0Var.getContext(), aVar);
        }
    }

    public final void E0(CoroutineContext coroutineContext, Runnable runnable) {
        k43.c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        qk1.b().x0(coroutineContext, runnable);
    }

    @Override // com.zepto.bp3
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public cl2 B0() {
        return this.h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof cl2) && ((cl2) obj).e == this.e;
    }

    public int hashCode() {
        return System.identityHashCode(this.e);
    }

    @Override // com.zepto.sz0
    public String toString() {
        String strC0 = C0();
        if (strC0 != null) {
            return strC0;
        }
        String string = this.f;
        if (string == null) {
            string = this.e.toString();
        }
        if (!this.g) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // com.zepto.sz0
    public void x0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.e.post(runnable)) {
            return;
        }
        E0(coroutineContext, runnable);
    }

    @Override // com.zepto.sz0
    public boolean z0(CoroutineContext coroutineContext) {
        return (this.g && Intrinsics.areEqual(Looper.myLooper(), this.e.getLooper())) ? false : true;
    }

    public /* synthetic */ cl2(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public cl2(Handler handler, String str) {
        this(handler, str, false);
    }
}
