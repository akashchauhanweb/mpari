package com.zepto;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class xe3 {
    public final Object a;

    public xe3(Activity activity) {
        iu4.j(activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity) this.a;
    }

    public final yf2 b() {
        return (yf2) this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof yf2;
    }
}
