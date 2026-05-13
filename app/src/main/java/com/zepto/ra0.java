package com.zepto;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public abstract class ra0 {
    public static mw2 a;

    public static qa0 a(LatLng latLng, float f) {
        iu4.j(latLng, "latLng must not be null");
        try {
            return new qa0(c().d0(latLng, f));
        } catch (RemoteException e) {
            throw new cg5(e);
        }
    }

    public static void b(mw2 mw2Var) {
        a = (mw2) iu4.i(mw2Var);
    }

    public static mw2 c() {
        return (mw2) iu4.j(a, "CameraUpdateFactory is not initialized");
    }
}
