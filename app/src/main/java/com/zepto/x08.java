package com.zepto;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class x08 extends RecyclerView.h {
    public final com.google.android.material.datepicker.c d;

    public static class a extends RecyclerView.d0 {
        public final TextView u;

        public a(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public x08(com.google.android.material.datepicker.c cVar) {
        this.d = cVar;
    }

    public int A(int i) {
        return i - this.d.e2().m().f;
    }

    public int B(int i) {
        return this.d.e2().m().f + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void p(a aVar, int i) {
        int iB = B(i);
        aVar.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iB)));
        TextView textView = aVar.u;
        textView.setContentDescription(zd1.e(textView.getContext(), iB));
        z90 z90VarF2 = this.d.f2();
        if (xs6.g().get(1) == iB) {
            x90 x90Var = z90VarF2.f;
        } else {
            x90 x90Var2 = z90VarF2.d;
        }
        this.d.h2();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p05.x, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.e2().n();
    }
}
