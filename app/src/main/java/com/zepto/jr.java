package com.zepto;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class jr {
    public final EditText a;
    public final f12 b;

    public jr(EditText editText) {
        this.a = editText;
        this.b = new f12(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, c25.g0, i, 0);
        try {
            int i2 = c25.u0;
            boolean z = typedArrayObtainStyledAttributes.hasValue(i2) ? typedArrayObtainStyledAttributes.getBoolean(i2, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.b.b(inputConnection, editorInfo);
    }

    public void e(boolean z) {
        this.b.c(z);
    }
}
