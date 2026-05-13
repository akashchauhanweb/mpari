package com.zepto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sq0 {
    public static final sq0 e = new a().b();
    public final ag6 a;
    public final List b;
    public final oj2 c;
    public final String d;

    public static final class a {
        public ag6 a = null;
        public List b = new ArrayList();
        public oj2 c = null;
        public String d = "";

        public a a(mn3 mn3Var) {
            this.b.add(mn3Var);
            return this;
        }

        public sq0 b() {
            return new sq0(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(oj2 oj2Var) {
            this.c = oj2Var;
            return this;
        }

        public a e(ag6 ag6Var) {
            this.a = ag6Var;
            return this;
        }
    }

    public sq0(ag6 ag6Var, List list, oj2 oj2Var, String str) {
        this.a = ag6Var;
        this.b = list;
        this.c = oj2Var;
        this.d = str;
    }

    public static a e() {
        return new a();
    }

    public String a() {
        return this.d;
    }

    public oj2 b() {
        return this.c;
    }

    public List c() {
        return this.b;
    }

    public ag6 d() {
        return this.a;
    }

    public byte[] f() {
        return xw4.a(this);
    }
}
