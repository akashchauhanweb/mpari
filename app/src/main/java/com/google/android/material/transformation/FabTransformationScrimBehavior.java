package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zepto.fx3;
import com.zepto.tp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final fx3 c;
    public final fx3 d;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;

        public a(boolean z, View view) {
            this.a = z;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.c = new fx3(75L, 150L);
        this.d = new fx3(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.H(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet N(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        O(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        tp.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2));
        return animatorSet;
    }

    public final void O(View view, boolean z, boolean z2, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        fx3 fx3Var = z ? this.c : this.d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        fx3Var.a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new fx3(75L, 150L);
        this.d = new fx3(0L, 150L);
    }
}
