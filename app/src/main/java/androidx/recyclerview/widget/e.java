package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.zepto.aj6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public static final ThreadLocal h = new ThreadLocal();
    public static Comparator i = new a();
    public long e;
    public long f;
    public ArrayList c = new ArrayList();
    public ArrayList g = new ArrayList();

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.d;
            if ((recyclerView == null) != (cVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    public static class b implements RecyclerView.p.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.m;
            if (recyclerView.l == null || pVar == null || !pVar.A0()) {
                return;
            }
            if (z) {
                if (!recyclerView.d.p()) {
                    pVar.u(recyclerView.l.e(), this);
                }
            } else if (!recyclerView.m0()) {
                pVar.t(this.a, this.b, recyclerView.h0, this);
            }
            int i = this.d;
            if (i > pVar.m) {
                pVar.m = i;
                pVar.n = z;
                recyclerView.b.K();
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i2) {
        int iJ = recyclerView.e.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            RecyclerView.d0 d0VarF0 = RecyclerView.f0(recyclerView.e.i(i3));
            if (d0VarF0.c == i2 && !d0VarF0.v()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.c.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.c.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = (RecyclerView) this.c.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.g0.c(recyclerView, false);
                i2 += recyclerView.g0.d;
            }
        }
        this.g.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = (RecyclerView) this.c.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.g0;
                int iAbs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i6 = 0; i6 < bVar.d * 2; i6 += 2) {
                    if (i4 >= this.g.size()) {
                        cVar = new c();
                        this.g.add(cVar);
                    } else {
                        cVar = (c) this.g.get(i4);
                    }
                    int[] iArr = bVar.c;
                    int i7 = iArr[i6 + 1];
                    cVar.a = i7 <= iAbs;
                    cVar.b = iAbs;
                    cVar.c = i7;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.g, i);
    }

    public final void c(c cVar, long j) {
        RecyclerView.d0 d0VarI = i(cVar.d, cVar.e, cVar.a ? LongCompanionObject.MAX_VALUE : j);
        if (d0VarI == null || d0VarI.b == null || !d0VarI.u() || d0VarI.v()) {
            return;
        }
        h((RecyclerView) d0VarI.b.get(), j);
    }

    public final void d(long j) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            c cVar = (c) this.g.get(i2);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.e == 0) {
            this.e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.g0.e(i2, i3);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public final void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.D && recyclerView.e.j() != 0) {
            recyclerView.W0();
        }
        b bVar = recyclerView.g0;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                aj6.a("RV Nested Prefetch");
                recyclerView.h0.f(recyclerView.l);
                for (int i2 = 0; i2 < bVar.d * 2; i2 += 2) {
                    i(recyclerView, bVar.c[i2], j);
                }
            } finally {
                aj6.b();
            }
        }
    }

    public final RecyclerView.d0 i(RecyclerView recyclerView, int i2, long j) {
        if (e(recyclerView, i2)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.b;
        try {
            recyclerView.I0();
            RecyclerView.d0 d0VarI = vVar.I(i2, false, j);
            if (d0VarI != null) {
                if (!d0VarI.u() || d0VarI.v()) {
                    vVar.a(d0VarI, false);
                } else {
                    vVar.B(d0VarI.a);
                }
            }
            recyclerView.K0(false);
            return d0VarI;
        } catch (Throwable th) {
            recyclerView.K0(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        this.c.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            aj6.a("RV Prefetch");
            if (!this.c.isEmpty()) {
                int size = this.c.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) this.c.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f);
                    this.e = 0L;
                    aj6.b();
                }
            }
        } finally {
            this.e = 0L;
            aj6.b();
        }
    }
}
