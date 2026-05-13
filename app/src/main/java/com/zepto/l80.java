package com.zepto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class l80 extends vh4 implements Serializable {
    public final wh2 c;
    public final vh4 e;

    public l80(wh2 wh2Var, vh4 vh4Var) {
        this.c = (wh2) ju4.j(wh2Var);
        this.e = (vh4) ju4.j(vh4Var);
    }

    @Override // com.zepto.vh4, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.e.compare(this.c.a(obj), this.c.a(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l80)) {
            return false;
        }
        l80 l80Var = (l80) obj;
        return this.c.equals(l80Var.c) && this.e.equals(l80Var.e);
    }

    public int hashCode() {
        return jf4.b(this.c, this.e);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
