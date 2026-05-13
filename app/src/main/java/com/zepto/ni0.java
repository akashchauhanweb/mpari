package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ni0 implements Parcelable {
    public static final a CREATOR = new a(null);
    private String appname;
    private String apppackage;
    private String baseurl;
    private int chnid;
    private String chnname;
    private int cliid;
    private String cloudprojectnum;
    private String enckey;
    private String environment;
    private String exttrustpublickey;
    private String iv;
    private String lastrulemodified;
    private String licensekey;
    private String os;
    private String password;
    private String publickey;
    private String sslexpirydate;
    private String sslpublickey;
    private String trust;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public ni0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ni0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ni0[] newArray(int i) {
            return new ni0[i];
        }
    }

    public ni0() {
        this.cloudprojectnum = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAppname() {
        return this.appname;
    }

    public final String getApppackage() {
        return this.apppackage;
    }

    public final String getBaseurl() {
        return this.baseurl;
    }

    public final int getChnid() {
        return this.chnid;
    }

    public final String getChnname() {
        return this.chnname;
    }

    public final int getCliid() {
        return this.cliid;
    }

    public final String getCloudprojectnum() {
        return this.cloudprojectnum;
    }

    public final String getEnckey() {
        return this.enckey;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getExttrustpublickey() {
        return this.exttrustpublickey;
    }

    public final String getIv() {
        return this.iv;
    }

    public final String getLastrulemodified() {
        return this.lastrulemodified;
    }

    public final String getLicensekey() {
        return this.licensekey;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPublickey() {
        return this.publickey;
    }

    public final String getSslexpirydate() {
        return this.sslexpirydate;
    }

    public final String getSslpublickey() {
        return this.sslpublickey;
    }

    public final String getTrust() {
        return this.trust;
    }

    public final void setAppname(String str) {
        this.appname = str;
    }

    public final void setApppackage(String str) {
        this.apppackage = str;
    }

    public final void setBaseurl(String str) {
        this.baseurl = str;
    }

    public final void setChnid(int i) {
        this.chnid = i;
    }

    public final void setChnname(String str) {
        this.chnname = str;
    }

    public final void setCliid(int i) {
        this.cliid = i;
    }

    public final void setCloudprojectnum(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cloudprojectnum = str;
    }

    public final void setEnckey(String str) {
        this.enckey = str;
    }

    public final void setEnvironment(String str) {
        this.environment = str;
    }

    public final void setExttrustpublickey(String str) {
        this.exttrustpublickey = str;
    }

    public final void setIv(String str) {
        this.iv = str;
    }

    public final void setLastrulemodified(String str) {
        this.lastrulemodified = str;
    }

    public final void setLicensekey(String str) {
        this.licensekey = str;
    }

    public final void setOs(String str) {
        this.os = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPublickey(String str) {
        this.publickey = str;
    }

    public final void setSslexpirydate(String str) {
        this.sslexpirydate = str;
    }

    public final void setSslpublickey(String str) {
        this.sslpublickey = str;
    }

    public final void setTrust(String str) {
        this.trust = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.chnname);
        parcel.writeString(this.apppackage);
        parcel.writeString(this.licensekey);
        parcel.writeString(this.appname);
        parcel.writeString(this.password);
        parcel.writeString(this.lastrulemodified);
        parcel.writeString(this.trust);
        parcel.writeString(this.os);
        parcel.writeString(this.enckey);
        parcel.writeString(this.iv);
        parcel.writeString(this.baseurl);
        parcel.writeInt(this.cliid);
        parcel.writeInt(this.chnid);
        parcel.writeString(this.publickey);
        parcel.writeString(this.exttrustpublickey);
        parcel.writeString(this.sslexpirydate);
        parcel.writeString(this.cloudprojectnum);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ni0(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.chnname = parcel.readString();
        this.apppackage = parcel.readString();
        this.licensekey = parcel.readString();
        this.appname = parcel.readString();
        this.password = parcel.readString();
        this.lastrulemodified = parcel.readString();
        this.trust = parcel.readString();
        this.os = parcel.readString();
        this.enckey = parcel.readString();
        this.iv = parcel.readString();
        this.baseurl = parcel.readString();
        this.cliid = parcel.readInt();
        this.chnid = parcel.readInt();
        this.publickey = parcel.readString();
        this.exttrustpublickey = parcel.readString();
        this.sslexpirydate = parcel.readString();
        this.cloudprojectnum = String.valueOf(parcel.readString());
    }
}
