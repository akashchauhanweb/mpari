package com.zepto;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public class e86 {
    public final Resources a;
    public final String b;

    public e86(Context context) {
        iu4.i(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(a15.a);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
