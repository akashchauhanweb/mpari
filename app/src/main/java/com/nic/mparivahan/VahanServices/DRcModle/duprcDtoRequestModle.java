package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u0083\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0005HÆ\u0001J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\u0005HÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"¨\u0006Z"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DRcModle/duprcDtoRequestModle;", "", "appl_no", "", "comp_cd", "", "duprcDto", "Lcom/nic/mparivahan/VahanServices/DRcModle/DuprcDto;", "fir_dt", "fir_no", "idv", "ins_from", "ins_type", "ins_upto", "msg", "off_cd", "op_dt", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "reason", "regn_no", "state_cd", "state_header", "status", "tax_mode", "vh_class", "(Ljava/lang/String;ILcom/nic/mparivahan/VahanServices/DRcModle/DuprcDto;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAppl_no", "()Ljava/lang/String;", "getComp_cd", "()I", "getDuprcDto", "()Lcom/nic/mparivahan/VahanServices/DRcModle/DuprcDto;", "getFir_dt", "getFir_no", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMsg", "getOff_cd", "getOp_dt", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "getReason", "getRegn_no", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class duprcDtoRequestModle {
    private final String appl_no;
    private final int comp_cd;
    private final DuprcDto duprcDto;
    private final String fir_dt;
    private final String fir_no;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final String msg;
    private final String off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final int pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final int rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final int vh_class;

    public duprcDtoRequestModle(String appl_no, int i, DuprcDto duprcDto, String fir_dt, String fir_no, int i2, String ins_from, int i3, String ins_upto, String msg, String off_cd, String op_dt, String police_station, String policy_no, int i4, String rcp_dt, String rcpt_NO, int i5, String reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, int i6) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(duprcDto, "duprcDto");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        this.appl_no = appl_no;
        this.comp_cd = i;
        this.duprcDto = duprcDto;
        this.fir_dt = fir_dt;
        this.fir_no = fir_no;
        this.idv = i2;
        this.ins_from = ins_from;
        this.ins_type = i3;
        this.ins_upto = ins_upto;
        this.msg = msg;
        this.off_cd = off_cd;
        this.op_dt = op_dt;
        this.police_station = police_station;
        this.policy_no = policy_no;
        this.pur_cd = i4;
        this.rcp_dt = rcp_dt;
        this.rcpt_NO = rcpt_NO;
        this.rcpt_amt = i5;
        this.reason = reason;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.state_header = state_header;
        this.status = status;
        this.tax_mode = tax_mode;
        this.vh_class = i6;
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
    public final int getPur_cd() {
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
    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getComp_cd() {
        return this.comp_cd;
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
    public final int getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DuprcDto getDuprcDto() {
        return this.duprcDto;
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
    public final int getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final duprcDtoRequestModle copy(String appl_no, int comp_cd, DuprcDto duprcDto, String fir_dt, String fir_no, int idv, String ins_from, int ins_type, String ins_upto, String msg, String off_cd, String op_dt, String police_station, String policy_no, int pur_cd, String rcp_dt, String rcpt_NO, int rcpt_amt, String reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, int vh_class) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(duprcDto, "duprcDto");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        return new duprcDtoRequestModle(appl_no, comp_cd, duprcDto, fir_dt, fir_no, idv, ins_from, ins_type, ins_upto, msg, off_cd, op_dt, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, state_cd, state_header, status, tax_mode, vh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof duprcDtoRequestModle)) {
            return false;
        }
        duprcDtoRequestModle duprcdtorequestmodle = (duprcDtoRequestModle) other;
        return Intrinsics.areEqual(this.appl_no, duprcdtorequestmodle.appl_no) && this.comp_cd == duprcdtorequestmodle.comp_cd && Intrinsics.areEqual(this.duprcDto, duprcdtorequestmodle.duprcDto) && Intrinsics.areEqual(this.fir_dt, duprcdtorequestmodle.fir_dt) && Intrinsics.areEqual(this.fir_no, duprcdtorequestmodle.fir_no) && this.idv == duprcdtorequestmodle.idv && Intrinsics.areEqual(this.ins_from, duprcdtorequestmodle.ins_from) && this.ins_type == duprcdtorequestmodle.ins_type && Intrinsics.areEqual(this.ins_upto, duprcdtorequestmodle.ins_upto) && Intrinsics.areEqual(this.msg, duprcdtorequestmodle.msg) && Intrinsics.areEqual(this.off_cd, duprcdtorequestmodle.off_cd) && Intrinsics.areEqual(this.op_dt, duprcdtorequestmodle.op_dt) && Intrinsics.areEqual(this.police_station, duprcdtorequestmodle.police_station) && Intrinsics.areEqual(this.policy_no, duprcdtorequestmodle.policy_no) && this.pur_cd == duprcdtorequestmodle.pur_cd && Intrinsics.areEqual(this.rcp_dt, duprcdtorequestmodle.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, duprcdtorequestmodle.rcpt_NO) && this.rcpt_amt == duprcdtorequestmodle.rcpt_amt && Intrinsics.areEqual(this.reason, duprcdtorequestmodle.reason) && Intrinsics.areEqual(this.regn_no, duprcdtorequestmodle.regn_no) && Intrinsics.areEqual(this.state_cd, duprcdtorequestmodle.state_cd) && Intrinsics.areEqual(this.state_header, duprcdtorequestmodle.state_header) && Intrinsics.areEqual(this.status, duprcdtorequestmodle.status) && Intrinsics.areEqual(this.tax_mode, duprcdtorequestmodle.tax_mode) && this.vh_class == duprcdtorequestmodle.vh_class;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final DuprcDto getDuprcDto() {
        return this.duprcDto;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final int getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
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

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final int getRcpt_amt() {
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

    public final int getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + Integer.hashCode(this.comp_cd)) * 31) + this.duprcDto.hashCode()) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + Integer.hashCode(this.vh_class);
    }

    public String toString() {
        return "duprcDtoRequestModle(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", duprcDto=" + this.duprcDto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }

    public /* synthetic */ duprcDtoRequestModle(String str, int i, DuprcDto duprcDto, String str2, String str3, int i2, String str4, int i3, String str5, String str6, String str7, String str8, String str9, String str10, int i4, String str11, String str12, int i5, String str13, String str14, String str15, String str16, String str17, String str18, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 22 : i, duprcDto, str2, str3, (i7 & 32) != 0 ? 0 : i2, str4, (i7 & 128) != 0 ? 1 : i3, str5, str6, str7, str8, str9, str10, (i7 & 16384) != 0 ? 0 : i4, str11, str12, (131072 & i7) != 0 ? 0 : i5, str13, str14, str15, str16, str17, (i7 & 8388608) != 0 ? "L" : str18, i6);
    }
}
