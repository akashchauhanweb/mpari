package com.zepto;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class g30 implements r0 {
    public b1 c;

    public g30(b1 b1Var) {
        this.c = b1Var;
    }

    public static f30 a(b1 b1Var) {
        return new f30(x76.c(new px0(b1Var)));
    }

    @Override // com.zepto.r0
    public InputStream j() {
        return new px0(this.c);
    }

    @Override // com.zepto.a0
    public u0 m() {
        try {
            return r();
        } catch (IOException e) {
            throw new t0("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return a(this.c);
    }
}
