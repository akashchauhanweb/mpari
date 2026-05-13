package com.zepto;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.zepto.ds4;
import com.zepto.pc5;

/* JADX INFO: loaded from: classes2.dex */
public class ey extends pc5 {
    public static final int d = 22;
    public final Context a;
    public final Object b = new Object();
    public AssetManager c;

    public ey(Context context) {
        this.a = context;
    }

    public static String j(jc5 jc5Var) {
        return jc5Var.d.toString().substring(d);
    }

    @Override // com.zepto.pc5
    public boolean c(jc5 jc5Var) {
        Uri uri = jc5Var.d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.zepto.pc5
    public pc5.a f(jc5 jc5Var, int i) {
        if (this.c == null) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        this.c = this.a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new pc5.a(zf4.k(this.c.open(j(jc5Var))), ds4.e.DISK);
    }
}
