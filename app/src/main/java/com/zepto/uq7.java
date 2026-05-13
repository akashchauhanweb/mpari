package com.zepto;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes.dex */
public class uq7 implements vq7 {
    public final ViewGroupOverlay a;

    public uq7(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // com.zepto.vq7
    public void a(View view) {
        this.a.add(view);
    }

    @Override // com.zepto.hr7
    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.zepto.vq7
    public void c(View view) {
        this.a.remove(view);
    }

    @Override // com.zepto.hr7
    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
