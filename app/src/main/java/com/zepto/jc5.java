package com.zepto;

import android.graphics.Bitmap;
import android.net.Uri;
import com.zepto.ds4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class jc5 {
    public static final long u = TimeUnit.SECONDS.toNanos(5);
    public int a;
    public long b;
    public int c;
    public final Uri d;
    public final int e;
    public final String f;
    public final List g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final float n;
    public final float o;
    public final float p;
    public final boolean q;
    public final boolean r;
    public final Bitmap.Config s;
    public final ds4.f t;

    public static final class b {
        public Uri a;
        public int b;
        public String c;
        public int d;
        public int e;
        public boolean f;
        public int g;
        public boolean h;
        public boolean i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public boolean n;
        public List o;
        public Bitmap.Config p;
        public ds4.f q;

        public b(Uri uri, int i, Bitmap.Config config) {
            this.a = uri;
            this.b = i;
            this.p = config;
        }

        public jc5 a() {
            boolean z = this.h;
            if (z && this.f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.q == null) {
                this.q = ds4.f.NORMAL;
            }
            return new jc5(this.a, this.b, this.c, this.o, this.d, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q);
        }

        public b b(int i) {
            if (this.h) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f = true;
            this.g = i;
            return this;
        }

        public b c() {
            if (this.f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.h = true;
            return this;
        }

        public boolean d() {
            return (this.a == null && this.b == 0) ? false : true;
        }

        public boolean e() {
            return (this.d == 0 && this.e == 0) ? false : true;
        }

        public b f(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.d = i;
            this.e = i2;
            return this;
        }

        public b g(an6 an6Var) {
            if (an6Var == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (an6Var.b() == null) {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.o == null) {
                this.o = new ArrayList(2);
            }
            this.o.add(an6Var);
            return this;
        }
    }

    public String a() {
        Uri uri = this.d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.e);
    }

    public boolean b() {
        return this.g != null;
    }

    public boolean c() {
        return (this.h == 0 && this.i == 0) ? false : true;
    }

    public String d() {
        long jNanoTime = System.nanoTime() - this.b;
        if (jNanoTime > u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(jNanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(jNanoTime) + "ms";
    }

    public boolean e() {
        return c() || this.n != 0.0f;
    }

    public boolean f() {
        return e() || b();
    }

    public String g() {
        return "[R" + this.a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.d);
        }
        List list = this.g;
        if (list != null && !list.isEmpty()) {
            for (an6 an6Var : this.g) {
                sb.append(' ');
                sb.append(an6Var.b());
            }
        }
        if (this.f != null) {
            sb.append(" stableKey(");
            sb.append(this.f);
            sb.append(')');
        }
        if (this.h > 0) {
            sb.append(" resize(");
            sb.append(this.h);
            sb.append(',');
            sb.append(this.i);
            sb.append(')');
        }
        if (this.j) {
            sb.append(" centerCrop");
        }
        if (this.l) {
            sb.append(" centerInside");
        }
        if (this.n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.n);
            if (this.q) {
                sb.append(" @ ");
                sb.append(this.o);
                sb.append(',');
                sb.append(this.p);
            }
            sb.append(')');
        }
        if (this.r) {
            sb.append(" purgeable");
        }
        if (this.s != null) {
            sb.append(' ');
            sb.append(this.s);
        }
        sb.append('}');
        return sb.toString();
    }

    public jc5(Uri uri, int i, String str, List list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, ds4.f fVar) {
        this.d = uri;
        this.e = i;
        this.f = str;
        if (list == null) {
            this.g = null;
        } else {
            this.g = Collections.unmodifiableList(list);
        }
        this.h = i2;
        this.i = i3;
        this.j = z;
        this.l = z2;
        this.k = i4;
        this.m = z3;
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = z4;
        this.r = z5;
        this.s = config;
        this.t = fVar;
    }
}
