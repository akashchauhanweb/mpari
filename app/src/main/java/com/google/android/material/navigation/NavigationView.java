package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.drawerlayout.widget.DrawerLayout;
import com.zepto.br3;
import com.zepto.bz0;
import com.zepto.dq7;
import com.zepto.dx1;
import com.zepto.e06;
import com.zepto.g15;
import com.zepto.g96;
import com.zepto.gb0;
import com.zepto.ge5;
import com.zepto.i06;
import com.zepto.if6;
import com.zepto.iq3;
import com.zepto.jk2;
import com.zepto.jq3;
import com.zepto.lg6;
import com.zepto.m15;
import com.zepto.n30;
import com.zepto.qp5;
import com.zepto.qv7;
import com.zepto.tr;
import com.zepto.vq3;
import com.zepto.wq3;
import com.zepto.ww7;
import com.zepto.xq3;
import com.zepto.xy4;
import com.zepto.y24;
import com.zepto.yq3;
import com.zepto.yw1;
import com.zepto.yy0;
import com.zepto.z1;
import com.zepto.z24;
import com.zepto.zy4;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends qp5 implements iq3 {
    public static final int[] v = {R.attr.state_checked};
    public static final int[] w = {-16842910};
    public static final int x = g15.h;
    public final y24 h;
    public final z24 i;
    public d j;
    public final int k;
    public final int[] l;
    public MenuInflater m;
    public ViewTreeObserver.OnGlobalLayoutListener n;
    public boolean o;
    public boolean p;
    public int q;
    public final i06 r;
    public final yq3 s;
    public final jq3 t;
    public final DrawerLayout.e u;

    public class a extends DrawerLayout.h {
        public a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final jq3 jq3Var = navigationView.t;
                Objects.requireNonNull(jq3Var);
                view.post(new Runnable() { // from class: com.zepto.e34
                    @Override // java.lang.Runnable
                    public final void run() {
                        jq3Var.e();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.t.f();
            }
        }
    }

    public class b implements e.a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            d dVar = NavigationView.this.j;
            return dVar != null && dVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.l);
            boolean z = true;
            boolean z2 = NavigationView.this.l[1] == 0;
            NavigationView.this.i.F(z2);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z2 && navigationView2.r());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.l[0] == 0 || NavigationView.this.l[0] + NavigationView.this.getWidth() == 0);
            Activity activityA = bz0.a(NavigationView.this.getContext());
            if (activityA != null) {
                Rect rectA = ww7.a(activityA);
                boolean z3 = rectA.height() - NavigationView.this.getHeight() == NavigationView.this.l[1];
                boolean z4 = Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z3 && z4 && navigationView3.q());
                if (rectA.width() != NavigationView.this.l[0] && rectA.width() - NavigationView.this.getWidth() != NavigationView.this.l[0]) {
                    z = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z);
            }
        }
    }

    public interface d {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.P);
    }

    private MenuInflater getMenuInflater() {
        if (this.m == null) {
            this.m = new g96(getContext());
        }
        return this.m;
    }

    @Override // com.zepto.iq3
    public void a(n30 n30Var) {
        u();
        this.s.j(n30Var);
    }

    @Override // com.zepto.iq3
    public void b() {
        Pair pairU = u();
        DrawerLayout drawerLayout = (DrawerLayout) pairU.first;
        n30 n30VarC = this.s.c();
        if (n30VarC == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.g(this);
            return;
        }
        this.s.h(n30VarC, ((DrawerLayout.f) pairU.second).a, dx1.b(drawerLayout, this), dx1.c(drawerLayout));
    }

    @Override // com.zepto.iq3
    public void c(n30 n30Var) {
        this.s.l(n30Var, ((DrawerLayout.f) u().second).a);
    }

    @Override // com.zepto.iq3
    public void d() {
        u();
        this.s.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.r.d(canvas, new gb0.a() { // from class: com.zepto.d34
            @Override // com.zepto.gb0.a
            public final void a(Canvas canvas2) {
                this.a.s(canvas2);
            }
        });
    }

    @Override // com.zepto.qp5
    public void e(qv7 qv7Var) {
        this.i.h(qv7Var);
    }

    public yq3 getBackHelper() {
        return this.s;
    }

    public MenuItem getCheckedItem() {
        return this.i.o();
    }

    public int getDividerInsetEnd() {
        return this.i.p();
    }

    public int getDividerInsetStart() {
        return this.i.q();
    }

    public int getHeaderCount() {
        return this.i.r();
    }

    public Drawable getItemBackground() {
        return this.i.t();
    }

    public int getItemHorizontalPadding() {
        return this.i.u();
    }

    public int getItemIconPadding() {
        return this.i.v();
    }

    public ColorStateList getItemIconTintList() {
        return this.i.y();
    }

    public int getItemMaxLines() {
        return this.i.w();
    }

    public ColorStateList getItemTextColor() {
        return this.i.x();
    }

    public int getItemVerticalPadding() {
        return this.i.z();
    }

    public Menu getMenu() {
        return this.h;
    }

    public int getSubheaderInsetEnd() {
        return this.i.B();
    }

    public int getSubheaderInsetStart() {
        return this.i.C();
    }

    public final ColorStateList j(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = tr.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(zy4.w, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = w;
        return new ColorStateList(new int[][]{iArr, v, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public final Drawable k(lg6 lg6Var) {
        return l(lg6Var, vq3.b(getContext(), lg6Var, m15.W4));
    }

    public final Drawable l(lg6 lg6Var, ColorStateList colorStateList) {
        wq3 wq3Var = new wq3(e06.b(getContext(), lg6Var.n(m15.U4, 0), lg6Var.n(m15.V4, 0)).m());
        wq3Var.W(colorStateList);
        return new InsetDrawable((Drawable) wq3Var, lg6Var.f(m15.Z4, 0), lg6Var.f(m15.a5, 0), lg6Var.f(m15.Y4, 0), lg6Var.f(m15.X4, 0));
    }

    public View m(int i) {
        return this.i.s(i);
    }

    public final boolean n(lg6 lg6Var) {
        return lg6Var.s(m15.U4) || lg6Var.s(m15.V4);
    }

    public View o(int i) {
        return this.i.E(i);
    }

    @Override // com.zepto.qp5, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xq3.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.t.b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.N(this.u);
            drawerLayout.b(this.u);
            if (drawerLayout.D(this)) {
                this.t.e();
            }
        }
    }

    @Override // com.zepto.qp5, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).N(this.u);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.k), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.k, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.c());
        this.h.S(eVar.f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.f = bundle;
        this.h.U(bundle);
        return eVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        t(i, i2);
    }

    public void p(int i) {
        this.i.a0(true);
        getMenuInflater().inflate(i, this.h);
        this.i.a0(false);
        this.i.i(false);
    }

    public boolean q() {
        return this.p;
    }

    public boolean r() {
        return this.o;
    }

    public final /* synthetic */ void s(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.p = z;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.h.findItem(i);
        if (menuItemFindItem != null) {
            this.i.G((g) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        this.i.H(i);
    }

    public void setDividerInsetStart(int i) {
        this.i.I(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        xq3.d(this, f);
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.r.g(this, z);
    }

    public void setItemBackground(Drawable drawable) {
        this.i.K(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(yy0.e(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.i.M(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.i.M(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.i.N(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.i.N(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.i.O(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.i.P(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.i.Q(i);
    }

    public void setItemTextAppearance(int i) {
        this.i.R(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.i.S(z);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.i.T(colorStateList);
    }

    public void setItemVerticalPadding(int i) {
        this.i.U(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.i.U(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(d dVar) {
        this.j = dVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        z24 z24Var = this.i;
        if (z24Var != null) {
            z24Var.V(i);
        }
    }

    public void setSubheaderInsetEnd(int i) {
        this.i.X(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.i.Y(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.o = z;
    }

    public final void t(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.f) && this.q > 0 && (getBackground() instanceof wq3)) {
            boolean z = jk2.b(((DrawerLayout.f) getLayoutParams()).a, dq7.B(this)) == 3;
            wq3 wq3Var = (wq3) getBackground();
            e06.b bVarO = wq3Var.D().v().o(this.q);
            if (z) {
                bVarO.A(0.0f);
                bVarO.s(0.0f);
            } else {
                bVarO.E(0.0f);
                bVarO.w(0.0f);
            }
            e06 e06VarM = bVarO.m();
            wq3Var.setShapeAppearanceModel(e06VarM);
            this.r.f(this, e06VarM);
            this.r.e(this, new RectF(0.0f, 0.0f, i, i2));
            this.r.h(this, true);
        }
    }

    public final Pair u() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.f)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.f) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public final void v() {
        this.n = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.n);
    }

    public static class e extends z1 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public Bundle f;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readBundle(classLoader);
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4 = x;
        super(br3.c(context, attributeSet, i, i4), attributeSet, i);
        z24 z24Var = new z24();
        this.i = z24Var;
        this.l = new int[2];
        this.o = true;
        this.p = true;
        this.q = 0;
        this.r = i06.a(this);
        this.s = new yq3(this);
        this.t = new jq3(this);
        this.u = new a();
        Context context2 = getContext();
        y24 y24Var = new y24(context2);
        this.h = y24Var;
        lg6 lg6VarJ = if6.j(context2, attributeSet, m15.D4, i, i4, new int[0]);
        int i5 = m15.E4;
        if (lg6VarJ.s(i5)) {
            dq7.u0(this, lg6VarJ.g(i5));
        }
        this.q = lg6VarJ.f(m15.K4, 0);
        Drawable background = getBackground();
        ColorStateList colorStateListF = yw1.f(background);
        if (background == null || colorStateListF != null) {
            wq3 wq3Var = new wq3(e06.e(context2, attributeSet, i, i4).m());
            if (colorStateListF != null) {
                wq3Var.W(colorStateListF);
            }
            wq3Var.M(context2);
            dq7.u0(this, wq3Var);
        }
        if (lg6VarJ.s(m15.L4)) {
            setElevation(lg6VarJ.f(r2, 0));
        }
        setFitsSystemWindows(lg6VarJ.a(m15.F4, false));
        this.k = lg6VarJ.f(m15.G4, 0);
        int i6 = m15.g5;
        ColorStateList colorStateListC = lg6VarJ.s(i6) ? lg6VarJ.c(i6) : null;
        int i7 = m15.j5;
        int iN = lg6VarJ.s(i7) ? lg6VarJ.n(i7, 0) : 0;
        if (iN == 0 && colorStateListC == null) {
            colorStateListC = j(R.attr.textColorSecondary);
        }
        int i8 = m15.R4;
        ColorStateList colorStateListC2 = lg6VarJ.s(i8) ? lg6VarJ.c(i8) : j(R.attr.textColorSecondary);
        int i9 = m15.b5;
        int iN2 = lg6VarJ.s(i9) ? lg6VarJ.n(i9, 0) : 0;
        boolean zA = lg6VarJ.a(m15.c5, true);
        int i10 = m15.Q4;
        if (lg6VarJ.s(i10)) {
            setItemIconSize(lg6VarJ.f(i10, 0));
        }
        int i11 = m15.d5;
        ColorStateList colorStateListC3 = lg6VarJ.s(i11) ? lg6VarJ.c(i11) : null;
        if (iN2 == 0 && colorStateListC3 == null) {
            colorStateListC3 = j(R.attr.textColorPrimary);
        }
        Drawable drawableG = lg6VarJ.g(m15.N4);
        if (drawableG == null && n(lg6VarJ)) {
            drawableG = k(lg6VarJ);
            ColorStateList colorStateListB = vq3.b(context2, lg6VarJ, m15.T4);
            if (colorStateListB != null) {
                z24Var.L(new RippleDrawable(ge5.a(colorStateListB), null, l(lg6VarJ, null)));
            }
        }
        int i12 = m15.O4;
        if (lg6VarJ.s(i12)) {
            i2 = 0;
            setItemHorizontalPadding(lg6VarJ.f(i12, 0));
        } else {
            i2 = 0;
        }
        int i13 = m15.e5;
        if (lg6VarJ.s(i13)) {
            setItemVerticalPadding(lg6VarJ.f(i13, i2));
        }
        setDividerInsetStart(lg6VarJ.f(m15.J4, i2));
        setDividerInsetEnd(lg6VarJ.f(m15.I4, i2));
        setSubheaderInsetStart(lg6VarJ.f(m15.i5, i2));
        setSubheaderInsetEnd(lg6VarJ.f(m15.h5, i2));
        setTopInsetScrimEnabled(lg6VarJ.a(m15.k5, this.o));
        setBottomInsetScrimEnabled(lg6VarJ.a(m15.H4, this.p));
        int iF = lg6VarJ.f(m15.P4, i2);
        setItemMaxLines(lg6VarJ.k(m15.S4, 1));
        y24Var.V(new b());
        z24Var.J(1);
        z24Var.e(context2, y24Var);
        if (iN != 0) {
            z24Var.Z(iN);
        }
        z24Var.W(colorStateListC);
        z24Var.P(colorStateListC2);
        z24Var.V(getOverScrollMode());
        if (iN2 != 0) {
            z24Var.R(iN2);
        }
        z24Var.S(zA);
        z24Var.T(colorStateListC3);
        z24Var.K(drawableG);
        z24Var.N(iF);
        y24Var.b(z24Var);
        addView((View) z24Var.A(this));
        int i14 = m15.f5;
        if (lg6VarJ.s(i14)) {
            i3 = 0;
            p(lg6VarJ.n(i14, 0));
        } else {
            i3 = 0;
        }
        int i15 = m15.M4;
        if (lg6VarJ.s(i15)) {
            o(lg6VarJ.n(i15, i3));
        }
        lg6VarJ.w();
        v();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.i.G((g) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
