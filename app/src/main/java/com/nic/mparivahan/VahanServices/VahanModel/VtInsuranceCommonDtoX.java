package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\bM\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010 \u001a\u00020\u0012¢\u0006\u0002\u0010!J\t\u0010B\u001a\u00020\u0001HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\u0001HÆ\u0003J\t\u0010F\u001a\u00020\u0001HÆ\u0003J\t\u0010G\u001a\u00020\u0012HÆ\u0003J\t\u0010H\u001a\u00020\u0001HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\t\u0010J\u001a\u00020\u0012HÆ\u0003J\t\u0010K\u001a\u00020\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0012HÆ\u0003J\t\u0010M\u001a\u00020\u0004HÆ\u0003J\t\u0010N\u001a\u00020\u0001HÆ\u0003J\t\u0010O\u001a\u00020\u0001HÆ\u0003J\t\u0010P\u001a\u00020\u0001HÆ\u0003J\t\u0010Q\u001a\u00020\u0012HÆ\u0003J\t\u0010R\u001a\u00020\u0012HÆ\u0003J\t\u0010S\u001a\u00020\u0012HÆ\u0003J\t\u0010T\u001a\u00020\u0012HÆ\u0003J\t\u0010U\u001a\u00020\u0001HÆ\u0003J\t\u0010V\u001a\u00020\u0012HÆ\u0003J\t\u0010W\u001a\u00020\u0001HÆ\u0003J\t\u0010X\u001a\u00020\u0001HÆ\u0003J\t\u0010Y\u001a\u00020\u0001HÆ\u0003J\t\u0010Z\u001a\u00020\u0004HÆ\u0003J\t\u0010[\u001a\u00020\nHÆ\u0003J\t\u0010\\\u001a\u00020\nHÆ\u0003J\t\u0010]\u001a\u00020\nHÆ\u0003J¡\u0002\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u0012HÆ\u0001J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\u0004HÖ\u0001J\t\u0010c\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0011\u0010\u0019\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0011\u0010\u001b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0011\u0010\u001c\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0011\u0010\u001d\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0011\u0010\u001e\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0011\u0010\u001f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u0011\u0010 \u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bA\u00103¨\u0006d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/VtInsuranceCommonDtoX;", "", "appl_no", "comp_cd", "", "descr", "descr1", "ic_code", "idv", "insFrom", "", "insUpto", "ins_from", "ins_type", "ins_upto", "instyp_code", "instypeName", "insuranceFrom", "", "insuranceMessge", "insuranceType", "insuranceUpto", "issuerCd", "issuerName", "moved_by", "moved_on", "op_dt", "opdt", "policyNo", "policy_no", "regnNo", "regn_no", "vahanVerify", "(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IJJJIJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getAppl_no", "()Ljava/lang/Object;", "getComp_cd", "()I", "getDescr", "getDescr1", "getIc_code", "getIdv", "getInsFrom", "()J", "getInsUpto", "getIns_from", "getIns_type", "getIns_upto", "getInstyp_code", "getInstypeName", "getInsuranceFrom", "()Ljava/lang/String;", "getInsuranceMessge", "getInsuranceType", "getInsuranceUpto", "getIssuerCd", "getIssuerName", "getMoved_by", "getMoved_on", "getOp_dt", "getOpdt", "getPolicyNo", "getPolicy_no", "getRegnNo", "getRegn_no", "getVahanVerify", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VtInsuranceCommonDtoX {
    private final Object appl_no;
    private final int comp_cd;
    private final Object descr;
    private final Object descr1;
    private final Object ic_code;
    private final int idv;
    private final long insFrom;
    private final long insUpto;
    private final long ins_from;
    private final int ins_type;
    private final long ins_upto;
    private final Object instyp_code;
    private final Object instypeName;
    private final String insuranceFrom;
    private final Object insuranceMessge;
    private final int insuranceType;
    private final String insuranceUpto;
    private final int issuerCd;
    private final String issuerName;
    private final Object moved_by;
    private final Object moved_on;
    private final Object op_dt;
    private final String opdt;
    private final String policyNo;
    private final String policy_no;
    private final String regnNo;
    private final Object regn_no;
    private final String vahanVerify;

    public VtInsuranceCommonDtoX(Object appl_no, int i, Object descr, Object descr1, Object ic_code, int i2, long j, long j2, long j3, int i3, long j4, Object instyp_code, Object instypeName, String insuranceFrom, Object insuranceMessge, int i4, String insuranceUpto, int i5, String issuerName, Object moved_by, Object moved_on, Object op_dt, String opdt, String policyNo, String policy_no, String regnNo, Object regn_no, String vahanVerify) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(descr1, "descr1");
        Intrinsics.checkNotNullParameter(ic_code, "ic_code");
        Intrinsics.checkNotNullParameter(instyp_code, "instyp_code");
        Intrinsics.checkNotNullParameter(instypeName, "instypeName");
        Intrinsics.checkNotNullParameter(insuranceFrom, "insuranceFrom");
        Intrinsics.checkNotNullParameter(insuranceMessge, "insuranceMessge");
        Intrinsics.checkNotNullParameter(insuranceUpto, "insuranceUpto");
        Intrinsics.checkNotNullParameter(issuerName, "issuerName");
        Intrinsics.checkNotNullParameter(moved_by, "moved_by");
        Intrinsics.checkNotNullParameter(moved_on, "moved_on");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(opdt, "opdt");
        Intrinsics.checkNotNullParameter(policyNo, "policyNo");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(vahanVerify, "vahanVerify");
        this.appl_no = appl_no;
        this.comp_cd = i;
        this.descr = descr;
        this.descr1 = descr1;
        this.ic_code = ic_code;
        this.idv = i2;
        this.insFrom = j;
        this.insUpto = j2;
        this.ins_from = j3;
        this.ins_type = i3;
        this.ins_upto = j4;
        this.instyp_code = instyp_code;
        this.instypeName = instypeName;
        this.insuranceFrom = insuranceFrom;
        this.insuranceMessge = insuranceMessge;
        this.insuranceType = i4;
        this.insuranceUpto = insuranceUpto;
        this.issuerCd = i5;
        this.issuerName = issuerName;
        this.moved_by = moved_by;
        this.moved_on = moved_on;
        this.op_dt = op_dt;
        this.opdt = opdt;
        this.policyNo = policyNo;
        this.policy_no = policy_no;
        this.regnNo = regnNo;
        this.regn_no = regn_no;
        this.vahanVerify = vahanVerify;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getInstyp_code() {
        return this.instyp_code;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getInstypeName() {
        return this.instypeName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getInsuranceFrom() {
        return this.insuranceFrom;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getInsuranceMessge() {
        return this.insuranceMessge;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getInsuranceType() {
        return this.insuranceType;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getInsuranceUpto() {
        return this.insuranceUpto;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getIssuerCd() {
        return this.issuerCd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getMoved_by() {
        return this.moved_by;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getMoved_on() {
        return this.moved_on;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Object getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getOpdt() {
        return this.opdt;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPolicyNo() {
        return this.policyNo;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Object getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getVahanVerify() {
        return this.vahanVerify;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getDescr() {
        return this.descr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getDescr1() {
        return this.descr1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getIc_code() {
        return this.ic_code;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getInsFrom() {
        return this.insFrom;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getInsUpto() {
        return this.insUpto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getIns_from() {
        return this.ins_from;
    }

    public final VtInsuranceCommonDtoX copy(Object appl_no, int comp_cd, Object descr, Object descr1, Object ic_code, int idv, long insFrom, long insUpto, long ins_from, int ins_type, long ins_upto, Object instyp_code, Object instypeName, String insuranceFrom, Object insuranceMessge, int insuranceType, String insuranceUpto, int issuerCd, String issuerName, Object moved_by, Object moved_on, Object op_dt, String opdt, String policyNo, String policy_no, String regnNo, Object regn_no, String vahanVerify) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(descr, "descr");
        Intrinsics.checkNotNullParameter(descr1, "descr1");
        Intrinsics.checkNotNullParameter(ic_code, "ic_code");
        Intrinsics.checkNotNullParameter(instyp_code, "instyp_code");
        Intrinsics.checkNotNullParameter(instypeName, "instypeName");
        Intrinsics.checkNotNullParameter(insuranceFrom, "insuranceFrom");
        Intrinsics.checkNotNullParameter(insuranceMessge, "insuranceMessge");
        Intrinsics.checkNotNullParameter(insuranceUpto, "insuranceUpto");
        Intrinsics.checkNotNullParameter(issuerName, "issuerName");
        Intrinsics.checkNotNullParameter(moved_by, "moved_by");
        Intrinsics.checkNotNullParameter(moved_on, "moved_on");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(opdt, "opdt");
        Intrinsics.checkNotNullParameter(policyNo, "policyNo");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(vahanVerify, "vahanVerify");
        return new VtInsuranceCommonDtoX(appl_no, comp_cd, descr, descr1, ic_code, idv, insFrom, insUpto, ins_from, ins_type, ins_upto, instyp_code, instypeName, insuranceFrom, insuranceMessge, insuranceType, insuranceUpto, issuerCd, issuerName, moved_by, moved_on, op_dt, opdt, policyNo, policy_no, regnNo, regn_no, vahanVerify);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VtInsuranceCommonDtoX)) {
            return false;
        }
        VtInsuranceCommonDtoX vtInsuranceCommonDtoX = (VtInsuranceCommonDtoX) other;
        return Intrinsics.areEqual(this.appl_no, vtInsuranceCommonDtoX.appl_no) && this.comp_cd == vtInsuranceCommonDtoX.comp_cd && Intrinsics.areEqual(this.descr, vtInsuranceCommonDtoX.descr) && Intrinsics.areEqual(this.descr1, vtInsuranceCommonDtoX.descr1) && Intrinsics.areEqual(this.ic_code, vtInsuranceCommonDtoX.ic_code) && this.idv == vtInsuranceCommonDtoX.idv && this.insFrom == vtInsuranceCommonDtoX.insFrom && this.insUpto == vtInsuranceCommonDtoX.insUpto && this.ins_from == vtInsuranceCommonDtoX.ins_from && this.ins_type == vtInsuranceCommonDtoX.ins_type && this.ins_upto == vtInsuranceCommonDtoX.ins_upto && Intrinsics.areEqual(this.instyp_code, vtInsuranceCommonDtoX.instyp_code) && Intrinsics.areEqual(this.instypeName, vtInsuranceCommonDtoX.instypeName) && Intrinsics.areEqual(this.insuranceFrom, vtInsuranceCommonDtoX.insuranceFrom) && Intrinsics.areEqual(this.insuranceMessge, vtInsuranceCommonDtoX.insuranceMessge) && this.insuranceType == vtInsuranceCommonDtoX.insuranceType && Intrinsics.areEqual(this.insuranceUpto, vtInsuranceCommonDtoX.insuranceUpto) && this.issuerCd == vtInsuranceCommonDtoX.issuerCd && Intrinsics.areEqual(this.issuerName, vtInsuranceCommonDtoX.issuerName) && Intrinsics.areEqual(this.moved_by, vtInsuranceCommonDtoX.moved_by) && Intrinsics.areEqual(this.moved_on, vtInsuranceCommonDtoX.moved_on) && Intrinsics.areEqual(this.op_dt, vtInsuranceCommonDtoX.op_dt) && Intrinsics.areEqual(this.opdt, vtInsuranceCommonDtoX.opdt) && Intrinsics.areEqual(this.policyNo, vtInsuranceCommonDtoX.policyNo) && Intrinsics.areEqual(this.policy_no, vtInsuranceCommonDtoX.policy_no) && Intrinsics.areEqual(this.regnNo, vtInsuranceCommonDtoX.regnNo) && Intrinsics.areEqual(this.regn_no, vtInsuranceCommonDtoX.regn_no) && Intrinsics.areEqual(this.vahanVerify, vtInsuranceCommonDtoX.vahanVerify);
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final Object getDescr() {
        return this.descr;
    }

    public final Object getDescr1() {
        return this.descr1;
    }

    public final Object getIc_code() {
        return this.ic_code;
    }

    public final int getIdv() {
        return this.idv;
    }

    public final long getInsFrom() {
        return this.insFrom;
    }

    public final long getInsUpto() {
        return this.insUpto;
    }

    public final long getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
        return this.ins_type;
    }

    public final long getIns_upto() {
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

    public final Object getInsuranceMessge() {
        return this.insuranceMessge;
    }

    public final int getInsuranceType() {
        return this.insuranceType;
    }

    public final String getInsuranceUpto() {
        return this.insuranceUpto;
    }

    public final int getIssuerCd() {
        return this.issuerCd;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final Object getMoved_by() {
        return this.moved_by;
    }

    public final Object getMoved_on() {
        return this.moved_on;
    }

    public final Object getOp_dt() {
        return this.op_dt;
    }

    public final String getOpdt() {
        return this.opdt;
    }

    public final String getPolicyNo() {
        return this.policyNo;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final Object getRegn_no() {
        return this.regn_no;
    }

    public final String getVahanVerify() {
        return this.vahanVerify;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + Integer.hashCode(this.comp_cd)) * 31) + this.descr.hashCode()) * 31) + this.descr1.hashCode()) * 31) + this.ic_code.hashCode()) * 31) + Integer.hashCode(this.idv)) * 31) + Long.hashCode(this.insFrom)) * 31) + Long.hashCode(this.insUpto)) * 31) + Long.hashCode(this.ins_from)) * 31) + Integer.hashCode(this.ins_type)) * 31) + Long.hashCode(this.ins_upto)) * 31) + this.instyp_code.hashCode()) * 31) + this.instypeName.hashCode()) * 31) + this.insuranceFrom.hashCode()) * 31) + this.insuranceMessge.hashCode()) * 31) + Integer.hashCode(this.insuranceType)) * 31) + this.insuranceUpto.hashCode()) * 31) + Integer.hashCode(this.issuerCd)) * 31) + this.issuerName.hashCode()) * 31) + this.moved_by.hashCode()) * 31) + this.moved_on.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.opdt.hashCode()) * 31) + this.policyNo.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.vahanVerify.hashCode();
    }

    public String toString() {
        return "VtInsuranceCommonDtoX(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", descr=" + this.descr + ", descr1=" + this.descr1 + ", ic_code=" + this.ic_code + ", idv=" + this.idv + ", insFrom=" + this.insFrom + ", insUpto=" + this.insUpto + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", instyp_code=" + this.instyp_code + ", instypeName=" + this.instypeName + ", insuranceFrom=" + this.insuranceFrom + ", insuranceMessge=" + this.insuranceMessge + ", insuranceType=" + this.insuranceType + ", insuranceUpto=" + this.insuranceUpto + ", issuerCd=" + this.issuerCd + ", issuerName=" + this.issuerName + ", moved_by=" + this.moved_by + ", moved_on=" + this.moved_on + ", op_dt=" + this.op_dt + ", opdt=" + this.opdt + ", policyNo=" + this.policyNo + ", policy_no=" + this.policy_no + ", regnNo=" + this.regnNo + ", regn_no=" + this.regn_no + ", vahanVerify=" + this.vahanVerify + ')';
    }
}
