package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003Ju\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/PermitDetailDto;", "Ljava/io/Serializable;", "permitValidFrom", "", "permitValidUpto", "issue_dt", "permitType", "pmt_no", "valid_from", "", "valid_upto", "pmt_type_code", "pmt_catg_code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getIssue_dt", "()Ljava/lang/String;", "getPermitType", "getPermitValidFrom", "getPermitValidUpto", "getPmt_catg_code", "()Ljava/lang/Object;", "getPmt_no", "getPmt_type_code", "getValid_from", "getValid_upto", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermitDetailDto implements Serializable {
    private final String issue_dt;
    private final String permitType;
    private final String permitValidFrom;
    private final String permitValidUpto;
    private final Object pmt_catg_code;
    private final String pmt_no;
    private final Object pmt_type_code;
    private final Object valid_from;
    private final Object valid_upto;

    public PermitDetailDto(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2, Object obj3, Object obj4) {
        this.permitValidFrom = str;
        this.permitValidUpto = str2;
        this.issue_dt = str3;
        this.permitType = str4;
        this.pmt_no = str5;
        this.valid_from = obj;
        this.valid_upto = obj2;
        this.pmt_type_code = obj3;
        this.pmt_catg_code = obj4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPermitValidFrom() {
        return this.permitValidFrom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPermitValidUpto() {
        return this.permitValidUpto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssue_dt() {
        return this.issue_dt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPermitType() {
        return this.permitType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPmt_no() {
        return this.pmt_no;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getValid_from() {
        return this.valid_from;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getValid_upto() {
        return this.valid_upto;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getPmt_type_code() {
        return this.pmt_type_code;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    public final PermitDetailDto copy(String permitValidFrom, String permitValidUpto, String issue_dt, String permitType, String pmt_no, Object valid_from, Object valid_upto, Object pmt_type_code, Object pmt_catg_code) {
        return new PermitDetailDto(permitValidFrom, permitValidUpto, issue_dt, permitType, pmt_no, valid_from, valid_upto, pmt_type_code, pmt_catg_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermitDetailDto)) {
            return false;
        }
        PermitDetailDto permitDetailDto = (PermitDetailDto) other;
        return Intrinsics.areEqual(this.permitValidFrom, permitDetailDto.permitValidFrom) && Intrinsics.areEqual(this.permitValidUpto, permitDetailDto.permitValidUpto) && Intrinsics.areEqual(this.issue_dt, permitDetailDto.issue_dt) && Intrinsics.areEqual(this.permitType, permitDetailDto.permitType) && Intrinsics.areEqual(this.pmt_no, permitDetailDto.pmt_no) && Intrinsics.areEqual(this.valid_from, permitDetailDto.valid_from) && Intrinsics.areEqual(this.valid_upto, permitDetailDto.valid_upto) && Intrinsics.areEqual(this.pmt_type_code, permitDetailDto.pmt_type_code) && Intrinsics.areEqual(this.pmt_catg_code, permitDetailDto.pmt_catg_code);
    }

    public final String getIssue_dt() {
        return this.issue_dt;
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

    public final Object getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    public final String getPmt_no() {
        return this.pmt_no;
    }

    public final Object getPmt_type_code() {
        return this.pmt_type_code;
    }

    public final Object getValid_from() {
        return this.valid_from;
    }

    public final Object getValid_upto() {
        return this.valid_upto;
    }

    public int hashCode() {
        String str = this.permitValidFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.permitValidUpto;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issue_dt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.permitType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pmt_no;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj = this.valid_from;
        int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.valid_upto;
        int iHashCode7 = (iHashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.pmt_type_code;
        int iHashCode8 = (iHashCode7 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.pmt_catg_code;
        return iHashCode8 + (obj4 != null ? obj4.hashCode() : 0);
    }

    public String toString() {
        return "PermitDetailDto(permitValidFrom=" + this.permitValidFrom + ", permitValidUpto=" + this.permitValidUpto + ", issue_dt=" + this.issue_dt + ", permitType=" + this.permitType + ", pmt_no=" + this.pmt_no + ", valid_from=" + this.valid_from + ", valid_upto=" + this.valid_upto + ", pmt_type_code=" + this.pmt_type_code + ", pmt_catg_code=" + this.pmt_catg_code + ')';
    }
}
