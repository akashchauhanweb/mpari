package com.zepto;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class es7 extends ns7 {
    public static boolean c = true;

    @Override // com.zepto.ns7
    public void a(View view) {
    }

    @Override // com.zepto.ns7
    public float b(View view) {
        if (c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // com.zepto.ns7
    public void c(View view) {
    }

    @Override // com.zepto.ns7
    public void e(View view, float f) {
        if (c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f);
    }
}
