package com.zepto;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class er7 extends CoordinatorLayout.c {
    public fr7 a;
    public int b;
    public int c;

    public er7() {
        this.b = 0;
        this.c = 0;
    }

    public int I() {
        fr7 fr7Var = this.a;
        if (fr7Var != null) {
            return fr7Var.b();
        }
        return 0;
    }

    public void J(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.I(view, i);
    }

    public boolean K(int i) {
        fr7 fr7Var = this.a;
        if (fr7Var != null) {
            return fr7Var.e(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
        J(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new fr7(view);
        }
        this.a.c();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.e(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 == 0) {
            return true;
        }
        this.a.d(i3);
        this.c = 0;
        return true;
    }

    public er7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }
}
