package com.yalantis.ucrop.view.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.zepto.ez4;
import com.zepto.kz4;
import com.zepto.q15;
import com.zepto.yy0;
import com.zepto.zx;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class AspectRatioTextView extends AppCompatTextView {
    public final float h;
    public final Rect i;
    public Paint j;
    public int k;
    public float l;
    public String m;
    public float n;
    public float o;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.i);
            Rect rect = this.i;
            float f = (rect.right - rect.left) / 2.0f;
            float f2 = rect.bottom - (rect.top / 2.0f);
            int i = this.k;
            canvas.drawCircle(f, f2 - (i * 1.5f), i / 2.0f, this.j);
        }
    }

    public final void r(int i) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i, yy0.c(getContext(), ez4.k)}));
    }

    public float s(boolean z) {
        if (z) {
            v();
            u();
        }
        return this.l;
    }

    public void setActiveColor(int i) {
        r(i);
        invalidate();
    }

    public void setAspectRatio(zx zxVar) {
        this.m = zxVar.c();
        this.n = zxVar.d();
        float fE = zxVar.e();
        this.o = fE;
        float f = this.n;
        if (f == 0.0f || fE == 0.0f) {
            this.l = 0.0f;
        } else {
            this.l = f / fE;
        }
        u();
    }

    public final void t(TypedArray typedArray) {
        setGravity(1);
        this.m = typedArray.getString(q15.R);
        this.n = typedArray.getFloat(q15.S, 0.0f);
        float f = typedArray.getFloat(q15.T, 0.0f);
        this.o = f;
        float f2 = this.n;
        if (f2 == 0.0f || f == 0.0f) {
            this.l = 0.0f;
        } else {
            this.l = f2 / f;
        }
        this.k = getContext().getResources().getDimensionPixelSize(kz4.h);
        Paint paint = new Paint(1);
        this.j = paint;
        paint.setStyle(Paint.Style.FILL);
        u();
        r(getResources().getColor(ez4.l));
        typedArray.recycle();
    }

    public final void u() {
        if (TextUtils.isEmpty(this.m)) {
            setText(String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.n), Integer.valueOf((int) this.o)));
        } else {
            setText(this.m);
        }
    }

    public final void v() {
        if (this.l != 0.0f) {
            float f = this.n;
            float f2 = this.o;
            this.n = f2;
            this.o = f;
            this.l = f2 / f;
        }
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 1.5f;
        this.i = new Rect();
        t(context.obtainStyledAttributes(attributeSet, q15.Q));
    }
}
