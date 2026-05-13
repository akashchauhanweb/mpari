package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.z;
import androidx.navigation.fragment.a;
import com.zepto.a24;
import com.zepto.b25;
import com.zepto.cf3;
import com.zepto.cr7;
import com.zepto.df3;
import com.zepto.dh2;
import com.zepto.g34;
import com.zepto.h31;
import com.zepto.i34;
import com.zepto.j24;
import com.zepto.j80;
import com.zepto.mf4;
import com.zepto.mg2;
import com.zepto.r24;
import com.zepto.sf2;
import com.zepto.sy2;
import com.zepto.tg2;
import com.zepto.zq7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@g34.b("fragment")
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003CD(B\u001f\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00101\u001a\u00020/¢\u0006\u0004\bA\u0010BJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J*\u0010\u0019\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001a\u0010!\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010&\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020\u0013H\u0002R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\"028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R,\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001306058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010<R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020;0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010?¨\u0006E"}, d2 = {"Landroidx/navigation/fragment/a;", "Lcom/zepto/g34;", "Landroidx/navigation/fragment/a$c;", "Lcom/zepto/a24;", "entry", "Lcom/zepto/r24;", "navOptions", "Lcom/zepto/g34$a;", "navigatorExtras", "", "x", "Lcom/zepto/i34;", "state", "f", "Lcom/zepto/sf2;", "fragment", "r", "(Lcom/zepto/sf2;Lcom/zepto/a24;Lcom/zepto/i34;)V", "popUpTo", "", "savedState", "j", "t", "", "entries", "e", "backStackEntry", "g", "Landroid/os/Bundle;", "i", "h", "s", "Lcom/zepto/dh2;", "u", "", "id", "isPop", "deduplicate", "p", "Landroid/content/Context;", "c", "Landroid/content/Context;", "context", "Lcom/zepto/mg2;", "d", "Lcom/zepto/mg2;", "fragmentManager", "", "I", "containerId", "", "Ljava/util/Set;", "savedIds", "", "Lkotlin/Pair;", "Ljava/util/List;", "w", "()Ljava/util/List;", "pendingOps", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/k;", "fragmentObserver", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "fragmentViewObserver", "<init>", "(Landroid/content/Context;Lcom/zepto/mg2;I)V", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,719:1\n31#2:720\n63#2,2:721\n766#3:723\n857#3,2:724\n1855#3,2:726\n518#3,7:728\n533#3,6:735\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n253#1:720\n253#1:721,2\n333#1:723\n333#1:724,2\n340#1:726,2\n90#1:728,7\n141#1:735,6\n*E\n"})
public class a extends g34 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final mg2 fragmentManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int containerId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Set savedIds;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final List pendingOps;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final androidx.lifecycle.k fragmentObserver;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Function1 fragmentViewObserver;

    /* JADX INFO: renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    public static final class C0019a extends zq7 {
        public WeakReference d;

        @Override // com.zepto.zq7
        public void e() {
            super.e();
            Function0 function0 = (Function0) g().get();
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final WeakReference g() {
            WeakReference weakReference = this.d;
            if (weakReference != null) {
                return weakReference;
            }
            Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
            return null;
        }

        public final void h(WeakReference weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.d = weakReference;
        }
    }

    public static class c extends j24 {
        public String o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g34 fragmentNavigator) {
            super(fragmentNavigator);
            Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        }

        @Override // com.zepto.j24
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            return super.equals(obj) && Intrinsics.areEqual(this.o, ((c) obj).o);
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
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, b25.c);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(b25.d);
            if (string != null) {
                p0(string);
            }
            Unit unit = Unit.INSTANCE;
            typedArrayObtainAttributes.recycle();
        }

        public final String o0() {
            String str = this.o;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set".toString());
            }
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        public final c p0(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.o = className;
            return this;
        }

        @Override // com.zepto.j24
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.o;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Pair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getFirst(), this.c));
        }
    }

    public static final class e extends Lambda implements Function0 {
        public final /* synthetic */ a24 c;
        public final /* synthetic */ i34 e;
        public final /* synthetic */ sf2 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a24 a24Var, i34 i34Var, sf2 sf2Var) {
            super(0);
            this.c = a24Var;
            this.e = i34Var;
            this.f = sf2Var;
        }

        public final void a() {
            i34 i34Var = this.e;
            sf2 sf2Var = this.f;
            for (a24 a24Var : (Iterable) i34Var.c().getValue()) {
                if (mg2.J0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + a24Var + " due to fragment " + sf2Var + " viewmodel being cleared");
                }
                i34Var.e(a24Var);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public static final f c = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0019a invoke(h31 initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new C0019a();
        }
    }

    public static final class g extends Lambda implements Function1 {
        public final /* synthetic */ sf2 e;
        public final /* synthetic */ a24 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(sf2 sf2Var, a24 a24Var) {
            super(1);
            this.e = sf2Var;
            this.f = a24Var;
        }

        public final void a(df3 df3Var) {
            List pendingOps = a.this.getPendingOps();
            sf2 sf2Var = this.e;
            boolean z = false;
            if (!(pendingOps instanceof Collection) || !pendingOps.isEmpty()) {
                Iterator it = pendingOps.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), sf2Var.d0())) {
                        z = true;
                        break;
                    }
                }
            }
            if (df3Var == null || z) {
                return;
            }
            androidx.lifecycle.h hVarG0 = this.e.i0().g0();
            if (hVarG0.b().b(h.b.CREATED)) {
                hVarG0.a((cf3) a.this.fragmentViewObserver.invoke(this.f));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((df3) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public static final void c(a this$0, a24 entry, df3 owner, h.a event) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(entry, "$entry");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == h.a.ON_RESUME && ((List) this$0.b().b().getValue()).contains(entry)) {
                if (mg2.J0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching RESUMED");
                }
                this$0.b().e(entry);
            }
            if (event == h.a.ON_DESTROY) {
                if (mg2.J0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
                }
                this$0.b().e(entry);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.k invoke(final a24 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            final a aVar = a.this;
            return new androidx.lifecycle.k() { // from class: com.zepto.sg2
                @Override // androidx.lifecycle.k
                public final void e(df3 df3Var, h.a aVar2) {
                    a.h.c(aVar, entry, df3Var, aVar2);
                }
            };
        }
    }

    public static final class i implements mg2.l {
        public final /* synthetic */ i34 a;
        public final /* synthetic */ a b;

        public i(i34 i34Var, a aVar) {
            this.a = i34Var;
            this.b = aVar;
        }

        @Override // com.zepto.mg2.l
        public void a(sf2 fragment, boolean z) {
            Object obj;
            Object objPrevious;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            List listPlus = CollectionsKt___CollectionsKt.plus((Collection) this.a.b().getValue(), (Iterable) this.a.c().getValue());
            ListIterator listIterator = listPlus.listIterator(listPlus.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (Intrinsics.areEqual(((a24) objPrevious).f(), fragment.d0())) {
                        break;
                    }
                }
            }
            a24 a24Var = (a24) objPrevious;
            boolean z2 = z && this.b.getPendingOps().isEmpty() && fragment.s0();
            Iterator it = this.b.getPendingOps().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Pair) next).getFirst(), fragment.d0())) {
                    obj = next;
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                this.b.getPendingOps().remove(pair);
            }
            if (!z2 && mg2.J0(2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + a24Var);
            }
            boolean z3 = pair != null && ((Boolean) pair.getSecond()).booleanValue();
            if (!z && !z3 && a24Var == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (a24Var != null) {
                this.b.r(fragment, a24Var, this.a);
                if (z2) {
                    if (mg2.J0(2)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + a24Var + " via system back");
                    }
                    this.a.i(a24Var, false);
                }
            }
        }

        @Override // com.zepto.mg2.l
        public void b() {
        }

        @Override // com.zepto.mg2.l
        public void c(sf2 fragment, boolean z) {
            Object objPrevious;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            if (z) {
                List list = (List) this.a.b().getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (Intrinsics.areEqual(((a24) objPrevious).f(), fragment.d0())) {
                            break;
                        }
                    }
                }
                a24 a24Var = (a24) objPrevious;
                if (mg2.J0(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + a24Var);
                }
                if (a24Var != null) {
                    this.a.j(a24Var);
                }
            }
        }
    }

    public static final class j extends Lambda implements Function1 {
        public static final j c = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Pair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (String) it.getFirst();
        }
    }

    public static final class k implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public k(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public a(Context context, mg2 fragmentManager, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i2;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new androidx.lifecycle.k() { // from class: com.zepto.qg2
            @Override // androidx.lifecycle.k
            public final void e(df3 df3Var, h.a aVar) {
                androidx.navigation.fragment.a.v(this.c, df3Var, aVar);
            }
        };
        this.fragmentViewObserver = new h();
    }

    public static /* synthetic */ void q(a aVar, String str, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        aVar.p(str, z, z2);
    }

    public static final void v(a this$0, df3 source, h.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == h.a.ON_DESTROY) {
            sf2 sf2Var = (sf2) source;
            Object obj = null;
            for (Object obj2 : (Iterable) this$0.b().c().getValue()) {
                if (Intrinsics.areEqual(((a24) obj2).f(), sf2Var.d0())) {
                    obj = obj2;
                }
            }
            a24 a24Var = (a24) obj;
            if (a24Var != null) {
                if (mg2.J0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + a24Var + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                this$0.b().e(a24Var);
            }
        }
    }

    private final void x(a24 entry, r24 navOptions, g34.a navigatorExtras) {
        boolean zIsEmpty = ((List) b().b().getValue()).isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.j() && this.savedIds.remove(entry.f())) {
            this.fragmentManager.k1(entry.f());
            b().l(entry);
            return;
        }
        dh2 dh2VarU = u(entry, navOptions);
        if (!zIsEmpty) {
            a24 a24Var = (a24) CollectionsKt___CollectionsKt.lastOrNull((List) b().b().getValue());
            if (a24Var != null) {
                q(this, a24Var.f(), false, false, 6, null);
            }
            q(this, entry.f(), false, false, 6, null);
            dh2VarU.g(entry.f());
        }
        dh2VarU.h();
        if (mg2.J0(2)) {
            Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + entry);
        }
        b().l(entry);
    }

    public static final void y(i34 state, a this$0, mg2 mg2Var, sf2 fragment) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mg2Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        List list = (List) state.b().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (Intrinsics.areEqual(((a24) objPrevious).f(), fragment.d0())) {
                    break;
                }
            }
        }
        a24 a24Var = (a24) objPrevious;
        if (mg2.J0(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + a24Var + " to FragmentManager " + this$0.fragmentManager);
        }
        if (a24Var != null) {
            this$0.s(a24Var, fragment);
            this$0.r(fragment, a24Var, state);
        }
    }

    @Override // com.zepto.g34
    public void e(List entries, r24 navOptions, g34.a navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.fragmentManager.Q0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            x((a24) it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // com.zepto.g34
    public void f(final i34 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.f(state);
        if (mg2.J0(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.fragmentManager.i(new tg2() { // from class: com.zepto.rg2
            @Override // com.zepto.tg2
            public final void a(mg2 mg2Var, sf2 sf2Var) {
                androidx.navigation.fragment.a.y(state, this, mg2Var, sf2Var);
            }
        });
        this.fragmentManager.j(new i(state, this));
    }

    @Override // com.zepto.g34
    public void g(a24 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (this.fragmentManager.Q0()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        dh2 dh2VarU = u(backStackEntry, null);
        List list = (List) b().b().getValue();
        if (list.size() > 1) {
            a24 a24Var = (a24) CollectionsKt___CollectionsKt.getOrNull(list, CollectionsKt__CollectionsKt.getLastIndex(list) - 1);
            if (a24Var != null) {
                q(this, a24Var.f(), false, false, 6, null);
            }
            q(this, backStackEntry.f(), true, false, 4, null);
            this.fragmentManager.c1(backStackEntry.f(), 1);
            q(this, backStackEntry.f(), false, false, 2, null);
            dh2VarU.g(backStackEntry.f());
        }
        dh2VarU.h();
        b().f(backStackEntry);
    }

    @Override // com.zepto.g34
    public void h(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.savedIds.clear();
            CollectionsKt__MutableCollectionsKt.addAll(this.savedIds, stringArrayList);
        }
    }

    @Override // com.zepto.g34
    public Bundle i() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return j80.a(TuplesKt.to("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.savedIds)));
    }

    @Override // com.zepto.g34
    public void j(a24 popUpTo, boolean savedState) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        if (this.fragmentManager.Q0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().b().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        List listSubList = list.subList(iIndexOf, list.size());
        a24 a24Var = (a24) CollectionsKt___CollectionsKt.first(list);
        if (savedState) {
            for (a24 a24Var2 : CollectionsKt___CollectionsKt.reversed(listSubList)) {
                if (Intrinsics.areEqual(a24Var2, a24Var)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + a24Var2);
                } else {
                    this.fragmentManager.p1(a24Var2.f());
                    this.savedIds.add(a24Var2.f());
                }
            }
        } else {
            this.fragmentManager.c1(popUpTo.f(), 1);
        }
        if (mg2.J0(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + savedState);
        }
        a24 a24Var3 = (a24) CollectionsKt___CollectionsKt.getOrNull(list, iIndexOf - 1);
        if (a24Var3 != null) {
            q(this, a24Var3.f(), false, false, 6, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            a24 a24Var4 = (a24) obj;
            if (SequencesKt___SequencesKt.contains(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.pendingOps), j.c), a24Var4.f()) || !Intrinsics.areEqual(a24Var4.f(), a24Var.f())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q(this, ((a24) it.next()).f(), true, false, 4, null);
        }
        b().i(popUpTo, savedState);
    }

    public final void p(String id, boolean isPop, boolean deduplicate) {
        if (deduplicate) {
            CollectionsKt__MutableCollectionsKt.removeAll(this.pendingOps, (Function1) new d(id));
        }
        this.pendingOps.add(TuplesKt.to(id, Boolean.valueOf(isPop)));
    }

    public final void r(sf2 fragment, a24 entry, i34 state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        cr7 cr7VarB0 = fragment.b0();
        Intrinsics.checkNotNullExpressionValue(cr7VarB0, "fragment.viewModelStore");
        sy2 sy2Var = new sy2();
        sy2Var.a(Reflection.getOrCreateKotlinClass(C0019a.class), f.c);
        ((C0019a) new z(cr7VarB0, sy2Var.b(), h31.a.b).a(C0019a.class)).h(new WeakReference(new e(entry, state, fragment)));
    }

    public final void s(a24 entry, sf2 fragment) {
        fragment.j0().g(fragment, new k(new g(fragment, entry)));
        fragment.g0().a(this.fragmentObserver);
    }

    @Override // com.zepto.g34
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this);
    }

    public final dh2 u(a24 entry, r24 navOptions) {
        j24 j24VarE = entry.e();
        Intrinsics.checkNotNull(j24VarE, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleC = entry.c();
        String strO0 = ((c) j24VarE).o0();
        if (strO0.charAt(0) == '.') {
            strO0 = this.context.getPackageName() + strO0;
        }
        sf2 sf2VarA = this.fragmentManager.t0().a(this.context.getClassLoader(), strO0);
        Intrinsics.checkNotNullExpressionValue(sf2VarA, "fragmentManager.fragment…t.classLoader, className)");
        sf2VarA.L1(bundleC);
        dh2 dh2VarN = this.fragmentManager.n();
        Intrinsics.checkNotNullExpressionValue(dh2VarN, "fragmentManager.beginTransaction()");
        int iA = navOptions != null ? navOptions.a() : -1;
        int iB = navOptions != null ? navOptions.b() : -1;
        int iC = navOptions != null ? navOptions.c() : -1;
        int iD = navOptions != null ? navOptions.d() : -1;
        if (iA != -1 || iB != -1 || iC != -1 || iD != -1) {
            if (iA == -1) {
                iA = 0;
            }
            if (iB == -1) {
                iB = 0;
            }
            if (iC == -1) {
                iC = 0;
            }
            dh2VarN.q(iA, iB, iC, iD != -1 ? iD : 0);
        }
        dh2VarN.p(this.containerId, sf2VarA, entry.f());
        dh2VarN.r(sf2VarA);
        dh2VarN.s(true);
        return dh2VarN;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final List getPendingOps() {
        return this.pendingOps;
    }
}
