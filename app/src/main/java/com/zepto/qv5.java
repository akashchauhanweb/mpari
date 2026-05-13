package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qv5 implements Parcelable {
    public static final Parcelable.Creator<qv5> CREATOR = new a();
    public final int c;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qv5 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new qv5(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final qv5[] newArray(int i) {
            return new qv5[i];
        }
    }

    public qv5(int i, String selectedcov) {
        Intrinsics.checkNotNullParameter(selectedcov, "selectedcov");
        this.c = i;
        this.e = selectedcov;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv5)) {
            return false;
        }
        qv5 qv5Var = (qv5) obj;
        return this.c == qv5Var.c && Intrinsics.areEqual(this.e, qv5Var.e);
    }

    public int hashCode() {
        return (Integer.hashCode(this.c) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "SelectedCovListModal(selectedCovCode=" + this.c + ", selectedcov=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.c);
        out.writeString(this.e);
    }
}
