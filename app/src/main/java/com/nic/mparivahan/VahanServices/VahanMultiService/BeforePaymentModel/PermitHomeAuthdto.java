package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\bHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006;"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/PermitHomeAuthdto;", "Ljava/io/Serializable;", "allotmentOffice", "", "applNo", "authrizationUpto", "entryStatus", "flowSrno", "", "ipAddress", "officeCode", "previousAuthrizationFrom", "previousAuthrizationNo", "previousAuthrizationUpto", "previousIssueDate", "previousPermitNo", "purposeCode", "regnNo", "stateCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAllotmentOffice", "()Ljava/lang/String;", "getApplNo", "getAuthrizationUpto", "getEntryStatus", "getFlowSrno", "()I", "getIpAddress", "getOfficeCode", "getPreviousAuthrizationFrom", "getPreviousAuthrizationNo", "getPreviousAuthrizationUpto", "getPreviousIssueDate", "getPreviousPermitNo", "getPurposeCode", "getRegnNo", "getStateCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermitHomeAuthdto implements Serializable {
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
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public PermitHomeAuthdto(String allotmentOffice, String applNo, String authrizationUpto, String entryStatus, int i, String ipAddress, int i2, String previousAuthrizationFrom, String previousAuthrizationNo, String previousAuthrizationUpto, String previousIssueDate, String previousPermitNo, int i3, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(allotmentOffice, "allotmentOffice");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authrizationUpto, "authrizationUpto");
        Intrinsics.checkNotNullParameter(entryStatus, "entryStatus");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(previousAuthrizationFrom, "previousAuthrizationFrom");
        Intrinsics.checkNotNullParameter(previousAuthrizationNo, "previousAuthrizationNo");
        Intrinsics.checkNotNullParameter(previousAuthrizationUpto, "previousAuthrizationUpto");
        Intrinsics.checkNotNullParameter(previousIssueDate, "previousIssueDate");
        Intrinsics.checkNotNullParameter(previousPermitNo, "previousPermitNo");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.allotmentOffice = allotmentOffice;
        this.applNo = applNo;
        this.authrizationUpto = authrizationUpto;
        this.entryStatus = entryStatus;
        this.flowSrno = i;
        this.ipAddress = ipAddress;
        this.officeCode = i2;
        this.previousAuthrizationFrom = previousAuthrizationFrom;
        this.previousAuthrizationNo = previousAuthrizationNo;
        this.previousAuthrizationUpto = previousAuthrizationUpto;
        this.previousIssueDate = previousIssueDate;
        this.previousPermitNo = previousPermitNo;
        this.purposeCode = i3;
        this.regnNo = regnNo;
        this.stateCode = stateCode;
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
    public final int getPurposeCode() {
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

    public final PermitHomeAuthdto copy(String allotmentOffice, String applNo, String authrizationUpto, String entryStatus, int flowSrno, String ipAddress, int officeCode, String previousAuthrizationFrom, String previousAuthrizationNo, String previousAuthrizationUpto, String previousIssueDate, String previousPermitNo, int purposeCode, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(allotmentOffice, "allotmentOffice");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authrizationUpto, "authrizationUpto");
        Intrinsics.checkNotNullParameter(entryStatus, "entryStatus");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(previousAuthrizationFrom, "previousAuthrizationFrom");
        Intrinsics.checkNotNullParameter(previousAuthrizationNo, "previousAuthrizationNo");
        Intrinsics.checkNotNullParameter(previousAuthrizationUpto, "previousAuthrizationUpto");
        Intrinsics.checkNotNullParameter(previousIssueDate, "previousIssueDate");
        Intrinsics.checkNotNullParameter(previousPermitNo, "previousPermitNo");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new PermitHomeAuthdto(allotmentOffice, applNo, authrizationUpto, entryStatus, flowSrno, ipAddress, officeCode, previousAuthrizationFrom, previousAuthrizationNo, previousAuthrizationUpto, previousIssueDate, previousPermitNo, purposeCode, regnNo, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermitHomeAuthdto)) {
            return false;
        }
        PermitHomeAuthdto permitHomeAuthdto = (PermitHomeAuthdto) other;
        return Intrinsics.areEqual(this.allotmentOffice, permitHomeAuthdto.allotmentOffice) && Intrinsics.areEqual(this.applNo, permitHomeAuthdto.applNo) && Intrinsics.areEqual(this.authrizationUpto, permitHomeAuthdto.authrizationUpto) && Intrinsics.areEqual(this.entryStatus, permitHomeAuthdto.entryStatus) && this.flowSrno == permitHomeAuthdto.flowSrno && Intrinsics.areEqual(this.ipAddress, permitHomeAuthdto.ipAddress) && this.officeCode == permitHomeAuthdto.officeCode && Intrinsics.areEqual(this.previousAuthrizationFrom, permitHomeAuthdto.previousAuthrizationFrom) && Intrinsics.areEqual(this.previousAuthrizationNo, permitHomeAuthdto.previousAuthrizationNo) && Intrinsics.areEqual(this.previousAuthrizationUpto, permitHomeAuthdto.previousAuthrizationUpto) && Intrinsics.areEqual(this.previousIssueDate, permitHomeAuthdto.previousIssueDate) && Intrinsics.areEqual(this.previousPermitNo, permitHomeAuthdto.previousPermitNo) && this.purposeCode == permitHomeAuthdto.purposeCode && Intrinsics.areEqual(this.regnNo, permitHomeAuthdto.regnNo) && Intrinsics.areEqual(this.stateCode, permitHomeAuthdto.stateCode);
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

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.allotmentOffice.hashCode() * 31) + this.applNo.hashCode()) * 31) + this.authrizationUpto.hashCode()) * 31) + this.entryStatus.hashCode()) * 31) + Integer.hashCode(this.flowSrno)) * 31) + this.ipAddress.hashCode()) * 31) + Integer.hashCode(this.officeCode)) * 31) + this.previousAuthrizationFrom.hashCode()) * 31) + this.previousAuthrizationNo.hashCode()) * 31) + this.previousAuthrizationUpto.hashCode()) * 31) + this.previousIssueDate.hashCode()) * 31) + this.previousPermitNo.hashCode()) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "PermitHomeAuthdto(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", authrizationUpto=" + this.authrizationUpto + ", entryStatus=" + this.entryStatus + ", flowSrno=" + this.flowSrno + ", ipAddress=" + this.ipAddress + ", officeCode=" + this.officeCode + ", previousAuthrizationFrom=" + this.previousAuthrizationFrom + ", previousAuthrizationNo=" + this.previousAuthrizationNo + ", previousAuthrizationUpto=" + this.previousAuthrizationUpto + ", previousIssueDate=" + this.previousIssueDate + ", previousPermitNo=" + this.previousPermitNo + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
