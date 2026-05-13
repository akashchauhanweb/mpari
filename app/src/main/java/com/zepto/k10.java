package com.zepto;

import com.zepto.oy5;

/* JADX INFO: loaded from: classes.dex */
public final class k10 extends oy5 {
    public final qn6 a;
    public final String b;
    public final o42 c;
    public final dn6 d;
    public final c22 e;

    public static final class b extends oy5.a {
        public qn6 a;
        public String b;
        public o42 c;
        public dn6 d;
        public c22 e;

        @Override // com.zepto.oy5.a
        public oy5 a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new k10(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.oy5.a
        public oy5.a b(c22 c22Var) {
            if (c22Var == null) {
                throw new NullPointerException("Null encoding");
            }
            this.e = c22Var;
            return this;
        }

        @Override // com.zepto.oy5.a
        public oy5.a c(o42 o42Var) {
            if (o42Var == null) {
                throw new NullPointerException("Null event");
            }
            this.c = o42Var;
            return this;
        }

        @Override // com.zepto.oy5.a
        public oy5.a d(dn6 dn6Var) {
            if (dn6Var == null) {
                throw new NullPointerException("Null transformer");
            }
            this.d = dn6Var;
            return this;
        }

        @Override // com.zepto.oy5.a
        public oy5.a e(qn6 qn6Var) {
            if (qn6Var == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.a = qn6Var;
            return this;
        }

        @Override // com.zepto.oy5.a
        public oy5.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // com.zepto.oy5
    public c22 b() {
        return this.e;
    }

    @Override // com.zepto.oy5
    public o42 c() {
        return this.c;
    }

    @Override // com.zepto.oy5
    public dn6 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oy5)) {
            return false;
        }
        oy5 oy5Var = (oy5) obj;
        return this.a.equals(oy5Var.f()) && this.b.equals(oy5Var.g()) && this.c.equals(oy5Var.c()) && this.d.equals(oy5Var.e()) && this.e.equals(oy5Var.b());
    }

    @Override // com.zepto.oy5
    public qn6 f() {
        return this.a;
    }

    @Override // com.zepto.oy5
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }

    public k10(qn6 qn6Var, String str, o42 o42Var, dn6 dn6Var, c22 c22Var) {
        this.a = qn6Var;
        this.b = str;
        this.c = o42Var;
        this.d = dn6Var;
        this.e = c22Var;
    }
}
