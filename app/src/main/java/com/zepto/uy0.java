package com.zepto;

import android.content.Context;
import com.zepto.ds4;
import com.zepto.pc5;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class uy0 extends pc5 {
    public final Context a;

    public uy0(Context context) {
        this.a = context;
    }

    @Override // com.zepto.pc5
    public boolean c(jc5 jc5Var) {
        return "content".equals(jc5Var.d.getScheme());
    }

    @Override // com.zepto.pc5
    public pc5.a f(jc5 jc5Var, int i) {
        return new pc5.a(zf4.k(j(jc5Var)), ds4.e.DISK);
    }

    public InputStream j(jc5 jc5Var) {
        return this.a.getContentResolver().openInputStream(jc5Var.d);
    }
}
