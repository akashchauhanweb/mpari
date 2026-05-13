package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class uq extends CheckedTextView {
    public final vq a;
    public final rq b;
    public final xr c;
    public kr d;

    public uq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.p);
    }

    private kr getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new kr(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        xr xrVar = this.c;
        if (xrVar != null) {
            xrVar.b();
        }
        rq rqVar = this.b;
        if (rqVar != null) {
            rqVar.b();
        }
        vq vqVar = this.a;
        if (vqVar != null) {
            vqVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ef6.p(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        vq vqVar = this.a;
        if (vqVar != null) {
            return vqVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        vq vqVar = this.a;
        if (vqVar != null) {
            return vqVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return lr.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        vq vqVar = this.a;
        if (vqVar != null) {
            vqVar.e();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ef6.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        vq vqVar = this.a;
        if (vqVar != null) {
            vqVar.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        vq vqVar = this.a;
        if (vqVar != null) {
            vqVar.g(mode);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xr xrVar = this.c;
        if (xrVar != null) {
            xrVar.q(context, i);
        }
    }

    public uq(Context context, AttributeSet attributeSet, int i) {
        super(ig6.b(context), attributeSet, i);
        jf6.a(this, getContext());
        xr xrVar = new xr(this);
        this.c = xrVar;
        xrVar.m(attributeSet, i);
        xrVar.b();
        rq rqVar = new rq(this);
        this.b = rqVar;
        rqVar.e(attributeSet, i);
        vq vqVar = new vq(this);
        this.a = vqVar;
        vqVar.d(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(tr.b(getContext(), i));
    }
}
