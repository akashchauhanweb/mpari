package com.zepto;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.zepto.wq3;

/* JADX INFO: loaded from: classes.dex */
public abstract class l41 extends wq3 {
    public b z;

    public static class c extends l41 {
        public c(b bVar) {
            super(bVar);
        }

        @Override // com.zepto.wq3
        public void r(Canvas canvas) {
            if (this.z.w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.z.w);
            super.r(canvas);
            canvas.restore();
        }
    }

    public static l41 k0(b bVar) {
        return new c(bVar);
    }

    public static l41 l0(e06 e06Var) {
        if (e06Var == null) {
            e06Var = new e06();
        }
        return k0(new b(e06Var, new RectF()));
    }

    public boolean m0() {
        return !this.z.w.isEmpty();
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.z = new b(this.z);
        return this;
    }

    public void n0() {
        o0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void o0(float f, float f2, float f3, float f4) {
        if (f == this.z.w.left && f2 == this.z.w.top && f3 == this.z.w.right && f4 == this.z.w.bottom) {
            return;
        }
        this.z.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void p0(RectF rectF) {
        o0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final class b extends wq3.c {
        public final RectF w;

        @Override // com.zepto.wq3.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            l41 l41VarK0 = l41.k0(this);
            l41VarK0.invalidateSelf();
            return l41VarK0;
        }

        public b(e06 e06Var, RectF rectF) {
            super(e06Var, null);
            this.w = rectF;
        }

        public b(b bVar) {
            super(bVar);
            this.w = bVar.w;
        }
    }

    public l41(b bVar) {
        super(bVar);
        this.z = bVar;
    }
}
