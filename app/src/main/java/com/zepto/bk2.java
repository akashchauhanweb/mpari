package com.zepto;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bk2 {
    public final pw2 a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();

    public bk2(pw2 pw2Var) {
        this.a = (pw2) iu4.i(pw2Var);
    }

    public final yp3 a(zp3 zp3Var) {
        try {
            iu4.j(zp3Var, "MarkerOptions must not be null.");
            p68 p68VarX = this.a.X(zp3Var);
            if (p68VarX != null) {
                return zp3Var.r() == 1 ? new ql(p68VarX) : new yp3(p68VarX);
            }
            return null;
        } catch (RemoteException e) {
            throw new cg5(e);
        }
    }

    public final void b(qa0 qa0Var) {
        try {
            iu4.j(qa0Var, "CameraUpdate must not be null.");
            this.a.U(qa0Var.a());
        } catch (RemoteException e) {
            throw new cg5(e);
        }
    }
}
