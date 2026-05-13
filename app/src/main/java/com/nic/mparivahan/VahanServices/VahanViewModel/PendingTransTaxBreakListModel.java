package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003JÇ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\nHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001c¨\u0006H"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanViewModel/PendingTransTaxBreakListModel;", "", "state_cd", "", "off_cd", "totalAmount", "", "regnNo", "finalTaxAmount", "pur_cd", "", "totalPaybaleTax", "totalPaybalePenalty", "totalPaybaleSurcharge", "totalPaybaleRebate", "totalPaybaleInterest", "totalPaybaleTax1", "totalPaybaleTax2", "vtTaxFinalTax", "previousAdjustment", "no_adv_units", "vtTaxFinalFine", "taxPurcdDesc", "applNo", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JIJJJJJJJJJIJLjava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getFinalTaxAmount", "()J", "getNo_adv_units", "()I", "getOff_cd", "getPreviousAdjustment", "getPur_cd", "getRegnNo", "getState_cd", "getTaxPurcdDesc", "getTotalAmount", "getTotalPaybaleInterest", "getTotalPaybalePenalty", "getTotalPaybaleRebate", "getTotalPaybaleSurcharge", "getTotalPaybaleTax", "getTotalPaybaleTax1", "getTotalPaybaleTax2", "getVtTaxFinalFine", "getVtTaxFinalTax", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PendingTransTaxBreakListModel {
    private final String applNo;
    private final long finalTaxAmount;
    private final int no_adv_units;
    private final String off_cd;
    private final long previousAdjustment;
    private final int pur_cd;
    private final String regnNo;
    private final String state_cd;
    private final String taxPurcdDesc;
    private final long totalAmount;
    private final long totalPaybaleInterest;
    private final long totalPaybalePenalty;
    private final long totalPaybaleRebate;
    private final long totalPaybaleSurcharge;
    private final long totalPaybaleTax;
    private final long totalPaybaleTax1;
    private final long totalPaybaleTax2;
    private final long vtTaxFinalFine;
    private final long vtTaxFinalTax;

    public PendingTransTaxBreakListModel(String state_cd, String off_cd, long j, String regnNo, long j2, int i, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i2, long j12, String taxPurcdDesc, String applNo) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(taxPurcdDesc, "taxPurcdDesc");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        this.state_cd = state_cd;
        this.off_cd = off_cd;
        this.totalAmount = j;
        this.regnNo = regnNo;
        this.finalTaxAmount = j2;
        this.pur_cd = i;
        this.totalPaybaleTax = j3;
        this.totalPaybalePenalty = j4;
        this.totalPaybaleSurcharge = j5;
        this.totalPaybaleRebate = j6;
        this.totalPaybaleInterest = j7;
        this.totalPaybaleTax1 = j8;
        this.totalPaybaleTax2 = j9;
        this.vtTaxFinalTax = j10;
        this.previousAdjustment = j11;
        this.no_adv_units = i2;
        this.vtTaxFinalFine = j12;
        this.taxPurcdDesc = taxPurcdDesc;
        this.applNo = applNo;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getNo_adv_units() {
        return this.no_adv_units;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    public final PendingTransTaxBreakListModel copy(String state_cd, String off_cd, long totalAmount, String regnNo, long finalTaxAmount, int pur_cd, long totalPaybaleTax, long totalPaybalePenalty, long totalPaybaleSurcharge, long totalPaybaleRebate, long totalPaybaleInterest, long totalPaybaleTax1, long totalPaybaleTax2, long vtTaxFinalTax, long previousAdjustment, int no_adv_units, long vtTaxFinalFine, String taxPurcdDesc, String applNo) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(taxPurcdDesc, "taxPurcdDesc");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        return new PendingTransTaxBreakListModel(state_cd, off_cd, totalAmount, regnNo, finalTaxAmount, pur_cd, totalPaybaleTax, totalPaybalePenalty, totalPaybaleSurcharge, totalPaybaleRebate, totalPaybaleInterest, totalPaybaleTax1, totalPaybaleTax2, vtTaxFinalTax, previousAdjustment, no_adv_units, vtTaxFinalFine, taxPurcdDesc, applNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingTransTaxBreakListModel)) {
            return false;
        }
        PendingTransTaxBreakListModel pendingTransTaxBreakListModel = (PendingTransTaxBreakListModel) other;
        return Intrinsics.areEqual(this.state_cd, pendingTransTaxBreakListModel.state_cd) && Intrinsics.areEqual(this.off_cd, pendingTransTaxBreakListModel.off_cd) && this.totalAmount == pendingTransTaxBreakListModel.totalAmount && Intrinsics.areEqual(this.regnNo, pendingTransTaxBreakListModel.regnNo) && this.finalTaxAmount == pendingTransTaxBreakListModel.finalTaxAmount && this.pur_cd == pendingTransTaxBreakListModel.pur_cd && this.totalPaybaleTax == pendingTransTaxBreakListModel.totalPaybaleTax && this.totalPaybalePenalty == pendingTransTaxBreakListModel.totalPaybalePenalty && this.totalPaybaleSurcharge == pendingTransTaxBreakListModel.totalPaybaleSurcharge && this.totalPaybaleRebate == pendingTransTaxBreakListModel.totalPaybaleRebate && this.totalPaybaleInterest == pendingTransTaxBreakListModel.totalPaybaleInterest && this.totalPaybaleTax1 == pendingTransTaxBreakListModel.totalPaybaleTax1 && this.totalPaybaleTax2 == pendingTransTaxBreakListModel.totalPaybaleTax2 && this.vtTaxFinalTax == pendingTransTaxBreakListModel.vtTaxFinalTax && this.previousAdjustment == pendingTransTaxBreakListModel.previousAdjustment && this.no_adv_units == pendingTransTaxBreakListModel.no_adv_units && this.vtTaxFinalFine == pendingTransTaxBreakListModel.vtTaxFinalFine && Intrinsics.areEqual(this.taxPurcdDesc, pendingTransTaxBreakListModel.taxPurcdDesc) && Intrinsics.areEqual(this.applNo, pendingTransTaxBreakListModel.applNo);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final long getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    public final int getNo_adv_units() {
        return this.no_adv_units;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final long getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public final long getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    public final long getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    public final long getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    public final long getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    public final long getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    public final long getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    public final long getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    public final long getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    public final long getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.state_cd.hashCode() * 31) + this.off_cd.hashCode()) * 31) + Long.hashCode(this.totalAmount)) * 31) + this.regnNo.hashCode()) * 31) + Long.hashCode(this.finalTaxAmount)) * 31) + Integer.hashCode(this.pur_cd)) * 31) + Long.hashCode(this.totalPaybaleTax)) * 31) + Long.hashCode(this.totalPaybalePenalty)) * 31) + Long.hashCode(this.totalPaybaleSurcharge)) * 31) + Long.hashCode(this.totalPaybaleRebate)) * 31) + Long.hashCode(this.totalPaybaleInterest)) * 31) + Long.hashCode(this.totalPaybaleTax1)) * 31) + Long.hashCode(this.totalPaybaleTax2)) * 31) + Long.hashCode(this.vtTaxFinalTax)) * 31) + Long.hashCode(this.previousAdjustment)) * 31) + Integer.hashCode(this.no_adv_units)) * 31) + Long.hashCode(this.vtTaxFinalFine)) * 31) + this.taxPurcdDesc.hashCode()) * 31) + this.applNo.hashCode();
    }

    public String toString() {
        return "PendingTransTaxBreakListModel(state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", totalAmount=" + this.totalAmount + ", regnNo=" + this.regnNo + ", finalTaxAmount=" + this.finalTaxAmount + ", pur_cd=" + this.pur_cd + ", totalPaybaleTax=" + this.totalPaybaleTax + ", totalPaybalePenalty=" + this.totalPaybalePenalty + ", totalPaybaleSurcharge=" + this.totalPaybaleSurcharge + ", totalPaybaleRebate=" + this.totalPaybaleRebate + ", totalPaybaleInterest=" + this.totalPaybaleInterest + ", totalPaybaleTax1=" + this.totalPaybaleTax1 + ", totalPaybaleTax2=" + this.totalPaybaleTax2 + ", vtTaxFinalTax=" + this.vtTaxFinalTax + ", previousAdjustment=" + this.previousAdjustment + ", no_adv_units=" + this.no_adv_units + ", vtTaxFinalFine=" + this.vtTaxFinalFine + ", taxPurcdDesc=" + this.taxPurcdDesc + ", applNo=" + this.applNo + ')';
    }
}
