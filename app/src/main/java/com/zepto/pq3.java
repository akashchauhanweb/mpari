package com.zepto;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.zepto.e06;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class pq3 {
    public static final Drawable A;
    public static final double z = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final wq3 c;
    public final wq3 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public e06 m;
    public ColorStateList n;
    public Drawable o;
    public LayerDrawable p;
    public wq3 q;
    public wq3 r;
    public boolean t;
    public ValueAnimator u;
    public final TimeInterpolator v;
    public final int w;
    public final int x;
    public final Rect b = new Rect();
    public boolean s = false;
    public float y = 0.0f;

    public class a extends InsetDrawable {
        public a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public pq3(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.a = materialCardView;
        wq3 wq3Var = new wq3(materialCardView.getContext(), attributeSet, i, i2);
        this.c = wq3Var;
        wq3Var.M(materialCardView.getContext());
        wq3Var.b0(-12303292);
        e06.b bVarV = wq3Var.D().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, m15.j0, i, g15.a);
        int i3 = m15.k0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.d = new wq3();
        Z(bVarV.m());
        this.v = gx3.g(materialCardView.getContext(), xy4.M, rp.a);
        this.w = gx3.f(materialCardView.getContext(), xy4.G, 300);
        this.x = gx3.f(materialCardView.getContext(), xy4.F, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ColorStateList A() {
        return this.n;
    }

    public int B() {
        return this.h;
    }

    public Rect C() {
        return this.b;
    }

    public final Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public boolean E() {
        return this.s;
    }

    public boolean F() {
        return this.t;
    }

    public final boolean G() {
        return (this.g & 80) == 80;
    }

    public final boolean H() {
        return (this.g & 8388613) == 8388613;
    }

    public final /* synthetic */ void I(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.j.setAlpha((int) (255.0f * fFloatValue));
        this.y = fFloatValue;
    }

    public void J(TypedArray typedArray) {
        ColorStateList colorStateListA = vq3.a(this.a.getContext(), typedArray, m15.G3);
        this.n = colorStateListA;
        if (colorStateListA == null) {
            this.n = ColorStateList.valueOf(-1);
        }
        this.h = typedArray.getDimensionPixelSize(m15.H3, 0);
        boolean z2 = typedArray.getBoolean(m15.y3, false);
        this.t = z2;
        this.a.setLongClickable(z2);
        this.l = vq3.a(this.a.getContext(), typedArray, m15.E3);
        R(vq3.d(this.a.getContext(), typedArray, m15.A3));
        U(typedArray.getDimensionPixelSize(m15.D3, 0));
        T(typedArray.getDimensionPixelSize(m15.C3, 0));
        this.g = typedArray.getInteger(m15.B3, 8388661);
        ColorStateList colorStateListA2 = vq3.a(this.a.getContext(), typedArray, m15.F3);
        this.k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.k = ColorStateList.valueOf(sq3.d(this.a, xy4.h));
        }
        N(vq3.a(this.a.getContext(), typedArray, m15.z3));
        l0();
        i0();
        m0();
        this.a.setBackgroundInternal(D(this.c));
        Drawable drawableT = f0() ? t() : this.d;
        this.i = drawableT;
        this.a.setForeground(D(drawableT));
    }

    public void K(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.p != null) {
            if (this.a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = H() ? ((i - this.e) - this.f) - iCeil2 : this.e;
            int i6 = G() ? this.e : ((i2 - this.e) - this.f) - iCeil;
            int i7 = H() ? this.e : ((i - this.e) - this.f) - iCeil2;
            int i8 = G() ? ((i2 - this.e) - this.f) - iCeil : this.e;
            if (dq7.B(this.a) == 1) {
                i4 = i7;
                i3 = i5;
            } else {
                i3 = i7;
                i4 = i5;
            }
            this.p.setLayerInset(2, i4, i8, i3, i6);
        }
    }

    public void L(boolean z2) {
        this.s = z2;
    }

    public void M(ColorStateList colorStateList) {
        this.c.W(colorStateList);
    }

    public void N(ColorStateList colorStateList) {
        wq3 wq3Var = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        wq3Var.W(colorStateList);
    }

    public void O(boolean z2) {
        this.t = z2;
    }

    public void P(boolean z2) {
        Q(z2, false);
    }

    public void Q(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (z3) {
                b(z2);
            } else {
                drawable.setAlpha(z2 ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
                this.y = z2 ? 1.0f : 0.0f;
            }
        }
    }

    public void R(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = tw1.r(drawable).mutate();
            this.j = drawableMutate;
            tw1.o(drawableMutate, this.l);
            P(this.a.isChecked());
        } else {
            this.j = A;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(zz4.D, this.j);
        }
    }

    public void S(int i) {
        this.g = i;
        K(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    }

    public void T(int i) {
        this.e = i;
    }

    public void U(int i) {
        this.f = i;
    }

    public void V(ColorStateList colorStateList) {
        this.l = colorStateList;
        Drawable drawable = this.j;
        if (drawable != null) {
            tw1.o(drawable, colorStateList);
        }
    }

    public void W(float f) {
        Z(this.m.w(f));
        this.i.invalidateSelf();
        if (e0() || d0()) {
            h0();
        }
        if (e0()) {
            k0();
        }
    }

    public void X(float f) {
        this.c.X(f);
        wq3 wq3Var = this.d;
        if (wq3Var != null) {
            wq3Var.X(f);
        }
        wq3 wq3Var2 = this.r;
        if (wq3Var2 != null) {
            wq3Var2.X(f);
        }
    }

    public void Y(ColorStateList colorStateList) {
        this.k = colorStateList;
        l0();
    }

    public void Z(e06 e06Var) {
        this.m = e06Var;
        this.c.setShapeAppearanceModel(e06Var);
        this.c.a0(!r0.P());
        wq3 wq3Var = this.d;
        if (wq3Var != null) {
            wq3Var.setShapeAppearanceModel(e06Var);
        }
        wq3 wq3Var2 = this.r;
        if (wq3Var2 != null) {
            wq3Var2.setShapeAppearanceModel(e06Var);
        }
        wq3 wq3Var3 = this.q;
        if (wq3Var3 != null) {
            wq3Var3.setShapeAppearanceModel(e06Var);
        }
    }

    public void a0(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        m0();
    }

    public void b(boolean z2) {
        float f = z2 ? 1.0f : 0.0f;
        float f2 = z2 ? 1.0f - this.y : this.y;
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.y, f);
        this.u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.oq3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.a.I(valueAnimator2);
            }
        });
        this.u.setInterpolator(this.v);
        this.u.setDuration((long) ((z2 ? this.w : this.x) * f2));
        this.u.start();
    }

    public void b0(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        m0();
    }

    public final float c() {
        return Math.max(Math.max(d(this.m.q(), this.c.F()), d(this.m.s(), this.c.G())), Math.max(d(this.m.k(), this.c.t()), d(this.m.i(), this.c.s())));
    }

    public void c0(int i, int i2, int i3, int i4) {
        this.b.set(i, i2, i3, i4);
        h0();
    }

    public final float d(pz0 pz0Var, float f) {
        if (pz0Var instanceof ye5) {
            return (float) ((1.0d - z) * ((double) f));
        }
        if (pz0Var instanceof k41) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final boolean d0() {
        return this.a.getPreventCornerOverlap() && !g();
    }

    public final float e() {
        return this.a.getMaxCardElevation() + (e0() ? c() : 0.0f);
    }

    public final boolean e0() {
        return this.a.getPreventCornerOverlap() && g() && this.a.getUseCompatPadding();
    }

    public final float f() {
        return (this.a.getMaxCardElevation() * 1.5f) + (e0() ? c() : 0.0f);
    }

    public final boolean f0() {
        if (this.a.isClickable()) {
            return true;
        }
        View view = this.a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final boolean g() {
        return this.c.P();
    }

    public void g0() {
        Drawable drawable = this.i;
        Drawable drawableT = f0() ? t() : this.d;
        this.i = drawableT;
        if (drawable != drawableT) {
            j0(drawableT);
        }
    }

    public final Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        wq3 wq3VarJ = j();
        this.q = wq3VarJ;
        wq3VarJ.W(this.k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.q);
        return stateListDrawable;
    }

    public void h0() {
        int iC = (int) (((d0() || e0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.a;
        Rect rect = this.b;
        materialCardView.g(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    public final Drawable i() {
        if (!ge5.a) {
            return h();
        }
        this.r = j();
        return new RippleDrawable(this.k, null, this.r);
    }

    public void i0() {
        this.c.V(this.a.getCardElevation());
    }

    public final wq3 j() {
        return new wq3(this.m);
    }

    public final void j0(Drawable drawable) {
        if (this.a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.a.getForeground()).setDrawable(drawable);
        } else {
            this.a.setForeground(D(drawable));
        }
    }

    public void k() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public void k0() {
        if (!E()) {
            this.a.setBackgroundInternal(D(this.c));
        }
        this.a.setForeground(D(this.i));
    }

    public wq3 l() {
        return this.c;
    }

    public final void l0() {
        Drawable drawable;
        if (ge5.a && (drawable = this.o) != null) {
            ((RippleDrawable) drawable).setColor(this.k);
            return;
        }
        wq3 wq3Var = this.q;
        if (wq3Var != null) {
            wq3Var.W(this.k);
        }
    }

    public ColorStateList m() {
        return this.c.x();
    }

    public void m0() {
        this.d.d0(this.h, this.n);
    }

    public ColorStateList n() {
        return this.d.x();
    }

    public Drawable o() {
        return this.j;
    }

    public int p() {
        return this.g;
    }

    public int q() {
        return this.e;
    }

    public int r() {
        return this.f;
    }

    public ColorStateList s() {
        return this.l;
    }

    public final Drawable t() {
        if (this.o == null) {
            this.o = i();
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, zz4.D);
        }
        return this.p;
    }

    public float u() {
        return this.c.F();
    }

    public final float v() {
        if (this.a.getPreventCornerOverlap() && this.a.getUseCompatPadding()) {
            return (float) ((1.0d - z) * ((double) this.a.getCardViewRadius()));
        }
        return 0.0f;
    }

    public float w() {
        return this.c.y();
    }

    public ColorStateList x() {
        return this.k;
    }

    public e06 y() {
        return this.m;
    }

    public int z() {
        ColorStateList colorStateList = this.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
