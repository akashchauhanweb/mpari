package com.zepto;

import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class uo6 {
    public final Class a;
    public final Type b;
    public final int c;

    public uo6(Type type) {
        Objects.requireNonNull(type);
        Type typeB = d.b(type);
        this.b = typeB;
        this.a = d.k(typeB);
        this.c = typeB.hashCode();
    }

    public static uo6 a(Class cls) {
        return new uo6(cls);
    }

    public static uo6 b(Type type) {
        return new uo6(type);
    }

    public final Class c() {
        return this.a;
    }

    public final Type d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uo6) && d.f(this.b, ((uo6) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return d.t(this.b);
    }
}
