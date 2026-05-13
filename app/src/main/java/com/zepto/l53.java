package com.zepto;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l53 extends e53 {
    public final pf3 c = new pf3(false);

    public void B(String str, e53 e53Var) {
        pf3 pf3Var = this.c;
        if (e53Var == null) {
            e53Var = j53.c;
        }
        pf3Var.put(str, e53Var);
    }

    public Set D() {
        return this.c.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l53) && ((l53) obj).c.equals(this.c));
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
