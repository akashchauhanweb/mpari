package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class if5 implements Parcelable {
    public static final a CREATOR = new a(null);
    private ai adaptiveConfig;
    private String adaptiveFlag;
    private String addparams;
    private List<ml4> addparmsList;
    private int callbackFlag;
    private int channelId;
    private String classname;
    private boolean clearDataFlag;
    private int clientId;
    private String command;
    private int custId;
    private String defaultValue;
    private String forceAccept;
    private int forceCloseTime;
    private String isDeleted;
    private int mapperId;
    private String mdyDate;
    private String methodname;
    private String mobileSessionID;
    private String msg;
    private String parentflag;
    private String permissionStatus;
    private String postStatus;
    private String recommendation;
    private String redirecturl;
    private Boolean response;
    private String result;
    private int ruleRequestId;
    private String ruleaction;
    private int ruleid;
    private Boolean rulesResult;
    private String shortdescription;
    private String skipTimeStamp;
    private String threatDateAndTime;
    private String threatDetectedFlag;
    private String title;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public if5 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new if5(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public if5[] newArray(int i) {
            return new if5[i];
        }
    }

    public if5() {
        Boolean bool = Boolean.FALSE;
        this.response = bool;
        this.rulesResult = bool;
        this.postStatus = "N";
        this.forceCloseTime = 5000;
        this.forceAccept = "N";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ai getAdaptiveConfig() {
        return this.adaptiveConfig;
    }

    public final String getAdaptiveFlag() {
        return this.adaptiveFlag;
    }

    public final String getAddparams() {
        return this.addparams;
    }

    public final List<ml4> getAddparmsList() {
        return this.addparmsList;
    }

    public final int getCallbackFlag() {
        return this.callbackFlag;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final String getClassname() {
        return this.classname;
    }

    public final boolean getClearDataFlag() {
        return this.clearDataFlag;
    }

    public final int getClientId() {
        return this.clientId;
    }

    public final String getCommand() {
        return this.command;
    }

    public final int getCustId() {
        return this.custId;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final String getForceAccept() {
        return this.forceAccept;
    }

    public final int getForceCloseTime() {
        return this.forceCloseTime;
    }

    public final int getMapperId() {
        return this.mapperId;
    }

    public final String getMdyDate() {
        return this.mdyDate;
    }

    public final String getMethodname() {
        return this.methodname;
    }

    public final String getMobileSessionID() {
        return this.mobileSessionID;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getParentflag() {
        return this.parentflag;
    }

    public final String getPermissionStatus() {
        return this.permissionStatus;
    }

    public final String getPostStatus() {
        return this.postStatus;
    }

    public final String getRecommendation() {
        return this.recommendation;
    }

    public final String getRedirecturl() {
        return this.redirecturl;
    }

    public final Boolean getResponse() {
        return this.response;
    }

    public final String getResult() {
        return this.result;
    }

    public final int getRuleRequestId() {
        return this.ruleRequestId;
    }

    public final String getRuleaction() {
        return this.ruleaction;
    }

    public final int getRuleid() {
        return this.ruleid;
    }

    public final Boolean getRulesResult() {
        return this.rulesResult;
    }

    public final String getShortdescription() {
        return this.shortdescription;
    }

    public final String getSkipTimeStamp() {
        return this.skipTimeStamp;
    }

    public final String getThreatDateAndTime() {
        return this.threatDateAndTime;
    }

    public final String getThreatDetectedFlag() {
        return this.threatDetectedFlag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String isDeleted() {
        return this.isDeleted;
    }

    public final void setAdaptiveConfig(ai aiVar) {
        this.adaptiveConfig = aiVar;
    }

    public final void setAdaptiveFlag(String str) {
        this.adaptiveFlag = str;
    }

    public final void setAddparams(String str) {
        this.addparams = str;
    }

    public final void setAddparmsList(List<ml4> list) {
        this.addparmsList = list;
    }

    public final void setCallbackFlag(int i) {
        this.callbackFlag = i;
    }

    public final void setChannelId(int i) {
        this.channelId = i;
    }

    public final void setClassname(String str) {
        this.classname = str;
    }

    public final void setClearDataFlag(boolean z) {
        this.clearDataFlag = z;
    }

    public final void setClientId(int i) {
        this.clientId = i;
    }

    public final void setCommand(String str) {
        this.command = str;
    }

    public final void setCustId(int i) {
        this.custId = i;
    }

    public final void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public final void setDeleted(String str) {
        this.isDeleted = str;
    }

    public final void setForceAccept(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.forceAccept = str;
    }

    public final void setForceCloseTime(int i) {
        this.forceCloseTime = i;
    }

    public final void setMapperId(int i) {
        this.mapperId = i;
    }

    public final void setMdyDate(String str) {
        this.mdyDate = str;
    }

    public final void setMethodname(String str) {
        this.methodname = str;
    }

    public final void setMobileSessionID(String str) {
        this.mobileSessionID = str;
    }

    public final void setMsg(String str) {
        this.msg = str;
    }

    public final void setParentflag(String str) {
        this.parentflag = str;
    }

    public final void setPermissionStatus(String str) {
        this.permissionStatus = str;
    }

    public final void setPostStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postStatus = str;
    }

    public final void setRecommendation(String str) {
        this.recommendation = str;
    }

    public final void setRedirecturl(String str) {
        this.redirecturl = str;
    }

    public final void setResponse(Boolean bool) {
        this.response = bool;
    }

    public final void setResult(String str) {
        this.result = str;
    }

    public final void setRuleRequestId(int i) {
        this.ruleRequestId = i;
    }

    public final void setRuleaction(String str) {
        this.ruleaction = str;
    }

    public final void setRuleid(int i) {
        this.ruleid = i;
    }

    public final void setRulesResult(Boolean bool) {
        this.rulesResult = bool;
    }

    public final void setShortdescription(String str) {
        this.shortdescription = str;
    }

    public final void setSkipTimeStamp(String str) {
        this.skipTimeStamp = str;
    }

    public final void setThreatDateAndTime(String str) {
        this.threatDateAndTime = str;
    }

    public final void setThreatDetectedFlag(String str) {
        this.threatDetectedFlag = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.methodname);
        parcel.writeString(this.classname);
        parcel.writeValue(this.response);
        parcel.writeString(this.title);
        parcel.writeString(this.msg);
        parcel.writeInt(this.ruleid);
        parcel.writeValue(this.rulesResult);
        parcel.writeInt(this.ruleRequestId);
        parcel.writeInt(this.custId);
        parcel.writeInt(this.clientId);
        parcel.writeInt(this.channelId);
        parcel.writeString(this.parentflag);
        parcel.writeString(this.command);
        parcel.writeInt(this.callbackFlag);
        parcel.writeString(this.result);
        parcel.writeString(this.ruleaction);
        parcel.writeInt(this.mapperId);
        parcel.writeString(this.threatDateAndTime);
        parcel.writeString(this.threatDetectedFlag);
        parcel.writeString(this.mobileSessionID);
        parcel.writeString(this.addparams);
        parcel.writeTypedList(this.addparmsList);
        parcel.writeString(this.defaultValue);
        parcel.writeString(this.shortdescription);
        parcel.writeString(this.recommendation);
        parcel.writeString(this.redirecturl);
        parcel.writeString(this.adaptiveFlag);
        parcel.writeParcelable(this.adaptiveConfig, i);
        parcel.writeString(this.skipTimeStamp);
        parcel.writeString(this.postStatus);
        parcel.writeString(this.isDeleted);
        parcel.writeString(this.mdyDate);
        parcel.writeInt(this.forceCloseTime);
        parcel.writeValue(Boolean.valueOf(this.clearDataFlag));
        parcel.writeString(this.permissionStatus);
        parcel.writeString(this.forceAccept);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public if5(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.methodname = parcel.readString();
        this.classname = parcel.readString();
        Class cls = Boolean.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        this.response = value instanceof Boolean ? (Boolean) value : null;
        this.title = parcel.readString();
        this.msg = parcel.readString();
        this.ruleid = parcel.readInt();
        Object value2 = parcel.readValue(cls.getClassLoader());
        this.rulesResult = value2 instanceof Boolean ? (Boolean) value2 : null;
        this.ruleRequestId = parcel.readInt();
        this.custId = parcel.readInt();
        this.clientId = parcel.readInt();
        this.channelId = parcel.readInt();
        this.parentflag = parcel.readString();
        this.command = parcel.readString();
        this.callbackFlag = parcel.readInt();
        this.result = parcel.readString();
        this.ruleaction = parcel.readString();
        this.mapperId = parcel.readInt();
        this.threatDateAndTime = parcel.readString();
        this.threatDetectedFlag = parcel.readString();
        this.mobileSessionID = parcel.readString();
        this.addparams = parcel.readString();
        this.addparmsList = parcel.createTypedArrayList(ml4.CREATOR);
        this.defaultValue = parcel.readString();
        this.shortdescription = parcel.readString();
        this.recommendation = parcel.readString();
        this.redirecturl = parcel.readString();
        this.adaptiveFlag = parcel.readString();
        this.adaptiveConfig = (ai) parcel.readParcelable(ai.class.getClassLoader());
        this.skipTimeStamp = parcel.readString();
        this.postStatus = String.valueOf(parcel.readString());
        this.isDeleted = String.valueOf(parcel.readString());
        this.mdyDate = String.valueOf(parcel.readString());
        this.forceCloseTime = parcel.readInt();
        Object value3 = parcel.readValue(cls.getClassLoader());
        if (value3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        this.clearDataFlag = ((Boolean) value3).booleanValue();
        this.permissionStatus = parcel.readString();
        this.forceAccept = String.valueOf(parcel.readString());
    }
}
