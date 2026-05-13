package com.zepto;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ol2 extends er7 {
    public final Rect d;
    public final Rect e;
    public int f;
    public int g;

    public ol2() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public static int R(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.zepto.er7
    public void J(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewL = L(coordinatorLayout.r(view));
        if (viewL == null) {
            super.J(coordinatorLayout, view, i);
            this.f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewL.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewL.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        qv7 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && dq7.y(coordinatorLayout) && !dq7.y(view)) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.e;
        jk2.a(R(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iM = M(viewL);
        view.layout(rect2.left, rect2.top - iM, rect2.right, rect2.bottom - iM);
        this.f = rect2.top - viewL.getBottom();
    }

    public abstract View L(List list);

    public final int M(View view) {
        if (this.g == 0) {
            return 0;
        }
        float fN = N(view);
        int i = this.g;
        return er3.b((int) (fN * i), 0, i);
    }

    public abstract float N(View view);

    public final int O() {
        return this.g;
    }

    public int P(View view) {
        return view.getMeasuredHeight();
    }

    public final int Q() {
        return this.f;
    }

    public final void S(int i) {
        this.g = i;
    }

    public boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewL;
        qv7 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewL = L(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (dq7.y(viewL) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iP = size + P(viewL);
        int measuredHeight = viewL.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iP -= measuredHeight;
        }
        coordinatorLayout.J(view, i, i2, View.MeasureSpec.makeMeasureSpec(iP, i5 == -1 ? 1073741824 : IntCompanionObject.MIN_VALUE), i4);
        return true;
    }

    public ol2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
