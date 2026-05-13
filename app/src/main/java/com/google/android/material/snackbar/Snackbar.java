package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.zepto.p05;
import com.zepto.vy0;
import com.zepto.xy4;

/* JADX INFO: loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar {
    public static final int[] I;
    public static final int[] J;
    public final AccessibilityManager G;
    public boolean H;

    public static final class SnackbarLayout extends BaseTransientBottomBar.r {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i = xy4.S;
        I = new int[]{i};
        J = new int[]{i, xy4.U};
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, vy0 vy0Var) {
        super(context, viewGroup, view, vy0Var);
        this.G = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static ViewGroup f0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static boolean j0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(J);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar l0(View view, CharSequence charSequence, int i) {
        return m0(null, view, charSequence, i);
    }

    public static Snackbar m0(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup viewGroupF0 = f0(view);
        if (viewGroupF0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupF0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(j0(context) ? p05.z : p05.c, viewGroupF0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupF0, snackbarContentLayout, snackbarContentLayout);
        snackbar.p0(charSequence);
        snackbar.S(i);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int B() {
        int iB = super.B();
        if (iB == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.G.getRecommendedTimeoutMillis(iB, (this.H ? 4 : 0) | 3);
        }
        if (this.H && this.G.isTouchExplorationEnabled()) {
            return -2;
        }
        return iB;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void W() {
        super.W();
    }

    public final Button g0() {
        return h0().getActionView();
    }

    public final SnackbarContentLayout h0() {
        return (SnackbarContentLayout) this.i.getChildAt(0);
    }

    public final TextView i0() {
        return h0().getMessageView();
    }

    public final /* synthetic */ void k0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        y(1);
    }

    public Snackbar n0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button buttonG0 = g0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonG0.setVisibility(8);
            buttonG0.setOnClickListener(null);
            this.H = false;
        } else {
            this.H = true;
            buttonG0.setVisibility(0);
            buttonG0.setText(charSequence);
            buttonG0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e46
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.k0(onClickListener, view);
                }
            });
        }
        return this;
    }

    public Snackbar o0(int i) {
        g0().setTextColor(i);
        return this;
    }

    public Snackbar p0(CharSequence charSequence) {
        i0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void x() {
        super.x();
    }
}
