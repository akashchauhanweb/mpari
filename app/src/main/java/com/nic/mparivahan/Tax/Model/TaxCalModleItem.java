package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u001d\u0010M\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010O\u001a\u00020\u0019HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003JÑ\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0013\u0010Y\u001a\u00020\u00072\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\u0019HÖ\u0001J\t\u0010\\\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00100\"\u0004\b<\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00100\"\u0004\b@\u00102R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006]"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxCalModleItem;", "", "amount", "", "amount1", "amount2", "status", "", "fine", "gamount", "interest", "penalty", "rebate", "surcharge", "tax_FROM", "", "tax_HEAD", "tax_MODE", "tax_UPTO", "listTaxModes", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Tax/Model/TaxModes;", "Lkotlin/collections/ArrayList;", "pur_CD", "timePeriod", "", "(DDDZDDDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)V", "getAmount", "()D", "setAmount", "(D)V", "getAmount1", "setAmount1", "getAmount2", "setAmount2", "getFine", "setFine", "getGamount", "setGamount", "getInterest", "setInterest", "getListTaxModes", "()Ljava/util/ArrayList;", "setListTaxModes", "(Ljava/util/ArrayList;)V", "getPenalty", "setPenalty", "getPur_CD", "()Ljava/lang/String;", "setPur_CD", "(Ljava/lang/String;)V", "getRebate", "setRebate", "getStatus", "()Z", "setStatus", "(Z)V", "getSurcharge", "setSurcharge", "getTax_FROM", "setTax_FROM", "getTax_HEAD", "setTax_HEAD", "getTax_MODE", "setTax_MODE", "getTax_UPTO", "setTax_UPTO", "getTimePeriod", "()I", "setTimePeriod", "(I)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TaxCalModleItem {
    private double amount;
    private double amount1;
    private double amount2;
    private double fine;
    private double gamount;
    private double interest;
    private ArrayList<TaxModes> listTaxModes;
    private double penalty;
    private String pur_CD;
    private double rebate;
    private boolean status;
    private double surcharge;
    private String tax_FROM;
    private String tax_HEAD;
    private String tax_MODE;
    private String tax_UPTO;
    private int timePeriod;

    public TaxCalModleItem() {
        this(0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, 0, 131071, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getSurcharge() {
        return this.surcharge;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTax_FROM() {
        return this.tax_FROM;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTax_HEAD() {
        return this.tax_HEAD;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTax_MODE() {
        return this.tax_MODE;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTax_UPTO() {
        return this.tax_UPTO;
    }

    public final ArrayList<TaxModes> component15() {
        return this.listTaxModes;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPur_CD() {
        return this.pur_CD;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getTimePeriod() {
        return this.timePeriod;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAmount1() {
        return this.amount1;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAmount2() {
        return this.amount2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getFine() {
        return this.fine;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getGamount() {
        return this.gamount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getPenalty() {
        return this.penalty;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getRebate() {
        return this.rebate;
    }

    public final TaxCalModleItem copy(double amount, double amount1, double amount2, boolean status, double fine, double gamount, double interest, double penalty, double rebate, double surcharge, String tax_FROM, String tax_HEAD, String tax_MODE, String tax_UPTO, ArrayList<TaxModes> listTaxModes, String pur_CD, int timePeriod) {
        return new TaxCalModleItem(amount, amount1, amount2, status, fine, gamount, interest, penalty, rebate, surcharge, tax_FROM, tax_HEAD, tax_MODE, tax_UPTO, listTaxModes, pur_CD, timePeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxCalModleItem)) {
            return false;
        }
        TaxCalModleItem taxCalModleItem = (TaxCalModleItem) other;
        return Double.compare(this.amount, taxCalModleItem.amount) == 0 && Double.compare(this.amount1, taxCalModleItem.amount1) == 0 && Double.compare(this.amount2, taxCalModleItem.amount2) == 0 && this.status == taxCalModleItem.status && Double.compare(this.fine, taxCalModleItem.fine) == 0 && Double.compare(this.gamount, taxCalModleItem.gamount) == 0 && Double.compare(this.interest, taxCalModleItem.interest) == 0 && Double.compare(this.penalty, taxCalModleItem.penalty) == 0 && Double.compare(this.rebate, taxCalModleItem.rebate) == 0 && Double.compare(this.surcharge, taxCalModleItem.surcharge) == 0 && Intrinsics.areEqual(this.tax_FROM, taxCalModleItem.tax_FROM) && Intrinsics.areEqual(this.tax_HEAD, taxCalModleItem.tax_HEAD) && Intrinsics.areEqual(this.tax_MODE, taxCalModleItem.tax_MODE) && Intrinsics.areEqual(this.tax_UPTO, taxCalModleItem.tax_UPTO) && Intrinsics.areEqual(this.listTaxModes, taxCalModleItem.listTaxModes) && Intrinsics.areEqual(this.pur_CD, taxCalModleItem.pur_CD) && this.timePeriod == taxCalModleItem.timePeriod;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getAmount1() {
        return this.amount1;
    }

    public final double getAmount2() {
        return this.amount2;
    }

    public final double getFine() {
        return this.fine;
    }

    public final double getGamount() {
        return this.gamount;
    }

    public final double getInterest() {
        return this.interest;
    }

    public final ArrayList<TaxModes> getListTaxModes() {
        return this.listTaxModes;
    }

    public final double getPenalty() {
        return this.penalty;
    }

    public final String getPur_CD() {
        return this.pur_CD;
    }

    public final double getRebate() {
        return this.rebate;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final double getSurcharge() {
        return this.surcharge;
    }

    public final String getTax_FROM() {
        return this.tax_FROM;
    }

    public final String getTax_HEAD() {
        return this.tax_HEAD;
    }

    public final String getTax_MODE() {
        return this.tax_MODE;
    }

    public final String getTax_UPTO() {
        return this.tax_UPTO;
    }

    public final int getTimePeriod() {
        return this.timePeriod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((Double.hashCode(this.amount) * 31) + Double.hashCode(this.amount1)) * 31) + Double.hashCode(this.amount2)) * 31;
        boolean z = this.status;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((((iHashCode + r1) * 31) + Double.hashCode(this.fine)) * 31) + Double.hashCode(this.gamount)) * 31) + Double.hashCode(this.interest)) * 31) + Double.hashCode(this.penalty)) * 31) + Double.hashCode(this.rebate)) * 31) + Double.hashCode(this.surcharge)) * 31;
        String str = this.tax_FROM;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tax_HEAD;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tax_MODE;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tax_UPTO;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<TaxModes> arrayList = this.listTaxModes;
        int iHashCode7 = (iHashCode6 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str5 = this.pur_CD;
        return ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.timePeriod);
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setAmount1(double d) {
        this.amount1 = d;
    }

    public final void setAmount2(double d) {
        this.amount2 = d;
    }

    public final void setFine(double d) {
        this.fine = d;
    }

    public final void setGamount(double d) {
        this.gamount = d;
    }

    public final void setInterest(double d) {
        this.interest = d;
    }

    public final void setListTaxModes(ArrayList<TaxModes> arrayList) {
        this.listTaxModes = arrayList;
    }

    public final void setPenalty(double d) {
        this.penalty = d;
    }

    public final void setPur_CD(String str) {
        this.pur_CD = str;
    }

    public final void setRebate(double d) {
        this.rebate = d;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    public final void setSurcharge(double d) {
        this.surcharge = d;
    }

    public final void setTax_FROM(String str) {
        this.tax_FROM = str;
    }

    public final void setTax_HEAD(String str) {
        this.tax_HEAD = str;
    }

    public final void setTax_MODE(String str) {
        this.tax_MODE = str;
    }

    public final void setTax_UPTO(String str) {
        this.tax_UPTO = str;
    }

    public final void setTimePeriod(int i) {
        this.timePeriod = i;
    }

    public String toString() {
        return "TaxCalModleItem(amount=" + this.amount + ", amount1=" + this.amount1 + ", amount2=" + this.amount2 + ", status=" + this.status + ", fine=" + this.fine + ", gamount=" + this.gamount + ", interest=" + this.interest + ", penalty=" + this.penalty + ", rebate=" + this.rebate + ", surcharge=" + this.surcharge + ", tax_FROM=" + this.tax_FROM + ", tax_HEAD=" + this.tax_HEAD + ", tax_MODE=" + this.tax_MODE + ", tax_UPTO=" + this.tax_UPTO + ", listTaxModes=" + this.listTaxModes + ", pur_CD=" + this.pur_CD + ", timePeriod=" + this.timePeriod + ')';
    }

    public TaxCalModleItem(double d, double d2, double d3, boolean z, double d4, double d5, double d6, double d7, double d8, double d9, String str, String str2, String str3, String str4, ArrayList<TaxModes> arrayList, String str5, int i) {
        this.amount = d;
        this.amount1 = d2;
        this.amount2 = d3;
        this.status = z;
        this.fine = d4;
        this.gamount = d5;
        this.interest = d6;
        this.penalty = d7;
        this.rebate = d8;
        this.surcharge = d9;
        this.tax_FROM = str;
        this.tax_HEAD = str2;
        this.tax_MODE = str3;
        this.tax_UPTO = str4;
        this.listTaxModes = arrayList;
        this.pur_CD = str5;
        this.timePeriod = i;
    }

    public /* synthetic */ TaxCalModleItem(double d, double d2, double d3, boolean z, double d4, double d5, double d6, double d7, double d8, double d9, String str, String str2, String str3, String str4, ArrayList arrayList, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) != 0 ? 0.0d : d3, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0.0d : d4, (i2 & 32) != 0 ? 0.0d : d5, (i2 & 64) != 0 ? 0.0d : d6, (i2 & 128) != 0 ? 0.0d : d7, (i2 & 256) != 0 ? 0.0d : d8, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 0.0d : d9, (i2 & 1024) != 0 ? null : str, (i2 & 2048) != 0 ? null : str2, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str3, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str4, (i2 & 16384) != 0 ? null : arrayList, (i2 & 32768) == 0 ? str5 : null, (i2 & 65536) != 0 ? 0 : i);
    }
}
