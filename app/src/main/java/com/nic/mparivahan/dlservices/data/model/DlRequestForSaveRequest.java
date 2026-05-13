package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016¨\u0006H"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRequestForSaveRequest;", "", "rtoCodeDLTr", "", "dlno", "dob", "applcatgDLserReq", "mobileNumber", "mDlRenewalSerList", "Lcom/nic/mparivahan/dlservices/data/model/DlRenewalSerList;", "eKYCId", "eKYCOpted", "eKYCapplicantPhoto", "eKYCGender", "agentId", "agentPwd", "agentServiceName", "agentIpAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/DlRenewalSerList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getApplcatgDLserReq", "setApplcatgDLserReq", "getDlno", "setDlno", "getDob", "setDob", "getEKYCGender", "setEKYCGender", "getEKYCId", "setEKYCId", "getEKYCOpted", "setEKYCOpted", "getEKYCapplicantPhoto", "setEKYCapplicantPhoto", "getMDlRenewalSerList", "()Lcom/nic/mparivahan/dlservices/data/model/DlRenewalSerList;", "setMDlRenewalSerList", "(Lcom/nic/mparivahan/dlservices/data/model/DlRenewalSerList;)V", "getMobileNumber", "setMobileNumber", "getRtoCodeDLTr", "setRtoCodeDLTr", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRequestForSaveRequest {

    @xy5("agentId")
    private String agentId;

    @xy5("agentIpAddress")
    private String agentIpAddress;

    @xy5("agentPwd")
    private String agentPwd;

    @xy5("agentServiceName")
    private String agentServiceName;

    @xy5("applcatgDLserReq")
    private String applcatgDLserReq;

    @xy5("dlno")
    private String dlno;

    @xy5("dob")
    private String dob;

    @xy5("eKYCGender")
    private String eKYCGender;

    @xy5("eKYCId")
    private String eKYCId;

    @xy5("eKYCOpted")
    private String eKYCOpted;

    @xy5("eKYCapplicantPhoto")
    private String eKYCapplicantPhoto;

    @xy5("selectedDLSerList")
    private DlRenewalSerList mDlRenewalSerList;

    @xy5("mobileNumber")
    private String mobileNumber;

    @xy5("rtoCodeDLTr")
    private String rtoCodeDLTr;

    public DlRequestForSaveRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DlRenewalSerList getMDlRenewalSerList() {
        return this.mDlRenewalSerList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEKYCId() {
        return this.eKYCId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEKYCapplicantPhoto() {
        return this.eKYCapplicantPhoto;
    }

    public final DlRequestForSaveRequest copy(String rtoCodeDLTr, String dlno, String dob, String applcatgDLserReq, String mobileNumber, DlRenewalSerList mDlRenewalSerList, String eKYCId, String eKYCOpted, String eKYCapplicantPhoto, String eKYCGender, String agentId, String agentPwd, String agentServiceName, String agentIpAddress) {
        return new DlRequestForSaveRequest(rtoCodeDLTr, dlno, dob, applcatgDLserReq, mobileNumber, mDlRenewalSerList, eKYCId, eKYCOpted, eKYCapplicantPhoto, eKYCGender, agentId, agentPwd, agentServiceName, agentIpAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlRequestForSaveRequest)) {
            return false;
        }
        DlRequestForSaveRequest dlRequestForSaveRequest = (DlRequestForSaveRequest) other;
        return Intrinsics.areEqual(this.rtoCodeDLTr, dlRequestForSaveRequest.rtoCodeDLTr) && Intrinsics.areEqual(this.dlno, dlRequestForSaveRequest.dlno) && Intrinsics.areEqual(this.dob, dlRequestForSaveRequest.dob) && Intrinsics.areEqual(this.applcatgDLserReq, dlRequestForSaveRequest.applcatgDLserReq) && Intrinsics.areEqual(this.mobileNumber, dlRequestForSaveRequest.mobileNumber) && Intrinsics.areEqual(this.mDlRenewalSerList, dlRequestForSaveRequest.mDlRenewalSerList) && Intrinsics.areEqual(this.eKYCId, dlRequestForSaveRequest.eKYCId) && Intrinsics.areEqual(this.eKYCOpted, dlRequestForSaveRequest.eKYCOpted) && Intrinsics.areEqual(this.eKYCapplicantPhoto, dlRequestForSaveRequest.eKYCapplicantPhoto) && Intrinsics.areEqual(this.eKYCGender, dlRequestForSaveRequest.eKYCGender) && Intrinsics.areEqual(this.agentId, dlRequestForSaveRequest.agentId) && Intrinsics.areEqual(this.agentPwd, dlRequestForSaveRequest.agentPwd) && Intrinsics.areEqual(this.agentServiceName, dlRequestForSaveRequest.agentServiceName) && Intrinsics.areEqual(this.agentIpAddress, dlRequestForSaveRequest.agentIpAddress);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    public final String getEKYCId() {
        return this.eKYCId;
    }

    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    public final String getEKYCapplicantPhoto() {
        return this.eKYCapplicantPhoto;
    }

    public final DlRenewalSerList getMDlRenewalSerList() {
        return this.mDlRenewalSerList;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public int hashCode() {
        String str = this.rtoCodeDLTr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dlno;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dob;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applcatgDLserReq;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mobileNumber;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DlRenewalSerList dlRenewalSerList = this.mDlRenewalSerList;
        int iHashCode6 = (iHashCode5 + (dlRenewalSerList == null ? 0 : dlRenewalSerList.hashCode())) * 31;
        String str6 = this.eKYCId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.eKYCOpted;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eKYCapplicantPhoto;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.eKYCGender;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.agentId;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.agentPwd;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.agentServiceName;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.agentIpAddress;
        return iHashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        this.agentServiceName = str;
    }

    public final void setApplcatgDLserReq(String str) {
        this.applcatgDLserReq = str;
    }

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setEKYCGender(String str) {
        this.eKYCGender = str;
    }

    public final void setEKYCId(String str) {
        this.eKYCId = str;
    }

    public final void setEKYCOpted(String str) {
        this.eKYCOpted = str;
    }

    public final void setEKYCapplicantPhoto(String str) {
        this.eKYCapplicantPhoto = str;
    }

    public final void setMDlRenewalSerList(DlRenewalSerList dlRenewalSerList) {
        this.mDlRenewalSerList = dlRenewalSerList;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public String toString() {
        return "DlRequestForSaveRequest(rtoCodeDLTr=" + this.rtoCodeDLTr + ", dlno=" + this.dlno + ", dob=" + this.dob + ", applcatgDLserReq=" + this.applcatgDLserReq + ", mobileNumber=" + this.mobileNumber + ", mDlRenewalSerList=" + this.mDlRenewalSerList + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ", eKYCGender=" + this.eKYCGender + ", agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentServiceName=" + this.agentServiceName + ", agentIpAddress=" + this.agentIpAddress + ')';
    }

    public DlRequestForSaveRequest(String str, String str2, String str3, String str4, String str5, DlRenewalSerList dlRenewalSerList, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.rtoCodeDLTr = str;
        this.dlno = str2;
        this.dob = str3;
        this.applcatgDLserReq = str4;
        this.mobileNumber = str5;
        this.mDlRenewalSerList = dlRenewalSerList;
        this.eKYCId = str6;
        this.eKYCOpted = str7;
        this.eKYCapplicantPhoto = str8;
        this.eKYCGender = str9;
        this.agentId = str10;
        this.agentPwd = str11;
        this.agentServiceName = str12;
        this.agentIpAddress = str13;
    }

    public /* synthetic */ DlRequestForSaveRequest(String str, String str2, String str3, String str4, String str5, DlRenewalSerList dlRenewalSerList, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : dlRenewalSerList, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str12, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0 ? str13 : null);
    }
}
