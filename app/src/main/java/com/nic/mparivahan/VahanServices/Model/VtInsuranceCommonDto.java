package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bP\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010!J\u000b\u0010D\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010F\u001a\u00020\u000eHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010L\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010M\u001a\u00020\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\t\u0010P\u001a\u00020\u0001HÆ\u0003J\t\u0010Q\u001a\u00020\u0001HÆ\u0003J\t\u0010R\u001a\u00020\u0001HÆ\u0003J\t\u0010S\u001a\u00020\u0012HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010]\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0001HÆ\u0003JÒ\u0002\u0010`\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010aJ\u0013\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020\u0004HÖ\u0001J\t\u0010f\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b*\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b6\u0010%R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0011\u0010\u0019\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0011\u0010\u001b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b@\u00104R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bB\u0010#R\u0013\u0010 \u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bC\u00104¨\u0006g"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Model/VtInsuranceCommonDto;", "", "appl_no", "comp_cd", "", "descr", "descr1", "ic_code", "idv", "insFrom", "insUpto", "ins_from", "ins_type", "ins_upto", "", "instyp_code", "instypeName", "insuranceFrom", "", "insuranceMessge", "insuranceType", "insuranceUpto", "issuerCd", "issuerName", "moved_by", "moved_on", "op_dt", "opdt", "policyNo", "policy_no", "regnNo", "regn_no", "vahanVerify", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getAppl_no", "()Ljava/lang/Object;", "getComp_cd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescr", "getDescr1", "getIc_code", "getIdv", "getInsFrom", "getInsUpto", "getIns_from", "getIns_type", "getIns_upto", "()J", "getInstyp_code", "getInstypeName", "getInsuranceFrom", "()Ljava/lang/String;", "getInsuranceMessge", "getInsuranceType", "getInsuranceUpto", "getIssuerCd", "()I", "getIssuerName", "getMoved_by", "getMoved_on", "getOp_dt", "getOpdt", "getPolicyNo", "getPolicy_no", "getRegnNo", "getRegn_no", "getVahanVerify", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/Model/VtInsuranceCommonDto;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VtInsuranceCommonDto {
    private final Object appl_no;
    private final Integer comp_cd;
    private final Object descr;
    private final Object descr1;
    private final Object ic_code;
    private final Integer idv;
    private final Object insFrom;
    private final Object insUpto;
    private final Object ins_from;
    private final Object ins_type;
    private final long ins_upto;
    private final Object instyp_code;
    private final Object instypeName;
    private final String insuranceFrom;
    private final Object insuranceMessge;
    private final Integer insuranceType;
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

    public VtInsuranceCommonDto(Object obj, Integer num, Object obj2, Object obj3, Object obj4, Integer num2, Object obj5, Object obj6, Object obj7, Object obj8, long j, Object obj9, Object obj10, String str, Object obj11, Integer num3, String str2, int i, String str3, Object moved_by, Object moved_on, Object op_dt, String opdt, String str4, String str5, String str6, Object obj12, String str7) {
        Intrinsics.checkNotNullParameter(moved_by, "moved_by");
        Intrinsics.checkNotNullParameter(moved_on, "moved_on");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(opdt, "opdt");
        this.appl_no = obj;
        this.comp_cd = num;
        this.descr = obj2;
        this.descr1 = obj3;
        this.ic_code = obj4;
        this.idv = num2;
        this.insFrom = obj5;
        this.insUpto = obj6;
        this.ins_from = obj7;
        this.ins_type = obj8;
        this.ins_upto = j;
        this.instyp_code = obj9;
        this.instypeName = obj10;
        this.insuranceFrom = str;
        this.insuranceMessge = obj11;
        this.insuranceType = num3;
        this.insuranceUpto = str2;
        this.issuerCd = i;
        this.issuerName = str3;
        this.moved_by = moved_by;
        this.moved_on = moved_on;
        this.op_dt = op_dt;
        this.opdt = opdt;
        this.policyNo = str4;
        this.policy_no = str5;
        this.regnNo = str6;
        this.regn_no = obj12;
        this.vahanVerify = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getIns_type() {
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
    public final Integer getInsuranceType() {
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
    public final Integer getComp_cd() {
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
    public final Integer getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getInsFrom() {
        return this.insFrom;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getInsUpto() {
        return this.insUpto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getIns_from() {
        return this.ins_from;
    }

    public final VtInsuranceCommonDto copy(Object appl_no, Integer comp_cd, Object descr, Object descr1, Object ic_code, Integer idv, Object insFrom, Object insUpto, Object ins_from, Object ins_type, long ins_upto, Object instyp_code, Object instypeName, String insuranceFrom, Object insuranceMessge, Integer insuranceType, String insuranceUpto, int issuerCd, String issuerName, Object moved_by, Object moved_on, Object op_dt, String opdt, String policyNo, String policy_no, String regnNo, Object regn_no, String vahanVerify) {
        Intrinsics.checkNotNullParameter(moved_by, "moved_by");
        Intrinsics.checkNotNullParameter(moved_on, "moved_on");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(opdt, "opdt");
        return new VtInsuranceCommonDto(appl_no, comp_cd, descr, descr1, ic_code, idv, insFrom, insUpto, ins_from, ins_type, ins_upto, instyp_code, instypeName, insuranceFrom, insuranceMessge, insuranceType, insuranceUpto, issuerCd, issuerName, moved_by, moved_on, op_dt, opdt, policyNo, policy_no, regnNo, regn_no, vahanVerify);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VtInsuranceCommonDto)) {
            return false;
        }
        VtInsuranceCommonDto vtInsuranceCommonDto = (VtInsuranceCommonDto) other;
        return Intrinsics.areEqual(this.appl_no, vtInsuranceCommonDto.appl_no) && Intrinsics.areEqual(this.comp_cd, vtInsuranceCommonDto.comp_cd) && Intrinsics.areEqual(this.descr, vtInsuranceCommonDto.descr) && Intrinsics.areEqual(this.descr1, vtInsuranceCommonDto.descr1) && Intrinsics.areEqual(this.ic_code, vtInsuranceCommonDto.ic_code) && Intrinsics.areEqual(this.idv, vtInsuranceCommonDto.idv) && Intrinsics.areEqual(this.insFrom, vtInsuranceCommonDto.insFrom) && Intrinsics.areEqual(this.insUpto, vtInsuranceCommonDto.insUpto) && Intrinsics.areEqual(this.ins_from, vtInsuranceCommonDto.ins_from) && Intrinsics.areEqual(this.ins_type, vtInsuranceCommonDto.ins_type) && this.ins_upto == vtInsuranceCommonDto.ins_upto && Intrinsics.areEqual(this.instyp_code, vtInsuranceCommonDto.instyp_code) && Intrinsics.areEqual(this.instypeName, vtInsuranceCommonDto.instypeName) && Intrinsics.areEqual(this.insuranceFrom, vtInsuranceCommonDto.insuranceFrom) && Intrinsics.areEqual(this.insuranceMessge, vtInsuranceCommonDto.insuranceMessge) && Intrinsics.areEqual(this.insuranceType, vtInsuranceCommonDto.insuranceType) && Intrinsics.areEqual(this.insuranceUpto, vtInsuranceCommonDto.insuranceUpto) && this.issuerCd == vtInsuranceCommonDto.issuerCd && Intrinsics.areEqual(this.issuerName, vtInsuranceCommonDto.issuerName) && Intrinsics.areEqual(this.moved_by, vtInsuranceCommonDto.moved_by) && Intrinsics.areEqual(this.moved_on, vtInsuranceCommonDto.moved_on) && Intrinsics.areEqual(this.op_dt, vtInsuranceCommonDto.op_dt) && Intrinsics.areEqual(this.opdt, vtInsuranceCommonDto.opdt) && Intrinsics.areEqual(this.policyNo, vtInsuranceCommonDto.policyNo) && Intrinsics.areEqual(this.policy_no, vtInsuranceCommonDto.policy_no) && Intrinsics.areEqual(this.regnNo, vtInsuranceCommonDto.regnNo) && Intrinsics.areEqual(this.regn_no, vtInsuranceCommonDto.regn_no) && Intrinsics.areEqual(this.vahanVerify, vtInsuranceCommonDto.vahanVerify);
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final Integer getComp_cd() {
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

    public final Integer getIdv() {
        return this.idv;
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

    public final Object getIns_type() {
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

    public final Integer getInsuranceType() {
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
        Object obj = this.appl_no;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.comp_cd;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Object obj2 = this.descr;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.descr1;
        int iHashCode4 = (iHashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.ic_code;
        int iHashCode5 = (iHashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Integer num2 = this.idv;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj5 = this.insFrom;
        int iHashCode7 = (iHashCode6 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.insUpto;
        int iHashCode8 = (iHashCode7 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.ins_from;
        int iHashCode9 = (iHashCode8 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.ins_type;
        int iHashCode10 = (((iHashCode9 + (obj8 == null ? 0 : obj8.hashCode())) * 31) + Long.hashCode(this.ins_upto)) * 31;
        Object obj9 = this.instyp_code;
        int iHashCode11 = (iHashCode10 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.instypeName;
        int iHashCode12 = (iHashCode11 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        String str = this.insuranceFrom;
        int iHashCode13 = (iHashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj11 = this.insuranceMessge;
        int iHashCode14 = (iHashCode13 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Integer num3 = this.insuranceType;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.insuranceUpto;
        int iHashCode16 = (((iHashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.issuerCd)) * 31;
        String str3 = this.issuerName;
        int iHashCode17 = (((((((((iHashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.moved_by.hashCode()) * 31) + this.moved_on.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.opdt.hashCode()) * 31;
        String str4 = this.policyNo;
        int iHashCode18 = (iHashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.policy_no;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.regnNo;
        int iHashCode20 = (iHashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj12 = this.regn_no;
        int iHashCode21 = (iHashCode20 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        String str7 = this.vahanVerify;
        return iHashCode21 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "VtInsuranceCommonDto(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", descr=" + this.descr + ", descr1=" + this.descr1 + ", ic_code=" + this.ic_code + ", idv=" + this.idv + ", insFrom=" + this.insFrom + ", insUpto=" + this.insUpto + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", instyp_code=" + this.instyp_code + ", instypeName=" + this.instypeName + ", insuranceFrom=" + this.insuranceFrom + ", insuranceMessge=" + this.insuranceMessge + ", insuranceType=" + this.insuranceType + ", insuranceUpto=" + this.insuranceUpto + ", issuerCd=" + this.issuerCd + ", issuerName=" + this.issuerName + ", moved_by=" + this.moved_by + ", moved_on=" + this.moved_on + ", op_dt=" + this.op_dt + ", opdt=" + this.opdt + ", policyNo=" + this.policyNo + ", policy_no=" + this.policy_no + ", regnNo=" + this.regnNo + ", regn_no=" + this.regn_no + ", vahanVerify=" + this.vahanVerify + ')';
    }
}
