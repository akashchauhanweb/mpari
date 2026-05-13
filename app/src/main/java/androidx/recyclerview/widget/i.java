package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public final RecyclerView.p a;
    public int b;
    public final Rect c;

    public class a extends i {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.a.u0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.a.u0() - this.a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.a.v0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return this.a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int o() {
            return (this.a.u0() - this.a.j0()) - this.a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.a.t0(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int r(View view) {
            this.a.t0(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void s(int i) {
            this.a.I0(i);
        }
    }

    public class b extends i {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.a.b0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.a.b0() - this.a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.a.v0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return this.a.m0();
        }

        @Override // androidx.recyclerview.widget.i
        public int o() {
            return (this.a.b0() - this.a.m0()) - this.a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.a.t0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int r(View view) {
            this.a.t0(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void s(int i) {
            this.a.J0(i);
        }
    }

    public /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i) {
        if (i == 0) {
            return a(pVar);
        }
        if (i == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.p k() {
        return this.a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return o() - this.b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(int i);

    public void t() {
        this.b = o();
    }

    public i(RecyclerView.p pVar) {
        this.b = IntCompanionObject.MIN_VALUE;
        this.c = new Rect();
        this.a = pVar;
    }
}
