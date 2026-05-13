package com.zepto;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class b78 implements ze3 {
    public final ViewGroup a;
    public final rw2 b;
    public View c;

    public b78(ViewGroup viewGroup, rw2 rw2Var) {
        this.b = (rw2) iu4.i(rw2Var);
        this.a = (ViewGroup) iu4.i(viewGroup);
    }

    public final void a(tg4 tg4Var) {
        try {
            this.b.E(new x68(this, tg4Var));
        } catch (RemoteException e) {
            throw new cg5(e);
        }
    }

    @Override // com.zepto.ze3
    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            hb8.b(bundle, bundle2);
            this.b.i(bundle2);
            hb8.b(bundle2, bundle);
            this.c = (View) hf4.j(this.b.K());
            this.a.removeAllViews();
            this.a.addView(this.c);
        } catch (RemoteException e) {
            throw new cg5(e);
        }
    }
}
