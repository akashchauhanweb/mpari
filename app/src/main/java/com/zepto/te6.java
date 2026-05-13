package com.zepto;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class te6 {
    public static final se6 a = new e(null, false);
    public static final se6 b = new e(null, true);
    public static final se6 c;
    public static final se6 d;
    public static final se6 e;
    public static final se6 f;

    public static class a implements c {
        public static final a b = new a(true);
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.zepto.te6.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iA = te6.a(Character.getDirectionality(charSequence.charAt(i)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {
        public static final b a = new b();

        @Override // com.zepto.te6.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iB = 2;
            while (i < i3 && iB == 2) {
                iB = te6.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iB;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    public static abstract class d implements se6 {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        @Override // com.zepto.se6
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? b() : c(charSequence, i, i2);
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i, int i2) {
            int iA = this.a.a(charSequence, i, i2);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }
    }

    public static class e extends d {
        public final boolean b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // com.zepto.te6.d
        public boolean b() {
            return this.b;
        }
    }

    public static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // com.zepto.te6.d
        public boolean b() {
            return cf6.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.b, false);
        f = f.b;
    }

    public static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
