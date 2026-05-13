package com.zepto;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class nj8 {
    public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public nj8(String str, String str2, int i, boolean z) {
        iu4.e(str);
        this.a = str;
        iu4.e(str2);
        this.b = str2;
        this.c = null;
        this.d = i;
        this.e = z;
    }

    public final int a() {
        return this.d;
    }

    public final ComponentName b() {
        return this.c;
    }

    public final Intent c(Context context) {
        Bundle bundleCall;
        if (this.a == null) {
            return new Intent().setComponent(this.c);
        }
        if (this.e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.a);
            try {
                bundleCall = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.a)));
            }
        }
        return intent != null ? intent : new Intent(this.a).setPackage(this.b);
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj8)) {
            return false;
        }
        nj8 nj8Var = (nj8) obj;
        return if4.a(this.a, nj8Var.a) && if4.a(this.b, nj8Var.b) && if4.a(this.c, nj8Var.c) && this.d == nj8Var.d && this.e == nj8Var.e;
    }

    public final int hashCode() {
        return if4.b(this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        iu4.i(this.c);
        return this.c.flattenToString();
    }
}
