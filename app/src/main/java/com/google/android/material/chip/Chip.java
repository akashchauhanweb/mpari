package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.a;
import com.zepto.b15;
import com.zepto.br3;
import com.zepto.dq7;
import com.zepto.e06;
import com.zepto.ex3;
import com.zepto.g15;
import com.zepto.ge5;
import com.zepto.h06;
import com.zepto.if6;
import com.zepto.m15;
import com.zepto.pe6;
import com.zepto.r3;
import com.zepto.re6;
import com.zepto.rq3;
import com.zepto.tq;
import com.zepto.v62;
import com.zepto.xq3;
import com.zepto.xy4;
import com.zepto.zr7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends tq implements a.InterfaceC0036a, h06, Checkable {
    public static final int w = g15.p;
    public static final Rect x = new Rect();
    public static final int[] y = {R.attr.state_selected};
    public static final int[] z = {R.attr.state_checkable};
    public com.google.android.material.chip.a e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public CharSequence q;
    public final c r;
    public boolean s;
    public final Rect t;
    public final RectF u;
    public final re6 v;

    public class a extends re6 {
        public a() {
        }

        @Override // com.zepto.re6
        public void a(int i) {
        }

        @Override // com.zepto.re6
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.e.L2() ? Chip.this.e.g1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.e != null) {
                Chip.this.e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends v62 {
        public c(Chip chip) {
            super(chip);
        }

        @Override // com.zepto.v62
        public int B(float f, float f2) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // com.zepto.v62
        public void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.h != null) {
                list.add(1);
            }
        }

        @Override // com.zepto.v62
        public boolean J(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // com.zepto.v62
        public void M(r3 r3Var) {
            r3Var.S(Chip.this.r());
            r3Var.V(Chip.this.isClickable());
            r3Var.U(Chip.this.getAccessibilityClassName());
            r3Var.t0(Chip.this.getText());
        }

        @Override // com.zepto.v62
        public void N(int i, r3 r3Var) {
            if (i != 1) {
                r3Var.Y("");
                r3Var.Q(Chip.x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                r3Var.Y(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i2 = b15.k;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                r3Var.Y(context.getString(i2, objArr).trim());
            }
            r3Var.Q(Chip.this.getCloseIconTouchBoundsInt());
            r3Var.b(r3.a.i);
            r3Var.a0(Chip.this.isEnabled());
        }

        @Override // com.zepto.v62
        public void O(int i, boolean z) {
            if (i == 1) {
                Chip.this.m = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.u.setEmpty();
        if (n() && this.h != null) {
            this.e.X0(this.u);
        }
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.t;
    }

    private pe6 getTextAppearance() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.l != z2) {
            this.l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.k != z2) {
            this.k = z2;
            refreshDrawableState();
        }
    }

    public final void A() {
        this.g = new RippleDrawable(ge5.a(this.e.e1()), getBackgroundDrawable(), null);
        this.e.K2(false);
        dq7.u0(this, this.g);
        B();
    }

    public final void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.e) == null) {
            return;
        }
        int iI0 = (int) (aVar.I0() + this.e.i1() + this.e.p0());
        int iN0 = (int) (this.e.N0() + this.e.j1() + this.e.l0());
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            iN0 += rect.left;
            iI0 += rect.right;
        }
        dq7.F0(this, iN0, getPaddingTop(), iI0, getPaddingBottom());
    }

    public final void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        pe6 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.v);
        }
    }

    public final void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0036a
    public void a() {
        l(this.p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.s ? super.dispatchHoverEvent(motionEvent) : this.r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.r.w(keyEvent) || this.r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // com.zepto.tq, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null && aVar.o1() && this.e.k2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.H0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.s && (this.r.A() == 1 || this.r.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public ex3 getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public e06 getShapeAppearanceModel() {
        return this.e.D();
    }

    public ex3 getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.j1();
        }
        return 0.0f;
    }

    public final void j(com.google.android.material.chip.a aVar) {
        aVar.o2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] k() {
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.m) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.l) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.k) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.m) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.l) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.k) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    public boolean l(int i) {
        this.p = i;
        if (!w()) {
            if (this.f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int iMax = Math.max(0, i - this.e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        q(i2, i3, i2, i3);
        z();
        return true;
    }

    public final void m() {
        if (getBackgroundDrawable() == this.f && this.e.getCallback() == null) {
            this.e.setCallback(this.f);
        }
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.e;
        return (aVar == null || aVar.Q0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayI = if6.i(context, attributeSet, m15.o0, i, w, new int[0]);
        this.n = typedArrayI.getBoolean(m15.U0, false);
        this.p = (int) Math.ceil(typedArrayI.getDimension(m15.I0, (float) Math.ceil(zr7.c(getContext(), 48))));
        typedArrayI.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xq3.f(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.s) {
            this.r.I(z2, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L41
        L21:
            boolean r0 = r5.k
            if (r0 == 0) goto L41
            if (r1 != 0) goto L49
            r5.setCloseIconPressed(r3)
            goto L49
        L2b:
            boolean r0 = r5.k
            if (r0 == 0) goto L34
            r5.u()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.setCloseIconPressed(r3)
            if (r0 != 0) goto L49
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.setCloseIconPressed(r2)
            goto L49
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
            goto L49
        L48:
            r2 = r3
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i, int i2, int i3, int i4) {
        this.f = new InsetDrawable((Drawable) this.e, i, i2, i3, i4);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.e;
        return aVar != null && aVar.n1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.e;
        return aVar != null && aVar.p1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // com.zepto.tq, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // com.zepto.tq, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.w1(z2);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.x1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null) {
            this.j = z2;
        } else if (aVar.n1()) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.y1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.z1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.A1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.B1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.C1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.E1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.F1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.G1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.H1(i);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.e;
        if (aVar2 != aVar) {
            x(aVar2);
            this.e = aVar;
            aVar.z2(false);
            j(this.e);
            l(this.p);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.I1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.J1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.K1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.L1(i);
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.M1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.N1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.O1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.P1(i);
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Q1(i);
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.S1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.T1(i);
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.U1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.V1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.W1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.X1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Y1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Z1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.b2(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.c2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.d2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.e2(i);
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.f2(i);
        }
        y();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.g2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.h2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.i2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.j2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.l2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.m2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // com.zepto.tq, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // com.zepto.tq, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.V(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.p2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.n = z2;
        l(this.p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(ex3 ex3Var) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.q2(ex3Var);
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.r2(i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.s2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.t2(i);
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.u2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.v2(i);
        }
    }

    public void setInternalOnCheckedChangeListener(rq3 rq3Var) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.w2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.x2(colorStateList);
        }
        if (this.e.l1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.y2(i);
            if (this.e.l1()) {
                return;
            }
            A();
        }
    }

    @Override // com.zepto.h06
    public void setShapeAppearanceModel(e06 e06Var) {
        this.e.setShapeAppearanceModel(e06Var);
    }

    public void setShowMotionSpec(ex3 ex3Var) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.A2(ex3Var);
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.B2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.L2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.C2(charSequence);
        }
    }

    public void setTextAppearance(pe6 pe6Var) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.D2(pe6Var);
        }
        C();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.F2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.G2(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.H2(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.I2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.J2(i);
        }
    }

    public final /* synthetic */ void t(CompoundButton compoundButton, boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
        }
    }

    public boolean u() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        if (this.s) {
            this.r.U(1, 1);
        }
        return z2;
    }

    public final void v() {
        if (this.f != null) {
            this.f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    public boolean w() {
        return this.n;
    }

    public final void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.o2(null);
        }
    }

    public final void y() {
        if (n() && s() && this.h != null) {
            dq7.q0(this, this.r);
            this.s = true;
        } else {
            dq7.q0(this, null);
            this.s = false;
        }
    }

    public final void z() {
        if (ge5.a) {
            A();
            return;
        }
        this.e.K2(true);
        dq7.u0(this, getBackgroundDrawable());
        B();
        m();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = w;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        this.t = new Rect();
        this.u = new RectF();
        this.v = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a aVarU0 = com.google.android.material.chip.a.u0(context2, attributeSet, i, i2);
        o(context2, attributeSet, i);
        setChipDrawable(aVarU0);
        aVarU0.V(dq7.w(this));
        TypedArray typedArrayI = if6.i(context2, attributeSet, m15.o0, i, i2, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(m15.Z0);
        typedArrayI.recycle();
        this.r = new c(this);
        y();
        if (!zHasValue) {
            p();
        }
        setChecked(this.j);
        setText(aVarU0.g1());
        setEllipsize(aVarU0.a1());
        C();
        if (!this.e.L2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.p);
        }
        this.o = dq7.B(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.bk0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.a.t(compoundButton, z2);
            }
        });
    }

    public void setCheckedIconVisible(boolean z2) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.D1(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.R1(z2);
        }
    }

    public void setCloseIconVisible(boolean z2) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.n2(z2);
        }
        y();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.E2(i);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.E2(i);
        }
        C();
    }
}
