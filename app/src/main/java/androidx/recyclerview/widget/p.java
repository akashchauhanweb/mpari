package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.zepto.io3;
import com.zepto.w26;
import com.zepto.ws4;
import com.zepto.ys4;

/* JADX INFO: loaded from: classes.dex */
public class p {
    public final w26 a = new w26();
    public final io3 b = new io3();

    public static class a {
        public static ws4 d = new ys4(20);
        public int a;
        public RecyclerView.m.c b;
        public RecyclerView.m.c c;

        public static void a() {
            while (d.b() != null) {
            }
        }

        public static a b() {
            a aVar = (a) d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    public void a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVarB = (a) this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.a |= 2;
        aVarB.b = cVar;
    }

    public void b(RecyclerView.d0 d0Var) {
        a aVarB = (a) this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.a |= 1;
    }

    public void c(long j, RecyclerView.d0 d0Var) {
        this.b.h(j, d0Var);
    }

    public void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVarB = (a) this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.c = cVar;
        aVarB.a |= 8;
    }

    public void e(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVarB = (a) this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.b = cVar;
        aVarB.a |= 4;
    }

    public void f() {
        this.a.clear();
        this.b.a();
    }

    public RecyclerView.d0 g(long j) {
        return (RecyclerView.d0) this.b.d(j);
    }

    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = (a) this.a.get(d0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = (a) this.a.get(d0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    public final RecyclerView.m.c l(RecyclerView.d0 d0Var, int i) {
        a aVar;
        RecyclerView.m.c cVar;
        int iF = this.a.f(d0Var);
        if (iF >= 0 && (aVar = (a) this.a.m(iF)) != null) {
            int i2 = aVar.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVar.a = i3;
                if (i == 4) {
                    cVar = aVar.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.c;
                }
                if ((i3 & 12) == 0) {
                    this.a.k(iF);
                    a.c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.m.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    public RecyclerView.m.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) this.a.i(size);
            a aVar = (a) this.a.k(size);
            int i = aVar.a;
            if ((i & 3) == 3) {
                bVar.a(d0Var);
            } else if ((i & 1) != 0) {
                RecyclerView.m.c cVar = aVar.b;
                if (cVar == null) {
                    bVar.a(d0Var);
                } else {
                    bVar.c(d0Var, cVar, aVar.c);
                }
            } else if ((i & 14) == 14) {
                bVar.b(d0Var, aVar.b, aVar.c);
            } else if ((i & 12) == 12) {
                bVar.d(d0Var, aVar.b, aVar.c);
            } else if ((i & 4) != 0) {
                bVar.c(d0Var, aVar.b, null);
            } else if ((i & 8) != 0) {
                bVar.b(d0Var, aVar.b, aVar.c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.d0 d0Var) {
        a aVar = (a) this.a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public void q(RecyclerView.d0 d0Var) {
        int iL = this.b.l() - 1;
        while (true) {
            if (iL < 0) {
                break;
            }
            if (d0Var == this.b.o(iL)) {
                this.b.k(iL);
                break;
            }
            iL--;
        }
        a aVar = (a) this.a.remove(d0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
