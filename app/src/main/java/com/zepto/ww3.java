package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class ww3 implements Comparable, Parcelable {
    public static final Parcelable.Creator<ww3> CREATOR = new a();
    public final Calendar c;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public String j;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww3 createFromParcel(Parcel parcel) {
            return ww3.d(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ww3[] newArray(int i) {
            return new ww3[i];
        }
    }

    public ww3(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = xs6.c(calendar);
        this.c = calendarC;
        this.e = calendarC.get(2);
        this.f = calendarC.get(1);
        this.g = calendarC.getMaximum(7);
        this.h = calendarC.getActualMaximum(5);
        this.i = calendarC.getTimeInMillis();
    }

    public static ww3 d(int i, int i2) {
        Calendar calendarI = xs6.i();
        calendarI.set(1, i);
        calendarI.set(2, i2);
        return new ww3(calendarI);
    }

    public static ww3 e(long j) {
        Calendar calendarI = xs6.i();
        calendarI.setTimeInMillis(j);
        return new ww3(calendarI);
    }

    public static ww3 f() {
        return new ww3(xs6.g());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(ww3 ww3Var) {
        return this.c.compareTo(ww3Var.c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww3)) {
            return false;
        }
        ww3 ww3Var = (ww3) obj;
        return this.e == ww3Var.e && this.f == ww3Var.f;
    }

    public int g(int i) {
        int i2 = this.c.get(7);
        if (i <= 0) {
            i = this.c.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.g : i3;
    }

    public long h(int i) {
        Calendar calendarC = xs6.c(this.c);
        calendarC.set(5, i);
        return calendarC.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public int i(long j) {
        Calendar calendarC = xs6.c(this.c);
        calendarC.setTimeInMillis(j);
        return calendarC.get(5);
    }

    public String j() {
        if (this.j == null) {
            this.j = zd1.f(this.c.getTimeInMillis());
        }
        return this.j;
    }

    public long k() {
        return this.c.getTimeInMillis();
    }

    public ww3 l(int i) {
        Calendar calendarC = xs6.c(this.c);
        calendarC.add(2, i);
        return new ww3(calendarC);
    }

    public int m(ww3 ww3Var) {
        if (this.c instanceof GregorianCalendar) {
            return ((ww3Var.f - this.f) * 12) + (ww3Var.e - this.e);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.e);
    }
}
