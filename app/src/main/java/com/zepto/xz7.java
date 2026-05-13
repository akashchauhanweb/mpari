package com.zepto;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xz7 extends ul {
    public final a a;

    public static final class a {
        public static final a b = new a("TINK");
        public static final a c = new a("CRUNCHY");
        public static final a d = new a("NO_PREFIX");
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public xz7(a aVar) {
        this.a = aVar;
    }

    public static xz7 a(a aVar) {
        return new xz7(aVar);
    }

    public a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof xz7) && ((xz7) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a + ")";
    }
}
