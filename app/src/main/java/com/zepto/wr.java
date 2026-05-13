package com.zepto;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class wr {
    public TextView a;
    public TextClassifier b;

    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public wr(TextView textView) {
        this.a = (TextView) lu4.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        return textClassifier == null ? a.a(this.a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
