package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b implements a.c {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final long c;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public /* synthetic */ b(long j, a aVar) {
        this(j);
    }

    public static b c(long j) {
        return new b(j);
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean a(long j) {
        return j >= this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.c == ((b) obj).c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.c);
    }

    public b(long j) {
        this.c = j;
    }
}
