package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class r06 implements f73 {
    public final SharedPreferences.Editor a;
    public final String b;

    public r06(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.zepto.f73
    public void a(a73 a73Var) throws IOException {
        if (!this.a.putString(this.b, bm2.b(a73Var.d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.zepto.f73
    public void b(g22 g22Var) throws IOException {
        if (!this.a.putString(this.b, bm2.b(g22Var.d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
