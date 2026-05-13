package com.zepto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.zepto.ds4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pc5 {

    public static final class a {
        public final ds4.e a;
        public final Bitmap b;
        public final y46 c;
        public final int d;

        public a(Bitmap bitmap, ds4.e eVar) {
            this((Bitmap) nt6.d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public Bitmap a() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public ds4.e c() {
            return this.a;
        }

        public y46 d() {
            return this.c;
        }

        public a(y46 y46Var, ds4.e eVar) {
            this(null, (y46) nt6.d(y46Var, "source == null"), eVar, 0);
        }

        public a(Bitmap bitmap, y46 y46Var, ds4.e eVar, int i) {
            if ((bitmap != null) != (y46Var != null)) {
                this.b = bitmap;
                this.c = y46Var;
                this.a = (ds4.e) nt6.d(eVar, "loadedFrom == null");
                this.d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    public static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, jc5 jc5Var) {
        int iMax;
        double dFloor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                dFloor = Math.floor(i3 / i);
            } else if (i == 0) {
                dFloor = Math.floor(i4 / i2);
            } else {
                int iFloor = (int) Math.floor(i4 / i2);
                int iFloor2 = (int) Math.floor(i3 / i);
                iMax = jc5Var.l ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i, int i2, BitmapFactory.Options options, jc5 jc5Var) {
        a(i, i2, options.outWidth, options.outHeight, options, jc5Var);
    }

    public static BitmapFactory.Options d(jc5 jc5Var) {
        boolean zC = jc5Var.c();
        boolean z = jc5Var.s != null;
        if (!zC && !z && !jc5Var.r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zC;
        boolean z2 = jc5Var.r;
        options.inInputShareable = z2;
        options.inPurgeable = z2;
        if (z) {
            options.inPreferredConfig = jc5Var.s;
        }
        return options;
    }

    public static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(jc5 jc5Var);

    public int e() {
        return 0;
    }

    public abstract a f(jc5 jc5Var, int i);

    public boolean h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    public boolean i() {
        return false;
    }
}
