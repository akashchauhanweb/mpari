package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.h;
import com.zepto.df3;

/* JADX INFO: loaded from: classes.dex */
public class q implements k {
    public final Object c;
    public final b.a e;

    public q(Object obj) {
        this.c = obj;
        this.e = b.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.k
    public void e(df3 df3Var, h.a aVar) {
        this.e.a(df3Var, aVar, this.c);
    }
}
