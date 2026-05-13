package com.zepto;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ki8 extends ci8 {
    public final byte[] b;

    public ki8(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    @Override // com.zepto.ci8
    public final byte[] j() {
        return this.b;
    }
}
