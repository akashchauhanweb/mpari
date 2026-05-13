package com.zepto;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class js7 extends hs7 {
    public static boolean f = true;

    @Override // com.zepto.ns7
    public void d(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
