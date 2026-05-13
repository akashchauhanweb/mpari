package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0033b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iB;
        DynamiteModule.b.C0033b c0033b = new DynamiteModule.b.C0033b();
        int iA = aVar.a(context, str);
        c0033b.a = iA;
        int i = 0;
        if (iA != 0) {
            iB = aVar.b(context, str, false);
            c0033b.b = iB;
        } else {
            iB = aVar.b(context, str, true);
            c0033b.b = iB;
        }
        int i2 = c0033b.a;
        if (i2 == 0) {
            if (iB == 0) {
                c0033b.c = 0;
            }
            return c0033b;
        }
        i = i2;
        if (i >= iB) {
            c0033b.c = -1;
        } else {
            c0033b.c = 1;
        }
        return c0033b;
    }
}
