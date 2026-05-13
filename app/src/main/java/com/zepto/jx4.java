package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class jx4 implements km7 {
    public boolean a = false;
    public boolean b = false;
    public fb2 c;
    public final gx4 d;

    public jx4(gx4 gx4Var) {
        this.d = gx4Var;
    }

    public final void a() {
        if (this.a) {
            throw new e22("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    public void b(fb2 fb2Var, boolean z) {
        this.a = false;
        this.c = fb2Var;
        this.b = z;
    }

    @Override // com.zepto.km7
    public km7 c(String str) throws IOException {
        a();
        this.d.g(this.c, str, this.b);
        return this;
    }

    @Override // com.zepto.km7
    public km7 e(boolean z) {
        a();
        this.d.l(this.c, z, this.b);
        return this;
    }
}
