package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static int a(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.O() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1;
        }
        return Math.min(iVar.o(), iVar.d(view2) - iVar.g(view));
    }

    public static int b(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        if (pVar.O() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (a0Var.b() - Math.max(pVar.n0(view), pVar.n0(view2))) - 1) : Math.max(0, Math.min(pVar.n0(view), pVar.n0(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1))) + (iVar.n() - iVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.O() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1)) * a0Var.b());
    }
}
