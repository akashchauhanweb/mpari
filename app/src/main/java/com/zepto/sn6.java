package com.zepto;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sn6 implements rn6 {
    public final Set a;
    public final qn6 b;
    public final vn6 c;

    public sn6(Set set, qn6 qn6Var, vn6 vn6Var) {
        this.a = set;
        this.b = qn6Var;
        this.c = vn6Var;
    }

    @Override // com.zepto.rn6
    public on6 a(String str, Class cls, c22 c22Var, dn6 dn6Var) {
        if (this.a.contains(c22Var)) {
            return new un6(this.b, str, c22Var, dn6Var, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c22Var, this.a));
    }
}
