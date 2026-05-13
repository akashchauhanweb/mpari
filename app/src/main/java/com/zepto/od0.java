package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class od0 extends fn6 {
    public static final String[] O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property P = new b(PointF.class, "boundsOrigin");
    public static final Property Q = new c(PointF.class, "topLeft");
    public static final Property R = new d(PointF.class, "bottomRight");
    public static final Property S = new e(PointF.class, "bottomRight");
    public static final Property T = new f(PointF.class, "topLeft");
    public static final Property U = new g(PointF.class, "position");
    public static g65 V = new g65();
    public int[] L = new int[2];
    public boolean M = false;
    public boolean N = false;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ BitmapDrawable b;
        public final /* synthetic */ View c;
        public final /* synthetic */ float d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.a = viewGroup;
            this.b = bitmapDrawable;
            this.c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            as7.b(this.a).d(this.b);
            as7.g(this.c, this.d);
        }
    }

    public class b extends Property {
        public Rect a;

        public b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            as7.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            as7.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            as7.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ k a;
        private k mViewBounds;

        public h(k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    public class i extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.b = view;
            this.c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            dq7.x0(this.b, this.c);
            as7.f(this.b, this.d, this.e, this.f, this.g);
        }
    }

    public class j extends gn6 {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public j(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // com.zepto.gn6, com.zepto.fn6.f
        public void a(fn6 fn6Var) {
            xq7.c(this.b, false);
            this.a = true;
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            if (!this.a) {
                xq7.c(this.b, false);
            }
            fn6Var.V(this);
        }

        @Override // com.zepto.gn6, com.zepto.fn6.f
        public void c(fn6 fn6Var) {
            xq7.c(this.b, true);
        }

        @Override // com.zepto.gn6, com.zepto.fn6.f
        public void d(fn6 fn6Var) {
            xq7.c(this.b, false);
        }
    }

    public static class k {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public k(View view) {
            this.e = view;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public final void b() {
            as7.f(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    @Override // com.zepto.fn6
    public String[] I() {
        return O;
    }

    @Override // com.zepto.fn6
    public void f(mn6 mn6Var) {
        k0(mn6Var);
    }

    @Override // com.zepto.fn6
    public void i(mn6 mn6Var) {
        k0(mn6Var);
    }

    public final void k0(mn6 mn6Var) {
        View view = mn6Var.b;
        if (!dq7.U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        mn6Var.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        mn6Var.a.put("android:changeBounds:parent", mn6Var.b.getParent());
        if (this.N) {
            mn6Var.b.getLocationInWindow(this.L);
            mn6Var.a.put("android:changeBounds:windowX", Integer.valueOf(this.L[0]));
            mn6Var.a.put("android:changeBounds:windowY", Integer.valueOf(this.L[1]));
        }
        if (this.M) {
            mn6Var.a.put("android:changeBounds:clip", dq7.u(view));
        }
    }

    public final boolean l0(View view, View view2) {
        if (!this.N) {
            return true;
        }
        mn6 mn6VarV = v(view, true);
        if (mn6VarV == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == mn6VarV.b) {
            return true;
        }
        return false;
    }

    @Override // com.zepto.fn6
    public Animator p(ViewGroup viewGroup, mn6 mn6Var, mn6 mn6Var2) {
        int i2;
        View view;
        int i3;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        if (mn6Var == null || mn6Var2 == null) {
            return null;
        }
        Map map = mn6Var.a;
        Map map2 = mn6Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = mn6Var2.b;
        if (!l0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) mn6Var.a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) mn6Var.a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) mn6Var2.a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) mn6Var2.a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.L);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = as7.c(view2);
            as7.g(view2, 0.0f);
            as7.b(viewGroup).b(bitmapDrawable);
            dm4 dm4VarY = y();
            int[] iArr = this.L;
            int i4 = iArr[0];
            int i5 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, vw4.a(P, dm4VarY.a(iIntValue - i4, iIntValue2 - i5, iIntValue3 - i4, iIntValue4 - i5)));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect = (Rect) mn6Var.a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) mn6Var2.a.get("android:changeBounds:bounds");
        int i6 = rect.left;
        int i7 = rect2.left;
        int i8 = rect.top;
        int i9 = rect2.top;
        int i10 = rect.right;
        int i11 = rect2.right;
        int i12 = rect.bottom;
        int i13 = rect2.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect3 = (Rect) mn6Var.a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) mn6Var2.a.get("android:changeBounds:clip");
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i2 = 0;
        } else {
            i2 = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.M) {
            view = view2;
            as7.f(view, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
            ObjectAnimator objectAnimatorA = (i6 == i7 && i8 == i9) ? null : qe4.a(view, U, y().a(i6, i8, i7, i9));
            if (rect3 == null) {
                i3 = 0;
                rect3 = new Rect(0, 0, i14, i15);
            } else {
                i3 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i3, i3, i16, i17) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                dq7.x0(view, rect3);
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", V, rect3, rect5);
                objectAnimatorOfObject.addListener(new i(view, rect4, i7, i9, i11, i13));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = ln6.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            as7.f(view, i6, i8, i10, i12);
            if (i2 != 2) {
                animatorC = (i6 == i7 && i8 == i9) ? qe4.a(view, S, y().a(i10, i12, i11, i13)) : qe4.a(view, T, y().a(i6, i8, i7, i9));
            } else if (i14 == i16 && i15 == i17) {
                animatorC = qe4.a(view, U, y().a(i6, i8, i7, i9));
            } else {
                k kVar = new k(view);
                ObjectAnimator objectAnimatorA2 = qe4.a(kVar, Q, y().a(i6, i8, i7, i9));
                ObjectAnimator objectAnimatorA3 = qe4.a(kVar, R, y().a(i10, i12, i11, i13));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new h(kVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            xq7.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animatorC;
    }
}
