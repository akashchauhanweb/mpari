package com.zepto;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class or extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};
    public final rq a;
    public final xr b;
    public final jr c;

    public or(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.m);
    }

    public void a(jr jrVar) {
        KeyListener keyListener = getKeyListener();
        if (jrVar.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = jrVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.b();
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        rq rqVar = this.a;
        if (rqVar != null) {
            return rqVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        rq rqVar = this.a;
        if (rqVar != null) {
            return rqVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.c.d(lr.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(tr.b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.q(context, i);
        }
    }

    public or(Context context, AttributeSet attributeSet, int i) {
        super(ig6.b(context), attributeSet, i);
        jf6.a(this, getContext());
        lg6 lg6VarV = lg6.v(getContext(), attributeSet, d, i, 0);
        if (lg6VarV.s(0)) {
            setDropDownBackgroundDrawable(lg6VarV.g(0));
        }
        lg6VarV.w();
        rq rqVar = new rq(this);
        this.a = rqVar;
        rqVar.e(attributeSet, i);
        xr xrVar = new xr(this);
        this.b = xrVar;
        xrVar.m(attributeSet, i);
        xrVar.b();
        jr jrVar = new jr(this);
        this.c = jrVar;
        jrVar.c(attributeSet, i);
        a(jrVar);
    }
}
