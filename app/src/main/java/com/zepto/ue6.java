package com.zepto;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class ue6 {
    public float c;
    public float d;
    public pe6 g;
    public final TextPaint a = new TextPaint(1);
    public final re6 b = new a();
    public boolean e = true;
    public WeakReference f = new WeakReference(null);

    public class a extends re6 {
        public a() {
        }

        @Override // com.zepto.re6
        public void a(int i) {
            ue6.this.e = true;
            b bVar = (b) ue6.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.zepto.re6
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            ue6.this.e = true;
            b bVar = (b) ue6.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public ue6(b bVar) {
        i(bVar);
    }

    public final float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.a.getFontMetrics().ascent);
    }

    public final float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public pe6 e() {
        return this.g;
    }

    public TextPaint f() {
        return this.a;
    }

    public float g(String str) {
        if (!this.e) {
            return this.c;
        }
        h(str);
        return this.c;
    }

    public final void h(String str) {
        this.c = d(str);
        this.d = c(str);
        this.e = false;
    }

    public void i(b bVar) {
        this.f = new WeakReference(bVar);
    }

    public void j(pe6 pe6Var, Context context) {
        if (this.g != pe6Var) {
            this.g = pe6Var;
            if (pe6Var != null) {
                pe6Var.o(context, this.a, this.b);
                b bVar = (b) this.f.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                pe6Var.n(context, this.a, this.b);
                this.e = true;
            }
            b bVar2 = (b) this.f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z) {
        this.e = z;
    }

    public void l(Context context) {
        this.g.n(context, this.a, this.b);
    }
}
