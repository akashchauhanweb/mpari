package com.zepto;

import android.content.Context;
import android.net.Uri;
import com.zepto.ds4;
import com.zepto.pc5;

/* JADX INFO: loaded from: classes2.dex */
public class rb2 extends uy0 {
    public rb2(Context context) {
        super(context);
    }

    public static int k(Uri uri) {
        return new r62(uri.getPath()).k("Orientation", 1);
    }

    @Override // com.zepto.uy0, com.zepto.pc5
    public boolean c(jc5 jc5Var) {
        return "file".equals(jc5Var.d.getScheme());
    }

    @Override // com.zepto.uy0, com.zepto.pc5
    public pc5.a f(jc5 jc5Var, int i) {
        return new pc5.a(null, zf4.k(j(jc5Var)), ds4.e.DISK, k(jc5Var.d));
    }
}
