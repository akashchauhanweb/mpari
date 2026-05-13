package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zi1 implements Parcelable {
    public static final a CREATOR = new a(null);

    @xy5("appGenId")
    private String appGenId;

    @xy5("versionCode")
    private Integer appVersionCode;

    @xy5("buildDateTime")
    private String buildDateTime;

    @x62
    @xy5("checkSum")
    private String checkSum;

    @x62
    @xy5("connectedNetWork")
    private String connectedNetWork;

    @x62
    @xy5("deviceId")
    private String deviceId;

    @x62
    @xy5("deviceModel")
    private String deviceModel;

    @x62
    @xy5("deviceType")
    private String deviceType;

    @x62
    @xy5("geoCode")
    private String geoCode;

    @x62
    @xy5("deviceOs")
    private String os;

    @x62
    @xy5("os")
    private String osCategory;

    @x62
    @xy5("osVersion")
    private String osVersion;

    @x62
    @xy5("rootStatus")
    private String rootStatus;

    @x62
    @xy5("sdkVersionCode")
    private String sdkVersionCode;

    @x62
    @xy5("trust")
    private String trust;

    @x62
    @xy5("wifiMac")
    private String wifiMac;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public zi1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new zi1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public zi1[] newArray(int i) {
            return new zi1[i];
        }
    }

    public zi1() {
        this.appVersionCode = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAppGenId() {
        return this.appGenId;
    }

    public final Integer getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getBuildDateTime() {
        return this.buildDateTime;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final String getConnectedNetWork() {
        return this.connectedNetWork;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getGeoCode() {
        return this.geoCode;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsCategory() {
        return this.osCategory;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getRootStatus() {
        return this.rootStatus;
    }

    public final String getSdkVersionCode() {
        return this.sdkVersionCode;
    }

    public final String getTrust() {
        return this.trust;
    }

    public final String getWifiMac() {
        return this.wifiMac;
    }

    public final void setAppGenId(String str) {
        this.appGenId = str;
    }

    public final void setAppVersionCode(Integer num) {
        this.appVersionCode = num;
    }

    public final void setBuildDateTime(String str) {
        this.buildDateTime = str;
    }

    public final void setCheckSum(String str) {
        this.checkSum = str;
    }

    public final void setConnectedNetWork(String str) {
        this.connectedNetWork = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public final void setDeviceType(String str) {
        this.deviceType = str;
    }

    public final void setGeoCode(String str) {
        this.geoCode = str;
    }

    public final void setOs(String str) {
        this.os = str;
    }

    public final void setOsCategory(String str) {
        this.osCategory = str;
    }

    public final void setOsVersion(String str) {
        this.osVersion = str;
    }

    public final void setRootStatus(String str) {
        this.rootStatus = str;
    }

    public final void setSdkVersionCode(String str) {
        this.sdkVersionCode = str;
    }

    public final void setTrust(String str) {
        this.trust = str;
    }

    public final void setWifiMac(String str) {
        this.wifiMac = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.appVersionCode);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.geoCode);
        parcel.writeString(this.os);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.wifiMac);
        parcel.writeString(this.appGenId);
        parcel.writeString(this.trust);
        parcel.writeString(this.deviceModel);
        parcel.writeString(this.osVersion);
        parcel.writeString(this.sdkVersionCode);
        parcel.writeString(this.buildDateTime);
        parcel.writeString(this.connectedNetWork);
        parcel.writeString(this.checkSum);
        parcel.writeString(this.rootStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zi1(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        this.appVersionCode = value instanceof Integer ? (Integer) value : null;
        this.deviceId = parcel.readString();
        this.geoCode = parcel.readString();
        this.os = parcel.readString();
        this.deviceType = parcel.readString();
        this.wifiMac = parcel.readString();
        this.appGenId = parcel.readString();
        this.trust = parcel.readString();
        this.deviceModel = parcel.readString();
        this.osVersion = parcel.readString();
        this.sdkVersionCode = parcel.readString();
        this.buildDateTime = parcel.readString();
        this.connectedNetWork = parcel.readString();
        this.checkSum = parcel.readString();
        this.rootStatus = parcel.readString();
    }
}
