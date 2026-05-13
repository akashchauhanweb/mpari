package com.zepto;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class pp {
    public Animatable2.AnimationCallback a;

    public class a extends Animatable2.AnimationCallback {
        public a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            pp.this.b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            pp.this.c(drawable);
        }
    }

    public Animatable2.AnimationCallback a() {
        if (this.a == null) {
            this.a = new a();
        }
        return this.a;
    }

    public void b(Drawable drawable) {
    }

    public void c(Drawable drawable) {
    }
}
