package com.zepto;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public class j06 extends i06 {
    public boolean f = false;
    public float g = 0.0f;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            j06 j06Var = j06.this;
            if (j06Var.c == null || j06Var.d.isEmpty()) {
                return;
            }
            j06 j06Var2 = j06.this;
            RectF rectF = j06Var2.d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, j06Var2.g);
        }
    }

    public j06(View view) {
        m(view);
    }

    private void m(View view) {
        view.setOutlineProvider(new a());
    }

    public static boolean p(e06 e06Var) {
        return (e06Var.q() instanceof ye5) && (e06Var.s() instanceof ye5) && (e06Var.i() instanceof ye5) && (e06Var.k() instanceof ye5);
    }

    @Override // com.zepto.i06
    public void b(View view) {
        this.g = l();
        this.f = n() || o();
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.zepto.i06
    public boolean i() {
        return !this.f || this.a;
    }

    public final float l() {
        RectF rectF;
        e06 e06Var = this.c;
        if (e06Var == null || (rectF = this.d) == null) {
            return 0.0f;
        }
        return e06Var.f.a(rectF);
    }

    public final boolean n() {
        e06 e06Var;
        if (this.d.isEmpty() || (e06Var = this.c) == null) {
            return false;
        }
        return e06Var.u(this.d);
    }

    public final boolean o() {
        e06 e06Var;
        if (!this.d.isEmpty() && (e06Var = this.c) != null && this.b && !e06Var.u(this.d) && p(this.c)) {
            float fA = this.c.r().a(this.d);
            float fA2 = this.c.t().a(this.d);
            float fA3 = this.c.j().a(this.d);
            float fA4 = this.c.l().a(this.d);
            if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                RectF rectF = this.d;
                rectF.set(rectF.left - fA2, rectF.top, rectF.right, rectF.bottom);
                this.g = fA2;
                return true;
            }
            if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                RectF rectF2 = this.d;
                rectF2.set(rectF2.left, rectF2.top - fA3, rectF2.right, rectF2.bottom);
                this.g = fA3;
                return true;
            }
            if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                RectF rectF3 = this.d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fA, rectF3.bottom);
                this.g = fA;
                return true;
            }
            if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                RectF rectF4 = this.d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fA);
                this.g = fA;
                return true;
            }
        }
        return false;
    }
}
