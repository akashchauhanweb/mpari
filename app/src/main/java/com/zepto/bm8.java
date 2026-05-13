package com.zepto;

import com.zepto.dv;

/* JADX INFO: loaded from: classes.dex */
public final class bm8 extends dv.a {
    public int a;
    public boolean b;
    public byte c;

    @Override // com.zepto.dv.a
    public final dv a() {
        if (this.c == 3) {
            return new nm8(this.a, this.b, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.zepto.dv.a
    public final dv.a b(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
        return this;
    }

    public final dv.a c(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
        return this;
    }
}
