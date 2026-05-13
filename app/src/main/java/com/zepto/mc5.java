package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.zepto.ds4;
import com.zepto.jc5;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class mc5 {
    public static final AtomicInteger m = new AtomicInteger();
    public final ds4 a;
    public final jc5.b b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public Object l;

    public mc5(ds4 ds4Var, Uri uri, int i) {
        if (ds4Var.n) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.a = ds4Var;
        this.b = new jc5.b(uri, i, ds4Var.k);
    }

    public mc5 a() {
        this.b.b(17);
        return this;
    }

    public mc5 b() {
        this.b.c();
        return this;
    }

    public mc5 c() {
        this.l = null;
        return this;
    }

    public final jc5 d(long j) {
        int andIncrement = m.getAndIncrement();
        jc5 jc5VarA = this.b.a();
        jc5VarA.a = andIncrement;
        jc5VarA.b = j;
        boolean z = this.a.m;
        if (z) {
            nt6.t("Main", "created", jc5VarA.g(), jc5VarA.toString());
        }
        jc5 jc5VarO = this.a.o(jc5VarA);
        if (jc5VarO != jc5VarA) {
            jc5VarO.a = andIncrement;
            jc5VarO.b = j;
            if (z) {
                nt6.t("Main", "changed", jc5VarO.d(), "into " + jc5VarO);
            }
        }
        return jc5VarO;
    }

    public mc5 e(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.g = i;
        return this;
    }

    public mc5 f() {
        this.d = true;
        return this;
    }

    public final Drawable g() {
        int i = this.f;
        return i != 0 ? this.a.d.getDrawable(i) : this.j;
    }

    public void h(ImageView imageView) {
        i(imageView, null);
    }

    public void i(ImageView imageView, ha0 ha0Var) {
        Bitmap bitmapL;
        long jNanoTime = System.nanoTime();
        nt6.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.b.d()) {
            this.a.b(imageView);
            if (this.e) {
                es4.d(imageView, g());
                return;
            }
            return;
        }
        if (this.d) {
            if (this.b.e()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.e) {
                    es4.d(imageView, g());
                }
                this.a.d(imageView, new vg1(this, imageView, ha0Var));
                return;
            }
            this.b.f(width, height);
        }
        jc5 jc5VarD = d(jNanoTime);
        String strF = nt6.f(jc5VarD);
        if (!os3.a(this.h) || (bitmapL = this.a.l(strF)) == null) {
            if (this.e) {
                es4.d(imageView, g());
            }
            this.a.f(new wx2(this.a, imageView, jc5VarD, this.h, this.i, this.g, this.k, strF, this.l, ha0Var, this.c));
            return;
        }
        this.a.b(imageView);
        ds4 ds4Var = this.a;
        Context context = ds4Var.d;
        ds4.e eVar = ds4.e.MEMORY;
        es4.c(imageView, context, bitmapL, eVar, this.c, ds4Var.l);
        if (this.a.m) {
            nt6.t("Main", "completed", jc5VarD.g(), "from " + eVar);
        }
        if (ha0Var != null) {
            ha0Var.b();
        }
    }

    public mc5 j(int i) {
        if (!this.e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f = i;
        return this;
    }

    public mc5 k(int i, int i2) {
        this.b.f(i, i2);
        return this;
    }

    public mc5 l(an6 an6Var) {
        this.b.g(an6Var);
        return this;
    }

    public mc5 m() {
        this.d = false;
        return this;
    }
}
