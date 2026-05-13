package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class r63 {
    public final s63 a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[qj4.values().length];
            a = iArr2;
            try {
                iArr2[qj4.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[qj4.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[qj4.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[qj4.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    public r63(s63 s63Var) {
        this.a = s63Var;
    }

    public static r63 a(String str, byte[] bArr, b bVar) {
        return new r63((s63) s63.c0().u(str).v(s80.u(bArr)).t(c(bVar)).h());
    }

    public static qj4 c(b bVar) {
        int i = a.b[bVar.ordinal()];
        if (i == 1) {
            return qj4.TINK;
        }
        if (i == 2) {
            return qj4.LEGACY;
        }
        if (i == 3) {
            return qj4.RAW;
        }
        if (i == 4) {
            return qj4.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    public s63 b() {
        return this.a;
    }
}
