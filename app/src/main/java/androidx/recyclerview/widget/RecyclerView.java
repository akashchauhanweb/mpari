package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.zepto.aj6;
import com.zepto.cx3;
import com.zepto.dq7;
import com.zepto.i15;
import com.zepto.iz4;
import com.zepto.kq7;
import com.zepto.kz1;
import com.zepto.lu4;
import com.zepto.o34;
import com.zepto.p34;
import com.zepto.r3;
import com.zepto.wb0;
import com.zepto.wy4;
import com.zepto.x2;
import com.zepto.y2;
import com.zepto.z1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements o34 {
    public static final int[] A0 = {R.attr.nestedScrollingEnabled};
    public static final boolean B0 = false;
    public static final boolean C0 = true;
    public static final boolean D0 = true;
    public static final boolean E0 = true;
    public static final boolean F0 = false;
    public static final boolean G0 = false;
    public static final Class[] H0;
    public static final Interpolator I0;
    public boolean A;
    public final AccessibilityManager B;
    public List C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public l H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public m M;
    public int N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public r V;
    public final int W;
    public final x a;
    public final int a0;
    public final v b;
    public float b0;
    public y c;
    public float c0;
    public androidx.recyclerview.widget.a d;
    public boolean d0;
    public androidx.recyclerview.widget.b e;
    public final c0 e0;
    public final androidx.recyclerview.widget.p f;
    public androidx.recyclerview.widget.e f0;
    public boolean g;
    public e.b g0;
    public final Runnable h;
    public final a0 h0;
    public final Rect i;
    public t i0;
    public final Rect j;
    public List j0;
    public final RectF k;
    public boolean k0;
    public h l;
    public boolean l0;
    public p m;
    public m.b m0;
    public final List n;
    public boolean n0;
    public final ArrayList o;
    public androidx.recyclerview.widget.k o0;
    public final ArrayList p;
    public final int[] p0;
    public s q;
    public p34 q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final int[] s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public final List u0;
    public int v;
    public Runnable v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public int x0;
    public boolean y;
    public int y0;
    public int z;
    public final p.b z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.u || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.r) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.x) {
                recyclerView2.w = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    public static class a0 {
        public SparseArray b;
        public int m;
        public long n;
        public int o;
        public int p;
        public int q;
        public int a = -1;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;

        public void a(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
        }

        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        public void f(h hVar) {
            this.e = 1;
            this.f = hVar.e();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.M;
            if (mVar != null) {
                mVar.v();
            }
            RecyclerView.this.n0 = false;
        }
    }

    public static abstract class b0 {
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c0 implements Runnable {
        public int c;
        public int e;
        public OverScroller f;
        public Interpolator g;
        public boolean h;
        public boolean i;

        public c0() {
            Interpolator interpolator = RecyclerView.I0;
            this.g = interpolator;
            this.h = false;
            this.i = false;
            this.f = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i, int i2) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.e = 0;
            this.c = 0;
            Interpolator interpolator = this.g;
            Interpolator interpolator2 = RecyclerView.I0;
            if (interpolator != interpolator2) {
                this.g = interpolator2;
                this.f = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f.fling(0, 0, i, i2, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            dq7.i0(RecyclerView.this, this);
        }

        public void d() {
            if (this.h) {
                this.i = true;
            } else {
                c();
            }
        }

        public void e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.I0;
            }
            if (this.g != interpolator) {
                this.g = interpolator;
                this.f = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.e = 0;
            this.c = 0;
            RecyclerView.this.setScrollState(2);
            this.f.startScroll(0, 0, i, i2, i4);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.m == null) {
                f();
                return;
            }
            this.i = false;
            this.h = true;
            recyclerView.u();
            OverScroller overScroller = this.f;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.c;
                int i4 = currY - this.e;
                this.c = currX;
                this.e = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.t0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.t0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.l != null) {
                    int[] iArr3 = recyclerView3.t0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.i1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.t0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    z zVar = recyclerView4.m.g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int iB = RecyclerView.this.h0.b();
                        if (iB == 0) {
                            zVar.r();
                        } else if (zVar.f() >= iB) {
                            zVar.p(iB - 1);
                            zVar.j(i2, i);
                        } else {
                            zVar.j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.t0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.t0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.I(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                z zVar2 = RecyclerView.this.m.g;
                if ((zVar2 == null || !zVar2.g()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i7, currVelocity);
                    }
                    if (RecyclerView.E0) {
                        RecyclerView.this.g0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i2, i);
                    }
                }
            }
            z zVar3 = RecyclerView.this.m.g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.h = false;
            if (this.i) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.v1(1);
            }
        }
    }

    public class d implements p.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m.s1(d0Var.a, recyclerView.b);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(d0 d0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.l(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(d0 d0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.b.J(d0Var);
            RecyclerView.this.n(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(d0 d0Var, m.c cVar, m.c cVar2) {
            d0Var.I(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.D) {
                if (recyclerView.M.b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.O0();
                }
            } else if (recyclerView.M.d(d0Var, cVar, cVar2)) {
                RecyclerView.this.O0();
            }
        }
    }

    public static abstract class d0 {
        public static final List t = Collections.emptyList();
        public final View a;
        public WeakReference b;
        public int j;
        public RecyclerView r;
        public h s;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public d0 h = null;
        public d0 i = null;
        public List k = null;
        public List l = null;
        public int m = 0;
        public v n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public d0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view;
        }

        public boolean A() {
            return (this.j & 2) != 0;
        }

        public boolean B() {
            return (this.j & 2) != 0;
        }

        public void C(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            if (this.a.getLayoutParams() != null) {
                ((q) this.a.getLayoutParams()).c = true;
            }
        }

        public void D(RecyclerView recyclerView) {
            int i = this.q;
            if (i != -1) {
                this.p = i;
            } else {
                this.p = dq7.z(this.a);
            }
            recyclerView.l1(this, 4);
        }

        public void E(RecyclerView recyclerView) {
            recyclerView.l1(this, this.p);
            this.p = 0;
        }

        public void F() {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.r(this);
        }

        public void G() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        public void H(int i, int i2) {
            this.j = (i & i2) | (this.j & (~i2));
        }

        public final void I(boolean z) {
            int i = this.m;
            int i2 = z ? i - 1 : i + 1;
            this.m = i2;
            if (i2 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.j |= 16;
            } else if (z && i2 == 0) {
                this.j &= -17;
            }
        }

        public void J(v vVar, boolean z) {
            this.n = vVar;
            this.o = z;
        }

        public boolean K() {
            return (this.j & 16) != 0;
        }

        public boolean L() {
            return (this.j & 128) != 0;
        }

        public void M() {
            this.n.J(this);
        }

        public boolean N() {
            return (this.j & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.j) == 0) {
                g();
                this.k.add(obj);
            }
        }

        public void b(int i) {
            this.j = i | this.j;
        }

        public void c() {
            this.d = -1;
            this.g = -1;
        }

        public void d() {
            List list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        public void e() {
            this.j &= -33;
        }

        public void f() {
            this.j &= -257;
        }

        public final void g() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            return (this.j & 16) == 0 && dq7.R(this.a);
        }

        public void i(int i, int i2, boolean z) {
            b(8);
            C(i2, z);
            this.c = i;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final int k() {
            return l();
        }

        public final int l() {
            RecyclerView recyclerView;
            h adapter;
            int iB0;
            if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (iB0 = this.r.b0(this)) == -1) {
                return -1;
            }
            return adapter.d(this.s, this, iB0);
        }

        public final long m() {
            return this.e;
        }

        public final int n() {
            return this.f;
        }

        public final int o() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final int p() {
            return this.d;
        }

        public List q() {
            if ((this.j & 1024) != 0) {
                return t;
            }
            List list = this.k;
            return (list == null || list.size() == 0) ? t : this.l;
        }

        public boolean r(int i) {
            return (i & this.j) != 0;
        }

        public boolean s() {
            return (this.j & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 || v();
        }

        public boolean t() {
            return (this.a.getParent() == null || this.a.getParent() == this.r) ? false : true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (y()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (v()) {
                sb.append(" invalid");
            }
            if (!u()) {
                sb.append(" unbound");
            }
            if (B()) {
                sb.append(" update");
            }
            if (x()) {
                sb.append(" removed");
            }
            if (L()) {
                sb.append(" ignored");
            }
            if (z()) {
                sb.append(" tmpDetached");
            }
            if (!w()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (s()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.j & 1) != 0;
        }

        public boolean v() {
            return (this.j & 4) != 0;
        }

        public final boolean w() {
            return (this.j & 16) == 0 && !dq7.R(this.a);
        }

        public boolean x() {
            return (this.j & 8) != 0;
        }

        public boolean y() {
            return this.n != null;
        }

        public boolean z() {
            return (this.j & 256) != 0;
        }
    }

    public class e implements b.InterfaceC0024b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public void b(View view) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (d0VarF0 != null) {
                d0VarF0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public d0 c(View view) {
            return RecyclerView.f0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public void d(int i) {
            d0 d0VarF0;
            View viewA = a(i);
            if (viewA != null && (d0VarF0 = RecyclerView.f0(viewA)) != null) {
                if (d0VarF0.z() && !d0VarF0.L()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + d0VarF0 + RecyclerView.this.P());
                }
                d0VarF0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public void e(View view) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (d0VarF0 != null) {
                d0VarF0.E(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public void f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public int g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public void h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public void i() {
            int iG = g();
            for (int i = 0; i < iG; i++) {
                View viewA = a(i);
                RecyclerView.this.z(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public void j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (d0VarF0 != null) {
                if (!d0VarF0.z() && !d0VarF0.L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + d0VarF0 + RecyclerView.this.P());
                }
                d0VarF0.f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0024b
        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    public class f implements a.InterfaceC0023a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void a(int i, int i2) {
            RecyclerView.this.E0(i, i2);
            RecyclerView.this.k0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public d0 c(int i) {
            d0 d0VarZ = RecyclerView.this.Z(i, true);
            if (d0VarZ == null || RecyclerView.this.e.n(d0VarZ.a)) {
                return null;
            }
            return d0VarZ;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void d(int i, int i2) {
            RecyclerView.this.F0(i, i2, false);
            RecyclerView.this.k0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void e(int i, int i2) {
            RecyclerView.this.D0(i, i2);
            RecyclerView.this.k0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void f(int i, int i2) {
            RecyclerView.this.F0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k0 = true;
            recyclerView.h0.d += i2;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void g(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0023a
        public void h(int i, int i2, Object obj) {
            RecyclerView.this.y1(i, i2, obj);
            RecyclerView.this.l0 = true;
        }

        public void i(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.m.X0(recyclerView, bVar.b, bVar.d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.m.a1(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.m.c1(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.m.Z0(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.a.values().length];
            a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h {
        public final i a = new i();
        public boolean b = false;
        public a c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(d0 d0Var, int i) {
            boolean z = d0Var.s == null;
            if (z) {
                d0Var.c = i;
                if (i()) {
                    d0Var.e = f(i);
                }
                d0Var.H(1, 519);
                aj6.a("RV OnBindView");
            }
            d0Var.s = this;
            q(d0Var, i, d0Var.q());
            if (z) {
                d0Var.d();
                ViewGroup.LayoutParams layoutParams = d0Var.a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).c = true;
                }
                aj6.b();
            }
        }

        public boolean b() {
            int i = g.a[this.c.ordinal()];
            if (i != 1) {
                return i != 2 || e() > 0;
            }
            return false;
        }

        public final d0 c(ViewGroup viewGroup, int i) {
            try {
                aj6.a("RV CreateView");
                d0 d0VarR = r(viewGroup, i);
                if (d0VarR.a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                d0VarR.f = i;
                return d0VarR;
            } finally {
                aj6.b();
            }
        }

        public int d(h hVar, d0 d0Var, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i) {
            return -1L;
        }

        public int g(int i) {
            return 0;
        }

        public final boolean h() {
            return this.a.a();
        }

        public final boolean i() {
            return this.b;
        }

        public final void j() {
            this.a.b();
        }

        public final void k(int i) {
            this.a.c(i, 1);
        }

        public final void l(int i, Object obj) {
            this.a.d(i, 1, obj);
        }

        public final void m(int i, int i2) {
            this.a.c(i, i2);
        }

        public final void n(int i) {
            this.a.e(i, 1);
        }

        public void o(RecyclerView recyclerView) {
        }

        public abstract void p(d0 d0Var, int i);

        public void q(d0 d0Var, int i, List list) {
            p(d0Var, i);
        }

        public abstract d0 r(ViewGroup viewGroup, int i);

        public void s(RecyclerView recyclerView) {
        }

        public boolean t(d0 d0Var) {
            return false;
        }

        public void u(d0 d0Var) {
        }

        public void v(d0 d0Var) {
        }

        public void w(d0 d0Var) {
        }

        public void x(j jVar) {
            this.a.registerObserver(jVar);
        }

        public void y(boolean z) {
            if (h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.b = z;
        }

        public void z(j jVar) {
            this.a.unregisterObserver(jVar);
        }
    }

    public static class i extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            d(i, i2, null);
        }

        public void d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }
    }

    public interface k {
    }

    public static class l {
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {
        public b a = null;
        public ArrayList b = new ArrayList();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        public interface a {
            void a();
        }

        public interface b {
            void a(d0 d0Var);
        }

        public static class c {
            public int a;
            public int b;
            public int c;
            public int d;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i) {
                View view = d0Var.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public static int e(d0 d0Var) {
            int i = d0Var.j;
            int i2 = i & 14;
            if (d0Var.v()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i2;
            }
            int iP = d0Var.p();
            int iJ = d0Var.j();
            return (iP == -1 || iJ == -1 || iP == iJ) ? i2 : i2 | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            s(d0Var);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((a) this.b.get(i)).a();
            }
            this.b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean zP = p();
            if (aVar != null) {
                if (zP) {
                    this.b.add(aVar);
                } else {
                    aVar.a();
                }
            }
            return zP;
        }

        public c r() {
            return new c();
        }

        public void s(d0 d0Var) {
        }

        public c t(a0 a0Var, d0 d0Var) {
            return r().a(d0Var);
        }

        public c u(a0 a0Var, d0 d0Var, int i, List list) {
            return r().a(d0Var);
        }

        public abstract void v();

        public void w(b bVar) {
            this.a = bVar;
        }
    }

    public class n implements m.b {
        public n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(d0 d0Var) {
            d0Var.I(true);
            if (d0Var.h != null && d0Var.i == null) {
                d0Var.h = null;
            }
            d0Var.i = null;
            if (d0Var.K() || RecyclerView.this.X0(d0Var.a) || !d0Var.z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.a, false);
        }
    }

    public static abstract class o {
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class p {
        public androidx.recyclerview.widget.b a;
        public RecyclerView b;
        public final o.b c;
        public final o.b d;
        public androidx.recyclerview.widget.o e;
        public androidx.recyclerview.widget.o f;
        public z g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public int m;
        public boolean n;
        public int o;
        public int p;
        public int q;
        public int r;

        public class a implements o.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return p.this.N(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return p.this.u0() - p.this.k0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c(View view) {
                return p.this.V(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return p.this.j0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements o.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return p.this.N(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return p.this.b0() - p.this.h0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c(View view) {
                return p.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return p.this.m0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public p() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new androidx.recyclerview.widget.o(aVar);
            this.f = new androidx.recyclerview.widget.o(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        public static boolean C0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.P(int, int, int, int, boolean):int");
        }

        public static d o0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i15.f, i, i2);
            dVar.a = typedArrayObtainStyledAttributes.getInt(i15.g, 1);
            dVar.b = typedArrayObtainStyledAttributes.getInt(i15.q, 1);
            dVar.c = typedArrayObtainStyledAttributes.getBoolean(i15.p, false);
            dVar.d = typedArrayObtainStyledAttributes.getBoolean(i15.r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public abstract int A(a0 a0Var);

        public final boolean A0() {
            return this.l;
        }

        public void A1() {
            this.h = true;
        }

        public void B(v vVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                B1(vVar, iO, N(iO));
            }
        }

        public boolean B0(v vVar, a0 a0Var) {
            return false;
        }

        public final void B1(v vVar, int i, View view) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (d0VarF0.L()) {
                return;
            }
            if (d0VarF0.v() && !d0VarF0.x() && !this.b.l.i()) {
                w1(i);
                vVar.C(d0VarF0);
            } else {
                C(i);
                vVar.D(view);
                this.b.f.k(d0VarF0);
            }
        }

        public void C(int i) {
            D(i, N(i));
        }

        public abstract int C1(int i, v vVar, a0 a0Var);

        public final void D(int i, View view) {
            this.a.d(i);
        }

        public boolean D0() {
            z zVar = this.g;
            return zVar != null && zVar.h();
        }

        public abstract void D1(int i);

        public void E(RecyclerView recyclerView) {
            this.i = true;
            M0(recyclerView);
        }

        public boolean E0(View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public abstract int E1(int i, v vVar, a0 a0Var);

        public void F(RecyclerView recyclerView, v vVar) {
            this.i = false;
            O0(recyclerView, vVar);
        }

        public void F0(View view, int i, int i2, int i3, int i4) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void F1(RecyclerView recyclerView) {
            G1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public View G(View view) {
            View viewR;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewR = recyclerView.R(view)) == null || this.a.n(viewR)) {
                return null;
            }
            return viewR;
        }

        public void G0(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect rectJ0 = this.b.j0(view);
            int i3 = i + rectJ0.left + rectJ0.right;
            int i4 = i2 + rectJ0.top + rectJ0.bottom;
            int iP = P(u0(), v0(), j0() + k0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) qVar).width, p());
            int iP2 = P(b0(), c0(), m0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).height, q());
            if (L1(view, iP, iP2, qVar)) {
                view.measure(iP, iP2);
            }
        }

        public void G1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.C0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.C0) {
                return;
            }
            this.r = 0;
        }

        public View H(int i) {
            int iO = O();
            for (int i2 = 0; i2 < iO; i2++) {
                View viewN = N(i2);
                d0 d0VarF0 = RecyclerView.f0(viewN);
                if (d0VarF0 != null && d0VarF0.o() == i && !d0VarF0.L() && (this.b.h0.e() || !d0VarF0.x())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i, int i2) {
            View viewN = N(i);
            if (viewN != null) {
                C(i);
                m(viewN, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
            }
        }

        public void H1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public abstract q I();

        public void I0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.B0(i);
            }
        }

        public void I1(Rect rect, int i, int i2) {
            H1(s(i, rect.width() + j0() + k0(), g0()), s(i2, rect.height() + m0() + h0(), f0()));
        }

        public q J(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void J0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.C0(i);
            }
        }

        public void J1(int i, int i2) {
            int iO = O();
            if (iO == 0) {
                this.b.w(i, i2);
                return;
            }
            int i3 = IntCompanionObject.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iO; i7++) {
                View viewN = N(i7);
                Rect rect = this.b.i;
                U(viewN, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.i.set(i6, i4, i3, i5);
            I1(this.b.i, i, i2);
        }

        public q K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void K0(h hVar, h hVar2) {
        }

        public void K1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.e;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public int L() {
            return -1;
        }

        public boolean L0(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
            return false;
        }

        public boolean L1(View view, int i, int i2, q qVar) {
            return (!view.isLayoutRequested() && this.k && C0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && C0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((q) view.getLayoutParams()).b.bottom;
        }

        public void M0(RecyclerView recyclerView) {
        }

        public boolean M1() {
            return false;
        }

        public View N(int i) {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.f(i);
            }
            return null;
        }

        public void N0(RecyclerView recyclerView) {
        }

        public boolean N1(View view, int i, int i2, q qVar) {
            return (this.k && C0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && C0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int O() {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(RecyclerView recyclerView, v vVar) {
            N0(recyclerView);
        }

        public abstract void O1(RecyclerView recyclerView, a0 a0Var, int i);

        public abstract View P0(View view, int i, v vVar, a0 a0Var);

        public void P1(z zVar) {
            z zVar2 = this.g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.g.r();
            }
            this.g = zVar;
            zVar.q(this.b, this);
        }

        public final int[] Q(View view, Rect rect) {
            int[] iArr = new int[2];
            int iJ0 = j0();
            int iM0 = m0();
            int iU0 = u0() - k0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iJ0;
            int iMin = Math.min(0, i);
            int i2 = top - iM0;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iU0;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public void Q0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            R0(recyclerView.b, recyclerView.h0, accessibilityEvent);
        }

        public void Q1() {
            z zVar = this.g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public boolean R() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.g;
        }

        public void R0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            h hVar = this.b.l;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.e());
            }
        }

        public boolean R1() {
            return false;
        }

        public int S(v vVar, a0 a0Var) {
            return -1;
        }

        public void S0(v vVar, a0 a0Var, r3 r3Var) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                r3Var.a(ConstantsKt.DEFAULT_BUFFER_SIZE);
                r3Var.n0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                r3Var.a(ConstantsKt.DEFAULT_BLOCK_SIZE);
                r3Var.n0(true);
            }
            r3Var.W(r3.c.b(q0(vVar, a0Var), S(vVar, a0Var), B0(vVar, a0Var), r0(vVar, a0Var)));
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void T0(r3 r3Var) {
            RecyclerView recyclerView = this.b;
            S0(recyclerView.b, recyclerView.h0, r3Var);
        }

        public void U(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public void U0(View view, r3 r3Var) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (d0VarF0 == null || d0VarF0.x() || this.a.n(d0VarF0.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            V0(recyclerView.b, recyclerView.h0, view, r3Var);
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(v vVar, a0 a0Var, View view, r3 r3Var) {
        }

        public int W(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View W0(View view, int i) {
            return null;
        }

        public int X(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i, int i2) {
        }

        public int Y(View view) {
            return view.getRight() + p0(view);
        }

        public void Y0(RecyclerView recyclerView) {
        }

        public int Z(View view) {
            return view.getTop() - s0(view);
        }

        public void Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i, int i2) {
        }

        public int b0() {
            return this.r;
        }

        public void b1(RecyclerView recyclerView, int i, int i2) {
        }

        public int c0() {
            return this.p;
        }

        public void c1(RecyclerView recyclerView, int i, int i2, Object obj) {
            b1(recyclerView, i, i2);
        }

        public int d0() {
            return dq7.B(this.b);
        }

        public abstract void d1(v vVar, a0 a0Var);

        public int e() {
            RecyclerView recyclerView = this.b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public int e0(View view) {
            return ((q) view.getLayoutParams()).b.left;
        }

        public void e1(a0 a0Var) {
        }

        public int f0() {
            return dq7.C(this.b);
        }

        public void f1(v vVar, a0 a0Var, int i, int i2) {
            this.b.w(i, i2);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return dq7.D(this.b);
        }

        public boolean g1(RecyclerView recyclerView, View view, View view2) {
            return D0() || recyclerView.v0();
        }

        public void h(View view, int i) {
            k(view, i, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean h1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return g1(recyclerView, view, view2);
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return dq7.F(recyclerView);
            }
            return 0;
        }

        public void i1(Parcelable parcelable) {
        }

        public void j(View view, int i) {
            k(view, i, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable j1() {
            return null;
        }

        public final void k(View view, int i, boolean z) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (z || d0VarF0.x()) {
                this.b.f.b(d0VarF0);
            } else {
                this.b.f.p(d0VarF0);
            }
            q qVar = (q) view.getLayoutParams();
            if (d0VarF0.N() || d0VarF0.y()) {
                if (d0VarF0.y()) {
                    d0VarF0.M();
                } else {
                    d0VarF0.e();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int iM = this.a.m(view);
                if (i == -1) {
                    i = this.a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.P());
                }
                if (iM != i) {
                    this.b.m.H0(iM, i);
                }
            } else {
                this.a.a(view, i, false);
                qVar.c = true;
                z zVar = this.g;
                if (zVar != null && zVar.h()) {
                    this.g.k(view);
                }
            }
            if (qVar.d) {
                d0VarF0.a.invalidate();
                qVar.d = false;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void k1(int i) {
        }

        public void l(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int l0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return dq7.G(recyclerView);
            }
            return 0;
        }

        public void l1(z zVar) {
            if (this.g == zVar) {
                this.g = null;
            }
        }

        public void m(View view, int i) {
            n(view, i, (q) view.getLayoutParams());
        }

        public int m0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean m1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return n1(recyclerView.b, recyclerView.h0, i, bundle);
        }

        public void n(View view, int i, q qVar) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (d0VarF0.x()) {
                this.b.f.b(d0VarF0);
            } else {
                this.b.f.p(d0VarF0);
            }
            this.a.c(view, i, qVar, d0VarF0.x());
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean n1(v vVar, a0 a0Var, int i, Bundle bundle) {
            int iB0;
            int iU0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                iB0 = recyclerView.canScrollVertically(1) ? (b0() - m0()) - h0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    iU0 = (u0() - j0()) - k0();
                    i2 = iB0;
                    i3 = iU0;
                }
                i2 = iB0;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                iB0 = recyclerView.canScrollVertically(-1) ? -((b0() - m0()) - h0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    iU0 = -((u0() - j0()) - k0());
                    i2 = iB0;
                    i3 = iU0;
                }
                i2 = iB0;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.b.q1(i3, i2, null, IntCompanionObject.MIN_VALUE, true);
            return true;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public boolean o1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return p1(recyclerView.b, recyclerView.h0, view, i, bundle);
        }

        public abstract boolean p();

        public int p0(View view) {
            return ((q) view.getLayoutParams()).b.right;
        }

        public boolean p1(v vVar, a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        public abstract boolean q();

        public int q0(v vVar, a0 a0Var) {
            return -1;
        }

        public void q1(v vVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.f0(N(iO)).L()) {
                    t1(iO, vVar);
                }
            }
        }

        public boolean r(q qVar) {
            return qVar != null;
        }

        public int r0(v vVar, a0 a0Var) {
            return 0;
        }

        public void r1(v vVar) {
            int iJ = vVar.j();
            for (int i = iJ - 1; i >= 0; i--) {
                View viewN = vVar.n(i);
                d0 d0VarF0 = RecyclerView.f0(viewN);
                if (!d0VarF0.L()) {
                    d0VarF0.I(false);
                    if (d0VarF0.z()) {
                        this.b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.b.M;
                    if (mVar != null) {
                        mVar.j(d0VarF0);
                    }
                    d0VarF0.I(true);
                    vVar.y(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.b.invalidate();
            }
        }

        public int s0(View view) {
            return ((q) view.getLayoutParams()).b.top;
        }

        public void s1(View view, v vVar) {
            v1(view);
            vVar.B(view);
        }

        public void t(int i, int i2, a0 a0Var, c cVar) {
        }

        public void t0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void t1(int i, v vVar) {
            View viewN = N(i);
            w1(i);
            vVar.B(viewN);
        }

        public void u(int i, c cVar) {
        }

        public int u0() {
            return this.q;
        }

        public boolean u1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public abstract int v(a0 a0Var);

        public int v0() {
            return this.o;
        }

        public void v1(View view) {
            this.a.p(view);
        }

        public abstract int w(a0 a0Var);

        public boolean w0() {
            int iO = O();
            for (int i = 0; i < iO; i++) {
                ViewGroup.LayoutParams layoutParams = N(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void w1(int i) {
            if (N(i) != null) {
                this.a.q(i);
            }
        }

        public abstract int x(a0 a0Var);

        public boolean x0() {
            return this.i;
        }

        public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return y1(recyclerView, view, rect, z, false);
        }

        public abstract int y(a0 a0Var);

        public boolean y0() {
            return this.j;
        }

        public boolean y1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrQ = Q(view, rect);
            int i = iArrQ[0];
            int i2 = iArrQ[1];
            if ((z2 && !z0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.n1(i, i2);
            }
            return true;
        }

        public abstract int z(a0 a0Var);

        public final boolean z0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iJ0 = j0();
            int iM0 = m0();
            int iU0 = u0() - k0();
            int iB0 = b0() - h0();
            Rect rect = this.b.i;
            U(focusedChild, rect);
            return rect.left - i < iU0 && rect.right - i > iJ0 && rect.top - i2 < iB0 && rect.bottom - i2 > iM0;
        }

        public void z1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    public interface s {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public abstract void b(RecyclerView recyclerView, int i, int i2);
    }

    public static class u {
        public SparseArray a = new SparseArray();
        public int b = 0;

        public static class a {
            public final ArrayList a = new ArrayList();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                ((a) this.a.valueAt(i)).a.clear();
            }
        }

        public void c() {
            this.b--;
        }

        public void d(int i, long j) {
            a aVarG = g(i);
            aVarG.d = j(aVarG.d, j);
        }

        public void e(int i, long j) {
            a aVarG = g(i);
            aVarG.c = j(aVarG.c, j);
        }

        public d0 f(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((d0) arrayList.get(size)).t()) {
                    return (d0) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        public void h(h hVar, h hVar2, boolean z) {
            if (hVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int iN = d0Var.n();
            ArrayList arrayList = g(iN).a;
            if (((a) this.a.get(iN)).b <= arrayList.size()) {
                return;
            }
            d0Var.F();
            arrayList.add(d0Var);
        }

        public long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public boolean k(int i, long j, long j2) {
            long j3 = g(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean l(int i, long j, long j2) {
            long j3 = g(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class v {
        public final ArrayList a;
        public ArrayList b;
        public final ArrayList c;
        public final List d;
        public int e;
        public int f;
        public u g;

        public v() {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void A(int i) {
            a((d0) this.c.get(i), true);
            this.c.remove(i);
        }

        public void B(View view) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (d0VarF0.z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d0VarF0.y()) {
                d0VarF0.M();
            } else if (d0VarF0.N()) {
                d0VarF0.e();
            }
            C(d0VarF0);
            if (RecyclerView.this.M == null || d0VarF0.w()) {
                return;
            }
            RecyclerView.this.M.j(d0VarF0);
        }

        public void C(d0 d0Var) {
            boolean z;
            boolean z2 = true;
            if (d0Var.y() || d0Var.a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.y());
                sb.append(" isAttached:");
                sb.append(d0Var.a.getParent() != null);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d0Var.z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.P());
            }
            if (d0Var.L()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean zH = d0Var.h();
            h hVar = RecyclerView.this.l;
            if ((hVar != null && zH && hVar.t(d0Var)) || d0Var.w()) {
                if (this.f <= 0 || d0Var.r(526)) {
                    z = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.E0 && size > 0 && !RecyclerView.this.g0.d(d0Var.c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.g0.d(((d0) this.c.get(i)).c)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.c.add(size, d0Var);
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    a(d0Var, true);
                }
                z = z;
            } else {
                z2 = false;
            }
            RecyclerView.this.f.q(d0Var);
            if (z || z2 || !zH) {
                return;
            }
            d0Var.s = null;
            d0Var.r = null;
        }

        public void D(View view) {
            d0 d0VarF0 = RecyclerView.f0(view);
            if (!d0VarF0.r(12) && d0VarF0.A() && !RecyclerView.this.p(d0VarF0)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                d0VarF0.J(this, true);
                this.b.add(d0VarF0);
                return;
            }
            if (!d0VarF0.v() || d0VarF0.x() || RecyclerView.this.l.i()) {
                d0VarF0.J(this, false);
                this.a.add(d0VarF0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
        }

        public void E(u uVar) {
            u uVar2 = this.g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.g.a();
        }

        public void F(b0 b0Var) {
        }

        public void G(int i) {
            this.e = i;
            K();
        }

        public final boolean H(d0 d0Var, int i, int i2, long j) {
            d0Var.s = null;
            d0Var.r = RecyclerView.this;
            int iN = d0Var.n();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != LongCompanionObject.MAX_VALUE && !this.g.k(iN, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.l.a(d0Var, i);
            this.g.d(d0Var.n(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.h0.e()) {
                return true;
            }
            d0Var.g = i2;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f5 A[PHI: r1 r4
          0x00f5: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$d0) = (r1v11 androidx.recyclerview.widget.RecyclerView$d0), (r1v30 androidx.recyclerview.widget.RecyclerView$d0) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
          0x00f5: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d4 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01d7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 531
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        public void J(d0 d0Var) {
            if (d0Var.o) {
                this.b.remove(d0Var);
            } else {
                this.a.remove(d0Var);
            }
            d0Var.n = null;
            d0Var.o = false;
            d0Var.e();
        }

        public void K() {
            p pVar = RecyclerView.this.m;
            this.f = this.e + (pVar != null ? pVar.m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                A(size);
            }
        }

        public boolean L(d0 d0Var) {
            if (d0Var.x()) {
                return RecyclerView.this.h0.e();
            }
            int i = d0Var.c;
            if (i >= 0 && i < RecyclerView.this.l.e()) {
                if (RecyclerView.this.h0.e() || RecyclerView.this.l.g(d0Var.c) == d0Var.n()) {
                    return !RecyclerView.this.l.i() || d0Var.m() == RecyclerView.this.l.f(d0Var.c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.P());
        }

        public void M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.c.get(size);
                if (d0Var != null && (i3 = d0Var.c) >= i && i3 < i4) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        public void a(d0 d0Var, boolean z) {
            RecyclerView.r(d0Var);
            View view = d0Var.a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.o0;
            if (kVar != null) {
                x2 x2VarN = kVar.n();
                dq7.q0(view, x2VarN instanceof k.a ? ((k.a) x2VarN).n(view) : null);
            }
            if (z) {
                g(d0Var);
            }
            d0Var.s = null;
            d0Var.r = null;
            i().i(d0Var);
        }

        public final void b(d0 d0Var) {
            if (RecyclerView.this.t0()) {
                View view = d0Var.a;
                if (dq7.z(view) == 0) {
                    dq7.B0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.o0;
                if (kVar == null) {
                    return;
                }
                x2 x2VarN = kVar.n();
                if (x2VarN instanceof k.a) {
                    ((k.a) x2VarN).o(view);
                }
                dq7.q0(view, x2VarN);
            }
        }

        public void c() {
            this.a.clear();
            z();
        }

        public void d() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((d0) this.c.get(i)).c();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((d0) this.a.get(i2)).c();
            }
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((d0) this.b.get(i3)).c();
                }
            }
        }

        public void e() {
            this.a.clear();
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.h0.b()) {
                return !RecyclerView.this.h0.e() ? i : RecyclerView.this.d.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.h0.b() + RecyclerView.this.P());
        }

        public void g(d0 d0Var) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.n.size() > 0) {
                wb0.a(RecyclerView.this.n.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.l;
            if (hVar != null) {
                hVar.w(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.h0 != null) {
                recyclerView.f.q(d0Var);
            }
        }

        public d0 h(int i) {
            int size;
            int iM;
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    d0 d0Var = (d0) this.b.get(i2);
                    if (!d0Var.N() && d0Var.o() == i) {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.l.i() && (iM = RecyclerView.this.d.m(i)) > 0 && iM < RecyclerView.this.l.e()) {
                    long jF = RecyclerView.this.l.f(iM);
                    for (int i3 = 0; i3 < size; i3++) {
                        d0 d0Var2 = (d0) this.b.get(i3);
                        if (!d0Var2.N() && d0Var2.m() == jF) {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public u i() {
            if (this.g == null) {
                this.g = new u();
            }
            return this.g;
        }

        public int j() {
            return this.a.size();
        }

        public List k() {
            return this.d;
        }

        public d0 l(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.a.get(size);
                if (d0Var.m() == j && !d0Var.N()) {
                    if (i == d0Var.n()) {
                        d0Var.b(32);
                        if (d0Var.x() && !RecyclerView.this.h0.e()) {
                            d0Var.H(2, 14);
                        }
                        return d0Var;
                    }
                    if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.a, false);
                        y(d0Var.a);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = (d0) this.c.get(size2);
                if (d0Var2.m() == j && !d0Var2.t()) {
                    if (i == d0Var2.n()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return d0Var2;
                    }
                    if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public d0 m(int i, boolean z) {
            View viewE;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = (d0) this.a.get(i2);
                if (!d0Var.N() && d0Var.o() == i && !d0Var.v() && (RecyclerView.this.h0.h || !d0Var.x())) {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z || (viewE = RecyclerView.this.e.e(i)) == null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d0 d0Var2 = (d0) this.c.get(i3);
                    if (!d0Var2.v() && d0Var2.o() == i && !d0Var2.t()) {
                        if (!z) {
                            this.c.remove(i3);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 d0VarF0 = RecyclerView.f0(viewE);
            RecyclerView.this.e.s(viewE);
            int iM = RecyclerView.this.e.m(viewE);
            if (iM != -1) {
                RecyclerView.this.e.d(iM);
                D(viewE);
                d0VarF0.b(8224);
                return d0VarF0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + d0VarF0 + RecyclerView.this.P());
        }

        public View n(int i) {
            return ((d0) this.a.get(i)).a;
        }

        public View o(int i) {
            return p(i, false);
        }

        public View p(int i, boolean z) {
            return I(i, z, LongCompanionObject.MAX_VALUE).a;
        }

        public final void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(d0 d0Var) {
            View view = d0Var.a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                q qVar = (q) ((d0) this.c.get(i)).a.getLayoutParams();
                if (qVar != null) {
                    qVar.c = true;
                }
            }
        }

        public void t() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                d0 d0Var = (d0) this.c.get(i);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a(null);
                }
            }
            h hVar = RecyclerView.this.l;
            if (hVar == null || !hVar.i()) {
                z();
            }
        }

        public void u(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = (d0) this.c.get(i3);
                if (d0Var != null && d0Var.c >= i) {
                    d0Var.C(i2, false);
                }
            }
        }

        public void v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                d0 d0Var = (d0) this.c.get(i7);
                if (d0Var != null && (i6 = d0Var.c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        d0Var.C(i2 - i, false);
                    } else {
                        d0Var.C(i3, false);
                    }
                }
            }
        }

        public void w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.c;
                    if (i4 >= i3) {
                        d0Var.C(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        public void x(h hVar, h hVar2, boolean z) {
            c();
            i().h(hVar, hVar2, z);
        }

        public void y(View view) {
            d0 d0VarF0 = RecyclerView.f0(view);
            d0VarF0.n = null;
            d0VarF0.o = false;
            d0VarF0.e();
            C(d0VarF0);
        }

        public void z() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.c.clear();
            if (RecyclerView.E0) {
                RecyclerView.this.g0.b();
            }
        }
    }

    public interface w {
    }

    public class x extends j {
        public x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.h0.g = true;
            recyclerView.R0(true);
            if (RecyclerView.this.d.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.d.r(i, i2, obj)) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i, int i2) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.d.s(i, i2)) {
                e();
            }
        }

        public void e() {
            if (RecyclerView.D0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.s && recyclerView.r) {
                    dq7.i0(recyclerView, recyclerView.h);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.A = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class z {
        public RecyclerView b;
        public p c;
        public boolean d;
        public boolean e;
        public View f;
        public boolean h;
        public int a = -1;
        public final a g = new a(0, 0);

        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public a(int i, int i2) {
                this(i, i2, IntCompanionObject.MIN_VALUE, null);
            }

            public boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            public void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.x0(i);
                    this.f = false;
                } else {
                    if (!this.f) {
                        this.g = 0;
                        return;
                    }
                    e();
                    recyclerView.e0.e(this.a, this.b, this.c, this.e);
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            public final void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }
        }

        public interface b {
            PointF d(int i);
        }

        public PointF a(int i) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).d(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.b.m.H(i);
        }

        public int c() {
            return this.b.m.O();
        }

        public int d(View view) {
            return this.b.d0(view);
        }

        public p e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        public void i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void j(int i, int i2) {
            PointF pointFA;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null) {
                float f = pointFA.x;
                if (f != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.i1((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f, recyclerView.h0, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                l(i, i2, recyclerView.h0, this.g);
                boolean zA = this.g.a();
                this.g.c(recyclerView);
                if (zA && this.e) {
                    this.d = true;
                    recyclerView.e0.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        public abstract void l(int i, int i2, a0 a0Var, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i) {
            this.a = i;
        }

        public void q(RecyclerView recyclerView, p pVar) {
            recyclerView.e0.f();
            if (this.h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.c = pVar;
            int i = this.a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.h0.a = i;
            this.e = true;
            this.d = true;
            this.f = b(f());
            m();
            this.b.e0.d();
            this.h = true;
        }

        public final void r() {
            if (this.e) {
                this.e = false;
                n();
                this.b.h0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.l1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        H0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        I0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wy4.a);
    }

    public static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewV = V(viewGroup.getChildAt(i2));
            if (recyclerViewV != null) {
                return recyclerViewV;
            }
        }
        return null;
    }

    public static d0 f0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).a;
    }

    public static void g0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private p34 getScrollingChildHelper() {
        if (this.q0 == null) {
            this.q0 = new p34(this);
        }
        return this.q0;
    }

    public static void r(d0 d0Var) {
        WeakReference weakReference = d0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == d0Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            d0Var.b = null;
        }
    }

    public final void A() {
        int i2 = this.z;
        this.z = 0;
        if (i2 == 0 || !t0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        y2.b(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public final void A0(int i2, int i3, MotionEvent motionEvent, int i4) {
        p pVar = this.m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        int[] iArr = this.t0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = pVar.p();
        boolean zQ = this.m.q();
        t1(zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0, i4);
        if (F(zP ? i2 : 0, zQ ? i3 : 0, this.t0, this.r0, i4)) {
            int[] iArr2 = this.t0;
            i2 -= iArr2[0];
            i3 -= iArr2[1];
        }
        h1(zP ? i2 : 0, zQ ? i3 : 0, motionEvent, i4);
        androidx.recyclerview.widget.e eVar = this.f0;
        if (eVar != null && (i2 != 0 || i3 != 0)) {
            eVar.f(this, i2, i3);
        }
        v1(i4);
    }

    public void B() {
        if (this.l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.h0.j = false;
        boolean z2 = this.w0 && !(this.x0 == getWidth() && this.y0 == getHeight());
        this.x0 = 0;
        this.y0 = 0;
        this.w0 = false;
        if (this.h0.e == 1) {
            C();
            this.m.F1(this);
            D();
        } else if (this.d.q() || z2 || this.m.u0() != getWidth() || this.m.b0() != getHeight()) {
            this.m.F1(this);
            D();
        } else {
            this.m.F1(this);
        }
        E();
    }

    public void B0(int i2) {
        int iG = this.e.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.e.f(i3).offsetLeftAndRight(i2);
        }
    }

    public final void C() {
        this.h0.a(1);
        Q(this.h0);
        this.h0.j = false;
        s1();
        this.f.f();
        I0();
        Q0();
        f1();
        a0 a0Var = this.h0;
        a0Var.i = a0Var.k && this.l0;
        this.l0 = false;
        this.k0 = false;
        a0Var.h = a0Var.l;
        a0Var.f = this.l.e();
        U(this.p0);
        if (this.h0.k) {
            int iG = this.e.g();
            for (int i2 = 0; i2 < iG; i2++) {
                d0 d0VarF0 = f0(this.e.f(i2));
                if (!d0VarF0.L() && (!d0VarF0.v() || this.l.i())) {
                    this.f.e(d0VarF0, this.M.u(this.h0, d0VarF0, m.e(d0VarF0), d0VarF0.q()));
                    if (this.h0.i && d0VarF0.A() && !d0VarF0.x() && !d0VarF0.L() && !d0VarF0.v()) {
                        this.f.c(c0(d0VarF0), d0VarF0);
                    }
                }
            }
        }
        if (this.h0.l) {
            g1();
            a0 a0Var2 = this.h0;
            boolean z2 = a0Var2.g;
            a0Var2.g = false;
            this.m.d1(this.b, a0Var2);
            this.h0.g = z2;
            for (int i3 = 0; i3 < this.e.g(); i3++) {
                d0 d0VarF02 = f0(this.e.f(i3));
                if (!d0VarF02.L() && !this.f.i(d0VarF02)) {
                    int iE = m.e(d0VarF02);
                    boolean zR = d0VarF02.r(ConstantsKt.DEFAULT_BUFFER_SIZE);
                    if (!zR) {
                        iE |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    }
                    m.c cVarU = this.M.u(this.h0, d0VarF02, iE, d0VarF02.q());
                    if (zR) {
                        T0(d0VarF02, cVarU);
                    } else {
                        this.f.a(d0VarF02, cVarU);
                    }
                }
            }
            s();
        } else {
            s();
        }
        J0();
        u1(false);
        this.h0.e = 2;
    }

    public void C0(int i2) {
        int iG = this.e.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.e.f(i3).offsetTopAndBottom(i2);
        }
    }

    public final void D() {
        s1();
        I0();
        this.h0.a(6);
        this.d.j();
        this.h0.f = this.l.e();
        this.h0.d = 0;
        if (this.c != null && this.l.b()) {
            Parcelable parcelable = this.c.f;
            if (parcelable != null) {
                this.m.i1(parcelable);
            }
            this.c = null;
        }
        a0 a0Var = this.h0;
        a0Var.h = false;
        this.m.d1(this.b, a0Var);
        a0 a0Var2 = this.h0;
        a0Var2.g = false;
        a0Var2.k = a0Var2.k && this.M != null;
        a0Var2.e = 4;
        J0();
        u1(false);
    }

    public void D0(int i2, int i3) {
        int iJ = this.e.j();
        for (int i4 = 0; i4 < iJ; i4++) {
            d0 d0VarF0 = f0(this.e.i(i4));
            if (d0VarF0 != null && !d0VarF0.L() && d0VarF0.c >= i2) {
                d0VarF0.C(i3, false);
                this.h0.g = true;
            }
        }
        this.b.u(i2, i3);
        requestLayout();
    }

    public final void E() {
        this.h0.a(4);
        s1();
        I0();
        a0 a0Var = this.h0;
        a0Var.e = 1;
        if (a0Var.k) {
            for (int iG = this.e.g() - 1; iG >= 0; iG--) {
                d0 d0VarF0 = f0(this.e.f(iG));
                if (!d0VarF0.L()) {
                    long jC0 = c0(d0VarF0);
                    m.c cVarT = this.M.t(this.h0, d0VarF0);
                    d0 d0VarG = this.f.g(jC0);
                    if (d0VarG == null || d0VarG.L()) {
                        this.f.d(d0VarF0, cVarT);
                    } else {
                        boolean zH = this.f.h(d0VarG);
                        boolean zH2 = this.f.h(d0VarF0);
                        if (zH && d0VarG == d0VarF0) {
                            this.f.d(d0VarF0, cVarT);
                        } else {
                            m.c cVarN = this.f.n(d0VarG);
                            this.f.d(d0VarF0, cVarT);
                            m.c cVarM = this.f.m(d0VarF0);
                            if (cVarN == null) {
                                k0(jC0, d0VarF0, d0VarG);
                            } else {
                                m(d0VarG, d0VarF0, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.f.o(this.z0);
        }
        this.m.r1(this.b);
        a0 a0Var2 = this.h0;
        a0Var2.c = a0Var2.f;
        this.D = false;
        this.E = false;
        a0Var2.k = false;
        a0Var2.l = false;
        this.m.h = false;
        ArrayList arrayList = this.b.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.m;
        if (pVar.n) {
            pVar.m = 0;
            pVar.n = false;
            this.b.K();
        }
        this.m.e1(this.h0);
        J0();
        u1(false);
        this.f.f();
        int[] iArr = this.p0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        U0();
        d1();
    }

    public void E0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iJ = this.e.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < iJ; i8++) {
            d0 d0VarF0 = f0(this.e.i(i8));
            if (d0VarF0 != null && (i7 = d0VarF0.c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    d0VarF0.C(i3 - i2, false);
                } else {
                    d0VarF0.C(i6, false);
                }
                this.h0.g = true;
            }
        }
        this.b.v(i2, i3);
        requestLayout();
    }

    public boolean F(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void F0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iJ = this.e.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            d0 d0VarF0 = f0(this.e.i(i5));
            if (d0VarF0 != null && !d0VarF0.L()) {
                int i6 = d0VarF0.c;
                if (i6 >= i4) {
                    d0VarF0.C(-i3, z2);
                    this.h0.g = true;
                } else if (i6 >= i2) {
                    d0VarF0.i(i2 - 1, -i3, z2);
                    this.h0.g = true;
                }
            }
        }
        this.b.w(i2, i3, z2);
        requestLayout();
    }

    public final void G(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void G0(View view) {
    }

    public void H(int i2) {
        p pVar = this.m;
        if (pVar != null) {
            pVar.k1(i2);
        }
        M0(i2);
        t tVar = this.i0;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List list = this.j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.j0.get(size)).a(this, i2);
            }
        }
    }

    public void H0(View view) {
    }

    public void I(int i2, int i3) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        N0(i2, i3);
        t tVar = this.i0;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List list = this.j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.j0.get(size)).b(this, i2, i3);
            }
        }
        this.G--;
    }

    public void I0() {
        this.F++;
    }

    public void J() {
        int i2;
        for (int size = this.u0.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) this.u0.get(size);
            if (d0Var.a.getParent() == this && !d0Var.L() && (i2 = d0Var.q) != -1) {
                dq7.B0(d0Var.a, i2);
                d0Var.q = -1;
            }
        }
        this.u0.clear();
    }

    public void J0() {
        K0(true);
    }

    public final boolean K(MotionEvent motionEvent) {
        s sVar = this.q;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        sVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.q = null;
        }
        return true;
    }

    public void K0(boolean z2) {
        int i2 = this.F - 1;
        this.F = i2;
        if (i2 < 1) {
            this.F = 0;
            if (z2) {
                A();
                J();
            }
        }
    }

    public void L() {
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this, 3);
        this.L = edgeEffectA;
        if (this.g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.S = x2;
            this.Q = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.T = y2;
            this.R = y2;
        }
    }

    public void M() {
        if (this.I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this, 0);
        this.I = edgeEffectA;
        if (this.g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void M0(int i2) {
    }

    public void N() {
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this, 2);
        this.K = edgeEffectA;
        if (this.g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void N0(int i2, int i3) {
    }

    public void O() {
        if (this.J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this, 1);
        this.J = edgeEffectA;
        if (this.g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void O0() {
        if (this.n0 || !this.r) {
            return;
        }
        dq7.i0(this, this.v0);
        this.n0 = true;
    }

    public String P() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    public final boolean P0() {
        return this.M != null && this.m.R1();
    }

    public final void Q(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.p = 0;
            a0Var.q = 0;
        } else {
            OverScroller overScroller = this.e0.f;
            a0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public final void Q0() {
        boolean z2;
        if (this.D) {
            this.d.w();
            if (this.E) {
                this.m.Y0(this);
            }
        }
        if (P0()) {
            this.d.u();
        } else {
            this.d.j();
        }
        boolean z3 = this.k0 || this.l0;
        this.h0.k = this.u && this.M != null && ((z2 = this.D) || z3 || this.m.h) && (!z2 || this.l.i());
        a0 a0Var = this.h0;
        a0Var.l = a0Var.k && z3 && !this.D && P0();
    }

    public View R(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void R0(boolean z2) {
        this.E = z2 | this.E;
        this.D = true;
        z0();
    }

    public d0 S(View view) {
        View viewR = R(view);
        if (viewR == null) {
            return null;
        }
        return e0(viewR);
    }

    public final void S0(float f2, float f3, float f4, float f5) {
        boolean z2 = true;
        if (f3 < 0.0f) {
            M();
            kz1.c(this.I, (-f3) / getWidth(), 1.0f - (f4 / getHeight()));
        } else if (f3 > 0.0f) {
            N();
            kz1.c(this.K, f3 / getWidth(), f4 / getHeight());
        } else {
            z2 = false;
        }
        if (f5 < 0.0f) {
            O();
            kz1.c(this.J, (-f5) / getHeight(), f2 / getWidth());
        } else if (f5 > 0.0f) {
            L();
            kz1.c(this.L, f5 / getHeight(), 1.0f - (f2 / getWidth()));
        } else if (!z2 && f3 == 0.0f && f5 == 0.0f) {
            return;
        }
        dq7.h0(this);
    }

    public final boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = (s) this.p.get(i2);
            if (sVar.a(this, motionEvent) && action != 3) {
                this.q = sVar;
                return true;
            }
        }
        return false;
    }

    public void T0(d0 d0Var, m.c cVar) {
        d0Var.H(0, ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (this.h0.i && d0Var.A() && !d0Var.x() && !d0Var.L()) {
            this.f.c(c0(d0Var), d0Var);
        }
        this.f.e(d0Var, cVar);
    }

    public final void U(int[] iArr) {
        int iG = this.e.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = IntCompanionObject.MAX_VALUE;
        int i3 = IntCompanionObject.MIN_VALUE;
        for (int i4 = 0; i4 < iG; i4++) {
            d0 d0VarF0 = f0(this.e.f(i4));
            if (!d0VarF0.L()) {
                int iO = d0VarF0.o();
                if (iO < i2) {
                    i2 = iO;
                }
                if (iO > i3) {
                    i3 = iO;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final void U0() {
        View viewFindViewById;
        if (!this.d0 || this.l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!G0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.e.n(focusedChild)) {
                    return;
                }
            } else if (this.e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewW = null;
        d0 d0VarY = (this.h0.n == -1 || !this.l.i()) ? null : Y(this.h0.n);
        if (d0VarY != null && !this.e.n(d0VarY.a) && d0VarY.a.hasFocusable()) {
            viewW = d0VarY.a;
        } else if (this.e.g() > 0) {
            viewW = W();
        }
        if (viewW != null) {
            int i2 = this.h0.o;
            if (i2 != -1 && (viewFindViewById = viewW.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewW = viewFindViewById;
            }
            viewW.requestFocus();
        }
    }

    public final void V0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.I.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            dq7.h0(this);
        }
    }

    public final View W() {
        d0 d0VarX;
        a0 a0Var = this.h0;
        int i2 = a0Var.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int iB = a0Var.b();
        for (int i3 = i2; i3 < iB; i3++) {
            d0 d0VarX2 = X(i3);
            if (d0VarX2 == null) {
                break;
            }
            if (d0VarX2.a.hasFocusable()) {
                return d0VarX2.a;
            }
        }
        int iMin = Math.min(iB, i2);
        do {
            iMin--;
            if (iMin < 0 || (d0VarX = X(iMin)) == null) {
                return null;
            }
        } while (!d0VarX.a.hasFocusable());
        return d0VarX.a;
    }

    public void W0() {
        m mVar = this.M;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.m;
        if (pVar != null) {
            pVar.q1(this.b);
            this.m.r1(this.b);
        }
        this.b.c();
    }

    public d0 X(int i2) {
        d0 d0Var = null;
        if (this.D) {
            return null;
        }
        int iJ = this.e.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            d0 d0VarF0 = f0(this.e.i(i3));
            if (d0VarF0 != null && !d0VarF0.x() && b0(d0VarF0) == i2) {
                if (!this.e.n(d0VarF0.a)) {
                    return d0VarF0;
                }
                d0Var = d0VarF0;
            }
        }
        return d0Var;
    }

    public boolean X0(View view) {
        s1();
        boolean zR = this.e.r(view);
        if (zR) {
            d0 d0VarF0 = f0(view);
            this.b.J(d0VarF0);
            this.b.C(d0VarF0);
        }
        u1(!zR);
        return zR;
    }

    public d0 Y(long j2) {
        h hVar = this.l;
        d0 d0Var = null;
        if (hVar != null && hVar.i()) {
            int iJ = this.e.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                d0 d0VarF0 = f0(this.e.i(i2));
                if (d0VarF0 != null && !d0VarF0.x() && d0VarF0.m() == j2) {
                    if (!this.e.n(d0VarF0.a)) {
                        return d0VarF0;
                    }
                    d0Var = d0VarF0;
                }
            }
        }
        return d0Var;
    }

    public void Y0(o oVar) {
        p pVar = this.m;
        if (pVar != null) {
            pVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.o.remove(oVar);
        if (this.o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        y0();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.d0 Z(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.e
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.e
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = f0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.x()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.o()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.e
            android.view.View r4 = r3.a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Z(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    public void Z0(s sVar) {
        this.p.remove(sVar);
        if (this.q == sVar) {
            this.q = null;
        }
    }

    public void a(int i2, int i3) {
        if (i2 < 0) {
            M();
            if (this.I.isFinished()) {
                this.I.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            N();
            if (this.K.isFinished()) {
                this.K.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            O();
            if (this.J.isFinished()) {
                this.J.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            L();
            if (this.L.isFinished()) {
                this.L.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        dq7.h0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean a0(int i2, int i3) {
        p pVar = this.m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.x) {
            return false;
        }
        int iP = pVar.p();
        boolean zQ = this.m.q();
        if (iP == 0 || Math.abs(i2) < this.W) {
            i2 = 0;
        }
        if (!zQ || Math.abs(i3) < this.W) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = iP != 0 || zQ;
            dispatchNestedFling(f2, f3, z2);
            r rVar = this.V;
            if (rVar != null && rVar.a(i2, i3)) {
                return true;
            }
            if (z2) {
                if (zQ) {
                    iP = (iP == true ? 1 : 0) | 2;
                }
                t1(iP, 1);
                int i4 = this.a0;
                int iMax = Math.max(-i4, Math.min(i2, i4));
                int i5 = this.a0;
                this.e0.b(iMax, Math.max(-i5, Math.min(i3, i5)));
                return true;
            }
        }
        return false;
    }

    public void a1(t tVar) {
        List list = this.j0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        p pVar = this.m;
        if (pVar == null || !pVar.L0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public int b0(d0 d0Var) {
        if (d0Var.r(524) || !d0Var.u()) {
            return -1;
        }
        return this.d.e(d0Var.c);
    }

    public void b1() {
        d0 d0Var;
        int iG = this.e.g();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = this.e.f(i2);
            d0 d0VarE0 = e0(viewF);
            if (d0VarE0 != null && (d0Var = d0VarE0.i) != null) {
                View view = d0Var.a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public long c0(d0 d0Var) {
        return this.l.i() ? d0Var.m() : d0Var.c;
    }

    public final void c1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.c) {
                Rect rect = qVar.b;
                Rect rect2 = this.i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.i);
            offsetRectIntoDescendantCoords(view, this.i);
        }
        this.m.y1(this, view, this.i, !this.u, view2 == null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.m.r((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.m;
        if (pVar != null && pVar.p()) {
            return this.m.v(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.m;
        if (pVar != null && pVar.p()) {
            return this.m.w(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.m;
        if (pVar != null && pVar.p()) {
            return this.m.x(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.m;
        if (pVar != null && pVar.q()) {
            return this.m.y(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.m;
        if (pVar != null && pVar.q()) {
            return this.m.z(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.m;
        if (pVar != null && pVar.q()) {
            return this.m.A(this.h0);
        }
        return 0;
    }

    public int d0(View view) {
        d0 d0VarF0 = f0(view);
        if (d0VarF0 != null) {
            return d0VarF0.o();
        }
        return -1;
    }

    public final void d1() {
        a0 a0Var = this.h0;
        a0Var.n = -1L;
        a0Var.m = -1;
        a0Var.o = -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.o.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((o) this.o.get(i2)).i(canvas, this, this.h0);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.M == null || this.o.size() <= 0 || !this.M.p()) && !z2) {
            return;
        }
        dq7.h0(this);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public d0 e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void e1() {
        VelocityTracker velocityTracker = this.P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        v1(0);
        V0();
    }

    public final void f1() {
        View focusedChild = (this.d0 && hasFocus() && this.l != null) ? getFocusedChild() : null;
        d0 d0VarS = focusedChild != null ? S(focusedChild) : null;
        if (d0VarS == null) {
            d1();
            return;
        }
        this.h0.n = this.l.i() ? d0VarS.m() : -1L;
        this.h0.m = this.D ? -1 : d0VarS.x() ? d0VarS.d : d0VarS.j();
        this.h0.o = h0(d0VarS.a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewP0;
        boolean z2;
        View viewW0 = this.m.W0(view, i2);
        if (viewW0 != null) {
            return viewW0;
        }
        boolean z3 = (this.l == null || this.m == null || v0() || this.x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.m.q()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (F0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.m.p()) {
                int i4 = (this.m.d0() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (F0) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                u();
                if (R(view) == null) {
                    return null;
                }
                s1();
                this.m.P0(view, i2, this.b, this.h0);
                u1(false);
            }
            viewP0 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                u();
                if (R(view) == null) {
                    return null;
                }
                s1();
                viewP0 = this.m.P0(view, i2, this.b, this.h0);
                u1(false);
            } else {
                viewP0 = viewFindNextFocus;
            }
        }
        if (viewP0 == null || viewP0.hasFocusable()) {
            return w0(view, viewP0, i2) ? viewP0 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        c1(viewP0, null);
        return view;
    }

    public final void g(d0 d0Var) {
        View view = d0Var.a;
        boolean z2 = view.getParent() == this;
        this.b.J(e0(view));
        if (d0Var.z()) {
            this.e.c(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.e.k(view);
        } else {
            this.e.b(view, true);
        }
    }

    public void g1() {
        int iJ = this.e.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarF0 = f0(this.e.i(i2));
            if (!d0VarF0.L()) {
                d0VarF0.G();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.m;
        if (pVar != null) {
            return pVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.m;
        if (pVar != null) {
            return pVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.l;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.m;
        return pVar != null ? pVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.g;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.o0;
    }

    public l getEdgeEffectFactory() {
        return this.H;
    }

    public m getItemAnimator() {
        return this.M;
    }

    public int getItemDecorationCount() {
        return this.o.size();
    }

    public p getLayoutManager() {
        return this.m;
    }

    public int getMaxFlingVelocity() {
        return this.a0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    public long getNanoTime() {
        if (E0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.d0;
    }

    public u getRecycledViewPool() {
        return this.b.i();
    }

    public int getScrollState() {
        return this.N;
    }

    public void h(o oVar) {
        i(oVar, -1);
    }

    public final int h0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public boolean h1(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        u();
        if (this.l != null) {
            int[] iArr = this.t0;
            iArr[0] = 0;
            iArr[1] = 0;
            i1(i2, i3, iArr);
            int[] iArr2 = this.t0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i5 = i10;
            i6 = i9;
            i7 = i2 - i9;
            i8 = i3 - i10;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.o.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.t0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i6, i5, i7, i8, this.r0, i4, iArr3);
        int[] iArr4 = this.t0;
        int i11 = iArr4[0];
        int i12 = i7 - i11;
        int i13 = iArr4[1];
        int i14 = i8 - i13;
        boolean z2 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.S;
        int[] iArr5 = this.r0;
        int i16 = iArr5[0];
        this.S = i15 - i16;
        int i17 = this.T;
        int i18 = iArr5[1];
        this.T = i17 - i18;
        int[] iArr6 = this.s0;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !cx3.a(motionEvent, 8194)) {
                S0(motionEvent.getX(), i12, motionEvent.getY(), i14);
            }
            t(i2, i3);
        }
        if (i6 != 0 || i5 != 0) {
            I(i6, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i5 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(o oVar, int i2) {
        p pVar = this.m;
        if (pVar != null) {
            pVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.o.add(oVar);
        } else {
            this.o.add(i2, oVar);
        }
        y0();
        requestLayout();
    }

    public final String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public void i1(int i2, int i3, int[] iArr) {
        s1();
        I0();
        aj6.a("RV Scroll");
        Q(this.h0);
        int iC1 = i2 != 0 ? this.m.C1(i2, this.b, this.h0) : 0;
        int iE1 = i3 != 0 ? this.m.E1(i3, this.b, this.h0) : 0;
        aj6.b();
        b1();
        J0();
        u1(false);
        if (iArr != null) {
            iArr[0] = iC1;
            iArr[1] = iE1;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.x;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        this.p.add(sVar);
    }

    public Rect j0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.c) {
            return qVar.b;
        }
        if (this.h0.e() && (qVar.b() || qVar.d())) {
            return qVar.b;
        }
        Rect rect = qVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.set(0, 0, 0, 0);
            ((o) this.o.get(i2)).e(this.i, view, this, this.h0);
            int i3 = rect.left;
            Rect rect2 = this.i;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.c = false;
        return rect;
    }

    public void j1(int i2) {
        if (this.x) {
            return;
        }
        w1();
        p pVar = this.m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.D1(i2);
            awakenScrollBars();
        }
    }

    public void k(t tVar) {
        if (this.j0 == null) {
            this.j0 = new ArrayList();
        }
        this.j0.add(tVar);
    }

    public final void k0(long j2, d0 d0Var, d0 d0Var2) {
        int iG = this.e.g();
        for (int i2 = 0; i2 < iG; i2++) {
            d0 d0VarF0 = f0(this.e.f(i2));
            if (d0VarF0 != d0Var && c0(d0VarF0) == j2) {
                h hVar = this.l;
                if (hVar == null || !hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + d0VarF0 + " \n View Holder 2:" + d0Var + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + d0VarF0 + " \n View Holder 2:" + d0Var + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + P());
    }

    public final void k1(h hVar, boolean z2, boolean z3) {
        h hVar2 = this.l;
        if (hVar2 != null) {
            hVar2.z(this.a);
            this.l.s(this);
        }
        if (!z2 || z3) {
            W0();
        }
        this.d.w();
        h hVar3 = this.l;
        this.l = hVar;
        if (hVar != null) {
            hVar.x(this.a);
            hVar.o(this);
        }
        p pVar = this.m;
        if (pVar != null) {
            pVar.K0(hVar3, this.l);
        }
        this.b.x(hVar3, this.l, z2);
        this.h0.g = true;
    }

    public void l(d0 d0Var, m.c cVar, m.c cVar2) {
        d0Var.I(false);
        if (this.M.a(d0Var, cVar, cVar2)) {
            O0();
        }
    }

    public boolean l0() {
        return this.s;
    }

    public boolean l1(d0 d0Var, int i2) {
        if (!v0()) {
            dq7.B0(d0Var.a, i2);
            return true;
        }
        d0Var.q = i2;
        this.u0.add(d0Var);
        return false;
    }

    public final void m(d0 d0Var, d0 d0Var2, m.c cVar, m.c cVar2, boolean z2, boolean z3) {
        d0Var.I(false);
        if (z2) {
            g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                g(d0Var2);
            }
            d0Var.h = d0Var2;
            g(d0Var);
            this.b.J(d0Var);
            d0Var2.I(false);
            d0Var2.i = d0Var;
        }
        if (this.M.b(d0Var, d0Var2, cVar, cVar2)) {
            O0();
        }
    }

    public boolean m0() {
        return !this.u || this.D || this.d.p();
    }

    public boolean m1(AccessibilityEvent accessibilityEvent) {
        if (!v0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? y2.a(accessibilityEvent) : 0;
        this.z |= iA != 0 ? iA : 0;
        return true;
    }

    public void n(d0 d0Var, m.c cVar, m.c cVar2) {
        g(d0Var);
        d0Var.I(false);
        if (this.M.c(d0Var, cVar, cVar2)) {
            O0();
        }
    }

    public final boolean n0() {
        int iG = this.e.g();
        for (int i2 = 0; i2 < iG; i2++) {
            d0 d0VarF0 = f0(this.e.f(i2));
            if (d0VarF0 != null && !d0VarF0.L() && d0VarF0.A()) {
                return true;
            }
        }
        return false;
    }

    public void n1(int i2, int i3) {
        o1(i2, i3, null);
    }

    public void o(String str) {
        if (v0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public void o0() {
        this.d = new androidx.recyclerview.widget.a(new f());
    }

    public void o1(int i2, int i3, Interpolator interpolator) {
        p1(i2, i3, interpolator, IntCompanionObject.MIN_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.r = r1
            boolean r2 = r5.u
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.u = r1
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.m
            if (r1 == 0) goto L1e
            r1.E(r5)
        L1e:
            r5.n0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.E0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.h
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f0 = r1
            android.view.Display r1 = com.zepto.dq7.v(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        m mVar = this.M;
        if (mVar != null) {
            mVar.k();
        }
        w1();
        this.r = false;
        p pVar = this.m;
        if (pVar != null) {
            pVar.F(this, this.b);
        }
        this.u0.clear();
        removeCallbacks(this.v0);
        this.f.j();
        if (!E0 || (eVar = this.f0) == null) {
            return;
        }
        eVar.j(this);
        this.f0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((o) this.o.get(i2)).g(canvas, this, this.h0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.x
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.m
            boolean r0 = r0.q()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.m
            boolean r3 = r3.p()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.m
            boolean r3 = r3.q()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.m
            boolean r3 = r3.p()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.b0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.c0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.A0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.x) {
            return false;
        }
        this.q = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        p pVar = this.m;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.m.q();
        if (this.P == null) {
            this.P = VelocityTracker.obtain();
        }
        this.P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.y) {
                this.y = false;
            }
            this.O = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.S = x2;
            this.Q = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.T = y2;
            this.R = y2;
            if (this.N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                v1(1);
            }
            int[] iArr = this.s0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zP;
            if (zQ) {
                i2 = (zP ? 1 : 0) | 2;
            }
            t1(i2, 0);
        } else if (actionMasked == 1) {
            this.P.clear();
            v1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.O);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.N != 1) {
                int i3 = x3 - this.Q;
                int i4 = y3 - this.R;
                if (!zP || Math.abs(i3) <= this.U) {
                    z2 = false;
                } else {
                    this.S = x3;
                    z2 = true;
                }
                if (zQ && Math.abs(i4) > this.U) {
                    this.T = y3;
                } else if (z2) {
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.O = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.S = x4;
            this.Q = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.T = y4;
            this.R = y4;
        } else if (actionMasked == 6) {
            L0(motionEvent);
        }
        return this.N == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        aj6.a("RV OnLayout");
        B();
        aj6.b();
        this.u = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        p pVar = this.m;
        if (pVar == null) {
            w(i2, i3);
            return;
        }
        boolean z2 = false;
        if (pVar.y0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.m.f1(this.b, this.h0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.w0 = z2;
            if (z2 || this.l == null) {
                return;
            }
            if (this.h0.e == 1) {
                C();
            }
            this.m.G1(i2, i3);
            this.h0.j = true;
            D();
            this.m.J1(i2, i3);
            if (this.m.M1()) {
                this.m.G1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.h0.j = true;
                D();
                this.m.J1(i2, i3);
            }
            this.x0 = getMeasuredWidth();
            this.y0 = getMeasuredHeight();
            return;
        }
        if (this.s) {
            this.m.f1(this.b, this.h0, i2, i3);
            return;
        }
        if (this.A) {
            s1();
            I0();
            Q0();
            J0();
            a0 a0Var = this.h0;
            if (a0Var.l) {
                a0Var.h = true;
            } else {
                this.d.j();
                this.h0.h = false;
            }
            this.A = false;
            u1(false);
        } else if (this.h0.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.l;
        if (hVar != null) {
            this.h0.f = hVar.e();
        } else {
            this.h0.f = 0;
        }
        s1();
        this.m.f1(this.b, this.h0, i2, i3);
        u1(false);
        this.h0.h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (v0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.c = yVar;
        super.onRestoreInstanceState(yVar.c());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.c;
        if (yVar2 != null) {
            yVar.d(yVar2);
        } else {
            p pVar = this.m;
            if (pVar != null) {
                yVar.f = pVar.j1();
            } else {
                yVar.f = null;
            }
        }
        return yVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
      0x00df: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(d0 d0Var) {
        m mVar = this.M;
        return mVar == null || mVar.g(d0Var, d0Var.q());
    }

    public final void p0() {
        if (dq7.A(this) == 0) {
            dq7.C0(this, 8);
        }
    }

    public void p1(int i2, int i3, Interpolator interpolator, int i4) {
        q1(i2, i3, interpolator, i4, false);
    }

    public final void q() {
        e1();
        setScrollState(0);
    }

    public final void q0() {
        this.e = new androidx.recyclerview.widget.b(new e());
    }

    public void q1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        p pVar = this.m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        if (!pVar.p()) {
            i2 = 0;
        }
        if (!this.m.q()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 != Integer.MIN_VALUE && i4 <= 0) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            t1(i5, 1);
        }
        this.e0.e(i2, i3, i4, interpolator);
    }

    public void r0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(iz4.a), resources.getDimensionPixelSize(iz4.c), resources.getDimensionPixelOffset(iz4.b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    public void r1(int i2) {
        if (this.x) {
            return;
        }
        p pVar = this.m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.O1(this, this.h0, i2);
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        d0 d0VarF0 = f0(view);
        if (d0VarF0 != null) {
            if (d0VarF0.z()) {
                d0VarF0.f();
            } else if (!d0VarF0.L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + d0VarF0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.m.h1(this, this.h0, view, view2) && view2 != null) {
            c1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.m.x1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((s) this.p.get(i2)).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.v != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    public void s() {
        int iJ = this.e.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarF0 = f0(this.e.i(i2));
            if (!d0VarF0.L()) {
                d0VarF0.c();
            }
        }
        this.b.d();
    }

    public void s0() {
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void s1() {
        int i2 = this.v + 1;
        this.v = i2;
        if (i2 != 1 || this.x) {
            return;
        }
        this.w = false;
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        p pVar = this.m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        boolean zP = pVar.p();
        boolean zQ = this.m.q();
        if (zP || zQ) {
            if (!zP) {
                i2 = 0;
            }
            if (!zQ) {
                i3 = 0;
            }
            h1(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.o0 = kVar;
        dq7.q0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        k1(hVar, false, true);
        R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.g) {
            s0();
        }
        this.g = z2;
        super.setClipToPadding(z2);
        if (this.u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        lu4.g(lVar);
        this.H = lVar;
        s0();
    }

    public void setHasFixedSize(boolean z2) {
        this.s = z2;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.M;
        if (mVar2 != null) {
            mVar2.k();
            this.M.w(null);
        }
        this.M = mVar;
        if (mVar != null) {
            mVar.w(this.m0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.b.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.m) {
            return;
        }
        w1();
        if (this.m != null) {
            m mVar = this.M;
            if (mVar != null) {
                mVar.k();
            }
            this.m.q1(this.b);
            this.m.r1(this.b);
            this.b.c();
            if (this.r) {
                this.m.F(this, this.b);
            }
            this.m.K1(null);
            this.m = null;
        } else {
            this.b.c();
        }
        this.e.o();
        this.m = pVar;
        if (pVar != null) {
            if (pVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.b.P());
            }
            pVar.K1(this);
            if (this.r) {
                this.m.E(this);
            }
        }
        this.b.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.V = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.i0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.d0 = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.b.E(uVar);
    }

    @Deprecated
    public void setRecyclerListener(w wVar) {
    }

    public void setScrollState(int i2) {
        if (i2 == this.N) {
            return;
        }
        this.N = i2;
        if (i2 != 2) {
            x1();
        }
        H(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.U = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.U = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.b.F(b0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.x) {
            o("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.x = true;
                this.y = true;
                w1();
                return;
            }
            this.x = false;
            if (this.w && this.m != null && this.l != null) {
                requestLayout();
            }
            this.w = false;
        }
    }

    public void t(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.I.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.J.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            dq7.h0(this);
        }
    }

    public boolean t0() {
        AccessibilityManager accessibilityManager = this.B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean t1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    public void u() {
        if (!this.u || this.D) {
            aj6.a("RV FullInvalidate");
            B();
            aj6.b();
            return;
        }
        if (this.d.p()) {
            if (!this.d.o(4) || this.d.o(11)) {
                if (this.d.p()) {
                    aj6.a("RV FullInvalidate");
                    B();
                    aj6.b();
                    return;
                }
                return;
            }
            aj6.a("RV PartialInvalidate");
            s1();
            I0();
            this.d.u();
            if (!this.w) {
                if (n0()) {
                    B();
                } else {
                    this.d.i();
                }
            }
            u1(true);
            J0();
            aj6.b();
        }
    }

    public boolean u0() {
        m mVar = this.M;
        return mVar != null && mVar.p();
    }

    public void u1(boolean z2) {
        if (this.v < 1) {
            this.v = 1;
        }
        if (!z2 && !this.x) {
            this.w = false;
        }
        if (this.v == 1) {
            if (z2 && this.w && !this.x && this.m != null && this.l != null) {
                B();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public final void v(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strI0 = i0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strI0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(H0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strI0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strI0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strI0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strI0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e8);
            }
        }
    }

    public boolean v0() {
        return this.F > 0;
    }

    public void v1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    public void w(int i2, int i3) {
        setMeasuredDimension(p.s(i2, getPaddingLeft() + getPaddingRight(), dq7.D(this)), p.s(i3, getPaddingTop() + getPaddingBottom(), dq7.C(this)));
    }

    public final boolean w0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.i.set(0, 0, view.getWidth(), view.getHeight());
        this.j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.i);
        offsetDescendantRectToMyCoords(view2, this.j);
        byte b2 = -1;
        int i4 = this.m.d0() == 1 ? -1 : 1;
        Rect rect = this.i;
        int i5 = rect.left;
        Rect rect2 = this.j;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            b2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                b2 = 0;
            }
        }
        if (i2 == 1) {
            return b2 < 0 || (b2 == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return b2 > 0 || (b2 == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return b2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return b2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + P());
    }

    public void w1() {
        setScrollState(0);
        x1();
    }

    public final boolean x(int i2, int i3) {
        U(this.p0);
        int[] iArr = this.p0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    public void x0(int i2) {
        if (this.m == null) {
            return;
        }
        setScrollState(2);
        this.m.D1(i2);
        awakenScrollBars();
    }

    public final void x1() {
        this.e0.f();
        p pVar = this.m;
        if (pVar != null) {
            pVar.Q1();
        }
    }

    public void y(View view) {
        int size;
        d0 d0VarF0 = f0(view);
        G0(view);
        h hVar = this.l;
        if (hVar != null && d0VarF0 != null) {
            hVar.u(d0VarF0);
        }
        if (this.C == null || r2.size() - 1 < 0) {
            return;
        }
        wb0.a(this.C.get(size));
        throw null;
    }

    public void y0() {
        int iJ = this.e.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            ((q) this.e.i(i2).getLayoutParams()).c = true;
        }
        this.b.s();
    }

    public void y1(int i2, int i3, Object obj) {
        int i4;
        int iJ = this.e.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewI = this.e.i(i6);
            d0 d0VarF0 = f0(viewI);
            if (d0VarF0 != null && !d0VarF0.L() && (i4 = d0VarF0.c) >= i2 && i4 < i5) {
                d0VarF0.b(2);
                d0VarF0.a(obj);
                ((q) viewI.getLayoutParams()).c = true;
            }
        }
        this.b.M(i2, i3);
    }

    public void z(View view) {
        int size;
        d0 d0VarF0 = f0(view);
        H0(view);
        h hVar = this.l;
        if (hVar != null && d0VarF0 != null) {
            hVar.v(d0VarF0);
        }
        if (this.C == null || r2.size() - 1 < 0) {
            return;
        }
        wb0.a(this.C.get(size));
        throw null;
    }

    public void z0() {
        int iJ = this.e.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarF0 = f0(this.e.i(i2));
            if (d0VarF0 != null && !d0VarF0.L()) {
                d0VarF0.b(6);
            }
        }
        y0();
        this.b.t();
    }

    public static class q extends ViewGroup.MarginLayoutParams {
        public d0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.o();
        }

        public boolean b() {
            return this.a.A();
        }

        public boolean c() {
            return this.a.x();
        }

        public boolean d() {
            return this.a.v();
        }

        public q(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new x();
        this.b = new v();
        this.f = new androidx.recyclerview.widget.p();
        this.h = new a();
        this.i = new Rect();
        this.j = new Rect();
        this.k = new RectF();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = new l();
        this.M = new androidx.recyclerview.widget.c();
        this.N = 0;
        this.O = -1;
        this.b0 = Float.MIN_VALUE;
        this.c0 = Float.MIN_VALUE;
        this.d0 = true;
        this.e0 = new c0();
        this.g0 = E0 ? new e.b() : null;
        this.h0 = new a0();
        this.k0 = false;
        this.l0 = false;
        this.m0 = new n();
        this.n0 = false;
        this.p0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new ArrayList();
        this.v0 = new b();
        this.x0 = 0;
        this.y0 = 0;
        this.z0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        this.b0 = kq7.a(viewConfiguration, context);
        this.c0 = kq7.b(viewConfiguration, context);
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.M.w(this.m0);
        o0();
        q0();
        p0();
        if (dq7.z(this) == 0) {
            dq7.B0(this, 1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = i15.f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        dq7.o0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        String string = typedArrayObtainStyledAttributes.getString(i15.o);
        if (typedArrayObtainStyledAttributes.getInt(i15.i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.g = typedArrayObtainStyledAttributes.getBoolean(i15.h, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(i15.j, false);
        this.t = z2;
        if (z2) {
            r0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(i15.m), typedArrayObtainStyledAttributes.getDrawable(i15.n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(i15.k), typedArrayObtainStyledAttributes.getDrawable(i15.l));
        }
        typedArrayObtainStyledAttributes.recycle();
        v(context, string, attributeSet, i2, 0);
        int[] iArr2 = A0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        dq7.o0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    public static class y extends z1 {
        public static final Parcelable.Creator<y> CREATOR = new a();
        public Parcelable f;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public y[] newArray(int i) {
                return new y[i];
            }
        }

        public y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        public void d(y yVar) {
            this.f = yVar.f;
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f, 0);
        }

        public y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.m;
        if (pVar != null) {
            return pVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}
