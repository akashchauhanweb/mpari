package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u000eHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003Jù\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005HÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010U\u001a\u00020\u000eHÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!¨\u0006W"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/Durcdto;", "Ljava/io/Serializable;", "appl_no", "", "comp_cd", "", "fir_dt", "fir_no", "idv", "ins_from", "ins_type", "ins_upto", "msg", "off_cd", "", "op_dt", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "reason", "regn_no", "state_cd", "state_header", "status", "tax_mode", "vh_class", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getAppl_no", "()Ljava/lang/String;", "getComp_cd", "()Ljava/lang/Object;", "getFir_dt", "getFir_no", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMsg", "getOff_cd", "()I", "getOp_dt", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "getReason", "getRegn_no", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Durcdto implements Serializable {
    private final String appl_no;
    private final Object comp_cd;
    private final Object fir_dt;
    private final String fir_no;
    private final Object idv;
    private final Object ins_from;
    private final Object ins_type;
    private final Object ins_upto;
    private final Object msg;
    private final int off_cd;
    private final String op_dt;
    private final String police_station;
    private final Object policy_no;
    private final int pur_cd;
    private final Object rcp_dt;
    private final Object rcpt_NO;
    private final int rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final Object state_header;
    private final Object status;
    private final Object tax_mode;
    private final Object vh_class;

    public Durcdto(String appl_no, Object comp_cd, Object fir_dt, String fir_no, Object idv, Object ins_from, Object ins_type, Object ins_upto, Object msg, int i, String op_dt, String police_station, Object policy_no, int i2, Object rcp_dt, Object rcpt_NO, int i3, String reason, String regn_no, String state_cd, Object state_header, Object status, Object tax_mode, Object vh_class) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(comp_cd, "comp_cd");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(idv, "idv");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_type, "ins_type");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
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
        Intrinsics.checkNotNullParameter(vh_class, "vh_class");
        this.appl_no = appl_no;
        this.comp_cd = comp_cd;
        this.fir_dt = fir_dt;
        this.fir_no = fir_no;
        this.idv = idv;
        this.ins_from = ins_from;
        this.ins_type = ins_type;
        this.ins_upto = ins_upto;
        this.msg = msg;
        this.off_cd = i;
        this.op_dt = op_dt;
        this.police_station = police_station;
        this.policy_no = policy_no;
        this.pur_cd = i2;
        this.rcp_dt = rcp_dt;
        this.rcpt_NO = rcpt_NO;
        this.rcpt_amt = i3;
        this.reason = reason;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.state_header = state_header;
        this.status = status;
        this.tax_mode = tax_mode;
        this.vh_class = vh_class;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Object getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Object getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFir_no() {
        return this.fir_no;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getMsg() {
        return this.msg;
    }

    public final Durcdto copy(String appl_no, Object comp_cd, Object fir_dt, String fir_no, Object idv, Object ins_from, Object ins_type, Object ins_upto, Object msg, int off_cd, String op_dt, String police_station, Object policy_no, int pur_cd, Object rcp_dt, Object rcpt_NO, int rcpt_amt, String reason, String regn_no, String state_cd, Object state_header, Object status, Object tax_mode, Object vh_class) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(comp_cd, "comp_cd");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(idv, "idv");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_type, "ins_type");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
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
        Intrinsics.checkNotNullParameter(vh_class, "vh_class");
        return new Durcdto(appl_no, comp_cd, fir_dt, fir_no, idv, ins_from, ins_type, ins_upto, msg, off_cd, op_dt, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, state_cd, state_header, status, tax_mode, vh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Durcdto)) {
            return false;
        }
        Durcdto durcdto = (Durcdto) other;
        return Intrinsics.areEqual(this.appl_no, durcdto.appl_no) && Intrinsics.areEqual(this.comp_cd, durcdto.comp_cd) && Intrinsics.areEqual(this.fir_dt, durcdto.fir_dt) && Intrinsics.areEqual(this.fir_no, durcdto.fir_no) && Intrinsics.areEqual(this.idv, durcdto.idv) && Intrinsics.areEqual(this.ins_from, durcdto.ins_from) && Intrinsics.areEqual(this.ins_type, durcdto.ins_type) && Intrinsics.areEqual(this.ins_upto, durcdto.ins_upto) && Intrinsics.areEqual(this.msg, durcdto.msg) && this.off_cd == durcdto.off_cd && Intrinsics.areEqual(this.op_dt, durcdto.op_dt) && Intrinsics.areEqual(this.police_station, durcdto.police_station) && Intrinsics.areEqual(this.policy_no, durcdto.policy_no) && this.pur_cd == durcdto.pur_cd && Intrinsics.areEqual(this.rcp_dt, durcdto.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, durcdto.rcpt_NO) && this.rcpt_amt == durcdto.rcpt_amt && Intrinsics.areEqual(this.reason, durcdto.reason) && Intrinsics.areEqual(this.regn_no, durcdto.regn_no) && Intrinsics.areEqual(this.state_cd, durcdto.state_cd) && Intrinsics.areEqual(this.state_header, durcdto.state_header) && Intrinsics.areEqual(this.status, durcdto.status) && Intrinsics.areEqual(this.tax_mode, durcdto.tax_mode) && Intrinsics.areEqual(this.vh_class, durcdto.vh_class);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final Object getComp_cd() {
        return this.comp_cd;
    }

    public final Object getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final Object getIdv() {
        return this.idv;
    }

    public final Object getIns_from() {
        return this.ins_from;
    }

    public final Object getIns_type() {
        return this.ins_type;
    }

    public final Object getIns_upto() {
        return this.ins_upto;
    }

    public final Object getMsg() {
        return this.msg;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final Object getPolicy_no() {
        return this.policy_no;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final Object getRcp_dt() {
        return this.rcp_dt;
    }

    public final Object getRcpt_NO() {
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

    public final Object getState_header() {
        return this.state_header;
    }

    public final Object getStatus() {
        return this.status;
    }

    public final Object getTax_mode() {
        return this.tax_mode;
    }

    public final Object getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + this.comp_cd.hashCode()) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + this.idv.hashCode()) * 31) + this.ins_from.hashCode()) * 31) + this.ins_type.hashCode()) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + this.vh_class.hashCode();
    }

    public String toString() {
        return "Durcdto(appl_no=" + this.appl_no + ", comp_cd=" + this.comp_cd + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }
}
