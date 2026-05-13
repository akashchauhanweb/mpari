package com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J³\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0005HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010@\u001a\u00020\nHÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a¨\u0006B"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "Ljava/io/Serializable;", "applNo", "", "approvedBy", "", "fc", "fcSno", "fileRefNo", "offCd", "", "opDt", "permit", "permitSno", "purCd", "rc", "rcSno", "reason", "regnNo", "stateCd", "surrDt", "taxexem", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getApplNo", "()Ljava/lang/String;", "getApprovedBy", "()Ljava/lang/Object;", "getFc", "getFcSno", "getFileRefNo", "getOffCd", "()I", "getOpDt", "getPermit", "getPermitSno", "getPurCd", "getRc", "getRcSno", "getReason", "getRegnNo", "getStateCd", "getSurrDt", "getTaxexem", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String applNo;
    private final Object approvedBy;
    private final Object fc;
    private final Object fcSno;
    private final Object fileRefNo;
    private final int offCd;
    private final String opDt;
    private final Object permit;
    private final Object permitSno;
    private final int purCd;
    private final Object rc;
    private final Object rcSno;
    private final Object reason;
    private final String regnNo;
    private final String stateCd;
    private final String surrDt;
    private final Object taxexem;

    public Data(String applNo, Object approvedBy, Object fc, Object fcSno, Object fileRefNo, int i, String opDt, Object permit, Object permitSno, int i2, Object rc, Object rcSno, Object reason, String regnNo, String stateCd, String surrDt, Object taxexem) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(approvedBy, "approvedBy");
        Intrinsics.checkNotNullParameter(fc, "fc");
        Intrinsics.checkNotNullParameter(fcSno, "fcSno");
        Intrinsics.checkNotNullParameter(fileRefNo, "fileRefNo");
        Intrinsics.checkNotNullParameter(opDt, "opDt");
        Intrinsics.checkNotNullParameter(permit, "permit");
        Intrinsics.checkNotNullParameter(permitSno, "permitSno");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(rcSno, "rcSno");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(surrDt, "surrDt");
        Intrinsics.checkNotNullParameter(taxexem, "taxexem");
        this.applNo = applNo;
        this.approvedBy = approvedBy;
        this.fc = fc;
        this.fcSno = fcSno;
        this.fileRefNo = fileRefNo;
        this.offCd = i;
        this.opDt = opDt;
        this.permit = permit;
        this.permitSno = permitSno;
        this.purCd = i2;
        this.rc = rc;
        this.rcSno = rcSno;
        this.reason = reason;
        this.regnNo = regnNo;
        this.stateCd = stateCd;
        this.surrDt = surrDt;
        this.taxexem = taxexem;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getRc() {
        return this.rc;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getRcSno() {
        return this.rcSno;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSurrDt() {
        return this.surrDt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getTaxexem() {
        return this.taxexem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getApprovedBy() {
        return this.approvedBy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getFc() {
        return this.fc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getFcSno() {
        return this.fcSno;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getFileRefNo() {
        return this.fileRefNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOpDt() {
        return this.opDt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getPermit() {
        return this.permit;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getPermitSno() {
        return this.permitSno;
    }

    public final Data copy(String applNo, Object approvedBy, Object fc, Object fcSno, Object fileRefNo, int offCd, String opDt, Object permit, Object permitSno, int purCd, Object rc, Object rcSno, Object reason, String regnNo, String stateCd, String surrDt, Object taxexem) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(approvedBy, "approvedBy");
        Intrinsics.checkNotNullParameter(fc, "fc");
        Intrinsics.checkNotNullParameter(fcSno, "fcSno");
        Intrinsics.checkNotNullParameter(fileRefNo, "fileRefNo");
        Intrinsics.checkNotNullParameter(opDt, "opDt");
        Intrinsics.checkNotNullParameter(permit, "permit");
        Intrinsics.checkNotNullParameter(permitSno, "permitSno");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(rcSno, "rcSno");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(surrDt, "surrDt");
        Intrinsics.checkNotNullParameter(taxexem, "taxexem");
        return new Data(applNo, approvedBy, fc, fcSno, fileRefNo, offCd, opDt, permit, permitSno, purCd, rc, rcSno, reason, regnNo, stateCd, surrDt, taxexem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.approvedBy, data.approvedBy) && Intrinsics.areEqual(this.fc, data.fc) && Intrinsics.areEqual(this.fcSno, data.fcSno) && Intrinsics.areEqual(this.fileRefNo, data.fileRefNo) && this.offCd == data.offCd && Intrinsics.areEqual(this.opDt, data.opDt) && Intrinsics.areEqual(this.permit, data.permit) && Intrinsics.areEqual(this.permitSno, data.permitSno) && this.purCd == data.purCd && Intrinsics.areEqual(this.rc, data.rc) && Intrinsics.areEqual(this.rcSno, data.rcSno) && Intrinsics.areEqual(this.reason, data.reason) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.stateCd, data.stateCd) && Intrinsics.areEqual(this.surrDt, data.surrDt) && Intrinsics.areEqual(this.taxexem, data.taxexem);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final Object getApprovedBy() {
        return this.approvedBy;
    }

    public final Object getFc() {
        return this.fc;
    }

    public final Object getFcSno() {
        return this.fcSno;
    }

    public final Object getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpDt() {
        return this.opDt;
    }

    public final Object getPermit() {
        return this.permit;
    }

    public final Object getPermitSno() {
        return this.permitSno;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final Object getRc() {
        return this.rc;
    }

    public final Object getRcSno() {
        return this.rcSno;
    }

    public final Object getReason() {
        return this.reason;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getSurrDt() {
        return this.surrDt;
    }

    public final Object getTaxexem() {
        return this.taxexem;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.approvedBy.hashCode()) * 31) + this.fc.hashCode()) * 31) + this.fcSno.hashCode()) * 31) + this.fileRefNo.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opDt.hashCode()) * 31) + this.permit.hashCode()) * 31) + this.permitSno.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.rc.hashCode()) * 31) + this.rcSno.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.surrDt.hashCode()) * 31) + this.taxexem.hashCode();
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", approvedBy=" + this.approvedBy + ", fc=" + this.fc + ", fcSno=" + this.fcSno + ", fileRefNo=" + this.fileRefNo + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", permit=" + this.permit + ", permitSno=" + this.permitSno + ", purCd=" + this.purCd + ", rc=" + this.rc + ", rcSno=" + this.rcSno + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", surrDt=" + this.surrDt + ", taxexem=" + this.taxexem + ')';
    }
}
