package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class rw3 implements qu5 {
    public qa3 c;
    public qa3 e;
    public qw3 f;
    public nw3 g;

    public rw3(nw3 nw3Var) {
        this.g = nw3Var;
    }

    public qw3 Q() {
        if (this.f == null) {
            this.f = this.g.Q();
        }
        return this.f;
    }

    @Override // com.zepto.qu5
    public String R(String str) {
        y62 y62VarD = this.g.d();
        return y62VarD == null ? str : y62VarD.e(str);
    }

    @Override // com.zepto.qu5
    public String a(String str) {
        y62 y62VarD = this.g.d();
        return y62VarD == null ? str : y62VarD.a(str);
    }

    @Override // com.zepto.qu5
    public qa3 c() {
        if (this.c == null) {
            this.c = this.g.c();
        }
        return this.c;
    }

    @Override // com.zepto.qu5
    public ma3 e(String str) {
        return h().r(str);
    }

    @Override // com.zepto.qu5
    public String getPrefix() {
        return this.g.getPrefix();
    }

    @Override // com.zepto.qu5
    public ma3 getText() {
        return this.g.getText();
    }

    @Override // com.zepto.qu5
    public qa3 h() {
        if (this.e == null) {
            this.e = this.g.h();
        }
        return this.e;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zepto.qu5
    public qu5 v(String str) {
        nw3 nw3VarO;
        pw3 pw3Var = (pw3) Q().get(str);
        if (pw3Var == null || (nw3VarO = pw3Var.O()) == null) {
            return null;
        }
        return new rw3(nw3VarO);
    }
}
