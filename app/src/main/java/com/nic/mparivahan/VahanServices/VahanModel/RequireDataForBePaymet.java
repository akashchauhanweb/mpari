package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0001HÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0001HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "", "bank_code", "", "off_cd", "", "payment_mode", "rcpt_amt", "rcpt_dt", "regn_no", "response_code", "return_rcpt_no", "rto_challan_dt", "state_cd", "treasury_ref_no", "vp_details_EntityById", "Lcom/nic/mparivahan/VahanServices/VahanModel/VpDetailsEntityById;", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/nic/mparivahan/VahanServices/VahanModel/VpDetailsEntityById;)V", "getBank_code", "()Ljava/lang/String;", "getOff_cd", "()I", "getPayment_mode", "getRcpt_amt", "getRcpt_dt", "getRegn_no", "getResponse_code", "getReturn_rcpt_no", "getRto_challan_dt", "()Ljava/lang/Object;", "getState_cd", "getTreasury_ref_no", "getVp_details_EntityById", "()Lcom/nic/mparivahan/VahanServices/VahanModel/VpDetailsEntityById;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RequireDataForBePaymet {
    private final String bank_code;
    private final int off_cd;
    private final String payment_mode;
    private final int rcpt_amt;
    private final String rcpt_dt;
    private final String regn_no;
    private final String response_code;
    private final String return_rcpt_no;
    private final Object rto_challan_dt;
    private final String state_cd;
    private final Object treasury_ref_no;
    private final VpDetailsEntityById vp_details_EntityById;

    public RequireDataForBePaymet(String bank_code, int i, String payment_mode, int i2, String rcpt_dt, String regn_no, String response_code, String return_rcpt_no, Object rto_challan_dt, String state_cd, Object treasury_ref_no, VpDetailsEntityById vp_details_EntityById) {
        Intrinsics.checkNotNullParameter(bank_code, "bank_code");
        Intrinsics.checkNotNullParameter(payment_mode, "payment_mode");
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(response_code, "response_code");
        Intrinsics.checkNotNullParameter(return_rcpt_no, "return_rcpt_no");
        Intrinsics.checkNotNullParameter(rto_challan_dt, "rto_challan_dt");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(treasury_ref_no, "treasury_ref_no");
        Intrinsics.checkNotNullParameter(vp_details_EntityById, "vp_details_EntityById");
        this.bank_code = bank_code;
        this.off_cd = i;
        this.payment_mode = payment_mode;
        this.rcpt_amt = i2;
        this.rcpt_dt = rcpt_dt;
        this.regn_no = regn_no;
        this.response_code = response_code;
        this.return_rcpt_no = return_rcpt_no;
        this.rto_challan_dt = rto_challan_dt;
        this.state_cd = state_cd;
        this.treasury_ref_no = treasury_ref_no;
        this.vp_details_EntityById = vp_details_EntityById;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBank_code() {
        return this.bank_code;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getTreasury_ref_no() {
        return this.treasury_ref_no;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final VpDetailsEntityById getVp_details_EntityById() {
        return this.vp_details_EntityById;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayment_mode() {
        return this.payment_mode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getResponse_code() {
        return this.response_code;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReturn_rcpt_no() {
        return this.return_rcpt_no;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getRto_challan_dt() {
        return this.rto_challan_dt;
    }

    public final RequireDataForBePaymet copy(String bank_code, int off_cd, String payment_mode, int rcpt_amt, String rcpt_dt, String regn_no, String response_code, String return_rcpt_no, Object rto_challan_dt, String state_cd, Object treasury_ref_no, VpDetailsEntityById vp_details_EntityById) {
        Intrinsics.checkNotNullParameter(bank_code, "bank_code");
        Intrinsics.checkNotNullParameter(payment_mode, "payment_mode");
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(response_code, "response_code");
        Intrinsics.checkNotNullParameter(return_rcpt_no, "return_rcpt_no");
        Intrinsics.checkNotNullParameter(rto_challan_dt, "rto_challan_dt");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(treasury_ref_no, "treasury_ref_no");
        Intrinsics.checkNotNullParameter(vp_details_EntityById, "vp_details_EntityById");
        return new RequireDataForBePaymet(bank_code, off_cd, payment_mode, rcpt_amt, rcpt_dt, regn_no, response_code, return_rcpt_no, rto_challan_dt, state_cd, treasury_ref_no, vp_details_EntityById);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequireDataForBePaymet)) {
            return false;
        }
        RequireDataForBePaymet requireDataForBePaymet = (RequireDataForBePaymet) other;
        return Intrinsics.areEqual(this.bank_code, requireDataForBePaymet.bank_code) && this.off_cd == requireDataForBePaymet.off_cd && Intrinsics.areEqual(this.payment_mode, requireDataForBePaymet.payment_mode) && this.rcpt_amt == requireDataForBePaymet.rcpt_amt && Intrinsics.areEqual(this.rcpt_dt, requireDataForBePaymet.rcpt_dt) && Intrinsics.areEqual(this.regn_no, requireDataForBePaymet.regn_no) && Intrinsics.areEqual(this.response_code, requireDataForBePaymet.response_code) && Intrinsics.areEqual(this.return_rcpt_no, requireDataForBePaymet.return_rcpt_no) && Intrinsics.areEqual(this.rto_challan_dt, requireDataForBePaymet.rto_challan_dt) && Intrinsics.areEqual(this.state_cd, requireDataForBePaymet.state_cd) && Intrinsics.areEqual(this.treasury_ref_no, requireDataForBePaymet.treasury_ref_no) && Intrinsics.areEqual(this.vp_details_EntityById, requireDataForBePaymet.vp_details_EntityById);
    }

    public final String getBank_code() {
        return this.bank_code;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getPayment_mode() {
        return this.payment_mode;
    }

    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getResponse_code() {
        return this.response_code;
    }

    public final String getReturn_rcpt_no() {
        return this.return_rcpt_no;
    }

    public final Object getRto_challan_dt() {
        return this.rto_challan_dt;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final Object getTreasury_ref_no() {
        return this.treasury_ref_no;
    }

    public final VpDetailsEntityById getVp_details_EntityById() {
        return this.vp_details_EntityById;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.bank_code.hashCode() * 31) + Integer.hashCode(this.off_cd)) * 31) + this.payment_mode.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.rcpt_dt.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.response_code.hashCode()) * 31) + this.return_rcpt_no.hashCode()) * 31) + this.rto_challan_dt.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.treasury_ref_no.hashCode()) * 31) + this.vp_details_EntityById.hashCode();
    }

    public String toString() {
        return "RequireDataForBePaymet(bank_code=" + this.bank_code + ", off_cd=" + this.off_cd + ", payment_mode=" + this.payment_mode + ", rcpt_amt=" + this.rcpt_amt + ", rcpt_dt=" + this.rcpt_dt + ", regn_no=" + this.regn_no + ", response_code=" + this.response_code + ", return_rcpt_no=" + this.return_rcpt_no + ", rto_challan_dt=" + this.rto_challan_dt + ", state_cd=" + this.state_cd + ", treasury_ref_no=" + this.treasury_ref_no + ", vp_details_EntityById=" + this.vp_details_EntityById + ')';
    }
}
