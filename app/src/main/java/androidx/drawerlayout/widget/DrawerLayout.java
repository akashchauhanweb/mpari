package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.zepto.dq7;
import com.zepto.hz4;
import com.zepto.jk2;
import com.zepto.mh4;
import com.zepto.oq7;
import com.zepto.qv7;
import com.zepto.r3;
import com.zepto.tw1;
import com.zepto.u3;
import com.zepto.vy4;
import com.zepto.vz2;
import com.zepto.x15;
import com.zepto.x2;
import com.zepto.yy0;
import com.zepto.z1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements mh4 {
    public static final int[] L = {R.attr.colorPrimaryDark};
    public static final int[] M = {R.attr.layout_gravity};
    public static final boolean N;
    public static final boolean O;
    public static boolean P;
    public CharSequence A;
    public Object B;
    public boolean C;
    public Drawable D;
    public Drawable E;
    public Drawable F;
    public Drawable G;
    public final ArrayList H;
    public Rect I;
    public Matrix J;
    public final u3 K;
    public final d a;
    public float b;
    public int c;
    public int d;
    public float e;
    public Paint f;
    public final oq7 g;
    public final oq7 h;
    public final i i;
    public final i j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public e s;
    public List t;
    public float u;
    public float v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public CharSequence z;

    public class a implements u3 {
        public a() {
        }

        @Override // com.zepto.u3
        public boolean a(View view, u3.a aVar) {
            if (!DrawerLayout.this.D(view) || DrawerLayout.this.s(view) == 2) {
                return false;
            }
            DrawerLayout.this.g(view);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).R(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends x2 {
        public final Rect d = new Rect();

        public c() {
        }

        @Override // com.zepto.x2
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewQ = DrawerLayout.this.q();
            if (viewQ == null) {
                return true;
            }
            CharSequence charSequenceT = DrawerLayout.this.t(DrawerLayout.this.u(viewQ));
            if (charSequenceT == null) {
                return true;
            }
            text.add(charSequenceT);
            return true;
        }

        @Override // com.zepto.x2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            if (DrawerLayout.N) {
                super.g(view, r3Var);
            } else {
                r3 r3VarK = r3.K(r3Var);
                super.g(view, r3VarK);
                r3Var.q0(view);
                Object objH = dq7.H(view);
                if (objH instanceof View) {
                    r3Var.k0((View) objH);
                }
                o(r3Var, r3VarK);
                r3VarK.M();
                n(r3Var, (ViewGroup) view);
            }
            r3Var.U("androidx.drawerlayout.widget.DrawerLayout");
            r3Var.c0(false);
            r3Var.d0(false);
            r3Var.N(r3.a.e);
            r3Var.N(r3.a.f);
        }

        @Override // com.zepto.x2
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.B(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(r3 r3Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.B(childAt)) {
                    r3Var.c(childAt);
                }
            }
        }

        public final void o(r3 r3Var, r3 r3Var2) {
            Rect rect = this.d;
            r3Var2.k(rect);
            r3Var.R(rect);
            r3Var.v0(r3Var2.H());
            r3Var.i0(r3Var2.q());
            r3Var.U(r3Var2.m());
            r3Var.Y(r3Var2.o());
            r3Var.a0(r3Var2.z());
            r3Var.d0(r3Var2.B());
            r3Var.O(r3Var2.v());
            r3Var.o0(r3Var2.F());
            r3Var.a(r3Var2.i());
        }
    }

    public static final class d extends x2 {
        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            if (DrawerLayout.B(view)) {
                return;
            }
            r3Var.k0(null);
        }
    }

    public interface e {
        void a(int i);

        void b(View view, float f);

        void c(View view);

        void d(View view);
    }

    public static abstract class h implements e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view, float f) {
        }
    }

    public class i extends oq7.c {
        public final int a;
        public oq7 b;
        public final Runnable c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.o();
            }
        }

        public i(int i) {
            this.a = i;
        }

        @Override // com.zepto.oq7.c
        public int a(View view, int i, int i2) {
            if (DrawerLayout.this.d(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // com.zepto.oq7.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.zepto.oq7.c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.zepto.oq7.c
        public void f(int i, int i2) {
            View viewO = (i & 1) == 1 ? DrawerLayout.this.o(3) : DrawerLayout.this.o(5);
            if (viewO == null || DrawerLayout.this.s(viewO) != 0) {
                return;
            }
            this.b.b(viewO, i2);
        }

        @Override // com.zepto.oq7.c
        public boolean g(int i) {
            return false;
        }

        @Override // com.zepto.oq7.c
        public void h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // com.zepto.oq7.c
        public void i(View view, int i) {
            ((f) view.getLayoutParams()).c = false;
            n();
        }

        @Override // com.zepto.oq7.c
        public void j(int i) {
            DrawerLayout.this.W(i, this.b.v());
        }

        @Override // com.zepto.oq7.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = (DrawerLayout.this.d(view, 3) ? i + r3 : DrawerLayout.this.getWidth() - i) / view.getWidth();
            DrawerLayout.this.T(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // com.zepto.oq7.c
        public void l(View view, float f, float f2) {
            int i;
            float fV = DrawerLayout.this.v(view);
            int width = view.getWidth();
            if (DrawerLayout.this.d(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && fV > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fV > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.O(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // com.zepto.oq7.c
        public boolean m(View view, int i) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.d(view, this.a) && DrawerLayout.this.s(view) == 0;
        }

        public final void n() {
            View viewO = DrawerLayout.this.o(this.a == 3 ? 5 : 3);
            if (viewO != null) {
                DrawerLayout.this.g(viewO);
            }
        }

        public void o() {
            View viewO;
            int width;
            int iX = this.b.x();
            boolean z = this.a == 3;
            if (z) {
                viewO = DrawerLayout.this.o(3);
                width = (viewO != null ? -viewO.getWidth() : 0) + iX;
            } else {
                viewO = DrawerLayout.this.o(5);
                width = DrawerLayout.this.getWidth() - iX;
            }
            if (viewO != null) {
                if (((!z || viewO.getLeft() >= width) && (z || viewO.getLeft() <= width)) || DrawerLayout.this.s(viewO) != 0) {
                    return;
                }
                f fVar = (f) viewO.getLayoutParams();
                this.b.Q(viewO, width, viewO.getTop());
                fVar.c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.c();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void q(oq7 oq7Var) {
            this.b = oq7Var;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        N = true;
        O = true;
        P = i2 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vy4.a);
    }

    public static boolean B(View view) {
        return (dq7.z(view) == 4 || dq7.z(view) == 2) ? false : true;
    }

    public static String x(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    public static boolean y(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public final boolean A() {
        return q() != null;
    }

    public boolean C(View view) {
        return ((f) view.getLayoutParams()).a == 0;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean E(View view) {
        int iB = jk2.b(((f) view.getLayoutParams()).a, dq7.B(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean F(View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean G(float f2, float f3, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int) f2, (int) f3);
    }

    public final void H(Drawable drawable, int i2) {
        if (drawable == null || !tw1.h(drawable)) {
            return;
        }
        tw1.m(drawable, i2);
    }

    public void I(View view, float f2) {
        float fV = v(view);
        float width = view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (fV * width));
        if (!d(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        T(view, f2);
    }

    public void J(int i2) {
        K(i2, true);
    }

    public void K(int i2, boolean z) {
        View viewO = o(i2);
        if (viewO != null) {
            M(viewO, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + x(i2));
    }

    public void L(View view) {
        M(view, true);
    }

    public void M(View view, boolean z) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.m) {
            fVar.b = 1.0f;
            fVar.d = 1;
            V(view, true);
            U(view);
        } else if (z) {
            fVar.d |= 2;
            if (d(view, 3)) {
                this.g.Q(view, 0, view.getTop());
            } else {
                this.h.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            I(view, 1.0f);
            W(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void N(e eVar) {
        List list;
        if (eVar == null || (list = this.t) == null) {
            return;
        }
        list.remove(eVar);
    }

    public final Drawable O() {
        int iB = dq7.B(this);
        if (iB == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                H(drawable, iB);
                return this.D;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                H(drawable2, iB);
                return this.E;
            }
        }
        return this.F;
    }

    public final Drawable P() {
        int iB = dq7.B(this);
        if (iB == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                H(drawable, iB);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.D;
            if (drawable2 != null) {
                H(drawable2, iB);
                return this.D;
            }
        }
        return this.G;
    }

    public final void Q() {
        if (O) {
            return;
        }
        this.x = O();
        this.y = P();
    }

    public void R(Object obj, boolean z) {
        this.B = obj;
        this.C = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void S(int i2, int i3) {
        View viewO;
        int iB = jk2.b(i3, dq7.B(this));
        if (i3 == 3) {
            this.n = i2;
        } else if (i3 == 5) {
            this.o = i2;
        } else if (i3 == 8388611) {
            this.p = i2;
        } else if (i3 == 8388613) {
            this.q = i2;
        }
        if (i2 != 0) {
            (iB == 3 ? this.g : this.h).a();
        }
        if (i2 != 1) {
            if (i2 == 2 && (viewO = o(iB)) != null) {
                L(viewO);
                return;
            }
            return;
        }
        View viewO2 = o(iB);
        if (viewO2 != null) {
            g(viewO2);
        }
    }

    public void T(View view, float f2) {
        f fVar = (f) view.getLayoutParams();
        if (f2 == fVar.b) {
            return;
        }
        fVar.b = f2;
        m(view, f2);
    }

    public final void U(View view) {
        r3.a aVar = r3.a.y;
        dq7.k0(view, aVar.b());
        if (!D(view) || s(view) == 2) {
            return;
        }
        dq7.m0(view, aVar, null, this.K);
    }

    public final void V(View view, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z || E(childAt)) && !(z && childAt == view)) {
                dq7.B0(childAt, 4);
            } else {
                dq7.B0(childAt, 1);
            }
        }
    }

    public void W(int i2, View view) {
        int i3;
        int iA = this.g.A();
        int iA2 = this.h.A();
        if (iA == 1 || iA2 == 1) {
            i3 = 1;
        } else {
            i3 = 2;
            if (iA != 2 && iA2 != 2) {
                i3 = 0;
            }
        }
        if (view != null && i2 == 0) {
            float f2 = ((f) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                k(view);
            } else if (f2 == 1.0f) {
                l(view);
            }
        }
        if (i3 != this.k) {
            this.k = i3;
            List list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.t.get(size)).a(i3);
                }
            }
        }
    }

    @Override // com.zepto.mh4
    public void a() {
        J(8388611);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!E(childAt)) {
                this.H.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i2, i3);
                z = true;
            }
        }
        if (!z) {
            int size = this.H.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) this.H.get(i5);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (p() != null || E(view)) {
            dq7.B0(view, 4);
        } else {
            dq7.B0(view, 1);
        }
        if (N) {
            return;
        }
        dq7.q0(view, this.a);
    }

    public void b(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(eVar);
    }

    public void c() {
        if (this.r) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.r = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // com.zepto.mh4
    public void close() {
        e(8388611);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            fMax = Math.max(fMax, ((f) getChildAt(i2).getLayoutParams()).b);
        }
        this.e = fMax;
        boolean zM = this.g.m(true);
        boolean zM2 = this.h.m(true);
        if (zM || zM2) {
            dq7.h0(this);
        }
    }

    public boolean d(View view, int i2) {
        return (u(view) & i2) == i2;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (G(x, y, childAt) && !C(childAt) && n(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zC = C(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i2 = 0;
        if (zC) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && y(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (d(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f2 = this.e;
        if (f2 > 0.0f && zC) {
            this.f.setColor((this.d & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f2)) << 24));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.f);
        } else if (this.x != null && d(view, 3)) {
            int intrinsicWidth = this.x.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.g.x(), 1.0f));
            this.x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.x.setAlpha((int) (fMax * 255.0f));
            this.x.draw(canvas);
        } else if (this.y != null && d(view, 5)) {
            int intrinsicWidth2 = this.y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.h.x(), 1.0f));
            this.y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.y.setAlpha((int) (fMax2 * 255.0f));
            this.y.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i2) {
        f(i2, true);
    }

    public void f(int i2, boolean z) {
        View viewO = o(i2);
        if (viewO != null) {
            h(viewO, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + x(i2));
    }

    public void g(View view) {
        h(view, true);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.w;
    }

    public void h(View view, boolean z) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.m) {
            fVar.b = 0.0f;
            fVar.d = 0;
        } else if (z) {
            fVar.d |= 4;
            if (d(view, 3)) {
                this.g.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.h.Q(view, getWidth(), view.getTop());
            }
        } else {
            I(view, 0.0f);
            W(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void i() {
        j(false);
    }

    public void j(boolean z) {
        int childCount = getChildCount();
        boolean zQ = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z || fVar.c)) {
                zQ |= d(childAt, 3) ? this.g.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.h.Q(childAt, getWidth(), childAt.getTop());
                fVar.c = false;
            }
        }
        this.i.p();
        this.j.p();
        if (zQ) {
            invalidate();
        }
    }

    public void k(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.d & 1) == 1) {
            fVar.d = 0;
            List list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.t.get(size)).d(view);
                }
            }
            V(view, false);
            U(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void l(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.d & 1) == 0) {
            fVar.d = 1;
            List list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.t.get(size)).c(view);
                }
            }
            V(view, true);
            U(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void m(View view, float f2) {
        List list = this.t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.t.get(size)).b(view, f2);
            }
        }
    }

    public final boolean n(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventW = w(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventW);
            motionEventW.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    public View o(int i2) {
        int iB = jk2.b(i2, dq7.B(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((u(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.C || this.w == null) {
            return;
        }
        Object obj = this.B;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.w.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            com.zepto.oq7 r1 = r6.g
            boolean r1 = r1.P(r7)
            com.zepto.oq7 r2 = r6.h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            com.zepto.oq7 r7 = r6.g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$i r7 = r6.i
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$i r7 = r6.j
            r7.p()
            goto L36
        L31:
            r6.j(r2)
            r6.r = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.u = r0
            r6.v = r7
            float r4 = r6.e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            com.zepto.oq7 r4 = r6.g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.C(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.r = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.z()
            if (r7 != 0) goto L70
            boolean r7 = r6.r
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !A()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View viewQ = q();
        if (viewQ != null && s(viewQ) == 0) {
            i();
        }
        return viewQ != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f2;
        int i6;
        boolean z2 = true;
        this.l = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (C(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i9, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (d(childAt, 3)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (fVar.b * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i7 - r11) / f4;
                        i6 = i7 - ((int) (fVar.b * f4));
                    }
                    boolean z3 = f2 != fVar.b ? z2 : false;
                    int i10 = fVar.a & 112;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight + i16);
                    } else {
                        int i17 = i5 - i3;
                        childAt.layout(i6, (i17 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i17 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z3) {
                        T(childAt, f2);
                    }
                    int i18 = fVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i8++;
            z2 = true;
        }
        if (P && (rootWindowInsets = getRootWindowInsets()) != null) {
            vz2 vz2VarH = qv7.w(rootWindowInsets).h();
            oq7 oq7Var = this.g;
            oq7Var.L(Math.max(oq7Var.w(), vz2VarH.a));
            oq7 oq7Var2 = this.h;
            oq7Var2.L(Math.max(oq7Var2.w(), vz2VarH.c));
        }
        this.l = false;
        this.m = false;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.B != null && dq7.y(this);
        int iB = dq7.B(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z) {
                    int iB2 = jk2.b(fVar.a, iB);
                    if (dq7.y(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.B;
                        if (iB2 == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB2 == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.B;
                        if (iB2 == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB2 == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (C(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!E(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (O) {
                        float fW = dq7.w(childAt);
                        float f2 = this.b;
                        if (fW != f2) {
                            dq7.y0(childAt, f2);
                        }
                    }
                    int iU = u(childAt) & 7;
                    boolean z4 = iU == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + x(iU) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewO;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.c());
        int i2 = gVar.f;
        if (i2 != 0 && (viewO = o(i2)) != null) {
            L(viewO);
        }
        int i3 = gVar.g;
        if (i3 != 3) {
            S(i3, 3);
        }
        int i4 = gVar.h;
        if (i4 != 3) {
            S(i4, 5);
        }
        int i5 = gVar.i;
        if (i5 != 3) {
            S(i5, 8388611);
        }
        int i6 = gVar.j;
        if (i6 != 3) {
            S(i6, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        Q();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            f fVar = (f) getChildAt(i2).getLayoutParams();
            int i3 = fVar.d;
            boolean z = i3 == 1;
            boolean z2 = i3 == 2;
            if (z || z2) {
                gVar.f = fVar.a;
                break;
            }
        }
        gVar.g = this.n;
        gVar.h = this.o;
        gVar.i = this.p;
        gVar.j = this.q;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.zepto.oq7 r0 = r6.g
            r0.F(r7)
            com.zepto.oq7 r0 = r6.h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.j(r2)
            r6.r = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            com.zepto.oq7 r3 = r6.g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.C(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.u
            float r0 = r0 - r3
            float r3 = r6.v
            float r7 = r7 - r3
            com.zepto.oq7 r3 = r6.g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.p()
            if (r7 == 0) goto L5a
            int r7 = r6.s(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.j(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.u = r0
            r6.v = r7
            r6.r = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public View p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((f) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View q() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt) && F(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int r(int i2) {
        int iB = dq7.B(this);
        if (i2 == 3) {
            int i3 = this.n;
            if (i3 != 3) {
                return i3;
            }
            int i4 = iB == 0 ? this.p : this.q;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i2 == 5) {
            int i5 = this.o;
            if (i5 != 3) {
                return i5;
            }
            int i6 = iB == 0 ? this.q : this.p;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i2 == 8388611) {
            int i7 = this.p;
            if (i7 != 3) {
                return i7;
            }
            int i8 = iB == 0 ? this.n : this.o;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i2 != 8388613) {
            return 0;
        }
        int i9 = this.q;
        if (i9 != 3) {
            return i9;
        }
        int i10 = iB == 0 ? this.o : this.n;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            j(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.l) {
            return;
        }
        super.requestLayout();
    }

    public int s(View view) {
        if (E(view)) {
            return r(((f) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerElevation(float f2) {
        this.b = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt)) {
                dq7.y0(childAt, this.b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.s;
        if (eVar2 != null) {
            N(eVar2);
        }
        if (eVar != null) {
            b(eVar);
        }
        this.s = eVar;
    }

    public void setDrawerLockMode(int i2) {
        S(i2, 3);
        S(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.d = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.w = new ColorDrawable(i2);
        invalidate();
    }

    public CharSequence t(int i2) {
        int iB = jk2.b(i2, dq7.B(this));
        if (iB == 3) {
            return this.z;
        }
        if (iB == 5) {
            return this.A;
        }
        return null;
    }

    public int u(View view) {
        return jk2.b(((f) view.getLayoutParams()).a, dq7.B(this));
    }

    public float v(View view) {
        return ((f) view.getLayoutParams()).b;
    }

    public final MotionEvent w(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.J == null) {
                this.J = new Matrix();
            }
            matrix.invert(this.J);
            motionEventObtain.transform(this.J);
        }
        return motionEventObtain;
    }

    public final boolean z() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((f) getChildAt(i2).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new d();
        this.d = -1728053248;
        this.f = new Paint();
        this.m = true;
        this.n = 3;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.K = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.c = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        i iVar = new i(3);
        this.i = iVar;
        i iVar2 = new i(5);
        this.j = iVar2;
        oq7 oq7VarN = oq7.n(this, 1.0f, iVar);
        this.g = oq7VarN;
        oq7VarN.M(1);
        oq7VarN.N(f3);
        iVar.q(oq7VarN);
        oq7 oq7VarN2 = oq7.n(this, 1.0f, iVar2);
        this.h = oq7VarN2;
        oq7VarN2.M(2);
        oq7VarN2.N(f3);
        iVar2.q(oq7VarN2);
        setFocusableInTouchMode(true);
        dq7.B0(this, 1);
        dq7.q0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (dq7.y(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(L);
            try {
                this.w = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, x15.b, i2, 0);
        try {
            int i3 = x15.c;
            if (typedArrayObtainStyledAttributes2.hasValue(i3)) {
                this.b = typedArrayObtainStyledAttributes2.getDimension(i3, 0.0f);
            } else {
                this.b = getResources().getDimension(hz4.a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.H = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i2) {
        this.w = i2 != 0 ? yy0.e(getContext(), i2) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;
        public int d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.a = 0;
            this.a = fVar.a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    public static class g extends z1 {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = 0;
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }
}
