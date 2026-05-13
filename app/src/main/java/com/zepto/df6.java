package com.zepto;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class df6 {

    public class a implements TextWatcher {
        public final /* synthetic */ g13 a;

        public a(c cVar, d dVar, g13 g13Var, b bVar) {
            this.a = g13Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            g13 g13Var = this.a;
            if (g13Var != null) {
                g13Var.a();
            }
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void c(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void d(TextView textView, c cVar, d dVar, b bVar, g13 g13Var) {
        a aVar = (cVar == null && bVar == null && dVar == null && g13Var == null) ? null : new a(cVar, dVar, g13Var, bVar);
        TextWatcher textWatcher = (TextWatcher) ag3.a(textView, aVar, g05.a);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }
}
