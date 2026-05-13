package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\bHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006,"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/RcCanceldto;", "Ljava/io/Serializable;", "applNo", "", "approvedBy", "cancelDt", "fileRefNo", "offCd", "", "opdt", "purCd", "reason", "regnNo", "stateCd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getApprovedBy", "getCancelDt", "getFileRefNo", "getOffCd", "()I", "getOpdt", "getPurCd", "getReason", "getRegnNo", "getStateCd", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RcCanceldto implements Serializable {
    private final String applNo;
    private final String approvedBy;
    private final String cancelDt;
    private final String fileRefNo;
    private final int offCd;
    private final String opdt;
    private final int purCd;
    private final String reason;
    private final String regnNo;
    private final String stateCd;

    public RcCanceldto(String applNo, String approvedBy, String cancelDt, String fileRefNo, int i, String opdt, int i2, String reason, String regnNo, String stateCd) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(approvedBy, "approvedBy");
        Intrinsics.checkNotNullParameter(cancelDt, "cancelDt");
        Intrinsics.checkNotNullParameter(fileRefNo, "fileRefNo");
        Intrinsics.checkNotNullParameter(opdt, "opdt");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        this.applNo = applNo;
        this.approvedBy = approvedBy;
        this.cancelDt = cancelDt;
        this.fileRefNo = fileRefNo;
        this.offCd = i;
        this.opdt = opdt;
        this.purCd = i2;
        this.reason = reason;
        this.regnNo = regnNo;
        this.stateCd = stateCd;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApprovedBy() {
        return this.approvedBy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCancelDt() {
        return this.cancelDt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOpdt() {
        return this.opdt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    public final RcCanceldto copy(String applNo, String approvedBy, String cancelDt, String fileRefNo, int offCd, String opdt, int purCd, String reason, String regnNo, String stateCd) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(approvedBy, "approvedBy");
        Intrinsics.checkNotNullParameter(cancelDt, "cancelDt");
        Intrinsics.checkNotNullParameter(fileRefNo, "fileRefNo");
        Intrinsics.checkNotNullParameter(opdt, "opdt");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        return new RcCanceldto(applNo, approvedBy, cancelDt, fileRefNo, offCd, opdt, purCd, reason, regnNo, stateCd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RcCanceldto)) {
            return false;
        }
        RcCanceldto rcCanceldto = (RcCanceldto) other;
        return Intrinsics.areEqual(this.applNo, rcCanceldto.applNo) && Intrinsics.areEqual(this.approvedBy, rcCanceldto.approvedBy) && Intrinsics.areEqual(this.cancelDt, rcCanceldto.cancelDt) && Intrinsics.areEqual(this.fileRefNo, rcCanceldto.fileRefNo) && this.offCd == rcCanceldto.offCd && Intrinsics.areEqual(this.opdt, rcCanceldto.opdt) && this.purCd == rcCanceldto.purCd && Intrinsics.areEqual(this.reason, rcCanceldto.reason) && Intrinsics.areEqual(this.regnNo, rcCanceldto.regnNo) && Intrinsics.areEqual(this.stateCd, rcCanceldto.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getApprovedBy() {
        return this.approvedBy;
    }

    public final String getCancelDt() {
        return this.cancelDt;
    }

    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpdt() {
        return this.opdt;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        return (((((((((((((((((this.applNo.hashCode() * 31) + this.approvedBy.hashCode()) * 31) + this.cancelDt.hashCode()) * 31) + this.fileRefNo.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opdt.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.reason.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCd.hashCode();
    }

    public String toString() {
        return "RcCanceldto(applNo=" + this.applNo + ", approvedBy=" + this.approvedBy + ", cancelDt=" + this.cancelDt + ", fileRefNo=" + this.fileRefNo + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", purCd=" + this.purCd + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ')';
    }
}
