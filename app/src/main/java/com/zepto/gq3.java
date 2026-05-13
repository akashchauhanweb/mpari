package com.zepto;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public class gq3 extends qq {
    public final uf3 e;
    public final AccessibilityManager f;
    public final Rect g;
    public final int h;
    public final float i;
    public ColorStateList j;
    public int k;
    public ColorStateList l;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            gq3 gq3Var = gq3.this;
            gq3.this.j(i < 0 ? gq3Var.e.v() : gq3Var.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = gq3.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = gq3.this.e.y();
                    i = gq3.this.e.x();
                    j = gq3.this.e.w();
                }
                onItemClickListener.onItemClick(gq3.this.e.h(), view, i, j);
            }
            gq3.this.e.dismiss();
        }
    }

    public class b extends ArrayAdapter {
        public ColorStateList a;
        public ColorStateList b;

        public b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            f();
        }

        public final ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{sq3.i(gq3.this.k, gq3.this.l.getColorForState(iArr2, 0)), sq3.i(gq3.this.k, gq3.this.l.getColorForState(iArr, 0)), gq3.this.k});
        }

        public final Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(gq3.this.k);
            if (this.b == null) {
                return colorDrawable;
            }
            tw1.o(colorDrawable, this.a);
            return new RippleDrawable(this.b, colorDrawable, null);
        }

        public final boolean c() {
            return gq3.this.k != 0;
        }

        public final boolean d() {
            return gq3.this.l != null;
        }

        public final ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{gq3.this.l.getColorForState(iArr, 0), 0});
        }

        public void f() {
            this.b = e();
            this.a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                dq7.u0(textView, gq3.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public gq3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.b);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public final TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean g() {
        AccessibilityManager accessibilityManager = this.f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.R()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    public final int h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.e.x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableG = this.e.g();
        if (drawableG != null) {
            drawableG.getPadding(this.g);
            Rect rect = this.g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    public final void i() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.r0();
        }
    }

    public final void j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.R() && super.getHint() == null && ip3.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), h()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        uf3 uf3Var = this.e;
        if (uf3Var != null) {
            uf3Var.b(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof wq3) {
            ((wq3) dropDownBackground).W(this.j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        i();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.k = i;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.e.a();
        } else {
            super.showDropDown();
        }
    }

    public gq3(Context context, AttributeSet attributeSet, int i) {
        super(br3.c(context, attributeSet, i, 0), attributeSet, i);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = if6.i(context2, attributeSet, m15.u2, i, g15.d, new int[0]);
        int i2 = m15.v2;
        if (typedArrayI.hasValue(i2) && typedArrayI.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.h = typedArrayI.getResourceId(m15.y2, p05.r);
        this.i = typedArrayI.getDimensionPixelOffset(m15.w2, jz4.U);
        int i3 = m15.x2;
        if (typedArrayI.hasValue(i3)) {
            this.j = ColorStateList.valueOf(typedArrayI.getColor(i3, 0));
        }
        this.k = typedArrayI.getColor(m15.z2, 0);
        this.l = vq3.a(context2, typedArrayI, m15.A2);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        uf3 uf3Var = new uf3(context2);
        this.e = uf3Var;
        uf3Var.J(true);
        uf3Var.D(this);
        uf3Var.I(2);
        uf3Var.p(getAdapter());
        uf3Var.L(new a());
        int i4 = m15.B2;
        if (typedArrayI.hasValue(i4)) {
            setSimpleItems(typedArrayI.getResourceId(i4, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.h, strArr));
    }
}
