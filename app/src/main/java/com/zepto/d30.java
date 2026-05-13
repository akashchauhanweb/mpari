package com.zepto;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class d30 implements y {
    public b1 c;
    public ox0 e;

    public d30(b1 b1Var) {
        this.c = b1Var;
    }

    public static c30 a(b1 b1Var) {
        ox0 ox0Var = new ox0(b1Var, false);
        return new c30(x76.c(ox0Var), ox0Var.e());
    }

    @Override // com.zepto.a0
    public u0 m() {
        try {
            return r();
        } catch (IOException e) {
            throw new t0("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // com.zepto.y
    public int n() {
        return this.e.e();
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return a(this.c);
    }

    @Override // com.zepto.y
    public InputStream u() {
        ox0 ox0Var = new ox0(this.c, false);
        this.e = ox0Var;
        return ox0Var;
    }
}
