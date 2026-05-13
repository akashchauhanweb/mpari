package com.zepto;

import android.content.Context;
import com.zepto.da0;
import com.zepto.yf4;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class xf4 implements sw1 {
    public final da0.a a;
    public final f90 b;
    public boolean c;

    public xf4(Context context) {
        this(nt6.e(context));
    }

    @Override // com.zepto.sw1
    public ld5 a(kc5 kc5Var) {
        return this.a.a(kc5Var).execute();
    }

    public xf4(File file) {
        this(file, nt6.a(file));
    }

    public xf4(File file, long j) {
        this(new yf4.a().d(new f90(file, j)).c());
        this.c = false;
    }

    public xf4(yf4 yf4Var) {
        this.c = true;
        this.a = yf4Var;
        this.b = yf4Var.e();
    }
}
