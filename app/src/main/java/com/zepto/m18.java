package com.zepto;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m18 implements og4 {
    public final /* synthetic */ ug1 a;

    public m18(ug1 ug1Var) {
        this.a = ug1Var;
    }

    @Override // com.zepto.og4
    public final void a(ze3 ze3Var) {
        this.a.a = ze3Var;
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((d48) it.next()).a(this.a.a);
        }
        this.a.c.clear();
        this.a.b = null;
    }
}
