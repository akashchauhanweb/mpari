package com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0082\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u00060"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "Ljava/io/Serializable;", "applNo", "", "approvedBy", "cancelDt", "", "fileRefNo", "offCd", "", "opdt", "purCd", "reason", "regnNo", "stateCd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getApprovedBy", "getCancelDt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFileRefNo", "getOffCd", "()I", "getOpdt", "getPurCd", "getReason", "getRegnNo", "getStateCd", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String applNo;
    private final String approvedBy;
    private final Long cancelDt;
    private final String fileRefNo;
    private final int offCd;
    private final Long opdt;
    private final int purCd;
    private final String reason;
    private final String regnNo;
    private final String stateCd;

    public Data(String str, String str2, Long l, String str3, int i, Long l2, int i2, String str4, String str5, String str6) {
        this.applNo = str;
        this.approvedBy = str2;
        this.cancelDt = l;
        this.fileRefNo = str3;
        this.offCd = i;
        this.opdt = l2;
        this.purCd = i2;
        this.reason = str4;
        this.regnNo = str5;
        this.stateCd = str6;
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
    public final Long getCancelDt() {
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
    public final Long getOpdt() {
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

    public final Data copy(String applNo, String approvedBy, Long cancelDt, String fileRefNo, int offCd, Long opdt, int purCd, String reason, String regnNo, String stateCd) {
        return new Data(applNo, approvedBy, cancelDt, fileRefNo, offCd, opdt, purCd, reason, regnNo, stateCd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.approvedBy, data.approvedBy) && Intrinsics.areEqual(this.cancelDt, data.cancelDt) && Intrinsics.areEqual(this.fileRefNo, data.fileRefNo) && this.offCd == data.offCd && Intrinsics.areEqual(this.opdt, data.opdt) && this.purCd == data.purCd && Intrinsics.areEqual(this.reason, data.reason) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.stateCd, data.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getApprovedBy() {
        return this.approvedBy;
    }

    public final Long getCancelDt() {
        return this.cancelDt;
    }

    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final Long getOpdt() {
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
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.approvedBy;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.cancelDt;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.fileRefNo;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        Long l2 = this.opdt;
        int iHashCode5 = (((iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str4 = this.reason;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.regnNo;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stateCd;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", approvedBy=" + this.approvedBy + ", cancelDt=" + this.cancelDt + ", fileRefNo=" + this.fileRefNo + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", purCd=" + this.purCd + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ')';
    }
}
