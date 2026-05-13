package com.zepto;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class b36 extends du1 {
    public Context b;
    public Uri c;

    public b36(du1 du1Var, Context context, Uri uri) {
        super(du1Var);
        this.b = context;
        this.c = uri;
    }

    @Override // com.zepto.du1
    public long c() {
        return gu1.b(this.b, this.c);
    }
}
