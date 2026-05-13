package com.zepto;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class yk8 extends hl8 {
    public yk8(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // com.zepto.hl8
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new pl8(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.zepto.hl8
    public final boolean b() {
        return true;
    }
}
