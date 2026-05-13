package com.zepto;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public class x5 {
    public Context a;

    public x5(Context context) {
        this.a = context;
    }

    public static x5 b(Context context) {
        return new x5(context);
    }

    public boolean a() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.a.getResources().getBoolean(bz4.a);
    }

    public boolean f() {
        return true;
    }
}
