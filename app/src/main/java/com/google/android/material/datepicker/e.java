package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.zepto.ie1;
import com.zepto.ww3;
import com.zepto.x90;
import com.zepto.xs6;
import com.zepto.yd1;
import com.zepto.z90;
import com.zepto.zd1;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e extends BaseAdapter {
    public static final int e = xs6.i().getMaximum(4);
    public static final int f = (xs6.i().getMaximum(5) + xs6.i().getMaximum(7)) - 1;
    public final ww3 a;
    public Collection b;
    public z90 c;
    public final a d;

    public e(ww3 ww3Var, yd1 yd1Var, a aVar, ie1 ie1Var) {
        this.a = ww3Var;
        this.d = aVar;
        this.b = yd1Var.b();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.a.g(this.d.j());
    }

    public final String c(Context context, long j) {
        return zd1.a(context, j, j(j), i(j), g(j));
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < b() || i > k()) {
            return null;
        }
        return Long.valueOf(this.a.h(l(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.zepto.p05.s
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.zepto.ww3 r8 = r5.a
            int r2 = r8.h
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.m(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.e.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void f(Context context) {
        if (this.c == null) {
            this.c = new z90(context);
        }
    }

    public boolean g(long j) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.a.g;
    }

    public final boolean h(long j) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(long j) {
        throw null;
    }

    public final boolean j(long j) {
        return xs6.g().getTimeInMillis() == j;
    }

    public int k() {
        return (b() + this.a.h) - 1;
    }

    public int l(int i) {
        return (i - b()) + 1;
    }

    public final void m(TextView textView, long j, int i) {
        x90 x90Var;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j));
        if (this.d.h().a(j)) {
            textView.setEnabled(true);
            boolean zH = h(j);
            textView.setSelected(zH);
            x90Var = zH ? this.c.b : j(j) ? this.c.c : this.c.a;
        } else {
            textView.setEnabled(false);
            x90Var = this.c.g;
        }
        x90Var.b(textView);
    }

    public final void n(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (ww3.e(j).equals(this.a)) {
            int i = this.a.i(j);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(i) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    public boolean p(int i) {
        return i >= b() && i <= k();
    }
}
