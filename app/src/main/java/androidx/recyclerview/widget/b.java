package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public final InterfaceC0024b a;
    public final a b = new a();
    public final List c = new ArrayList();

    public static class a {
        public long a = 0;
        public a b;

        public void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public int b(int i) {
            a aVar = this.b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.a);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0024b {
        View a(int i);

        void b(View view);

        RecyclerView.d0 c(View view);

        void d(int i);

        void e(View view);

        void f(View view, int i);

        int g();

        void h(int i);

        void i();

        void j(View view, int i, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    public b(InterfaceC0024b interfaceC0024b) {
        this.a = interfaceC0024b;
    }

    public void a(View view, int i, boolean z) {
        int iG = i < 0 ? this.a.g() : h(i);
        this.b.e(iG, z);
        if (z) {
            l(view);
        }
        this.a.f(view, iG);
    }

    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iG = i < 0 ? this.a.g() : h(i);
        this.b.e(iG, z);
        if (z) {
            l(view);
        }
        this.a.j(view, iG, layoutParams);
    }

    public void d(int i) {
        int iH = h(i);
        this.b.f(iH);
        this.a.d(iH);
    }

    public View e(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.c.get(i2);
            RecyclerView.d0 d0VarC = this.a.c(view);
            if (d0VarC.o() == i && !d0VarC.v() && !d0VarC.x()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i) {
        return this.a.a(h(i));
    }

    public int g() {
        return this.a.g() - this.c.size();
    }

    public final int h(int i) {
        if (i < 0) {
            return -1;
        }
        int iG = this.a.g();
        int i2 = i;
        while (i2 < iG) {
            int iB = i - (i2 - this.b.b(i2));
            if (iB == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public View i(int i) {
        return this.a.a(i);
    }

    public int j() {
        return this.a.g();
    }

    public void k(View view) {
        int iK = this.a.k(view);
        if (iK >= 0) {
            this.b.h(iK);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.c.add(view);
        this.a.b(view);
    }

    public int m(View view) {
        int iK = this.a.k(view);
        if (iK == -1 || this.b.d(iK)) {
            return -1;
        }
        return iK - this.b.b(iK);
    }

    public boolean n(View view) {
        return this.c.contains(view);
    }

    public void o() {
        this.b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.e((View) this.c.get(size));
            this.c.remove(size);
        }
        this.a.i();
    }

    public void p(View view) {
        int iK = this.a.k(view);
        if (iK < 0) {
            return;
        }
        if (this.b.f(iK)) {
            t(view);
        }
        this.a.h(iK);
    }

    public void q(int i) {
        int iH = h(i);
        View viewA = this.a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.b.f(iH)) {
            t(viewA);
        }
        this.a.h(iH);
    }

    public boolean r(View view) {
        int iK = this.a.k(view);
        if (iK == -1) {
            t(view);
            return true;
        }
        if (!this.b.d(iK)) {
            return false;
        }
        this.b.f(iK);
        t(view);
        this.a.h(iK);
        return true;
    }

    public void s(View view) {
        int iK = this.a.k(view);
        if (iK < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.b.d(iK)) {
            this.b.a(iK);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.e(view);
        return true;
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
