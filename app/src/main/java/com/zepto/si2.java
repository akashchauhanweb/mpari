package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class si2 implements Parcelable {
    public static final a CREATOR = new a(null);
    public final String c;
    public final HashMap e;
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
        public si2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new si2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public si2[] newArray(int i) {
            return new si2[i];
        }
    }

    public si2(String rc, HashMap serHashMap, String offCode, String purCode, String stateCode, String chassiNo, String flag) {
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(serHashMap, "serHashMap");
        Intrinsics.checkNotNullParameter(offCode, "offCode");
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(chassiNo, "chassiNo");
        Intrinsics.checkNotNullParameter(flag, "flag");
        this.c = rc;
        this.e = serHashMap;
        this.f = offCode;
        this.g = purCode;
        this.h = stateCode;
        this.i = chassiNo;
        this.j = flag;
    }

    public final String c() {
        return this.i;
    }

    public final String d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si2)) {
            return false;
        }
        si2 si2Var = (si2) obj;
        return Intrinsics.areEqual(this.c, si2Var.c) && Intrinsics.areEqual(this.e, si2Var.e) && Intrinsics.areEqual(this.f, si2Var.f) && Intrinsics.areEqual(this.g, si2Var.g) && Intrinsics.areEqual(this.h, si2Var.h) && Intrinsics.areEqual(this.i, si2Var.i) && Intrinsics.areEqual(this.j, si2Var.j);
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.c;
    }

    public final HashMap h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((this.c.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String i() {
        return this.h;
    }

    public String toString() {
        return "GenrateDataClass(rc=" + this.c + ", serHashMap=" + this.e + ", offCode=" + this.f + ", purCode=" + this.g + ", stateCode=" + this.h + ", chassiNo=" + this.i + ", flag=" + this.j + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeMap(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public si2(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String str = string == null ? "" : string;
        HashMap hashMap = parcel.readHashMap(String.class.getClassLoader());
        Intrinsics.checkNotNull(hashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        this(str, hashMap, str2, str3, str4, str5, string6 == null ? "" : string6);
    }
}
