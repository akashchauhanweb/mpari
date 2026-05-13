package com.zepto;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eg8 {
    public final s98 a;
    public final lc8 b;
    public final be8 c;
    public final lc8 d;
    public final mc8 e;

    public eg8(s98 s98Var, lc8 lc8Var, be8 be8Var, lc8 lc8Var2, mc8 mc8Var) {
        this.a = s98Var;
        this.b = lc8Var;
        this.c = be8Var;
        this.d = lc8Var2;
        this.e = mc8Var;
    }

    public final void a(final cg8 cg8Var) {
        File fileU = this.a.u(cg8Var.b, cg8Var.c, cg8Var.e);
        if (!fileU.exists()) {
            throw new bc8(String.format("Cannot find pack files to promote for pack %s at %s", cg8Var.b, fileU.getAbsolutePath()), cg8Var.a);
        }
        File fileU2 = this.a.u(cg8Var.b, cg8Var.d, cg8Var.e);
        fileU2.mkdirs();
        if (!fileU.renameTo(fileU2)) {
            throw new bc8(String.format("Cannot promote pack %s from %s to %s", cg8Var.b, fileU.getAbsolutePath(), fileU2.getAbsolutePath()), cg8Var.a);
        }
        ((Executor) this.d.a()).execute(new Runnable() { // from class: com.zepto.dg8
            @Override // java.lang.Runnable
            public final void run() {
                this.c.b(cg8Var);
            }
        });
        this.c.i(cg8Var.b, cg8Var.d, cg8Var.e);
        this.e.c(cg8Var.b);
        ((zm8) this.b.a()).c(cg8Var.a, cg8Var.b);
    }

    public final /* synthetic */ void b(cg8 cg8Var) {
        this.a.b(cg8Var.b, cg8Var.d, cg8Var.e);
    }
}
