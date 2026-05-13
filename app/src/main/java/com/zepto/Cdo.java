package com.zepto;

import java.io.Serializable;

/* JADX INFO: renamed from: com.zepto.do, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class Cdo implements Serializable {
    public static final Cdo f = new Cdo("none", uc5.REQUIRED);
    public final String c;
    public final uc5 e;

    public Cdo(String str, uc5 uc5Var) {
        if (str == null) {
            throw new IllegalArgumentException("The algorithm name must not be null");
        }
        this.c = str;
        this.e = uc5Var;
    }

    public final String a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Cdo) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
