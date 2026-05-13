package com.zepto;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u26 implements r26 {
    public static boolean h = true;
    public static String[] i = new String[0];
    public static Class[] j = new Class[0];
    public int a;
    public String b;
    public String c;
    public Class d;
    public a e;
    public String f;
    public ClassLoader g = null;

    public interface a {
        void a(int i, String str);

        String get(int i);
    }

    public static final class b implements a {
        public SoftReference a;

        public b() {
            c();
        }

        @Override // com.zepto.u26.a
        public void a(int i, String str) {
            String[] strArrB = b();
            if (strArrB == null) {
                strArrB = c();
            }
            strArrB[i] = str;
        }

        public final String[] b() {
            return (String[]) this.a.get();
        }

        public final String[] c() {
            String[] strArr = new String[3];
            this.a = new SoftReference(strArr);
            return strArr;
        }

        @Override // com.zepto.u26.a
        public String get(int i) {
            String[] strArrB = b();
            if (strArrB == null) {
                return null;
            }
            return strArrB[i];
        }
    }

    public u26(int i2, String str, Class cls) {
        this.a = i2;
        this.b = str;
        this.d = cls;
    }

    public abstract String a(a86 a86Var);

    public int b(int i2) {
        return Integer.parseInt(c(i2), 16);
    }

    public String c(int i2) {
        int iIndexOf = this.f.indexOf(45);
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            i3 = iIndexOf + 1;
            iIndexOf = this.f.indexOf(45, i3);
            i2 = i4;
        }
        if (iIndexOf == -1) {
            iIndexOf = this.f.length();
        }
        return this.f.substring(i3, iIndexOf);
    }

    public Class d(int i2) {
        return o72.b(c(i2), h());
    }

    public Class[] e(int i2) {
        StringTokenizer stringTokenizer = new StringTokenizer(c(i2), ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i3 = 0; i3 < iCountTokens; i3++) {
            clsArr[i3] = o72.b(stringTokenizer.nextToken(), h());
        }
        return clsArr;
    }

    public Class f() {
        if (this.d == null) {
            this.d = d(2);
        }
        return this.d;
    }

    public String g() {
        if (this.c == null) {
            this.c = f().getName();
        }
        return this.c;
    }

    public final ClassLoader h() {
        if (this.g == null) {
            this.g = getClass().getClassLoader();
        }
        return this.g;
    }

    public int i() {
        if (this.a == -1) {
            this.a = b(0);
        }
        return this.a;
    }

    public String j() {
        if (this.b == null) {
            this.b = c(1);
        }
        return this.b;
    }

    public String k(a86 a86Var) {
        String strA;
        if (h) {
            a aVar = this.e;
            if (aVar == null) {
                try {
                    this.e = new b();
                } catch (Throwable unused) {
                    h = false;
                }
                strA = null;
            } else {
                strA = aVar.get(a86Var.i);
            }
        } else {
            strA = null;
        }
        if (strA == null) {
            strA = a(a86Var);
        }
        if (h) {
            this.e.a(a86Var.i, strA);
        }
        return strA;
    }

    public final String toString() {
        return k(a86.k);
    }
}
