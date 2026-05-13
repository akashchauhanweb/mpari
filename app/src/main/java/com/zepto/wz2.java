package com.zepto;

import android.view.View;
import com.zepto.dv7;
import com.zepto.qv7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class wz2 extends dv7.b {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public wz2(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // com.zepto.dv7.b
    public void b(dv7 dv7Var) {
        this.c.setTranslationY(0.0f);
    }

    @Override // com.zepto.dv7.b
    public void c(dv7 dv7Var) {
        this.c.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override // com.zepto.dv7.b
    public qv7 d(qv7 qv7Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((dv7) it.next()).c() & qv7.m.a()) != 0) {
                this.c.setTranslationY(rp.c(this.e, 0, r0.b()));
                break;
            }
        }
        return qv7Var;
    }

    @Override // com.zepto.dv7.b
    public dv7.a e(dv7 dv7Var, dv7.a aVar) {
        this.c.getLocationOnScreen(this.f);
        int i = this.d - this.f[1];
        this.e = i;
        this.c.setTranslationY(i);
        return aVar;
    }
}
