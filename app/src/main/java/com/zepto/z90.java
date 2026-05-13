package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class z90 {
    public final x90 a;
    public final x90 b;
    public final x90 c;
    public final x90 d;
    public final x90 e;
    public final x90 f;
    public final x90 g;
    public final Paint h;

    public z90(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(fq3.d(context, xy4.x, com.google.android.material.datepicker.c.class.getCanonicalName()), m15.c3);
        this.a = x90.a(context, typedArrayObtainStyledAttributes.getResourceId(m15.g3, 0));
        this.g = x90.a(context, typedArrayObtainStyledAttributes.getResourceId(m15.e3, 0));
        this.b = x90.a(context, typedArrayObtainStyledAttributes.getResourceId(m15.f3, 0));
        this.c = x90.a(context, typedArrayObtainStyledAttributes.getResourceId(m15.h3, 0));
        ColorStateList colorStateListA = vq3.a(context, typedArrayObtainStyledAttributes, m15.i3);
        this.d = x90.a(context, typedArrayObtainStyledAttributes.getResourceId(m15.k3, 0));
        this.e = x90.a(context, typedArrayObtainStyledAttributes.getResourceId(m15.j3, 0));
        this.f = x90.a(context, typedArrayObtainStyledAttributes.getResourceId(m15.l3, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
