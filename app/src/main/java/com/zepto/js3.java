package com.zepto;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class js3 implements fs3 {
    public String a;
    public int b;
    public int c;

    public js3(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js3)) {
            return false;
        }
        js3 js3Var = (js3) obj;
        return TextUtils.equals(this.a, js3Var.a) && this.b == js3Var.b && this.c == js3Var.c;
    }

    public int hashCode() {
        return lf4.b(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
