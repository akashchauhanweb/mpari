package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.time.LocalDate;
import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class k72 {
    public static final YearMonth a(YearMonth next) {
        Intrinsics.checkNotNullParameter(next, "$this$next");
        YearMonth yearMonthPlusMonths = next.plusMonths(1L);
        Intrinsics.checkNotNullExpressionValue(yearMonthPlusMonths, "this.plusMonths(1)");
        return yearMonthPlusMonths;
    }

    public static final YearMonth b(YearMonth previous) {
        Intrinsics.checkNotNullParameter(previous, "$this$previous");
        YearMonth yearMonthMinusMonths = previous.minusMonths(1L);
        Intrinsics.checkNotNullExpressionValue(yearMonthMinusMonths, "this.minusMonths(1)");
        return yearMonthMinusMonths;
    }

    public static final int c(View getVerticalMargins) {
        Intrinsics.checkNotNullParameter(getVerticalMargins, "$this$getVerticalMargins");
        ViewGroup.LayoutParams layoutParams = getVerticalMargins.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer numValueOf = marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.topMargin) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Integer numValueOf2 = marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.bottomMargin) : null;
        return iIntValue + (numValueOf2 != null ? numValueOf2.intValue() : 0);
    }

    public static final YearMonth d(LocalDate yearMonth) {
        Intrinsics.checkNotNullParameter(yearMonth, "$this$yearMonth");
        YearMonth yearMonthOf = YearMonth.of(yearMonth.getYear(), yearMonth.getMonth());
        Intrinsics.checkNotNullExpressionValue(yearMonthOf, "YearMonth.of(year, month)");
        return yearMonthOf;
    }

    public static final View e(ViewGroup inflate, int i, boolean z) {
        Intrinsics.checkNotNullParameter(inflate, "$this$inflate");
        View viewInflate = LayoutInflater.from(inflate.getContext()).inflate(i, inflate, z);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "LayoutInflater.from(cont…tRes, this, attachToRoot)");
        return viewInflate;
    }

    public static /* synthetic */ View f(ViewGroup viewGroup, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return e(viewGroup, i, z);
    }
}
