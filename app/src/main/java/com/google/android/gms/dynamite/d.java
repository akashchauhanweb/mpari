package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0033b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0033b c0033b = new DynamiteModule.b.C0033b();
        int iB = aVar.b(context, str, false);
        c0033b.b = iB;
        if (iB == 0) {
            c0033b.c = 0;
        } else {
            c0033b.c = 1;
        }
        return c0033b;
    }
}
