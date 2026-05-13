package com.zepto;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.zepto.z5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class av7 extends t5 implements ActionBarOverlayLayout.d {
    public static final Interpolator D = new AccelerateInterpolator();
    public static final Interpolator E = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public Activity c;
    public ActionBarOverlayLayout d;
    public ActionBarContainer e;
    public ve1 f;
    public ActionBarContextView g;
    public View h;
    public boolean k;
    public d l;
    public z5 m;
    public z5.a n;
    public boolean o;
    public boolean q;
    public boolean t;
    public boolean u;
    public boolean v;
    public mr7 x;
    public boolean y;
    public boolean z;
    public ArrayList i = new ArrayList();
    public int j = -1;
    public ArrayList p = new ArrayList();
    public int r = 0;
    public boolean s = true;
    public boolean w = true;
    public final nr7 A = new a();
    public final nr7 B = new b();
    public final pr7 C = new c();

    public class a extends or7 {
        public a() {
        }

        @Override // com.zepto.nr7
        public void b(View view) {
            View view2;
            av7 av7Var = av7.this;
            if (av7Var.s && (view2 = av7Var.h) != null) {
                view2.setTranslationY(0.0f);
                av7.this.e.setTranslationY(0.0f);
            }
            av7.this.e.setVisibility(8);
            av7.this.e.setTransitioning(false);
            av7 av7Var2 = av7.this;
            av7Var2.x = null;
            av7Var2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = av7.this.d;
            if (actionBarOverlayLayout != null) {
                dq7.n0(actionBarOverlayLayout);
            }
        }
    }

    public class b extends or7 {
        public b() {
        }

        @Override // com.zepto.nr7
        public void b(View view) {
            av7 av7Var = av7.this;
            av7Var.x = null;
            av7Var.e.requestLayout();
        }
    }

    public class c implements pr7 {
        public c() {
        }

        @Override // com.zepto.pr7
        public void a(View view) {
            ((View) av7.this.e.getParent()).invalidate();
        }
    }

    public class d extends z5 implements e.a {
        public final Context c;
        public final androidx.appcompat.view.menu.e d;
        public z5.a e;
        public WeakReference f;

        public d(Context context, z5.a aVar) {
            this.c = context;
            this.e = aVar;
            androidx.appcompat.view.menu.e eVarW = new androidx.appcompat.view.menu.e(context).W(1);
            this.d = eVarW;
            eVarW.V(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            z5.a aVar = this.e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.e == null) {
                return;
            }
            k();
            av7.this.g.l();
        }

        @Override // com.zepto.z5
        public void c() {
            av7 av7Var = av7.this;
            if (av7Var.l != this) {
                return;
            }
            if (av7.B(av7Var.t, av7Var.u, false)) {
                this.e.a(this);
            } else {
                av7 av7Var2 = av7.this;
                av7Var2.m = this;
                av7Var2.n = this.e;
            }
            this.e = null;
            av7.this.A(false);
            av7.this.g.g();
            av7 av7Var3 = av7.this;
            av7Var3.d.setHideOnContentScrollEnabled(av7Var3.z);
            av7.this.l = null;
        }

        @Override // com.zepto.z5
        public View d() {
            WeakReference weakReference = this.f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // com.zepto.z5
        public Menu e() {
            return this.d;
        }

        @Override // com.zepto.z5
        public MenuInflater f() {
            return new g96(this.c);
        }

        @Override // com.zepto.z5
        public CharSequence g() {
            return av7.this.g.getSubtitle();
        }

        @Override // com.zepto.z5
        public CharSequence i() {
            return av7.this.g.getTitle();
        }

        @Override // com.zepto.z5
        public void k() {
            if (av7.this.l != this) {
                return;
            }
            this.d.h0();
            try {
                this.e.d(this, this.d);
            } finally {
                this.d.g0();
            }
        }

        @Override // com.zepto.z5
        public boolean l() {
            return av7.this.g.j();
        }

        @Override // com.zepto.z5
        public void m(View view) {
            av7.this.g.setCustomView(view);
            this.f = new WeakReference(view);
        }

        @Override // com.zepto.z5
        public void n(int i) {
            o(av7.this.a.getResources().getString(i));
        }

        @Override // com.zepto.z5
        public void o(CharSequence charSequence) {
            av7.this.g.setSubtitle(charSequence);
        }

        @Override // com.zepto.z5
        public void q(int i) {
            r(av7.this.a.getResources().getString(i));
        }

        @Override // com.zepto.z5
        public void r(CharSequence charSequence) {
            av7.this.g.setTitle(charSequence);
        }

        @Override // com.zepto.z5
        public void s(boolean z) {
            super.s(z);
            av7.this.g.setTitleOptional(z);
        }

        public boolean t() {
            this.d.h0();
            try {
                return this.e.b(this, this.d);
            } finally {
                this.d.g0();
            }
        }
    }

    public av7(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        I(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    public static boolean B(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public void A(boolean z) {
        lr7 lr7VarU;
        lr7 lr7VarF;
        if (z) {
            P();
        } else {
            H();
        }
        if (!O()) {
            if (z) {
                this.f.j(4);
                this.g.setVisibility(0);
                return;
            } else {
                this.f.j(0);
                this.g.setVisibility(8);
                return;
            }
        }
        if (z) {
            lr7VarF = this.f.u(4, 100L);
            lr7VarU = this.g.f(0, 200L);
        } else {
            lr7VarU = this.f.u(0, 200L);
            lr7VarF = this.g.f(8, 100L);
        }
        mr7 mr7Var = new mr7();
        mr7Var.d(lr7VarF, lr7VarU);
        mr7Var.h();
    }

    public void C() {
        z5.a aVar = this.n;
        if (aVar != null) {
            aVar.a(this.m);
            this.m = null;
            this.n = null;
        }
    }

    public void D(boolean z) {
        View view;
        mr7 mr7Var = this.x;
        if (mr7Var != null) {
            mr7Var.a();
        }
        if (this.r != 0 || (!this.y && !z)) {
            this.A.b(null);
            return;
        }
        this.e.setAlpha(1.0f);
        this.e.setTransitioning(true);
        mr7 mr7Var2 = new mr7();
        float f = -this.e.getHeight();
        if (z) {
            this.e.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        lr7 lr7VarM = dq7.e(this.e).m(f);
        lr7VarM.k(this.C);
        mr7Var2.c(lr7VarM);
        if (this.s && (view = this.h) != null) {
            mr7Var2.c(dq7.e(view).m(f));
        }
        mr7Var2.f(D);
        mr7Var2.e(250L);
        mr7Var2.g(this.A);
        this.x = mr7Var2;
        mr7Var2.h();
    }

    public void E(boolean z) {
        View view;
        View view2;
        mr7 mr7Var = this.x;
        if (mr7Var != null) {
            mr7Var.a();
        }
        this.e.setVisibility(0);
        if (this.r == 0 && (this.y || z)) {
            this.e.setTranslationY(0.0f);
            float f = -this.e.getHeight();
            if (z) {
                this.e.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.e.setTranslationY(f);
            mr7 mr7Var2 = new mr7();
            lr7 lr7VarM = dq7.e(this.e).m(0.0f);
            lr7VarM.k(this.C);
            mr7Var2.c(lr7VarM);
            if (this.s && (view2 = this.h) != null) {
                view2.setTranslationY(f);
                mr7Var2.c(dq7.e(this.h).m(0.0f));
            }
            mr7Var2.f(E);
            mr7Var2.e(250L);
            mr7Var2.g(this.B);
            this.x = mr7Var2;
            mr7Var2.h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.s && (view = this.h) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            dq7.n0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ve1 F(View view) {
        if (view instanceof ve1) {
            return (ve1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int G() {
        return this.f.t();
    }

    public final void H() {
        if (this.v) {
            this.v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            Q(false);
        }
    }

    public final void I(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(b05.p);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f = F(view.findViewById(b05.a));
        this.g = (ActionBarContextView) view.findViewById(b05.f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(b05.c);
        this.e = actionBarContainer;
        ve1 ve1Var = this.f;
        if (ve1Var == null || this.g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = ve1Var.getContext();
        boolean z = (this.f.p() & 4) != 0;
        if (z) {
            this.k = true;
        }
        x5 x5VarB = x5.b(this.a);
        N(x5VarB.a() || z);
        L(x5VarB.e());
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, c25.a, zy4.c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(c25.k, false)) {
            M(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c25.i, 0);
        if (dimensionPixelSize != 0) {
            K(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void J(int i, int i2) {
        int iP = this.f.p();
        if ((i2 & 4) != 0) {
            this.k = true;
        }
        this.f.o((i & i2) | ((~i2) & iP));
    }

    public void K(float f) {
        dq7.y0(this.e, f);
    }

    public final void L(boolean z) {
        this.q = z;
        if (z) {
            this.e.setTabContainer(null);
            this.f.k(null);
        } else {
            this.f.k(null);
            this.e.setTabContainer(null);
        }
        boolean z2 = false;
        boolean z3 = G() == 2;
        this.f.y(!this.q && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (!this.q && z3) {
            z2 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    public void M(boolean z) {
        if (z && !this.d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.z = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    public void N(boolean z) {
        this.f.m(z);
    }

    public final boolean O() {
        return dq7.U(this.e);
    }

    public final void P() {
        if (this.v) {
            return;
        }
        this.v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        Q(false);
    }

    public final void Q(boolean z) {
        if (B(this.t, this.u, this.v)) {
            if (this.w) {
                return;
            }
            this.w = true;
            E(z);
            return;
        }
        if (this.w) {
            this.w = false;
            D(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.u) {
            this.u = false;
            Q(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        mr7 mr7Var = this.x;
        if (mr7Var != null) {
            mr7Var.a();
            this.x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i) {
        this.r = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z) {
        this.s = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        if (this.u) {
            return;
        }
        this.u = true;
        Q(true);
    }

    @Override // com.zepto.t5
    public boolean h() {
        ve1 ve1Var = this.f;
        if (ve1Var == null || !ve1Var.n()) {
            return false;
        }
        this.f.collapseActionView();
        return true;
    }

    @Override // com.zepto.t5
    public void i(boolean z) {
        if (z == this.o) {
            return;
        }
        this.o = z;
        if (this.p.size() <= 0) {
            return;
        }
        wb0.a(this.p.get(0));
        throw null;
    }

    @Override // com.zepto.t5
    public int j() {
        return this.f.p();
    }

    @Override // com.zepto.t5
    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(zy4.e, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // com.zepto.t5
    public void m(Configuration configuration) {
        L(x5.b(this.a).e());
    }

    @Override // com.zepto.t5
    public boolean o(int i, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i, keyEvent, 0);
    }

    @Override // com.zepto.t5
    public void r(boolean z) {
        if (this.k) {
            return;
        }
        s(z);
    }

    @Override // com.zepto.t5
    public void s(boolean z) {
        J(z ? 4 : 0, 4);
    }

    @Override // com.zepto.t5
    public void t(boolean z) {
        J(z ? 8 : 0, 8);
    }

    @Override // com.zepto.t5
    public void u(int i) {
        this.f.s(i);
    }

    @Override // com.zepto.t5
    public void v(Drawable drawable) {
        this.f.x(drawable);
    }

    @Override // com.zepto.t5
    public void w(boolean z) {
        mr7 mr7Var;
        this.y = z;
        if (z || (mr7Var = this.x) == null) {
            return;
        }
        mr7Var.a();
    }

    @Override // com.zepto.t5
    public void x(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // com.zepto.t5
    public void y(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // com.zepto.t5
    public z5 z(z5.a aVar) {
        d dVar = this.l;
        if (dVar != null) {
            dVar.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        d dVar2 = new d(this.g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.l = dVar2;
        dVar2.k();
        this.g.h(dVar2);
        A(true);
        return dVar2;
    }

    public av7(Dialog dialog) {
        I(dialog.getWindow().getDecorView());
    }
}
