package com.kizitonwose.calendarview.ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.kizitonwose.calendarview.CalendarView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/kizitonwose/calendarview/ui/CalendarLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/kizitonwose/calendarview/CalendarView;", "I", "Lcom/kizitonwose/calendarview/CalendarView;", "calView", "", "orientation", "<init>", "(Lcom/kizitonwose/calendarview/CalendarView;I)V", "com.github.kizitonwose.CalendarView"}, k = 1, mv = {1, 4, 2})
public final class CalendarLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final CalendarView calView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarLayoutManager(CalendarView calView, int i) {
        super(calView.getContext(), i, false);
        Intrinsics.checkNotNullParameter(calView, "calView");
        this.calView = calView;
    }
}
