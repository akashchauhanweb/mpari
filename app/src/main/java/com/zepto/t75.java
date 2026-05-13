package com.zepto;

import com.zepto.yf3;

/* JADX INFO: loaded from: classes.dex */
public class t75 {
    public final s75 a;
    public final dq6 b;
    public final Runnable c;

    public static class a {
        public d85 a;
        public d85 b;
        public yf3 d;
        public w82[] e;
        public int g;
        public Runnable c = new Runnable() { // from class: com.zepto.b38
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        public boolean f = true;

        public /* synthetic */ a(e38 e38Var) {
        }

        public t75 a() {
            iu4.b(this.a != null, "Must set register function");
            iu4.b(this.b != null, "Must set unregister function");
            iu4.b(this.d != null, "Must set holder");
            return new t75(new c38(this, this.d, this.e, this.f, this.g), new d38(this, (yf3.a) iu4.j(this.d.b(), "Key must not be null")), this.c, null);
        }

        public a b(d85 d85Var) {
            this.a = d85Var;
            return this;
        }

        public a c(int i) {
            this.g = i;
            return this;
        }

        public a d(d85 d85Var) {
            this.b = d85Var;
            return this;
        }

        public a e(yf3 yf3Var) {
            this.d = yf3Var;
            return this;
        }
    }

    public /* synthetic */ t75(s75 s75Var, dq6 dq6Var, Runnable runnable, f38 f38Var) {
        this.a = s75Var;
        this.b = dq6Var;
        this.c = runnable;
    }

    public static a a() {
        return new a(null);
    }
}
