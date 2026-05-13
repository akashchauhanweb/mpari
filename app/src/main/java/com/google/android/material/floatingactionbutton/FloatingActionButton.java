package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.zepto.a72;
import com.zepto.br3;
import com.zepto.c06;
import com.zepto.dq7;
import com.zepto.e06;
import com.zepto.ex3;
import com.zepto.g15;
import com.zepto.h06;
import com.zepto.if6;
import com.zepto.ir;
import com.zepto.jz4;
import com.zepto.ld2;
import com.zepto.lu4;
import com.zepto.m15;
import com.zepto.nr;
import com.zepto.pi1;
import com.zepto.t62;
import com.zepto.tw1;
import com.zepto.u62;
import com.zepto.vq3;
import com.zepto.xy4;
import com.zepto.yt7;
import com.zepto.zr7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends yt7 implements t62, h06, CoordinatorLayout.b {
    public static final int r = g15.g;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public final Rect m;
    public final Rect n;
    public final nr o;
    public final u62 p;
    public com.google.android.material.floatingactionbutton.a q;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {
        public Rect a;
        public boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private static boolean J(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void K(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                dq7.b0(floatingActionButton, i);
            }
            if (i2 != 0) {
                dq7.a0(floatingActionButton, i2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!J(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List listR = coordinatorLayout.r(floatingActionButton);
            int size = listR.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) listR.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (J(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i);
            K(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean N(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            pi1.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean P(View view, FloatingActionButton floatingActionButton) {
            if (!N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.T1);
            this.b = typedArrayObtainStyledAttributes.getBoolean(m15.U1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: L */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: M */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.p(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
    }

    public class b implements c06 {
        public b() {
        }

        @Override // com.zepto.c06
        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.m.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.j, i2 + FloatingActionButton.this.j, i3 + FloatingActionButton.this.j, i4 + FloatingActionButton.this.j);
        }

        @Override // com.zepto.c06
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.zepto.c06
        public boolean c() {
            return FloatingActionButton.this.l;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.s);
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.q == null) {
            this.q = e();
        }
        return this.q;
    }

    @Override // com.zepto.t62
    public boolean a() {
        return this.p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().B(getDrawableState());
    }

    public final com.google.android.material.floatingactionbutton.a e() {
        return new ld2(this, new b());
    }

    public void f(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        j(rect);
    }

    public final int g(int i) {
        int i2 = this.i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(jz4.d) : resources.getDimensionPixelSize(jz4.c) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().j();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().p();
    }

    public Drawable getContentBackground() {
        return getImpl().i();
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        return this.p.b();
    }

    public ex3 getHideMotionSpec() {
        return getImpl().l();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    public e06 getShapeAppearanceModel() {
        return (e06) lu4.g(getImpl().q());
    }

    public ex3 getShowMotionSpec() {
        return getImpl().r();
    }

    public int getSize() {
        return this.h;
    }

    public int getSizeDimension() {
        return g(this.h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.l;
    }

    public final void h(Rect rect) {
        f(rect);
        int i = -this.q.s();
        rect.inset(i, i);
    }

    public void i(a aVar, boolean z) {
        getImpl().t(m(aVar), z);
    }

    public final void j(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().x();
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            tw1.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(ir.e(colorForState, mode));
    }

    public void l(a aVar, boolean z) {
        getImpl().Z(m(aVar), z);
    }

    public final a.j m(a aVar) {
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().y();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().A();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.j = (sizeDimension - this.k) / 2;
        getImpl().c0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a72)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a72 a72Var = (a72) parcelable;
        super.onRestoreInstanceState(a72Var.c());
        this.p.d((Bundle) lu4.g((Bundle) a72Var.f.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        a72 a72Var = new a72(parcelableOnSaveInstanceState);
        a72Var.f.put("expandableWidgetHelper", this.p.e());
        return a72Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            h(this.n);
            if (!this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            getImpl().I(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            getImpl().J(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().K(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().N(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().R(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().d0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().k()) {
            getImpl().L(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.p.f(i);
    }

    public void setHideMotionSpec(ex3 ex3Var) {
        getImpl().M(ex3Var);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(ex3.c(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().b0();
            if (this.d != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.o.i(i);
        k();
    }

    public void setMaxImageSize(int i) {
        this.k = i;
        getImpl().P(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().F();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().F();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().T(z);
    }

    @Override // com.zepto.h06
    public void setShapeAppearanceModel(e06 e06Var) {
        getImpl().U(e06Var);
    }

    public void setShowMotionSpec(ex3 ex3Var) {
        getImpl().V(ex3Var);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(ex3.c(getContext(), i));
    }

    public void setSize(int i) {
        this.i = 0;
        if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().G();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.l != z) {
            this.l = z;
            getImpl().z();
        }
    }

    @Override // com.zepto.yt7, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = r;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        this.m = new Rect();
        this.n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = if6.i(context2, attributeSet, m15.D1, i, i2, new int[0]);
        this.b = vq3.a(context2, typedArrayI, m15.F1);
        this.c = zr7.i(typedArrayI.getInt(m15.G1, -1), null);
        this.f = vq3.a(context2, typedArrayI, m15.Q1);
        this.h = typedArrayI.getInt(m15.L1, -1);
        this.i = typedArrayI.getDimensionPixelSize(m15.K1, 0);
        this.g = typedArrayI.getDimensionPixelSize(m15.H1, 0);
        float dimension = typedArrayI.getDimension(m15.I1, 0.0f);
        float dimension2 = typedArrayI.getDimension(m15.N1, 0.0f);
        float dimension3 = typedArrayI.getDimension(m15.P1, 0.0f);
        this.l = typedArrayI.getBoolean(m15.S1, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(jz4.W);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(m15.O1, 0));
        ex3 ex3VarB = ex3.b(context2, typedArrayI, m15.R1);
        ex3 ex3VarB2 = ex3.b(context2, typedArrayI, m15.M1);
        e06 e06VarM = e06.g(context2, attributeSet, i, i2, e06.m).m();
        boolean z = typedArrayI.getBoolean(m15.J1, false);
        setEnabled(typedArrayI.getBoolean(m15.E1, true));
        typedArrayI.recycle();
        nr nrVar = new nr(this);
        this.o = nrVar;
        nrVar.g(attributeSet, i);
        this.p = new u62(this);
        getImpl().U(e06VarM);
        getImpl().u(this.b, this.c, this.f, this.g);
        getImpl().Q(dimensionPixelSize);
        getImpl().K(dimension);
        getImpl().N(dimension2);
        getImpl().R(dimension3);
        getImpl().V(ex3VarB);
        getImpl().M(ex3VarB2);
        getImpl().L(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            getImpl().S(this.f);
        }
    }
}
