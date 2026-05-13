package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018Jª\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u00106\u001a\u00020\u0007HÖ\u0001J\t\u00107\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001e¨\u00068"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDto;", "Ljava/io/Serializable;", "insFrom", "", "insUpto", "ins_from", "ins_type", "", "ins_upto", "instyp_code", "instypeName", "insuranceFrom", "", "insuranceType", "insuranceUpto", "issuerName", "policyNo", "policy_no", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInsFrom", "()Ljava/lang/Object;", "getInsUpto", "getIns_from", "getIns_type", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIns_upto", "getInstyp_code", "getInstypeName", "getInsuranceFrom", "()Ljava/lang/String;", "getInsuranceType", "getInsuranceUpto", "getIssuerName", "getPolicyNo", "getPolicy_no", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDto;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VtInsuranceCommonDto implements Serializable {
    private final Object insFrom;
    private final Object insUpto;
    private final Object ins_from;
    private final Integer ins_type;
    private final Object ins_upto;
    private final Object instyp_code;
    private final Object instypeName;
    private final String insuranceFrom;
    private final Integer insuranceType;
    private final Object insuranceUpto;
    private final String issuerName;
    private final String policyNo;
    private final String policy_no;

    public VtInsuranceCommonDto(Object obj, Object obj2, Object obj3, Integer num, Object obj4, Object obj5, Object obj6, String str, Integer num2, Object obj7, String str2, String str3, String str4) {
        this.insFrom = obj;
        this.insUpto = obj2;
        this.ins_from = obj3;
        this.ins_type = num;
        this.ins_upto = obj4;
        this.instyp_code = obj5;
        this.instypeName = obj6;
        this.insuranceFrom = str;
        this.insuranceType = num2;
        this.insuranceUpto = obj7;
        this.issuerName = str2;
        this.policyNo = str3;
        this.policy_no = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getInsFrom() {
        return this.insFrom;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getInsuranceUpto() {
        return this.insuranceUpto;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPolicyNo() {
        return this.policyNo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getInsUpto() {
        return this.insUpto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getInstyp_code() {
        return this.instyp_code;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getInstypeName() {
        return this.instypeName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInsuranceFrom() {
        return this.insuranceFrom;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getInsuranceType() {
        return this.insuranceType;
    }

    public final VtInsuranceCommonDto copy(Object insFrom, Object insUpto, Object ins_from, Integer ins_type, Object ins_upto, Object instyp_code, Object instypeName, String insuranceFrom, Integer insuranceType, Object insuranceUpto, String issuerName, String policyNo, String policy_no) {
        return new VtInsuranceCommonDto(insFrom, insUpto, ins_from, ins_type, ins_upto, instyp_code, instypeName, insuranceFrom, insuranceType, insuranceUpto, issuerName, policyNo, policy_no);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VtInsuranceCommonDto)) {
            return false;
        }
        VtInsuranceCommonDto vtInsuranceCommonDto = (VtInsuranceCommonDto) other;
        return Intrinsics.areEqual(this.insFrom, vtInsuranceCommonDto.insFrom) && Intrinsics.areEqual(this.insUpto, vtInsuranceCommonDto.insUpto) && Intrinsics.areEqual(this.ins_from, vtInsuranceCommonDto.ins_from) && Intrinsics.areEqual(this.ins_type, vtInsuranceCommonDto.ins_type) && Intrinsics.areEqual(this.ins_upto, vtInsuranceCommonDto.ins_upto) && Intrinsics.areEqual(this.instyp_code, vtInsuranceCommonDto.instyp_code) && Intrinsics.areEqual(this.instypeName, vtInsuranceCommonDto.instypeName) && Intrinsics.areEqual(this.insuranceFrom, vtInsuranceCommonDto.insuranceFrom) && Intrinsics.areEqual(this.insuranceType, vtInsuranceCommonDto.insuranceType) && Intrinsics.areEqual(this.insuranceUpto, vtInsuranceCommonDto.insuranceUpto) && Intrinsics.areEqual(this.issuerName, vtInsuranceCommonDto.issuerName) && Intrinsics.areEqual(this.policyNo, vtInsuranceCommonDto.policyNo) && Intrinsics.areEqual(this.policy_no, vtInsuranceCommonDto.policy_no);
    }

    public final Object getInsFrom() {
        return this.insFrom;
    }

    public final Object getInsUpto() {
        return this.insUpto;
    }

    public final Object getIns_from() {
        return this.ins_from;
    }

    public final Integer getIns_type() {
        return this.ins_type;
    }

    public final Object getIns_upto() {
        return this.ins_upto;
    }

    public final Object getInstyp_code() {
        return this.instyp_code;
    }

    public final Object getInstypeName() {
        return this.instypeName;
    }

    public final String getInsuranceFrom() {
        return this.insuranceFrom;
    }

    public final Integer getInsuranceType() {
        return this.insuranceType;
    }

    public final Object getInsuranceUpto() {
        return this.insuranceUpto;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final String getPolicyNo() {
        return this.policyNo;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public int hashCode() {
        Object obj = this.insFrom;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.insUpto;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.ins_from;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num = this.ins_type;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj4 = this.ins_upto;
        int iHashCode5 = (iHashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.instyp_code;
        int iHashCode6 = (iHashCode5 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.instypeName;
        int iHashCode7 = (iHashCode6 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str = this.insuranceFrom;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.insuranceType;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj7 = this.insuranceUpto;
        int iHashCode10 = (iHashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        String str2 = this.issuerName;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.policyNo;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.policy_no;
        return iHashCode12 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "VtInsuranceCommonDto(insFrom=" + this.insFrom + ", insUpto=" + this.insUpto + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", instyp_code=" + this.instyp_code + ", instypeName=" + this.instypeName + ", insuranceFrom=" + this.insuranceFrom + ", insuranceType=" + this.insuranceType + ", insuranceUpto=" + this.insuranceUpto + ", issuerName=" + this.issuerName + ", policyNo=" + this.policyNo + ", policy_no=" + this.policy_no + ')';
    }
}
