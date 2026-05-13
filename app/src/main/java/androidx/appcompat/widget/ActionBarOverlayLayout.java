package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import com.zepto.b05;
import com.zepto.dq7;
import com.zepto.q34;
import com.zepto.qv7;
import com.zepto.r34;
import com.zepto.s34;
import com.zepto.ue1;
import com.zepto.ve1;
import com.zepto.vz2;
import com.zepto.zy4;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements ue1, q34, r34 {
    public static final int[] F = {zy4.b, R.attr.windowContentOverlay};
    public ViewPropertyAnimator A;
    public final AnimatorListenerAdapter B;
    public final Runnable C;
    public final Runnable D;
    public final s34 E;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public ve1 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public qv7 u;
    public qv7 v;
    public qv7 w;
    public qv7 x;
    public d y;
    public OverScroller z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.k = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.d.animate().translationY(-ActionBarOverlayLayout.this.d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i);

        void d();

        void e(boolean z);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i, int i2) {
            super(i, i2);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        qv7 qv7Var = qv7.b;
        this.u = qv7Var;
        this.v = qv7Var;
        this.w = qv7Var;
        this.x = qv7Var;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        v(context);
        this.E = new s34(this);
    }

    public final void A() {
        u();
        this.C.run();
    }

    public final boolean B(float f) {
        this.z.fling(0, 0, 0, (int) f, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        return this.z.getFinalY() > this.d.getHeight();
    }

    @Override // com.zepto.ue1
    public void a(Menu menu, i.a aVar) {
        z();
        this.e.a(menu, aVar);
    }

    @Override // com.zepto.ue1
    public boolean b() {
        z();
        return this.e.b();
    }

    @Override // com.zepto.ue1
    public void c() {
        z();
        this.e.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // com.zepto.ue1
    public boolean d() {
        z();
        return this.e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f == null || this.g) {
            return;
        }
        int bottom = this.d.getVisibility() == 0 ? (int) (this.d.getBottom() + this.d.getTranslationY() + 0.5f) : 0;
        this.f.setBounds(0, bottom, getWidth(), this.f.getIntrinsicHeight() + bottom);
        this.f.draw(canvas);
    }

    @Override // com.zepto.ue1
    public boolean e() {
        z();
        return this.e.e();
    }

    @Override // com.zepto.ue1
    public boolean f() {
        z();
        return this.e.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // com.zepto.ue1
    public boolean g() {
        z();
        return this.e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        z();
        return this.e.getTitle();
    }

    @Override // com.zepto.q34
    public void h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.zepto.q34
    public void i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // com.zepto.q34
    public void j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // com.zepto.ue1
    public void k(int i) {
        z();
        if (i == 2) {
            this.e.v();
        } else if (i == 5) {
            this.e.w();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // com.zepto.ue1
    public void l() {
        z();
        this.e.h();
    }

    @Override // com.zepto.r34
    public void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(view, i, i2, i3, i4, i5);
    }

    @Override // com.zepto.q34
    public void n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // com.zepto.q34
    public boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        qv7 qv7VarX = qv7.x(windowInsets, this);
        boolean zQ = q(this.d, new Rect(qv7VarX.j(), qv7VarX.l(), qv7VarX.k(), qv7VarX.i()), true, true, false, true);
        dq7.f(this, qv7VarX, this.n);
        Rect rect = this.n;
        qv7 qv7VarN = qv7VarX.n(rect.left, rect.top, rect.right, rect.bottom);
        this.u = qv7VarN;
        if (!this.v.equals(qv7VarN)) {
            this.v = this.u;
            zQ = true;
        }
        if (this.o.equals(this.n)) {
            if (zQ) {
            }
            return qv7VarX.a().c().b().v();
        }
        this.o.set(this.n);
        requestLayout();
        return qv7VarX.a().c().b().v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        dq7.n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        e eVar = (e) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        boolean z = (dq7.M(this) & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.i && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        this.p.set(this.n);
        qv7 qv7Var = this.u;
        this.w = qv7Var;
        if (this.h || z) {
            this.w = new qv7.b(this.w).d(vz2.b(qv7Var.j(), this.w.l() + measuredHeight, this.w.k(), this.w.i())).a();
        } else {
            Rect rect = this.p;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.w = qv7Var.n(0, measuredHeight, 0, 0);
        }
        q(this.c, this.p, true, true, true, true);
        if (!this.x.equals(this.w)) {
            qv7 qv7Var2 = this.w;
            this.x = qv7Var2;
            dq7.g(this.c, qv7Var2);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        e eVar2 = (e) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.j || !z) {
            return false;
        }
        if (B(f2)) {
            p();
        } else {
            A();
        }
        this.k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.l + i2;
        this.l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.E.b(view, view2, i);
        this.l = getActionBarHideOffset();
        u();
        d dVar = this.y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.j && !this.k) {
            if (this.l <= this.d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.y;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        z();
        int i2 = this.m ^ i;
        this.m = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.y;
        if (dVar != null) {
            dVar.e(!z2);
            if (z || !z2) {
                this.y.a();
            } else {
                this.y.f();
            }
        }
        if ((i2 & 256) == 0 || this.y == null) {
            return;
        }
        dq7.n0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        d dVar = this.y;
        if (dVar != null) {
            dVar.c(i);
        }
    }

    public final void p() {
        u();
        this.D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        u();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.y = dVar;
        if (getWindowToken() != null) {
            this.y.c(this.b);
            int i = this.m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                dq7.n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.j) {
            this.j = z;
            if (z) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        z();
        this.e.setIcon(i);
    }

    public void setLogo(int i) {
        z();
        this.e.r(i);
    }

    public void setOverlayMode(boolean z) {
        this.h = z;
        this.g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // com.zepto.ue1
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.e.setWindowCallback(callback);
    }

    @Override // com.zepto.ue1
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ve1 t(View view) {
        if (view instanceof ve1) {
            return (ve1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void u() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.g = context.getApplicationInfo().targetSdkVersion < 19;
        this.z = new OverScroller(context);
    }

    public boolean w() {
        return this.h;
    }

    public final void x() {
        u();
        postDelayed(this.D, 600L);
    }

    public final void y() {
        u();
        postDelayed(this.C, 600L);
    }

    public void z() {
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(b05.b);
            this.d = (ActionBarContainer) findViewById(b05.c);
            this.e = t(findViewById(b05.a));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.e.setIcon(drawable);
    }
}
