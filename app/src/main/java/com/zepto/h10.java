package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class h10 extends fw4 {
    public final Integer a;

    public h10(Integer num) {
        this.a = num;
    }

    @Override // com.zepto.fw4
    public Integer a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fw4)) {
            return false;
        }
        Integer num = this.a;
        Integer numA = ((fw4) obj).a();
        return num == null ? numA == null : num.equals(numA);
    }

    public int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
