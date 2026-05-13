package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.zepto.dq7;
import com.zepto.t62;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {
    public int a;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;
        public final /* synthetic */ t62 c;

        public a(View view, int i, t62 t62Var) {
            this.a = view;
            this.b = i;
            this.c = t62Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                t62 t62Var = this.c;
                expandableBehavior.L((View) t62Var, this.a, t62Var.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    public final boolean J(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i = this.a;
        return i == 0 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t62 K(CoordinatorLayout coordinatorLayout, View view) {
        List listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) listR.get(i);
            if (i(coordinatorLayout, view, view2)) {
                return (t62) view2;
            }
        }
        return null;
    }

    public abstract boolean L(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        t62 t62Var = (t62) view2;
        if (!J(t62Var.a())) {
            return false;
        }
        this.a = t62Var.a() ? 1 : 2;
        return L((View) t62Var, view, t62Var.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
        t62 t62VarK;
        if (dq7.U(view) || (t62VarK = K(coordinatorLayout, view)) == null || !J(t62VarK.a())) {
            return false;
        }
        int i2 = t62VarK.a() ? 1 : 2;
        this.a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, t62VarK));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
