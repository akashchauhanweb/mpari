package com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¾\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\bHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015¨\u0006>"}, d2 = {"Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "Ljava/io/Serializable;", "allotmentOffice", "", "applNo", "authrizationUpto", "entryStatus", "flowSrno", "", "ipAddress", "officeCode", "previousAuthrizationFrom", "previousAuthrizationNo", "previousAuthrizationUpto", "previousIssueDate", "previousPermitNo", "purposeCode", "regnNo", "stateCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAllotmentOffice", "()Ljava/lang/String;", "getApplNo", "getAuthrizationUpto", "getEntryStatus", "getFlowSrno", "()I", "getIpAddress", "getOfficeCode", "getPreviousAuthrizationFrom", "getPreviousAuthrizationNo", "getPreviousAuthrizationUpto", "getPreviousIssueDate", "getPreviousPermitNo", "getPurposeCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegnNo", "getStateCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String allotmentOffice;
    private final String applNo;
    private final String authrizationUpto;
    private final String entryStatus;
    private final int flowSrno;
    private final String ipAddress;
    private final int officeCode;
    private final String previousAuthrizationFrom;
    private final String previousAuthrizationNo;
    private final String previousAuthrizationUpto;
    private final String previousIssueDate;
    private final String previousPermitNo;
    private final Integer purposeCode;
    private final String regnNo;
    private final String stateCode;

    public Data(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12) {
        this.allotmentOffice = str;
        this.applNo = str2;
        this.authrizationUpto = str3;
        this.entryStatus = str4;
        this.flowSrno = i;
        this.ipAddress = str5;
        this.officeCode = i2;
        this.previousAuthrizationFrom = str6;
        this.previousAuthrizationNo = str7;
        this.previousAuthrizationUpto = str8;
        this.previousIssueDate = str9;
        this.previousPermitNo = str10;
        this.purposeCode = num;
        this.regnNo = str11;
        this.stateCode = str12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPreviousAuthrizationUpto() {
        return this.previousAuthrizationUpto;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPreviousIssueDate() {
        return this.previousIssueDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPreviousPermitNo() {
        return this.previousPermitNo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthrizationUpto() {
        return this.authrizationUpto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntryStatus() {
        return this.entryStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFlowSrno() {
        return this.flowSrno;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPreviousAuthrizationFrom() {
        return this.previousAuthrizationFrom;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPreviousAuthrizationNo() {
        return this.previousAuthrizationNo;
    }

    public final Data copy(String allotmentOffice, String applNo, String authrizationUpto, String entryStatus, int flowSrno, String ipAddress, int officeCode, String previousAuthrizationFrom, String previousAuthrizationNo, String previousAuthrizationUpto, String previousIssueDate, String previousPermitNo, Integer purposeCode, String regnNo, String stateCode) {
        return new Data(allotmentOffice, applNo, authrizationUpto, entryStatus, flowSrno, ipAddress, officeCode, previousAuthrizationFrom, previousAuthrizationNo, previousAuthrizationUpto, previousIssueDate, previousPermitNo, purposeCode, regnNo, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.allotmentOffice, data.allotmentOffice) && Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.authrizationUpto, data.authrizationUpto) && Intrinsics.areEqual(this.entryStatus, data.entryStatus) && this.flowSrno == data.flowSrno && Intrinsics.areEqual(this.ipAddress, data.ipAddress) && this.officeCode == data.officeCode && Intrinsics.areEqual(this.previousAuthrizationFrom, data.previousAuthrizationFrom) && Intrinsics.areEqual(this.previousAuthrizationNo, data.previousAuthrizationNo) && Intrinsics.areEqual(this.previousAuthrizationUpto, data.previousAuthrizationUpto) && Intrinsics.areEqual(this.previousIssueDate, data.previousIssueDate) && Intrinsics.areEqual(this.previousPermitNo, data.previousPermitNo) && Intrinsics.areEqual(this.purposeCode, data.purposeCode) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.stateCode, data.stateCode);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthrizationUpto() {
        return this.authrizationUpto;
    }

    public final String getEntryStatus() {
        return this.entryStatus;
    }

    public final int getFlowSrno() {
        return this.flowSrno;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getPreviousAuthrizationFrom() {
        return this.previousAuthrizationFrom;
    }

    public final String getPreviousAuthrizationNo() {
        return this.previousAuthrizationNo;
    }

    public final String getPreviousAuthrizationUpto() {
        return this.previousAuthrizationUpto;
    }

    public final String getPreviousIssueDate() {
        return this.previousIssueDate;
    }

    public final String getPreviousPermitNo() {
        return this.previousPermitNo;
    }

    public final Integer getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.allotmentOffice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authrizationUpto;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entryStatus;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.flowSrno)) * 31;
        String str5 = this.ipAddress;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str6 = this.previousAuthrizationFrom;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.previousAuthrizationNo;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.previousAuthrizationUpto;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.previousIssueDate;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.previousPermitNo;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.purposeCode;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.regnNo;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.stateCode;
        return iHashCode12 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", authrizationUpto=" + this.authrizationUpto + ", entryStatus=" + this.entryStatus + ", flowSrno=" + this.flowSrno + ", ipAddress=" + this.ipAddress + ", officeCode=" + this.officeCode + ", previousAuthrizationFrom=" + this.previousAuthrizationFrom + ", previousAuthrizationNo=" + this.previousAuthrizationNo + ", previousAuthrizationUpto=" + this.previousAuthrizationUpto + ", previousIssueDate=" + this.previousIssueDate + ", previousPermitNo=" + this.previousPermitNo + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
