package com.zepto;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class n12 implements TextWatcher {
    public final EditText a;
    public final boolean b;
    public c.e c;
    public int d = IntCompanionObject.MAX_VALUE;
    public int e = 0;
    public boolean f = true;

    public static class a extends c.e {
        public final Reference a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.e
        public void b() {
            super.b();
            n12.b((EditText) this.a.get(), 1);
        }
    }

    public n12(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    public static void b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.b().o(editableText);
            i12.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final c.e a() {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void c(boolean z) {
        if (this.f != z) {
            if (this.c != null) {
                androidx.emoji2.text.c.b().t(this.c);
            }
            this.f = z;
            if (z) {
                b(this.a, androidx.emoji2.text.c.b().d());
            }
        }
    }

    public final boolean d() {
        return (this.f && (this.b || androidx.emoji2.text.c.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.isInEditMode() || d() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iD = androidx.emoji2.text.c.b().d();
        if (iD != 0) {
            if (iD == 1) {
                androidx.emoji2.text.c.b().r((Spannable) charSequence, i, i + i3, this.d, this.e);
                return;
            } else if (iD != 3) {
                return;
            }
        }
        androidx.emoji2.text.c.b().s(a());
    }
}
