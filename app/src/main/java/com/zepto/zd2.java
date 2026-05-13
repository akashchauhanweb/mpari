package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class zd2 implements Comparable {
    public b c;
    public float e;
    public int f;
    public p40 g;
    public s40 h;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.COURIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.HELVETICA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.TIMES_ROMAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.SYMBOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ZAPFDINGBATS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        COURIER,
        HELVETICA,
        TIMES_ROMAN,
        SYMBOL,
        ZAPFDINGBATS,
        UNDEFINED
    }

    public zd2(zd2 zd2Var) {
        this.c = b.UNDEFINED;
        this.e = -1.0f;
        this.f = -1;
        this.g = null;
        this.h = null;
        this.c = zd2Var.c;
        this.e = zd2Var.e;
        this.f = zd2Var.f;
        this.g = zd2Var.g;
        this.h = zd2Var.h;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(zd2 zd2Var) {
        if (zd2Var == null) {
            return -1;
        }
        try {
            s40 s40Var = this.h;
            if (s40Var != null && !s40Var.equals(zd2Var.c())) {
                return -2;
            }
            if (this.c != zd2Var.h()) {
                return 1;
            }
            if (this.e != zd2Var.j()) {
                return 2;
            }
            if (this.f != zd2Var.k()) {
                return 3;
            }
            p40 p40Var = this.g;
            return p40Var == null ? zd2Var.g == null ? 0 : 4 : (zd2Var.g != null && p40Var.equals(zd2Var.g())) ? 0 : 4;
        } catch (ClassCastException unused) {
            return -3;
        }
    }

    public zd2 b(zd2 zd2Var) {
        if (zd2Var == null) {
            return this;
        }
        float f = zd2Var.e;
        if (f == -1.0f) {
            f = this.e;
        }
        int i = this.f;
        int iK = zd2Var.k();
        int i2 = -1;
        if (i != -1 || iK != -1) {
            if (i == -1) {
                i = 0;
            }
            if (iK == -1) {
                iK = 0;
            }
            i2 = i | iK;
        }
        p40 p40Var = zd2Var.g;
        if (p40Var == null) {
            p40Var = this.g;
        }
        s40 s40Var = zd2Var.h;
        if (s40Var != null) {
            return new zd2(s40Var, f, i2, p40Var);
        }
        if (zd2Var.h() != b.UNDEFINED) {
            return new zd2(zd2Var.c, f, i2, p40Var);
        }
        s40 s40Var2 = this.h;
        return s40Var2 != null ? i2 == i ? new zd2(s40Var2, f, i2, p40Var) : be2.a(i(), f, i2, p40Var) : new zd2(this.c, f, i2, p40Var);
    }

    public s40 c() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[PHI: r0
      0x003d: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v7 java.lang.String) binds: [B:28:0x0044, B:24:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[PHI: r0
      0x0040: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v7 java.lang.String) binds: [B:28:0x0044, B:24:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.s40 d(boolean r9) {
        /*
            r8 = this;
            com.zepto.s40 r0 = r8.h
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r8.f
            r1 = -1
            r2 = 0
            if (r0 != r1) goto Lc
            r0 = r2
        Lc:
            int[] r1 = com.zepto.zd2.a.a
            com.zepto.zd2$b r3 = r8.c
            int r3 = r3.ordinal()
            r1 = r1[r3]
            r3 = 2
            r4 = 1
            r5 = 3
            java.lang.String r6 = "Cp1252"
            if (r1 == r4) goto L5b
            if (r1 == r5) goto L47
            r7 = 4
            if (r1 == r7) goto L42
            r7 = 5
            if (r1 == r7) goto L39
            r9 = r0 & 3
            if (r9 == r4) goto L36
            if (r9 == r3) goto L33
            if (r9 == r5) goto L30
            java.lang.String r9 = "Helvetica"
            goto L6e
        L30:
            java.lang.String r9 = "Helvetica-BoldOblique"
            goto L6e
        L33:
            java.lang.String r9 = "Helvetica-Oblique"
            goto L6e
        L36:
            java.lang.String r9 = "Helvetica-Bold"
            goto L6e
        L39:
            java.lang.String r0 = "ZapfDingbats"
            if (r9 == 0) goto L40
        L3d:
            r9 = r0
            r6 = r9
            goto L6e
        L40:
            r9 = r0
            goto L6e
        L42:
            java.lang.String r0 = "Symbol"
            if (r9 == 0) goto L40
            goto L3d
        L47:
            r9 = r0 & 3
            if (r9 == r4) goto L58
            if (r9 == r3) goto L55
            if (r9 == r5) goto L52
            java.lang.String r9 = "Times-Roman"
            goto L6e
        L52:
            java.lang.String r9 = "Times-BoldItalic"
            goto L6e
        L55:
            java.lang.String r9 = "Times-Italic"
            goto L6e
        L58:
            java.lang.String r9 = "Times-Bold"
            goto L6e
        L5b:
            r9 = r0 & 3
            if (r9 == r4) goto L6c
            if (r9 == r3) goto L69
            if (r9 == r5) goto L66
            java.lang.String r9 = "Courier"
            goto L6e
        L66:
            java.lang.String r9 = "Courier-BoldOblique"
            goto L6e
        L69:
            java.lang.String r9 = "Courier-Oblique"
            goto L6e
        L6c:
            java.lang.String r9 = "Courier-Bold"
        L6e:
            com.zepto.s40 r9 = com.zepto.s40.d(r9, r6, r2)     // Catch: java.lang.Exception -> L73
            return r9
        L73:
            r9 = move-exception
            com.zepto.p52 r0 = new com.zepto.p52
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.zd2.d(boolean):com.zepto.s40");
    }

    public float e(float f) {
        return f * f();
    }

    public float f() {
        float f = this.e;
        if (f == -1.0f) {
            return 12.0f;
        }
        return f;
    }

    public p40 g() {
        return this.g;
    }

    public b h() {
        return this.c;
    }

    public String i() {
        int i = a.a[h().ordinal()];
        if (i == 1) {
            return "Courier";
        }
        if (i == 2) {
            return "Helvetica";
        }
        if (i == 3) {
            return "Times-Roman";
        }
        if (i == 4) {
            return "Symbol";
        }
        if (i == 5) {
            return "ZapfDingbats";
        }
        s40 s40Var = this.h;
        String str = "unknown";
        if (s40Var != null) {
            for (String[] strArr : s40Var.k()) {
                if ("0".equals(strArr[2])) {
                    return strArr[3];
                }
                if ("1033".equals(strArr[2])) {
                    str = strArr[3];
                }
                if ("".equals(strArr[2])) {
                    str = strArr[3];
                }
            }
        }
        return str;
    }

    public float j() {
        return this.e;
    }

    public int k() {
        return this.f;
    }

    public boolean l() {
        return this.c == b.UNDEFINED && this.e == -1.0f && this.f == -1 && this.g == null && this.h == null;
    }

    public boolean m() {
        int i = this.f;
        return i != -1 && (i & 8) == 8;
    }

    public boolean n() {
        int i = this.f;
        return i != -1 && (i & 4) == 4;
    }

    public void o(int i) {
        this.f = i;
    }

    public zd2(b bVar, float f, int i, p40 p40Var) {
        b bVar2 = b.COURIER;
        this.h = null;
        this.c = bVar;
        this.e = f;
        this.f = i;
        this.g = p40Var;
    }

    public zd2(s40 s40Var, float f, int i, p40 p40Var) {
        this.c = b.UNDEFINED;
        this.h = s40Var;
        this.e = f;
        this.f = i;
        this.g = p40Var;
    }

    public zd2() {
        this(b.UNDEFINED, -1.0f, -1, (p40) null);
    }
}
