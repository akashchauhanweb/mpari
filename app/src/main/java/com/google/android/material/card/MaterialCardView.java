package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.zepto.br3;
import com.zepto.e06;
import com.zepto.g15;
import com.zepto.h06;
import com.zepto.if6;
import com.zepto.m15;
import com.zepto.pq3;
import com.zepto.tr;
import com.zepto.xq3;
import com.zepto.xy4;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, h06 {
    public static final int[] n = {R.attr.state_checkable};
    public static final int[] o = {R.attr.state_checked};
    public static final int[] p = {xy4.X};
    public static final int q = g15.o;
    public final pq3 j;
    public boolean k;
    public boolean l;
    public boolean m;

    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.y);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.j.l().getBounds());
        return rectF;
    }

    public final void d() {
        this.j.k();
    }

    public boolean e() {
        pq3 pq3Var = this.j;
        return pq3Var != null && pq3Var.F();
    }

    public boolean f() {
        return this.m;
    }

    public void g(int i, int i2, int i3, int i4) {
        super.b(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.j.m();
    }

    public ColorStateList getCardForegroundColor() {
        return this.j.n();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.j.o();
    }

    public int getCheckedIconGravity() {
        return this.j.p();
    }

    public int getCheckedIconMargin() {
        return this.j.q();
    }

    public int getCheckedIconSize() {
        return this.j.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.j.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.j.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.j.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.j.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.j.C().top;
    }

    public float getProgress() {
        return this.j.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.j.u();
    }

    public ColorStateList getRippleColor() {
        return this.j.x();
    }

    public e06 getShapeAppearanceModel() {
        return this.j.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.j.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.j.A();
    }

    public int getStrokeWidth() {
        return this.j.B();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j.g0();
        xq3.f(this, this.j.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, o);
        }
        if (f()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, p);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.j.K(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            if (!this.j.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.j.L(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.j.M(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.j.i0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.j.N(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.j.O(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.l != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.j.R(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.j.p() != i) {
            this.j.S(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.j.T(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.j.T(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.j.R(tr.b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.j.U(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.j.U(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.j.V(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        pq3 pq3Var = this.j;
        if (pq3Var != null) {
            pq3Var.g0();
        }
    }

    public void setDragged(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.j.k0();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.j.k0();
        this.j.h0();
    }

    public void setProgress(float f) {
        this.j.X(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.j.W(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.j.Y(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.j.Y(tr.a(getContext(), i));
    }

    @Override // com.zepto.h06
    public void setShapeAppearanceModel(e06 e06Var) {
        setClipToOutline(e06Var.u(getBoundsAsRectF()));
        this.j.Z(e06Var);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.j.b0(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.j.k0();
        this.j.h0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (e() && isEnabled()) {
            this.l = !this.l;
            refreshDrawableState();
            d();
            this.j.Q(this.l, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        int i2 = q;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        this.l = false;
        this.m = false;
        this.k = true;
        TypedArray typedArrayI = if6.i(getContext(), attributeSet, m15.x3, i, i2, new int[0]);
        pq3 pq3Var = new pq3(this, attributeSet, i, i2);
        this.j = pq3Var;
        pq3Var.M(super.getCardBackgroundColor());
        pq3Var.c0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        pq3Var.J(typedArrayI);
        typedArrayI.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.j.M(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.j.a0(colorStateList);
        invalidate();
    }
}
