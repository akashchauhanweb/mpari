package com.zepto;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendarview.CalendarView;
import com.kizitonwose.calendarview.ui.CalendarLayoutManager;
import java.time.YearMonth;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class r90 extends RecyclerView.h {
    public int d;
    public int e;
    public y90 f;
    public Boolean g;
    public boolean h;
    public final CalendarView i;
    public jq7 j;
    public yw3 k;

    public static final class a extends RecyclerView.j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            r90.this.h = true;
        }
    }

    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ bx3 b;

        public b(bx3 bx3Var) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator it) {
            CalendarView calendarView = r90.this.i;
            ViewGroup.LayoutParams layoutParams = calendarView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            layoutParams.height = ((Integer) animatedValue).intValue();
            calendarView.setLayoutParams(layoutParams);
            this.b.a.requestLayout();
        }
    }

    public static final class c implements RecyclerView.m.a {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public final void a() {
            r90.this.K();
        }
    }

    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r90.this.K();
        }
    }

    public r90(CalendarView calView, jq7 viewConfig, yw3 monthConfig) {
        Intrinsics.checkNotNullParameter(calView, "calView");
        Intrinsics.checkNotNullParameter(viewConfig, "viewConfig");
        Intrinsics.checkNotNullParameter(monthConfig, "monthConfig");
        this.i = calView;
        this.j = viewConfig;
        this.k = monthConfig;
        this.d = dq7.k();
        this.e = dq7.k();
        y(true);
        x(new a());
        this.h = true;
    }

    public final int C() {
        return D(true);
    }

    public final int D(boolean z) {
        int i;
        int i2;
        CalendarLayoutManager calendarLayoutManagerH = H();
        int iE2 = z ? calendarLayoutManagerH.e2() : calendarLayoutManagerH.g2();
        if (iE2 != -1) {
            Rect rect = new Rect();
            View viewH = H().H(iE2);
            if (viewH == null) {
                return -1;
            }
            Intrinsics.checkNotNullExpressionValue(viewH, "layoutManager.findViewBy…emPos) ?: return NO_INDEX");
            viewH.getGlobalVisibleRect(rect);
            if (this.i.D1()) {
                i = rect.bottom;
                i2 = rect.top;
            } else {
                i = rect.right;
                i2 = rect.left;
            }
            if (i - i2 <= 7) {
                int i3 = z ? iE2 + 1 : iE2 - 1;
                return CollectionsKt__CollectionsKt.getIndices(I()).contains(i3) ? i3 : iE2;
            }
        }
        return iE2;
    }

    public final int E(w90 day) {
        Intrinsics.checkNotNullParameter(day, "day");
        int i = 0;
        if (!this.k.a()) {
            Iterator it = I().iterator();
            while (it.hasNext()) {
                List<List> listC = ((y90) it.next()).c();
                if (!(listC instanceof Collection) || !listC.isEmpty()) {
                    for (List list : listC) {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.areEqual((w90) it2.next(), day)) {
                                    return i;
                                }
                            }
                        }
                    }
                }
                i++;
            }
            return -1;
        }
        int iF = F(day.c());
        if (iF == -1) {
            return -1;
        }
        Iterator it3 = CollectionsKt___CollectionsKt.slice(I(), RangesKt___RangesKt.until(iF, ((y90) I().get(iF)).b() + iF)).iterator();
        loop0: while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            }
            List<List> listC2 = ((y90) it3.next()).c();
            if (!(listC2 instanceof Collection) || !listC2.isEmpty()) {
                for (List list2 : listC2) {
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (Intrinsics.areEqual((w90) it4.next(), day)) {
                                break loop0;
                            }
                        }
                    }
                }
            }
            i++;
        }
        if (i == -1) {
            return -1;
        }
        return iF + i;
    }

    public final int F(YearMonth month) {
        Intrinsics.checkNotNullParameter(month, "month");
        Iterator it = I().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((y90) it.next()).d(), month)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final y90 G(int i) {
        return (y90) I().get(i);
    }

    public final CalendarLayoutManager H() {
        RecyclerView.p layoutManager = this.i.getLayoutManager();
        if (layoutManager != null) {
            return (CalendarLayoutManager) layoutManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.ui.CalendarLayoutManager");
    }

    public final List I() {
        return this.k.b();
    }

    public final boolean J() {
        return this.i.getAdapter() == this;
    }

    public final void K() {
        boolean zBooleanValue;
        if (J()) {
            if (this.i.u0()) {
                RecyclerView.m itemAnimator = this.i.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.q(new c());
                    return;
                }
                return;
            }
            int iC = C();
            if (iC != -1) {
                y90 y90Var = (y90) I().get(iC);
                if (!Intrinsics.areEqual(y90Var, this.f)) {
                    this.f = y90Var;
                    Function1<y90, Unit> monthScrollListener = this.i.getMonthScrollListener();
                    if (monthScrollListener != null) {
                        monthScrollListener.invoke(y90Var);
                    }
                    if (this.i.getScrollMode() == rp5.PAGED) {
                        Boolean bool = this.g;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            boolean z = this.i.getLayoutParams().height == -2;
                            this.g = Boolean.valueOf(z);
                            zBooleanValue = z;
                        }
                        if (zBooleanValue) {
                            RecyclerView.d0 d0VarX = this.i.X(iC);
                            if (!(d0VarX instanceof bx3)) {
                                d0VarX = null;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void p(bx3 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O(G(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void q(bx3 holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.q(holder, i, payloads);
            return;
        }
        for (Object obj : payloads) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.model.CalendarDay");
            }
            holder.R((w90) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public bx3 r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setOrientation(1);
        if (this.j.b() != 0) {
            View viewF = k72.f(linearLayout, this.j.b(), false, 2, null);
            if (viewF.getId() == -1) {
                viewF.setId(this.d);
            } else {
                this.d = viewF.getId();
            }
            linearLayout.addView(viewF);
        }
        this.i.getDaySize();
        this.j.a();
        this.i.getDayBinder();
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.ui.DayBinder<com.kizitonwose.calendarview.ui.ViewContainer>");
    }

    public final void O(w90 day) {
        Intrinsics.checkNotNullParameter(day, "day");
        int iE = E(day);
        if (iE != -1) {
            l(iE, day);
        }
    }

    public final void P(yw3 yw3Var) {
        Intrinsics.checkNotNullParameter(yw3Var, "<set-?>");
        this.k = yw3Var;
    }

    public final void Q(jq7 jq7Var) {
        Intrinsics.checkNotNullParameter(jq7Var, "<set-?>");
        this.j = jq7Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return I().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i) {
        return G(i).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void o(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.i.post(new d());
    }
}
