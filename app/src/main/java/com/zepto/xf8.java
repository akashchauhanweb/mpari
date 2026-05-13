package com.zepto;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class xf8 {
    public static final z68 c = new z68("PackageStateCache");
    public final Context a;
    public int b = -1;

    public xf8(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        if (this.b == -1) {
            try {
                this.b = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.b;
    }
}
