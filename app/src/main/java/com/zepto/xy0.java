package com.zepto;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xy0 {
    public final Set a = new CopyOnWriteArraySet();
    public volatile Context b;

    public final void a(ng4 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.b;
        if (context != null) {
            listener.a(context);
        }
        this.a.add(listener);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = context;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ng4) it.next()).a(context);
        }
    }
}
