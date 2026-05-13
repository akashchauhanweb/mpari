package com.zepto;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class dx0 {
    public final uc6 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public dx0(Context context, uc6 taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public static final void b(List listenersList, dx0 this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = listenersList.iterator();
        while (it.hasNext()) {
            ((bx0) it.next()).a(this$0.e);
        }
    }

    public final void c(bx0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.c) {
            try {
                if (this.d.add(listener)) {
                    if (this.d.size() == 1) {
                        this.e = e();
                        rn3.e().a(ex0.a, getClass().getSimpleName() + ": initial state = " + this.e);
                        h();
                    }
                    listener.a(this.e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context d() {
        return this.b;
    }

    public abstract Object e();

    public final void f(bx0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.c) {
            try {
                if (this.d.remove(listener) && this.d.isEmpty()) {
                    i();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !Intrinsics.areEqual(obj2, obj)) {
                this.e = obj;
                final List list = CollectionsKt___CollectionsKt.toList(this.d);
                this.a.a().execute(new Runnable() { // from class: com.zepto.cx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        dx0.b(list, this);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
