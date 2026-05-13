package com.zepto;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m53 extends f53 {
    public final of3 c = new of3(false);

    public void D(String str, f53 f53Var) {
        of3 of3Var = this.c;
        if (f53Var == null) {
            f53Var = k53.c;
        }
        of3Var.put(str, f53Var);
    }

    public void O(String str, String str2) {
        D(str, str2 == null ? k53.c : new r53(str2));
    }

    public Set P() {
        return this.c.entrySet();
    }

    public f53 T(String str) {
        return (f53) this.c.get(str);
    }

    public m53 a0(String str) {
        return (m53) this.c.get(str);
    }

    public boolean d0(String str) {
        return this.c.containsKey(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m53) && ((m53) obj).c.equals(this.c));
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
