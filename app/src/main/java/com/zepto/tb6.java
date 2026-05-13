package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tb6 implements Parcelable {
    public static final a CREATOR = new a(null);
    public final String c;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public tb6 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new tb6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public tb6[] newArray(int i) {
            return new tb6[i];
        }
    }

    public tb6(String rc, String offCode, String purCode, String stateCode, String chassiNo, String flag, String mobileno) {
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(offCode, "offCode");
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(chassiNo, "chassiNo");
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(mobileno, "mobileno");
        this.c = rc;
        this.e = offCode;
        this.f = purCode;
        this.g = stateCode;
        this.h = chassiNo;
        this.i = flag;
        this.j = mobileno;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb6)) {
            return false;
        }
        tb6 tb6Var = (tb6) obj;
        return Intrinsics.areEqual(this.c, tb6Var.c) && Intrinsics.areEqual(this.e, tb6Var.e) && Intrinsics.areEqual(this.f, tb6Var.f) && Intrinsics.areEqual(this.g, tb6Var.g) && Intrinsics.areEqual(this.h, tb6Var.h) && Intrinsics.areEqual(this.i, tb6Var.i) && Intrinsics.areEqual(this.j, tb6Var.j);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((((this.c.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String i() {
        return this.g;
    }

    public String toString() {
        return "TODataClass(rc=" + this.c + ", offCode=" + this.e + ", purCode=" + this.f + ", stateCode=" + this.g + ", chassiNo=" + this.h + ", flag=" + this.i + ", mobileno=" + this.j + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tb6(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        String str6 = string6 == null ? "" : string6;
        String string7 = parcel.readString();
        this(str, str2, str3, str4, str5, str6, string7 == null ? "" : string7);
    }
}
