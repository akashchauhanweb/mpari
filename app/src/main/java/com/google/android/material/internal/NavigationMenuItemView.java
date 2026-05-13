package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.zepto.dq7;
import com.zepto.ed5;
import com.zepto.ef6;
import com.zepto.jz4;
import com.zepto.p05;
import com.zepto.qe2;
import com.zepto.qi6;
import com.zepto.qz4;
import com.zepto.r3;
import com.zepto.tw1;
import com.zepto.x2;
import com.zepto.zy4;
import com.zepto.zz4;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends qe2 implements j.a {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public g B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final x2 F;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final CheckedTextView z;

    public class a extends x2 {
        public a() {
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.S(NavigationMenuItemView.this.x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(zz4.g)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    public final void B() {
        if (F()) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    public final StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(zy4.t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public void D(g gVar, boolean z) {
        this.y = z;
        e(gVar, 0);
    }

    public void E() {
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.z.setCompoundDrawables(null, null, null, null);
    }

    public final boolean F() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void e(g gVar, int i) {
        this.B = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            dq7.u0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        qi6.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.B;
        if (gVar != null && gVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.x != z) {
            this.x = z;
            this.F.l(this.z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.z.setChecked(z);
        CheckedTextView checkedTextView = this.z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = tw1.r(drawable).mutate();
                tw1.o(drawable, this.C);
            }
            int i = this.v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.w) {
            if (this.E == null) {
                Drawable drawableE = ed5.e(getResources(), qz4.j, getContext().getTheme());
                this.E = drawableE;
                if (drawableE != null) {
                    int i2 = this.v;
                    drawableE.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.E;
        }
        ef6.i(this.z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        g gVar = this.B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.w = z;
    }

    public void setTextAppearance(int i) {
        ef6.n(this.z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = true;
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(p05.i, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(jz4.e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(zz4.h);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        dq7.q0(checkedTextView, aVar);
    }
}
