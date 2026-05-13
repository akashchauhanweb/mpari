package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t93 implements Parcelable {
    public static final Parcelable.Creator<t93> CREATOR = new a();
    public final String c;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t93 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new t93(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t93[] newArray(int i) {
            return new t93[i];
        }
    }

    public t93(String llLicenceNo, String llCovsAbbr, String llEquiCovsAbbrv, String llRefRTOCode, String llIssuedDate, String llValidUpto) {
        Intrinsics.checkNotNullParameter(llLicenceNo, "llLicenceNo");
        Intrinsics.checkNotNullParameter(llCovsAbbr, "llCovsAbbr");
        Intrinsics.checkNotNullParameter(llEquiCovsAbbrv, "llEquiCovsAbbrv");
        Intrinsics.checkNotNullParameter(llRefRTOCode, "llRefRTOCode");
        Intrinsics.checkNotNullParameter(llIssuedDate, "llIssuedDate");
        Intrinsics.checkNotNullParameter(llValidUpto, "llValidUpto");
        this.c = llLicenceNo;
        this.e = llCovsAbbr;
        this.f = llEquiCovsAbbrv;
        this.g = llRefRTOCode;
        this.h = llIssuedDate;
        this.i = llValidUpto;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t93)) {
            return false;
        }
        t93 t93Var = (t93) obj;
        return Intrinsics.areEqual(this.c, t93Var.c) && Intrinsics.areEqual(this.e, t93Var.e) && Intrinsics.areEqual(this.f, t93Var.f) && Intrinsics.areEqual(this.g, t93Var.g) && Intrinsics.areEqual(this.h, t93Var.h) && Intrinsics.areEqual(this.i, t93Var.i);
    }

    public int hashCode() {
        return (((((((((this.c.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public String toString() {
        return "LLRefDetailsModal(llLicenceNo=" + this.c + ", llCovsAbbr=" + this.e + ", llEquiCovsAbbrv=" + this.f + ", llRefRTOCode=" + this.g + ", llIssuedDate=" + this.h + ", llValidUpto=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.c);
        out.writeString(this.e);
        out.writeString(this.f);
        out.writeString(this.g);
        out.writeString(this.h);
        out.writeString(this.i);
    }
}
