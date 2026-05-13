package com.zepto;

import com.zepto.ff1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qk2 {
    public u52 a = u52.j;
    public ho3 b = ho3.c;
    public jb2 c = ib2.c;
    public final Map d = new HashMap();
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public boolean g = false;
    public String h = pk2.z;
    public int i = 2;
    public int j = 2;
    public boolean k = false;
    public boolean l = false;
    public boolean m = true;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = true;
    public gi6 r = pk2.B;
    public gi6 s = pk2.C;
    public final LinkedList t = new LinkedList();

    public final void a(String str, int i, int i2, List list) {
        oo6 oo6VarB;
        oo6 oo6VarB2;
        boolean z = b66.a;
        oo6 oo6VarA = null;
        if (str != null && !str.trim().isEmpty()) {
            oo6VarB = ff1.b.b.b(str);
            if (z) {
                oo6VarA = b66.c.b(str);
                oo6VarB2 = b66.b.b(str);
            } else {
                oo6VarB2 = null;
            }
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            oo6 oo6VarA2 = ff1.b.b.a(i, i2);
            if (z) {
                oo6VarA = b66.c.a(i, i2);
                oo6 oo6VarA3 = b66.b.a(i, i2);
                oo6VarB = oo6VarA2;
                oo6VarB2 = oo6VarA3;
            } else {
                oo6VarB = oo6VarA2;
                oo6VarB2 = null;
            }
        }
        list.add(oo6VarB);
        if (z) {
            list.add(oo6VarA);
            list.add(oo6VarB2);
        }
    }

    public pk2 b() {
        ArrayList arrayList = new ArrayList(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.h, this.i, this.j, arrayList);
        return new pk2(this.a, this.c, new HashMap(this.d), this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.q, this.b, this.h, this.i, this.j, new ArrayList(this.e), new ArrayList(this.f), arrayList, this.r, this.s, new ArrayList(this.t));
    }

    public qk2 c() {
        this.m = false;
        return this;
    }

    public qk2 d() {
        this.g = true;
        return this;
    }

    public qk2 e(gi6 gi6Var) {
        Objects.requireNonNull(gi6Var);
        this.r = gi6Var;
        return this;
    }
}
