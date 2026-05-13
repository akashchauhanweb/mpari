package com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001aR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001a¨\u00060"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/RCReleaseModle;", "Ljava/io/Serializable;", "applNo", "", "approvedBy", "cancelDt", "fcSnoval", "fcval", "fileRefNo", "offCd", "", "permitSnoval", "permitval", "purCd", "rcSnoval", "rcval", "reasonval", "regnNo", "relApprovedBy", "relFileRefNo", "releaseDt", "stateCd", "surrDt", "taxexemval", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getApprovedBy", "getCancelDt", "getFcSnoval", "getFcval", "getFileRefNo", "getOffCd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPermitSnoval", "getPermitval", "getPurCd", "getRcSnoval", "getRcval", "getReasonval", "getRegnNo", "getRelApprovedBy", "getRelFileRefNo", "getReleaseDt", "getStateCd", "getSurrDt", "getTaxexemval", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RCReleaseModle implements Serializable {
    private final String applNo;
    private final String approvedBy;
    private final String cancelDt;
    private final String fcSnoval;
    private final String fcval;
    private final String fileRefNo;
    private final Integer offCd;
    private final String permitSnoval;
    private final String permitval;
    private final String purCd;
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

    public RCReleaseModle(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.applNo = str;
        this.approvedBy = str2;
        this.cancelDt = str3;
        this.fcSnoval = str4;
        this.fcval = str5;
        this.fileRefNo = str6;
        this.offCd = num;
        this.permitSnoval = str7;
        this.permitval = str8;
        this.purCd = str9;
        this.rcSnoval = str10;
        this.rcval = str11;
        this.reasonval = str12;
        this.regnNo = str13;
        this.relApprovedBy = str14;
        this.relFileRefNo = str15;
        this.releaseDt = str16;
        this.stateCd = str17;
        this.surrDt = str18;
        this.taxexemval = str19;
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

    public final Integer getOffCd() {
        return this.offCd;
    }

    public final String getPermitSnoval() {
        return this.permitSnoval;
    }

    public final String getPermitval() {
        return this.permitval;
    }

    public final String getPurCd() {
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
}
