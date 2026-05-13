package com.zepto;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.zepto.d24;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2 implements d24.c {
    public final Context a;
    public final jq b;
    public final WeakReference c;
    public bx1 d;
    public ValueAnimator e;

    public b2(Context context, jq configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = context;
        this.b = configuration;
        mh4 mh4VarB = configuration.b();
        this.c = mh4VarB != null ? new WeakReference(mh4VarB) : null;
    }

    @Override // com.zepto.d24.c
    public void a(d24 controller, j24 destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof md2) {
            return;
        }
        WeakReference weakReference = this.c;
        mh4 mh4Var = weakReference != null ? (mh4) weakReference.get() : null;
        if (this.c != null && mh4Var == null) {
            controller.h0(this);
            return;
        }
        String strB = destination.B(this.a, bundle);
        if (strB != null) {
            d(strB);
        }
        boolean zC = this.b.c(destination);
        boolean z = false;
        if (mh4Var == null && zC) {
            c(null, 0);
            return;
        }
        if (mh4Var != null && zC) {
            z = true;
        }
        b(z);
    }

    public final void b(boolean z) {
        Pair pair;
        bx1 bx1Var = this.d;
        if (bx1Var == null || (pair = TuplesKt.to(bx1Var, Boolean.TRUE)) == null) {
            bx1 bx1Var2 = new bx1(this.a);
            this.d = bx1Var2;
            pair = TuplesKt.to(bx1Var2, Boolean.FALSE);
        }
        bx1 bx1Var3 = (bx1) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        c(bx1Var3, z ? w05.b : w05.a);
        float f = z ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            bx1Var3.setProgress(f);
            return;
        }
        float fA = bx1Var3.a();
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bx1Var3, "progress", fA, f);
        this.e = objectAnimatorOfFloat;
        Intrinsics.checkNotNull(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    public abstract void c(Drawable drawable, int i);

    public abstract void d(CharSequence charSequence);
}
