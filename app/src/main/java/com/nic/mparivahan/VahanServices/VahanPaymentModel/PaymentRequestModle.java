package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/PaymentRequestModle;", "", "appl_no", "", "channgeOfAdressDto", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/ChanngeOfAdressDto;", "comp_cd", "fir_dt", "fir_no", "idv", "ins_from", "ins_type", "ins_upto", "msg", "off_cd", "op_dt", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "reason", "regn_no", "state_cd", "state_header", "status", "tax_mode", "vh_class", "(Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/ChanngeOfAdressDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppl_no", "()Ljava/lang/String;", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/ChanngeOfAdressDto;", "getComp_cd", "getFir_dt", "getFir_no", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMsg", "getOff_cd", "getOp_dt", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "getReason", "getRegn_no", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentRequestModle {
    private final String appl_no;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final String comp_cd;
    private final String fir_dt;
    private final String fir_no;
    private final String idv;
    private final String ins_from;
    private final String ins_type;
    private final String ins_upto;
    private final String msg;
    private final String off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final String rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final String vh_class;

    public PaymentRequestModle(String appl_no, ChanngeOfAdressDto channgeOfAdressDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(channgeOfAdressDto, "channgeOfAdressDto");
        this.appl_no = appl_no;
        this.channgeOfAdressDto = channgeOfAdressDto;
        this.comp_cd = str;
        this.fir_dt = str2;
        this.fir_no = str3;
        this.idv = str4;
        this.ins_from = str5;
        this.ins_type = str6;
        this.ins_upto = str7;
        this.msg = str8;
        this.off_cd = str9;
        this.op_dt = str10;
        this.police_station = str11;
        this.policy_no = str12;
        this.pur_cd = str13;
        this.rcp_dt = str14;
        this.rcpt_NO = str15;
        this.rcpt_amt = str16;
        this.reason = str17;
        this.regn_no = str18;
        this.state_cd = str19;
        this.state_header = str20;
        this.status = str21;
        this.tax_mode = str22;
        this.vh_class = str23;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFir_no() {
        return this.fir_no;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final PaymentRequestModle copy(String appl_no, ChanngeOfAdressDto channgeOfAdressDto, String comp_cd, String fir_dt, String fir_no, String idv, String ins_from, String ins_type, String ins_upto, String msg, String off_cd, String op_dt, String police_station, String policy_no, String pur_cd, String rcp_dt, String rcpt_NO, String rcpt_amt, String reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, String vh_class) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(channgeOfAdressDto, "channgeOfAdressDto");
        return new PaymentRequestModle(appl_no, channgeOfAdressDto, comp_cd, fir_dt, fir_no, idv, ins_from, ins_type, ins_upto, msg, off_cd, op_dt, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, state_cd, state_header, status, tax_mode, vh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentRequestModle)) {
            return false;
        }
        PaymentRequestModle paymentRequestModle = (PaymentRequestModle) other;
        return Intrinsics.areEqual(this.appl_no, paymentRequestModle.appl_no) && Intrinsics.areEqual(this.channgeOfAdressDto, paymentRequestModle.channgeOfAdressDto) && Intrinsics.areEqual(this.comp_cd, paymentRequestModle.comp_cd) && Intrinsics.areEqual(this.fir_dt, paymentRequestModle.fir_dt) && Intrinsics.areEqual(this.fir_no, paymentRequestModle.fir_no) && Intrinsics.areEqual(this.idv, paymentRequestModle.idv) && Intrinsics.areEqual(this.ins_from, paymentRequestModle.ins_from) && Intrinsics.areEqual(this.ins_type, paymentRequestModle.ins_type) && Intrinsics.areEqual(this.ins_upto, paymentRequestModle.ins_upto) && Intrinsics.areEqual(this.msg, paymentRequestModle.msg) && Intrinsics.areEqual(this.off_cd, paymentRequestModle.off_cd) && Intrinsics.areEqual(this.op_dt, paymentRequestModle.op_dt) && Intrinsics.areEqual(this.police_station, paymentRequestModle.police_station) && Intrinsics.areEqual(this.policy_no, paymentRequestModle.policy_no) && Intrinsics.areEqual(this.pur_cd, paymentRequestModle.pur_cd) && Intrinsics.areEqual(this.rcp_dt, paymentRequestModle.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, paymentRequestModle.rcpt_NO) && Intrinsics.areEqual(this.rcpt_amt, paymentRequestModle.rcpt_amt) && Intrinsics.areEqual(this.reason, paymentRequestModle.reason) && Intrinsics.areEqual(this.regn_no, paymentRequestModle.regn_no) && Intrinsics.areEqual(this.state_cd, paymentRequestModle.state_cd) && Intrinsics.areEqual(this.state_header, paymentRequestModle.state_header) && Intrinsics.areEqual(this.status, paymentRequestModle.status) && Intrinsics.areEqual(this.tax_mode, paymentRequestModle.tax_mode) && Intrinsics.areEqual(this.vh_class, paymentRequestModle.vh_class);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final String getComp_cd() {
        return this.comp_cd;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final String getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final String getIns_type() {
        return this.ins_type;
    }

    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final String getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_header() {
        return this.state_header;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        int iHashCode = ((this.appl_no.hashCode() * 31) + this.channgeOfAdressDto.hashCode()) * 31;
        String str = this.comp_cd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fir_dt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fir_no;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.idv;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ins_from;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ins_type;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ins_upto;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.msg;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.off_cd;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.op_dt;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.police_station;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.policy_no;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.pur_cd;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rcp_dt;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rcpt_NO;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rcpt_amt;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.reason;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.regn_no;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.state_cd;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.state_header;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.status;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.tax_mode;
        int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.vh_class;
        return iHashCode23 + (str23 != null ? str23.hashCode() : 0);
    }

    public String toString() {
        return "PaymentRequestModle(appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }

    public /* synthetic */ PaymentRequestModle(String str, ChanngeOfAdressDto channgeOfAdressDto, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, channgeOfAdressDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str12, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : str15, (65536 & i) != 0 ? null : str16, (131072 & i) != 0 ? null : str17, (262144 & i) != 0 ? null : str18, (524288 & i) != 0 ? null : str19, (1048576 & i) != 0 ? null : str20, (2097152 & i) != 0 ? null : str21, (4194304 & i) != 0 ? null : str22, (8388608 & i) != 0 ? null : str23, (i & 16777216) != 0 ? null : str24);
    }
}
