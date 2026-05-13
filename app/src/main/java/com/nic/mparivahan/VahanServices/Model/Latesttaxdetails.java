package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0010HÆ\u0003J\t\u0010%\u001a\u00020\u0001HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\nHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Model/Latesttaxdetails;", "", "collected_by", "", "flag", "payment_mode", "rcpt_dt", "", "regn_no", "tax_amt", "", "tax_fine", "tax_from", "tax_mode", "tax_upto", "vtTaxEntityByid", "Lcom/nic/mparivahan/VahanServices/Model/VtTaxEntityByid;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;JLjava/lang/String;IIJLjava/lang/String;JLcom/nic/mparivahan/VahanServices/Model/VtTaxEntityByid;)V", "getCollected_by", "()Ljava/lang/String;", "getFlag", "()Ljava/lang/Object;", "getPayment_mode", "getRcpt_dt", "()J", "getRegn_no", "getTax_amt", "()I", "getTax_fine", "getTax_from", "getTax_mode", "getTax_upto", "getVtTaxEntityByid", "()Lcom/nic/mparivahan/VahanServices/Model/VtTaxEntityByid;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Latesttaxdetails {
    private final String collected_by;
    private final Object flag;
    private final String payment_mode;
    private final long rcpt_dt;
    private final String regn_no;
    private final int tax_amt;
    private final int tax_fine;
    private final long tax_from;
    private final String tax_mode;
    private final long tax_upto;
    private final VtTaxEntityByid vtTaxEntityByid;

    public Latesttaxdetails(String collected_by, Object flag, String payment_mode, long j, String regn_no, int i, int i2, long j2, String tax_mode, long j3, VtTaxEntityByid vtTaxEntityByid) {
        Intrinsics.checkNotNullParameter(collected_by, "collected_by");
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(payment_mode, "payment_mode");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        Intrinsics.checkNotNullParameter(vtTaxEntityByid, "vtTaxEntityByid");
        this.collected_by = collected_by;
        this.flag = flag;
        this.payment_mode = payment_mode;
        this.rcpt_dt = j;
        this.regn_no = regn_no;
        this.tax_amt = i;
        this.tax_fine = i2;
        this.tax_from = j2;
        this.tax_mode = tax_mode;
        this.tax_upto = j3;
        this.vtTaxEntityByid = vtTaxEntityByid;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCollected_by() {
        return this.collected_by;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTax_upto() {
        return this.tax_upto;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VtTaxEntityByid getVtTaxEntityByid() {
        return this.vtTaxEntityByid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayment_mode() {
        return this.payment_mode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRcpt_dt() {
        return this.rcpt_dt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTax_amt() {
        return this.tax_amt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTax_fine() {
        return this.tax_fine;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTax_from() {
        return this.tax_from;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final Latesttaxdetails copy(String collected_by, Object flag, String payment_mode, long rcpt_dt, String regn_no, int tax_amt, int tax_fine, long tax_from, String tax_mode, long tax_upto, VtTaxEntityByid vtTaxEntityByid) {
        Intrinsics.checkNotNullParameter(collected_by, "collected_by");
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(payment_mode, "payment_mode");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        Intrinsics.checkNotNullParameter(vtTaxEntityByid, "vtTaxEntityByid");
        return new Latesttaxdetails(collected_by, flag, payment_mode, rcpt_dt, regn_no, tax_amt, tax_fine, tax_from, tax_mode, tax_upto, vtTaxEntityByid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Latesttaxdetails)) {
            return false;
        }
        Latesttaxdetails latesttaxdetails = (Latesttaxdetails) other;
        return Intrinsics.areEqual(this.collected_by, latesttaxdetails.collected_by) && Intrinsics.areEqual(this.flag, latesttaxdetails.flag) && Intrinsics.areEqual(this.payment_mode, latesttaxdetails.payment_mode) && this.rcpt_dt == latesttaxdetails.rcpt_dt && Intrinsics.areEqual(this.regn_no, latesttaxdetails.regn_no) && this.tax_amt == latesttaxdetails.tax_amt && this.tax_fine == latesttaxdetails.tax_fine && this.tax_from == latesttaxdetails.tax_from && Intrinsics.areEqual(this.tax_mode, latesttaxdetails.tax_mode) && this.tax_upto == latesttaxdetails.tax_upto && Intrinsics.areEqual(this.vtTaxEntityByid, latesttaxdetails.vtTaxEntityByid);
    }

    public final String getCollected_by() {
        return this.collected_by;
    }

    public final Object getFlag() {
        return this.flag;
    }

    public final String getPayment_mode() {
        return this.payment_mode;
    }

    public final long getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final int getTax_amt() {
        return this.tax_amt;
    }

    public final int getTax_fine() {
        return this.tax_fine;
    }

    public final long getTax_from() {
        return this.tax_from;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final long getTax_upto() {
        return this.tax_upto;
    }

    public final VtTaxEntityByid getVtTaxEntityByid() {
        return this.vtTaxEntityByid;
    }

    public int hashCode() {
        return (((((((((((((((((((this.collected_by.hashCode() * 31) + this.flag.hashCode()) * 31) + this.payment_mode.hashCode()) * 31) + Long.hashCode(this.rcpt_dt)) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.tax_amt)) * 31) + Integer.hashCode(this.tax_fine)) * 31) + Long.hashCode(this.tax_from)) * 31) + this.tax_mode.hashCode()) * 31) + Long.hashCode(this.tax_upto)) * 31) + this.vtTaxEntityByid.hashCode();
    }

    public String toString() {
        return "Latesttaxdetails(collected_by=" + this.collected_by + ", flag=" + this.flag + ", payment_mode=" + this.payment_mode + ", rcpt_dt=" + this.rcpt_dt + ", regn_no=" + this.regn_no + ", tax_amt=" + this.tax_amt + ", tax_fine=" + this.tax_fine + ", tax_from=" + this.tax_from + ", tax_mode=" + this.tax_mode + ", tax_upto=" + this.tax_upto + ", vtTaxEntityByid=" + this.vtTaxEntityByid + ')';
    }
}
