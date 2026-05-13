package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ex3 {
    public final w26 a = new w26();
    public final w26 b = new w26();

    public static void a(ex3 ex3Var, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            ex3Var.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            ex3Var.h(objectAnimator.getPropertyName(), fx3.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static ex3 b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static ex3 c(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static ex3 d(List list) {
        ex3 ex3Var = new ex3();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(ex3Var, (Animator) list.get(i));
        }
        return ex3Var;
    }

    public fx3 e(String str) {
        if (f(str)) {
            return (fx3) this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ex3) {
            return this.a.equals(((ex3) obj).a);
        }
        return false;
    }

    public boolean f(String str) {
        return this.a.get(str) != null;
    }

    public void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public void h(String str, fx3 fx3Var) {
        this.a.put(str, fx3Var);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
