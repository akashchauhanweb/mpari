package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.h;
import com.zepto.a24;
import com.zepto.f24;
import com.zepto.g34;
import com.zepto.j24;
import com.zepto.r24;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class d24 {
    public static final a H = new a(null);
    public static boolean I = true;
    public Function1 A;
    public final Map B;
    public int C;
    public final List D;
    public final Lazy E;
    public final sy3 F;
    public final od2 G;
    public final Context a;
    public Activity b;
    public q24 c;
    public k24 d;
    public Bundle e;
    public Parcelable[] f;
    public boolean g;
    public final ArrayDeque h;
    public final ty3 i;
    public final v66 j;
    public final ty3 k;
    public final v66 l;
    public final Map m;
    public final Map n;
    public final Map o;
    public final Map p;
    public df3 q;
    public f24 r;
    public final CopyOnWriteArrayList s;
    public h.b t;
    public final cf3 u;
    public final dg4 v;
    public boolean w;
    public h34 x;
    public final Map y;
    public Function1 z;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class b extends i34 {
        public final g34 g;
        public final /* synthetic */ d24 h;

        public static final class a extends Lambda implements Function0 {
            public final /* synthetic */ a24 e;
            public final /* synthetic */ boolean f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a24 a24Var, boolean z) {
                super(0);
                this.e = a24Var;
                this.f = z;
            }

            public final void a() {
                b.super.h(this.e, this.f);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public b(d24 d24Var, g34 navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.h = d24Var;
            this.g = navigator;
        }

        @Override // com.zepto.i34
        public a24 a(j24 destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return a24.a.b(a24.o, this.h.B(), destination, bundle, this.h.G(), this.h.r, null, null, 96, null);
        }

        @Override // com.zepto.i34
        public void e(a24 entry) {
            f24 f24Var;
            Intrinsics.checkNotNullParameter(entry, "entry");
            boolean zAreEqual = Intrinsics.areEqual(this.h.B.get(entry), Boolean.TRUE);
            super.e(entry);
            this.h.B.remove(entry);
            if (this.h.h.contains(entry)) {
                if (d()) {
                    return;
                }
                this.h.t0();
                this.h.i.b(CollectionsKt___CollectionsKt.toMutableList((Collection) this.h.h));
                this.h.k.b(this.h.g0());
                return;
            }
            this.h.s0(entry);
            if (entry.g0().b().b(h.b.CREATED)) {
                entry.k(h.b.DESTROYED);
            }
            ArrayDeque arrayDeque = this.h.h;
            if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
                Iterator<E> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((a24) it.next()).f(), entry.f())) {
                        break;
                    }
                }
                if (!zAreEqual && (f24Var = this.h.r) != null) {
                    f24Var.h(entry.f());
                }
            } else if (!zAreEqual) {
                f24Var.h(entry.f());
            }
            this.h.t0();
            this.h.k.b(this.h.g0());
        }

        @Override // com.zepto.i34
        public void h(a24 popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            g34 g34VarD = this.h.x.d(popUpTo.e().T());
            if (!Intrinsics.areEqual(g34VarD, this.g)) {
                Object obj = this.h.y.get(g34VarD);
                Intrinsics.checkNotNull(obj);
                ((b) obj).h(popUpTo, z);
            } else {
                Function1 function1 = this.h.A;
                if (function1 == null) {
                    this.h.Z(popUpTo, new a(popUpTo, z));
                } else {
                    function1.invoke(popUpTo);
                    super.h(popUpTo, z);
                }
            }
        }

        @Override // com.zepto.i34
        public void i(a24 popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.i(popUpTo, z);
            this.h.B.put(popUpTo, Boolean.valueOf(z));
        }

        @Override // com.zepto.i34
        public void j(a24 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.j(entry);
            if (!this.h.h.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.k(h.b.STARTED);
        }

        @Override // com.zepto.i34
        public void k(a24 backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            g34 g34VarD = this.h.x.d(backStackEntry.e().T());
            if (!Intrinsics.areEqual(g34VarD, this.g)) {
                Object obj = this.h.y.get(g34VarD);
                if (obj != null) {
                    ((b) obj).k(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.e().T() + " should already be created").toString());
            }
            Function1 function1 = this.h.z;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                o(backStackEntry);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.e() + " outside of the call to navigate(). ");
        }

        public final void o(a24 backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.k(backStackEntry);
        }
    }

    public interface c {
        void a(d24 d24Var, j24 j24Var, Bundle bundle);
    }

    public static final class d extends Lambda implements Function1 {
        public static final d c = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public static final e c = new e();

        public e() {
            super(1);
        }

        public final void a(s24 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.g(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s24) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public final /* synthetic */ Ref.BooleanRef c;
        public final /* synthetic */ Ref.BooleanRef e;
        public final /* synthetic */ d24 f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ ArrayDeque h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, d24 d24Var, boolean z, ArrayDeque arrayDeque) {
            super(1);
            this.c = booleanRef;
            this.e = booleanRef2;
            this.f = d24Var;
            this.g = z;
            this.h = arrayDeque;
        }

        public final void a(a24 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.c.element = true;
            this.e.element = true;
            this.f.e0(entry, this.g, this.h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a24) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public static final g c = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j24 invoke(j24 destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            k24 k24VarA0 = destination.a0();
            if (k24VarA0 == null || k24VarA0.v0() != destination.P()) {
                return null;
            }
            return destination.a0();
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j24 destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return Boolean.valueOf(!d24.this.o.containsKey(Integer.valueOf(destination.P())));
        }
    }

    public static final class i extends Lambda implements Function1 {
        public static final i c = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j24 invoke(j24 destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            k24 k24VarA0 = destination.a0();
            if (k24VarA0 == null || k24VarA0.v0() != destination.P()) {
                return null;
            }
            return destination.a0();
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j24 destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return Boolean.valueOf(!d24.this.o.containsKey(Integer.valueOf(destination.P())));
        }
    }

    public static final class k extends Lambda implements Function1 {
        public final /* synthetic */ Ref.BooleanRef c;
        public final /* synthetic */ List e;
        public final /* synthetic */ Ref.IntRef f;
        public final /* synthetic */ d24 g;
        public final /* synthetic */ Bundle h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Ref.BooleanRef booleanRef, List list, Ref.IntRef intRef, d24 d24Var, Bundle bundle) {
            super(1);
            this.c = booleanRef;
            this.e = list;
            this.f = intRef;
            this.g = d24Var;
            this.h = bundle;
        }

        public final void a(a24 entry) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.c.element = true;
            int iIndexOf = this.e.indexOf(entry);
            if (iIndexOf != -1) {
                int i = iIndexOf + 1;
                listEmptyList = this.e.subList(this.f.element, i);
                this.f.element = i;
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            this.g.p(entry.e(), this.h, entry, listEmptyList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a24) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1 {
        public final /* synthetic */ j24 c;
        public final /* synthetic */ d24 e;

        public static final class a extends Lambda implements Function1 {
            public static final a c = new a();

            public a() {
                super(1);
            }

            public final void a(op anim) {
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((op) obj);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends Lambda implements Function1 {
            public static final b c = new b();

            public b() {
                super(1);
            }

            public final void a(et4 popUpTo) {
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.c(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((et4) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(j24 j24Var, d24 d24Var) {
            super(1);
            this.c = j24Var;
            this.e = d24Var;
        }

        public final void a(s24 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.a(a.c);
            j24 j24Var = this.c;
            if (j24Var instanceof k24) {
                Sequence<j24> sequenceC = j24.m.c(j24Var);
                d24 d24Var = this.e;
                for (j24 j24Var2 : sequenceC) {
                    j24 j24VarD = d24Var.D();
                    if (Intrinsics.areEqual(j24Var2, j24VarD != null ? j24VarD.a0() : null)) {
                        return;
                    }
                }
                if (d24.I) {
                    navOptions.c(k24.s.a(this.e.F()).P(), b.c);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s24) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q24 invoke() {
            q24 q24Var = d24.this.c;
            return q24Var == null ? new q24(d24.this.B(), d24.this.x) : q24Var;
        }
    }

    public static final class n extends Lambda implements Function1 {
        public final /* synthetic */ Ref.BooleanRef c;
        public final /* synthetic */ d24 e;
        public final /* synthetic */ j24 f;
        public final /* synthetic */ Bundle g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.BooleanRef booleanRef, d24 d24Var, j24 j24Var, Bundle bundle) {
            super(1);
            this.c = booleanRef;
            this.e = d24Var;
            this.f = j24Var;
            this.g = bundle;
        }

        public final void a(a24 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.c.element = true;
            d24.q(this.e, this.f, this.g, it, null, 8, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a24) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class o extends dg4 {
        public o() {
            super(false);
        }

        @Override // com.zepto.dg4
        public void d() {
            d24.this.U();
        }
    }

    public static final class p extends Lambda implements Function1 {
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(1);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.areEqual(str, this.c));
        }
    }

    public d24(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        Iterator it = SequencesKt__SequencesKt.generateSequence(context, (Function1<? super Context, ? extends Context>) ((Function1<? super Object, ? extends Object>) d.c)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.b = (Activity) next;
        this.h = new ArrayDeque();
        ty3 ty3VarA = x66.a(CollectionsKt__CollectionsKt.emptyList());
        this.i = ty3VarA;
        this.j = sd2.b(ty3VarA);
        ty3 ty3VarA2 = x66.a(CollectionsKt__CollectionsKt.emptyList());
        this.k = ty3VarA2;
        this.l = sd2.b(ty3VarA2);
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.s = new CopyOnWriteArrayList();
        this.t = h.b.INITIALIZED;
        this.u = new androidx.lifecycle.k() { // from class: com.zepto.c24
            @Override // androidx.lifecycle.k
            public final void e(df3 df3Var, h.a aVar) {
                d24.M(this.c, df3Var, aVar);
            }
        };
        this.v = new o();
        this.w = true;
        this.x = new h34();
        this.y = new LinkedHashMap();
        this.B = new LinkedHashMap();
        h34 h34Var = this.x;
        h34Var.b(new l24(h34Var));
        this.x.b(new qd(this.a));
        this.D = new ArrayList();
        this.E = LazyKt__LazyJVMKt.lazy(new m());
        sy3 sy3VarB = p06.b(1, 0, w70.DROP_OLDEST, 2, null);
        this.F = sy3VarB;
        this.G = sd2.a(sy3VarB);
    }

    public static final void M(d24 this$0, df3 df3Var, h.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(df3Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.t = event.b();
        if (this$0.d != null) {
            Iterator<E> it = this$0.h.iterator();
            while (it.hasNext()) {
                ((a24) it.next()).h(event);
            }
        }
    }

    public static /* synthetic */ boolean Y(d24 d24Var, String str, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return d24Var.X(str, z, z2);
    }

    public static /* synthetic */ boolean d0(d24 d24Var, int i2, boolean z, boolean z2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return d24Var.b0(i2, z, z2);
    }

    public static /* synthetic */ void f0(d24 d24Var, a24 a24Var, boolean z, ArrayDeque arrayDeque, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            arrayDeque = new ArrayDeque();
        }
        d24Var.e0(a24Var, z, arrayDeque);
    }

    public static /* synthetic */ void q(d24 d24Var, j24 j24Var, Bundle bundle, a24 a24Var, List list, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i2 & 8) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        d24Var.p(j24Var, bundle, a24Var, list);
    }

    public a24 A(int i2) {
        Object objPrevious;
        ArrayDeque arrayDeque = this.h;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((a24) objPrevious).e().P() == i2) {
                break;
            }
        }
        a24 a24Var = (a24) objPrevious;
        if (a24Var != null) {
            return a24Var;
        }
        throw new IllegalArgumentException(("No destination with ID " + i2 + " is on the NavController's back stack. The current destination is " + D()).toString());
    }

    public final Context B() {
        return this.a;
    }

    public a24 C() {
        return (a24) this.h.lastOrNull();
    }

    public j24 D() {
        a24 a24VarC = C();
        if (a24VarC != null) {
            return a24VarC.e();
        }
        return null;
    }

    public final int E() {
        ArrayDeque arrayDeque = this.h;
        int i2 = 0;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if ((!(((a24) it.next()).e() instanceof k24)) && (i2 = i2 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i2;
    }

    public k24 F() {
        k24 k24Var = this.d;
        if (k24Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        Intrinsics.checkNotNull(k24Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return k24Var;
    }

    public final h.b G() {
        return this.q == null ? h.b.CREATED : this.t;
    }

    public q24 H() {
        return (q24) this.E.getValue();
    }

    public h34 I() {
        return this.x;
    }

    public boolean J(Intent intent) {
        int[] intArray;
        j24 j24VarP0;
        k24 k24Var;
        Bundle bundle;
        int i2 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e2) {
                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null || intArray.length == 0) {
            k24 k24Var2 = this.d;
            Intrinsics.checkNotNull(k24Var2);
            j24.b bVarG0 = k24Var2.g0(new i24(intent));
            if (bVarG0 != null) {
                j24 j24VarB = bVarG0.b();
                int[] iArrZ = j24.z(j24VarB, null, 1, null);
                Bundle bundleU = j24VarB.u(bVarG0.c());
                if (bundleU != null) {
                    bundle2.putAll(bundleU);
                }
                intArray = iArrZ;
                parcelableArrayList = null;
            }
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strZ = z(intArray);
        if (strZ != null) {
            Log.i("NavController", "Could not find destination " + strZ + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i3 = 0; i3 < length; i3++) {
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle2);
            if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i3)) != null) {
                bundle4.putAll(bundle);
            }
            bundleArr[i3] = bundle4;
        }
        int flags = intent.getFlags();
        int i4 = 268435456 & flags;
        if (i4 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            dd6 dd6VarM = dd6.u(this.a).m(intent);
            Intrinsics.checkNotNullExpressionValue(dd6VarM, "create(context)\n        …ntWithParentStack(intent)");
            dd6VarM.B();
            Activity activity = this.b;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i4 != 0) {
            if (!this.h.isEmpty()) {
                k24 k24Var3 = this.d;
                Intrinsics.checkNotNull(k24Var3);
                d0(this, k24Var3.P(), true, false, 4, null);
            }
            while (i2 < intArray.length) {
                int i5 = intArray[i2];
                int i6 = i2 + 1;
                Bundle bundle5 = bundleArr[i2];
                j24 j24VarX = x(i5);
                if (j24VarX == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + j24.m.b(this.a, i5) + " cannot be found from the current destination " + D());
                }
                Q(j24VarX, bundle5, t24.a(new l(j24VarX, this)), null);
                i2 = i6;
            }
            this.g = true;
            return true;
        }
        k24 k24Var4 = this.d;
        int length2 = intArray.length;
        for (int i7 = 0; i7 < length2; i7++) {
            int i8 = intArray[i7];
            Bundle bundle6 = bundleArr[i7];
            if (i7 == 0) {
                j24VarP0 = this.d;
            } else {
                Intrinsics.checkNotNull(k24Var4);
                j24VarP0 = k24Var4.p0(i8);
            }
            if (j24VarP0 == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + j24.m.b(this.a, i8) + " cannot be found in graph " + k24Var4);
            }
            if (i7 == intArray.length - 1) {
                r24.a aVar = new r24.a();
                k24 k24Var5 = this.d;
                Intrinsics.checkNotNull(k24Var5);
                Q(j24VarP0, bundle6, r24.a.i(aVar, k24Var5.P(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (j24VarP0 instanceof k24) {
                while (true) {
                    k24Var = (k24) j24VarP0;
                    Intrinsics.checkNotNull(k24Var);
                    if (!(k24Var.p0(k24Var.v0()) instanceof k24)) {
                        break;
                    }
                    j24VarP0 = k24Var.p0(k24Var.v0());
                }
                k24Var4 = k24Var;
            }
        }
        this.g = true;
        return true;
    }

    public final List K(ArrayDeque arrayDeque) {
        j24 j24VarF;
        ArrayList arrayList = new ArrayList();
        a24 a24Var = (a24) this.h.lastOrNull();
        if (a24Var == null || (j24VarF = a24Var.e()) == null) {
            j24VarF = F();
        }
        if (arrayDeque != null) {
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                b24 b24Var = (b24) it.next();
                j24 j24VarY = y(j24VarF, b24Var.c());
                if (j24VarY == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + j24.m.b(this.a, b24Var.c()) + " cannot be found from the current destination " + j24VarF).toString());
                }
                arrayList.add(b24Var.e(this.a, j24VarY, G(), this.r));
                j24VarF = j24VarY;
            }
        }
        return arrayList;
    }

    public final boolean L(j24 j24Var, Bundle bundle) {
        j24 j24VarE;
        int iNextIndex;
        a24 a24VarC = C();
        int iP = j24Var instanceof k24 ? k24.s.a((k24) j24Var).P() : j24Var.P();
        if (a24VarC == null || (j24VarE = a24VarC.e()) == null || iP != j24VarE.P()) {
            return false;
        }
        ArrayDeque<a24> arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = this.h;
        ListIterator<E> listIterator = arrayDeque2.listIterator(arrayDeque2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((a24) listIterator.previous()).e() == j24Var) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        while (CollectionsKt__CollectionsKt.getLastIndex(this.h) >= iNextIndex) {
            a24 a24Var = (a24) this.h.removeLast();
            s0(a24Var);
            arrayDeque.addFirst(new a24(a24Var, a24Var.e().u(bundle)));
        }
        for (a24 a24Var2 : arrayDeque) {
            k24 k24VarA0 = a24Var2.e().a0();
            if (k24VarA0 != null) {
                N(a24Var2, A(k24VarA0.P()));
            }
            this.h.add(a24Var2);
        }
        for (a24 a24Var3 : arrayDeque) {
            this.x.d(a24Var3.e().T()).g(a24Var3);
        }
        return true;
    }

    public final void N(a24 a24Var, a24 a24Var2) {
        this.m.put(a24Var, a24Var2);
        if (this.n.get(a24Var2) == null) {
            this.n.put(a24Var2, new AtomicInteger(0));
        }
        Object obj = this.n.get(a24Var2);
        Intrinsics.checkNotNull(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public void O(int i2, Bundle bundle, r24 r24Var) {
        P(i2, bundle, r24Var, null);
    }

    public void P(int i2, Bundle bundle, r24 r24Var, g34.a aVar) {
        int iB;
        j24 j24VarE = this.h.isEmpty() ? this.d : ((a24) this.h.last()).e();
        if (j24VarE == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        x14 x14VarD = j24VarE.D(i2);
        Bundle bundle2 = null;
        if (x14VarD != null) {
            if (r24Var == null) {
                r24Var = x14VarD.c();
            }
            iB = x14VarD.b();
            Bundle bundleA = x14VarD.a();
            if (bundleA != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundleA);
            }
        } else {
            iB = i2;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (iB == 0 && r24Var != null && (r24Var.e() != -1 || r24Var.f() != null)) {
            if (r24Var.f() != null) {
                String strF = r24Var.f();
                Intrinsics.checkNotNull(strF);
                Y(this, strF, r24Var.g(), false, 4, null);
                return;
            } else {
                if (r24Var.e() != -1) {
                    V(r24Var.e(), r24Var.g());
                    return;
                }
                return;
            }
        }
        if (iB == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        j24 j24VarX = x(iB);
        if (j24VarX != null) {
            Q(j24VarX, bundle2, r24Var, aVar);
            return;
        }
        j24.a aVar2 = j24.m;
        String strB = aVar2.b(this.a, iB);
        if (x14VarD == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strB + " cannot be found from the current destination " + j24VarE);
        }
        throw new IllegalArgumentException(("Navigation destination " + strB + " referenced from action " + aVar2.b(this.a, i2) + " cannot be found from the current destination " + j24VarE).toString());
    }

    public final void Q(j24 j24Var, Bundle bundle, r24 r24Var, g34.a aVar) {
        boolean z;
        boolean z2;
        boolean zB0;
        Iterator it = this.y.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (r24Var == null) {
            z = false;
        } else {
            if (r24Var.f() != null) {
                String strF = r24Var.f();
                Intrinsics.checkNotNull(strF);
                zB0 = c0(strF, r24Var.g(), r24Var.i());
            } else {
                if (r24Var.e() != -1) {
                    zB0 = b0(r24Var.e(), r24Var.g(), r24Var.i());
                }
                z = false;
            }
            z = zB0;
        }
        Bundle bundleU = j24Var.u(bundle);
        if (r24Var != null && r24Var.j() && this.o.containsKey(Integer.valueOf(j24Var.P()))) {
            booleanRef.element = j0(j24Var.P(), bundleU, r24Var, aVar);
            z2 = false;
        } else {
            z2 = r24Var != null && r24Var.h() && L(j24Var, bundle);
            if (!z2) {
                R(this.x.d(j24Var.T()), CollectionsKt__CollectionsJVMKt.listOf(a24.a.b(a24.o, this.a, j24Var, bundleU, G(), this.r, null, null, 96, null)), r24Var, aVar, new n(booleanRef, this, j24Var, bundleU));
            }
        }
        u0();
        Iterator it2 = this.y.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        if (z || booleanRef.element || z2) {
            u();
        } else {
            t0();
        }
    }

    public final void R(g34 g34Var, List list, r24 r24Var, g34.a aVar, Function1 function1) {
        this.z = function1;
        g34Var.e(list, r24Var, aVar);
        this.z = null;
    }

    public boolean S() {
        Intent intent;
        if (E() != 1) {
            return U();
        }
        Activity activity = this.b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) != null ? q0() : r0();
    }

    public final void T(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String name : stringArrayList) {
                h34 h34Var = this.x;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                g34 g34VarD = h34Var.d(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    g34VarD.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                b24 b24Var = (b24) parcelable;
                j24 j24VarX = x(b24Var.c());
                if (j24VarX == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + j24.m.b(this.a, b24Var.c()) + " cannot be found from the current destination " + D());
                }
                a24 a24VarE = b24Var.e(this.a, j24VarX, G(), this.r);
                g34 g34VarD2 = this.x.d(j24VarX.T());
                Map map = this.y;
                Object bVar = map.get(g34VarD2);
                if (bVar == null) {
                    bVar = new b(this, g34VarD2);
                    map.put(g34VarD2, bVar);
                }
                this.h.add(a24VarE);
                ((b) bVar).o(a24VarE);
                k24 k24VarA0 = a24VarE.e().a0();
                if (k24VarA0 != null) {
                    N(a24VarE, A(k24VarA0.P()));
                }
            }
            u0();
            this.f = null;
        }
        Collection collectionValues = this.x.e().values();
        ArrayList<g34> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((g34) obj).c()) {
                arrayList.add(obj);
            }
        }
        for (g34 g34Var : arrayList) {
            Map map2 = this.y;
            Object bVar2 = map2.get(g34Var);
            if (bVar2 == null) {
                bVar2 = new b(this, g34Var);
                map2.put(g34Var, bVar2);
            }
            g34Var.f((b) bVar2);
        }
        if (this.d == null || !this.h.isEmpty()) {
            u();
            return;
        }
        if (!this.g && (activity = this.b) != null) {
            Intrinsics.checkNotNull(activity);
            if (J(activity.getIntent())) {
                return;
            }
        }
        k24 k24Var = this.d;
        Intrinsics.checkNotNull(k24Var);
        Q(k24Var, bundle, null, null);
    }

    public boolean U() {
        if (this.h.isEmpty()) {
            return false;
        }
        j24 j24VarD = D();
        Intrinsics.checkNotNull(j24VarD);
        return V(j24VarD.P(), true);
    }

    public boolean V(int i2, boolean z) {
        return W(i2, z, false);
    }

    public boolean W(int i2, boolean z, boolean z2) {
        return b0(i2, z, z2) && u();
    }

    public final boolean X(String route, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(route, "route");
        return c0(route, z, z2) && u();
    }

    public final void Z(a24 popUpTo, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int iIndexOf = this.h.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i2 = iIndexOf + 1;
        if (i2 != this.h.size()) {
            b0(((a24) this.h.get(i2)).e().P(), true, false);
        }
        f0(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        u0();
        u();
    }

    public final void a0(g34 g34Var, a24 a24Var, boolean z, Function1 function1) {
        this.A = function1;
        g34Var.j(a24Var, z);
        this.A = null;
    }

    public final boolean b0(int i2, boolean z, boolean z2) {
        j24 j24VarE;
        if (this.h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt___CollectionsKt.reversed(this.h).iterator();
        while (true) {
            if (!it.hasNext()) {
                j24VarE = null;
                break;
            }
            j24VarE = ((a24) it.next()).e();
            g34 g34VarD = this.x.d(j24VarE.T());
            if (z || j24VarE.P() != i2) {
                arrayList.add(g34VarD);
            }
            if (j24VarE.P() == i2) {
                break;
            }
        }
        if (j24VarE != null) {
            return v(arrayList, j24VarE, z, z2);
        }
        Log.i("NavController", "Ignoring popBackStack to destination " + j24.m.b(this.a, i2) + " as it was not found on the current back stack");
        return false;
    }

    public final boolean c0(String str, boolean z, boolean z2) {
        Object objPrevious;
        if (this.h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = this.h;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            a24 a24Var = (a24) objPrevious;
            boolean zF0 = a24Var.e().f0(str, a24Var.c());
            if (z || !zF0) {
                arrayList.add(this.x.d(a24Var.e().T()));
            }
            if (zF0) {
                break;
            }
        }
        a24 a24Var2 = (a24) objPrevious;
        j24 j24VarE = a24Var2 != null ? a24Var2.e() : null;
        if (j24VarE != null) {
            return v(arrayList, j24VarE, z, z2);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final void e0(a24 a24Var, boolean z, ArrayDeque arrayDeque) {
        f24 f24Var;
        v66 v66VarC;
        Set set;
        a24 a24Var2 = (a24) this.h.last();
        if (!Intrinsics.areEqual(a24Var2, a24Var)) {
            throw new IllegalStateException(("Attempted to pop " + a24Var.e() + ", which is not the top of the back stack (" + a24Var2.e() + ')').toString());
        }
        this.h.removeLast();
        b bVar = (b) this.y.get(I().d(a24Var2.e().T()));
        boolean z2 = true;
        if ((bVar == null || (v66VarC = bVar.c()) == null || (set = (Set) v66VarC.getValue()) == null || !set.contains(a24Var2)) && !this.n.containsKey(a24Var2)) {
            z2 = false;
        }
        h.b bVarB = a24Var2.g0().b();
        h.b bVar2 = h.b.CREATED;
        if (bVarB.b(bVar2)) {
            if (z) {
                a24Var2.k(bVar2);
                arrayDeque.addFirst(new b24(a24Var2));
            }
            if (z2) {
                a24Var2.k(bVar2);
            } else {
                a24Var2.k(h.b.DESTROYED);
                s0(a24Var2);
            }
        }
        if (z || z2 || (f24Var = this.r) == null) {
            return;
        }
        f24Var.h(a24Var2.f());
    }

    public final List g0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.y.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                a24 a24Var = (a24) obj;
                if (!arrayList.contains(a24Var) && !a24Var.g().b(h.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayDeque arrayDeque = this.h;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayDeque) {
            a24 a24Var2 = (a24) obj2;
            if (!arrayList.contains(a24Var2) && a24Var2.g().b(h.b.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((a24) obj3).e() instanceof k24)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public void h0(c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.s.remove(listener);
    }

    public void i0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.a.getClassLoader());
        this.e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.p.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                this.o.put(Integer.valueOf(intArray[i2]), stringArrayList.get(i3));
                i2++;
                i3++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                if (parcelableArray != null) {
                    Map map = this.p;
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    ArrayDeque arrayDeque = new ArrayDeque(parcelableArray.length);
                    Iterator it = ArrayIteratorKt.iterator(parcelableArray);
                    while (it.hasNext()) {
                        Parcelable parcelable = (Parcelable) it.next();
                        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        arrayDeque.add((b24) parcelable);
                    }
                    map.put(id, arrayDeque);
                }
            }
        }
        this.g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public final boolean j0(int i2, Bundle bundle, r24 r24Var, g34.a aVar) {
        if (!this.o.containsKey(Integer.valueOf(i2))) {
            return false;
        }
        String str = (String) this.o.get(Integer.valueOf(i2));
        CollectionsKt__MutableCollectionsKt.removeAll(this.o.values(), new p(str));
        return w(K((ArrayDeque) TypeIntrinsics.asMutableMap(this.p).remove(str)), bundle, r24Var, aVar);
    }

    public Bundle k0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.x.e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleI = ((g34) entry.getValue()).i();
            if (bundleI != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleI);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.h.size()];
            Iterator<E> it = this.h.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                parcelableArr[i2] = new b24((a24) it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i3 = 0;
            for (Map.Entry entry2 : this.o.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i3] = iIntValue;
                arrayList2.add(str2);
                i3++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : this.p.entrySet()) {
                String str3 = (String) entry3.getKey();
                ArrayDeque arrayDeque = (ArrayDeque) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[arrayDeque.size()];
                int i4 = 0;
                for (Object obj : arrayDeque) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i4] = (b24) obj;
                    i4 = i5;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str3, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.g);
        }
        return bundle;
    }

    public void l0(int i2) {
        n0(H().b(i2), null);
    }

    public void m0(int i2, Bundle bundle) {
        n0(H().b(i2), bundle);
    }

    public void n0(k24 graph, Bundle bundle) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (!Intrinsics.areEqual(this.d, graph)) {
            k24 k24Var = this.d;
            if (k24Var != null) {
                for (Integer id : new ArrayList(this.o.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    s(id.intValue());
                }
                d0(this, k24Var.P(), true, false, 4, null);
            }
            this.d = graph;
            T(bundle);
            return;
        }
        int iQ = graph.t0().q();
        for (int i2 = 0; i2 < iQ; i2++) {
            j24 j24Var = (j24) graph.t0().r(i2);
            k24 k24Var2 = this.d;
            Intrinsics.checkNotNull(k24Var2);
            int iK = k24Var2.t0().k(i2);
            k24 k24Var3 = this.d;
            Intrinsics.checkNotNull(k24Var3);
            k24Var3.t0().p(iK, j24Var);
        }
        for (a24 a24Var : this.h) {
            List<j24> listAsReversed = CollectionsKt__ReversedViewsKt.asReversed(SequencesKt___SequencesKt.toList(j24.m.c(a24Var.e())));
            j24 j24VarP0 = this.d;
            Intrinsics.checkNotNull(j24VarP0);
            for (j24 j24Var2 : listAsReversed) {
                if (!Intrinsics.areEqual(j24Var2, this.d) || !Intrinsics.areEqual(j24VarP0, graph)) {
                    if (j24VarP0 instanceof k24) {
                        j24VarP0 = ((k24) j24VarP0).p0(j24Var2.P());
                        Intrinsics.checkNotNull(j24VarP0);
                    }
                }
            }
            a24Var.j(j24VarP0);
        }
    }

    public void o0(df3 owner) {
        androidx.lifecycle.h hVarG0;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.areEqual(owner, this.q)) {
            return;
        }
        df3 df3Var = this.q;
        if (df3Var != null && (hVarG0 = df3Var.g0()) != null) {
            hVarG0.d(this.u);
        }
        this.q = owner;
        owner.g0().a(this.u);
    }

    public final void p(j24 j24Var, Bundle bundle, a24 a24Var, List list) {
        boolean z;
        ArrayDeque<a24> arrayDeque;
        j24 j24Var2;
        a24 a24Var2;
        Bundle bundle2;
        Object objPrevious;
        k24 k24Var;
        Object objPrevious2;
        List list2;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        a24 a24Var3 = a24Var;
        List list3 = list;
        j24 j24VarE = a24Var.e();
        if (!(j24VarE instanceof md2)) {
            while (!this.h.isEmpty() && (((a24) this.h.last()).e() instanceof md2) && d0(this, ((a24) this.h.last()).e().P(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        boolean z2 = true;
        Object obj = null;
        if (j24Var instanceof k24) {
            j24 j24Var3 = j24VarE;
            while (true) {
                Intrinsics.checkNotNull(j24Var3);
                k24 k24VarA0 = j24Var3.a0();
                if (k24VarA0 != null) {
                    ListIterator listIterator = list3.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (Intrinsics.areEqual(((a24) objPrevious2).e(), k24VarA0)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    a24 a24VarB = (a24) objPrevious2;
                    if (a24VarB == null) {
                        j24Var2 = j24VarE;
                        list2 = list3;
                        bundle3 = bundle4;
                        a24Var2 = a24Var3;
                        a24VarB = a24.a.b(a24.o, this.a, k24VarA0, bundle, G(), this.r, null, null, 96, null);
                    } else {
                        j24Var2 = j24VarE;
                        list2 = list3;
                        a24Var2 = a24Var3;
                        bundle3 = bundle4;
                    }
                    arrayDeque2.addFirst(a24VarB);
                    if ((this.h.isEmpty() ^ z2) && ((a24) this.h.last()).e() == k24VarA0) {
                        list3 = list2;
                        bundle2 = bundle3;
                        k24Var = k24VarA0;
                        z = z2;
                        arrayDeque = arrayDeque2;
                        f0(this, (a24) this.h.last(), false, null, 6, null);
                    } else {
                        list3 = list2;
                        bundle2 = bundle3;
                        k24Var = k24VarA0;
                        z = z2;
                        arrayDeque = arrayDeque2;
                    }
                } else {
                    k24Var = k24VarA0;
                    z = z2;
                    arrayDeque = arrayDeque2;
                    j24Var2 = j24VarE;
                    a24Var2 = a24Var3;
                    bundle2 = bundle4;
                }
                if (k24Var == null || k24Var == j24Var) {
                    break;
                }
                j24Var3 = k24Var;
                z2 = z;
                arrayDeque2 = arrayDeque;
                bundle4 = bundle2;
                j24VarE = j24Var2;
                a24Var3 = a24Var2;
            }
        } else {
            z = true;
            arrayDeque = arrayDeque2;
            j24Var2 = j24VarE;
            a24Var2 = a24Var3;
            bundle2 = bundle4;
        }
        j24 j24VarE2 = arrayDeque.isEmpty() ? j24Var2 : ((a24) arrayDeque.first()).e();
        while (j24VarE2 != null && x(j24VarE2.P()) != j24VarE2) {
            j24VarE2 = j24VarE2.a0();
            if (j24VarE2 != null) {
                Bundle bundle5 = (bundle2 == null || bundle.isEmpty() != z) ? bundle2 : null;
                ListIterator listIterator2 = list3.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (Intrinsics.areEqual(((a24) objPrevious).e(), j24VarE2)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                a24 a24VarB2 = (a24) objPrevious;
                if (a24VarB2 == null) {
                    a24VarB2 = a24.a.b(a24.o, this.a, j24VarE2, j24VarE2.u(bundle5), G(), this.r, null, null, 96, null);
                }
                arrayDeque.addFirst(a24VarB2);
            }
        }
        j24 j24VarE3 = arrayDeque.isEmpty() ? j24Var2 : ((a24) arrayDeque.first()).e();
        while (!this.h.isEmpty() && (((a24) this.h.last()).e() instanceof k24)) {
            j24 j24VarE4 = ((a24) this.h.last()).e();
            Intrinsics.checkNotNull(j24VarE4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((k24) j24VarE4).q0(j24VarE3.P(), false) != null) {
                break;
            } else {
                f0(this, (a24) this.h.last(), false, null, 6, null);
            }
        }
        a24 a24Var4 = (a24) this.h.firstOrNull();
        if (a24Var4 == null) {
            a24Var4 = (a24) arrayDeque.firstOrNull();
        }
        if (!Intrinsics.areEqual(a24Var4 != null ? a24Var4.e() : null, this.d)) {
            ListIterator listIterator3 = list3.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                j24 j24VarE5 = ((a24) objPrevious3).e();
                k24 k24Var2 = this.d;
                Intrinsics.checkNotNull(k24Var2);
                if (Intrinsics.areEqual(j24VarE5, k24Var2)) {
                    obj = objPrevious3;
                    break;
                }
            }
            a24 a24VarB3 = (a24) obj;
            if (a24VarB3 == null) {
                a24.a aVar = a24.o;
                Context context = this.a;
                k24 k24Var3 = this.d;
                Intrinsics.checkNotNull(k24Var3);
                k24 k24Var4 = this.d;
                Intrinsics.checkNotNull(k24Var4);
                a24VarB3 = a24.a.b(aVar, context, k24Var3, k24Var4.u(bundle2), G(), this.r, null, null, 96, null);
            }
            arrayDeque.addFirst(a24VarB3);
        }
        for (a24 a24Var5 : arrayDeque) {
            Object obj2 = this.y.get(this.x.d(a24Var5.e().T()));
            if (obj2 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + j24Var.T() + " should already be created").toString());
            }
            ((b) obj2).o(a24Var5);
        }
        this.h.addAll(arrayDeque);
        this.h.add(a24Var2);
        for (a24 a24Var6 : CollectionsKt___CollectionsKt.plus((Collection<? extends a24>) arrayDeque, a24Var2)) {
            k24 k24VarA02 = a24Var6.e().a0();
            if (k24VarA02 != null) {
                N(a24Var6, A(k24VarA02.P()));
            }
        }
    }

    public void p0(cr7 viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        f24 f24Var = this.r;
        f24.b bVar = f24.e;
        if (Intrinsics.areEqual(f24Var, bVar.a(viewModelStore))) {
            return;
        }
        if (!this.h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
        this.r = bVar.a(viewModelStore);
    }

    public final boolean q0() {
        int i2 = 0;
        if (!this.g) {
            return false;
        }
        Activity activity = this.b;
        Intrinsics.checkNotNull(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        Intrinsics.checkNotNull(intArray);
        List mutableList = ArraysKt___ArraysKt.toMutableList(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int iIntValue = ((Number) CollectionsKt__MutableCollectionsKt.removeLast(mutableList)).intValue();
        if (parcelableArrayList != null) {
        }
        if (mutableList.isEmpty()) {
            return false;
        }
        j24 j24VarY = y(F(), iIntValue);
        if (j24VarY instanceof k24) {
            iIntValue = k24.s.a((k24) j24VarY).P();
        }
        j24 j24VarD = D();
        if (j24VarD == null || iIntValue != j24VarD.P()) {
            return false;
        }
        h24 h24VarT = t();
        Bundle bundleA = j80.a(TuplesKt.to("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle != null) {
            bundleA.putAll(bundle);
        }
        h24VarT.e(bundleA);
        for (Object obj : mutableList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            h24VarT.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i2) : null);
            i2 = i3;
        }
        h24VarT.b().B();
        Activity activity2 = this.b;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    public void r(c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.s.add(listener);
        if (!this.h.isEmpty()) {
            a24 a24Var = (a24) this.h.last();
            listener.a(this, a24Var.e(), a24Var.c());
        }
    }

    public final boolean r0() {
        j24 j24VarD = D();
        Intrinsics.checkNotNull(j24VarD);
        int iP = j24VarD.P();
        for (k24 k24VarA0 = j24VarD.a0(); k24VarA0 != null; k24VarA0 = k24VarA0.a0()) {
            if (k24VarA0.v0() != iP) {
                Bundle bundle = new Bundle();
                Activity activity = this.b;
                if (activity != null) {
                    Intrinsics.checkNotNull(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.b;
                        Intrinsics.checkNotNull(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.b;
                            Intrinsics.checkNotNull(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            k24 k24Var = this.d;
                            Intrinsics.checkNotNull(k24Var);
                            Activity activity4 = this.b;
                            Intrinsics.checkNotNull(activity4);
                            Intent intent = activity4.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "activity!!.intent");
                            j24.b bVarG0 = k24Var.g0(new i24(intent));
                            if ((bVarG0 != null ? bVarG0.c() : null) != null) {
                                bundle.putAll(bVarG0.b().u(bVarG0.c()));
                            }
                        }
                    }
                }
                h24.g(new h24(this), k24VarA0.P(), null, 2, null).e(bundle).b().B();
                Activity activity5 = this.b;
                if (activity5 == null) {
                    return true;
                }
                activity5.finish();
                return true;
            }
            iP = k24VarA0.P();
        }
        return false;
    }

    public final boolean s(int i2) {
        Iterator it = this.y.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        boolean zJ0 = j0(i2, null, t24.a(e.c), null);
        Iterator it2 = this.y.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        return zJ0 && b0(i2, true, false);
    }

    public final a24 s0(a24 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        a24 a24Var = (a24) this.m.remove(child);
        if (a24Var == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.n.get(a24Var);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            b bVar = (b) this.y.get(this.x.d(a24Var.e().T()));
            if (bVar != null) {
                bVar.e(a24Var);
            }
            this.n.remove(a24Var);
        }
        return a24Var;
    }

    public h24 t() {
        return new h24(this);
    }

    public final void t0() {
        AtomicInteger atomicInteger;
        v66 v66VarC;
        Set set;
        List<a24> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.h);
        if (mutableList.isEmpty()) {
            return;
        }
        j24 j24VarE = ((a24) CollectionsKt___CollectionsKt.last(mutableList)).e();
        ArrayList arrayList = new ArrayList();
        if (j24VarE instanceof md2) {
            Iterator it = CollectionsKt___CollectionsKt.reversed(mutableList).iterator();
            while (it.hasNext()) {
                j24 j24VarE2 = ((a24) it.next()).e();
                arrayList.add(j24VarE2);
                if (!(j24VarE2 instanceof md2) && !(j24VarE2 instanceof k24)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (a24 a24Var : CollectionsKt___CollectionsKt.reversed(mutableList)) {
            h.b bVarG = a24Var.g();
            j24 j24VarE3 = a24Var.e();
            if (j24VarE != null && j24VarE3.P() == j24VarE.P()) {
                h.b bVar = h.b.RESUMED;
                if (bVarG != bVar) {
                    b bVar2 = (b) this.y.get(I().d(a24Var.e().T()));
                    if (Intrinsics.areEqual((bVar2 == null || (v66VarC = bVar2.c()) == null || (set = (Set) v66VarC.getValue()) == null) ? null : Boolean.valueOf(set.contains(a24Var)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.n.get(a24Var)) != null && atomicInteger.get() == 0)) {
                        map.put(a24Var, h.b.STARTED);
                    } else {
                        map.put(a24Var, bVar);
                    }
                }
                j24 j24Var = (j24) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList);
                if (j24Var != null && j24Var.P() == j24VarE3.P()) {
                    CollectionsKt__MutableCollectionsKt.removeFirst(arrayList);
                }
                j24VarE = j24VarE.a0();
            } else if ((!arrayList.isEmpty()) && j24VarE3.P() == ((j24) CollectionsKt___CollectionsKt.first((List) arrayList)).P()) {
                j24 j24Var2 = (j24) CollectionsKt__MutableCollectionsKt.removeFirst(arrayList);
                if (bVarG == h.b.RESUMED) {
                    a24Var.k(h.b.STARTED);
                } else {
                    h.b bVar3 = h.b.STARTED;
                    if (bVarG != bVar3) {
                        map.put(a24Var, bVar3);
                    }
                }
                k24 k24VarA0 = j24Var2.a0();
                if (k24VarA0 != null && !arrayList.contains(k24VarA0)) {
                    arrayList.add(k24VarA0);
                }
            } else {
                a24Var.k(h.b.CREATED);
            }
        }
        for (a24 a24Var2 : mutableList) {
            h.b bVar4 = (h.b) map.get(a24Var2);
            if (bVar4 != null) {
                a24Var2.k(bVar4);
            } else {
                a24Var2.l();
            }
        }
    }

    public final boolean u() {
        while (!this.h.isEmpty() && (((a24) this.h.last()).e() instanceof k24)) {
            f0(this, (a24) this.h.last(), false, null, 6, null);
        }
        a24 a24Var = (a24) this.h.lastOrNull();
        if (a24Var != null) {
            this.D.add(a24Var);
        }
        this.C++;
        t0();
        int i2 = this.C - 1;
        this.C = i2;
        if (i2 == 0) {
            List<a24> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.D);
            this.D.clear();
            for (a24 a24Var2 : mutableList) {
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(this, a24Var2.e(), a24Var2.c());
                }
                this.F.b(a24Var2);
            }
            this.i.b(CollectionsKt___CollectionsKt.toMutableList((Collection) this.h));
            this.k.b(g0());
        }
        return a24Var != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0() {
        /*
            r3 = this;
            com.zepto.dg4 r0 = r3.v
            boolean r1 = r3.w
            if (r1 == 0) goto Le
            int r1 = r3.E()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.d24.u0():void");
    }

    public final boolean v(List list, j24 j24Var, boolean z, boolean z2) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g34 g34Var = (g34) it.next();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            a0(g34Var, (a24) this.h.last(), z2, new f(booleanRef2, booleanRef, this, z2, arrayDeque));
            if (!booleanRef2.element) {
                break;
            }
        }
        if (z2) {
            if (!z) {
                for (j24 j24Var2 : SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(j24Var, (Function1<? super j24, ? extends j24>) ((Function1<? super Object, ? extends Object>) g.c)), new h())) {
                    Map map = this.o;
                    Integer numValueOf = Integer.valueOf(j24Var2.P());
                    b24 b24Var = (b24) arrayDeque.firstOrNull();
                    map.put(numValueOf, b24Var != null ? b24Var.d() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b24 b24Var2 = (b24) arrayDeque.first();
                Iterator it2 = SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(x(b24Var2.c()), (Function1<? super j24, ? extends j24>) ((Function1<? super Object, ? extends Object>) i.c)), new j()).iterator();
                while (it2.hasNext()) {
                    this.o.put(Integer.valueOf(((j24) it2.next()).P()), b24Var2.d());
                }
                this.p.put(b24Var2.d(), arrayDeque);
            }
        }
        u0();
        return booleanRef.element;
    }

    public final boolean w(List list, Bundle bundle, r24 r24Var, g34.a aVar) {
        a24 a24Var;
        j24 j24VarE;
        ArrayList<List> arrayList = new ArrayList();
        ArrayList<a24> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((a24) obj).e() instanceof k24)) {
                arrayList2.add(obj);
            }
        }
        for (a24 a24Var2 : arrayList2) {
            List list2 = (List) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList);
            if (Intrinsics.areEqual((list2 == null || (a24Var = (a24) CollectionsKt___CollectionsKt.last(list2)) == null || (j24VarE = a24Var.e()) == null) ? null : j24VarE.T(), a24Var2.e().T())) {
                list2.add(a24Var2);
            } else {
                arrayList.add(CollectionsKt__CollectionsKt.mutableListOf(a24Var2));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List list3 : arrayList) {
            R(this.x.d(((a24) CollectionsKt___CollectionsKt.first(list3)).e().T()), list3, r24Var, aVar, new k(booleanRef, list, new Ref.IntRef(), this, bundle));
        }
        return booleanRef.element;
    }

    public final j24 x(int i2) {
        j24 j24VarE;
        k24 k24Var = this.d;
        if (k24Var == null) {
            return null;
        }
        Intrinsics.checkNotNull(k24Var);
        if (k24Var.P() == i2) {
            return this.d;
        }
        a24 a24Var = (a24) this.h.lastOrNull();
        if (a24Var == null || (j24VarE = a24Var.e()) == null) {
            j24VarE = this.d;
            Intrinsics.checkNotNull(j24VarE);
        }
        return y(j24VarE, i2);
    }

    public final j24 y(j24 j24Var, int i2) {
        k24 k24VarA0;
        if (j24Var.P() == i2) {
            return j24Var;
        }
        if (j24Var instanceof k24) {
            k24VarA0 = (k24) j24Var;
        } else {
            k24VarA0 = j24Var.a0();
            Intrinsics.checkNotNull(k24VarA0);
        }
        return k24VarA0.p0(i2);
    }

    public final String z(int[] iArr) {
        k24 k24Var;
        k24 k24Var2 = this.d;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            j24 j24VarP0 = null;
            if (i2 >= length) {
                return null;
            }
            int i3 = iArr[i2];
            if (i2 == 0) {
                k24 k24Var3 = this.d;
                Intrinsics.checkNotNull(k24Var3);
                if (k24Var3.P() == i3) {
                    j24VarP0 = this.d;
                }
            } else {
                Intrinsics.checkNotNull(k24Var2);
                j24VarP0 = k24Var2.p0(i3);
            }
            if (j24VarP0 == null) {
                return j24.m.b(this.a, i3);
            }
            if (i2 != iArr.length - 1 && (j24VarP0 instanceof k24)) {
                while (true) {
                    k24Var = (k24) j24VarP0;
                    Intrinsics.checkNotNull(k24Var);
                    if (!(k24Var.p0(k24Var.v0()) instanceof k24)) {
                        break;
                    }
                    j24VarP0 = k24Var.p0(k24Var.v0());
                }
                k24Var2 = k24Var;
            }
            i2++;
        }
    }
}
