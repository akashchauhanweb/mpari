package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RecyclerView.m {
    public boolean g = true;

    public abstract boolean A(RecyclerView.d0 d0Var);

    public final void B(RecyclerView.d0 d0Var) {
        J(d0Var);
        h(d0Var);
    }

    public final void C(RecyclerView.d0 d0Var) {
        K(d0Var);
    }

    public final void D(RecyclerView.d0 d0Var, boolean z) {
        L(d0Var, z);
        h(d0Var);
    }

    public final void E(RecyclerView.d0 d0Var, boolean z) {
        M(d0Var, z);
    }

    public final void F(RecyclerView.d0 d0Var) {
        N(d0Var);
        h(d0Var);
    }

    public final void G(RecyclerView.d0 d0Var) {
        O(d0Var);
    }

    public final void H(RecyclerView.d0 d0Var) {
        P(d0Var);
        h(d0Var);
    }

    public final void I(RecyclerView.d0 d0Var) {
        Q(d0Var);
    }

    public void J(RecyclerView.d0 d0Var) {
    }

    public void K(RecyclerView.d0 d0Var) {
    }

    public void L(RecyclerView.d0 d0Var, boolean z) {
    }

    public void M(RecyclerView.d0 d0Var, boolean z) {
    }

    public void N(RecyclerView.d0 d0Var) {
    }

    public void O(RecyclerView.d0 d0Var) {
    }

    public void P(RecyclerView.d0 d0Var) {
    }

    public void Q(RecyclerView.d0 d0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.a) == (i2 = cVar2.a) && cVar.b == cVar2.b)) ? x(d0Var) : z(d0Var, i, cVar.b, i2, cVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (d0Var2.L()) {
            int i5 = cVar.a;
            i2 = cVar.b;
            i = i5;
        } else {
            i = cVar2.a;
            i2 = cVar2.b;
        }
        return y(d0Var, d0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i = cVar.a;
        int i2 = cVar.b;
        View view = d0Var.a;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (d0Var.x() || (i == left && i2 == top)) {
            return A(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(d0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i = cVar.a;
        int i2 = cVar2.a;
        if (i != i2 || cVar.b != cVar2.b) {
            return z(d0Var, i, cVar.b, i2, cVar2.b);
        }
        F(d0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.d0 d0Var) {
        return !this.g || d0Var.v();
    }

    public abstract boolean x(RecyclerView.d0 d0Var);

    public abstract boolean y(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4);

    public abstract boolean z(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4);
}
