package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class u00 extends o42 {
    public final Integer a;
    public final Object b;
    public final mv4 c;
    public final fw4 d;

    public u00(Integer num, Object obj, mv4 mv4Var, fw4 fw4Var) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        if (mv4Var == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = mv4Var;
        this.d = fw4Var;
    }

    @Override // com.zepto.o42
    public Integer a() {
        return this.a;
    }

    @Override // com.zepto.o42
    public Object b() {
        return this.b;
    }

    @Override // com.zepto.o42
    public mv4 c() {
        return this.c;
    }

    @Override // com.zepto.o42
    public fw4 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o42)) {
            return false;
        }
        o42 o42Var = (o42) obj;
        Integer num = this.a;
        if (num != null ? num.equals(o42Var.a()) : o42Var.a() == null) {
            if (this.b.equals(o42Var.b()) && this.c.equals(o42Var.c())) {
                fw4 fw4Var = this.d;
                if (fw4Var == null) {
                    if (o42Var.d() == null) {
                        return true;
                    }
                } else if (fw4Var.equals(o42Var.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        fw4 fw4Var = this.d;
        return iHashCode ^ (fw4Var != null ? fw4Var.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + "}";
    }
}
