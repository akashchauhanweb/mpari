package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class rr extends RatingBar {
    public final qr a;

    public rr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.H);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapB = this.a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public rr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jf6.a(this, getContext());
        qr qrVar = new qr(this);
        this.a = qrVar;
        qrVar.c(attributeSet, i);
    }
}
