package com.zepto;

import java.io.Serializable;
import java.time.YearMonth;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y90 implements Comparable, Serializable {
    public final int c;
    public final int e;
    public final YearMonth f;
    public final List g;
    public final int h;
    public final int i;

    public y90(YearMonth yearMonth, List weekDays, int i, int i2) {
        Intrinsics.checkNotNullParameter(yearMonth, "yearMonth");
        Intrinsics.checkNotNullParameter(weekDays, "weekDays");
        this.f = yearMonth;
        this.g = weekDays;
        this.h = i;
        this.i = i2;
        this.c = yearMonth.getYear();
        this.e = yearMonth.getMonthValue();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(y90 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iCompareTo = this.f.compareTo(other.f);
        return iCompareTo == 0 ? Intrinsics.compare(this.h, other.h) : iCompareTo;
    }

    public final int b() {
        return this.i;
    }

    public final List c() {
        return this.g;
    }

    public final YearMonth d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(y90.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.model.CalendarMonth");
        }
        y90 y90Var = (y90) obj;
        return Intrinsics.areEqual(this.f, y90Var.f) && Intrinsics.areEqual((w90) CollectionsKt___CollectionsKt.first((List) CollectionsKt___CollectionsKt.first(this.g)), (w90) CollectionsKt___CollectionsKt.first((List) CollectionsKt___CollectionsKt.first(y90Var.g))) && Intrinsics.areEqual((w90) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last(this.g)), (w90) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last(y90Var.g)));
    }

    public int hashCode() {
        return (this.f.hashCode() * 31) + ((w90) CollectionsKt___CollectionsKt.first((List) CollectionsKt___CollectionsKt.first(this.g))).hashCode() + ((w90) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last(this.g))).hashCode();
    }

    public String toString() {
        return "CalendarMonth { first = " + ((w90) CollectionsKt___CollectionsKt.first((List) CollectionsKt___CollectionsKt.first(this.g))) + ", last = " + ((w90) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last(this.g))) + "} indexInSameMonth = " + this.h + ", numberOfSameMonth = " + this.i;
    }
}
