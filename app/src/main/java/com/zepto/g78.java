package com.zepto;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g78 extends ug1 {
    public final ViewGroup e;
    public final Context f;
    public og4 g;
    public final GoogleMapOptions h;
    public final List i = new ArrayList();

    public g78(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.e = viewGroup;
        this.f = context;
        this.h = googleMapOptions;
    }

    @Override // com.zepto.ug1
    public final void a(og4 og4Var) {
        this.g = og4Var;
        j();
    }

    public final void j() {
        if (this.g == null || b() != null) {
            return;
        }
        try {
            vp3.a(this.f);
            rw2 rw2VarY = ib8.a(this.f, null).y(hf4.p0(this.f), this.h);
            if (rw2VarY == null) {
                return;
            }
            this.g.a(new b78(this.e, rw2VarY));
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b78) b()).a((tg4) it.next());
            }
            this.i.clear();
        } catch (RemoteException e) {
            throw new cg5(e);
        } catch (ck2 unused) {
        }
    }
}
