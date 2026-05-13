package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.zepto.mc8;
import com.zepto.o98;
import com.zepto.v88;
import com.zepto.vf8;
import com.zepto.z98;

/* JADX INFO: loaded from: classes.dex */
public abstract class AssetPackState {
    public static AssetPackState h(String str, int i, int i2, long j, long j2, double d, int i3, String str2, String str3) {
        return new z98(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2, str3);
    }

    public static AssetPackState i(Bundle bundle, String str, mc8 mc8Var, vf8 vf8Var, o98 o98Var) {
        int iA = o98Var.a(bundle.getInt(v88.a("status", str)), str);
        int i = bundle.getInt(v88.a("error_code", str));
        long j = bundle.getLong(v88.a("bytes_downloaded", str));
        long j2 = bundle.getLong(v88.a("total_bytes_to_download", str));
        double dA = mc8Var.a(str);
        long j3 = bundle.getLong(v88.a("pack_version", str));
        long j4 = bundle.getLong(v88.a("pack_base_version", str));
        int i2 = 1;
        int i3 = 4;
        if (iA != 4) {
            i3 = iA;
        } else if (j4 != 0 && j4 != j3) {
            i2 = 2;
        }
        return h(str, i3, i, j, j2, dA, i2, bundle.getString(v88.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), vf8Var.a(str));
    }

    public abstract long a();

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract long e();

    public abstract int f();

    public abstract int g();

    public abstract String j();

    public abstract String k();
}
