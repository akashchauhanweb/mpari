package com.zepto;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class dg4 {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public Function0 c;

    public dg4(boolean z) {
        this.a = z;
    }

    public final void a(xa0 cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.b.add(cancellable);
    }

    public final Function0 b() {
        return this.c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(n30 backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void f(n30 backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.a;
    }

    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((xa0) it.next()).cancel();
        }
    }

    public final void i(xa0 cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.b.remove(cancellable);
    }

    public final void j(boolean z) {
        this.a = z;
        Function0 function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void k(Function0 function0) {
        this.c = function0;
    }
}
