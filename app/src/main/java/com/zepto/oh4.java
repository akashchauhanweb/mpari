package com.zepto;

import com.zepto.nh4;

/* JADX INFO: loaded from: classes.dex */
public class oh4 implements nh4 {
    public final oy3 c = new oy3();
    public final nz5 d = nz5.t();

    public oh4() {
        a(nh4.b);
    }

    public void a(nh4.b bVar) {
        this.c.k(bVar);
        if (bVar instanceof nh4.b.c) {
            this.d.p((nh4.b.c) bVar);
        } else if (bVar instanceof nh4.b.a) {
            this.d.q(((nh4.b.a) bVar).a());
        }
    }
}
