package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.zepto.b15;
import com.zepto.dq7;
import com.zepto.e06;
import com.zepto.ee5;
import com.zepto.er3;
import com.zepto.g15;
import com.zepto.i16;
import com.zepto.iq3;
import com.zepto.j16;
import com.zepto.jk2;
import com.zepto.m15;
import com.zepto.n30;
import com.zepto.oq7;
import com.zepto.pe3;
import com.zepto.r3;
import com.zepto.rp;
import com.zepto.u3;
import com.zepto.vq3;
import com.zepto.wb0;
import com.zepto.wq3;
import com.zepto.yq3;
import com.zepto.z1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c implements iq3 {
    public i16 a;
    public float b;
    public wq3 c;
    public ColorStateList d;
    public e06 e;
    public final d f;
    public float g;
    public boolean h;
    public int i;
    public int j;
    public oq7 k;
    public boolean l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public WeakReference r;
    public WeakReference s;
    public int t;
    public VelocityTracker u;
    public yq3 v;
    public int w;
    public final Set x;
    public final oq7.c y;
    public static final int z = b15.w;
    public static final int A = g15.l;

    public class a extends oq7.c {
        public a() {
        }

        @Override // com.zepto.oq7.c
        public int a(View view, int i, int i2) {
            return er3.b(i, SideSheetBehavior.this.a.g(), SideSheetBehavior.this.a.f());
        }

        @Override // com.zepto.oq7.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.zepto.oq7.c
        public int d(View view) {
            return SideSheetBehavior.this.n + SideSheetBehavior.this.k0();
        }

        @Override // com.zepto.oq7.c
        public void j(int i) {
            if (i == 1 && SideSheetBehavior.this.h) {
                SideSheetBehavior.this.J0(1);
            }
        }

        @Override // com.zepto.oq7.c
        public void k(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i);
        }

        @Override // com.zepto.oq7.c
        public void l(View view, float f, float f2) {
            int iW = SideSheetBehavior.this.W(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.O0(view, iW, sideSheetBehavior.N0());
        }

        @Override // com.zepto.oq7.c
        public boolean m(View view, int i) {
            return (SideSheetBehavior.this.i == 1 || SideSheetBehavior.this.r == null || SideSheetBehavior.this.r.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.J0(5);
            if (SideSheetBehavior.this.r == null || SideSheetBehavior.this.r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.r.get()).requestLayout();
        }
    }

    public class d {
        public int a;
        public boolean b;
        public final Runnable c = new Runnable() { // from class: com.zepto.w16
            @Override // java.lang.Runnable
            public final void run() {
                this.c.c();
            }
        };

        public d() {
        }

        public void b(int i) {
            if (SideSheetBehavior.this.r == null || SideSheetBehavior.this.r.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            dq7.i0((View) SideSheetBehavior.this.r.get(), this.c);
            this.b = true;
        }

        public final /* synthetic */ void c() {
            this.b = false;
            if (SideSheetBehavior.this.k != null && SideSheetBehavior.this.k.m(true)) {
                b(this.a);
            } else if (SideSheetBehavior.this.i == 2) {
                SideSheetBehavior.this.J0(this.a);
            }
        }
    }

    public SideSheetBehavior() {
        this.f = new d();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.t = -1;
        this.x = new LinkedHashSet();
        this.y = new a();
    }

    private void B0(View view, r3.a aVar, int i) {
        dq7.m0(view, aVar, null, Y(i));
    }

    private void D0(View view, Runnable runnable) {
        if (v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean K0() {
        return this.k != null && (this.h || this.i == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(View view, int i, boolean z2) {
        if (!w0(view, i, z2)) {
            J0(i);
        } else {
            J0(2);
            this.f.b(i);
        }
    }

    private void P0() {
        View view;
        WeakReference weakReference = this.r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        dq7.k0(view, 262144);
        dq7.k0(view, 1048576);
        if (this.i != 5) {
            B0(view, r3.a.y, 5);
        }
        if (this.i != 3) {
            B0(view, r3.a.w, 3);
        }
    }

    private u3 Y(final int i) {
        return new u3() { // from class: com.zepto.t16
            @Override // com.zepto.u3
            public final boolean a(View view, u3.a aVar) {
                return this.a.x0(i, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.e == null) {
            return;
        }
        wq3 wq3Var = new wq3(this.e);
        this.c = wq3Var;
        wq3Var.M(context);
        ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            this.c.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.c.setTint(typedValue.data);
    }

    private int c0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, IntCompanionObject.MIN_VALUE);
    }

    public final void A0(CoordinatorLayout coordinatorLayout) {
        int i;
        View viewFindViewById;
        if (this.s != null || (i = this.t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.s = new WeakReference(viewFindViewById);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.c() != null) {
            super.B(coordinatorLayout, view, cVar.c());
        }
        int i = cVar.f;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.i = i;
        this.j = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new c(super.C(coordinatorLayout, view), this);
    }

    public final void C0() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    public void E0(int i) {
        this.t = i;
        X();
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i == -1 || !dq7.U(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    public void F0(boolean z2) {
        this.h = z2;
    }

    public final void G0(int i) {
        i16 i16Var = this.a;
        if (i16Var == null || i16Var.j() != i) {
            if (i == 0) {
                this.a = new ee5(this);
                if (this.e == null || s0()) {
                    return;
                }
                e06.b bVarV = this.e.v();
                bVarV.E(0.0f).w(0.0f);
                R0(bVarV.m());
                return;
            }
            if (i == 1) {
                this.a = new pe3(this);
                if (this.e == null || r0()) {
                    return;
                }
                e06.b bVarV2 = this.e.v();
                bVarV2.A(0.0f).s(0.0f);
                R0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0 or 1.");
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.i == 1 && actionMasked == 0) {
            return true;
        }
        if (K0()) {
            this.k.F(motionEvent);
        }
        if (actionMasked == 0) {
            C0();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (K0() && actionMasked == 2 && !this.l && t0(motionEvent)) {
            this.k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.l;
    }

    public final void H0(View view, int i) {
        G0(jk2.b(((CoordinatorLayout.f) view.getLayoutParams()).c, i) == 3 ? 1 : 0);
    }

    public void I0(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.r;
        if (weakReference == null || weakReference.get() == null) {
            J0(i);
        } else {
            D0((View) this.r.get(), new Runnable() { // from class: com.zepto.v16
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.z0(i);
                }
            });
        }
    }

    public void J0(int i) {
        View view;
        if (this.i == i) {
            return;
        }
        this.i = i;
        if (i == 3 || i == 5) {
            this.j = i;
        }
        WeakReference weakReference = this.r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S0(view);
        Iterator it = this.x.iterator();
        if (it.hasNext()) {
            wb0.a(it.next());
            throw null;
        }
        P0();
    }

    public boolean L0(View view, float f) {
        return this.a.n(view, f);
    }

    public final boolean M0(View view) {
        return (view.isShown() || dq7.p(view) != null) && this.h;
    }

    public boolean N0() {
        return true;
    }

    public final void Q0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.r.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.a.o(marginLayoutParams, (int) ((this.n * view.getScaleX()) + this.q));
        viewF0.requestLayout();
    }

    public final void R0(e06 e06Var) {
        wq3 wq3Var = this.c;
        if (wq3Var != null) {
            wq3Var.setShapeAppearanceModel(e06Var);
        }
    }

    public final void S0(View view) {
        int i = this.i == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    public final int U(int i, View view) {
        int i2 = this.i;
        if (i2 == 1 || i2 == 2) {
            return i - this.a.h(view);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.i);
    }

    public final float V(float f, float f2) {
        return Math.abs(f - f2);
    }

    public final int W(View view, float f, float f2) {
        if (u0(f)) {
            return 3;
        }
        if (L0(view, f)) {
            if (!this.a.m(f, f2) && !this.a.l(view)) {
                return 3;
            }
        } else if (f == 0.0f || !j16.a(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - g0()) < Math.abs(left - this.a.e())) {
                return 3;
            }
        }
        return 5;
    }

    public final void X() {
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    @Override // com.zepto.iq3
    public void a(n30 n30Var) {
        yq3 yq3Var = this.v;
        if (yq3Var == null) {
            return;
        }
        yq3Var.j(n30Var);
    }

    public final void a0(View view, int i) {
        if (this.x.isEmpty()) {
            return;
        }
        this.a.b(i);
        Iterator it = this.x.iterator();
        if (it.hasNext()) {
            wb0.a(it.next());
            throw null;
        }
    }

    @Override // com.zepto.iq3
    public void b() {
        yq3 yq3Var = this.v;
        if (yq3Var == null) {
            return;
        }
        n30 n30VarC = yq3Var.c();
        if (n30VarC == null || Build.VERSION.SDK_INT < 34) {
            I0(5);
        } else {
            this.v.h(n30VarC, h0(), new b(), e0());
        }
    }

    public final void b0(View view) {
        if (dq7.p(view) == null) {
            dq7.t0(view, view.getResources().getString(z));
        }
    }

    @Override // com.zepto.iq3
    public void c(n30 n30Var) {
        yq3 yq3Var = this.v;
        if (yq3Var == null) {
            return;
        }
        yq3Var.l(n30Var, h0());
        Q0();
    }

    @Override // com.zepto.iq3
    public void d() {
        yq3 yq3Var = this.v;
        if (yq3Var == null) {
            return;
        }
        yq3Var.f();
    }

    public int d0() {
        return this.n;
    }

    public final ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.u16
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.y0(marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    public View f0() {
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.a.d();
    }

    public final int h0() {
        i16 i16Var = this.a;
        return (i16Var == null || i16Var.j() == 0) ? 5 : 3;
    }

    public float i0() {
        return this.m;
    }

    public float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.r = null;
        this.k = null;
        this.v = null;
    }

    public int k0() {
        return this.q;
    }

    public int l0(int i) {
        if (i == 3) {
            return g0();
        }
        if (i == 5) {
            return this.a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
    }

    public int m0() {
        return this.p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.r = null;
        this.k = null;
        this.v = null;
    }

    public int n0() {
        return this.o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        oq7 oq7Var;
        if (!M0(view)) {
            this.l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C0();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.l) {
            this.l = false;
            return false;
        }
        return (this.l || (oq7Var = this.k) == null || !oq7Var.P(motionEvent)) ? false : true;
    }

    public int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (dq7.y(coordinatorLayout) && !dq7.y(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.r == null) {
            this.r = new WeakReference(view);
            this.v = new yq3(view);
            wq3 wq3Var = this.c;
            if (wq3Var != null) {
                dq7.u0(view, wq3Var);
                wq3 wq3Var2 = this.c;
                float fW = this.g;
                if (fW == -1.0f) {
                    fW = dq7.w(view);
                }
                wq3Var2.V(fW);
            } else {
                ColorStateList colorStateList = this.d;
                if (colorStateList != null) {
                    dq7.v0(view, colorStateList);
                }
            }
            S0(view);
            P0();
            if (dq7.z(view) == 0) {
                dq7.B0(view, 1);
            }
            b0(view);
        }
        H0(view, i);
        if (this.k == null) {
            this.k = oq7.o(coordinatorLayout, this.y);
        }
        int iH = this.a.h(view);
        coordinatorLayout.I(view, i);
        this.o = coordinatorLayout.getWidth();
        this.p = this.a.i(coordinatorLayout);
        this.n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.q = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        dq7.a0(view, U(iH, view));
        A0(coordinatorLayout);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            wb0.a(it.next());
        }
        return true;
    }

    public oq7 p0() {
        return this.k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(c0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), c0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    public final CoordinatorLayout.f q0() {
        View view;
        WeakReference weakReference = this.r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    public final boolean r0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).leftMargin > 0;
    }

    public final boolean s0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).rightMargin > 0;
    }

    public final boolean t0(MotionEvent motionEvent) {
        return K0() && V((float) this.w, motionEvent.getX()) > ((float) this.k.z());
    }

    public final boolean u0(float f) {
        return this.a.k(f);
    }

    public final boolean v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && dq7.T(view);
    }

    public final boolean w0(View view, int i, boolean z2) {
        int iL0 = l0(i);
        oq7 oq7VarP0 = p0();
        return oq7VarP0 != null && (!z2 ? !oq7VarP0.Q(view, iL0, view.getTop()) : !oq7VarP0.O(iL0, view.getTop()));
    }

    public final /* synthetic */ boolean x0(int i, View view, u3.a aVar) {
        I0(i);
        return true;
    }

    public final /* synthetic */ void y0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        this.a.o(marginLayoutParams, rp.c(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    public final /* synthetic */ void z0(int i) {
        View view = (View) this.r.get();
        if (view != null) {
            O0(view, i, false);
        }
    }

    public static class c extends z1 {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public final int f;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readInt();
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
        }

        public c(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f = sideSheetBehavior.i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new d();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.t = -1;
        this.x = new LinkedHashSet();
        this.y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.O5);
        int i = m15.Q5;
        if (typedArrayObtainStyledAttributes.hasValue(i)) {
            this.d = vq3.a(context, typedArrayObtainStyledAttributes, i);
        }
        if (typedArrayObtainStyledAttributes.hasValue(m15.T5)) {
            this.e = e06.e(context, attributeSet, 0, A).m();
        }
        int i2 = m15.S5;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            E0(typedArrayObtainStyledAttributes.getResourceId(i2, -1));
        }
        Z(context);
        this.g = typedArrayObtainStyledAttributes.getDimension(m15.P5, -1.0f);
        F0(typedArrayObtainStyledAttributes.getBoolean(m15.R5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
