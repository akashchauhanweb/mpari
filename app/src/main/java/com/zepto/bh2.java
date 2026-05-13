package com.zepto;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bh2 {
    public static final bh2 a = new bh2();
    public static c b = c.d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    public static final class c {
        public static final a c = new a(null);
        public static final c d = new c(SetsKt__SetsKt.emptySet(), null, MapsKt__MapsKt.emptyMap());
        public final Set a;
        public final Map b;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public c(Set flags, b bVar, Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.b = linkedHashMap;
        }

        public final Set a() {
            return this.a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.b;
        }
    }

    public static final void d(String str, qs7 violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    public static final void f(sf2 fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        wg2 wg2Var = new wg2(fragment, previousFragmentId);
        bh2 bh2Var = a;
        bh2Var.e(wg2Var);
        c cVarB = bh2Var.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_REUSE) && bh2Var.l(cVarB, fragment.getClass(), wg2Var.getClass())) {
            bh2Var.c(cVarB, wg2Var);
        }
    }

    public static final void g(sf2 fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        ch2 ch2Var = new ch2(fragment, viewGroup);
        bh2 bh2Var = a;
        bh2Var.e(ch2Var);
        c cVarB = bh2Var.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && bh2Var.l(cVarB, fragment.getClass(), ch2Var.getClass())) {
            bh2Var.c(cVarB, ch2Var);
        }
    }

    public static final void h(sf2 fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        lj2 lj2Var = new lj2(fragment);
        bh2 bh2Var = a;
        bh2Var.e(lj2Var);
        c cVarB = bh2Var.b(fragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bh2Var.l(cVarB, fragment.getClass(), lj2Var.getClass())) {
            bh2Var.c(cVarB, lj2Var);
        }
    }

    public static final void i(sf2 fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        pz7 pz7Var = new pz7(fragment, container);
        bh2 bh2Var = a;
        bh2Var.e(pz7Var);
        c cVarB = bh2Var.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bh2Var.l(cVarB, fragment.getClass(), pz7Var.getClass())) {
            bh2Var.c(cVarB, pz7Var);
        }
    }

    public static final void j(sf2 fragment, sf2 expectedParentFragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        qz7 qz7Var = new qz7(fragment, expectedParentFragment, i);
        bh2 bh2Var = a;
        bh2Var.e(qz7Var);
        c cVarB = bh2Var.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && bh2Var.l(cVarB, fragment.getClass(), qz7Var.getClass())) {
            bh2Var.c(cVarB, qz7Var);
        }
    }

    public final c b(sf2 sf2Var) {
        while (sf2Var != null) {
            if (sf2Var.n0()) {
                mg2 mg2VarN = sf2Var.N();
                Intrinsics.checkNotNullExpressionValue(mg2VarN, "declaringFragment.parentFragmentManager");
                if (mg2VarN.C0() != null) {
                    c cVarC0 = mg2VarN.C0();
                    Intrinsics.checkNotNull(cVarC0);
                    return cVarC0;
                }
            }
            sf2Var = sf2Var.M();
        }
        return b;
    }

    public final void c(c cVar, final qs7 qs7Var) {
        sf2 sf2VarA = qs7Var.a();
        final String name = sf2VarA.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, qs7Var);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            k(sf2VarA, new Runnable() { // from class: com.zepto.ah2
                @Override // java.lang.Runnable
                public final void run() {
                    bh2.d(name, qs7Var);
                }
            });
        }
    }

    public final void e(qs7 qs7Var) {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + qs7Var.a().getClass().getName(), qs7Var);
        }
    }

    public final void k(sf2 sf2Var, Runnable runnable) {
        if (!sf2Var.n0()) {
            runnable.run();
            return;
        }
        Handler handlerG = sf2Var.N().w0().g();
        Intrinsics.checkNotNullExpressionValue(handlerG, "fragment.parentFragmentManager.host.handler");
        if (Intrinsics.areEqual(handlerG.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerG.post(runnable);
        }
    }

    public final boolean l(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), qs7.class) || !CollectionsKt___CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
