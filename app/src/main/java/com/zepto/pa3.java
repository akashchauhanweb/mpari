package com.zepto;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public class pa3 {
    public final Class a;
    public final Class b;
    public final Class c;
    public final String d;

    public pa3(vx0 vx0Var, Annotation annotation) {
        this.b = vx0Var.c();
        this.a = annotation.annotationType();
        this.d = vx0Var.getName();
        this.c = vx0Var.getType();
    }

    public final boolean a(pa3 pa3Var) {
        if (pa3Var == this) {
            return true;
        }
        if (pa3Var.a == this.a && pa3Var.b == this.b && pa3Var.c == this.c) {
            return pa3Var.d.equals(this.d);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof pa3) {
            return a((pa3) obj);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        return String.format("key '%s' for %s", this.d, this.b);
    }
}
