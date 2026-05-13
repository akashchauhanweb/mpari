package com.zepto;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
public final class t48 extends o28 {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ w48 b;

    public t48(w48 w48Var, Dialog dialog) {
        this.b = w48Var;
        this.a = dialog;
    }

    @Override // com.zepto.o28
    public final void a() {
        this.b.e.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
