package com.zepto;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends vh4 implements Serializable {
    public final Comparator c;

    public xs0(Comparator comparator) {
        this.c = (Comparator) ju4.j(comparator);
    }

    @Override // com.zepto.vh4, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.c.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xs0) {
            return this.c.equals(((xs0) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return this.c.toString();
    }
}
