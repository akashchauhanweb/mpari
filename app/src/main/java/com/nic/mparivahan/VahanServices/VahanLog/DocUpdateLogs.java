package com.nic.mparivahan.VahanServices.VahanLog;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanLog/DocUpdateLogs;", "", "vahlogFeeDate", "", "vahlogReptDate", "vahlogReptNo", "vahlogFeeAmt", "", "vahlogApplNo", "vahlogRcNumber", "setVahlogPhotoUplDate", "setVahlogDocUplDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSetVahlogDocUplDate", "()Ljava/lang/String;", "getSetVahlogPhotoUplDate", "getVahlogApplNo", "getVahlogFeeAmt", "()D", "getVahlogFeeDate", "getVahlogRcNumber", "getVahlogReptDate", "getVahlogReptNo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DocUpdateLogs {
    private final String setVahlogDocUplDate;
    private final String setVahlogPhotoUplDate;
    private final String vahlogApplNo;
    private final double vahlogFeeAmt;
    private final String vahlogFeeDate;
    private final String vahlogRcNumber;
    private final String vahlogReptDate;
    private final String vahlogReptNo;

    public DocUpdateLogs(String vahlogFeeDate, String vahlogReptDate, String vahlogReptNo, double d, String vahlogApplNo, String vahlogRcNumber, String setVahlogPhotoUplDate, String setVahlogDocUplDate) {
        Intrinsics.checkNotNullParameter(vahlogFeeDate, "vahlogFeeDate");
        Intrinsics.checkNotNullParameter(vahlogReptDate, "vahlogReptDate");
        Intrinsics.checkNotNullParameter(vahlogReptNo, "vahlogReptNo");
        Intrinsics.checkNotNullParameter(vahlogApplNo, "vahlogApplNo");
        Intrinsics.checkNotNullParameter(vahlogRcNumber, "vahlogRcNumber");
        Intrinsics.checkNotNullParameter(setVahlogPhotoUplDate, "setVahlogPhotoUplDate");
        Intrinsics.checkNotNullParameter(setVahlogDocUplDate, "setVahlogDocUplDate");
        this.vahlogFeeDate = vahlogFeeDate;
        this.vahlogReptDate = vahlogReptDate;
        this.vahlogReptNo = vahlogReptNo;
        this.vahlogFeeAmt = d;
        this.vahlogApplNo = vahlogApplNo;
        this.vahlogRcNumber = vahlogRcNumber;
        this.setVahlogPhotoUplDate = setVahlogPhotoUplDate;
        this.setVahlogDocUplDate = setVahlogDocUplDate;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVahlogFeeDate() {
        return this.vahlogFeeDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVahlogReptDate() {
        return this.vahlogReptDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVahlogReptNo() {
        return this.vahlogReptNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getVahlogFeeAmt() {
        return this.vahlogFeeAmt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVahlogApplNo() {
        return this.vahlogApplNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVahlogRcNumber() {
        return this.vahlogRcNumber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSetVahlogPhotoUplDate() {
        return this.setVahlogPhotoUplDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSetVahlogDocUplDate() {
        return this.setVahlogDocUplDate;
    }

    public final DocUpdateLogs copy(String vahlogFeeDate, String vahlogReptDate, String vahlogReptNo, double vahlogFeeAmt, String vahlogApplNo, String vahlogRcNumber, String setVahlogPhotoUplDate, String setVahlogDocUplDate) {
        Intrinsics.checkNotNullParameter(vahlogFeeDate, "vahlogFeeDate");
        Intrinsics.checkNotNullParameter(vahlogReptDate, "vahlogReptDate");
        Intrinsics.checkNotNullParameter(vahlogReptNo, "vahlogReptNo");
        Intrinsics.checkNotNullParameter(vahlogApplNo, "vahlogApplNo");
        Intrinsics.checkNotNullParameter(vahlogRcNumber, "vahlogRcNumber");
        Intrinsics.checkNotNullParameter(setVahlogPhotoUplDate, "setVahlogPhotoUplDate");
        Intrinsics.checkNotNullParameter(setVahlogDocUplDate, "setVahlogDocUplDate");
        return new DocUpdateLogs(vahlogFeeDate, vahlogReptDate, vahlogReptNo, vahlogFeeAmt, vahlogApplNo, vahlogRcNumber, setVahlogPhotoUplDate, setVahlogDocUplDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocUpdateLogs)) {
            return false;
        }
        DocUpdateLogs docUpdateLogs = (DocUpdateLogs) other;
        return Intrinsics.areEqual(this.vahlogFeeDate, docUpdateLogs.vahlogFeeDate) && Intrinsics.areEqual(this.vahlogReptDate, docUpdateLogs.vahlogReptDate) && Intrinsics.areEqual(this.vahlogReptNo, docUpdateLogs.vahlogReptNo) && Double.compare(this.vahlogFeeAmt, docUpdateLogs.vahlogFeeAmt) == 0 && Intrinsics.areEqual(this.vahlogApplNo, docUpdateLogs.vahlogApplNo) && Intrinsics.areEqual(this.vahlogRcNumber, docUpdateLogs.vahlogRcNumber) && Intrinsics.areEqual(this.setVahlogPhotoUplDate, docUpdateLogs.setVahlogPhotoUplDate) && Intrinsics.areEqual(this.setVahlogDocUplDate, docUpdateLogs.setVahlogDocUplDate);
    }

    public final String getSetVahlogDocUplDate() {
        return this.setVahlogDocUplDate;
    }

    public final String getSetVahlogPhotoUplDate() {
        return this.setVahlogPhotoUplDate;
    }

    public final String getVahlogApplNo() {
        return this.vahlogApplNo;
    }

    public final double getVahlogFeeAmt() {
        return this.vahlogFeeAmt;
    }

    public final String getVahlogFeeDate() {
        return this.vahlogFeeDate;
    }

    public final String getVahlogRcNumber() {
        return this.vahlogRcNumber;
    }

    public final String getVahlogReptDate() {
        return this.vahlogReptDate;
    }

    public final String getVahlogReptNo() {
        return this.vahlogReptNo;
    }

    public int hashCode() {
        return (((((((((((((this.vahlogFeeDate.hashCode() * 31) + this.vahlogReptDate.hashCode()) * 31) + this.vahlogReptNo.hashCode()) * 31) + Double.hashCode(this.vahlogFeeAmt)) * 31) + this.vahlogApplNo.hashCode()) * 31) + this.vahlogRcNumber.hashCode()) * 31) + this.setVahlogPhotoUplDate.hashCode()) * 31) + this.setVahlogDocUplDate.hashCode();
    }

    public String toString() {
        return "DocUpdateLogs(vahlogFeeDate=" + this.vahlogFeeDate + ", vahlogReptDate=" + this.vahlogReptDate + ", vahlogReptNo=" + this.vahlogReptNo + ", vahlogFeeAmt=" + this.vahlogFeeAmt + ", vahlogApplNo=" + this.vahlogApplNo + ", vahlogRcNumber=" + this.vahlogRcNumber + ", setVahlogPhotoUplDate=" + this.setVahlogPhotoUplDate + ", setVahlogDocUplDate=" + this.setVahlogDocUplDate + ')';
    }
}
