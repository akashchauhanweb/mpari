package com.zepto;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import com.zepto.gb0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i06 {
    public e06 c;
    public boolean a = false;
    public boolean b = false;
    public RectF d = new RectF();
    public final Path e = new Path();

    public static i06 a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new k06(view) : new j06(view);
    }

    public abstract void b(View view);

    public final boolean c() {
        RectF rectF = this.d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void d(Canvas canvas, gb0.a aVar) {
        if (!i() || this.e.isEmpty()) {
            aVar.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.e);
        aVar.a(canvas);
        canvas.restore();
    }

    public void e(View view, RectF rectF) {
        this.d = rectF;
        j();
        b(view);
    }

    public void f(View view, e06 e06Var) {
        this.c = e06Var;
        j();
        b(view);
    }

    public void g(View view, boolean z) {
        if (z != this.a) {
            this.a = z;
            b(view);
        }
    }

    public void h(View view, boolean z) {
        this.b = z;
        b(view);
    }

    public abstract boolean i();

    public final void j() {
        if (!c() || this.c == null) {
            return;
        }
        f06.k().d(this.c, 1.0f, this.d, this.e);
    }
}
