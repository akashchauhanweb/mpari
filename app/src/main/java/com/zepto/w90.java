package com.zepto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.YearMonth;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w90 implements Comparable, Serializable {
    public final int c;
    public final LocalDate e;
    public final he1 f;

    public w90(LocalDate date, he1 owner) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.e = date;
        this.f = owner;
        this.c = date.getDayOfMonth();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(w90 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        throw new UnsupportedOperationException("Compare using the `date` parameter instead. Out and In dates can have the same date values as CalendarDay in another month.");
    }

    public final LocalDate b() {
        return this.e;
    }

    public final YearMonth c() {
        int i = v90.a[this.f.ordinal()];
        if (i == 1) {
            return k72.d(this.e);
        }
        if (i == 2) {
            return k72.a(k72.d(this.e));
        }
        if (i == 3) {
            return k72.b(k72.d(this.e));
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(w90.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.model.CalendarDay");
        }
        w90 w90Var = (w90) obj;
        return Intrinsics.areEqual(this.e, w90Var.e) && this.f == w90Var.f;
    }

    public int hashCode() {
        return (this.e.hashCode() + this.f.hashCode()) * 31;
    }

    public String toString() {
        return "CalendarDay { date =  " + this.e + ", owner = " + this.f + '}';
    }
}
