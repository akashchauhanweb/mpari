package com.zepto;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public abstract class zf2 {
    public static int a(sf2 sf2Var, boolean z, boolean z2) {
        return z2 ? z ? sf2Var.P() : sf2Var.R() : z ? sf2Var.w() : sf2Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.zepto.zf2.a b(android.content.Context r4, com.zepto.sf2 r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.J()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.K1(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.H
            r2 = 0
            if (r1 == 0) goto L1e
            int r3 = com.zepto.h05.c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L1e
            android.view.ViewGroup r1 = r5.H
            r1.setTag(r3, r2)
        L1e:
            android.view.ViewGroup r1 = r5.H
            if (r1 == 0) goto L29
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L29
            return r2
        L29:
            android.view.animation.Animation r1 = r5.D0(r0, r6, r7)
            if (r1 == 0) goto L35
            com.zepto.zf2$a r4 = new com.zepto.zf2$a
            r4.<init>(r1)
            return r4
        L35:
            android.animation.Animator r5 = r5.E0(r0, r6, r7)
            if (r5 == 0) goto L41
            com.zepto.zf2$a r4 = new com.zepto.zf2$a
            r4.<init>(r5)
            return r4
        L41:
            if (r7 != 0) goto L49
            if (r0 == 0) goto L49
            int r7 = d(r4, r0, r6)
        L49:
            if (r7 == 0) goto L85
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L69
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            if (r6 == 0) goto L85
            com.zepto.zf2$a r0 = new com.zepto.zf2$a     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            return r0
        L67:
            r4 = move-exception
            throw r4
        L69:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L75
            if (r6 == 0) goto L85
            com.zepto.zf2$a r0 = new com.zepto.zf2$a     // Catch: java.lang.RuntimeException -> L75
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L75
            return r0
        L75:
            r6 = move-exception
            if (r5 != 0) goto L84
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L85
            com.zepto.zf2$a r5 = new com.zepto.zf2$a
            r5.<init>(r4)
            return r5
        L84:
            throw r6
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.zf2.b(android.content.Context, com.zepto.sf2, boolean, boolean):com.zepto.zf2$a");
    }

    public static int c(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? qy4.e : qy4.f;
        }
        if (i == 8194) {
            return z ? qy4.a : qy4.b;
        }
        if (i == 8197) {
            return z ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i == 4099) {
            return z ? qy4.c : qy4.d;
        }
        if (i != 4100) {
            return -1;
        }
        return z ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    public static class a {
        public final Animation a;
        public final Animator b;

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup c;
        public final View e;
        public boolean f;
        public boolean g;
        public boolean h;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.h = true;
            this.c = viewGroup;
            this.e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.h = true;
            if (this.f) {
                return !this.g;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f = true;
                hh4.a(this.c, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f || !this.h) {
                this.c.endViewTransition(this.e);
                this.g = true;
            } else {
                this.h = false;
                this.c.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.h = true;
            if (this.f) {
                return !this.g;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f = true;
                hh4.a(this.c, this);
            }
            return true;
        }
    }
}
