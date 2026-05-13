package com.zepto;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ag8 {
    public static final z68 c = new z68("PatchSliceTaskHandler");
    public final s98 a;
    public final lc8 b;

    public ag8(s98 s98Var, lc8 lc8Var) {
        this.a = s98Var;
        this.b = lc8Var;
    }

    public final void a(zf8 zf8Var) {
        File fileU = this.a.u(zf8Var.b, zf8Var.c, zf8Var.d);
        s98 s98Var = this.a;
        String str = zf8Var.b;
        int i = zf8Var.c;
        long j = zf8Var.d;
        File file = new File(s98Var.v(str, i, j), zf8Var.h);
        try {
            InputStream gZIPInputStream = zf8Var.j;
            if (zf8Var.g == 2) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream, ConstantsKt.DEFAULT_BUFFER_SIZE);
            }
            try {
                v98 v98Var = new v98(fileU, file);
                File fileC = this.a.C(zf8Var.b, zf8Var.e, zf8Var.f, zf8Var.h);
                if (!fileC.exists()) {
                    fileC.mkdirs();
                }
                hg8 hg8Var = new hg8(this.a, zf8Var.b, zf8Var.e, zf8Var.f, zf8Var.h);
                dc8.a(v98Var, gZIPInputStream, new ic8(fileC, hg8Var), zf8Var.i);
                hg8Var.i(0);
                gZIPInputStream.close();
                c.d("Patching and extraction finished for slice %s of pack %s.", zf8Var.h, zf8Var.b);
                ((zm8) this.b.a()).a(zf8Var.a, zf8Var.b, zf8Var.h, 0);
                try {
                    zf8Var.j.close();
                } catch (IOException unused) {
                    c.e("Could not close file for slice %s of pack %s.", zf8Var.h, zf8Var.b);
                }
            } finally {
                try {
                    gZIPInputStream.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (IOException e) {
            c.b("IOException during patching %s.", e.getMessage());
            throw new bc8(String.format("Error patching slice %s of pack %s.", zf8Var.h, zf8Var.b), e, zf8Var.a);
        }
    }
}
