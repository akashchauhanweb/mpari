package com.zepto;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class mk8 {
    public final Context a;

    public mk8(Context context) {
        this.a = context;
    }

    public static String b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Context a() {
        return this.a;
    }
}
