package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y96 implements Parcelable {
    public static final a CREATOR = new a(null);
    private String appHashKey;
    private int appId;
    private String appName;
    private String appPackage;
    private String appVersion;
    private int appversionId;
    private int custId;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public y96 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new y96(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public y96[] newArray(int i) {
            return new y96[i];
        }
    }

    public y96() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y96(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.appName = parcel.readString();
        this.appPackage = parcel.readString();
        this.appHashKey = parcel.readString();
        this.appVersion = parcel.readString();
        this.appId = parcel.readInt();
        this.appversionId = parcel.readInt();
        this.custId = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAppHashKey() {
        return this.appHashKey;
    }

    public final int getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppPackage() {
        return this.appPackage;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final int getAppversionId() {
        return this.appversionId;
    }

    public final int getCustId() {
        return this.custId;
    }

    public final void setAppHashKey(String str) {
        this.appHashKey = str;
    }

    public final void setAppId(int i) {
        this.appId = i;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setAppPackage(String str) {
        this.appPackage = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAppversionId(int i) {
        this.appversionId = i;
    }

    public final void setCustId(int i) {
        this.custId = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.appName);
        parcel.writeString(this.appPackage);
        parcel.writeString(this.appHashKey);
        parcel.writeString(this.appVersion);
        parcel.writeInt(this.appId);
        parcel.writeInt(this.appversionId);
        parcel.writeInt(this.custId);
    }
}
