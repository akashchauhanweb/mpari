package com.zepto;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class qq3 extends tq {
    public static final int[] A;
    public static final int[][] B;
    public static final int C;
    public static final int y = g15.q;
    public static final int[] z = {xy4.Z};
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public ColorStateList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public Drawable l;
    public Drawable m;
    public boolean n;
    public ColorStateList o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public int[] s;
    public boolean t;
    public CharSequence u;
    public CompoundButton.OnCheckedChangeListener v;
    public final qp w;
    public final pp x;

    public class a extends pp {
        public a() {
        }

        @Override // com.zepto.pp
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = qq3.this.o;
            if (colorStateList != null) {
                tw1.o(drawable, colorStateList);
            }
        }

        @Override // com.zepto.pp
        public void c(Drawable drawable) {
            super.c(drawable);
            qq3 qq3Var = qq3.this;
            ColorStateList colorStateList = qq3Var.o;
            if (colorStateList != null) {
                tw1.n(drawable, colorStateList.getColorForState(qq3Var.s, qq3.this.o.getDefaultColor()));
            }
        }
    }

    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public int c;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        public final String c() {
            int i = this.c;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + c() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.c));
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public b(Parcel parcel) {
            super(parcel);
            this.c = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i = xy4.Y;
        A = new int[]{i};
        B = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public qq3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.e);
    }

    private String getButtonStateDescription() {
        int i = this.r;
        return i == 1 ? getResources().getString(b15.h) : i == 0 ? getResources().getString(b15.j) : getResources().getString(b15.i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int iD = sq3.d(this, xy4.g);
            int iD2 = sq3.d(this, xy4.i);
            int iD3 = sq3.d(this, xy4.m);
            int iD4 = sq3.d(this, xy4.j);
            iArr2[0] = sq3.j(iD3, iD2, 1.0f);
            iArr2[1] = sq3.j(iD3, iD, 1.0f);
            iArr2[2] = sq3.j(iD3, iD4, 0.54f);
            iArr2[3] = sq3.j(iD3, iD4, 0.38f);
            iArr2[4] = sq3.j(iD3, iD4, 0.38f);
            this.g = new ColorStateList(iArr, iArr2);
        }
        return this.g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final boolean c(lg6 lg6Var) {
        return lg6Var.n(m15.J3, 0) == C && lg6Var.n(m15.K3, 0) == 0;
    }

    public boolean d() {
        return this.j;
    }

    public final void e() {
        this.l = yw1.c(this.l, this.o, zu0.c(this));
        this.m = yw1.c(this.m, this.p, this.q);
        g();
        h();
        super.setButtonDrawable(yw1.a(this.l, this.m));
        refreshDrawableState();
    }

    public final void f() {
        if (Build.VERSION.SDK_INT < 30 || this.u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    public final void g() {
        qp qpVar;
        if (this.n) {
            qp qpVar2 = this.w;
            if (qpVar2 != null) {
                qpVar2.f(this.x);
                this.w.b(this.x);
            }
            Drawable drawable = this.l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (qpVar = this.w) == null) {
                return;
            }
            int i = zz4.b;
            int i2 = zz4.V;
            ((AnimatedStateListDrawable) drawable).addTransition(i, i2, qpVar, false);
            ((AnimatedStateListDrawable) this.l).addTransition(zz4.j, i2, this.w, false);
        }
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    public final void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.l;
        if (drawable != null && (colorStateList2 = this.o) != null) {
            tw1.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.m;
        if (drawable2 == null || (colorStateList = this.p) == null) {
            return;
        }
        tw1.o(drawable2, colorStateList);
    }

    public final void i() {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.o == null && this.p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        this.s = yw1.e(iArrOnCreateDrawableState);
        i();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.i || !TextUtils.isEmpty(getText()) || (drawableA = zu0.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (zr7.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            tw1.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.c);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.c = getCheckedState();
        return bVar;
    }

    @Override // com.zepto.tq, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(tr.b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(tr.b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.q == mode) {
            return;
        }
        this.q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.r != i) {
            this.r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            f();
            if (this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    wb0.a(it.next());
                    throw null;
                }
            }
            if (this.r != 2 && (onCheckedChangeListener = this.v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            wb0.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            zu0.d(this, getMaterialThemeColorsTintList());
        } else {
            zu0.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qq3(Context context, AttributeSet attributeSet, int i) {
        int i2 = y;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.w = qp.a(getContext(), qz4.e);
        this.x = new a();
        Context context2 = getContext();
        this.l = zu0.a(this);
        this.o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        lg6 lg6VarJ = if6.j(context2, attributeSet, m15.I3, i, i2, new int[0]);
        this.m = lg6VarJ.g(m15.L3);
        if (this.l != null && if6.g(context2) && c(lg6VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.l = tr.b(context2, qz4.d);
            this.n = true;
            if (this.m == null) {
                this.m = tr.b(context2, qz4.f);
            }
        }
        this.p = vq3.b(context2, lg6VarJ, m15.M3);
        this.q = zr7.i(lg6VarJ.k(m15.N3, -1), PorterDuff.Mode.SRC_IN);
        this.h = lg6VarJ.a(m15.S3, false);
        this.i = lg6VarJ.a(m15.O3, true);
        this.j = lg6VarJ.a(m15.R3, false);
        this.k = lg6VarJ.p(m15.Q3);
        int i3 = m15.P3;
        if (lg6VarJ.s(i3)) {
            setCheckedState(lg6VarJ.k(i3, 0));
        }
        lg6VarJ.w();
        e();
    }

    @Override // com.zepto.tq, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        e();
    }
}
