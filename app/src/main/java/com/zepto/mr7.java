package com.zepto;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class mr7 {
    public Interpolator c;
    public nr7 d;
    public boolean e;
    public long b = -1;
    public final or7 f = new a();
    public final ArrayList a = new ArrayList();

    public class a extends or7 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // com.zepto.nr7
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == mr7.this.a.size()) {
                nr7 nr7Var = mr7.this.d;
                if (nr7Var != null) {
                    nr7Var.b(null);
                }
                d();
            }
        }

        @Override // com.zepto.or7, com.zepto.nr7
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            nr7 nr7Var = mr7.this.d;
            if (nr7Var != null) {
                nr7Var.c(null);
            }
        }

        public void d() {
            this.b = 0;
            this.a = false;
            mr7.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((lr7) it.next()).c();
            }
            this.e = false;
        }
    }

    public void b() {
        this.e = false;
    }

    public mr7 c(lr7 lr7Var) {
        if (!this.e) {
            this.a.add(lr7Var);
        }
        return this;
    }

    public mr7 d(lr7 lr7Var, lr7 lr7Var2) {
        this.a.add(lr7Var);
        lr7Var2.j(lr7Var.d());
        this.a.add(lr7Var2);
        return this;
    }

    public mr7 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public mr7 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public mr7 g(nr7 nr7Var) {
        if (!this.e) {
            this.d = nr7Var;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        for (lr7 lr7Var : this.a) {
            long j = this.b;
            if (j >= 0) {
                lr7Var.f(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                lr7Var.g(interpolator);
            }
            if (this.d != null) {
                lr7Var.h(this.f);
            }
            lr7Var.l();
        }
        this.e = true;
    }
}
