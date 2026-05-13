package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.zepto.b25;
import com.zepto.cm5;
import com.zepto.cr7;
import com.zepto.d24;
import com.zepto.g34;
import com.zepto.h34;
import com.zepto.j80;
import com.zepto.m24;
import com.zepto.mg2;
import com.zepto.sf2;
import com.zepto.uj1;
import com.zepto.uz4;
import com.zepto.x24;
import com.zepto.z15;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b3\u00104J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0015J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0015J\u0010\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0015J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0007H\u0017J\b\u0010 \u001a\u00020\u0005H\u0016R\u001b\u0010\u000b\u001a\u00020\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Lcom/zepto/sf2;", "", "Landroid/content/Context;", "context", "", "z0", "Landroid/os/Bundle;", "savedInstanceState", "C0", "Lcom/zepto/m24;", "navHostController", "b2", "Lcom/zepto/d24;", "navController", "a2", "Lcom/zepto/g34;", "Landroidx/navigation/fragment/a$c;", "X1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "G0", "view", "b1", "Landroid/util/AttributeSet;", "attrs", "O0", "outState", "Y0", "J0", "d0", "Lkotlin/Lazy;", "Z1", "()Lcom/zepto/m24;", "e0", "Landroid/view/View;", "viewParent", "", "f0", "I", "graphId", "", "g0", "Z", "defaultNavHost", "Y1", "()I", "containerId", "<init>", "()V", "h0", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,407:1\n181#2,2:408\n1#3:410\n232#4,3:411\n232#4,3:414\n*S KotlinDebug\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n*L\n210#1:408,2\n283#1:411,3\n291#1:414,3\n*E\n"})
public class NavHostFragment extends sf2 {

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final Lazy navHostController = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public View viewParent;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public int graphId;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public boolean defaultNavHost;

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        public static final Bundle d(m24 this_apply) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            Bundle bundleK0 = this_apply.k0();
            if (bundleK0 != null) {
                return bundleK0;
            }
            Bundle EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            return EMPTY;
        }

        public static final Bundle e(NavHostFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.graphId != 0) {
                return j80.a(TuplesKt.to("android-support-nav:fragment:graphId", Integer.valueOf(this$0.graphId)));
            }
            Bundle bundle = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m24 invoke() {
            Context contextV = NavHostFragment.this.v();
            if (contextV == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
            }
            Intrinsics.checkNotNullExpressionValue(contextV, "checkNotNull(context) {\n…nt is attached\"\n        }");
            final m24 m24Var = new m24(contextV);
            final NavHostFragment navHostFragment = NavHostFragment.this;
            m24Var.o0(navHostFragment);
            cr7 viewModelStore = navHostFragment.b0();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            m24Var.p0(viewModelStore);
            navHostFragment.b2(m24Var);
            Bundle bundleB = navHostFragment.o().b("android-support-nav:fragment:navControllerState");
            if (bundleB != null) {
                m24Var.i0(bundleB);
            }
            navHostFragment.o().h("android-support-nav:fragment:navControllerState", new cm5.c() { // from class: com.zepto.n24
                @Override // com.zepto.cm5.c
                public final Bundle a() {
                    return NavHostFragment.b.d(m24Var);
                }
            });
            Bundle bundleB2 = navHostFragment.o().b("android-support-nav:fragment:graphId");
            if (bundleB2 != null) {
                navHostFragment.graphId = bundleB2.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.o().h("android-support-nav:fragment:graphId", new cm5.c() { // from class: com.zepto.o24
                @Override // com.zepto.cm5.c
                public final Bundle a() {
                    return NavHostFragment.b.e(navHostFragment);
                }
            });
            if (navHostFragment.graphId != 0) {
                m24Var.l0(navHostFragment.graphId);
            } else {
                Bundle bundleT = navHostFragment.t();
                int i = bundleT != null ? bundleT.getInt("android-support-nav:fragment:graphId") : 0;
                Bundle bundle = bundleT != null ? bundleT.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                if (i != 0) {
                    m24Var.m0(i, bundle);
                }
            }
            return m24Var;
        }
    }

    @Override // com.zepto.sf2
    public void C0(Bundle savedInstanceState) {
        Z1();
        if (savedInstanceState != null && savedInstanceState.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.defaultNavHost = true;
            N().n().r(this).h();
        }
        super.C0(savedInstanceState);
    }

    @Override // com.zepto.sf2
    public View G0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(Y1());
        return fragmentContainerView;
    }

    @Override // com.zepto.sf2
    public void J0() {
        super.J0();
        View view = this.viewParent;
        if (view != null && x24.c(view) == Z1()) {
            x24.f(view, null);
        }
        this.viewParent = null;
    }

    @Override // com.zepto.sf2
    public void O0(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.O0(context, attrs, savedInstanceState);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, z15.g);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(z15.h, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, b25.e);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(b25.f, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public g34 X1() {
        Context contextF1 = F1();
        Intrinsics.checkNotNullExpressionValue(contextF1, "requireContext()");
        mg2 childFragmentManager = u();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        return new a(contextF1, childFragmentManager, Y1());
    }

    @Override // com.zepto.sf2
    public void Y0(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.Y0(outState);
        if (this.defaultNavHost) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    public final int Y1() {
        int iG = G();
        return (iG == 0 || iG == -1) ? uz4.a : iG;
    }

    public final m24 Z1() {
        return (m24) this.navHostController.getValue();
    }

    public void a2(d24 navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        h34 h34VarI = navController.I();
        Context contextF1 = F1();
        Intrinsics.checkNotNullExpressionValue(contextF1, "requireContext()");
        mg2 childFragmentManager = u();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        h34VarI.b(new uj1(contextF1, childFragmentManager));
        navController.I().b(X1());
    }

    @Override // com.zepto.sf2
    public void b1(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b1(view, savedInstanceState);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        x24.f(view, Z1());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.viewParent = view2;
            Intrinsics.checkNotNull(view2);
            if (view2.getId() == G()) {
                View view3 = this.viewParent;
                Intrinsics.checkNotNull(view3);
                x24.f(view3, Z1());
            }
        }
    }

    public void b2(m24 navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        a2(navHostController);
    }

    @Override // com.zepto.sf2
    public void z0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.z0(context);
        if (this.defaultNavHost) {
            N().n().r(this).h();
        }
    }
}
