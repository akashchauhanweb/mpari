package com.zepto;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class df8 {
    public static final z68 b = new z68("MergeSliceTaskHandler");
    public final s98 a;

    public df8(s98 s98Var) {
        this.a = s98Var;
    }

    public static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new bc8("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (!file.renameTo(file2)) {
                throw new bc8("Unable to move file: ".concat(String.valueOf(file)));
            }
            return;
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (!file.delete()) {
            throw new bc8("Unable to delete directory: ".concat(String.valueOf(file)));
        }
    }

    public final void a(bf8 bf8Var) {
        File fileD = this.a.D(bf8Var.b, bf8Var.c, bf8Var.d, bf8Var.e);
        if (!fileD.exists()) {
            throw new bc8(String.format("Cannot find verified files for slice %s.", bf8Var.e), bf8Var.a);
        }
        File fileW = this.a.w(bf8Var.b, bf8Var.c, bf8Var.d);
        if (!fileW.exists()) {
            fileW.mkdirs();
        }
        b(fileD, fileW);
        try {
            this.a.a(bf8Var.b, bf8Var.c, bf8Var.d, this.a.q(bf8Var.b, bf8Var.c, bf8Var.d) + 1);
        } catch (IOException e) {
            b.b("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new bc8("Writing merge checkpoint failed.", e, bf8Var.a);
        }
    }
}
