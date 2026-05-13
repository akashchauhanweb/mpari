package com.zepto;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.h;
import com.zepto.eg4;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class eg4 {
    public final Runnable a;
    public final ux0 b;
    public final ArrayDeque c;
    public dg4 d;
    public OnBackInvokedCallback e;
    public OnBackInvokedDispatcher f;
    public boolean g;
    public boolean h;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(n30 backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            eg4.this.m(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((n30) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(n30 backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            eg4.this.l(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((n30) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        public final void a() {
            eg4.this.k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        public final void a() {
            eg4.this.j();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        public final void a() {
            eg4.this.k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class f {
        public static final f a = new f();

        public static final void c(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: com.zepto.fg4
                public final void onBackInvoked() {
                    eg4.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int i, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class g {
        public static final g a = new g();

        public static final class a implements OnBackAnimationCallback {
            public final /* synthetic */ Function1 a;
            public final /* synthetic */ Function1 b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ Function0 d;

            public a(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
                this.a = function1;
                this.b = function12;
                this.c = function0;
                this.d = function02;
            }

            public void onBackCancelled() {
                this.d.invoke();
            }

            public void onBackInvoked() {
                this.c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.b.invoke(new n30(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.a.invoke(new n30(backEvent));
            }
        }

        public final OnBackInvokedCallback a(Function1<? super n30, Unit> onBackStarted, Function1<? super n30, Unit> onBackProgressed, Function0<Unit> onBackInvoked, Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    public final class h implements androidx.lifecycle.k, xa0 {
        public final androidx.lifecycle.h c;
        public final dg4 e;
        public xa0 f;
        public final /* synthetic */ eg4 g;

        public h(eg4 eg4Var, androidx.lifecycle.h lifecycle, dg4 onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.g = eg4Var;
            this.c = lifecycle;
            this.e = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // com.zepto.xa0
        public void cancel() {
            this.c.d(this);
            this.e.i(this);
            xa0 xa0Var = this.f;
            if (xa0Var != null) {
                xa0Var.cancel();
            }
            this.f = null;
        }

        @Override // androidx.lifecycle.k
        public void e(df3 source, h.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == h.a.ON_START) {
                this.f = this.g.i(this.e);
                return;
            }
            if (event != h.a.ON_STOP) {
                if (event == h.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                xa0 xa0Var = this.f;
                if (xa0Var != null) {
                    xa0Var.cancel();
                }
            }
        }
    }

    public final class i implements xa0 {
        public final dg4 c;
        public final /* synthetic */ eg4 e;

        public i(eg4 eg4Var, dg4 onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.e = eg4Var;
            this.c = onBackPressedCallback;
        }

        @Override // com.zepto.xa0
        public void cancel() {
            this.e.c.remove(this.c);
            if (Intrinsics.areEqual(this.e.d, this.c)) {
                this.c.c();
                this.e.d = null;
            }
            this.c.i(this);
            Function0 function0B = this.c.b();
            if (function0B != null) {
                function0B.invoke();
            }
            this.c.k(null);
        }
    }

    public /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
        public j(Object obj) {
            super(0, obj, eg4.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void a() {
            ((eg4) this.receiver).p();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class k extends FunctionReferenceImpl implements Function0 {
        public k(Object obj) {
            super(0, obj, eg4.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void a() {
            ((eg4) this.receiver).p();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public eg4(Runnable runnable, ux0 ux0Var) {
        this.a = runnable;
        this.b = ux0Var;
        this.c = new ArrayDeque();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.e = i2 >= 34 ? g.a.a(new a(), new b(), new c(), new d()) : f.a.b(new e());
        }
    }

    public final void h(df3 owner, dg4 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.h hVarG0 = owner.g0();
        if (hVarG0.b() == h.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new h(this, hVarG0, onBackPressedCallback));
        p();
        onBackPressedCallback.k(new j(this));
    }

    public final xa0 i(dg4 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.a(iVar);
        p();
        onBackPressedCallback.k(new k(this));
        return iVar;
    }

    public final void j() {
        Object objPrevious;
        ArrayDeque arrayDeque = this.c;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((dg4) objPrevious).g()) {
                    break;
                }
            }
        }
        dg4 dg4Var = (dg4) objPrevious;
        this.d = null;
        if (dg4Var != null) {
            dg4Var.c();
        }
    }

    public final void k() {
        Object objPrevious;
        ArrayDeque arrayDeque = this.c;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((dg4) objPrevious).g()) {
                    break;
                }
            }
        }
        dg4 dg4Var = (dg4) objPrevious;
        this.d = null;
        if (dg4Var != null) {
            dg4Var.d();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void l(n30 n30Var) {
        Object objPrevious;
        ArrayDeque arrayDeque = this.c;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((dg4) objPrevious).g()) {
                    break;
                }
            }
        }
        dg4 dg4Var = (dg4) objPrevious;
        if (dg4Var != null) {
            dg4Var.e(n30Var);
        }
    }

    public final void m(n30 n30Var) {
        Object objPrevious;
        ArrayDeque arrayDeque = this.c;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((dg4) objPrevious).g()) {
                    break;
                }
            }
        }
        dg4 dg4Var = (dg4) objPrevious;
        this.d = dg4Var;
        if (dg4Var != null) {
            dg4Var.f(n30Var);
        }
    }

    public final void n(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f = invoker;
        o(this.h);
    }

    public final void o(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.g) {
            f.a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.g = true;
        } else {
            if (z || !this.g) {
                return;
            }
            f.a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.g = false;
        }
    }

    public final void p() {
        boolean z = this.h;
        ArrayDeque arrayDeque = this.c;
        boolean z2 = false;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((dg4) it.next()).g()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.h = z2;
        if (z2 != z) {
            ux0 ux0Var = this.b;
            if (ux0Var != null) {
                ux0Var.a(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z2);
            }
        }
    }

    public eg4(Runnable runnable) {
        this(runnable, null);
    }
}
