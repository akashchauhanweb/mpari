package com.nic.mparivahan.FetchChallanLog.PojoChallan;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J©\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\nHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017¨\u0006?"}, d2 = {"Lcom/nic/mparivahan/FetchChallanLog/PojoChallan/MparEchallanLog;", "", "challanAmt", "", "echlogChallanDate", "echlogChallanStatus", "echlogCreatedAt", "echlogCtzId", "", "echlogDeptCd", "", "echlogDocNumber", "echlogDocType", "echlogMobileNo", "echlogPaymentDate", "echlogReceiptNo", "echlogRecordId", "echlogRtoCd", "echlogStateCd", "echlogTransId", "echlogchallannumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallanAmt", "()Ljava/lang/String;", "getEchlogChallanDate", "getEchlogChallanStatus", "getEchlogCreatedAt", "getEchlogCtzId", "()J", "getEchlogDeptCd", "()I", "getEchlogDocNumber", "getEchlogDocType", "getEchlogMobileNo", "getEchlogPaymentDate", "getEchlogReceiptNo", "getEchlogRecordId", "getEchlogRtoCd", "getEchlogStateCd", "getEchlogTransId", "getEchlogchallannumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MparEchallanLog {
    private final String challanAmt;
    private final String echlogChallanDate;
    private final String echlogChallanStatus;
    private final String echlogCreatedAt;
    private final long echlogCtzId;
    private final int echlogDeptCd;
    private final String echlogDocNumber;
    private final String echlogDocType;
    private final String echlogMobileNo;
    private final String echlogPaymentDate;
    private final String echlogReceiptNo;
    private final int echlogRecordId;
    private final int echlogRtoCd;
    private final String echlogStateCd;
    private final String echlogTransId;
    private final String echlogchallannumber;

    public MparEchallanLog(String challanAmt, String echlogChallanDate, String echlogChallanStatus, String echlogCreatedAt, long j, int i, String echlogDocNumber, String echlogDocType, String echlogMobileNo, String echlogPaymentDate, String echlogReceiptNo, int i2, int i3, String echlogStateCd, String echlogTransId, String echlogchallannumber) {
        Intrinsics.checkNotNullParameter(challanAmt, "challanAmt");
        Intrinsics.checkNotNullParameter(echlogChallanDate, "echlogChallanDate");
        Intrinsics.checkNotNullParameter(echlogChallanStatus, "echlogChallanStatus");
        Intrinsics.checkNotNullParameter(echlogCreatedAt, "echlogCreatedAt");
        Intrinsics.checkNotNullParameter(echlogDocNumber, "echlogDocNumber");
        Intrinsics.checkNotNullParameter(echlogDocType, "echlogDocType");
        Intrinsics.checkNotNullParameter(echlogMobileNo, "echlogMobileNo");
        Intrinsics.checkNotNullParameter(echlogPaymentDate, "echlogPaymentDate");
        Intrinsics.checkNotNullParameter(echlogReceiptNo, "echlogReceiptNo");
        Intrinsics.checkNotNullParameter(echlogStateCd, "echlogStateCd");
        Intrinsics.checkNotNullParameter(echlogTransId, "echlogTransId");
        Intrinsics.checkNotNullParameter(echlogchallannumber, "echlogchallannumber");
        this.challanAmt = challanAmt;
        this.echlogChallanDate = echlogChallanDate;
        this.echlogChallanStatus = echlogChallanStatus;
        this.echlogCreatedAt = echlogCreatedAt;
        this.echlogCtzId = j;
        this.echlogDeptCd = i;
        this.echlogDocNumber = echlogDocNumber;
        this.echlogDocType = echlogDocType;
        this.echlogMobileNo = echlogMobileNo;
        this.echlogPaymentDate = echlogPaymentDate;
        this.echlogReceiptNo = echlogReceiptNo;
        this.echlogRecordId = i2;
        this.echlogRtoCd = i3;
        this.echlogStateCd = echlogStateCd;
        this.echlogTransId = echlogTransId;
        this.echlogchallannumber = echlogchallannumber;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallanAmt() {
        return this.challanAmt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEchlogPaymentDate() {
        return this.echlogPaymentDate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEchlogReceiptNo() {
        return this.echlogReceiptNo;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getEchlogRecordId() {
        return this.echlogRecordId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getEchlogRtoCd() {
        return this.echlogRtoCd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getEchlogStateCd() {
        return this.echlogStateCd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getEchlogTransId() {
        return this.echlogTransId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getEchlogchallannumber() {
        return this.echlogchallannumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEchlogChallanDate() {
        return this.echlogChallanDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEchlogChallanStatus() {
        return this.echlogChallanStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEchlogCreatedAt() {
        return this.echlogCreatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getEchlogCtzId() {
        return this.echlogCtzId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getEchlogDeptCd() {
        return this.echlogDeptCd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEchlogDocNumber() {
        return this.echlogDocNumber;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEchlogDocType() {
        return this.echlogDocType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEchlogMobileNo() {
        return this.echlogMobileNo;
    }

    public final MparEchallanLog copy(String challanAmt, String echlogChallanDate, String echlogChallanStatus, String echlogCreatedAt, long echlogCtzId, int echlogDeptCd, String echlogDocNumber, String echlogDocType, String echlogMobileNo, String echlogPaymentDate, String echlogReceiptNo, int echlogRecordId, int echlogRtoCd, String echlogStateCd, String echlogTransId, String echlogchallannumber) {
        Intrinsics.checkNotNullParameter(challanAmt, "challanAmt");
        Intrinsics.checkNotNullParameter(echlogChallanDate, "echlogChallanDate");
        Intrinsics.checkNotNullParameter(echlogChallanStatus, "echlogChallanStatus");
        Intrinsics.checkNotNullParameter(echlogCreatedAt, "echlogCreatedAt");
        Intrinsics.checkNotNullParameter(echlogDocNumber, "echlogDocNumber");
        Intrinsics.checkNotNullParameter(echlogDocType, "echlogDocType");
        Intrinsics.checkNotNullParameter(echlogMobileNo, "echlogMobileNo");
        Intrinsics.checkNotNullParameter(echlogPaymentDate, "echlogPaymentDate");
        Intrinsics.checkNotNullParameter(echlogReceiptNo, "echlogReceiptNo");
        Intrinsics.checkNotNullParameter(echlogStateCd, "echlogStateCd");
        Intrinsics.checkNotNullParameter(echlogTransId, "echlogTransId");
        Intrinsics.checkNotNullParameter(echlogchallannumber, "echlogchallannumber");
        return new MparEchallanLog(challanAmt, echlogChallanDate, echlogChallanStatus, echlogCreatedAt, echlogCtzId, echlogDeptCd, echlogDocNumber, echlogDocType, echlogMobileNo, echlogPaymentDate, echlogReceiptNo, echlogRecordId, echlogRtoCd, echlogStateCd, echlogTransId, echlogchallannumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MparEchallanLog)) {
            return false;
        }
        MparEchallanLog mparEchallanLog = (MparEchallanLog) other;
        return Intrinsics.areEqual(this.challanAmt, mparEchallanLog.challanAmt) && Intrinsics.areEqual(this.echlogChallanDate, mparEchallanLog.echlogChallanDate) && Intrinsics.areEqual(this.echlogChallanStatus, mparEchallanLog.echlogChallanStatus) && Intrinsics.areEqual(this.echlogCreatedAt, mparEchallanLog.echlogCreatedAt) && this.echlogCtzId == mparEchallanLog.echlogCtzId && this.echlogDeptCd == mparEchallanLog.echlogDeptCd && Intrinsics.areEqual(this.echlogDocNumber, mparEchallanLog.echlogDocNumber) && Intrinsics.areEqual(this.echlogDocType, mparEchallanLog.echlogDocType) && Intrinsics.areEqual(this.echlogMobileNo, mparEchallanLog.echlogMobileNo) && Intrinsics.areEqual(this.echlogPaymentDate, mparEchallanLog.echlogPaymentDate) && Intrinsics.areEqual(this.echlogReceiptNo, mparEchallanLog.echlogReceiptNo) && this.echlogRecordId == mparEchallanLog.echlogRecordId && this.echlogRtoCd == mparEchallanLog.echlogRtoCd && Intrinsics.areEqual(this.echlogStateCd, mparEchallanLog.echlogStateCd) && Intrinsics.areEqual(this.echlogTransId, mparEchallanLog.echlogTransId) && Intrinsics.areEqual(this.echlogchallannumber, mparEchallanLog.echlogchallannumber);
    }

    public final String getChallanAmt() {
        return this.challanAmt;
    }

    public final String getEchlogChallanDate() {
        return this.echlogChallanDate;
    }

    public final String getEchlogChallanStatus() {
        return this.echlogChallanStatus;
    }

    public final String getEchlogCreatedAt() {
        return this.echlogCreatedAt;
    }

    public final long getEchlogCtzId() {
        return this.echlogCtzId;
    }

    public final int getEchlogDeptCd() {
        return this.echlogDeptCd;
    }

    public final String getEchlogDocNumber() {
        return this.echlogDocNumber;
    }

    public final String getEchlogDocType() {
        return this.echlogDocType;
    }

    public final String getEchlogMobileNo() {
        return this.echlogMobileNo;
    }

    public final String getEchlogPaymentDate() {
        return this.echlogPaymentDate;
    }

    public final String getEchlogReceiptNo() {
        return this.echlogReceiptNo;
    }

    public final int getEchlogRecordId() {
        return this.echlogRecordId;
    }

    public final int getEchlogRtoCd() {
        return this.echlogRtoCd;
    }

    public final String getEchlogStateCd() {
        return this.echlogStateCd;
    }

    public final String getEchlogTransId() {
        return this.echlogTransId;
    }

    public final String getEchlogchallannumber() {
        return this.echlogchallannumber;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.challanAmt.hashCode() * 31) + this.echlogChallanDate.hashCode()) * 31) + this.echlogChallanStatus.hashCode()) * 31) + this.echlogCreatedAt.hashCode()) * 31) + Long.hashCode(this.echlogCtzId)) * 31) + Integer.hashCode(this.echlogDeptCd)) * 31) + this.echlogDocNumber.hashCode()) * 31) + this.echlogDocType.hashCode()) * 31) + this.echlogMobileNo.hashCode()) * 31) + this.echlogPaymentDate.hashCode()) * 31) + this.echlogReceiptNo.hashCode()) * 31) + Integer.hashCode(this.echlogRecordId)) * 31) + Integer.hashCode(this.echlogRtoCd)) * 31) + this.echlogStateCd.hashCode()) * 31) + this.echlogTransId.hashCode()) * 31) + this.echlogchallannumber.hashCode();
    }

    public String toString() {
        return "MparEchallanLog(challanAmt=" + this.challanAmt + ", echlogChallanDate=" + this.echlogChallanDate + ", echlogChallanStatus=" + this.echlogChallanStatus + ", echlogCreatedAt=" + this.echlogCreatedAt + ", echlogCtzId=" + this.echlogCtzId + ", echlogDeptCd=" + this.echlogDeptCd + ", echlogDocNumber=" + this.echlogDocNumber + ", echlogDocType=" + this.echlogDocType + ", echlogMobileNo=" + this.echlogMobileNo + ", echlogPaymentDate=" + this.echlogPaymentDate + ", echlogReceiptNo=" + this.echlogReceiptNo + ", echlogRecordId=" + this.echlogRecordId + ", echlogRtoCd=" + this.echlogRtoCd + ", echlogStateCd=" + this.echlogStateCd + ", echlogTransId=" + this.echlogTransId + ", echlogchallannumber=" + this.echlogchallannumber + ')';
    }
}
