package com.zepto;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ll8 {
    public final Context a;

    public ll8(Context context) {
        this.a = context;
    }

    public static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jB = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jB += b(file2);
            }
        }
        return jB;
    }

    public final long a() {
        return b(new File(this.a.getFilesDir(), "assetpacks"));
    }
}
