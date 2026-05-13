package com.zepto;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class fe5 extends Drawable implements h06 {
    public b a;

    public static final class b extends Drawable.ConstantState {
        public wq3 a;
        public boolean b;

        public b(wq3 wq3Var) {
            this.a = wq3Var;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fe5 newDrawable() {
            return new fe5(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.a = (wq3) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fe5 mutate() {
        this.a = new b(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.a;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.a.a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = ge5.b(iArr);
        b bVar = this.a;
        if (bVar.b == zB) {
            return zOnStateChange;
        }
        bVar.b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.a.setColorFilter(colorFilter);
    }

    @Override // com.zepto.h06
    public void setShapeAppearanceModel(e06 e06Var) {
        this.a.a.setShapeAppearanceModel(e06Var);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.a.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.a.a.setTintMode(mode);
    }

    public fe5(e06 e06Var) {
        this(new b(new wq3(e06Var)));
    }

    public fe5(b bVar) {
        this.a = bVar;
    }
}
