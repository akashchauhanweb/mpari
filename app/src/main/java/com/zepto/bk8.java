package com.zepto;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class bk8 extends rj8 {
    public bk8(vk8 vk8Var, rh8 rh8Var) {
        super(vk8Var, new z68("OnCompleteUpdateCallback"), rh8Var);
    }

    @Override // com.zepto.rj8, com.zepto.gl8
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.b.d(new xz2(bundle.getInt("error.code", -2)));
        } else {
            this.b.e(null);
        }
    }
}
