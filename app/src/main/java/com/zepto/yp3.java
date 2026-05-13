package com.zepto;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class yp3 {
    public final p68 a;

    public yp3(p68 p68Var) {
        this.a = (p68) iu4.i(p68Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof yp3)) {
            return false;
        }
        try {
            return this.a.M(((yp3) obj).a);
        } catch (RemoteException e) {
            throw new cg5(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.h0();
        } catch (RemoteException e) {
            throw new cg5(e);
        }
    }
}
