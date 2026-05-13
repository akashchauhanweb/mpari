package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class jk4 {
    public int a;
    public int b;
    public String c;
    public wr2 d;
    public boolean e;

    public static class b {
        public int a = 20000;
        public int b = 20000;
        public String c = "PRDownloader";
        public wr2 d = new pf1();
        public boolean e = false;

        public jk4 a() {
            return new jk4(this);
        }
    }

    public static b f() {
        return new b();
    }

    public int a() {
        return this.b;
    }

    public wr2 b() {
        return this.d;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public jk4(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
    }
}
