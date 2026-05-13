package com.google.android.material.bottomsheet;

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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.zepto.b15;
import com.zepto.dq7;
import com.zepto.e06;
import com.zepto.er3;
import com.zepto.g15;
import com.zepto.iq3;
import com.zepto.jz4;
import com.zepto.m15;
import com.zepto.mq3;
import com.zepto.n30;
import com.zepto.oq7;
import com.zepto.r3;
import com.zepto.u3;
import com.zepto.vq3;
import com.zepto.wq3;
import com.zepto.wz2;
import com.zepto.xy4;
import com.zepto.z1;
import com.zepto.zr7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c implements iq3 {
    public static final int i0 = g15.f;
    public boolean A;
    public final i B;
    public ValueAnimator C;
    public int D;
    public int E;
    public int F;
    public float G;
    public int H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public oq7 O;
    public boolean P;
    public int Q;
    public boolean R;
    public float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public WeakReference Y;
    public final ArrayList Z;
    public int a;
    public VelocityTracker a0;
    public boolean b;
    public mq3 b0;
    public boolean c;
    public int c0;
    public float d;
    public int d0;
    public int e;
    public boolean e0;
    public int f;
    public Map f0;
    public boolean g;
    public final SparseIntArray g0;
    public int h;
    public final oq7.c h0;
    public int i;
    public wq3 j;
    public ColorStateList k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public e06 z;

    public class a implements Runnable {
        public final /* synthetic */ View c;
        public final /* synthetic */ int e;

        public a(View view, int i) {
            this.c = view;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.f1(this.c, this.e, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.Y0(5);
            WeakReference weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.W.get()).requestLayout();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.X(fFloatValue);
            }
        }
    }

    public class d implements zr7.c {
        public final /* synthetic */ boolean a;

        public d(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
        @Override // com.zepto.zr7.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.zepto.qv7 a(android.view.View r11, com.zepto.qv7 r12, com.zepto.zr7.d r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, com.zepto.qv7, com.zepto.zr7$d):com.zepto.qv7");
        }
    }

    public class e extends oq7.c {
        public long a;

        public e() {
        }

        @Override // com.zepto.oq7.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // com.zepto.oq7.c
        public int b(View view, int i, int i2) {
            return er3.b(i, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // com.zepto.oq7.c
        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // com.zepto.oq7.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.Y0(1);
            }
        }

        @Override // com.zepto.oq7.c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.o0(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // com.zepto.oq7.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        @Override // com.zepto.oq7.c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.M;
            if (i2 == 1 || bottomSheetBehavior.e0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.c0 == i) {
                WeakReference weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.s0()) / 2;
        }
    }

    public class f implements u3 {
        public final /* synthetic */ int a;

        public f(int i) {
            this.a = i;
        }

        @Override // com.zepto.u3
        public boolean a(View view, u3.a aVar) {
            BottomSheetBehavior.this.X0(this.a);
            return true;
        }
    }

    public static abstract class g {
        public void a(View view) {
        }

        public abstract void b(View view, float f);

        public abstract void c(View view, int i);
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new i(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList();
        this.d0 = -1;
        this.g0 = new SparseIntArray();
        this.h0 = new e();
    }

    public static BottomSheetBehavior q0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public boolean A0() {
        return this.o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, view, hVar.c());
        I0(hVar);
        int i2 = hVar.f;
        if (i2 == 1 || i2 == 2) {
            this.M = 4;
            this.N = 4;
        } else {
            this.M = i2;
            this.N = i2;
        }
    }

    public boolean B0() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new h(super.C(coordinatorLayout, view), this);
    }

    public boolean C0() {
        return true;
    }

    public final boolean D0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && dq7.T(view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        this.Q = 0;
        this.R = false;
        return (i2 & 2) != 0;
    }

    public boolean E0() {
        return true;
    }

    public void F0(g gVar) {
        this.Z.remove(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.s0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Y0(r0)
            return
        Lf:
            boolean r3 = r2.E0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.x0()
            boolean r3 = r2.c1(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.d1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.f1(r4, r0, r3)
            r2.R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final void G0(View view, r3.a aVar, int i2) {
        dq7.m0(view, aVar, null, l0(i2));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (b1()) {
            this.O.F(motionEvent);
        }
        if (actionMasked == 0) {
            H0();
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (b1() && actionMasked == 2 && !this.P && Math.abs(this.d0 - motionEvent.getY()) > this.O.z()) {
            this.O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public final void H0() {
        this.c0 = -1;
        this.d0 = -1;
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.a0 = null;
        }
    }

    public final void I0(h hVar) {
        int i2 = this.a;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f = hVar.g;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.b = hVar.h;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.J = hVar.i;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.K = hVar.j;
        }
    }

    public final void J0(View view, Runnable runnable) {
        if (D0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void K0(boolean z) {
        this.L = z;
    }

    public void L0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i2;
        i1(this.M, true);
    }

    public void M0(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.W != null) {
            d0();
        }
        Y0((this.b && this.M == 6) ? 3 : this.M);
        i1(this.M, true);
        g1();
    }

    public void N0(boolean z) {
        this.o = z;
    }

    public void O0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f2;
        if (this.W != null) {
            f0();
        }
    }

    public void P0(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.M == 5) {
                X0(4);
            }
            g1();
        }
    }

    public void Q0(int i2) {
        this.m = i2;
    }

    public void R0(int i2) {
        this.l = i2;
    }

    public void S0(int i2) {
        T0(i2, false);
    }

    public final void T0(int i2, boolean z) {
        if (i2 == -1) {
            if (this.g) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!this.g && this.f == i2) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i2);
        }
        k1(z);
    }

    public void U0(int i2) {
        this.a = i2;
    }

    public void V0(int i2) {
        this.e = i2;
    }

    public void W0(boolean z) {
        this.K = z;
    }

    public void X0(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.J && i2 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
            return;
        }
        int i3 = (i2 == 6 && this.b && w0(i2) <= this.E) ? 3 : i2;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            Y0(i2);
        } else {
            View view = (View) this.W.get();
            J0(view, new a(view, i3));
        }
    }

    public void Y0(int i2) {
        View view;
        if (this.M == i2) {
            return;
        }
        this.M = i2;
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.J && i2 == 5)) {
            this.N = i2;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            j1(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            j1(false);
        }
        i1(i2, true);
        for (int i3 = 0; i3 < this.Z.size(); i3++) {
            ((g) this.Z.get(i3)).c(view, i2);
        }
        g1();
    }

    public final void Z0(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || A0() || this.g) ? false : true;
        if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
            zr7.b(view, new d(z));
        }
    }

    @Override // com.zepto.iq3
    public void a(n30 n30Var) {
        mq3 mq3Var = this.b0;
        if (mq3Var == null) {
            return;
        }
        mq3Var.j(n30Var);
    }

    public boolean a1(long j, float f2) {
        return false;
    }

    @Override // com.zepto.iq3
    public void b() {
        mq3 mq3Var = this.b0;
        if (mq3Var == null) {
            return;
        }
        n30 n30VarC = mq3Var.c();
        if (n30VarC == null || Build.VERSION.SDK_INT < 34) {
            X0(this.J ? 5 : 4);
        } else if (this.J) {
            this.b0.h(n30VarC, new b());
        } else {
            this.b0.i(n30VarC, null);
            X0(4);
        }
    }

    public final int b0(View view, int i2, int i3) {
        return dq7.c(view, view.getResources().getString(i2), l0(i3));
    }

    public final boolean b1() {
        return this.O != null && (this.L || this.M == 1);
    }

    @Override // com.zepto.iq3
    public void c(n30 n30Var) {
        mq3 mq3Var = this.b0;
        if (mq3Var == null) {
            return;
        }
        mq3Var.l(n30Var);
    }

    public void c0(g gVar) {
        if (this.Z.contains(gVar)) {
            return;
        }
        this.Z.add(gVar);
    }

    public boolean c1(View view, float f2) {
        if (this.K) {
            return true;
        }
        if (C0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f2 * this.S)) - ((float) this.H)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    @Override // com.zepto.iq3
    public void d() {
        mq3 mq3Var = this.b0;
        if (mq3Var == null) {
            return;
        }
        mq3Var.f();
    }

    public final void d0() {
        int iH0 = h0();
        if (this.b) {
            this.H = Math.max(this.V - iH0, this.E);
        } else {
            this.H = this.V - iH0;
        }
    }

    public boolean d1() {
        return false;
    }

    public final float e0(float f2, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f2 > 0.0f) {
                return radius / f2;
            }
        }
        return 0.0f;
    }

    public boolean e1() {
        return true;
    }

    public final void f0() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    public final void f1(View view, int i2, boolean z) {
        int iW0 = w0(i2);
        oq7 oq7Var = this.O;
        if (oq7Var == null || (!z ? oq7Var.Q(view, view.getLeft(), iW0) : oq7Var.O(view.getLeft(), iW0))) {
            Y0(i2);
            return;
        }
        Y0(2);
        i1(i2, true);
        this.B.c(i2);
    }

    public final float g0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.j == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.W.get();
        if (!y0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.j.F(), rootWindowInsets.getRoundedCorner(0)), e0(this.j.G(), rootWindowInsets.getRoundedCorner(1)));
    }

    public final void g1() {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            h1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.X;
        if (weakReference2 != null) {
            h1((View) weakReference2.get(), 1);
        }
    }

    public final int h0() {
        int i2;
        return this.g ? Math.min(Math.max(this.h, this.V - ((this.U * 9) / 16)), this.T) + this.w : (this.o || this.p || (i2 = this.n) <= 0) ? this.f + this.w : Math.max(this.f, i2 + this.i);
    }

    public final void h1(View view, int i2) {
        if (view == null) {
            return;
        }
        k0(view, i2);
        if (!this.b && this.M != 6) {
            this.g0.put(i2, b0(view, b15.a, 6));
        }
        if (this.J && C0() && this.M != 5) {
            G0(view, r3.a.y, 5);
        }
        int i3 = this.M;
        if (i3 == 3) {
            G0(view, r3.a.x, this.b ? 4 : 6);
            return;
        }
        if (i3 == 4) {
            G0(view, r3.a.w, this.b ? 3 : 6);
        } else {
            if (i3 != 6) {
                return;
            }
            G0(view, r3.a.x, 4);
            G0(view, r3.a.w, 3);
        }
    }

    public final float i0(int i2) {
        float f2;
        float fS0;
        int i3 = this.H;
        if (i2 > i3 || i3 == s0()) {
            int i4 = this.H;
            f2 = i4 - i2;
            fS0 = this.V - i4;
        } else {
            int i5 = this.H;
            f2 = i5 - i2;
            fS0 = i5 - s0();
        }
        return f2 / fS0;
    }

    public final void i1(int i2, boolean z) {
        boolean zZ0;
        ValueAnimator valueAnimator;
        if (i2 == 2 || this.A == (zZ0 = z0()) || this.j == null) {
            return;
        }
        this.A = zZ0;
        if (!z || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.j.X(this.A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.j.y(), zZ0 ? g0() : 1.0f);
            this.C.start();
        }
    }

    public final boolean j0() {
        return B0() && C0();
    }

    public final void j1(boolean z) {
        Map map;
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f0 != null) {
                    return;
                } else {
                    this.f0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.W.get()) {
                    if (z) {
                        this.f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.c) {
                            dq7.B0(childAt, 4);
                        }
                    } else if (this.c && (map = this.f0) != null && map.containsKey(childAt)) {
                        dq7.B0(childAt, ((Integer) this.f0.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.f0 = null;
            } else if (this.c) {
                ((View) this.W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.W = null;
        this.O = null;
        this.b0 = null;
    }

    public final void k0(View view, int i2) {
        if (view == null) {
            return;
        }
        dq7.k0(view, 524288);
        dq7.k0(view, 262144);
        dq7.k0(view, 1048576);
        int i3 = this.g0.get(i2, -1);
        if (i3 != -1) {
            dq7.k0(view, i3);
            this.g0.delete(i2);
        }
    }

    public final void k1(boolean z) {
        View view;
        if (this.W != null) {
            d0();
            if (this.M != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            if (z) {
                X0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public final u3 l0(int i2) {
        return new f(i2);
    }

    public final void m0(Context context) {
        if (this.z == null) {
            return;
        }
        wq3 wq3Var = new wq3(this.z);
        this.j = wq3Var;
        wq3Var.M(context);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            this.j.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.j.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.W = null;
        this.O = null;
        this.b0 = null;
    }

    public final void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i2;
        oq7 oq7Var;
        if (!view.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            H0();
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.d0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference weakReference = this.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.B(view2, x, this.d0)) {
                    this.c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.e0 = true;
                }
            }
            this.P = this.c0 == -1 && !coordinatorLayout.B(view, x, this.d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.e0 = false;
            this.c0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (!this.P && (oq7Var = this.O) != null && oq7Var.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.Y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.P || this.M == 1 || coordinatorLayout.B(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i2 = this.d0) == -1 || Math.abs(((float) i2) - motionEvent.getY()) <= ((float) this.O.z())) ? false : true;
    }

    public void o0(int i2) {
        View view = (View) this.W.get();
        if (view == null || this.Z.isEmpty()) {
            return;
        }
        float fI0 = i0(i2);
        for (int i3 = 0; i3 < this.Z.size(); i3++) {
            ((g) this.Z.get(i3)).b(view, fI0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (dq7.y(coordinatorLayout) && !dq7.y(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(jz4.b);
            Z0(view);
            dq7.K0(view, new wz2(view));
            this.W = new WeakReference(view);
            this.b0 = new mq3(view);
            wq3 wq3Var = this.j;
            if (wq3Var != null) {
                dq7.u0(view, wq3Var);
                wq3 wq3Var2 = this.j;
                float fW = this.I;
                if (fW == -1.0f) {
                    fW = dq7.w(view);
                }
                wq3Var2.V(fW);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    dq7.v0(view, colorStateList);
                }
            }
            g1();
            if (dq7.z(view) == 0) {
                dq7.B0(view, 1);
            }
        }
        if (this.O == null) {
            this.O = oq7.o(coordinatorLayout, this.h0);
        }
        int top = view.getTop();
        coordinatorLayout.I(view, i2);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i3 = iMin - height;
        int i4 = this.x;
        if (i3 < i4) {
            if (this.s) {
                int i5 = this.m;
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i4;
                int i6 = this.m;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.T = iMin2;
            }
        }
        this.E = Math.max(0, this.V - this.T);
        f0();
        d0();
        int i7 = this.M;
        if (i7 == 3) {
            dq7.b0(view, s0());
        } else if (i7 == 6) {
            dq7.b0(view, this.F);
        } else if (this.J && i7 == 5) {
            dq7.b0(view, this.V);
        } else if (i7 == 4) {
            dq7.b0(view, this.H);
        } else if (i7 == 1 || i7 == 2) {
            dq7.b0(view, top - view.getTop());
        }
        i1(this.M, false);
        this.Y = new WeakReference(p0(view));
        for (int i8 = 0; i8 < this.Z.size(); i8++) {
            ((g) this.Z.get(i8)).a(view);
        }
        return true;
    }

    public View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (dq7.V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View viewP0 = p0(viewGroup.getChildAt(i2));
                if (viewP0 != null) {
                    return viewP0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(r0(i2, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.l, marginLayoutParams.width), r0(i4, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.m, marginLayoutParams.height));
        return true;
    }

    public final int r0(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, IntCompanionObject.MIN_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3) {
        WeakReference weakReference;
        if (E0() && (weakReference = this.Y) != null && view2 == weakReference.get()) {
            return this.M != 3 || super.s(coordinatorLayout, view, view2, f2, f3);
        }
        return false;
    }

    public int s0() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public wq3 t0() {
        return this.j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference weakReference = this.Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!E0() || view2 == view3) {
            int top = view.getTop();
            int i5 = top - i3;
            if (i3 > 0) {
                if (i5 < s0()) {
                    int iS0 = top - s0();
                    iArr[1] = iS0;
                    dq7.b0(view, -iS0);
                    Y0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i3;
                    dq7.b0(view, -i3);
                    Y0(1);
                }
            } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
                if (i5 > this.H && !j0()) {
                    int i6 = top - this.H;
                    iArr[1] = i6;
                    dq7.b0(view, -i6);
                    Y0(4);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i3;
                    dq7.b0(view, -i3);
                    Y0(1);
                }
            }
            o0(view.getTop());
            this.Q = i3;
            this.R = true;
        }
    }

    public int u0() {
        if (this.g) {
            return -1;
        }
        return this.f;
    }

    public int v0() {
        return this.M;
    }

    public final int w0(int i2) {
        if (i2 == 3) {
            return s0();
        }
        if (i2 == 4) {
            return this.H;
        }
        if (i2 == 5) {
            return this.V;
        }
        if (i2 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public final float x0() {
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.a0.getYVelocity(this.c0);
    }

    public final boolean y0() {
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.W.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final boolean z0() {
        return this.M == 3 && (this.y || y0());
    }

    public class i {
        public int a;
        public boolean b;
        public final Runnable c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b = false;
                oq7 oq7Var = BottomSheetBehavior.this.O;
                if (oq7Var != null && oq7Var.m(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.Y0(iVar2.a);
                }
            }
        }

        public i() {
            this.c = new a();
        }

        public void c(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            dq7.i0((View) BottomSheetBehavior.this.W.get(), this.c);
            this.b = true;
        }

        public /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class h extends z1 {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public final int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f = bottomSheetBehavior.M;
            this.g = bottomSheetBehavior.f;
            this.h = bottomSheetBehavior.b;
            this.i = bottomSheetBehavior.J;
            this.j = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new i(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList();
        this.d0 = -1;
        this.g0 = new SparseIntArray();
        this.h0 = new e();
        this.i = context.getResources().getDimensionPixelSize(jz4.X);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.J);
        int i3 = m15.N;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.k = vq3.a(context, typedArrayObtainStyledAttributes, i3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(m15.f0)) {
            this.z = e06.e(context, attributeSet, xy4.d, i0).m();
        }
        m0(context);
        n0();
        this.I = typedArrayObtainStyledAttributes.getDimension(m15.M, -1.0f);
        int i4 = m15.K;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = m15.L;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        int i6 = m15.T;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i6);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            S0(i2);
        } else {
            S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        P0(typedArrayObtainStyledAttributes.getBoolean(m15.S, false));
        N0(typedArrayObtainStyledAttributes.getBoolean(m15.X, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(m15.Q, true));
        W0(typedArrayObtainStyledAttributes.getBoolean(m15.W, false));
        K0(typedArrayObtainStyledAttributes.getBoolean(m15.O, true));
        U0(typedArrayObtainStyledAttributes.getInt(m15.U, 0));
        O0(typedArrayObtainStyledAttributes.getFloat(m15.R, 0.5f));
        int i7 = m15.P;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i7);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            L0(typedValuePeekValue2.data);
        } else {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i7, 0));
        }
        V0(typedArrayObtainStyledAttributes.getInt(m15.V, 500));
        this.p = typedArrayObtainStyledAttributes.getBoolean(m15.b0, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(m15.c0, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(m15.d0, false);
        this.s = typedArrayObtainStyledAttributes.getBoolean(m15.e0, true);
        this.t = typedArrayObtainStyledAttributes.getBoolean(m15.Y, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(m15.Z, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(m15.a0, false);
        this.y = typedArrayObtainStyledAttributes.getBoolean(m15.g0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
