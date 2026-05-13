package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.zepto.ah4;
import com.zepto.c02;
import com.zepto.dq7;
import com.zepto.ef6;
import com.zepto.ff6;
import com.zepto.ig6;
import com.zepto.jf6;
import com.zepto.jr;
import com.zepto.lr;
import com.zepto.ly0;
import com.zepto.rq;
import com.zepto.sr;
import com.zepto.wr;
import com.zepto.wy2;
import com.zepto.xr;
import com.zepto.zy4;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements ah4 {
    public final rq a;
    public final xr b;
    public final wr c;
    public final ff6 d;
    public final jr e;
    public a f;

    public class a {
        public a() {
        }

        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.B);
    }

    private a getSuperCaller() {
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    @Override // com.zepto.ah4
    public ly0 a(ly0 ly0Var) {
        return this.d.a(this, ly0Var);
    }

    public void d(jr jrVar) {
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ef6.p(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        wr wrVar;
        return (Build.VERSION.SDK_INT >= 28 || (wrVar = this.c) == null) ? getSuperCaller().a() : wrVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrE;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = lr.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrE = dq7.E(this)) != null) {
            c02.c(editorInfo, strArrE);
            inputConnectionA = wy2.c(this, inputConnectionA, editorInfo);
        }
        return this.e.d(inputConnectionA, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (sr.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (sr.b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ef6.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        wr wrVar;
        if (Build.VERSION.SDK_INT >= 28 || (wrVar = this.c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            wrVar.b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(ig6.b(context), attributeSet, i);
        jf6.a(this, getContext());
        rq rqVar = new rq(this);
        this.a = rqVar;
        rqVar.e(attributeSet, i);
        xr xrVar = new xr(this);
        this.b = xrVar;
        xrVar.m(attributeSet, i);
        xrVar.b();
        this.c = new wr(this);
        this.d = new ff6();
        jr jrVar = new jr(this);
        this.e = jrVar;
        jrVar.c(attributeSet, i);
        d(jrVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
