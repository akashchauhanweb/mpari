package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ky2 {
    public a a;
    public int b;
    public int c;
    public int d;

    public static class a {
        public String[] a;
        public int b;

        public a(int i) {
            this.a = new String[i];
        }

        public String a(int i) {
            String[] strArr = this.a;
            if (i < strArr.length) {
                return strArr[i];
            }
            return null;
        }

        public final void b(int i) {
            String[] strArr = new String[i];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.a;
                if (i2 >= strArr2.length) {
                    this.a = strArr;
                    return;
                } else {
                    strArr[i2] = strArr2[i2];
                    i2++;
                }
            }
        }

        public void c(int i, String str) {
            if (i >= this.a.length) {
                b(i * 2);
            }
            if (i > this.b) {
                this.b = i;
            }
            this.a[i] = str;
        }

        public int d() {
            return this.b;
        }
    }

    public ky2(hf2 hf2Var) {
        this(hf2Var, 16);
    }

    public final String a() {
        int i = this.c;
        char[] cArr = new char[i + 1];
        if (i <= 0) {
            return "\n";
        }
        cArr[0] = '\n';
        for (int i2 = 1; i2 <= this.c; i2++) {
            cArr[i2] = ' ';
        }
        return new String(cArr);
    }

    public final String b(int i) {
        if (this.b <= 0) {
            return "";
        }
        String strA = this.a.a(i);
        if (strA == null) {
            strA = a();
            this.a.c(i, strA);
        }
        return this.a.d() > 0 ? strA : "";
    }

    public String c() {
        int i = this.d - 1;
        this.d = i;
        String strB = b(i);
        int i2 = this.b;
        if (i2 > 0) {
            this.c -= i2;
        }
        return strB;
    }

    public String d() {
        int i = this.d;
        this.d = i + 1;
        String strB = b(i);
        int i2 = this.b;
        if (i2 > 0) {
            this.c += i2;
        }
        return strB;
    }

    public String e() {
        return b(this.d);
    }

    public ky2(hf2 hf2Var, int i) {
        this.b = hf2Var.a();
        this.a = new a(i);
    }
}
