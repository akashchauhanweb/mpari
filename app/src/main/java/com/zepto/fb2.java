package com.zepto;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fb2 {
    public final String a;
    public final Map b;

    public static final class b {
        public final String a;
        public Map b = null;

        public b(String str) {
            this.a = str;
        }

        public fb2 a() {
            return new fb2(this.a, this.b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.b)));
        }

        public b b(Annotation annotation) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static fb2 d(String str) {
        return new fb2(str, Collections.emptyMap());
    }

    public String b() {
        return this.a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb2)) {
            return false;
        }
        fb2 fb2Var = (fb2) obj;
        return this.a.equals(fb2Var.a) && this.b.equals(fb2Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }

    public fb2(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
