package com.zepto;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v68 extends d78 {
    public final /* synthetic */ Map e;
    public final /* synthetic */ rh8 f;
    public final /* synthetic */ i88 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v68(i88 i88Var, rh8 rh8Var, Map map, rh8 rh8Var2) {
        super(rh8Var);
        this.g = i88Var;
        this.e = map;
        this.f = rh8Var2;
    }

    @Override // com.zepto.d78
    public final void a() {
        try {
            ((dm8) this.g.d.e()).D(this.g.a, i88.o(this.e), new v78(this.g, this.f));
        } catch (RemoteException e) {
            i88.g.c(e, "syncPacks", new Object[0]);
            this.f.d(new RuntimeException(e));
        }
    }
}
