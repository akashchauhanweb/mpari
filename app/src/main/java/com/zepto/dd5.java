package com.zepto;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.zepto.ds4;
import com.zepto.pc5;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public class dd5 extends pc5 {
    public final Context a;

    public dd5(Context context) {
        this.a = context;
    }

    public static Bitmap j(Resources resources, int i, jc5 jc5Var) {
        BitmapFactory.Options optionsD = pc5.d(jc5Var);
        if (pc5.g(optionsD)) {
            BitmapFactory.decodeResource(resources, i, optionsD);
            pc5.b(jc5Var.h, jc5Var.i, optionsD, jc5Var);
        }
        return BitmapFactory.decodeResource(resources, i, optionsD);
    }

    @Override // com.zepto.pc5
    public boolean c(jc5 jc5Var) {
        if (jc5Var.e != 0) {
            return true;
        }
        return "android.resource".equals(jc5Var.d.getScheme());
    }

    @Override // com.zepto.pc5
    public pc5.a f(jc5 jc5Var, int i) throws FileNotFoundException {
        Resources resourcesM = nt6.m(this.a, jc5Var);
        return new pc5.a(j(resourcesM, nt6.l(resourcesM, jc5Var), jc5Var), ds4.e.DISK);
    }
}
