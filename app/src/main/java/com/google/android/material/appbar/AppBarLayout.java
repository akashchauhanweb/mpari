package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.zepto.br3;
import com.zepto.cg4;
import com.zepto.dq7;
import com.zepto.er3;
import com.zepto.g15;
import com.zepto.gx3;
import com.zepto.if6;
import com.zepto.jz4;
import com.zepto.l05;
import com.zepto.lf4;
import com.zepto.m15;
import com.zepto.nl2;
import com.zepto.o34;
import com.zepto.ol2;
import com.zepto.os7;
import com.zepto.qv7;
import com.zepto.r3;
import com.zepto.rp;
import com.zepto.sq3;
import com.zepto.tr;
import com.zepto.tw1;
import com.zepto.u3;
import com.zepto.vq3;
import com.zepto.wb0;
import com.zepto.wq3;
import com.zepto.x2;
import com.zepto.xq3;
import com.zepto.xy4;
import com.zepto.yw1;
import com.zepto.z1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int z = g15.e;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public qv7 g;
    public List h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public WeakReference n;
    public final boolean o;
    public ValueAnimator p;
    public ValueAnimator.AnimatorUpdateListener q;
    public final List r;
    public final long s;
    public final TimeInterpolator t;
    public int[] u;
    public Drawable v;
    public Integer w;
    public final float x;
    public Behavior y;

    public static class BaseBehavior<T extends AppBarLayout> extends nl2 {
        public int k;
        public int l;
        public ValueAnimator m;
        public e n;
        public WeakReference o;
        public boolean p;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b extends x2 {
            public b() {
            }

            @Override // com.zepto.x2
            public void g(View view, r3 r3Var) {
                super.g(view, r3Var);
                r3Var.n0(BaseBehavior.this.p);
                r3Var.U(ScrollView.class.getName());
            }
        }

        public class c implements u3 {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;
            public final /* synthetic */ View c;
            public final /* synthetic */ int d;

            public c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
                this.c = view;
                this.d = i;
            }

            @Override // com.zepto.u3
            public boolean a(View view, u3.a aVar) {
                BaseBehavior.this.u(this.a, this.b, this.c, 0, this.d, new int[]{0, 0}, 1);
                return true;
            }
        }

        public class d implements u3 {
            public final /* synthetic */ AppBarLayout a;
            public final /* synthetic */ boolean b;

            public d(AppBarLayout appBarLayout, boolean z) {
                this.a = appBarLayout;
                this.b = z;
            }

            @Override // com.zepto.u3
            public boolean a(View view, u3.a aVar) {
                this.a.setExpanded(this.b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        public static boolean e0(int i, int i2) {
            return (i & i2) == i2;
        }

        public static View h0(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iQ = Q() - topInset;
            int iI0 = i0(appBarLayout, iQ);
            if (iI0 >= 0) {
                View childAt = appBarLayout.getChildAt(iI0);
                d dVar = (d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iC2 = -childAt.getBottom();
                    if (iI0 == 0 && dq7.y(appBarLayout) && dq7.y(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (e0(iC, 2)) {
                        iC2 += dq7.C(childAt);
                    } else if (e0(iC, 5)) {
                        int iC3 = dq7.C(childAt) + iC2;
                        if (iQ < iC3) {
                            topInset2 = iC3;
                        } else {
                            iC2 = iC3;
                        }
                    }
                    if (e0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        iC2 -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    Z(coordinatorLayout, appBarLayout, er3.b(b0(iQ, iC2, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View viewJ0;
            dq7.k0(coordinatorLayout, r3.a.q.b());
            dq7.k0(coordinatorLayout, r3.a.r.b());
            if (appBarLayout.getTotalScrollRange() == 0 || (viewJ0 = j0(coordinatorLayout)) == null || !f0(appBarLayout)) {
                return;
            }
            if (!dq7.O(coordinatorLayout)) {
                dq7.q0(coordinatorLayout, new b());
            }
            this.p = X(coordinatorLayout, appBarLayout, viewJ0);
        }

        public final void C0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View viewH0 = h0(appBarLayout, i);
            boolean zB = false;
            if (viewH0 != null) {
                int iC = ((d) viewH0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iC2 = dq7.C(viewH0);
                    if (i2 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i) < (viewH0.getBottom() - iC2) - appBarLayout.getTopInset()) : (-i) >= (viewH0.getBottom() - iC2) - appBarLayout.getTopInset()) {
                        zB = true;
                    }
                }
            }
            if (appBarLayout.o()) {
                zB = appBarLayout.B(g0(coordinatorLayout));
            }
            boolean zY = appBarLayout.y(zB);
            if (z || (zY && z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.zepto.nl2
        public int Q() {
            return I() + this.k;
        }

        public final boolean X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            boolean z = false;
            if (Q() != (-appBarLayout.getTotalScrollRange())) {
                Y(coordinatorLayout, appBarLayout, r3.a.q, false);
                z = true;
            }
            if (Q() != 0) {
                if (!view.canScrollVertically(-1)) {
                    Y(coordinatorLayout, appBarLayout, r3.a.r, true);
                    return true;
                }
                int i = -appBarLayout.getDownNestedPreScrollRange();
                if (i != 0) {
                    dq7.m0(coordinatorLayout, r3.a.r, null, new c(coordinatorLayout, appBarLayout, view, i));
                    return true;
                }
            }
            return z;
        }

        public final void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, r3.a aVar, boolean z) {
            dq7.m0(coordinatorLayout, aVar, null, new d(appBarLayout, z));
        }

        public final void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int iAbs = Math.abs(Q() - i);
            float fAbs = Math.abs(f);
            a0(coordinatorLayout, appBarLayout, i, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        public final void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            int iQ = Q();
            if (iQ == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(rp.e);
                this.m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration(Math.min(i2, 600));
            this.m.setIntValues(iQ, i);
            this.m.start();
        }

        public final int b0(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        @Override // com.zepto.nl2
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        public final boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((d) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    return true;
                }
            }
            return false;
        }

        public final View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof o34) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int i0(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (e0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        public final View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.zepto.nl2
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        @Override // com.zepto.nl2
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        public final int m0(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i2);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorD = dVar.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i2++;
                } else if (interpolatorD != null) {
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= dq7.C(childAt);
                        }
                    }
                    if (dq7.y(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f = topInset;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        @Override // com.zepto.nl2
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.o()) {
                appBarLayout.y(appBarLayout.B(g0(coordinatorLayout)));
            }
        }

        @Override // com.zepto.er7, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean zP = super.p(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            e eVar = this.n;
            if (eVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            Z(coordinatorLayout, appBarLayout, i2, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (eVar.f) {
                T(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (eVar.g) {
                T(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(eVar.h);
                T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.n.j ? dq7.C(childAt) + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.n.i)));
            }
            appBarLayout.u();
            this.n = null;
            K(er3.b(I(), -appBarLayout.getTotalScrollRange(), 0));
            C0(coordinatorLayout, appBarLayout, I(), 0, true);
            appBarLayout.s(I());
            B0(coordinatorLayout, appBarLayout);
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.J(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int downNestedPreScrollRange;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i5 = i4;
                int i6 = downNestedPreScrollRange;
                if (i5 != i6) {
                    iArr[1] = S(coordinatorLayout, appBarLayout, i2, i5, i6);
                }
            }
            if (appBarLayout.o()) {
                appBarLayout.y(appBarLayout.B(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = S(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                B0(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof e) {
                w0((e) parcelable, true);
                super.B(coordinatorLayout, appBarLayout, this.n.c());
            } else {
                super.B(coordinatorLayout, appBarLayout, parcelable);
                this.n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableC = super.C(coordinatorLayout, appBarLayout);
            e eVarX0 = x0(parcelableC, appBarLayout);
            return eVarX0 == null ? parcelableC : eVarX0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (appBarLayout.o() || d0(coordinatorLayout, appBarLayout, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.o = null;
            this.l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.l == 0 || i == 1) {
                A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.o()) {
                    appBarLayout.y(appBarLayout.B(view));
                }
            }
            this.o = new WeakReference(view);
        }

        public void w0(e eVar, boolean z) {
            if (this.n == null || z) {
                this.n = eVar;
            }
        }

        public e x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int I = I();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = z1.e;
                    }
                    e eVar = new e(parcelable);
                    boolean z = I == 0;
                    eVar.g = z;
                    eVar.f = !z && (-I) >= appBarLayout.getTotalScrollRange();
                    eVar.h = i;
                    eVar.j = bottom == dq7.C(childAt) + appBarLayout.getTopInset();
                    eVar.i = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return null;
        }

        @Override // com.zepto.nl2
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int iQ = Q();
            int i4 = 0;
            if (i2 == 0 || iQ < i2 || iQ > i3) {
                this.k = 0;
            } else {
                int iB = er3.b(i, i2, i3);
                if (iQ != iB) {
                    int iM0 = appBarLayout.i() ? m0(appBarLayout, iB) : iB;
                    boolean zK = K(iM0);
                    int i5 = iQ - iB;
                    this.k = iB - iM0;
                    if (zK) {
                        while (i4 < appBarLayout.getChildCount()) {
                            d dVar = (d) appBarLayout.getChildAt(i4).getLayoutParams();
                            b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(appBarLayout, appBarLayout.getChildAt(i4), I());
                            }
                            i4++;
                        }
                    }
                    if (!zK && appBarLayout.i()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.s(I());
                    C0(coordinatorLayout, appBarLayout, iB, iB < iQ ? -1 : 1, false);
                    i4 = i5;
                }
            }
            B0(coordinatorLayout, appBarLayout);
            return i4;
        }

        public final boolean z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listS = coordinatorLayout.s(appBarLayout);
            int size = listS.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) ((View) listS.get(i)).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).O() != 0;
                }
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class e extends z1 {
            public static final Parcelable.Creator<e> CREATOR = new a();
            public boolean f;
            public boolean g;
            public int h;
            public float i;
            public boolean j;

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
                this.f = parcel.readByte() != 0;
                this.g = parcel.readByte() != 0;
                this.h = parcel.readInt();
                this.i = parcel.readFloat();
                this.j = parcel.readByte() != 0;
            }

            @Override // com.zepto.z1, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.h);
                parcel.writeFloat(this.i);
                parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.zepto.nl2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.zepto.er7
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // com.zepto.er7
        public /* bridge */ /* synthetic */ boolean K(int i) {
            return super.K(i);
        }

        @Override // com.zepto.nl2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.p(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.q(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.u(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.G(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends ol2 {
        public ScrollingViewBehavior() {
        }

        public static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).Q();
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutL = L(coordinatorLayout.r(view));
            if (appBarLayoutL != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutL.v(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.zepto.ol2
        public float N(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iV = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iV > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iV / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.zepto.ol2
        public int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        @Override // com.zepto.ol2
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void W(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                dq7.b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).k) + Q()) - M(view2));
            }
        }

        public final void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.y(appBarLayout.B(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                dq7.k0(coordinatorLayout, r3.a.q.b());
                dq7.k0(coordinatorLayout, r3.a.r.b());
                dq7.q0(coordinatorLayout, null);
            }
        }

        @Override // com.zepto.er7, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.p(coordinatorLayout, view, i);
        }

        @Override // com.zepto.ol2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.q(coordinatorLayout, view, i, i2, i3, i4);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.y5);
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(m15.z5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements cg4 {
        public a() {
        }

        @Override // com.zepto.cg4
        public qv7 a(View view, qv7 qv7Var) {
            return AppBarLayout.this.t(qv7Var);
        }
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f);
    }

    public static class c extends b {
        public final Rect a = new Rect();
        public final Rect b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, View view, float f) {
            b(this.a, appBarLayout, view);
            float fAbs = this.a.top - Math.abs(f);
            if (fAbs > 0.0f) {
                dq7.x0(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float fA = 1.0f - er3.a(Math.abs(fAbs / this.a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.b);
            this.b.offset(0, (int) (-fHeight));
            dq7.x0(view, this.b);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.a);
    }

    public final boolean A() {
        return this.v != null && getTopInset() > 0;
    }

    public boolean B(View view) {
        View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean C() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || dq7.y(childAt)) ? false : true;
    }

    public final void D(float f, float f2) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.s);
        this.p.setInterpolator(this.t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.q;
        if (animatorUpdateListener != null) {
            this.p.addUpdateListener(animatorUpdateListener);
        }
        this.p.start();
    }

    public final void E() {
        setWillNotDraw(!A());
    }

    public final void c() {
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final Integer d() {
        Drawable drawable = this.v;
        if (drawable instanceof wq3) {
            return Integer.valueOf(((wq3) drawable).A());
        }
        ColorStateList colorStateListF = yw1.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (A()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.v.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final View e(View view) {
        int i;
        if (this.n == null && (i = this.m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (viewFindViewById != null) {
                this.n = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.y = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int iC;
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = dVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i3 & 8) != 0) {
                        iC = dq7.C(childAt);
                    } else if ((i3 & 2) != 0) {
                        iC = measuredHeight - dq7.C(childAt);
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && dq7.y(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + iC;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int iC = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i3 = dVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                iC += measuredHeight;
                if ((i3 & 2) != 0) {
                    iC -= dq7.C(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, iC);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public wq3 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof wq3) {
            return (wq3) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iC = dq7.C(this);
        if (iC == 0) {
            int childCount = getChildCount();
            iC = childCount >= 1 ? dq7.C(getChildAt(childCount - 1)) : 0;
            if (iC == 0) {
                return getHeight() / 3;
            }
        }
        return (iC * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        qv7 qv7Var = this.g;
        if (qv7Var != null) {
            return qv7Var.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int iC = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = dVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                iC += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i2 == 0 && dq7.y(childAt)) {
                    iC -= getTopInset();
                }
                if ((i3 & 2) != 0) {
                    iC -= dq7.C(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, iC);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public boolean i() {
        return this.e;
    }

    public final boolean j() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((d) getChildAt(i).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        return getTotalScrollRange() != 0;
    }

    public final void l(final wq3 wq3Var, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer numF = sq3.f(getContext(), xy4.m);
        this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.kq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.q(colorStateList, colorStateList2, wq3Var, numF, valueAnimator);
            }
        };
        dq7.u0(this, wq3Var);
    }

    public final void m(Context context, final wq3 wq3Var) {
        wq3Var.M(context);
        this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.lq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.r(wq3Var, valueAnimator);
            }
        };
        dq7.u0(this, wq3Var);
    }

    public final void n() {
        Behavior behavior = this.y;
        BaseBehavior.e eVarX0 = (behavior == null || this.b == -1 || this.f != 0) ? null : behavior.x0(z1.e, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (eVarX0 != null) {
            this.y.w0(eVarX0, false);
        }
    }

    public boolean o() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xq3.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.u == null) {
            this.u = new int[4];
        }
        int[] iArr = this.u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z2 = this.j;
        int i2 = xy4.a0;
        if (!z2) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z2 && this.k) ? xy4.b0 : -xy4.b0;
        int i3 = xy4.W;
        if (!z2) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z2 && this.k) ? xy4.V : -xy4.V;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        boolean z3 = true;
        if (dq7.y(this) && C()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                dq7.b0(getChildAt(childCount), topInset);
            }
        }
        n();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i5).getLayoutParams()).d() != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.l && !j()) {
            z3 = false;
        }
        x(z3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && dq7.y(this) && C()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = er3.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    public final boolean p() {
        return getBackground() instanceof wq3;
    }

    public final /* synthetic */ void q(ColorStateList colorStateList, ColorStateList colorStateList2, wq3 wq3Var, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int iJ = sq3.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        wq3Var.W(ColorStateList.valueOf(iJ));
        if (this.v != null && (num2 = this.w) != null && num2.equals(num)) {
            tw1.n(this.v, iJ);
        }
        if (this.r.isEmpty()) {
            return;
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            wb0.a(it.next());
            if (wq3Var.x() != null) {
                throw null;
            }
        }
    }

    public final /* synthetic */ void r(wq3 wq3Var, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wq3Var.V(fFloatValue);
        Drawable drawable = this.v;
        if (drawable instanceof wq3) {
            ((wq3) drawable).V(fFloatValue);
        }
        Iterator it = this.r.iterator();
        if (it.hasNext()) {
            wb0.a(it.next());
            wq3Var.A();
            throw null;
        }
    }

    public void s(int i) {
        this.a = i;
        if (!willNotDraw()) {
            dq7.h0(this);
        }
        List list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                wb0.a(this.h.get(i2));
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        xq3.d(this, f);
    }

    public void setExpanded(boolean z2) {
        v(z2, dq7.U(this));
    }

    public void setLiftOnScroll(boolean z2) {
        this.l = z2;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.m = -1;
        if (view == null) {
            c();
        } else {
            this.n = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.m = i;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.v = drawable != null ? drawable.mutate() : null;
            this.w = d();
            Drawable drawable3 = this.v;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                tw1.m(this.v, dq7.B(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            E();
            dq7.h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(tr.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        os7.b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    public qv7 t(qv7 qv7Var) {
        qv7 qv7Var2 = dq7.y(this) ? qv7Var : null;
        if (!lf4.a(this.g, qv7Var2)) {
            this.g = qv7Var2;
            E();
            requestLayout();
        }
        return qv7Var;
    }

    public void u() {
        this.f = 0;
    }

    public void v(boolean z2, boolean z3) {
        w(z2, z3, true);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    public final void w(boolean z2, boolean z3, boolean z4) {
        this.f = (z2 ? 1 : 2) | (z3 ? 4 : 0) | (z4 ? 8 : 0);
        requestLayout();
    }

    public final boolean x(boolean z2) {
        if (this.j == z2) {
            return false;
        }
        this.j = z2;
        refreshDrawableState();
        return true;
    }

    public boolean y(boolean z2) {
        return z(z2, !this.i);
    }

    public boolean z(boolean z2, boolean z3) {
        if (!z3 || this.k == z2) {
            return false;
        }
        this.k = z2;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        if (this.o) {
            D(z2 ? 0.0f : 1.0f, z2 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.l) {
            return true;
        }
        D(z2 ? 0.0f : this.x, z2 ? this.x : 0.0f);
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = z;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            os7.a(this);
        }
        os7.c(this, attributeSet, i, i2);
        TypedArray typedArrayI = if6.i(context2, attributeSet, m15.k, i, i2, new int[0]);
        dq7.u0(this, typedArrayI.getDrawable(m15.l));
        ColorStateList colorStateListA = vq3.a(context2, typedArrayI, m15.r);
        this.o = colorStateListA != null;
        ColorStateList colorStateListF = yw1.f(getBackground());
        if (colorStateListF != null) {
            wq3 wq3Var = new wq3();
            wq3Var.W(colorStateListF);
            if (colorStateListA != null) {
                l(wq3Var, colorStateListF, colorStateListA);
            } else {
                m(context2, wq3Var);
            }
        }
        this.s = gx3.f(context2, xy4.D, getResources().getInteger(l05.a));
        this.t = gx3.g(context2, xy4.O, rp.a);
        int i3 = m15.p;
        if (typedArrayI.hasValue(i3)) {
            w(typedArrayI.getBoolean(i3, false), false, false);
        }
        if (typedArrayI.hasValue(m15.o)) {
            os7.b(this, typedArrayI.getDimensionPixelSize(r12, 0));
        }
        int i4 = m15.n;
        if (typedArrayI.hasValue(i4)) {
            setKeyboardNavigationCluster(typedArrayI.getBoolean(i4, false));
        }
        int i5 = m15.m;
        if (typedArrayI.hasValue(i5)) {
            setTouchscreenBlocksFocus(typedArrayI.getBoolean(i5, false));
        }
        this.x = getResources().getDimension(jz4.a);
        this.l = typedArrayI.getBoolean(m15.q, false);
        this.m = typedArrayI.getResourceId(m15.s, -1);
        setStatusBarForeground(typedArrayI.getDrawable(m15.t));
        typedArrayI.recycle();
        dq7.E0(this, new a());
    }

    public static class d extends LinearLayout.LayoutParams {
        public int a;
        public b b;
        public Interpolator c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.v);
            this.a = typedArrayObtainStyledAttributes.getInt(m15.x, 0);
            f(typedArrayObtainStyledAttributes.getInt(m15.w, 0));
            int i = m15.y;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final b a(int i) {
            if (i != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public Interpolator d() {
            return this.c;
        }

        public boolean e() {
            int i = this.a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public void f(int i) {
            this.b = a(i);
        }

        public d(int i, int i2) {
            super(i, i2);
            this.a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
