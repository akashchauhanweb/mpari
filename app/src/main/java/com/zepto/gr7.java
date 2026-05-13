package com.zepto;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes.dex */
public class gr7 implements hr7 {
    public final ViewOverlay a;

    public gr7(View view) {
        this.a = view.getOverlay();
    }

    @Override // com.zepto.hr7
    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.zepto.hr7
    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
