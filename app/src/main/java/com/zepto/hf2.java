package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class hf2 {
    public final nn7 a;
    public final String b;
    public final n86 c;
    public final int d;

    public hf2() {
        this(3);
    }

    public int a() {
        return this.d;
    }

    public String b() {
        return this.b;
    }

    public n86 c() {
        return this.c;
    }

    public nn7 d() {
        return this.a;
    }

    public hf2(int i) {
        this(i, null, new dx2());
    }

    public hf2(int i, String str, n86 n86Var) {
        this(i, str, n86Var, nn7.HIGH);
    }

    public hf2(int i, String str, n86 n86Var, nn7 nn7Var) {
        this.a = nn7Var;
        this.b = str;
        this.d = i;
        this.c = n86Var;
    }
}
