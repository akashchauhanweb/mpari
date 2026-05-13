package com.zepto;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zp0 implements h03 {
    public final List a;
    public final il4 b;
    public final i31 c;
    public final si1 d;

    public zp0(List list, i31 i31Var, il4 il4Var, si1 si1Var) {
        this.a = list;
        this.b = il4Var;
        this.c = i31Var;
        this.d = si1Var;
    }

    @Override // com.zepto.h03
    public Object a(k31 k31Var) throws ir4 {
        i31 i31VarD = d(k31Var);
        if (i31VarD != null) {
            return i31VarD.a(k31Var);
        }
        throw new ir4("Constructor not matched for %s", this.d);
    }

    @Override // com.zepto.h03
    public List b() {
        return new ArrayList(this.a);
    }

    @Override // com.zepto.h03
    public boolean c() {
        return this.a.size() <= 1 && this.c != null;
    }

    public final i31 d(k31 k31Var) {
        i31 i31Var = this.c;
        double d = 0.0d;
        for (i31 i31Var2 : this.a) {
            double dG = i31Var2.g(k31Var);
            if (dG > d) {
                i31Var = i31Var2;
                d = dG;
            }
        }
        return i31Var;
    }

    public String toString() {
        return String.format("creator for %s", this.d);
    }
}
