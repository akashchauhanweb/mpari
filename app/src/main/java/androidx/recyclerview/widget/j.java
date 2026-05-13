package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class j extends n {
    public i d;
    public i e;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            j jVar = j.this;
            int[] iArrC = jVar.c(jVar.a.getLayoutManager(), view);
            int i = iArrC[0];
            int i2 = iArrC[1];
            int iW = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (iW > 0) {
                aVar.d(i, i2, iW, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        public int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    private i m(RecyclerView.p pVar) {
        i iVar = this.e;
        if (iVar == null || iVar.a != pVar) {
            this.e = i.a(pVar);
        }
        return this.e;
    }

    private i o(RecyclerView.p pVar) {
        i iVar = this.d;
        if (iVar == null || iVar.a != pVar) {
            this.d = i.c(pVar);
        }
        return this.d;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.p()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.q()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    public RecyclerView.z d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View f(RecyclerView.p pVar) {
        if (pVar.q()) {
            return l(pVar, o(pVar));
        }
        if (pVar.p()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int g(RecyclerView.p pVar, int i, int i2) {
        i iVarN;
        int iE = pVar.e();
        if (iE == 0 || (iVarN = n(pVar)) == null) {
            return -1;
        }
        int iO = pVar.O();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < iO; i5++) {
            View viewN = pVar.N(i5);
            if (viewN != null) {
                int iK = k(viewN, iVarN);
                if (iK <= 0 && iK > i4) {
                    view2 = viewN;
                    i4 = iK;
                }
                if (iK >= 0 && iK < i3) {
                    view = viewN;
                    i3 = iK;
                }
            }
        }
        boolean zP = p(pVar, i, i2);
        if (zP && view != null) {
            return pVar.n0(view);
        }
        if (!zP && view2 != null) {
            return pVar.n0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iN0 = pVar.n0(view) + (q(pVar) == zP ? -1 : 1);
        if (iN0 < 0 || iN0 >= iE) {
            return -1;
        }
        return iN0;
    }

    public final int k(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.n() + (iVar.o() / 2));
    }

    public final View l(RecyclerView.p pVar, i iVar) {
        int iO = pVar.O();
        View view = null;
        if (iO == 0) {
            return null;
        }
        int iN = iVar.n() + (iVar.o() / 2);
        int i = IntCompanionObject.MAX_VALUE;
        for (int i2 = 0; i2 < iO; i2++) {
            View viewN = pVar.N(i2);
            int iAbs = Math.abs((iVar.g(viewN) + (iVar.e(viewN) / 2)) - iN);
            if (iAbs < i) {
                view = viewN;
                i = iAbs;
            }
        }
        return view;
    }

    public final i n(RecyclerView.p pVar) {
        if (pVar.q()) {
            return o(pVar);
        }
        if (pVar.p()) {
            return m(pVar);
        }
        return null;
    }

    public final boolean p(RecyclerView.p pVar, int i, int i2) {
        return pVar.p() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q(RecyclerView.p pVar) {
        PointF pointFD;
        int iE = pVar.e();
        if (!(pVar instanceof RecyclerView.z.b) || (pointFD = ((RecyclerView.z.b) pVar).d(iE - 1)) == null) {
            return false;
        }
        return pointFD.x < 0.0f || pointFD.y < 0.0f;
    }
}
