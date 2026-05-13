package com.zepto;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r00 extends h50 {
    public final List a;

    public r00(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.a = list;
    }

    @Override // com.zepto.h50
    public List c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h50) {
            return this.a.equals(((h50) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
