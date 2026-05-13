package com.zepto;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class rn3 {
    public static final Object a = new Object();
    public static volatile rn3 b = null;
    public static final int c = 20;

    public static class a extends rn3 {
        public final int d;

        public a(int i) {
            super(i);
            this.d = i;
        }

        @Override // com.zepto.rn3
        public void a(String str, String str2) {
            if (this.d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // com.zepto.rn3
        public void b(String str, String str2, Throwable th) {
            if (this.d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // com.zepto.rn3
        public void c(String str, String str2) {
            if (this.d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // com.zepto.rn3
        public void d(String str, String str2, Throwable th) {
            if (this.d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // com.zepto.rn3
        public void f(String str, String str2) {
            if (this.d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // com.zepto.rn3
        public void g(String str, String str2, Throwable th) {
            if (this.d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // com.zepto.rn3
        public void j(String str, String str2) {
            if (this.d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // com.zepto.rn3
        public void k(String str, String str2) {
            if (this.d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // com.zepto.rn3
        public void l(String str, String str2, Throwable th) {
            if (this.d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public rn3(int i) {
    }

    public static rn3 e() {
        rn3 rn3Var;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                rn3Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rn3Var;
    }

    public static void h(rn3 rn3Var) {
        synchronized (a) {
            b = rn3Var;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
