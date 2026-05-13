package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import com.zepto.br3;
import com.zepto.dq7;
import com.zepto.e06;
import com.zepto.ef6;
import com.zepto.g15;
import com.zepto.h06;
import com.zepto.if6;
import com.zepto.m15;
import com.zepto.nq3;
import com.zepto.tr;
import com.zepto.tw1;
import com.zepto.vq3;
import com.zepto.wb0;
import com.zepto.xq3;
import com.zepto.xy4;
import com.zepto.z1;
import com.zepto.zr7;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, h06 {
    public static final int[] r = {R.attr.state_checkable};
    public static final int[] s = {R.attr.state_checked};
    public static final int t = g15.n;
    public final nq3 d;
    public final LinkedHashSet e;
    public a f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public static class b extends z1 {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public boolean f;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void d(Parcel parcel) {
            this.f = parcel.readInt() == 1;
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            d(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.v);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public boolean a() {
        nq3 nq3Var = this.d;
        return nq3Var != null && nq3Var.p();
    }

    public final boolean b() {
        int i = this.q;
        return i == 3 || i == 4;
    }

    public final boolean c() {
        int i = this.q;
        return i == 1 || i == 2;
    }

    public final boolean d() {
        int i = this.q;
        return i == 16 || i == 32;
    }

    public final boolean e() {
        return dq7.B(this) == 1;
    }

    public final boolean f() {
        nq3 nq3Var = this.d;
        return (nq3Var == null || nq3Var.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            ef6.i(this, this.i, null, null, null);
        } else if (b()) {
            ef6.i(this, null, null, this.i, null);
        } else if (d()) {
            ef6.i(this, null, this.i, null, null);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.j;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.c();
    }

    public int getInsetTop() {
        return this.d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.d.h();
        }
        return null;
    }

    public e06 getShapeAppearanceModel() {
        if (f()) {
            return this.d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.d.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.d.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = tw1.r(drawable).mutate();
            this.i = drawableMutate;
            tw1.o(drawableMutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                tw1.p(this.i, mode);
            }
            int intrinsicWidth = this.k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.l;
            int i2 = this.m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] drawableArrA = ef6.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.i) && ((!b() || drawable5 == this.i) && (!d() || drawable4 == this.i))) {
            return;
        }
        g();
    }

    public final void i(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.l = 0;
                if (this.q == 16) {
                    this.m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.n) - getPaddingBottom()) / 2);
                if (this.m != iMax) {
                    this.m = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i3 = this.q;
        if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - dq7.F(this)) - intrinsicWidth) - this.n) - dq7.G(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.l != textLayoutWidth) {
            this.l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            xq3.f(this, this.d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.c());
        setChecked(bVar.f);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f = this.o;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (f()) {
            this.d.s(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.d.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? tr.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (f()) {
            this.d.u(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.o != z) {
            this.o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.o);
            }
            if (this.p) {
                return;
            }
            this.p = true;
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                wb0.a(it.next());
                throw null;
            }
            this.p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (f()) {
            this.d.v(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (f()) {
            this.d.f().V(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? tr.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.k != i) {
            this.k = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(tr.a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.d.w(i);
    }

    public void setInsetTop(int i) {
        this.d.x(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (f()) {
            setRippleColor(tr.a(getContext(), i));
        }
    }

    @Override // com.zepto.h06
    public void setShapeAppearanceModel(e06 e06Var) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.z(e06Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (f()) {
            this.d.A(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (f()) {
            setStrokeColor(tr.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (f()) {
            this.d.C(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.F(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = t;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        this.e = new LinkedHashSet();
        this.o = false;
        this.p = false;
        Context context2 = getContext();
        TypedArray typedArrayI = if6.i(context2, attributeSet, m15.C2, i, i2, new int[0]);
        this.n = typedArrayI.getDimensionPixelSize(m15.P2, 0);
        this.g = zr7.i(typedArrayI.getInt(m15.S2, -1), PorterDuff.Mode.SRC_IN);
        this.h = vq3.a(getContext(), typedArrayI, m15.R2);
        this.i = vq3.d(getContext(), typedArrayI, m15.N2);
        this.q = typedArrayI.getInteger(m15.O2, 1);
        this.k = typedArrayI.getDimensionPixelSize(m15.Q2, 0);
        nq3 nq3Var = new nq3(this, e06.e(context2, attributeSet, i, i2).m());
        this.d = nq3Var;
        nq3Var.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.n);
        h(this.i != null);
    }
}
