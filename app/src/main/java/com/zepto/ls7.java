package com.zepto;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ls7 extends js7 {
    public static boolean g = true;

    @Override // com.zepto.ns7
    public void f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i);
        } else if (g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
