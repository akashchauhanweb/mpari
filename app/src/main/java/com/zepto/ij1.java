package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ij1 implements Parcelable {
    public static final a CREATOR = new a(null);
    private String basicIntegrity;
    private String deviceIntegrity;
    private String strongIntegrity;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public ij1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ij1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ij1[] newArray(int i) {
            return new ij1[i];
        }
    }

    public ij1() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ij1(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.deviceIntegrity = parcel.readString();
        this.basicIntegrity = parcel.readString();
        this.strongIntegrity = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getBasicIntegrity() {
        return this.basicIntegrity;
    }

    public final String getDeviceIntegrity() {
        return this.deviceIntegrity;
    }

    public final String getStrongIntegrity() {
        return this.strongIntegrity;
    }

    public final void setBasicIntegrity(String str) {
        this.basicIntegrity = str;
    }

    public final void setDeviceIntegrity(String str) {
        this.deviceIntegrity = str;
    }

    public final void setStrongIntegrity(String str) {
        this.strongIntegrity = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.deviceIntegrity);
        parcel.writeString(this.basicIntegrity);
        parcel.writeString(this.strongIntegrity);
    }
}
