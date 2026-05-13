package com.zepto;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u78 extends d78 {
    public final /* synthetic */ IBinder e;
    public final /* synthetic */ a88 f;

    public u78(a88 a88Var, IBinder iBinder) {
        this.f = a88Var;
        this.e = iBinder;
    }

    @Override // com.zepto.d78
    public final void a() {
        d88 d88Var = this.f.a;
        d88Var.n = (IInterface) d88Var.i.a(this.e);
        d88.o(this.f.a);
        this.f.a.g = false;
        Iterator it = this.f.a.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f.a.d.clear();
    }
}
