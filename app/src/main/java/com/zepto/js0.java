package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class js0 implements Parcelable {
    public static final a CREATOR = new a(null);

    @xy5("jwtRequest")
    private k33 JwtRequest;

    @xy5("action_type")
    private String actionType;

    @x62
    @xy5("androidId")
    private String androidId;

    @xy5("appId")
    private String appId;

    @x62
    @xy5("app")
    private String appName;

    @xy5("appVersion")
    private String appVersion;

    @xy5("versionCode")
    private int appVersionCode;

    @xy5("appVersionName")
    private String appVersionName;

    @xy5("architecture")
    private String architecture;

    @x62
    @xy5("bluetoothMac")
    private String bluetoothMac;

    @xy5("buildTime")
    private String buildTime;

    @xy5("capability")
    private String capabaility;

    @xy5("channelId")
    private int channelId;

    @xy5("clientInfo")
    private qq0 clientInfoHandshake;

    @xy5("clientType")
    private String clientType;

    @xy5("custId")
    private int custId;

    @xy5("deviceInfo")
    private zi1 deviceDetails;

    @x62
    @xy5("dId")
    private String deviceId;

    @x62
    @xy5("deviceType")
    private String deviceType;

    @x62
    @xy5("geocode")
    private String geoCode;

    @xy5("hashTrust")
    private String hashTrust;

    @xy5("imeiOne")
    private String imeiOne;

    @xy5("imeiTwo")
    private String imeiTwo;

    @xy5("installationDetails")
    private String installationDetails;

    @xy5("intent_url")
    private String intentUrl;

    @x62
    @xy5("ip")
    private String ip;

    @xy5("device_digest_message")
    private String jwsSafetynetResponse;

    @xy5("lastCommit")
    private String lastCommit;

    @xy5("lastRuleModify")
    private String lastRuleModify;

    @xy5("lastRuleModifyMobReq")
    private String lastRuleModifyMobReq;

    @x62
    @xy5("location")
    private String location;

    @xy5("mobileSessionDtls")
    private List<jz5> mobileSessionDetails;

    @x62
    @xy5("os")
    private String os;

    @xy5("props")
    private String props;

    @xy5("requestInfo")
    private qc5 requestInfo;

    @xy5("requestType")
    private String requestType;

    @xy5("ruleConfigDTO")
    private List<if5> ruleConfigDTO;

    @xy5("ruleInfo")
    private if5 ruleInfo;

    @xy5("rulechain")
    private int rulechain;

    @xy5("safetyNetDTO")
    private ns4 safetyNetDTO;

    @xy5("sdkVersion")
    private String sdkVersion;

    @xy5("server_token")
    private String serverToken;

    @xy5("applist")
    private List<y96> systemAppInfoList;

    @xy5("testTrust")
    private String testTrust;

    @xy5("vbsFlag")
    private String vbsFlag;

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
        public js0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new js0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public js0[] newArray(int i) {
            return new js0[i];
        }
    }

    public js0() {
        this.lastCommit = "";
        this.buildTime = "";
        this.sdkVersion = "";
        this.hashTrust = "";
        this.installationDetails = "";
        this.appVersion = "";
        this.architecture = "";
        this.testTrust = "";
        this.vbsFlag = "";
        this.props = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final String getAndroidId() {
        return this.androidId;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final int getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getAppVersionName() {
        return this.appVersionName;
    }

    public final String getArchitecture() {
        return this.architecture;
    }

    public final String getBluetoothMac() {
        return this.bluetoothMac;
    }

    public final String getBuildTime() {
        return this.buildTime;
    }

    public final String getCapabaility() {
        return this.capabaility;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final qq0 getClientInfoHandshake() {
        return this.clientInfoHandshake;
    }

    public final String getClientType() {
        return this.clientType;
    }

    public final int getCustId() {
        return this.custId;
    }

    public final zi1 getDeviceDetails() {
        return this.deviceDetails;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getGeoCode() {
        return this.geoCode;
    }

    public final String getHashTrust() {
        return this.hashTrust;
    }

    public final String getImeiOne() {
        return this.imeiOne;
    }

    public final String getImeiTwo() {
        return this.imeiTwo;
    }

    public final String getInstallationDetails() {
        return this.installationDetails;
    }

    public final String getIntentUrl() {
        return this.intentUrl;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getJwsSafetynetResponse() {
        return this.jwsSafetynetResponse;
    }

    public final k33 getJwtRequest() {
        return this.JwtRequest;
    }

    public final String getLastCommit() {
        return this.lastCommit;
    }

    public final String getLastRuleModify() {
        return this.lastRuleModify;
    }

    public final String getLastRuleModifyMobReq() {
        return this.lastRuleModifyMobReq;
    }

    public final String getLocation() {
        return this.location;
    }

    public final List<jz5> getMobileSessionDetails() {
        return this.mobileSessionDetails;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getProps() {
        return this.props;
    }

    public final qc5 getRequestInfo() {
        return this.requestInfo;
    }

    public final String getRequestType() {
        return this.requestType;
    }

    public final List<if5> getRuleConfigDTO() {
        return this.ruleConfigDTO;
    }

    public final if5 getRuleInfo() {
        return this.ruleInfo;
    }

    public final int getRulechain() {
        return this.rulechain;
    }

    public final ns4 getSafetyNetDTO() {
        return this.safetyNetDTO;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getServerToken() {
        return this.serverToken;
    }

    public final List<y96> getSystemAppInfoList() {
        return this.systemAppInfoList;
    }

    public final String getTestTrust() {
        return this.testTrust;
    }

    public final String getVbsFlag() {
        return this.vbsFlag;
    }

    public final String getWifiMac() {
        return this.wifiMac;
    }

    public final void setActionType(String str) {
        this.actionType = str;
    }

    public final void setAndroidId(String str) {
        this.androidId = str;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setAppVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public final void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public final void setArchitecture(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.architecture = str;
    }

    public final void setBluetoothMac(String str) {
        this.bluetoothMac = str;
    }

    public final void setBuildTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buildTime = str;
    }

    public final void setCapabaility(String str) {
        this.capabaility = str;
    }

    public final void setChannelId(int i) {
        this.channelId = i;
    }

    public final void setClientInfoHandshake(qq0 qq0Var) {
        this.clientInfoHandshake = qq0Var;
    }

    public final void setClientType(String str) {
        this.clientType = str;
    }

    public final void setCustId(int i) {
        this.custId = i;
    }

    public final void setDeviceDetails(zi1 zi1Var) {
        this.deviceDetails = zi1Var;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setDeviceType(String str) {
        this.deviceType = str;
    }

    public final void setGeoCode(String str) {
        this.geoCode = str;
    }

    public final void setHashTrust(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hashTrust = str;
    }

    public final void setImeiOne(String str) {
        this.imeiOne = str;
    }

    public final void setImeiTwo(String str) {
        this.imeiTwo = str;
    }

    public final void setInstallationDetails(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.installationDetails = str;
    }

    public final void setIntentUrl(String str) {
        this.intentUrl = str;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setJwsSafetynetResponse(String str) {
        this.jwsSafetynetResponse = str;
    }

    public final void setJwtRequest(k33 k33Var) {
        this.JwtRequest = k33Var;
    }

    public final void setLastCommit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastCommit = str;
    }

    public final void setLastRuleModify(String str) {
        this.lastRuleModify = str;
    }

    public final void setLastRuleModifyMobReq(String str) {
        this.lastRuleModifyMobReq = str;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public final void setMobileSessionDetails(List<jz5> list) {
        this.mobileSessionDetails = list;
    }

    public final void setOs(String str) {
        this.os = str;
    }

    public final void setProps(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.props = str;
    }

    public final void setRequestInfo(qc5 qc5Var) {
        this.requestInfo = qc5Var;
    }

    public final void setRequestType(String str) {
        this.requestType = str;
    }

    public final void setRuleConfigDTO(List<if5> list) {
        this.ruleConfigDTO = list;
    }

    public final void setRuleInfo(if5 if5Var) {
        this.ruleInfo = if5Var;
    }

    public final void setRulechain(int i) {
        this.rulechain = i;
    }

    public final void setSafetyNetDTO(ns4 ns4Var) {
        this.safetyNetDTO = ns4Var;
    }

    public final void setSdkVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sdkVersion = str;
    }

    public final void setServerToken(String str) {
        this.serverToken = str;
    }

    public final void setSystemAppInfoList(List<y96> list) {
        this.systemAppInfoList = list;
    }

    public final void setTestTrust(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.testTrust = str;
    }

    public final void setVbsFlag(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vbsFlag = str;
    }

    public final void setWifiMac(String str) {
        this.wifiMac = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.clientInfoHandshake, i);
        parcel.writeParcelable(this.requestInfo, i);
        parcel.writeParcelable(this.deviceDetails, i);
        parcel.writeTypedList(this.systemAppInfoList);
        parcel.writeTypedList(this.ruleConfigDTO);
        parcel.writeString(this.requestType);
        parcel.writeString(this.jwsSafetynetResponse);
        parcel.writeInt(this.appVersionCode);
        parcel.writeInt(this.custId);
        parcel.writeString(this.serverToken);
        parcel.writeString(this.imeiOne);
        parcel.writeString(this.imeiTwo);
        parcel.writeString(this.capabaility);
        parcel.writeString(this.appId);
        parcel.writeString(this.clientType);
        parcel.writeString(this.appVersionName);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.geoCode);
        parcel.writeString(this.location);
        parcel.writeString(this.ip);
        parcel.writeString(this.os);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.appName);
        parcel.writeString(this.androidId);
        parcel.writeString(this.bluetoothMac);
        parcel.writeString(this.wifiMac);
        parcel.writeString(this.actionType);
        parcel.writeString(this.intentUrl);
        parcel.writeString(this.lastRuleModify);
        parcel.writeString(this.lastRuleModifyMobReq);
        parcel.writeInt(this.channelId);
        parcel.writeInt(this.channelId);
        parcel.writeString(this.lastCommit);
        parcel.writeString(this.buildTime);
        parcel.writeString(this.sdkVersion);
        parcel.writeString(this.hashTrust);
        parcel.writeString(this.appVersion);
        parcel.writeString(this.architecture);
        parcel.writeString(this.testTrust);
        parcel.writeString(this.vbsFlag);
        parcel.writeString(this.props);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public js0(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.clientInfoHandshake = (qq0) parcel.readParcelable(qq0.class.getClassLoader());
        this.requestInfo = (qc5) parcel.readParcelable(qc5.class.getClassLoader());
        this.deviceDetails = (zi1) parcel.readParcelable(zi1.class.getClassLoader());
        this.systemAppInfoList = parcel.createTypedArrayList(y96.CREATOR);
        this.ruleConfigDTO = parcel.createTypedArrayList(if5.CREATOR);
        this.requestType = parcel.readString();
        this.jwsSafetynetResponse = parcel.readString();
        this.appVersionCode = parcel.readInt();
        this.custId = parcel.readInt();
        this.serverToken = parcel.readString();
        this.imeiOne = parcel.readString();
        this.imeiTwo = parcel.readString();
        this.capabaility = parcel.readString();
        this.appId = parcel.readString();
        this.clientType = parcel.readString();
        this.appVersionName = parcel.readString();
        this.deviceId = parcel.readString();
        this.geoCode = parcel.readString();
        this.location = parcel.readString();
        this.ip = parcel.readString();
        this.os = parcel.readString();
        this.deviceType = parcel.readString();
        this.appName = parcel.readString();
        this.androidId = parcel.readString();
        this.bluetoothMac = parcel.readString();
        this.wifiMac = parcel.readString();
        this.actionType = parcel.readString();
        this.intentUrl = parcel.readString();
        this.channelId = parcel.readInt();
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNullExpressionValue(string, "parcel.readString()!!");
        this.lastCommit = string;
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNullExpressionValue(string2, "parcel.readString()!!");
        this.buildTime = string2;
        String string3 = parcel.readString();
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNullExpressionValue(string3, "parcel.readString()!!");
        this.sdkVersion = string3;
        String string4 = parcel.readString();
        Intrinsics.checkNotNull(string4);
        Intrinsics.checkNotNullExpressionValue(string4, "parcel.readString()!!");
        this.hashTrust = string4;
        String string5 = parcel.readString();
        Intrinsics.checkNotNull(string5);
        Intrinsics.checkNotNullExpressionValue(string5, "parcel.readString()!!");
        this.appVersion = string5;
        String string6 = parcel.readString();
        Intrinsics.checkNotNull(string6);
        Intrinsics.checkNotNullExpressionValue(string6, "parcel.readString()!!");
        this.architecture = string6;
        String string7 = parcel.readString();
        Intrinsics.checkNotNull(string7);
        Intrinsics.checkNotNullExpressionValue(string7, "parcel.readString()!!");
        this.testTrust = string7;
        String string8 = parcel.readString();
        Intrinsics.checkNotNull(string8);
        Intrinsics.checkNotNullExpressionValue(string8, "parcel.readString()!!");
        this.vbsFlag = string8;
        String string9 = parcel.readString();
        Intrinsics.checkNotNull(string9);
        Intrinsics.checkNotNullExpressionValue(string9, "parcel.readString()!!");
        this.props = string9;
    }
}
