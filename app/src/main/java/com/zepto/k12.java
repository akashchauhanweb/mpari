package com.zepto;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class k12 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final androidx.emoji2.text.f b;
    public volatile int c = 0;

    public k12(androidx.emoji2.text.f fVar, int i) {
        this.b = fVar;
        this.a = i;
    }

    public void a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface typefaceG = this.b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.b.c(), this.a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return g().h(i);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final ot3 g() {
        ThreadLocal threadLocal = d;
        ot3 ot3Var = (ot3) threadLocal.get();
        if (ot3Var == null) {
            ot3Var = new ot3();
            threadLocal.set(ot3Var);
        }
        this.b.d().j(ot3Var, this.a);
        return ot3Var;
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z) {
        this.c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i = 0; i < iC; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
