package com.zepto;

import com.zepto.f44;

/* JADX INFO: loaded from: classes.dex */
public final class e10 extends f44 {
    public final f44.c a;
    public final f44.b b;

    public static final class b extends f44.a {
        public f44.c a;
        public f44.b b;

        @Override // com.zepto.f44.a
        public f44 a() {
            return new e10(this.a, this.b);
        }

        @Override // com.zepto.f44.a
        public f44.a b(f44.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // com.zepto.f44.a
        public f44.a c(f44.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // com.zepto.f44
    public f44.b b() {
        return this.b;
    }

    @Override // com.zepto.f44
    public f44.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f44)) {
            return false;
        }
        f44 f44Var = (f44) obj;
        f44.c cVar = this.a;
        if (cVar != null ? cVar.equals(f44Var.c()) : f44Var.c() == null) {
            f44.b bVar = this.b;
            if (bVar == null) {
                if (f44Var.b() == null) {
                    return true;
                }
            } else if (bVar.equals(f44Var.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        f44.c cVar = this.a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        f44.b bVar = this.b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }

    public e10(f44.c cVar, f44.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
