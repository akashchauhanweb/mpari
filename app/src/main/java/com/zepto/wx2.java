package com.zepto;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.zepto.ds4;

/* JADX INFO: loaded from: classes2.dex */
public class wx2 extends s5 {
    public ha0 m;

    public wx2(ds4 ds4Var, ImageView imageView, jc5 jc5Var, int i, int i2, int i3, Drawable drawable, String str, Object obj, ha0 ha0Var, boolean z) {
        super(ds4Var, imageView, jc5Var, i, i2, i3, drawable, str, obj, z);
        this.m = ha0Var;
    }

    @Override // com.zepto.s5
    public void a() {
        super.a();
        if (this.m != null) {
            this.m = null;
        }
    }

    @Override // com.zepto.s5
    public void b(Bitmap bitmap, ds4.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        ds4 ds4Var = this.a;
        es4.c(imageView, ds4Var.d, bitmap, eVar, this.d, ds4Var.l);
        ha0 ha0Var = this.m;
        if (ha0Var != null) {
            ha0Var.b();
        }
    }

    @Override // com.zepto.s5
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i = this.g;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        ha0 ha0Var = this.m;
        if (ha0Var != null) {
            ha0Var.a(exc);
        }
    }
}
