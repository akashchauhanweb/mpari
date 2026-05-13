package com.zepto;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class f06 {
    public final g06[] a = new g06[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final g06 g = new g06();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    public static class a {
        public static final f06 a = new f06();
    }

    public interface b {
        void a(g06 g06Var, Matrix matrix, int i);

        void b(g06 g06Var, Matrix matrix, int i);
    }

    public static final class c {
        public final e06 a;
        public final Path b;
        public final RectF c;
        public final b d;
        public final float e;

        public c(e06 e06Var, float f, RectF rectF, b bVar, Path path) {
            this.d = bVar;
            this.a = e06Var;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public f06() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new g06();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static f06 k() {
        return a.a;
    }

    public final float a(int i) {
        return ((i + 1) % 4) * 90;
    }

    public final void b(c cVar, int i) {
        this.h[0] = this.a[i].k();
        this.h[1] = this.a[i].l();
        this.b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i].d(this.b[i], cVar.b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.a[i], this.b[i], i);
        }
    }

    public final void c(c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].k();
        this.i[1] = this.a[i2].l();
        this.b[i2].mapPoints(this.i);
        float f = this.h[0];
        float[] fArr = this.i;
        float fMax = Math.max(((float) Math.hypot(f - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.c, i);
        this.g.n(0.0f, 0.0f);
        mz1 mz1VarJ = j(i, cVar.a);
        mz1VarJ.b(fMax, fI, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && (mz1VarJ.a() || l(this.j, i) || l(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr2 = this.h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.g.d(this.c[i], this.e);
        } else {
            this.g.d(this.c[i], cVar.b);
        }
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.g, this.c[i], i);
        }
    }

    public void d(e06 e06Var, float f, RectF rectF, Path path) {
        e(e06Var, f, rectF, null, path);
    }

    public void e(e06 e06Var, float f, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(e06Var, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m(cVar, i);
            n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    public final void f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final oz0 g(int i, e06 e06Var) {
        return i != 1 ? i != 2 ? i != 3 ? e06Var.t() : e06Var.r() : e06Var.j() : e06Var.l();
    }

    public final pz0 h(int i, e06 e06Var) {
        return i != 1 ? i != 2 ? i != 3 ? e06Var.s() : e06Var.q() : e06Var.i() : e06Var.k();
    }

    public final float i(RectF rectF, int i) {
        float[] fArr = this.h;
        g06 g06Var = this.a[i];
        fArr[0] = g06Var.c;
        fArr[1] = g06Var.d;
        this.b[i].mapPoints(fArr);
        return (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.h[0]) : Math.abs(rectF.centerY() - this.h[1]);
    }

    public final mz1 j(int i, e06 e06Var) {
        return i != 1 ? i != 2 ? i != 3 ? e06Var.o() : e06Var.p() : e06Var.n() : e06Var.h();
    }

    public final boolean l(Path path, int i) {
        this.k.reset();
        this.a[i].d(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(c cVar, int i) {
        h(i, cVar.a).b(this.a[i], 90.0f, cVar.e, cVar.c, g(i, cVar.a));
        float fA = a(i);
        this.b[i].reset();
        f(i, cVar.c, this.d);
        Matrix matrix = this.b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i].preRotate(fA);
    }

    public final void n(int i) {
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        float fA = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(fA);
    }
}
