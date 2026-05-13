package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class qp5 extends FrameLayout {
    public Drawable a;
    public Rect b;
    public Rect c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public class a implements cg4 {
        public a() {
        }

        @Override // com.zepto.cg4
        public qv7 a(View view, qv7 qv7Var) {
            qp5 qp5Var = qp5.this;
            if (qp5Var.b == null) {
                qp5Var.b = new Rect();
            }
            qp5.this.b.set(qv7Var.j(), qv7Var.l(), qv7Var.k(), qv7Var.i());
            qp5.this.e(qv7Var);
            qp5.this.setWillNotDraw(!qv7Var.m() || qp5.this.a == null);
            dq7.h0(qp5.this);
            return qv7Var.c();
        }
    }

    public qp5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        TypedArray typedArrayI = if6.i(context, attributeSet, m15.w5, i, g15.i, new int[0]);
        this.a = typedArrayI.getDrawable(m15.x5);
        typedArrayI.recycle();
        setWillNotDraw(true);
        dq7.E0(this, new a());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b == null || this.a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.d) {
            this.c.set(0, 0, width, this.b.top);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
        }
        if (this.e) {
            this.c.set(0, height - this.b.bottom, width, height);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
        }
        if (this.f) {
            Rect rect = this.c;
            Rect rect2 = this.b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
        }
        if (this.g) {
            Rect rect3 = this.c;
            Rect rect4 = this.b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public abstract void e(qv7 qv7Var);

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.e = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.g = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.d = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.a = drawable;
    }
}
