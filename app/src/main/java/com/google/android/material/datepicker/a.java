package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.zepto.lf4;
import com.zepto.ww3;
import com.zepto.xs6;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0037a();
    public final ww3 c;
    public final ww3 e;
    public final c f;
    public ww3 g;
    public final int h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0037a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((ww3) parcel.readParcelable(ww3.class.getClassLoader()), (ww3) parcel.readParcelable(ww3.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (ww3) parcel.readParcelable(ww3.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public static final class b {
        public static final long f = xs6.a(ww3.d(1900, 0).i);
        public static final long g = xs6.a(ww3.d(2100, 11).i);
        public long a;
        public long b;
        public Long c;
        public int d;
        public c e;

        public b(a aVar) {
            this.a = f;
            this.b = g;
            this.e = com.google.android.material.datepicker.b.c(Long.MIN_VALUE);
            this.a = aVar.c.i;
            this.b = aVar.e.i;
            this.c = Long.valueOf(aVar.g.i);
            this.d = aVar.h;
            this.e = aVar.f;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            ww3 ww3VarE = ww3.e(this.a);
            ww3 ww3VarE2 = ww3.e(this.b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new a(ww3VarE, ww3VarE2, cVar, l == null ? null : ww3.e(l.longValue()), this.d, null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean a(long j);
    }

    public /* synthetic */ a(ww3 ww3Var, ww3 ww3Var2, c cVar, ww3 ww3Var3, int i, C0037a c0037a) {
        this(ww3Var, ww3Var2, cVar, ww3Var3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.c.equals(aVar.c) && this.e.equals(aVar.e) && lf4.a(this.g, aVar.g) && this.h == aVar.h && this.f.equals(aVar.f);
    }

    public c h() {
        return this.f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.e, this.g, Integer.valueOf(this.h), this.f});
    }

    public ww3 i() {
        return this.e;
    }

    public int j() {
        return this.h;
    }

    public int k() {
        return this.j;
    }

    public ww3 l() {
        return this.g;
    }

    public ww3 m() {
        return this.c;
    }

    public int n() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeInt(this.h);
    }

    public a(ww3 ww3Var, ww3 ww3Var2, c cVar, ww3 ww3Var3, int i) {
        Objects.requireNonNull(ww3Var, "start cannot be null");
        Objects.requireNonNull(ww3Var2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.c = ww3Var;
        this.e = ww3Var2;
        this.g = ww3Var3;
        this.h = i;
        this.f = cVar;
        if (ww3Var3 != null && ww3Var.compareTo(ww3Var3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (ww3Var3 != null && ww3Var3.compareTo(ww3Var2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > xs6.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.j = ww3Var.m(ww3Var2) + 1;
        this.i = (ww3Var2.f - ww3Var.f) + 1;
    }
}
