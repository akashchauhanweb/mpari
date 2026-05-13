package com.google.android.material.carousel;

import com.zepto.rp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final float a;
    public final List b;
    public final int c;
    public final int d;

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0035b {
        public final float a;
        public final float b;
        public c d;
        public c e;
        public final List c = new ArrayList();
        public int f = -1;
        public int g = -1;
        public float h = 0.0f;
        public int i = -1;

        public C0035b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public static float i(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        public C0035b a(float f, float f2, float f3) {
            return d(f, f2, f3, false, true);
        }

        public C0035b b(float f, float f2, float f3) {
            return c(f, f2, f3, false);
        }

        public C0035b c(float f, float f2, float f3, boolean z) {
            return d(f, f2, f3, z, false);
        }

        public C0035b d(float f, float f2, float f3, boolean z, boolean z2) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            float f7 = this.b;
            if (f6 > f7) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
            } else {
                fAbs = 0.0f;
                if (f5 < 0.0f) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, 0.0f));
                }
            }
            return e(f, f2, f3, z, z2, fAbs);
        }

        public C0035b e(float f, float f2, float f3, boolean z, boolean z2, float f4) {
            if (f3 <= 0.0f) {
                return this;
            }
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = this.c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f, f2, f3, z2, f4);
            if (z) {
                if (this.d == null) {
                    this.d = cVar;
                    this.f = this.c.size();
                }
                if (this.g != -1 && this.c.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.d.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.e = cVar;
                this.g = this.c.size();
            } else {
                if (this.d == null && cVar.d < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.e != null && cVar.d > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = cVar.d;
            this.c.add(cVar);
            return this;
        }

        public C0035b f(float f, float f2, float f3, int i) {
            return g(f, f2, f3, i, false);
        }

        public C0035b g(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    c((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        public b h() {
            if (this.d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.c.size(); i++) {
                c cVar = (c) this.c.get(i);
                arrayList.add(new c(i(this.d.b, this.a, this.f, i), cVar.b, cVar.c, cVar.d, cVar.e, cVar.f));
            }
            return new b(this.a, arrayList, this.f, this.g);
        }
    }

    public static final class c {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final boolean e;
        public final float f;

        public c(float f, float f2, float f3, float f4) {
            this(f, f2, f3, f4, false, 0.0f);
        }

        public static c a(c cVar, c cVar2, float f) {
            return new c(rp.a(cVar.a, cVar2.a, f), rp.a(cVar.b, cVar2.b, f), rp.a(cVar.c, cVar2.c, f), rp.a(cVar.d, cVar2.d, f));
        }

        public c(float f, float f2, float f3, float f4, boolean z, float f5) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
        }
    }

    public static b l(b bVar, b bVar2, float f) {
        if (bVar.f() != bVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listG = bVar.g();
        List listG2 = bVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bVar.g().size(); i++) {
            arrayList.add(c.a((c) listG.get(i), (c) listG2.get(i), f));
        }
        return new b(bVar.f(), arrayList, rp.c(bVar.b(), bVar2.b(), f), rp.c(bVar.i(), bVar2.i(), f));
    }

    public static b m(b bVar, float f) {
        C0035b c0035b = new C0035b(bVar.f(), f);
        float f2 = (f - bVar.j().b) - (bVar.j().d / 2.0f);
        int size = bVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) bVar.g().get(size);
            c0035b.d(f2 + (cVar.d / 2.0f), cVar.c, cVar.d, size >= bVar.b() && size <= bVar.i(), cVar.e);
            f2 += cVar.d;
            size--;
        }
        return c0035b.h();
    }

    public c a() {
        return (c) this.b.get(this.c);
    }

    public int b() {
        return this.c;
    }

    public c c() {
        return (c) this.b.get(0);
    }

    public c d() {
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = (c) this.b.get(i);
            if (!cVar.e) {
                return cVar;
            }
        }
        return null;
    }

    public List e() {
        return this.b.subList(this.c, this.d + 1);
    }

    public float f() {
        return this.a;
    }

    public List g() {
        return this.b;
    }

    public c h() {
        return (c) this.b.get(this.d);
    }

    public int i() {
        return this.d;
    }

    public c j() {
        return (c) this.b.get(r0.size() - 1);
    }

    public c k() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.b.get(size);
            if (!cVar.e) {
                return cVar;
            }
        }
        return null;
    }

    public b(float f, List list, int i, int i2) {
        this.a = f;
        this.b = Collections.unmodifiableList(list);
        this.c = i;
        this.d = i2;
    }
}
