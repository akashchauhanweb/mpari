package com.zepto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sw3 {
    public static final sw3 b = a().a();
    public final Map a;

    public static final class b {
        public HashMap a = new HashMap();

        public sw3 a() {
            if (this.a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            sw3 sw3Var = new sw3(Collections.unmodifiableMap(this.a));
            this.a = null;
            return sw3Var;
        }
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof sw3) {
            return this.a.equals(((sw3) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public sw3(Map map) {
        this.a = map;
    }
}
