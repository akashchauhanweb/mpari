package com.zepto;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class kr {
    public final TextView a;
    public final m12 b;

    public kr(TextView textView) {
        this.a = textView;
        this.b = new m12(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a(inputFilterArr);
    }

    public void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, c25.g0, i, 0);
        try {
            int i2 = c25.u0;
            boolean z = typedArrayObtainStyledAttributes.hasValue(i2) ? typedArrayObtainStyledAttributes.getBoolean(i2, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c(boolean z) {
        this.b.b(z);
    }

    public void d(boolean z) {
        this.b.c(z);
    }
}
