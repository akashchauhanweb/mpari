package com.zepto;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.h;
import com.zepto.i56;

/* JADX INFO: loaded from: classes.dex */
public class yg2 {
    public final gg2 a;
    public final zg2 b;
    public final sf2 c;
    public boolean d = false;
    public int e = -1;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            dq7.n0(this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.b.values().length];
            a = iArr;
            try {
                iArr[h.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public yg2(gg2 gg2Var, zg2 zg2Var, sf2 sf2Var) {
        this.a = gg2Var;
        this.b = zg2Var;
        this.c = sf2Var;
    }

    public void a() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        Bundle bundle = this.c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.c.d1(bundle2);
        this.a.a(this.c, bundle2, false);
    }

    public void b() {
        sf2 sf2VarK0 = mg2.k0(this.c.H);
        sf2 sf2VarM = this.c.M();
        if (sf2VarK0 != null && !sf2VarK0.equals(sf2VarM)) {
            sf2 sf2Var = this.c;
            bh2.j(sf2Var, sf2VarK0, sf2Var.y);
        }
        int iJ = this.b.j(this.c);
        sf2 sf2Var2 = this.c;
        sf2Var2.H.addView(sf2Var2.I, iJ);
    }

    public void c() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        sf2 sf2Var = this.c;
        sf2 sf2Var2 = sf2Var.h;
        yg2 yg2VarN = null;
        if (sf2Var2 != null) {
            yg2 yg2VarN2 = this.b.n(sf2Var2.f);
            if (yg2VarN2 == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.h + " that does not belong to this FragmentManager!");
            }
            sf2 sf2Var3 = this.c;
            sf2Var3.i = sf2Var3.h.f;
            sf2Var3.h = null;
            yg2VarN = yg2VarN2;
        } else {
            String str = sf2Var.i;
            if (str != null && (yg2VarN = this.b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.i + " that does not belong to this FragmentManager!");
            }
        }
        if (yg2VarN != null) {
            yg2VarN.m();
        }
        sf2 sf2Var4 = this.c;
        sf2Var4.u = sf2Var4.t.w0();
        sf2 sf2Var5 = this.c;
        sf2Var5.w = sf2Var5.t.z0();
        this.a.g(this.c, false);
        this.c.e1();
        this.a.b(this.c, false);
    }

    public int d() {
        sf2 sf2Var = this.c;
        if (sf2Var.t == null) {
            return sf2Var.a;
        }
        int iMin = this.e;
        int i = b.a[sf2Var.S.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        sf2 sf2Var2 = this.c;
        if (sf2Var2.o) {
            if (sf2Var2.p) {
                iMin = Math.max(this.e, 2);
                View view = this.c.I;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, sf2Var2.a) : Math.min(iMin, 1);
            }
        }
        if (!this.c.l) {
            iMin = Math.min(iMin, 1);
        }
        sf2 sf2Var3 = this.c;
        ViewGroup viewGroup = sf2Var3.H;
        i56.c.a aVarP = viewGroup != null ? i56.r(viewGroup, sf2Var3.N()).p(this) : null;
        if (aVarP == i56.c.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarP == i56.c.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            sf2 sf2Var4 = this.c;
            if (sf2Var4.m) {
                iMin = sf2Var4.p0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        sf2 sf2Var5 = this.c;
        if (sf2Var5.J && sf2Var5.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.c);
        }
        return iMin;
    }

    public void e() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Bundle bundle = this.c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        sf2 sf2Var = this.c;
        if (sf2Var.Q) {
            sf2Var.a = 1;
            sf2Var.H1();
        } else {
            this.a.h(sf2Var, bundle2, false);
            this.c.h1(bundle2);
            this.a.c(this.c, bundle2, false);
        }
    }

    public void f() {
        String resourceName;
        if (this.c.o) {
            return;
        }
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
        }
        Bundle bundle = this.c.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterN1 = this.c.n1(bundle2);
        sf2 sf2Var = this.c;
        ViewGroup viewGroup2 = sf2Var.H;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = sf2Var.y;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) sf2Var.t.r0().c(this.c.y);
                if (viewGroup == null) {
                    sf2 sf2Var2 = this.c;
                    if (!sf2Var2.q) {
                        try {
                            resourceName = sf2Var2.V().getResourceName(this.c.y);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.y) + " (" + resourceName + ") for fragment " + this.c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    bh2.i(this.c, viewGroup);
                }
            }
        }
        sf2 sf2Var3 = this.c;
        sf2Var3.H = viewGroup;
        sf2Var3.j1(layoutInflaterN1, viewGroup, bundle2);
        if (this.c.I != null) {
            if (mg2.J0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.c);
            }
            this.c.I.setSaveFromParentEnabled(false);
            sf2 sf2Var4 = this.c;
            sf2Var4.I.setTag(h05.a, sf2Var4);
            if (viewGroup != null) {
                b();
            }
            sf2 sf2Var5 = this.c;
            if (sf2Var5.A) {
                sf2Var5.I.setVisibility(8);
            }
            if (dq7.T(this.c.I)) {
                dq7.n0(this.c.I);
            } else {
                View view = this.c.I;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.c.A1();
            gg2 gg2Var = this.a;
            sf2 sf2Var6 = this.c;
            gg2Var.m(sf2Var6, sf2Var6.I, bundle2, false);
            int visibility = this.c.I.getVisibility();
            this.c.P1(this.c.I.getAlpha());
            sf2 sf2Var7 = this.c;
            if (sf2Var7.H != null && visibility == 0) {
                View viewFindFocus = sf2Var7.I.findFocus();
                if (viewFindFocus != null) {
                    this.c.M1(viewFindFocus);
                    if (mg2.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.c);
                    }
                }
                this.c.I.setAlpha(0.0f);
            }
        }
        this.c.a = 2;
    }

    public void g() {
        sf2 sf2VarF;
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        sf2 sf2Var = this.c;
        boolean zIsChangingConfigurations = true;
        boolean z = sf2Var.m && !sf2Var.p0();
        if (z) {
            sf2 sf2Var2 = this.c;
            if (!sf2Var2.n) {
                this.b.B(sf2Var2.f, null);
            }
        }
        if (!z && !this.b.p().s(this.c)) {
            String str = this.c.i;
            if (str != null && (sf2VarF = this.b.f(str)) != null && sf2VarF.C) {
                this.c.h = sf2VarF;
            }
            this.c.a = 0;
            return;
        }
        eg2 eg2Var = this.c.u;
        if (eg2Var instanceof dr7) {
            zIsChangingConfigurations = this.b.p().p();
        } else if (eg2Var.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) eg2Var.f()).isChangingConfigurations();
        }
        if ((z && !this.c.n) || zIsChangingConfigurations) {
            this.b.p().h(this.c, false);
        }
        this.c.k1();
        this.a.d(this.c, false);
        for (yg2 yg2Var : this.b.k()) {
            if (yg2Var != null) {
                sf2 sf2VarK = yg2Var.k();
                if (this.c.f.equals(sf2VarK.i)) {
                    sf2VarK.h = this.c;
                    sf2VarK.i = null;
                }
            }
        }
        sf2 sf2Var3 = this.c;
        String str2 = sf2Var3.i;
        if (str2 != null) {
            sf2Var3.h = this.b.f(str2);
        }
        this.b.s(this);
    }

    public void h() {
        View view;
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        sf2 sf2Var = this.c;
        ViewGroup viewGroup = sf2Var.H;
        if (viewGroup != null && (view = sf2Var.I) != null) {
            viewGroup.removeView(view);
        }
        this.c.l1();
        this.a.n(this.c, false);
        sf2 sf2Var2 = this.c;
        sf2Var2.H = null;
        sf2Var2.I = null;
        sf2Var2.U = null;
        sf2Var2.V.m(null);
        this.c.p = false;
    }

    public void i() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.m1();
        this.a.e(this.c, false);
        sf2 sf2Var = this.c;
        sf2Var.a = -1;
        sf2Var.u = null;
        sf2Var.w = null;
        sf2Var.t = null;
        if ((!sf2Var.m || sf2Var.p0()) && !this.b.p().s(this.c)) {
            return;
        }
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.c);
        }
        this.c.l0();
    }

    public void j() {
        sf2 sf2Var = this.c;
        if (sf2Var.o && sf2Var.p && !sf2Var.r) {
            if (mg2.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Bundle bundle = this.c.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            sf2 sf2Var2 = this.c;
            sf2Var2.j1(sf2Var2.n1(bundle2), null, bundle2);
            View view = this.c.I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                sf2 sf2Var3 = this.c;
                sf2Var3.I.setTag(h05.a, sf2Var3);
                sf2 sf2Var4 = this.c;
                if (sf2Var4.A) {
                    sf2Var4.I.setVisibility(8);
                }
                this.c.A1();
                gg2 gg2Var = this.a;
                sf2 sf2Var5 = this.c;
                gg2Var.m(sf2Var5, sf2Var5.I, bundle2, false);
                this.c.a = 2;
            }
        }
    }

    public sf2 k() {
        return this.c;
    }

    public final boolean l(View view) {
        if (view == this.c.I) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.I) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int iD = d();
                sf2 sf2Var = this.c;
                int i = sf2Var.a;
                if (iD == i) {
                    if (!z && i == -1 && sf2Var.m && !sf2Var.p0() && !this.c.n) {
                        if (mg2.J0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.c);
                        }
                        this.b.p().h(this.c, true);
                        this.b.s(this);
                        if (mg2.J0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.c);
                        }
                        this.c.l0();
                    }
                    sf2 sf2Var2 = this.c;
                    if (sf2Var2.O) {
                        if (sf2Var2.I != null && (viewGroup = sf2Var2.H) != null) {
                            i56 i56VarR = i56.r(viewGroup, sf2Var2.N());
                            if (this.c.A) {
                                i56VarR.g(this);
                            } else {
                                i56VarR.i(this);
                            }
                        }
                        sf2 sf2Var3 = this.c;
                        mg2 mg2Var = sf2Var3.t;
                        if (mg2Var != null) {
                            mg2Var.H0(sf2Var3);
                        }
                        sf2 sf2Var4 = this.c;
                        sf2Var4.O = false;
                        sf2Var4.M0(sf2Var4.A);
                        this.c.v.H();
                    }
                    this.d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (sf2Var.n && this.b.q(sf2Var.f) == null) {
                                this.b.B(this.c.f, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.c.a = 1;
                            break;
                        case 2:
                            sf2Var.p = false;
                            sf2Var.a = 2;
                            break;
                        case 3:
                            if (mg2.J0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                            }
                            sf2 sf2Var5 = this.c;
                            if (sf2Var5.n) {
                                this.b.B(sf2Var5.f, q());
                            } else if (sf2Var5.I != null && sf2Var5.c == null) {
                                r();
                            }
                            sf2 sf2Var6 = this.c;
                            if (sf2Var6.I != null && (viewGroup2 = sf2Var6.H) != null) {
                                i56.r(viewGroup2, sf2Var6.N()).h(this);
                            }
                            this.c.a = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            sf2Var.a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (sf2Var.I != null && (viewGroup3 = sf2Var.H) != null) {
                                i56.r(viewGroup3, sf2Var.N()).f(i56.c.b.c(this.c.I.getVisibility()), this);
                            }
                            this.c.a = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            sf2Var.a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void n() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.s1();
        this.a.f(this.c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.c.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.c.b.getBundle("savedInstanceState") == null) {
            this.c.b.putBundle("savedInstanceState", new Bundle());
        }
        sf2 sf2Var = this.c;
        sf2Var.c = sf2Var.b.getSparseParcelableArray("viewState");
        sf2 sf2Var2 = this.c;
        sf2Var2.d = sf2Var2.b.getBundle("viewRegistryState");
        xg2 xg2Var = (xg2) this.c.b.getParcelable("state");
        if (xg2Var != null) {
            sf2 sf2Var3 = this.c;
            sf2Var3.i = xg2Var.o;
            sf2Var3.j = xg2Var.p;
            Boolean bool = sf2Var3.e;
            if (bool != null) {
                sf2Var3.K = bool.booleanValue();
                this.c.e = null;
            } else {
                sf2Var3.K = xg2Var.q;
            }
        }
        sf2 sf2Var4 = this.c;
        if (sf2Var4.K) {
            return;
        }
        sf2Var4.J = true;
    }

    public void p() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View viewE = this.c.E();
        if (viewE != null && l(viewE)) {
            boolean zRequestFocus = viewE.requestFocus();
            if (mg2.J0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(viewE);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.c);
                sb.append(" resulting in focused view ");
                sb.append(this.c.I.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.c.M1(null);
        this.c.w1();
        this.a.i(this.c, false);
        this.b.B(this.c.f, null);
        sf2 sf2Var = this.c;
        sf2Var.b = null;
        sf2Var.c = null;
        sf2Var.d = null;
    }

    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        sf2 sf2Var = this.c;
        if (sf2Var.a == -1 && (bundle = sf2Var.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new xg2(this.c));
        if (this.c.a > -1) {
            Bundle bundle3 = new Bundle();
            this.c.x1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(this.c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.c.X.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleR0 = this.c.v.R0();
            if (!bundleR0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleR0);
            }
            if (this.c.I != null) {
                r();
            }
            SparseArray<? extends Parcelable> sparseArray = this.c.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.c.d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.c.g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void r() {
        if (this.c.I == null) {
            return;
        }
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.c + " with view " + this.c.I);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.I.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.U.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.d = bundle;
    }

    public void s(int i) {
        this.e = i;
    }

    public void t() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.y1();
        this.a.k(this.c, false);
    }

    public void u() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.z1();
        this.a.l(this.c, false);
    }

    public yg2(gg2 gg2Var, zg2 zg2Var, ClassLoader classLoader, dg2 dg2Var, Bundle bundle) {
        this.a = gg2Var;
        this.b = zg2Var;
        sf2 sf2VarC = ((xg2) bundle.getParcelable("state")).c(dg2Var, classLoader);
        this.c = sf2VarC;
        sf2VarC.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        sf2VarC.L1(bundle2);
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + sf2VarC);
        }
    }

    public yg2(gg2 gg2Var, zg2 zg2Var, sf2 sf2Var, Bundle bundle) {
        this.a = gg2Var;
        this.b = zg2Var;
        this.c = sf2Var;
        sf2Var.c = null;
        sf2Var.d = null;
        sf2Var.s = 0;
        sf2Var.p = false;
        sf2Var.l = false;
        sf2 sf2Var2 = sf2Var.h;
        sf2Var.i = sf2Var2 != null ? sf2Var2.f : null;
        sf2Var.h = null;
        sf2Var.b = bundle;
        sf2Var.g = bundle.getBundle("arguments");
    }
}
