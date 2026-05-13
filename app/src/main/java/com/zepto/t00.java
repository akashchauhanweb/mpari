package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class t00 extends e31 {
    public final Context a;
    public final uq0 b;
    public final uq0 c;
    public final String d;

    public t00(Context context, uq0 uq0Var, uq0 uq0Var2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (uq0Var == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = uq0Var;
        if (uq0Var2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = uq0Var2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // com.zepto.e31
    public Context b() {
        return this.a;
    }

    @Override // com.zepto.e31
    public String c() {
        return this.d;
    }

    @Override // com.zepto.e31
    public uq0 d() {
        return this.c;
    }

    @Override // com.zepto.e31
    public uq0 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e31)) {
            return false;
        }
        e31 e31Var = (e31) obj;
        return this.a.equals(e31Var.b()) && this.b.equals(e31Var.e()) && this.c.equals(e31Var.d()) && this.d.equals(e31Var.c());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
