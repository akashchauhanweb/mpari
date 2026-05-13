package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 implements Parcelable {
    public static final a CREATOR = new a(null);
    private String appGenId;
    private String appName;
    private String appVersionCode;
    private String appVersionName;
    private int channelId;
    private String channelLicenseKey;
    private int clientId;
    private String custRefId;
    private String deviceId;
    private String deviceType;
    private String mainAppVersionCode;
    private String packageName;
    private String password;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public qq0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new qq0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public qq0[] newArray(int i) {
            return new qq0[i];
        }
    }

    public qq0() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qq0(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.deviceId = parcel.readString();
        this.deviceType = parcel.readString();
        this.appName = parcel.readString();
        this.appVersionCode = parcel.readString();
        this.appGenId = parcel.readString();
        this.packageName = parcel.readString();
        this.channelLicenseKey = parcel.readString();
        this.clientId = parcel.readInt();
        this.channelId = parcel.readInt();
        this.password = parcel.readString();
        this.mainAppVersionCode = parcel.readString();
        this.appVersionName = parcel.readString();
        this.custRefId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAppGenId() {
        return this.appGenId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getAppVersionName() {
        return this.appVersionName;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final String getChannelLicenseKey() {
        return this.channelLicenseKey;
    }

    public final int getClientId() {
        return this.clientId;
    }

    public final String getCustRefId() {
        return this.custRefId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getMainAppVersionCode() {
        return this.mainAppVersionCode;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void setAppGenId(String str) {
        this.appGenId = str;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setAppVersionCode(String str) {
        this.appVersionCode = str;
    }

    public final void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public final void setChannelId(int i) {
        this.channelId = i;
    }

    public final void setChannelLicenseKey(String str) {
        this.channelLicenseKey = str;
    }

    public final void setClientId(int i) {
        this.clientId = i;
    }

    public final void setCustRefId(String str) {
        this.custRefId = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setDeviceType(String str) {
        this.deviceType = str;
    }

    public final void setMainAppVersionCode(String str) {
        this.mainAppVersionCode = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.appName);
        parcel.writeString(this.appVersionCode);
        parcel.writeString(this.appGenId);
        parcel.writeString(this.packageName);
        parcel.writeString(this.channelLicenseKey);
        parcel.writeInt(this.clientId);
        parcel.writeInt(this.channelId);
        parcel.writeString(this.password);
        parcel.writeString(this.mainAppVersionCode);
        parcel.writeString(this.appVersionName);
        parcel.writeString(this.custRefId);
    }
}
