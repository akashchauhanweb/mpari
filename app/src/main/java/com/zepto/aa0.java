package com.zepto;

import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendarview.CalendarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends RecyclerView.t {
    public final /* synthetic */ CalendarView a;

    public aa0(CalendarView calendarView) {
        this.a = calendarView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0) {
            this.a.getCalendarAdapter().K();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }
}
