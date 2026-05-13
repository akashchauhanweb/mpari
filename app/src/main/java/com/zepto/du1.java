package com.zepto;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class du1 {
    public final du1 a;

    public du1(du1 du1Var) {
        this.a = du1Var;
    }

    public static du1 a(File file) {
        return new k45(null, file);
    }

    public static du1 b(Context context, Uri uri) {
        return new b36(null, context, uri);
    }

    public abstract long c();
}
