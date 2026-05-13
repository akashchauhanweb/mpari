package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class tq extends CheckBox implements mg6 {
    public final wq a;
    public final rq b;
    public final xr c;
    public kr d;

    public tq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.o);
    }

    private kr getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new kr(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        rq rqVar = this.b;
        if (rqVar != null) {
            rqVar.b();
        }
        xr xrVar = this.c;
        if (xrVar != null) {
            xrVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        wq wqVar = this.a;
        return wqVar != null ? wqVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        rq rqVar = this.b;
        if (rqVar != null) {
            return rqVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        rq rqVar = this.b;
        if (rqVar != null) {
            return rqVar.d();
        }
        return null;
    }

    @Override // com.zepto.mg6
    public ColorStateList getSupportButtonTintList() {
        wq wqVar = this.a;
        if (wqVar != null) {
            return wqVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        wq wqVar = this.a;
        if (wqVar != null) {
            return wqVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        rq rqVar = this.b;
        if (rqVar != null) {
            rqVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        rq rqVar = this.b;
        if (rqVar != null) {
            rqVar.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        wq wqVar = this.a;
        if (wqVar != null) {
            wqVar.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xr xrVar = this.c;
        if (xrVar != null) {
            xrVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xr xrVar = this.c;
        if (xrVar != null) {
            xrVar.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        rq rqVar = this.b;
        if (rqVar != null) {
            rqVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        rq rqVar = this.b;
        if (rqVar != null) {
            rqVar.j(mode);
        }
    }

    @Override // com.zepto.mg6
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        wq wqVar = this.a;
        if (wqVar != null) {
            wqVar.g(colorStateList);
        }
    }

    @Override // com.zepto.mg6
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        wq wqVar = this.a;
        if (wqVar != null) {
            wqVar.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.w(colorStateList);
        this.c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.x(mode);
        this.c.b();
    }

    public tq(Context context, AttributeSet attributeSet, int i) {
        super(ig6.b(context), attributeSet, i);
        jf6.a(this, getContext());
        wq wqVar = new wq(this);
        this.a = wqVar;
        wqVar.e(attributeSet, i);
        rq rqVar = new rq(this);
        this.b = rqVar;
        rqVar.e(attributeSet, i);
        xr xrVar = new xr(this);
        this.c = xrVar;
        xrVar.m(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(tr.b(getContext(), i));
    }
}
