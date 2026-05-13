package com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jõ\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0005HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a¨\u0006I"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/RCSurrenderModle;", "", "applNo", "", "offCd", "", "purCd", "regnNo", "stateCd", "surrDt", "fileRefNo", "approvedBy", "reasonval", "rcval", "rcSnoval", "permitval", "permitSnoval", "fcval", "fcSnoval", "taxexemval", "releaseDt", "relFileRefNo", "relApprovedBy", "cancelDt", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getApprovedBy", "getCancelDt", "getFcSnoval", "getFcval", "getFileRefNo", "getOffCd", "()I", "getPermitSnoval", "getPermitval", "getPurCd", "getRcSnoval", "getRcval", "getReasonval", "getRegnNo", "getRelApprovedBy", "getRelFileRefNo", "getReleaseDt", "getStateCd", "getSurrDt", "getTaxexemval", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RCSurrenderModle {
    private final String applNo;
    private final String approvedBy;
    private final String cancelDt;
    private final String fcSnoval;
    private final String fcval;
    private final String fileRefNo;
    private final int offCd;
    private final String permitSnoval;
    private final String permitval;
    private final int purCd;
    private final String rcSnoval;
    private final String rcval;
    private final String reasonval;
    private final String regnNo;
    private final String relApprovedBy;
    private final String relFileRefNo;
    private final String releaseDt;
    private final String stateCd;
    private final String surrDt;
    private final String taxexemval;

    public RCSurrenderModle(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.applNo = str;
        this.offCd = i;
        this.purCd = i2;
        this.regnNo = str2;
        this.stateCd = str3;
        this.surrDt = str4;
        this.fileRefNo = str5;
        this.approvedBy = str6;
        this.reasonval = str7;
        this.rcval = str8;
        this.rcSnoval = str9;
        this.permitval = str10;
        this.permitSnoval = str11;
        this.fcval = str12;
        this.fcSnoval = str13;
        this.taxexemval = str14;
        this.releaseDt = str15;
        this.relFileRefNo = str16;
        this.relApprovedBy = str17;
        this.cancelDt = str18;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRcval() {
        return this.rcval;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRcSnoval() {
        return this.rcSnoval;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPermitval() {
        return this.permitval;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPermitSnoval() {
        return this.permitSnoval;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFcval() {
        return this.fcval;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFcSnoval() {
        return this.fcSnoval;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTaxexemval() {
        return this.taxexemval;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getReleaseDt() {
        return this.releaseDt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRelFileRefNo() {
        return this.relFileRefNo;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRelApprovedBy() {
        return this.relApprovedBy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCancelDt() {
        return this.cancelDt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSurrDt() {
        return this.surrDt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApprovedBy() {
        return this.approvedBy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getReasonval() {
        return this.reasonval;
    }

    public final RCSurrenderModle copy(String applNo, int offCd, int purCd, String regnNo, String stateCd, String surrDt, String fileRefNo, String approvedBy, String reasonval, String rcval, String rcSnoval, String permitval, String permitSnoval, String fcval, String fcSnoval, String taxexemval, String releaseDt, String relFileRefNo, String relApprovedBy, String cancelDt) {
        return new RCSurrenderModle(applNo, offCd, purCd, regnNo, stateCd, surrDt, fileRefNo, approvedBy, reasonval, rcval, rcSnoval, permitval, permitSnoval, fcval, fcSnoval, taxexemval, releaseDt, relFileRefNo, relApprovedBy, cancelDt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RCSurrenderModle)) {
            return false;
        }
        RCSurrenderModle rCSurrenderModle = (RCSurrenderModle) other;
        return Intrinsics.areEqual(this.applNo, rCSurrenderModle.applNo) && this.offCd == rCSurrenderModle.offCd && this.purCd == rCSurrenderModle.purCd && Intrinsics.areEqual(this.regnNo, rCSurrenderModle.regnNo) && Intrinsics.areEqual(this.stateCd, rCSurrenderModle.stateCd) && Intrinsics.areEqual(this.surrDt, rCSurrenderModle.surrDt) && Intrinsics.areEqual(this.fileRefNo, rCSurrenderModle.fileRefNo) && Intrinsics.areEqual(this.approvedBy, rCSurrenderModle.approvedBy) && Intrinsics.areEqual(this.reasonval, rCSurrenderModle.reasonval) && Intrinsics.areEqual(this.rcval, rCSurrenderModle.rcval) && Intrinsics.areEqual(this.rcSnoval, rCSurrenderModle.rcSnoval) && Intrinsics.areEqual(this.permitval, rCSurrenderModle.permitval) && Intrinsics.areEqual(this.permitSnoval, rCSurrenderModle.permitSnoval) && Intrinsics.areEqual(this.fcval, rCSurrenderModle.fcval) && Intrinsics.areEqual(this.fcSnoval, rCSurrenderModle.fcSnoval) && Intrinsics.areEqual(this.taxexemval, rCSurrenderModle.taxexemval) && Intrinsics.areEqual(this.releaseDt, rCSurrenderModle.releaseDt) && Intrinsics.areEqual(this.relFileRefNo, rCSurrenderModle.relFileRefNo) && Intrinsics.areEqual(this.relApprovedBy, rCSurrenderModle.relApprovedBy) && Intrinsics.areEqual(this.cancelDt, rCSurrenderModle.cancelDt);
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

    public final String getFcSnoval() {
        return this.fcSnoval;
    }

    public final String getFcval() {
        return this.fcval;
    }

    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getPermitSnoval() {
        return this.permitSnoval;
    }

    public final String getPermitval() {
        return this.permitval;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getRcSnoval() {
        return this.rcSnoval;
    }

    public final String getRcval() {
        return this.rcval;
    }

    public final String getReasonval() {
        return this.reasonval;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getRelApprovedBy() {
        return this.relApprovedBy;
    }

    public final String getRelFileRefNo() {
        return this.relFileRefNo;
    }

    public final String getReleaseDt() {
        return this.releaseDt;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getSurrDt() {
        return this.surrDt;
    }

    public final String getTaxexemval() {
        return this.taxexemval;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str2 = this.regnNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateCd;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.surrDt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fileRefNo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.approvedBy;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.reasonval;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rcval;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rcSnoval;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.permitval;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.permitSnoval;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fcval;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fcSnoval;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.taxexemval;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.releaseDt;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.relFileRefNo;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.relApprovedBy;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.cancelDt;
        return iHashCode17 + (str18 != null ? str18.hashCode() : 0);
    }

    public String toString() {
        return "RCSurrenderModle(applNo=" + this.applNo + ", offCd=" + this.offCd + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", surrDt=" + this.surrDt + ", fileRefNo=" + this.fileRefNo + ", approvedBy=" + this.approvedBy + ", reasonval=" + this.reasonval + ", rcval=" + this.rcval + ", rcSnoval=" + this.rcSnoval + ", permitval=" + this.permitval + ", permitSnoval=" + this.permitSnoval + ", fcval=" + this.fcval + ", fcSnoval=" + this.fcSnoval + ", taxexemval=" + this.taxexemval + ", releaseDt=" + this.releaseDt + ", relFileRefNo=" + this.relFileRefNo + ", relApprovedBy=" + this.relApprovedBy + ", cancelDt=" + this.cancelDt + ')';
    }
}
