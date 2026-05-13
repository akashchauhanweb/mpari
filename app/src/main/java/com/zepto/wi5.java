package com.zepto;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class wi5 {
    public final RelativeLayout a;

    public wi5(RelativeLayout relativeLayout) {
        this.a = relativeLayout;
    }

    public static wi5 a(View view) {
        if (view != null) {
            return new wi5((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }
}
