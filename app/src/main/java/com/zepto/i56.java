package com.zepto;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.zepto.db0;
import com.zepto.i56;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class i56 {
    public static final a f = new a(null);
    public final ViewGroup a;
    public final List b;
    public final List c;
    public boolean d;
    public boolean e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i56 a(ViewGroup container, mg2 fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            k56 k56VarB0 = fragmentManager.B0();
            Intrinsics.checkNotNullExpressionValue(k56VarB0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, k56VarB0);
        }

        public final i56 b(ViewGroup container, k56 factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            int i = h05.b;
            Object tag = container.getTag(i);
            if (tag instanceof i56) {
                return (i56) tag;
            }
            i56 i56VarA = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(i56VarA, "factory.createController(container)");
            container.setTag(i, i56VarA);
            return i56VarA;
        }
    }

    public static final class b extends c {
        public final yg2 h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(c.b finalState, c.a lifecycleImpact, yg2 fragmentStateManager, db0 cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            sf2 sf2VarK = fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(sf2VarK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, sf2VarK, cancellationSignal);
            this.h = fragmentStateManager;
        }

        @Override // com.zepto.i56.c
        public void e() {
            super.e();
            this.h.m();
        }

        @Override // com.zepto.i56.c
        public void n() {
            if (i() != c.a.ADDING) {
                if (i() == c.a.REMOVING) {
                    sf2 sf2VarK = this.h.k();
                    Intrinsics.checkNotNullExpressionValue(sf2VarK, "fragmentStateManager.fragment");
                    View viewG1 = sf2VarK.G1();
                    Intrinsics.checkNotNullExpressionValue(viewG1, "fragment.requireView()");
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewG1.findFocus() + " on view " + viewG1 + " for Fragment " + sf2VarK);
                    }
                    viewG1.clearFocus();
                    return;
                }
                return;
            }
            sf2 sf2VarK2 = this.h.k();
            Intrinsics.checkNotNullExpressionValue(sf2VarK2, "fragmentStateManager.fragment");
            View viewFindFocus = sf2VarK2.I.findFocus();
            if (viewFindFocus != null) {
                sf2VarK2.M1(viewFindFocus);
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + sf2VarK2);
                }
            }
            View viewG12 = h().G1();
            Intrinsics.checkNotNullExpressionValue(viewG12, "this.fragment.requireView()");
            if (viewG12.getParent() == null) {
                this.h.b();
                viewG12.setAlpha(0.0f);
            }
            if (viewG12.getAlpha() == 0.0f && viewG12.getVisibility() == 0) {
                viewG12.setVisibility(4);
            }
            viewG12.setAlpha(sf2VarK2.T());
        }
    }

    public static class c {
        public b a;
        public a b;
        public final sf2 c;
        public final List d;
        public final Set e;
        public boolean f;
        public boolean g;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a c = new a(null);

            public static final class a {
                public a() {
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i) {
                    if (i == 0) {
                        return b.VISIBLE;
                    }
                    if (i == 4) {
                        return b.INVISIBLE;
                    }
                    if (i == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }
            }

            /* JADX INFO: renamed from: com.zepto.i56$c$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0091b {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            public static final b c(int i2) {
                return c.b(i2);
            }

            public final void b(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                int i2 = C0091b.a[ordinal()];
                if (i2 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (mg2.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i2 == 3) {
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i2 != 4) {
                    return;
                }
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: com.zepto.i56$c$c, reason: collision with other inner class name */
        public /* synthetic */ class C0092c {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public c(b finalState, a lifecycleImpact, sf2 fragment, db0 cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.a = finalState;
            this.b = lifecycleImpact;
            this.c = fragment;
            this.d = new ArrayList();
            this.e = new LinkedHashSet();
            cancellationSignal.c(new db0.b() { // from class: com.zepto.j56
                @Override // com.zepto.db0.b
                public final void a() {
                    i56.c.b(this.a);
                }
            });
        }

        public static final void b(c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.d();
        }

        public final void c(Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.d.add(listener);
        }

        public final void d() {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                e();
                return;
            }
            Iterator it = CollectionsKt___CollectionsKt.toMutableSet(this.e).iterator();
            while (it.hasNext()) {
                ((db0) it.next()).a();
            }
        }

        public void e() {
            if (this.g) {
                return;
            }
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(db0 signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (this.e.remove(signal) && this.e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.a;
        }

        public final sf2 h() {
            return this.c;
        }

        public final a i() {
            return this.b;
        }

        public final boolean j() {
            return this.f;
        }

        public final boolean k() {
            return this.g;
        }

        public final void l(db0 signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            n();
            this.e.add(signal);
        }

        public final void m(b finalState, a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i = C0092c.a[lifecycleImpact.ordinal()];
            if (i == 1) {
                if (this.a == b.REMOVED) {
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                    }
                    this.a = b.VISIBLE;
                    this.b = a.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                }
                this.a = b.REMOVED;
                this.b = a.REMOVING;
                return;
            }
            if (i == 3 && this.a != b.REMOVED) {
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + finalState + '.');
                }
                this.a = finalState;
            }
        }

        public abstract void n();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + '}';
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public i56(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.a = container;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final void d(i56 this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.b.contains(operation)) {
            c.b bVarG = operation.g();
            View view = operation.h().I;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            bVarG.b(view);
        }
    }

    public static final void e(i56 this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.b.remove(operation);
        this$0.c.remove(operation);
    }

    public static final i56 r(ViewGroup viewGroup, mg2 mg2Var) {
        return f.a(viewGroup, mg2Var);
    }

    public static final i56 s(ViewGroup viewGroup, k56 k56Var) {
        return f.b(viewGroup, k56Var);
    }

    public final void c(c.b bVar, c.a aVar, yg2 yg2Var) {
        synchronized (this.b) {
            db0 db0Var = new db0();
            sf2 sf2VarK = yg2Var.k();
            Intrinsics.checkNotNullExpressionValue(sf2VarK, "fragmentStateManager.fragment");
            c cVarL = l(sf2VarK);
            if (cVarL != null) {
                cVarL.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, yg2Var, db0Var);
            this.b.add(bVar2);
            bVar2.c(new Runnable() { // from class: com.zepto.g56
                @Override // java.lang.Runnable
                public final void run() {
                    i56.d(this.c, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: com.zepto.h56
                @Override // java.lang.Runnable
                public final void run() {
                    i56.e(this.c, bVar2);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void f(c.b finalState, yg2 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        c(finalState, c.a.ADDING, fragmentStateManager);
    }

    public final void g(yg2 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    public final void h(yg2 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    public final void i(yg2 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    public abstract void j(List list, boolean z);

    public final void k() {
        if (this.e) {
            return;
        }
        if (!dq7.T(this.a)) {
            n();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    List<c> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.c);
                    this.c.clear();
                    for (c cVar : mutableList) {
                        if (mg2.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                        }
                        cVar.d();
                        if (!cVar.k()) {
                            this.c.add(cVar);
                        }
                    }
                    u();
                    List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) this.b);
                    this.b.clear();
                    this.c.addAll(mutableList2);
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = mutableList2.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).n();
                    }
                    j(mutableList2, this.d);
                    this.d = false;
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c l(sf2 sf2Var) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c cVar = (c) next;
            if (Intrinsics.areEqual(cVar.h(), sf2Var) && !cVar.j()) {
                break;
            }
        }
        return (c) next;
    }

    public final c m(sf2 sf2Var) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c cVar = (c) next;
            if (Intrinsics.areEqual(cVar.h(), sf2Var) && !cVar.j()) {
                break;
            }
        }
        return (c) next;
    }

    public final void n() {
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zT = dq7.T(this.a);
        synchronized (this.b) {
            try {
                u();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).n();
                }
                for (c cVar : CollectionsKt___CollectionsKt.toMutableList((Collection) this.c)) {
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zT ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + cVar);
                    }
                    cVar.d();
                }
                for (c cVar2 : CollectionsKt___CollectionsKt.toMutableList((Collection) this.b)) {
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zT ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.d();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.e) {
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            k();
        }
    }

    public final c.a p(yg2 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        sf2 sf2VarK = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(sf2VarK, "fragmentStateManager.fragment");
        c cVarL = l(sf2VarK);
        c.a aVarI = cVarL != null ? cVarL.i() : null;
        c cVarM = m(sf2VarK);
        c.a aVarI2 = cVarM != null ? cVarM.i() : null;
        int i = aVarI == null ? -1 : d.a[aVarI.ordinal()];
        return (i == -1 || i == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup q() {
        return this.a;
    }

    public final void t() {
        Object objPrevious;
        synchronized (this.b) {
            try {
                u();
                List list = this.b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c cVar = (c) objPrevious;
                    c.b.a aVar = c.b.c;
                    View view = cVar.h().I;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    c.b bVarA = aVar.a(view);
                    c.b bVarG = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) objPrevious;
                sf2 sf2VarH = cVar2 != null ? cVar2.h() : null;
                this.e = sf2VarH != null ? sf2VarH.r0() : false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        for (c cVar : this.b) {
            if (cVar.i() == c.a.ADDING) {
                View viewG1 = cVar.h().G1();
                Intrinsics.checkNotNullExpressionValue(viewG1, "fragment.requireView()");
                cVar.m(c.b.c.b(viewG1.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void v(boolean z) {
        this.d = z;
    }
}
