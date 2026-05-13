package com.zepto;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class w50 {
    public final int a;
    public final CharSequence b;

    public w50(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int b() {
        return this.a;
    }

    public CharSequence c() {
        return this.b;
    }

    public final boolean d(CharSequence charSequence) {
        String strA = a(this.b);
        String strA2 = a(charSequence);
        return (strA == null && strA2 == null) || (strA != null && strA.equals(strA2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w50)) {
            return false;
        }
        w50 w50Var = (w50) obj;
        return this.a == w50Var.a && d(w50Var.b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a(this.b)});
    }
}
