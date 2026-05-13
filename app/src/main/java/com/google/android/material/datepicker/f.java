package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.c;
import com.zepto.dq7;
import com.zepto.ie1;
import com.zepto.p05;
import com.zepto.ww3;
import com.zepto.yd1;
import com.zepto.zz4;

/* JADX INFO: loaded from: classes.dex */
public class f extends RecyclerView.h {
    public final com.google.android.material.datepicker.a d;
    public final c.m e;
    public final int f;

    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (this.a.getAdapter().p(i)) {
                f.this.e.a(this.a.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.d0 {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(zz4.w);
            this.u = textView;
            dq7.r0(textView, true);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(zz4.s);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public f(Context context, yd1 yd1Var, com.google.android.material.datepicker.a aVar, ie1 ie1Var, c.m mVar) {
        ww3 ww3VarM = aVar.m();
        ww3 ww3VarI = aVar.i();
        ww3 ww3VarL = aVar.l();
        if (ww3VarM.compareTo(ww3VarL) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (ww3VarL.compareTo(ww3VarI) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (e.e * c.i2(context)) + (d.v2(context) ? c.i2(context) : 0);
        this.d = aVar;
        this.e = mVar;
        y(true);
    }

    public ww3 B(int i) {
        return this.d.m().l(i);
    }

    public CharSequence C(int i) {
        return B(i).j();
    }

    public int D(ww3 ww3Var) {
        return this.d.m().m(ww3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void p(b bVar, int i) {
        ww3 ww3VarL = this.d.m().l(i);
        bVar.u.setText(ww3VarL.j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(zz4.s);
        if (materialCalendarGridView.getAdapter() == null || !ww3VarL.equals(materialCalendarGridView.getAdapter().a)) {
            e eVar = new e(ww3VarL, null, this.d, null);
            materialCalendarGridView.setNumColumns(ww3VarL.g);
            materialCalendarGridView.setAdapter((ListAdapter) eVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(p05.v, viewGroup, false);
        if (!d.v2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i) {
        return this.d.m().l(i).k();
    }
}
