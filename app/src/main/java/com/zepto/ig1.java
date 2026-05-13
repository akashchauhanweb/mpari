package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.zepto.db0;
import com.zepto.i56;
import com.zepto.ig1;
import com.zepto.zf2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ig1 extends i56 {

    public static final class a extends b {
        public final boolean c;
        public boolean d;
        public zf2.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i56.c operation, db0 signal, boolean z) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.c = z;
        }

        public final zf2.a e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.d) {
                return this.e;
            }
            zf2.a aVarB = zf2.b(context, b().h(), b().g() == i56.c.b.VISIBLE, this.c);
            this.e = aVarB;
            this.d = true;
            return aVarB;
        }
    }

    public static class b {
        public final i56.c a;
        public final db0 b;

        public b(i56.c operation, db0 signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.a = operation;
            this.b = signal;
        }

        public final void a() {
            this.a.f(this.b);
        }

        public final i56.c b() {
            return this.a;
        }

        public final db0 c() {
            return this.b;
        }

        public final boolean d() {
            i56.c.b bVar;
            i56.c.b.a aVar = i56.c.b.c;
            View view = this.a.h().I;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            i56.c.b bVarA = aVar.a(view);
            i56.c.b bVarG = this.a.g();
            return bVarA == bVarG || !(bVarA == (bVar = i56.c.b.VISIBLE) || bVarG == bVar);
        }
    }

    public static final class c extends b {
        public final Object c;
        public final boolean d;
        public final Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i56.c operation, db0 signal, boolean z, boolean z2) {
            Object objW;
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            i56.c.b bVarG = operation.g();
            i56.c.b bVar = i56.c.b.VISIBLE;
            if (bVarG == bVar) {
                sf2 sf2VarH = operation.h();
                objW = z ? sf2VarH.U() : sf2VarH.x();
            } else {
                sf2 sf2VarH2 = operation.h();
                objW = z ? sf2VarH2.W() : sf2VarH2.C();
            }
            this.c = objW;
            this.d = operation.g() == bVar ? z ? operation.h().r() : operation.h().q() : true;
            this.e = z2 ? z ? operation.h().Y() : operation.h().X() : null;
        }

        public final gh2 e() {
            gh2 gh2VarF = f(this.c);
            gh2 gh2VarF2 = f(this.e);
            if (gh2VarF == null || gh2VarF2 == null || gh2VarF == gh2VarF2) {
                return gh2VarF == null ? gh2VarF2 : gh2VarF;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e).toString());
        }

        public final gh2 f(Object obj) {
            if (obj == null) {
                return null;
            }
            gh2 gh2Var = eh2.b;
            if (gh2Var != null && gh2Var.e(obj)) {
                return gh2Var;
            }
            gh2 gh2Var2 = eh2.c;
            if (gh2Var2 != null && gh2Var2.e(obj)) {
                return gh2Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object g() {
            return this.e;
        }

        public final Object h() {
            return this.c;
        }

        public final boolean i() {
            return this.e != null;
        }

        public final boolean j() {
            return this.d;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public final /* synthetic */ Collection c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Collection collection) {
            super(1);
            this.c = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(CollectionsKt___CollectionsKt.contains(this.c, dq7.K((View) entry.getValue())));
        }
    }

    public static final class e extends AnimatorListenerAdapter {
        public final /* synthetic */ View b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ i56.c d;
        public final /* synthetic */ a e;

        public e(View view, boolean z, i56.c cVar, a aVar) {
            this.b = view;
            this.c = z;
            this.d = cVar;
            this.e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            ig1.this.q().endViewTransition(this.b);
            if (this.c) {
                i56.c.b bVarG = this.d.g();
                View viewToAnimate = this.b;
                Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                bVarG.b(viewToAnimate);
            }
            this.e.a();
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
            }
        }
    }

    public static final class f implements Animation.AnimationListener {
        public final /* synthetic */ i56.c a;
        public final /* synthetic */ ig1 b;
        public final /* synthetic */ View c;
        public final /* synthetic */ a d;

        public f(i56.c cVar, ig1 ig1Var, View view, a aVar) {
            this.a = cVar;
            this.b = ig1Var;
            this.c = view;
            this.d = aVar;
        }

        public static final void b(ig1 this$0, View view, a animationInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
            this$0.q().endViewTransition(view);
            animationInfo.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ViewGroup viewGroupQ = this.b.q();
            final ig1 ig1Var = this.b;
            final View view = this.c;
            final a aVar = this.d;
            viewGroupQ.post(new Runnable() { // from class: com.zepto.jg1
                @Override // java.lang.Runnable
                public final void run() {
                    ig1.f.b(ig1Var, view, aVar);
                }
            });
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig1(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public static final void F(List awaitingContainerChanges, i56.c operation, ig1 this$0) {
        Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.D(operation);
        }
    }

    public static final void J(Animator animator, i56.c operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    public static final void K(View view, ig1 this$0, a animationInfo, i56.c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.q().endViewTransition(view);
        animationInfo.a();
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    public static final void M(gh2 impl, View view, Rect lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.h(view, lastInEpicenterRect);
    }

    public static final void N(ArrayList transitioningViews) {
        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
        eh2.d(transitioningViews, 4);
    }

    public static final void O(c transitionInfo, i56.c operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.a();
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
        }
    }

    public static final void P(i56.c cVar, i56.c cVar2, boolean z, nx lastInViews) {
        Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
        eh2.a(cVar.h(), cVar2.h(), z, lastInViews, false);
    }

    public final void D(i56.c cVar) {
        View view = cVar.h().I;
        i56.c.b bVarG = cVar.g();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        bVarG.b(view);
    }

    public final void E(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (tq7.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                E(arrayList, child);
            }
        }
    }

    public final void G(Map map, View view) {
        String strK = dq7.K(view);
        if (strK != null) {
            map.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    G(map, child);
                }
            }
        }
    }

    public final void H(nx nxVar, Collection collection) {
        Set entries = nxVar.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt__MutableCollectionsKt.retainAll(entries, new d(collection));
    }

    public final void I(List list, List list2, boolean z, Map map) {
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.d()) {
                aVar.a();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                zf2.a aVarE = aVar.e(context);
                if (aVarE == null) {
                    aVar.a();
                } else {
                    final Animator animator = aVarE.b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final i56.c cVarB = aVar.b();
                        sf2 sf2VarH = cVarB.h();
                        if (Intrinsics.areEqual(map.get(cVarB), Boolean.TRUE)) {
                            if (mg2.J0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + sf2VarH + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            boolean z3 = cVarB.g() == i56.c.b.GONE;
                            if (z3) {
                                list2.remove(cVarB);
                            }
                            View view = sf2VarH.I;
                            q().startViewTransition(view);
                            animator.addListener(new e(view, z3, cVarB, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (mg2.J0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + cVarB + " has started.");
                            }
                            aVar.c().c(new db0.b() { // from class: com.zepto.gg1
                                @Override // com.zepto.db0.b
                                public final void a() {
                                    ig1.J(animator, cVarB);
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final i56.c cVarB2 = aVar2.b();
            sf2 sf2VarH2 = cVarB2.h();
            if (z) {
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + sf2VarH2 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z2) {
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + sf2VarH2 + " as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                final View view2 = sf2VarH2.I;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                zf2.a aVarE2 = aVar2.e(context);
                if (aVarE2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation = aVarE2.a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (cVarB2.g() != i56.c.b.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.a();
                } else {
                    q().startViewTransition(view2);
                    zf2.b bVar = new zf2.b(animation, q(), view2);
                    bVar.setAnimationListener(new f(cVarB2, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + cVarB2 + " has started.");
                    }
                }
                aVar2.c().c(new db0.b() { // from class: com.zepto.hg1
                    @Override // com.zepto.db0.b
                    public final void a() {
                        ig1.K(view2, this, aVar2, cVarB2);
                    }
                });
            }
        }
    }

    public final Map L(List list, List list2, final boolean z, final i56.c cVar, final i56.c cVar2) {
        String str;
        String str2;
        View view;
        Object obj;
        String str3;
        boolean z2;
        Object obj2;
        Object obj3;
        View view2;
        final ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Object obj4;
        i56.c cVar3;
        View view3;
        Rect rect;
        Pair pair;
        View view4;
        final View view5;
        ig1 ig1Var = this;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : list) {
            if (!((c) obj5).d()) {
                arrayList2.add(obj5);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList();
        for (Object obj6 : arrayList2) {
            if (((c) obj6).e() != null) {
                arrayList3.add(obj6);
            }
        }
        final gh2 gh2Var = null;
        for (c cVar4 : arrayList3) {
            gh2 gh2VarE = cVar4.e();
            if (gh2Var != null && gh2VarE != gh2Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar4.b().h() + " returned Transition " + cVar4.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            gh2Var = gh2VarE;
        }
        if (gh2Var == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar5 = (c) it.next();
                linkedHashMap2.put(cVar5.b(), Boolean.FALSE);
                cVar5.a();
            }
            return linkedHashMap2;
        }
        View view6 = new View(q().getContext());
        final Rect rect2 = new Rect();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        nx nxVar = new nx();
        Iterator it2 = list.iterator();
        View view7 = null;
        Object obj7 = null;
        boolean z3 = false;
        while (true) {
            str = "FragmentManager";
            if (!it2.hasNext()) {
                break;
            }
            c cVar6 = (c) it2.next();
            if (!cVar6.i() || cVar == null || cVar2 == null) {
                rect = rect2;
                view6 = view6;
                linkedHashMap2 = linkedHashMap2;
                arrayList4 = arrayList4;
                view7 = view7;
                nxVar = nxVar;
                arrayList5 = arrayList5;
                rect2 = rect;
            } else {
                Object objU = gh2Var.u(gh2Var.f(cVar6.g()));
                ArrayList arrayListZ = cVar2.h().Z();
                Intrinsics.checkNotNullExpressionValue(arrayListZ, "lastIn.fragment.sharedElementSourceNames");
                ArrayList arrayListZ2 = cVar.h().Z();
                View view8 = view7;
                Intrinsics.checkNotNullExpressionValue(arrayListZ2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList arrayListA0 = cVar.h().a0();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                Intrinsics.checkNotNullExpressionValue(arrayListA0, "firstOut.fragment.sharedElementTargetNames");
                int size = arrayListA0.size();
                View view9 = view6;
                int i = 0;
                while (i < size) {
                    int i2 = size;
                    int iIndexOf = arrayListZ.indexOf(arrayListA0.get(i));
                    ArrayList arrayList6 = arrayListA0;
                    if (iIndexOf != -1) {
                        arrayListZ.set(iIndexOf, arrayListZ2.get(i));
                    }
                    i++;
                    size = i2;
                    arrayListA0 = arrayList6;
                }
                ArrayList arrayListA02 = cVar2.h().a0();
                Intrinsics.checkNotNullExpressionValue(arrayListA02, "lastIn.fragment.sharedElementTargetNames");
                if (z) {
                    cVar.h().y();
                    cVar2.h().D();
                    pair = TuplesKt.to(null, null);
                } else {
                    cVar.h().D();
                    cVar2.h().y();
                    pair = TuplesKt.to(null, null);
                }
                wb0.a(pair.component1());
                wb0.a(pair.component2());
                int i3 = 0;
                for (int size2 = arrayListZ.size(); i3 < size2; size2 = size2) {
                    nxVar.put((String) arrayListZ.get(i3), (String) arrayListA02.get(i3));
                    i3++;
                }
                if (mg2.J0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator it3 = arrayListA02.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it4 = arrayListZ.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                    }
                }
                nx nxVar2 = new nx();
                View view10 = cVar.h().I;
                Intrinsics.checkNotNullExpressionValue(view10, "firstOut.fragment.mView");
                ig1Var.G(nxVar2, view10);
                nxVar2.o(arrayListZ);
                nxVar.o(nxVar2.keySet());
                final nx nxVar3 = new nx();
                View view11 = cVar2.h().I;
                Intrinsics.checkNotNullExpressionValue(view11, "lastIn.fragment.mView");
                ig1Var.G(nxVar3, view11);
                nxVar3.o(arrayListA02);
                nxVar3.o(nxVar.values());
                eh2.c(nxVar, nxVar3);
                Set setKeySet = nxVar.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "sharedElementNameMapping.keys");
                ig1Var.H(nxVar2, setKeySet);
                Collection collectionValues = nxVar.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                ig1Var.H(nxVar3, collectionValues);
                if (nxVar.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view7 = view8;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    obj7 = null;
                } else {
                    nx nxVar4 = nxVar;
                    eh2.a(cVar2.h(), cVar.h(), z, nxVar2, true);
                    hh4.a(q(), new Runnable() { // from class: com.zepto.cg1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ig1.P(cVar2, cVar, z, nxVar3);
                        }
                    });
                    arrayList4.addAll(nxVar2.values());
                    if (!arrayListZ.isEmpty()) {
                        view4 = (View) nxVar2.get((String) arrayListZ.get(0));
                        gh2Var.p(objU, view4);
                    } else {
                        view4 = view8;
                    }
                    arrayList5.addAll(nxVar3.values());
                    if ((!arrayListA02.isEmpty()) && (view5 = (View) nxVar3.get((String) arrayListA02.get(0))) != null) {
                        hh4.a(q(), new Runnable() { // from class: com.zepto.dg1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ig1.M(gh2Var, view5, rect2);
                            }
                        });
                        z3 = true;
                    }
                    gh2Var.s(objU, view9, arrayList4);
                    ArrayList arrayList7 = arrayList5;
                    rect = rect2;
                    gh2Var.n(objU, null, null, null, null, objU, arrayList7);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(cVar, bool);
                    linkedHashMap3.put(cVar2, bool);
                    view7 = view4;
                    arrayList4 = arrayList4;
                    obj7 = objU;
                    nxVar = nxVar4;
                    arrayList5 = arrayList7;
                    view6 = view9;
                    linkedHashMap2 = linkedHashMap3;
                    rect2 = rect;
                }
            }
        }
        View view12 = view7;
        nx nxVar5 = nxVar;
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList4;
        Rect rect3 = rect2;
        boolean z4 = true;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view13 = view6;
        ArrayList arrayList10 = new ArrayList();
        Iterator it5 = list.iterator();
        Object objK = null;
        Object objK2 = null;
        while (it5.hasNext()) {
            c cVar7 = (c) it5.next();
            if (cVar7.d()) {
                linkedHashMap4.put(cVar7.b(), Boolean.FALSE);
                cVar7.a();
            } else {
                Object objF = gh2Var.f(cVar7.h());
                i56.c cVarB = cVar7.b();
                boolean z5 = (obj7 == null || !(cVarB == cVar || cVarB == cVar2)) ? false : z4;
                if (objF != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList arrayList11 = new ArrayList();
                    View view14 = cVarB.h().I;
                    Iterator it6 = it5;
                    Intrinsics.checkNotNullExpressionValue(view14, "operation.fragment.mView");
                    ig1Var.E(arrayList11, view14);
                    if (z5) {
                        if (cVarB == cVar) {
                            arrayList11.removeAll(CollectionsKt___CollectionsKt.toSet(arrayList9));
                        } else {
                            arrayList11.removeAll(CollectionsKt___CollectionsKt.toSet(arrayList8));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        gh2Var.a(objF, view13);
                        view2 = view13;
                        obj4 = objF;
                        obj = obj7;
                        str3 = str;
                        obj2 = objK;
                        obj3 = objK2;
                        arrayList = arrayList11;
                        view = view12;
                        linkedHashMap = linkedHashMap5;
                        z2 = true;
                        cVar3 = cVarB;
                    } else {
                        gh2Var.b(objF, arrayList11);
                        view = view12;
                        obj = obj7;
                        str3 = str;
                        z2 = true;
                        obj2 = objK;
                        obj3 = objK2;
                        view2 = view13;
                        arrayList = arrayList11;
                        linkedHashMap = linkedHashMap5;
                        gh2Var.n(objF, objF, arrayList11, null, null, null, null);
                        if (cVarB.g() == i56.c.b.GONE) {
                            cVar3 = cVarB;
                            list2.remove(cVar3);
                            ArrayList arrayList12 = new ArrayList(arrayList);
                            arrayList12.remove(cVar3.h().I);
                            obj4 = objF;
                            gh2Var.m(obj4, cVar3.h().I, arrayList12);
                            hh4.a(q(), new Runnable() { // from class: com.zepto.eg1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ig1.N(arrayList);
                                }
                            });
                        } else {
                            obj4 = objF;
                            cVar3 = cVarB;
                        }
                    }
                    if (cVar3.g() == i56.c.b.VISIBLE) {
                        arrayList10.addAll(arrayList);
                        if (z3) {
                            gh2Var.o(obj4, rect3);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        gh2Var.p(obj4, view3);
                    }
                    linkedHashMap.put(cVar3, Boolean.TRUE);
                    if (cVar7.j()) {
                        objK2 = gh2Var.k(obj3, obj4, null);
                        it5 = it6;
                        linkedHashMap4 = linkedHashMap;
                        view12 = view3;
                        view13 = view2;
                        z4 = z2;
                        obj7 = obj;
                        str = str3;
                        objK = obj2;
                        ig1Var = this;
                    } else {
                        objK = gh2Var.k(obj2, obj4, null);
                        linkedHashMap4 = linkedHashMap;
                        view12 = view3;
                        objK2 = obj3;
                        view13 = view2;
                        z4 = z2;
                        obj7 = obj;
                        str = str3;
                        ig1Var = this;
                        it5 = it6;
                    }
                } else if (!z5) {
                    linkedHashMap4.put(cVarB, Boolean.FALSE);
                    cVar7.a();
                }
            }
        }
        String str4 = str;
        boolean z6 = z4;
        Object obj8 = objK2;
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object obj9 = obj7;
        Object objJ = gh2Var.j(obj8, objK, obj9);
        if (objJ == null) {
            return linkedHashMap6;
        }
        ArrayList<c> arrayList13 = new ArrayList();
        for (Object obj10 : list) {
            if (!((c) obj10).d()) {
                arrayList13.add(obj10);
            }
        }
        for (final c cVar8 : arrayList13) {
            Object objH = cVar8.h();
            final i56.c cVarB2 = cVar8.b();
            boolean z7 = (obj9 == null || !(cVarB2 == cVar || cVarB2 == cVar2)) ? false : z6;
            if (objH == null && !z7) {
                str2 = str4;
            } else if (dq7.U(q())) {
                str2 = str4;
                gh2Var.q(cVar8.b().h(), objJ, cVar8.c(), new Runnable() { // from class: com.zepto.fg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ig1.O(cVar8, cVarB2);
                    }
                });
            } else {
                if (mg2.J0(2)) {
                    str2 = str4;
                    Log.v(str2, "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + cVarB2);
                } else {
                    str2 = str4;
                }
                cVar8.a();
            }
            str4 = str2;
        }
        String str5 = str4;
        if (!dq7.U(q())) {
            return linkedHashMap6;
        }
        eh2.d(arrayList10, 4);
        ArrayList arrayListL = gh2Var.l(arrayList8);
        if (mg2.J0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object sharedElementFirstOutViews : arrayList9) {
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view15 = (View) sharedElementFirstOutViews;
                Log.v(str5, "View: " + view15 + " Name: " + dq7.K(view15));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            for (Object sharedElementLastInViews : arrayList8) {
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view16 = (View) sharedElementLastInViews;
                Log.v(str5, "View: " + view16 + " Name: " + dq7.K(view16));
            }
        }
        gh2Var.c(q(), objJ);
        gh2Var.r(q(), arrayList9, arrayList8, arrayListL, nxVar5);
        eh2.d(arrayList10, 0);
        gh2Var.t(obj9, arrayList9, arrayList8);
        return linkedHashMap6;
    }

    public final void Q(List list) {
        sf2 sf2VarH = ((i56.c) CollectionsKt___CollectionsKt.last(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i56.c cVar = (i56.c) it.next();
            cVar.h().L.c = sf2VarH.L.c;
            cVar.h().L.d = sf2VarH.L.d;
            cVar.h().L.e = sf2VarH.L.e;
            cVar.h().L.f = sf2VarH.L.f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    @Override // com.zepto.i56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(java.util.List r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ig1.j(java.util.List, boolean):void");
    }
}
