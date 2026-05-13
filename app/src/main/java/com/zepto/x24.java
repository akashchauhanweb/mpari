package com.zepto;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public final class x24 {
    public static final x24 a = new x24();

    public static final class a extends Lambda implements Function1 {
        public static final a c = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b c = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d24 invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return x24.a.e(it);
        }
    }

    public static final d24 b(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewT = l8.t(activity, i);
        Intrinsics.checkNotNullExpressionValue(viewT, "requireViewById<View>(activity, viewId)");
        d24 d24VarD = a.d(viewT);
        if (d24VarD != null) {
            return d24VarD;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    public static final d24 c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d24 d24VarD = a.d(view);
        if (d24VarD != null) {
            return d24VarD;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final void f(View view, d24 d24Var) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(tz4.a, d24Var);
    }

    public final d24 d(View view) {
        return (d24) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view, (Function1<? super View, ? extends View>) ((Function1<? super Object, ? extends Object>) a.c)), b.c));
    }

    public final d24 e(View view) {
        Object tag = view.getTag(tz4.a);
        if (tag instanceof WeakReference) {
            return (d24) ((WeakReference) tag).get();
        }
        if (tag instanceof d24) {
            return (d24) tag;
        }
        return null;
    }
}
