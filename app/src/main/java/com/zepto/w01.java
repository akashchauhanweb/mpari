package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w01 implements Parcelable {
    public static final Parcelable.Creator<w01> CREATOR = new a();
    public final int c;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w01 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new w01(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w01[] newArray(int i) {
            return new w01[i];
        }
    }

    public w01(int i, String cov) {
        Intrinsics.checkNotNullParameter(cov, "cov");
        this.c = i;
        this.e = cov;
    }

    public final String c() {
        return this.e;
    }

    public final int d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w01)) {
            return false;
        }
        w01 w01Var = (w01) obj;
        return this.c == w01Var.c && Intrinsics.areEqual(this.e, w01Var.e);
    }

    public int hashCode() {
        return (Integer.hashCode(this.c) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "CovDetailsModal(covCode=" + this.c + ", cov=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.c);
        out.writeString(this.e);
    }
}
