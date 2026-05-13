package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zepto.ak0;
import com.zepto.dq7;
import com.zepto.ex3;
import com.zepto.fx3;
import com.zepto.ht4;
import com.zepto.rp;
import com.zepto.tp;
import com.zepto.zz4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    public static class b {
        public ex3 a;
        public ht4 b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet N(View view, View view2, boolean z, boolean z2) {
        b bVarD0 = d0(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Z(view, view2, z, z2, bVarD0, arrayList, arrayList2);
        RectF rectF = this.d;
        c0(view, view2, z, z2, bVarD0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        Y(view, view2, z, bVarD0, arrayList);
        b0(view, view2, z, z2, bVarD0, arrayList, arrayList2);
        a0(view, view2, z, z2, bVarD0, fWidth, fHeight, arrayList, arrayList2);
        X(view, view2, z, z2, bVarD0, arrayList, arrayList2);
        W(view, view2, z, z2, bVarD0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        tp.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public final ViewGroup O(View view) {
        View viewFindViewById = view.findViewById(zz4.E);
        return viewFindViewById != null ? e0(viewFindViewById) : e0(view);
    }

    public final void P(View view, b bVar, fx3 fx3Var, fx3 fx3Var2, float f, float f2, float f3, float f4, RectF rectF) {
        float fU = U(bVar, fx3Var, f, f3);
        float fU2 = U(bVar, fx3Var2, f2, f4);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        V(view, rectF3);
        rectF3.offset(fU, fU2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void Q(View view, RectF rectF) {
        V(view, rectF);
        rectF.offset(this.g, this.h);
    }

    public final Pair R(float f, float f2, boolean z, b bVar) {
        fx3 fx3VarE;
        fx3 fx3VarE2;
        if (f == 0.0f || f2 == 0.0f) {
            fx3VarE = bVar.a.e("translationXLinear");
            fx3VarE2 = bVar.a.e("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            fx3VarE = bVar.a.e("translationXCurveDownwards");
            fx3VarE2 = bVar.a.e("translationYCurveDownwards");
        } else {
            fx3VarE = bVar.a.e("translationXCurveUpwards");
            fx3VarE2 = bVar.a.e("translationYCurveUpwards");
        }
        return new Pair(fx3VarE, fx3VarE2);
    }

    public final float S(View view, View view2, ht4 ht4Var) {
        float fCenterX;
        float fCenterX2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        Q(view, rectF);
        V(view2, rectF2);
        int i = ht4Var.a & 7;
        if (i == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i != 5) {
                f = 0.0f;
                return f + ht4Var.b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f = fCenterX - fCenterX2;
        return f + ht4Var.b;
    }

    public final float T(View view, View view2, ht4 ht4Var) {
        float fCenterY;
        float fCenterY2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        Q(view, rectF);
        V(view2, rectF2);
        int i = ht4Var.a & 112;
        if (i == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i != 80) {
                f = 0.0f;
                return f + ht4Var.c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f = fCenterY - fCenterY2;
        return f + ht4Var.c;
    }

    public final float U(b bVar, fx3 fx3Var, float f, float f2) {
        long jC = fx3Var.c();
        long jD = fx3Var.d();
        fx3 fx3VarE = bVar.a.e("expansion");
        return rp.a(f, f2, fx3Var.e().getInterpolation((((fx3VarE.c() + fx3VarE.d()) + 17) - jC) / jD));
    }

    public final void V(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void W(View view, View view2, boolean z, boolean z2, b bVar, List list, List list2) {
        ViewGroup viewGroupO;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupO = O(view2)) != null) {
            if (z) {
                if (!z2) {
                    ak0.a.set(viewGroupO, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, (Property<ViewGroup, Float>) ak0.a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, (Property<ViewGroup, Float>) ak0.a, 0.0f);
            }
            bVar.a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    public final void X(View view, View view2, boolean z, boolean z2, b bVar, List list, List list2) {
    }

    public final void Y(View view, View view2, boolean z, b bVar, List list) {
        float fS = S(view, view2, bVar.b);
        float fT = T(view, view2, bVar.b);
        Pair pairR = R(fS, fT, z, bVar);
        fx3 fx3Var = (fx3) pairR.first;
        fx3 fx3Var2 = (fx3) pairR.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fS = this.g;
        }
        fArr[0] = fS;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fT = this.h;
        }
        fArr2[0] = fT;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        fx3Var.a(objectAnimatorOfFloat);
        fx3Var2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final void Z(View view, View view2, boolean z, boolean z2, b bVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fW = dq7.w(view2) - dq7.w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fW);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fW);
        }
        bVar.a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    public final void a0(View view, View view2, boolean z, boolean z2, b bVar, float f, float f2, List list, List list2) {
    }

    public final void b0(View view, View view2, boolean z, boolean z2, b bVar, List list, List list2) {
    }

    public final void c0(View view, View view2, boolean z, boolean z2, b bVar, List list, List list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fS = S(view, view2, bVar.b);
        float fT = T(view, view2, bVar.b);
        Pair pairR = R(fS, fT, z, bVar);
        fx3 fx3Var = (fx3) pairR.first;
        fx3 fx3Var2 = (fx3) pairR.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fS);
                view2.setTranslationY(-fT);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            P(view2, bVar, fx3Var, fx3Var2, -fS, -fT, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fS);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fT);
        }
        fx3Var.a(objectAnimatorOfFloat);
        fx3Var2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public abstract b d0(Context context, boolean z);

    public final ViewGroup e0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
