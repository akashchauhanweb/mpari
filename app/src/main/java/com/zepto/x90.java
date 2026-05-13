package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class x90 {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final e06 f;

    public x90(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, e06 e06Var, Rect rect) {
        lu4.d(rect.left);
        lu4.d(rect.top);
        lu4.d(rect.right);
        lu4.d(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = e06Var;
    }

    public static x90 a(Context context, int i) {
        lu4.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, m15.m3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(m15.n3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(m15.p3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(m15.o3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(m15.q3, 0));
        ColorStateList colorStateListA = vq3.a(context, typedArrayObtainStyledAttributes, m15.r3);
        ColorStateList colorStateListA2 = vq3.a(context, typedArrayObtainStyledAttributes, m15.w3);
        ColorStateList colorStateListA3 = vq3.a(context, typedArrayObtainStyledAttributes, m15.u3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m15.v3, 0);
        e06 e06VarM = e06.b(context, typedArrayObtainStyledAttributes.getResourceId(m15.s3, 0), typedArrayObtainStyledAttributes.getResourceId(m15.t3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new x90(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, e06VarM, rect);
    }

    public void b(TextView textView) {
        c(textView, null, null);
    }

    public void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        wq3 wq3Var = new wq3();
        wq3 wq3Var2 = new wq3();
        wq3Var.setShapeAppearanceModel(this.f);
        wq3Var2.setShapeAppearanceModel(this.f);
        if (colorStateList == null) {
            colorStateList = this.c;
        }
        wq3Var.W(colorStateList);
        wq3Var.d0(this.e, this.d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), wq3Var, wq3Var2);
        Rect rect = this.a;
        dq7.u0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
