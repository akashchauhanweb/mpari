package com.zepto;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kf8 {
    public final s98 a;
    public final lc8 b;
    public final be8 c;
    public final lc8 d;
    public final mc8 e;
    public final n58 f;
    public final vf8 g;

    public kf8(s98 s98Var, lc8 lc8Var, be8 be8Var, lc8 lc8Var2, mc8 mc8Var, n58 n58Var, vf8 vf8Var) {
        this.a = s98Var;
        this.b = lc8Var;
        this.c = be8Var;
        this.d = lc8Var2;
        this.e = mc8Var;
        this.f = n58Var;
        this.g = vf8Var;
    }

    public final void a(final hf8 hf8Var) {
        File fileW = this.a.w(hf8Var.b, hf8Var.c, hf8Var.d);
        File fileY = this.a.y(hf8Var.b, hf8Var.c, hf8Var.d);
        if (!fileW.exists() || !fileY.exists()) {
            throw new bc8(String.format("Cannot find pack files to move for pack %s.", hf8Var.b), hf8Var.a);
        }
        File fileU = this.a.u(hf8Var.b, hf8Var.c, hf8Var.d);
        fileU.mkdirs();
        if (!fileW.renameTo(fileU)) {
            throw new bc8("Cannot move merged pack files to final location.", hf8Var.a);
        }
        new File(this.a.u(hf8Var.b, hf8Var.c, hf8Var.d), "merge.tmp").delete();
        File fileV = this.a.v(hf8Var.b, hf8Var.c, hf8Var.d);
        fileV.mkdirs();
        if (!fileY.renameTo(fileV)) {
            throw new bc8("Cannot move metadata files to final location.", hf8Var.a);
        }
        if (this.f.a("assetOnlyUpdates")) {
            try {
                this.g.b(hf8Var.b, hf8Var.c, hf8Var.d, hf8Var.e);
                ((Executor) this.d.a()).execute(new Runnable() { // from class: com.zepto.jf8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.c.b(hf8Var);
                    }
                });
            } catch (IOException e) {
                throw new bc8(String.format("Could not write asset pack version tag for pack %s: %s", hf8Var.b, e.getMessage()), hf8Var.a);
            }
        } else {
            Executor executor = (Executor) this.d.a();
            final s98 s98Var = this.a;
            s98Var.getClass();
            executor.execute(new Runnable() { // from class: com.zepto.if8
                @Override // java.lang.Runnable
                public final void run() {
                    s98Var.I();
                }
            });
        }
        this.c.i(hf8Var.b, hf8Var.c, hf8Var.d);
        this.e.c(hf8Var.b);
        ((zm8) this.b.a()).c(hf8Var.a, hf8Var.b);
    }

    public final /* synthetic */ void b(hf8 hf8Var) {
        this.a.b(hf8Var.b, hf8Var.c, hf8Var.d);
    }
}
