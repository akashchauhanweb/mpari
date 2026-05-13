package com.zepto;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class am4 extends l22 {
    public int e;
    public EditText f;
    public final View.OnClickListener g;

    public am4(com.google.android.material.textfield.a aVar, int i) {
        super(aVar);
        this.e = qz4.a;
        this.g = new View.OnClickListener() { // from class: com.zepto.zl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y(view);
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    public static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText = this.f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (w()) {
            this.f.setTransformationMethod(null);
        } else {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f.setSelection(selectionEnd);
        }
        r();
    }

    @Override // com.zepto.l22
    public void b(CharSequence charSequence, int i, int i2, int i3) {
        r();
    }

    @Override // com.zepto.l22
    public int c() {
        return b15.v;
    }

    @Override // com.zepto.l22
    public int d() {
        return this.e;
    }

    @Override // com.zepto.l22
    public View.OnClickListener f() {
        return this.g;
    }

    @Override // com.zepto.l22
    public boolean l() {
        return true;
    }

    @Override // com.zepto.l22
    public boolean m() {
        return !w();
    }

    @Override // com.zepto.l22
    public void n(EditText editText) {
        this.f = editText;
        r();
    }

    @Override // com.zepto.l22
    public void s() {
        if (x(this.f)) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.zepto.l22
    public void u() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
