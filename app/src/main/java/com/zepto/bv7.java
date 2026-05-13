package com.zepto;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public class bv7 implements cv7 {
    public final WindowId a;

    public bv7(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof bv7) && ((bv7) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
