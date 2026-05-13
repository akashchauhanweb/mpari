package com.zepto;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class ar3 extends AppCompatTextView {
    public ar3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static boolean s(Context context) {
        return fq3.b(context, xy4.c0, true);
    }

    public static int t(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m15.g4, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(m15.h4, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int v(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i = 0; i < iArr.length && iC < 0; i++) {
            iC = vq3.c(context, typedArray, iArr[i], -1);
        }
        return iC;
    }

    public static boolean w(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m15.g4, i, i2);
        int iV = v(context, typedArrayObtainStyledAttributes, m15.i4, m15.j4);
        typedArrayObtainStyledAttributes.recycle();
        return iV != -1;
    }

    public final void r(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, m15.c4);
        int iV = v(getContext(), typedArrayObtainStyledAttributes, m15.e4, m15.f4);
        typedArrayObtainStyledAttributes.recycle();
        if (iV >= 0) {
            setLineHeight(iV);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (s(context)) {
            r(context.getTheme(), i);
        }
    }

    public final void u(AttributeSet attributeSet, int i, int i2) {
        int iT;
        Context context = getContext();
        if (s(context)) {
            Resources.Theme theme = context.getTheme();
            if (w(context, theme, attributeSet, i, i2) || (iT = t(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            r(theme, iT);
        }
    }

    public ar3(Context context, AttributeSet attributeSet, int i) {
        super(br3.c(context, attributeSet, i, 0), attributeSet, i);
        u(attributeSet, i, 0);
    }
}
