package com.zepto;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class xl8 extends hl8 {
    public xl8(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.zepto.hl8
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // com.zepto.hl8
    public final boolean b() {
        return false;
    }
}
