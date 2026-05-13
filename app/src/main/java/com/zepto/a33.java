package com.zepto;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class a33 {
    public final LinearLayout a;

    public a33(LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    public static a33 a(View view) {
        if (view != null) {
            return new a33((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }
}
