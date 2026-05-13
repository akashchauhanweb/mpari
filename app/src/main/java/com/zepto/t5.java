package com.zepto;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.zepto.z5;

/* JADX INFO: loaded from: classes.dex */
public abstract class t5 {
    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    public void n() {
    }

    public abstract boolean o(int i, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(boolean z);

    public abstract void u(int i);

    public abstract void v(Drawable drawable);

    public abstract void w(boolean z);

    public abstract void x(CharSequence charSequence);

    public abstract void y(CharSequence charSequence);

    public z5 z(z5.a aVar) {
        return null;
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public int a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c25.t);
            this.a = typedArrayObtainStyledAttributes.getInt(c25.u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
