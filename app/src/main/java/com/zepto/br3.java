package com.zepto;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class br3 {
    public static final int[] a = {R.attr.theme, xy4.e0};
    public static final int[] b = {xy4.A};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i, int i2) {
        int iB = b(context, attributeSet, i, i2);
        boolean z = (context instanceof az0) && ((az0) context).c() == iB;
        if (iB == 0 || z) {
            return context;
        }
        az0 az0Var = new az0(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            az0Var.getTheme().applyStyle(iA, true);
        }
        return az0Var;
    }
}
