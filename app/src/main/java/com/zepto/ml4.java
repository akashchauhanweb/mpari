package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ml4 implements Parcelable {
    public static final a CREATOR = new a(null);
    private String addpar1;
    private String addpar2;
    private String addpar3;
    private int paramid;
    private int ruleId;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public ml4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ml4(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ml4[] newArray(int i) {
            return new ml4[i];
        }
    }

    public ml4() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ml4(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.ruleId = parcel.readInt();
        this.paramid = parcel.readInt();
        this.addpar1 = parcel.readString();
        this.addpar2 = parcel.readString();
        this.addpar3 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAddpar1() {
        return this.addpar1;
    }

    public final String getAddpar2() {
        return this.addpar2;
    }

    public final String getAddpar3() {
        return this.addpar3;
    }

    public final int getParamid() {
        return this.paramid;
    }

    public final int getRuleId() {
        return this.ruleId;
    }

    public final void setAddpar1(String str) {
        this.addpar1 = str;
    }

    public final void setAddpar2(String str) {
        this.addpar2 = str;
    }

    public final void setAddpar3(String str) {
        this.addpar3 = str;
    }

    public final void setParamid(int i) {
        this.paramid = i;
    }

    public final void setRuleId(int i) {
        this.ruleId = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.ruleId);
        parcel.writeInt(this.paramid);
        parcel.writeString(this.addpar1);
        parcel.writeString(this.addpar2);
        parcel.writeString(this.addpar3);
    }
}
