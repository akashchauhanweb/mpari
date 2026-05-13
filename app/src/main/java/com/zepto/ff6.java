package com.zepto;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ff6 implements zg4 {

    public static final class a {
        public static CharSequence a(Context context, ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
    }

    public static CharSequence b(Context context, ClipData.Item item, int i) {
        return a.a(context, item, i);
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // com.zepto.zg4
    public ly0 a(View view, ly0 ly0Var) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + ly0Var);
        }
        if (ly0Var.d() == 2) {
            return ly0Var;
        }
        ClipData clipDataB = ly0Var.b();
        int iC = ly0Var.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataB.getItemCount(); i++) {
            CharSequence charSequenceB = b(context, clipDataB.getItemAt(i), iC);
            if (charSequenceB != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z = true;
                }
            }
        }
        return null;
    }
}
