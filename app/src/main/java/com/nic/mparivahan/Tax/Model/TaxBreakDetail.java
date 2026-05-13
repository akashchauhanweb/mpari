package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\bJ\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0002\u0010\u001fJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0001HÆ\u0003J\t\u0010E\u001a\u00020\u000fHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\u0007HÆ\u0003J\t\u0010O\u001a\u00020\u0007HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0001HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0001HÆ\u0003J\u008d\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u0007HÆ\u0001J\u0013\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020\u000fHÖ\u0001J\t\u0010]\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u0019\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0011\u0010\u001a\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\u001b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010\u001d\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%¨\u0006^"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/TaxBreakDetail;", "", "amount", "", "amount1", "amount2", "applicationstatus", "", "fine", "g_TAX_UPTO", "gamount", "interest", "pay_due_date", "penalty", "prv_ADJ", "", "pur_CD", "rcpt_dt", "rebate", "receipt_no", "sr_no", "surcharge", "tax_EXAM_UPTO", "tax_FROM", "tax_HEAD", "tax_MODE", "tax_UPTO", "tax_clear_upto", "tax_from_date", "tax_upto_date", "transaction_no", "(DDDLjava/lang/String;DLjava/lang/Object;DDLjava/lang/Object;DIILjava/lang/String;DLjava/lang/Object;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getAmount1", "getAmount2", "getApplicationstatus", "()Ljava/lang/String;", "getFine", "getG_TAX_UPTO", "()Ljava/lang/Object;", "getGamount", "getInterest", "getPay_due_date", "getPenalty", "getPrv_ADJ", "()I", "getPur_CD", "getRcpt_dt", "getRebate", "getReceipt_no", "getSr_no", "getSurcharge", "getTax_EXAM_UPTO", "getTax_FROM", "getTax_HEAD", "getTax_MODE", "getTax_UPTO", "getTax_clear_upto", "getTax_from_date", "getTax_upto_date", "getTransaction_no", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TaxBreakDetail {
    private final double amount;
    private final double amount1;
    private final double amount2;
    private final String applicationstatus;
    private final double fine;
    private final Object g_TAX_UPTO;
    private final double gamount;
    private final double interest;
    private final Object pay_due_date;
    private final double penalty;
    private final int prv_ADJ;
    private final int pur_CD;
    private final String rcpt_dt;
    private final double rebate;
    private final Object receipt_no;
    private final int sr_no;
    private final double surcharge;
    private final String tax_EXAM_UPTO;
    private final String tax_FROM;
    private final String tax_HEAD;
    private final String tax_MODE;
    private final String tax_UPTO;
    private final String tax_clear_upto;
    private final String tax_from_date;
    private final String tax_upto_date;
    private final String transaction_no;

    public TaxBreakDetail(double d, double d2, double d3, String applicationstatus, double d4, Object g_TAX_UPTO, double d5, double d6, Object pay_due_date, double d7, int i, int i2, String rcpt_dt, double d8, Object receipt_no, int i3, double d9, String tax_EXAM_UPTO, String tax_FROM, String tax_HEAD, String tax_MODE, String tax_UPTO, String tax_clear_upto, String tax_from_date, String tax_upto_date, String transaction_no) {
        Intrinsics.checkNotNullParameter(applicationstatus, "applicationstatus");
        Intrinsics.checkNotNullParameter(g_TAX_UPTO, "g_TAX_UPTO");
        Intrinsics.checkNotNullParameter(pay_due_date, "pay_due_date");
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        Intrinsics.checkNotNullParameter(receipt_no, "receipt_no");
        Intrinsics.checkNotNullParameter(tax_EXAM_UPTO, "tax_EXAM_UPTO");
        Intrinsics.checkNotNullParameter(tax_FROM, "tax_FROM");
        Intrinsics.checkNotNullParameter(tax_HEAD, "tax_HEAD");
        Intrinsics.checkNotNullParameter(tax_MODE, "tax_MODE");
        Intrinsics.checkNotNullParameter(tax_UPTO, "tax_UPTO");
        Intrinsics.checkNotNullParameter(tax_clear_upto, "tax_clear_upto");
        Intrinsics.checkNotNullParameter(tax_from_date, "tax_from_date");
        Intrinsics.checkNotNullParameter(tax_upto_date, "tax_upto_date");
        Intrinsics.checkNotNullParameter(transaction_no, "transaction_no");
        this.amount = d;
        this.amount1 = d2;
        this.amount2 = d3;
        this.applicationstatus = applicationstatus;
        this.fine = d4;
        this.g_TAX_UPTO = g_TAX_UPTO;
        this.gamount = d5;
        this.interest = d6;
        this.pay_due_date = pay_due_date;
        this.penalty = d7;
        this.prv_ADJ = i;
        this.pur_CD = i2;
        this.rcpt_dt = rcpt_dt;
        this.rebate = d8;
        this.receipt_no = receipt_no;
        this.sr_no = i3;
        this.surcharge = d9;
        this.tax_EXAM_UPTO = tax_EXAM_UPTO;
        this.tax_FROM = tax_FROM;
        this.tax_HEAD = tax_HEAD;
        this.tax_MODE = tax_MODE;
        this.tax_UPTO = tax_UPTO;
        this.tax_clear_upto = tax_clear_upto;
        this.tax_from_date = tax_from_date;
        this.tax_upto_date = tax_upto_date;
        this.transaction_no = transaction_no;
    }

    public static /* synthetic */ TaxBreakDetail copy$default(TaxBreakDetail taxBreakDetail, double d, double d2, double d3, String str, double d4, Object obj, double d5, double d6, Object obj2, double d7, int i, int i2, String str2, double d8, Object obj3, int i3, double d9, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i4, Object obj4) {
        double d10 = (i4 & 1) != 0 ? taxBreakDetail.amount : d;
        double d11 = (i4 & 2) != 0 ? taxBreakDetail.amount1 : d2;
        double d12 = (i4 & 4) != 0 ? taxBreakDetail.amount2 : d3;
        String str12 = (i4 & 8) != 0 ? taxBreakDetail.applicationstatus : str;
        double d13 = (i4 & 16) != 0 ? taxBreakDetail.fine : d4;
        Object obj5 = (i4 & 32) != 0 ? taxBreakDetail.g_TAX_UPTO : obj;
        double d14 = (i4 & 64) != 0 ? taxBreakDetail.gamount : d5;
        double d15 = (i4 & 128) != 0 ? taxBreakDetail.interest : d6;
        Object obj6 = (i4 & 256) != 0 ? taxBreakDetail.pay_due_date : obj2;
        double d16 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? taxBreakDetail.penalty : d7;
        int i5 = (i4 & 1024) != 0 ? taxBreakDetail.prv_ADJ : i;
        return taxBreakDetail.copy(d10, d11, d12, str12, d13, obj5, d14, d15, obj6, d16, i5, (i4 & 2048) != 0 ? taxBreakDetail.pur_CD : i2, (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? taxBreakDetail.rcpt_dt : str2, (i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? taxBreakDetail.rebate : d8, (i4 & 16384) != 0 ? taxBreakDetail.receipt_no : obj3, (32768 & i4) != 0 ? taxBreakDetail.sr_no : i3, (i4 & 65536) != 0 ? taxBreakDetail.surcharge : d9, (i4 & 131072) != 0 ? taxBreakDetail.tax_EXAM_UPTO : str3, (262144 & i4) != 0 ? taxBreakDetail.tax_FROM : str4, (i4 & 524288) != 0 ? taxBreakDetail.tax_HEAD : str5, (i4 & 1048576) != 0 ? taxBreakDetail.tax_MODE : str6, (i4 & 2097152) != 0 ? taxBreakDetail.tax_UPTO : str7, (i4 & 4194304) != 0 ? taxBreakDetail.tax_clear_upto : str8, (i4 & 8388608) != 0 ? taxBreakDetail.tax_from_date : str9, (i4 & 16777216) != 0 ? taxBreakDetail.tax_upto_date : str10, (i4 & 33554432) != 0 ? taxBreakDetail.transaction_no : str11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getPenalty() {
        return this.penalty;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getPrv_ADJ() {
        return this.prv_ADJ;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPur_CD() {
        return this.pur_CD;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getRebate() {
        return this.rebate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getReceipt_no() {
        return this.receipt_no;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSr_no() {
        return this.sr_no;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final double getSurcharge() {
        return this.surcharge;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTax_EXAM_UPTO() {
        return this.tax_EXAM_UPTO;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTax_FROM() {
        return this.tax_FROM;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAmount1() {
        return this.amount1;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTax_HEAD() {
        return this.tax_HEAD;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTax_MODE() {
        return this.tax_MODE;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getTax_UPTO() {
        return this.tax_UPTO;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTax_clear_upto() {
        return this.tax_clear_upto;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTax_from_date() {
        return this.tax_from_date;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getTax_upto_date() {
        return this.tax_upto_date;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTransaction_no() {
        return this.transaction_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAmount2() {
        return this.amount2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplicationstatus() {
        return this.applicationstatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getFine() {
        return this.fine;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getG_TAX_UPTO() {
        return this.g_TAX_UPTO;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getGamount() {
        return this.gamount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getPay_due_date() {
        return this.pay_due_date;
    }

    public final TaxBreakDetail copy(double amount, double amount1, double amount2, String applicationstatus, double fine, Object g_TAX_UPTO, double gamount, double interest, Object pay_due_date, double penalty, int prv_ADJ, int pur_CD, String rcpt_dt, double rebate, Object receipt_no, int sr_no, double surcharge, String tax_EXAM_UPTO, String tax_FROM, String tax_HEAD, String tax_MODE, String tax_UPTO, String tax_clear_upto, String tax_from_date, String tax_upto_date, String transaction_no) {
        Intrinsics.checkNotNullParameter(applicationstatus, "applicationstatus");
        Intrinsics.checkNotNullParameter(g_TAX_UPTO, "g_TAX_UPTO");
        Intrinsics.checkNotNullParameter(pay_due_date, "pay_due_date");
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        Intrinsics.checkNotNullParameter(receipt_no, "receipt_no");
        Intrinsics.checkNotNullParameter(tax_EXAM_UPTO, "tax_EXAM_UPTO");
        Intrinsics.checkNotNullParameter(tax_FROM, "tax_FROM");
        Intrinsics.checkNotNullParameter(tax_HEAD, "tax_HEAD");
        Intrinsics.checkNotNullParameter(tax_MODE, "tax_MODE");
        Intrinsics.checkNotNullParameter(tax_UPTO, "tax_UPTO");
        Intrinsics.checkNotNullParameter(tax_clear_upto, "tax_clear_upto");
        Intrinsics.checkNotNullParameter(tax_from_date, "tax_from_date");
        Intrinsics.checkNotNullParameter(tax_upto_date, "tax_upto_date");
        Intrinsics.checkNotNullParameter(transaction_no, "transaction_no");
        return new TaxBreakDetail(amount, amount1, amount2, applicationstatus, fine, g_TAX_UPTO, gamount, interest, pay_due_date, penalty, prv_ADJ, pur_CD, rcpt_dt, rebate, receipt_no, sr_no, surcharge, tax_EXAM_UPTO, tax_FROM, tax_HEAD, tax_MODE, tax_UPTO, tax_clear_upto, tax_from_date, tax_upto_date, transaction_no);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxBreakDetail)) {
            return false;
        }
        TaxBreakDetail taxBreakDetail = (TaxBreakDetail) other;
        return Double.compare(this.amount, taxBreakDetail.amount) == 0 && Double.compare(this.amount1, taxBreakDetail.amount1) == 0 && Double.compare(this.amount2, taxBreakDetail.amount2) == 0 && Intrinsics.areEqual(this.applicationstatus, taxBreakDetail.applicationstatus) && Double.compare(this.fine, taxBreakDetail.fine) == 0 && Intrinsics.areEqual(this.g_TAX_UPTO, taxBreakDetail.g_TAX_UPTO) && Double.compare(this.gamount, taxBreakDetail.gamount) == 0 && Double.compare(this.interest, taxBreakDetail.interest) == 0 && Intrinsics.areEqual(this.pay_due_date, taxBreakDetail.pay_due_date) && Double.compare(this.penalty, taxBreakDetail.penalty) == 0 && this.prv_ADJ == taxBreakDetail.prv_ADJ && this.pur_CD == taxBreakDetail.pur_CD && Intrinsics.areEqual(this.rcpt_dt, taxBreakDetail.rcpt_dt) && Double.compare(this.rebate, taxBreakDetail.rebate) == 0 && Intrinsics.areEqual(this.receipt_no, taxBreakDetail.receipt_no) && this.sr_no == taxBreakDetail.sr_no && Double.compare(this.surcharge, taxBreakDetail.surcharge) == 0 && Intrinsics.areEqual(this.tax_EXAM_UPTO, taxBreakDetail.tax_EXAM_UPTO) && Intrinsics.areEqual(this.tax_FROM, taxBreakDetail.tax_FROM) && Intrinsics.areEqual(this.tax_HEAD, taxBreakDetail.tax_HEAD) && Intrinsics.areEqual(this.tax_MODE, taxBreakDetail.tax_MODE) && Intrinsics.areEqual(this.tax_UPTO, taxBreakDetail.tax_UPTO) && Intrinsics.areEqual(this.tax_clear_upto, taxBreakDetail.tax_clear_upto) && Intrinsics.areEqual(this.tax_from_date, taxBreakDetail.tax_from_date) && Intrinsics.areEqual(this.tax_upto_date, taxBreakDetail.tax_upto_date) && Intrinsics.areEqual(this.transaction_no, taxBreakDetail.transaction_no);
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

    public final String getApplicationstatus() {
        return this.applicationstatus;
    }

    public final double getFine() {
        return this.fine;
    }

    public final Object getG_TAX_UPTO() {
        return this.g_TAX_UPTO;
    }

    public final double getGamount() {
        return this.gamount;
    }

    public final double getInterest() {
        return this.interest;
    }

    public final Object getPay_due_date() {
        return this.pay_due_date;
    }

    public final double getPenalty() {
        return this.penalty;
    }

    public final int getPrv_ADJ() {
        return this.prv_ADJ;
    }

    public final int getPur_CD() {
        return this.pur_CD;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final double getRebate() {
        return this.rebate;
    }

    public final Object getReceipt_no() {
        return this.receipt_no;
    }

    public final int getSr_no() {
        return this.sr_no;
    }

    public final double getSurcharge() {
        return this.surcharge;
    }

    public final String getTax_EXAM_UPTO() {
        return this.tax_EXAM_UPTO;
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

    public final String getTax_clear_upto() {
        return this.tax_clear_upto;
    }

    public final String getTax_from_date() {
        return this.tax_from_date;
    }

    public final String getTax_upto_date() {
        return this.tax_upto_date;
    }

    public final String getTransaction_no() {
        return this.transaction_no;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((Double.hashCode(this.amount) * 31) + Double.hashCode(this.amount1)) * 31) + Double.hashCode(this.amount2)) * 31) + this.applicationstatus.hashCode()) * 31) + Double.hashCode(this.fine)) * 31) + this.g_TAX_UPTO.hashCode()) * 31) + Double.hashCode(this.gamount)) * 31) + Double.hashCode(this.interest)) * 31) + this.pay_due_date.hashCode()) * 31) + Double.hashCode(this.penalty)) * 31) + Integer.hashCode(this.prv_ADJ)) * 31) + Integer.hashCode(this.pur_CD)) * 31) + this.rcpt_dt.hashCode()) * 31) + Double.hashCode(this.rebate)) * 31) + this.receipt_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + Double.hashCode(this.surcharge)) * 31) + this.tax_EXAM_UPTO.hashCode()) * 31) + this.tax_FROM.hashCode()) * 31) + this.tax_HEAD.hashCode()) * 31) + this.tax_MODE.hashCode()) * 31) + this.tax_UPTO.hashCode()) * 31) + this.tax_clear_upto.hashCode()) * 31) + this.tax_from_date.hashCode()) * 31) + this.tax_upto_date.hashCode()) * 31) + this.transaction_no.hashCode();
    }

    public String toString() {
        return "TaxBreakDetail(amount=" + this.amount + ", amount1=" + this.amount1 + ", amount2=" + this.amount2 + ", applicationstatus=" + this.applicationstatus + ", fine=" + this.fine + ", g_TAX_UPTO=" + this.g_TAX_UPTO + ", gamount=" + this.gamount + ", interest=" + this.interest + ", pay_due_date=" + this.pay_due_date + ", penalty=" + this.penalty + ", prv_ADJ=" + this.prv_ADJ + ", pur_CD=" + this.pur_CD + ", rcpt_dt=" + this.rcpt_dt + ", rebate=" + this.rebate + ", receipt_no=" + this.receipt_no + ", sr_no=" + this.sr_no + ", surcharge=" + this.surcharge + ", tax_EXAM_UPTO=" + this.tax_EXAM_UPTO + ", tax_FROM=" + this.tax_FROM + ", tax_HEAD=" + this.tax_HEAD + ", tax_MODE=" + this.tax_MODE + ", tax_UPTO=" + this.tax_UPTO + ", tax_clear_upto=" + this.tax_clear_upto + ", tax_from_date=" + this.tax_from_date + ", tax_upto_date=" + this.tax_upto_date + ", transaction_no=" + this.transaction_no + ')';
    }
}
