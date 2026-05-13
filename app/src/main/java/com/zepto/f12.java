package com.zepto;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class f12 {
    public final b a;
    public int b = IntCompanionObject.MAX_VALUE;
    public int c = 0;

    public static class a extends b {
        public final EditText a;
        public final n12 b;

        public a(EditText editText, boolean z) {
            this.a = editText;
            n12 n12Var = new n12(editText, z);
            this.b = n12Var;
            editText.addTextChangedListener(n12Var);
            editText.setEditableFactory(g12.getInstance());
        }

        @Override // com.zepto.f12.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof j12) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new j12(keyListener);
        }

        @Override // com.zepto.f12.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof h12 ? inputConnection : new h12(this.a, inputConnection, editorInfo);
        }

        @Override // com.zepto.f12.b
        public void c(boolean z) {
            this.b.c(z);
        }
    }

    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void c(boolean z);
    }

    public f12(EditText editText, boolean z) {
        lu4.h(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.b(inputConnection, editorInfo);
    }

    public void c(boolean z) {
        this.a.c(z);
    }
}
