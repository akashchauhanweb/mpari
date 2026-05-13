package com.zepto;

import com.zepto.yp;

/* JADX INFO: loaded from: classes.dex */
public abstract class qc6 {
    public final w82[] a;
    public final boolean b;
    public final int c;

    public static class a {
        public d85 a;
        public w82[] c;
        public boolean b = true;
        public int d = 0;

        public /* synthetic */ a(l38 l38Var) {
        }

        public qc6 a() {
            iu4.b(this.a != null, "execute parameter required");
            return new k38(this, this.c, this.b, this.d);
        }

        public a b(d85 d85Var) {
            this.a = d85Var;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(w82... w82VarArr) {
            this.c = w82VarArr;
            return this;
        }

        public a e(int i) {
            this.d = i;
            return this;
        }
    }

    public qc6(w82[] w82VarArr, boolean z, int i) {
        this.a = w82VarArr;
        boolean z2 = false;
        if (w82VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(yp.b bVar, rc6 rc6Var);

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final w82[] e() {
        return this.a;
    }
}
