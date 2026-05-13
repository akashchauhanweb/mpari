package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.lifecycle.h;
import com.zepto.g34;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
@g34.b("dialog")
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b*\u0001)\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b/\u00100J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J*\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J \u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-¨\u00064"}, d2 = {"Lcom/zepto/uj1;", "Lcom/zepto/g34;", "Lcom/zepto/uj1$b;", "Lcom/zepto/a24;", "popUpTo", "", "savedState", "", "j", "o", "", "entries", "Lcom/zepto/r24;", "navOptions", "Lcom/zepto/g34$a;", "navigatorExtras", "e", "backStackEntry", "g", "Lcom/zepto/i34;", "state", "f", "", "popUpToIndex", "s", "entry", "q", "Lcom/zepto/sj1;", "p", "Landroid/content/Context;", "c", "Landroid/content/Context;", "context", "Lcom/zepto/mg2;", "d", "Lcom/zepto/mg2;", "fragmentManager", "", "", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "com/zepto/uj1$c", "Lcom/zepto/uj1$c;", "observer", "", "Ljava/util/Map;", "transitioningFragments", "<init>", "(Landroid/content/Context;Lcom/zepto/mg2;)V", "h", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
public final class uj1 extends g34 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final mg2 fragmentManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Set restoredTagsAwaitingAttach;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final c observer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Map transitioningFragments;

    public static class b extends j24 implements md2 {
        public String o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g34 fragmentNavigator) {
            super(fragmentNavigator);
            Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        }

        @Override // com.zepto.j24
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            return super.equals(obj) && Intrinsics.areEqual(this.o, ((b) obj).o);
        }

        @Override // com.zepto.j24
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.o;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.zepto.j24
        public void i0(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.i0(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, b25.a);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = typedArrayObtainAttributes.getString(b25.b);
            if (string != null) {
                p0(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String o0() {
            String str = this.o;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        public final b p0(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.o = className;
            return this;
        }
    }

    public static final class c implements androidx.lifecycle.k {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[h.a.values().length];
                try {
                    iArr[h.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[h.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.k
        public void e(df3 source, h.a event) {
            int iNextIndex;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            int i = a.a[event.ordinal()];
            if (i == 1) {
                sj1 sj1Var = (sj1) source;
                Iterable iterable = (Iterable) uj1.this.b().b().getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((a24) it.next()).f(), sj1Var.d0())) {
                            return;
                        }
                    }
                }
                sj1Var.Y1();
                return;
            }
            Object obj = null;
            if (i == 2) {
                sj1 sj1Var2 = (sj1) source;
                for (Object obj2 : (Iterable) uj1.this.b().c().getValue()) {
                    if (Intrinsics.areEqual(((a24) obj2).f(), sj1Var2.d0())) {
                        obj = obj2;
                    }
                }
                a24 a24Var = (a24) obj;
                if (a24Var != null) {
                    uj1.this.b().e(a24Var);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                sj1 sj1Var3 = (sj1) source;
                for (Object obj3 : (Iterable) uj1.this.b().c().getValue()) {
                    if (Intrinsics.areEqual(((a24) obj3).f(), sj1Var3.d0())) {
                        obj = obj3;
                    }
                }
                a24 a24Var2 = (a24) obj;
                if (a24Var2 != null) {
                    uj1.this.b().e(a24Var2);
                }
                sj1Var3.g0().d(this);
                return;
            }
            sj1 sj1Var4 = (sj1) source;
            if (sj1Var4.h2().isShowing()) {
                return;
            }
            List list = (List) uj1.this.b().b().getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (Intrinsics.areEqual(((a24) listIterator.previous()).f(), sj1Var4.d0())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            a24 a24Var3 = (a24) CollectionsKt___CollectionsKt.getOrNull(list, iNextIndex);
            if (!Intrinsics.areEqual(CollectionsKt___CollectionsKt.lastOrNull(list), a24Var3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + sj1Var4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (a24Var3 != null) {
                uj1.this.s(iNextIndex, a24Var3, false);
            }
        }
    }

    public uj1(Context context, mg2 fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new c();
        this.transitioningFragments = new LinkedHashMap();
    }

    public static final void r(uj1 this$0, mg2 mg2Var, sf2 childFragment) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mg2Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
        Set set = this$0.restoredTagsAwaitingAttach;
        if (TypeIntrinsics.asMutableCollection(set).remove(childFragment.d0())) {
            childFragment.g0().a(this$0.observer);
        }
        Map map = this$0.transitioningFragments;
        TypeIntrinsics.asMutableMap(map).remove(childFragment.d0());
    }

    @Override // com.zepto.g34
    public void e(List entries, r24 navOptions, g34.a navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.fragmentManager.Q0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            q((a24) it.next());
        }
    }

    @Override // com.zepto.g34
    public void f(i34 state) {
        androidx.lifecycle.h hVarG0;
        Intrinsics.checkNotNullParameter(state, "state");
        super.f(state);
        for (a24 a24Var : (List) state.b().getValue()) {
            sj1 sj1Var = (sj1) this.fragmentManager.h0(a24Var.f());
            if (sj1Var == null || (hVarG0 = sj1Var.g0()) == null) {
                this.restoredTagsAwaitingAttach.add(a24Var.f());
            } else {
                hVarG0.a(this.observer);
            }
        }
        this.fragmentManager.i(new tg2() { // from class: com.zepto.tj1
            @Override // com.zepto.tg2
            public final void a(mg2 mg2Var, sf2 sf2Var) {
                uj1.r(this.a, mg2Var, sf2Var);
            }
        });
    }

    @Override // com.zepto.g34
    public void g(a24 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (this.fragmentManager.Q0()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        sj1 sj1Var = (sj1) this.transitioningFragments.get(backStackEntry.f());
        if (sj1Var == null) {
            sf2 sf2VarH0 = this.fragmentManager.h0(backStackEntry.f());
            sj1Var = sf2VarH0 instanceof sj1 ? (sj1) sf2VarH0 : null;
        }
        if (sj1Var != null) {
            sj1Var.g0().d(this.observer);
            sj1Var.Y1();
        }
        p(backStackEntry).k2(this.fragmentManager, backStackEntry.f());
        b().g(backStackEntry);
    }

    @Override // com.zepto.g34
    public void j(a24 popUpTo, boolean savedState) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        if (this.fragmentManager.Q0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().b().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        Iterator it = CollectionsKt___CollectionsKt.reversed(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            sf2 sf2VarH0 = this.fragmentManager.h0(((a24) it.next()).f());
            if (sf2VarH0 != null) {
                ((sj1) sf2VarH0).Y1();
            }
        }
        s(iIndexOf, popUpTo, savedState);
    }

    @Override // com.zepto.g34
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    public final sj1 p(a24 entry) {
        j24 j24VarE = entry.e();
        Intrinsics.checkNotNull(j24VarE, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) j24VarE;
        String strO0 = bVar.o0();
        if (strO0.charAt(0) == '.') {
            strO0 = this.context.getPackageName() + strO0;
        }
        sf2 sf2VarA = this.fragmentManager.t0().a(this.context.getClassLoader(), strO0);
        Intrinsics.checkNotNullExpressionValue(sf2VarA, "fragmentManager.fragment…ader, className\n        )");
        if (sj1.class.isAssignableFrom(sf2VarA.getClass())) {
            sj1 sj1Var = (sj1) sf2VarA;
            sj1Var.L1(entry.c());
            sj1Var.g0().a(this.observer);
            this.transitioningFragments.put(entry.f(), sj1Var);
            return sj1Var;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.o0() + " is not an instance of DialogFragment").toString());
    }

    public final void q(a24 entry) {
        p(entry).k2(this.fragmentManager, entry.f());
        a24 a24Var = (a24) CollectionsKt___CollectionsKt.lastOrNull((List) b().b().getValue());
        boolean zContains = CollectionsKt___CollectionsKt.contains((Iterable) b().c().getValue(), a24Var);
        b().l(entry);
        if (a24Var == null || zContains) {
            return;
        }
        b().e(a24Var);
    }

    public final void s(int popUpToIndex, a24 popUpTo, boolean savedState) {
        a24 a24Var = (a24) CollectionsKt___CollectionsKt.getOrNull((List) b().b().getValue(), popUpToIndex - 1);
        boolean zContains = CollectionsKt___CollectionsKt.contains((Iterable) b().c().getValue(), a24Var);
        b().i(popUpTo, savedState);
        if (a24Var == null || zContains) {
            return;
        }
        b().e(a24Var);
    }
}
