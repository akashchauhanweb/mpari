package com.nic.mparivahan.dlservices.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Lcom/nic/mparivahan/dlservices/widget/MyTextView;", "Landroid/widget/TextView;", "", "a", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "app_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"AppCompatCustomView"})
public final class MyTextView extends TextView {
    public MyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf"), 1);
    }

    public MyTextView(Context context) {
        super(context);
        a();
    }
}
