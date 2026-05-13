package com.zepto;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ms3 extends oy3 {
    public hi5 l = new hi5();

    public static class a implements mf4 {
        public final androidx.lifecycle.n a;
        public final mf4 b;
        public int c = -1;

        public a(androidx.lifecycle.n nVar, mf4 mf4Var) {
            this.a = nVar;
            this.b = mf4Var;
        }

        @Override // com.zepto.mf4
        public void a(Object obj) {
            if (this.c != this.a.e()) {
                this.c = this.a.e();
                this.b.a(obj);
            }
        }

        public void b() {
            this.a.h(this);
        }

        public void c() {
            this.a.l(this);
        }
    }

    @Override // androidx.lifecycle.n
    public void i() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    @Override // androidx.lifecycle.n
    public void j() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).c();
        }
    }

    public void n(androidx.lifecycle.n nVar, mf4 mf4Var) {
        if (nVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(nVar, mf4Var);
        a aVar2 = (a) this.l.w(nVar, aVar);
        if (aVar2 != null && aVar2.b != mf4Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && f()) {
            aVar.b();
        }
    }
}
