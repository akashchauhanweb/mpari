package com.zepto;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class g34 {
    public i34 a;
    public boolean b;

    public interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public static final class c extends Lambda implements Function1 {
        public final /* synthetic */ r24 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r24 r24Var, a aVar) {
            super(1);
            this.e = r24Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a24 invoke(a24 backStackEntry) {
            j24 j24VarD;
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            j24 j24VarE = backStackEntry.e();
            if (!(j24VarE instanceof j24)) {
                j24VarE = null;
            }
            if (j24VarE != null && (j24VarD = g34.this.d(j24VarE, backStackEntry.c(), this.e, null)) != null) {
                return Intrinsics.areEqual(j24VarD, j24VarE) ? backStackEntry : g34.this.b().a(j24VarD, j24VarD.u(backStackEntry.c()));
            }
            return null;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public static final d c = new d();

        public d() {
            super(1);
        }

        public final void a(s24 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.d(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s24) obj);
            return Unit.INSTANCE;
        }
    }

    public abstract j24 a();

    public final i34 b() {
        i34 i34Var = this.a;
        if (i34Var != null) {
            return i34Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean c() {
        return this.b;
    }

    public j24 d(j24 destination, Bundle bundle, r24 r24Var, a aVar) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void e(List entries, r24 r24Var, a aVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = SequencesKt___SequencesKt.filterNotNull(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(entries), new c(r24Var, aVar))).iterator();
        while (it.hasNext()) {
            b().k((a24) it.next());
        }
    }

    public void f(i34 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = state;
        this.b = true;
    }

    public void g(a24 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        j24 j24VarE = backStackEntry.e();
        if (!(j24VarE instanceof j24)) {
            j24VarE = null;
        }
        if (j24VarE == null) {
            return;
        }
        d(j24VarE, null, t24.a(d.c), null);
        b().f(backStackEntry);
    }

    public void h(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(a24 popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List list = (List) b().b().getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        a24 a24Var = null;
        while (k()) {
            a24Var = (a24) listIterator.previous();
            if (Intrinsics.areEqual(a24Var, popUpTo)) {
                break;
            }
        }
        if (a24Var != null) {
            b().h(a24Var, z);
        }
    }

    public boolean k() {
        return true;
    }
}
