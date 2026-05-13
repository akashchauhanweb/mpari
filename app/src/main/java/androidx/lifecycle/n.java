package androidx.lifecycle;

import androidx.lifecycle.h;
import com.zepto.df3;
import com.zepto.hi5;
import com.zepto.jx;
import com.zepto.mf4;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final Object k = new Object();
    public final Object a = new Object();
    public hi5 b = new hi5();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (n.this.a) {
                obj = n.this.f;
                n.this.f = n.k;
            }
            n.this.m(obj);
        }
    }

    public class b extends d {
        public b(mf4 mf4Var) {
            super(mf4Var);
        }

        @Override // androidx.lifecycle.n.d
        public boolean k() {
            return true;
        }
    }

    public class c extends d implements k {
        public final df3 h;

        public c(df3 df3Var, mf4 mf4Var) {
            super(mf4Var);
            this.h = df3Var;
        }

        @Override // androidx.lifecycle.k
        public void e(df3 df3Var, h.a aVar) {
            h.b bVarB = this.h.g0().b();
            if (bVarB == h.b.DESTROYED) {
                n.this.l(this.c);
                return;
            }
            h.b bVar = null;
            while (bVar != bVarB) {
                c(k());
                bVar = bVarB;
                bVarB = this.h.g0().b();
            }
        }

        @Override // androidx.lifecycle.n.d
        public void i() {
            this.h.g0().d(this);
        }

        @Override // androidx.lifecycle.n.d
        public boolean j(df3 df3Var) {
            return this.h == df3Var;
        }

        @Override // androidx.lifecycle.n.d
        public boolean k() {
            return this.h.g0().b().b(h.b.STARTED);
        }
    }

    public abstract class d {
        public final mf4 c;
        public boolean e;
        public int f = -1;

        public d(mf4 mf4Var) {
            this.c = mf4Var;
        }

        public void c(boolean z) {
            if (z == this.e) {
                return;
            }
            this.e = z;
            n.this.b(z ? 1 : -1);
            if (this.e) {
                n.this.d(this);
            }
        }

        public void i() {
        }

        public boolean j(df3 df3Var) {
            return false;
        }

        public abstract boolean k();
    }

    public n() {
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (jx.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void b(int i) {
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 == i3) {
                    this.d = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    i();
                } else if (z2) {
                    j();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    public final void c(d dVar) {
        if (dVar.e) {
            if (!dVar.k()) {
                dVar.c(false);
                return;
            }
            int i = dVar.f;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            dVar.f = i2;
            dVar.c.a(this.e);
        }
    }

    public void d(d dVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (dVar != null) {
                c(dVar);
                dVar = null;
            } else {
                hi5.d dVarN = this.b.n();
                while (dVarN.hasNext()) {
                    c((d) ((Map.Entry) dVarN.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public int e() {
        return this.g;
    }

    public boolean f() {
        return this.c > 0;
    }

    public void g(df3 df3Var, mf4 mf4Var) {
        a("observe");
        if (df3Var.g0().b() == h.b.DESTROYED) {
            return;
        }
        c cVar = new c(df3Var, mf4Var);
        d dVar = (d) this.b.w(mf4Var, cVar);
        if (dVar != null && !dVar.j(df3Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        df3Var.g0().a(cVar);
    }

    public void h(mf4 mf4Var) {
        a("observeForever");
        b bVar = new b(mf4Var);
        d dVar = (d) this.b.w(mf4Var, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.c(true);
    }

    public void i() {
    }

    public void j() {
    }

    public void k(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            jx.g().c(this.j);
        }
    }

    public void l(mf4 mf4Var) {
        a("removeObserver");
        d dVar = (d) this.b.z(mf4Var);
        if (dVar == null) {
            return;
        }
        dVar.i();
        dVar.c(false);
    }

    public void m(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        d(null);
    }
}
