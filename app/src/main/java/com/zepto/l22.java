package com.zepto;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.zepto.z2;

/* JADX INFO: loaded from: classes.dex */
public abstract class l22 {
    public final TextInputLayout a;
    public final com.google.android.material.textfield.a b;
    public final Context c;
    public final CheckableImageButton d;

    public l22(com.google.android.material.textfield.a aVar) {
        this.a = aVar.a;
        this.b = aVar;
        this.c = aVar.getContext();
        this.d = aVar.r();
    }

    public void a(Editable editable) {
    }

    public void b(CharSequence charSequence, int i, int i2, int i3) {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public z2.b h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public void n(EditText editText) {
    }

    public void o(View view, r3 r3Var) {
    }

    public void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void q(boolean z) {
    }

    public final void r() {
        this.b.L(false);
    }

    public void s() {
    }

    public boolean t() {
        return false;
    }

    public void u() {
    }
}
