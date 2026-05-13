package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ns4 implements Parcelable {
    public static final a CREATOR = new a(null);
    private String attestationstate;
    private String payLoad;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public ns4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ns4(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ns4[] newArray(int i) {
            return new ns4[i];
        }
    }

    public ns4() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ns4(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.payLoad = parcel.readString();
        this.attestationstate = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAttestationstate() {
        return this.attestationstate;
    }

    public final String getPayLoad() {
        return this.payLoad;
    }

    public final void setAttestationstate(String str) {
        this.attestationstate = str;
    }

    public final void setPayLoad(String str) {
        this.payLoad = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.payLoad);
        parcel.writeString(this.attestationstate);
    }
}
