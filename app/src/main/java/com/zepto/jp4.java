package com.zepto;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class jp4 extends rp4 {
    public int f;

    public jp4(String str) {
        super(0, str);
    }

    @Override // com.zepto.rp4
    public void k(pq4 pq4Var, OutputStream outputStream) throws IOException {
        if (outputStream instanceof sj4) {
            this.f = ((sj4) outputStream).d();
        }
        super.k(pq4Var, outputStream);
    }

    public jp4(byte[] bArr) {
        super(0, bArr);
    }
}
