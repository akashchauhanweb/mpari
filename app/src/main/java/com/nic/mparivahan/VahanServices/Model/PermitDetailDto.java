package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00068"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Model/PermitDetailDto;", "", "appl_no", "", "issue_dt", "", "permitCatg", "permitType", "permitValidFrom", "permitValidUpto", "pmt_catg_code", "pmt_no", "pmt_type_code", "purcd", "rcpt_no", "regn_no", "valid_from", "valid_upto", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getAppl_no", "()Ljava/lang/String;", "getIssue_dt", "()J", "getPermitCatg", "getPermitType", "getPermitValidFrom", "getPermitValidUpto", "getPmt_catg_code", "getPmt_no", "getPmt_type_code", "getPurcd", "getRcpt_no", "getRegn_no", "getValid_from", "getValid_upto", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermitDetailDto {
    private final String appl_no;
    private final long issue_dt;
    private final String permitCatg;
    private final String permitType;
    private final String permitValidFrom;
    private final String permitValidUpto;
    private final String pmt_catg_code;
    private final String pmt_no;
    private final String pmt_type_code;
    private final String purcd;
    private final String rcpt_no;
    private final String regn_no;
    private final long valid_from;
    private final long valid_upto;

    public PermitDetailDto(String appl_no, long j, String permitCatg, String permitType, String permitValidFrom, String permitValidUpto, String pmt_catg_code, String pmt_no, String pmt_type_code, String purcd, String rcpt_no, String regn_no, long j2, long j3) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(permitCatg, "permitCatg");
        Intrinsics.checkNotNullParameter(permitType, "permitType");
        Intrinsics.checkNotNullParameter(permitValidFrom, "permitValidFrom");
        Intrinsics.checkNotNullParameter(permitValidUpto, "permitValidUpto");
        Intrinsics.checkNotNullParameter(pmt_catg_code, "pmt_catg_code");
        Intrinsics.checkNotNullParameter(pmt_no, "pmt_no");
        Intrinsics.checkNotNullParameter(pmt_type_code, "pmt_type_code");
        Intrinsics.checkNotNullParameter(purcd, "purcd");
        Intrinsics.checkNotNullParameter(rcpt_no, "rcpt_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        this.appl_no = appl_no;
        this.issue_dt = j;
        this.permitCatg = permitCatg;
        this.permitType = permitType;
        this.permitValidFrom = permitValidFrom;
        this.permitValidUpto = permitValidUpto;
        this.pmt_catg_code = pmt_catg_code;
        this.pmt_no = pmt_no;
        this.pmt_type_code = pmt_type_code;
        this.purcd = purcd;
        this.rcpt_no = rcpt_no;
        this.regn_no = regn_no;
        this.valid_from = j2;
        this.valid_upto = j3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPurcd() {
        return this.purcd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getValid_from() {
        return this.valid_from;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getValid_upto() {
        return this.valid_upto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getIssue_dt() {
        return this.issue_dt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPermitCatg() {
        return this.permitCatg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPermitType() {
        return this.permitType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPermitValidFrom() {
        return this.permitValidFrom;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPermitValidUpto() {
        return this.permitValidUpto;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPmt_no() {
        return this.pmt_no;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPmt_type_code() {
        return this.pmt_type_code;
    }

    public final PermitDetailDto copy(String appl_no, long issue_dt, String permitCatg, String permitType, String permitValidFrom, String permitValidUpto, String pmt_catg_code, String pmt_no, String pmt_type_code, String purcd, String rcpt_no, String regn_no, long valid_from, long valid_upto) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(permitCatg, "permitCatg");
        Intrinsics.checkNotNullParameter(permitType, "permitType");
        Intrinsics.checkNotNullParameter(permitValidFrom, "permitValidFrom");
        Intrinsics.checkNotNullParameter(permitValidUpto, "permitValidUpto");
        Intrinsics.checkNotNullParameter(pmt_catg_code, "pmt_catg_code");
        Intrinsics.checkNotNullParameter(pmt_no, "pmt_no");
        Intrinsics.checkNotNullParameter(pmt_type_code, "pmt_type_code");
        Intrinsics.checkNotNullParameter(purcd, "purcd");
        Intrinsics.checkNotNullParameter(rcpt_no, "rcpt_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        return new PermitDetailDto(appl_no, issue_dt, permitCatg, permitType, permitValidFrom, permitValidUpto, pmt_catg_code, pmt_no, pmt_type_code, purcd, rcpt_no, regn_no, valid_from, valid_upto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermitDetailDto)) {
            return false;
        }
        PermitDetailDto permitDetailDto = (PermitDetailDto) other;
        return Intrinsics.areEqual(this.appl_no, permitDetailDto.appl_no) && this.issue_dt == permitDetailDto.issue_dt && Intrinsics.areEqual(this.permitCatg, permitDetailDto.permitCatg) && Intrinsics.areEqual(this.permitType, permitDetailDto.permitType) && Intrinsics.areEqual(this.permitValidFrom, permitDetailDto.permitValidFrom) && Intrinsics.areEqual(this.permitValidUpto, permitDetailDto.permitValidUpto) && Intrinsics.areEqual(this.pmt_catg_code, permitDetailDto.pmt_catg_code) && Intrinsics.areEqual(this.pmt_no, permitDetailDto.pmt_no) && Intrinsics.areEqual(this.pmt_type_code, permitDetailDto.pmt_type_code) && Intrinsics.areEqual(this.purcd, permitDetailDto.purcd) && Intrinsics.areEqual(this.rcpt_no, permitDetailDto.rcpt_no) && Intrinsics.areEqual(this.regn_no, permitDetailDto.regn_no) && this.valid_from == permitDetailDto.valid_from && this.valid_upto == permitDetailDto.valid_upto;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final long getIssue_dt() {
        return this.issue_dt;
    }

    public final String getPermitCatg() {
        return this.permitCatg;
    }

    public final String getPermitType() {
        return this.permitType;
    }

    public final String getPermitValidFrom() {
        return this.permitValidFrom;
    }

    public final String getPermitValidUpto() {
        return this.permitValidUpto;
    }

    public final String getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    public final String getPmt_no() {
        return this.pmt_no;
    }

    public final String getPmt_type_code() {
        return this.pmt_type_code;
    }

    public final String getPurcd() {
        return this.purcd;
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final long getValid_from() {
        return this.valid_from;
    }

    public final long getValid_upto() {
        return this.valid_upto;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.appl_no.hashCode() * 31) + Long.hashCode(this.issue_dt)) * 31) + this.permitCatg.hashCode()) * 31) + this.permitType.hashCode()) * 31) + this.permitValidFrom.hashCode()) * 31) + this.permitValidUpto.hashCode()) * 31) + this.pmt_catg_code.hashCode()) * 31) + this.pmt_no.hashCode()) * 31) + this.pmt_type_code.hashCode()) * 31) + this.purcd.hashCode()) * 31) + this.rcpt_no.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + Long.hashCode(this.valid_from)) * 31) + Long.hashCode(this.valid_upto);
    }

    public String toString() {
        return "PermitDetailDto(appl_no=" + this.appl_no + ", issue_dt=" + this.issue_dt + ", permitCatg=" + this.permitCatg + ", permitType=" + this.permitType + ", permitValidFrom=" + this.permitValidFrom + ", permitValidUpto=" + this.permitValidUpto + ", pmt_catg_code=" + this.pmt_catg_code + ", pmt_no=" + this.pmt_no + ", pmt_type_code=" + this.pmt_type_code + ", purcd=" + this.purcd + ", rcpt_no=" + this.rcpt_no + ", regn_no=" + this.regn_no + ", valid_from=" + this.valid_from + ", valid_upto=" + this.valid_upto + ')';
    }
}
