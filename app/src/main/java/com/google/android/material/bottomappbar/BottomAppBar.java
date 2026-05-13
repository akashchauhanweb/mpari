package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zepto.dq7;
import com.zepto.g15;
import com.zepto.py4;
import com.zepto.wb0;
import com.zepto.xy4;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int U = g15.m;
    public static final int V = xy4.B;
    public static final int W = xy4.L;

    public static /* synthetic */ void U(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ View V(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ boolean X(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ void Y(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }

    public static /* synthetic */ int Z(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static void a0(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.f) view.getLayoutParams()).d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect m;
        public WeakReference n;
        public int o;
        public final View.OnLayoutChangeListener p;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                wb0.a(Behavior.this.n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.p = new a();
            this.m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            wb0.a(view);
            return T(coordinatorLayout, null, view2, view3, i, i2);
        }

        public boolean S(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.n = new WeakReference(bottomAppBar);
            View viewV = BottomAppBar.V(bottomAppBar);
            if (viewV != null && !dq7.U(viewV)) {
                BottomAppBar.a0(bottomAppBar, viewV);
                this.o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewV.getLayoutParams())).bottomMargin;
                if (viewV instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewV;
                    if (BottomAppBar.Z(bottomAppBar) == 0 && BottomAppBar.X(bottomAppBar)) {
                        dq7.y0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(py4.b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(py4.a);
                    }
                    BottomAppBar.Y(bottomAppBar, floatingActionButton);
                }
                viewV.addOnLayoutChangeListener(this.p);
                BottomAppBar.U(bottomAppBar);
            }
            coordinatorLayout.I(bottomAppBar, i);
            return super.p(coordinatorLayout, bottomAppBar, i);
        }

        public boolean T(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
            wb0.a(view);
            return S(coordinatorLayout, null, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p = new a();
            this.m = new Rect();
        }
    }
}
