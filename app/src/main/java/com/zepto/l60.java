package com.zepto;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.zepto.k60;
import com.zepto.wz;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l60 extends zq7 {
    public oy3 B;
    public oy3 C;
    public Executor d;
    public k60.a e;
    public WeakReference f;
    public k60.d g;
    public k60.c h;
    public wz i;
    public eb0 j;
    public DialogInterface.OnClickListener k;
    public CharSequence l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public oy3 t;
    public oy3 u;
    public oy3 v;
    public oy3 w;
    public oy3 x;
    public oy3 z;
    public int m = 0;
    public boolean y = true;
    public int A = 0;

    public class a extends k60.a {
        public a() {
        }
    }

    public static final class b extends wz.d {
        public final WeakReference a;

        public b(l60 l60Var) {
            this.a = new WeakReference(l60Var);
        }

        @Override // com.zepto.wz.d
        public void a(int i, CharSequence charSequence) {
            if (this.a.get() == null || ((l60) this.a.get()).C() || !((l60) this.a.get()).A()) {
                return;
            }
            ((l60) this.a.get()).K(new w50(i, charSequence));
        }

        @Override // com.zepto.wz.d
        public void b() {
            if (this.a.get() == null || !((l60) this.a.get()).A()) {
                return;
            }
            ((l60) this.a.get()).L(true);
        }

        @Override // com.zepto.wz.d
        public void c(CharSequence charSequence) {
            if (this.a.get() != null) {
                ((l60) this.a.get()).M(charSequence);
            }
        }

        @Override // com.zepto.wz.d
        public void d(k60.b bVar) {
            if (this.a.get() == null || !((l60) this.a.get()).A()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new k60.b(bVar.b(), ((l60) this.a.get()).u());
            }
            ((l60) this.a.get()).N(bVar);
        }
    }

    public static class c implements Executor {
        public final Handler c = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.c.post(runnable);
        }
    }

    public static class d implements DialogInterface.OnClickListener {
        public final WeakReference a;

        public d(l60 l60Var) {
            this.a = new WeakReference(l60Var);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.a.get() != null) {
                ((l60) this.a.get()).c0(true);
            }
        }
    }

    public static void h0(oy3 oy3Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            oy3Var.m(obj);
        } else {
            oy3Var.k(obj);
        }
    }

    public boolean A() {
        return this.o;
    }

    public boolean B() {
        k60.d dVar = this.g;
        return dVar == null || dVar.f();
    }

    public boolean C() {
        return this.p;
    }

    public boolean D() {
        return this.q;
    }

    public androidx.lifecycle.n E() {
        if (this.z == null) {
            this.z = new oy3();
        }
        return this.z;
    }

    public boolean F() {
        return this.y;
    }

    public boolean G() {
        return this.r;
    }

    public androidx.lifecycle.n H() {
        if (this.x == null) {
            this.x = new oy3();
        }
        return this.x;
    }

    public boolean I() {
        return this.n;
    }

    public boolean J() {
        return this.s;
    }

    public void K(w50 w50Var) {
        if (this.u == null) {
            this.u = new oy3();
        }
        h0(this.u, w50Var);
    }

    public void L(boolean z) {
        if (this.w == null) {
            this.w = new oy3();
        }
        h0(this.w, Boolean.valueOf(z));
    }

    public void M(CharSequence charSequence) {
        if (this.v == null) {
            this.v = new oy3();
        }
        h0(this.v, charSequence);
    }

    public void N(k60.b bVar) {
        if (this.t == null) {
            this.t = new oy3();
        }
        h0(this.t, bVar);
    }

    public void O(boolean z) {
        this.o = z;
    }

    public void P(int i) {
        this.m = i;
    }

    public void Q(yf2 yf2Var) {
        this.f = new WeakReference(yf2Var);
    }

    public void R(k60.a aVar) {
        this.e = aVar;
    }

    public void S(Executor executor) {
        this.d = executor;
    }

    public void T(boolean z) {
        this.p = z;
    }

    public void U(k60.c cVar) {
        this.h = cVar;
    }

    public void V(boolean z) {
        this.q = z;
    }

    public void W(boolean z) {
        if (this.z == null) {
            this.z = new oy3();
        }
        h0(this.z, Boolean.valueOf(z));
    }

    public void X(boolean z) {
        this.y = z;
    }

    public void Y(CharSequence charSequence) {
        if (this.C == null) {
            this.C = new oy3();
        }
        h0(this.C, charSequence);
    }

    public void Z(int i) {
        this.A = i;
    }

    public void a0(int i) {
        if (this.B == null) {
            this.B = new oy3();
        }
        h0(this.B, Integer.valueOf(i));
    }

    public void b0(boolean z) {
        this.r = z;
    }

    public void c0(boolean z) {
        if (this.x == null) {
            this.x = new oy3();
        }
        h0(this.x, Boolean.valueOf(z));
    }

    public void d0(CharSequence charSequence) {
        this.l = charSequence;
    }

    public void e0(k60.d dVar) {
        this.g = dVar;
    }

    public void f0(boolean z) {
        this.n = z;
    }

    public int g() {
        k60.d dVar = this.g;
        if (dVar != null) {
            return yz.c(dVar, this.h);
        }
        return 0;
    }

    public void g0(boolean z) {
        this.s = z;
    }

    public wz h() {
        if (this.i == null) {
            this.i = new wz(new b(this));
        }
        return this.i;
    }

    public oy3 i() {
        if (this.u == null) {
            this.u = new oy3();
        }
        return this.u;
    }

    public androidx.lifecycle.n j() {
        if (this.v == null) {
            this.v = new oy3();
        }
        return this.v;
    }

    public androidx.lifecycle.n k() {
        if (this.t == null) {
            this.t = new oy3();
        }
        return this.t;
    }

    public int l() {
        return this.m;
    }

    public eb0 m() {
        if (this.j == null) {
            this.j = new eb0();
        }
        return this.j;
    }

    public k60.a n() {
        if (this.e == null) {
            this.e = new a();
        }
        return this.e;
    }

    public Executor o() {
        Executor executor = this.d;
        return executor != null ? executor : new c();
    }

    public k60.c p() {
        return this.h;
    }

    public CharSequence q() {
        k60.d dVar = this.g;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public androidx.lifecycle.n r() {
        if (this.C == null) {
            this.C = new oy3();
        }
        return this.C;
    }

    public int s() {
        return this.A;
    }

    public androidx.lifecycle.n t() {
        if (this.B == null) {
            this.B = new oy3();
        }
        return this.B;
    }

    public int u() {
        int iG = g();
        return (!yz.e(iG) || yz.d(iG)) ? -1 : 2;
    }

    public DialogInterface.OnClickListener v() {
        if (this.k == null) {
            this.k = new d(this);
        }
        return this.k;
    }

    public CharSequence w() {
        CharSequence charSequence = this.l;
        if (charSequence != null) {
            return charSequence;
        }
        k60.d dVar = this.g;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public CharSequence x() {
        k60.d dVar = this.g;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public CharSequence y() {
        k60.d dVar = this.g;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    public androidx.lifecycle.n z() {
        if (this.w == null) {
            this.w = new oy3();
        }
        return this.w;
    }
}
