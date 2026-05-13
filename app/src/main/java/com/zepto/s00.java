package com.zepto;

import com.zepto.rq0;

/* JADX INFO: loaded from: classes.dex */
public final class s00 extends rq0 {
    public final rq0.b a;
    public final zo b;

    public static final class b extends rq0.a {
        public rq0.b a;
        public zo b;

        @Override // com.zepto.rq0.a
        public rq0 a() {
            return new s00(this.a, this.b);
        }

        @Override // com.zepto.rq0.a
        public rq0.a b(zo zoVar) {
            this.b = zoVar;
            return this;
        }

        @Override // com.zepto.rq0.a
        public rq0.a c(rq0.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    @Override // com.zepto.rq0
    public zo b() {
        return this.b;
    }

    @Override // com.zepto.rq0
    public rq0.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rq0)) {
            return false;
        }
        rq0 rq0Var = (rq0) obj;
        rq0.b bVar = this.a;
        if (bVar != null ? bVar.equals(rq0Var.c()) : rq0Var.c() == null) {
            zo zoVar = this.b;
            if (zoVar == null) {
                if (rq0Var.b() == null) {
                    return true;
                }
            } else if (zoVar.equals(rq0Var.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        rq0.b bVar = this.a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        zo zoVar = this.b;
        return iHashCode ^ (zoVar != null ? zoVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }

    public s00(rq0.b bVar, zo zoVar) {
        this.a = bVar;
        this.b = zoVar;
    }
}
