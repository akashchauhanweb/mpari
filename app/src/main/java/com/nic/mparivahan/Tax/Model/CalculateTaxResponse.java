package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bh\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f\u0012\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u001dj\b\u0012\u0004\u0012\u00020!`\u001f\u0012\u0006\u0010\"\u001a\u00020\u0001\u0012\u0006\u0010#\u001a\u00020\u0001\u0012\u0006\u0010$\u001a\u00020\u0001\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\u0006\u0010*\u001a\u00020\u0007\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\u0006\u0010,\u001a\u00020\u0007\u0012\u0006\u0010-\u001a\u00020\u0001\u0012\u0006\u0010.\u001a\u00020\u0007\u0012\u0006\u0010/\u001a\u00020\u0007\u0012\u0006\u00100\u001a\u00020\u0007\u0012\u0006\u00101\u001a\u00020\u0007¢\u0006\u0002\u00102J\t\u0010a\u001a\u00020\u0001HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0001HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\u000bHÆ\u0003J\t\u0010h\u001a\u00020\u0001HÆ\u0003J\t\u0010i\u001a\u00020\u0001HÆ\u0003J\t\u0010j\u001a\u00020\u0001HÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\t\u0010l\u001a\u00020\u0001HÆ\u0003J\t\u0010m\u001a\u00020\u0005HÆ\u0003J\t\u0010n\u001a\u00020\u0001HÆ\u0003J\u0019\u0010o\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fHÆ\u0003J\u0019\u0010p\u001a\u0012\u0012\u0004\u0012\u00020!0\u001dj\b\u0012\u0004\u0012\u00020!`\u001fHÆ\u0003J\t\u0010q\u001a\u00020\u0001HÆ\u0003J\t\u0010r\u001a\u00020\u0001HÆ\u0003J\t\u0010s\u001a\u00020\u0001HÆ\u0003J\t\u0010t\u001a\u00020\u0007HÆ\u0003J\t\u0010u\u001a\u00020\u0007HÆ\u0003J\t\u0010v\u001a\u00020\u0007HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0007HÆ\u0003J\t\u0010y\u001a\u00020\u0007HÆ\u0003J\t\u0010z\u001a\u00020\u0007HÆ\u0003J\t\u0010{\u001a\u00020\u0007HÆ\u0003J\t\u0010|\u001a\u00020\u0007HÆ\u0003J\t\u0010}\u001a\u00020\u0001HÆ\u0003J\t\u0010~\u001a\u00020\u0007HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u000eHÆ\u0003J¶\u0003\u0010\u0088\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00012\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f2\u0018\b\u0002\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u001dj\b\u0012\u0004\u0012\u00020!`\u001f2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\u0007HÆ\u0001J\u0016\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u000bHÖ\u0001J\n\u0010\u008d\u0001\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00107R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u00107R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010=R\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0011\u0010\u0017\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u00107R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u00107R\u0011\u0010\u001b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bM\u00104R!\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR!\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u001dj\b\u0012\u0004\u0012\u00020!`\u001f¢\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0011\u0010\"\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bQ\u00104R\u0011\u0010#\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bR\u00104R\u0011\u0010$\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bS\u00104R\u0011\u0010%\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bT\u00109R\u0011\u0010&\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bU\u00109R\u0011\u0010'\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u00109R\u0011\u0010(\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u00109R\u0011\u0010)\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bX\u00109R\u0011\u0010*\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bY\u00109R\u0011\u0010+\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bZ\u00109R\u0011\u0010,\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b[\u00109R\u0011\u00101\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\\\u00109R\u0011\u00100\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b]\u00109R\u0011\u0010-\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b^\u00104R\u0011\u0010.\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b_\u00109R\u0011\u0010/\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b`\u00109¨\u0006\u008e\u0001"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/CalculateTaxResponse;", "", "applNo", "appl_no", "deal_cd", "", "finalTaxAmount", "", "finalTaxFrom", "finalTaxUpto", "no_adv_units", "", "off_cd", "op_dt", "", "ownerName", "payMode", "paymentMode", "paymntCollectionBean", "", "previousAdjustment", "pur_cd", "rcptDate", "rcptNo", "rcpt_dt", "regnNo", "state_cd", "status", "taxBreakDetails", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Tax/Model/TaxBreakDetail;", "Lkotlin/collections/ArrayList;", "taxGroupDetails", "Lcom/nic/mparivahan/Tax/Model/TaxGroupDetail;", "taxMode", "taxPurcdDesc", "taxhead", "totalAmount", "totalPaybaleInterest", "totalPaybalePenalty", "totalPaybaleRebate", "totalPaybaleSurcharge", "totalPaybaleTax", "totalPaybaleTax1", "totalPaybaleTax2", "userID", "vtTaxFinalFine", "vtTaxFinalTax", "userChrg", "totalTransactionChrg", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;IIJLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;DILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;DDDDDDDDLjava/lang/Object;DDDD)V", "getApplNo", "()Ljava/lang/Object;", "getAppl_no", "getDeal_cd", "()Ljava/lang/String;", "getFinalTaxAmount", "()D", "getFinalTaxFrom", "getFinalTaxUpto", "getNo_adv_units", "()I", "getOff_cd", "getOp_dt", "()J", "getOwnerName", "getPayMode", "getPaymentMode", "getPaymntCollectionBean", "()Ljava/util/List;", "getPreviousAdjustment", "getPur_cd", "getRcptDate", "getRcptNo", "getRcpt_dt", "getRegnNo", "getState_cd", "getStatus", "getTaxBreakDetails", "()Ljava/util/ArrayList;", "getTaxGroupDetails", "getTaxMode", "getTaxPurcdDesc", "getTaxhead", "getTotalAmount", "getTotalPaybaleInterest", "getTotalPaybalePenalty", "getTotalPaybaleRebate", "getTotalPaybaleSurcharge", "getTotalPaybaleTax", "getTotalPaybaleTax1", "getTotalPaybaleTax2", "getTotalTransactionChrg", "getUserChrg", "getUserID", "getVtTaxFinalFine", "getVtTaxFinalTax", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CalculateTaxResponse {
    private final Object applNo;
    private final Object appl_no;
    private final String deal_cd;
    private final double finalTaxAmount;
    private final String finalTaxFrom;
    private final String finalTaxUpto;
    private final int no_adv_units;
    private final int off_cd;
    private final long op_dt;
    private final String ownerName;
    private final Object payMode;
    private final String paymentMode;
    private final List<Object> paymntCollectionBean;
    private final double previousAdjustment;
    private final int pur_cd;
    private final Object rcptDate;
    private final Object rcptNo;
    private final Object rcpt_dt;
    private final String regnNo;
    private final String state_cd;
    private final Object status;
    private final ArrayList<TaxBreakDetail> taxBreakDetails;
    private final ArrayList<TaxGroupDetail> taxGroupDetails;
    private final Object taxMode;
    private final Object taxPurcdDesc;
    private final Object taxhead;
    private final double totalAmount;
    private final double totalPaybaleInterest;
    private final double totalPaybalePenalty;
    private final double totalPaybaleRebate;
    private final double totalPaybaleSurcharge;
    private final double totalPaybaleTax;
    private final double totalPaybaleTax1;
    private final double totalPaybaleTax2;
    private final double totalTransactionChrg;
    private final double userChrg;
    private final Object userID;
    private final double vtTaxFinalFine;
    private final double vtTaxFinalTax;

    public CalculateTaxResponse(Object applNo, Object appl_no, String deal_cd, double d, String finalTaxFrom, String finalTaxUpto, int i, int i2, long j, String ownerName, Object payMode, String paymentMode, List<? extends Object> paymntCollectionBean, double d2, int i3, Object rcptDate, Object rcptNo, Object rcpt_dt, String regnNo, String state_cd, Object status, ArrayList<TaxBreakDetail> taxBreakDetails, ArrayList<TaxGroupDetail> taxGroupDetails, Object taxMode, Object taxPurcdDesc, Object taxhead, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, Object userID, double d11, double d12, double d13, double d14) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(deal_cd, "deal_cd");
        Intrinsics.checkNotNullParameter(finalTaxFrom, "finalTaxFrom");
        Intrinsics.checkNotNullParameter(finalTaxUpto, "finalTaxUpto");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(payMode, "payMode");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(paymntCollectionBean, "paymntCollectionBean");
        Intrinsics.checkNotNullParameter(rcptDate, "rcptDate");
        Intrinsics.checkNotNullParameter(rcptNo, "rcptNo");
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(taxBreakDetails, "taxBreakDetails");
        Intrinsics.checkNotNullParameter(taxGroupDetails, "taxGroupDetails");
        Intrinsics.checkNotNullParameter(taxMode, "taxMode");
        Intrinsics.checkNotNullParameter(taxPurcdDesc, "taxPurcdDesc");
        Intrinsics.checkNotNullParameter(taxhead, "taxhead");
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.applNo = applNo;
        this.appl_no = appl_no;
        this.deal_cd = deal_cd;
        this.finalTaxAmount = d;
        this.finalTaxFrom = finalTaxFrom;
        this.finalTaxUpto = finalTaxUpto;
        this.no_adv_units = i;
        this.off_cd = i2;
        this.op_dt = j;
        this.ownerName = ownerName;
        this.payMode = payMode;
        this.paymentMode = paymentMode;
        this.paymntCollectionBean = paymntCollectionBean;
        this.previousAdjustment = d2;
        this.pur_cd = i3;
        this.rcptDate = rcptDate;
        this.rcptNo = rcptNo;
        this.rcpt_dt = rcpt_dt;
        this.regnNo = regnNo;
        this.state_cd = state_cd;
        this.status = status;
        this.taxBreakDetails = taxBreakDetails;
        this.taxGroupDetails = taxGroupDetails;
        this.taxMode = taxMode;
        this.taxPurcdDesc = taxPurcdDesc;
        this.taxhead = taxhead;
        this.totalAmount = d3;
        this.totalPaybaleInterest = d4;
        this.totalPaybalePenalty = d5;
        this.totalPaybaleRebate = d6;
        this.totalPaybaleSurcharge = d7;
        this.totalPaybaleTax = d8;
        this.totalPaybaleTax1 = d9;
        this.totalPaybaleTax2 = d10;
        this.userID = userID;
        this.vtTaxFinalFine = d11;
        this.vtTaxFinalTax = d12;
        this.userChrg = d13;
        this.totalTransactionChrg = d14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalculateTaxResponse copy$default(CalculateTaxResponse calculateTaxResponse, Object obj, Object obj2, String str, double d, String str2, String str3, int i, int i2, long j, String str4, Object obj3, String str5, List list, double d2, int i3, Object obj4, Object obj5, Object obj6, String str6, String str7, Object obj7, ArrayList arrayList, ArrayList arrayList2, Object obj8, Object obj9, Object obj10, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, Object obj11, double d11, double d12, double d13, double d14, int i4, int i5, Object obj12) {
        Object obj13 = (i4 & 1) != 0 ? calculateTaxResponse.applNo : obj;
        Object obj14 = (i4 & 2) != 0 ? calculateTaxResponse.appl_no : obj2;
        String str8 = (i4 & 4) != 0 ? calculateTaxResponse.deal_cd : str;
        double d15 = (i4 & 8) != 0 ? calculateTaxResponse.finalTaxAmount : d;
        String str9 = (i4 & 16) != 0 ? calculateTaxResponse.finalTaxFrom : str2;
        String str10 = (i4 & 32) != 0 ? calculateTaxResponse.finalTaxUpto : str3;
        int i6 = (i4 & 64) != 0 ? calculateTaxResponse.no_adv_units : i;
        int i7 = (i4 & 128) != 0 ? calculateTaxResponse.off_cd : i2;
        long j2 = (i4 & 256) != 0 ? calculateTaxResponse.op_dt : j;
        String str11 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? calculateTaxResponse.ownerName : str4;
        Object obj15 = (i4 & 1024) != 0 ? calculateTaxResponse.payMode : obj3;
        String str12 = (i4 & 2048) != 0 ? calculateTaxResponse.paymentMode : str5;
        List list2 = (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? calculateTaxResponse.paymntCollectionBean : list;
        Object obj16 = obj15;
        double d16 = (i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? calculateTaxResponse.previousAdjustment : d2;
        int i8 = (i4 & 16384) != 0 ? calculateTaxResponse.pur_cd : i3;
        return calculateTaxResponse.copy(obj13, obj14, str8, d15, str9, str10, i6, i7, j2, str11, obj16, str12, list2, d16, i8, (32768 & i4) != 0 ? calculateTaxResponse.rcptDate : obj4, (i4 & 65536) != 0 ? calculateTaxResponse.rcptNo : obj5, (i4 & 131072) != 0 ? calculateTaxResponse.rcpt_dt : obj6, (i4 & 262144) != 0 ? calculateTaxResponse.regnNo : str6, (i4 & 524288) != 0 ? calculateTaxResponse.state_cd : str7, (i4 & 1048576) != 0 ? calculateTaxResponse.status : obj7, (i4 & 2097152) != 0 ? calculateTaxResponse.taxBreakDetails : arrayList, (i4 & 4194304) != 0 ? calculateTaxResponse.taxGroupDetails : arrayList2, (i4 & 8388608) != 0 ? calculateTaxResponse.taxMode : obj8, (i4 & 16777216) != 0 ? calculateTaxResponse.taxPurcdDesc : obj9, (i4 & 33554432) != 0 ? calculateTaxResponse.taxhead : obj10, (i4 & 67108864) != 0 ? calculateTaxResponse.totalAmount : d3, (i4 & 134217728) != 0 ? calculateTaxResponse.totalPaybaleInterest : d4, (i4 & 268435456) != 0 ? calculateTaxResponse.totalPaybalePenalty : d5, (i4 & 536870912) != 0 ? calculateTaxResponse.totalPaybaleRebate : d6, (i4 & 1073741824) != 0 ? calculateTaxResponse.totalPaybaleSurcharge : d7, (i4 & IntCompanionObject.MIN_VALUE) != 0 ? calculateTaxResponse.totalPaybaleTax : d8, (i5 & 1) != 0 ? calculateTaxResponse.totalPaybaleTax1 : d9, (i5 & 2) != 0 ? calculateTaxResponse.totalPaybaleTax2 : d10, (i5 & 4) != 0 ? calculateTaxResponse.userID : obj11, (i5 & 8) != 0 ? calculateTaxResponse.vtTaxFinalFine : d11, (i5 & 16) != 0 ? calculateTaxResponse.vtTaxFinalTax : d12, (i5 & 32) != 0 ? calculateTaxResponse.userChrg : d13, (i5 & 64) != 0 ? calculateTaxResponse.totalTransactionChrg : d14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getPayMode() {
        return this.payMode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final List<Object> component13() {
        return this.paymntCollectionBean;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getRcptDate() {
        return this.rcptDate;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getRcptNo() {
        return this.rcptNo;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Object getRcpt_dt() {
        return this.rcpt_dt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getStatus() {
        return this.status;
    }

    public final ArrayList<TaxBreakDetail> component22() {
        return this.taxBreakDetails;
    }

    public final ArrayList<TaxGroupDetail> component23() {
        return this.taxGroupDetails;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getTaxMode() {
        return this.taxMode;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Object getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Object getTaxhead() {
        return this.taxhead;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final double getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final double getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final double getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeal_cd() {
        return this.deal_cd;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final double getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final double getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final double getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final double getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final double getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Object getUserID() {
        return this.userID;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final double getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final double getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final double getUserChrg() {
        return this.userChrg;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final double getTotalTransactionChrg() {
        return this.totalTransactionChrg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFinalTaxFrom() {
        return this.finalTaxFrom;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFinalTaxUpto() {
        return this.finalTaxUpto;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNo_adv_units() {
        return this.no_adv_units;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getOp_dt() {
        return this.op_dt;
    }

    public final CalculateTaxResponse copy(Object applNo, Object appl_no, String deal_cd, double finalTaxAmount, String finalTaxFrom, String finalTaxUpto, int no_adv_units, int off_cd, long op_dt, String ownerName, Object payMode, String paymentMode, List<? extends Object> paymntCollectionBean, double previousAdjustment, int pur_cd, Object rcptDate, Object rcptNo, Object rcpt_dt, String regnNo, String state_cd, Object status, ArrayList<TaxBreakDetail> taxBreakDetails, ArrayList<TaxGroupDetail> taxGroupDetails, Object taxMode, Object taxPurcdDesc, Object taxhead, double totalAmount, double totalPaybaleInterest, double totalPaybalePenalty, double totalPaybaleRebate, double totalPaybaleSurcharge, double totalPaybaleTax, double totalPaybaleTax1, double totalPaybaleTax2, Object userID, double vtTaxFinalFine, double vtTaxFinalTax, double userChrg, double totalTransactionChrg) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(deal_cd, "deal_cd");
        Intrinsics.checkNotNullParameter(finalTaxFrom, "finalTaxFrom");
        Intrinsics.checkNotNullParameter(finalTaxUpto, "finalTaxUpto");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(payMode, "payMode");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(paymntCollectionBean, "paymntCollectionBean");
        Intrinsics.checkNotNullParameter(rcptDate, "rcptDate");
        Intrinsics.checkNotNullParameter(rcptNo, "rcptNo");
        Intrinsics.checkNotNullParameter(rcpt_dt, "rcpt_dt");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(taxBreakDetails, "taxBreakDetails");
        Intrinsics.checkNotNullParameter(taxGroupDetails, "taxGroupDetails");
        Intrinsics.checkNotNullParameter(taxMode, "taxMode");
        Intrinsics.checkNotNullParameter(taxPurcdDesc, "taxPurcdDesc");
        Intrinsics.checkNotNullParameter(taxhead, "taxhead");
        Intrinsics.checkNotNullParameter(userID, "userID");
        return new CalculateTaxResponse(applNo, appl_no, deal_cd, finalTaxAmount, finalTaxFrom, finalTaxUpto, no_adv_units, off_cd, op_dt, ownerName, payMode, paymentMode, paymntCollectionBean, previousAdjustment, pur_cd, rcptDate, rcptNo, rcpt_dt, regnNo, state_cd, status, taxBreakDetails, taxGroupDetails, taxMode, taxPurcdDesc, taxhead, totalAmount, totalPaybaleInterest, totalPaybalePenalty, totalPaybaleRebate, totalPaybaleSurcharge, totalPaybaleTax, totalPaybaleTax1, totalPaybaleTax2, userID, vtTaxFinalFine, vtTaxFinalTax, userChrg, totalTransactionChrg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalculateTaxResponse)) {
            return false;
        }
        CalculateTaxResponse calculateTaxResponse = (CalculateTaxResponse) other;
        return Intrinsics.areEqual(this.applNo, calculateTaxResponse.applNo) && Intrinsics.areEqual(this.appl_no, calculateTaxResponse.appl_no) && Intrinsics.areEqual(this.deal_cd, calculateTaxResponse.deal_cd) && Double.compare(this.finalTaxAmount, calculateTaxResponse.finalTaxAmount) == 0 && Intrinsics.areEqual(this.finalTaxFrom, calculateTaxResponse.finalTaxFrom) && Intrinsics.areEqual(this.finalTaxUpto, calculateTaxResponse.finalTaxUpto) && this.no_adv_units == calculateTaxResponse.no_adv_units && this.off_cd == calculateTaxResponse.off_cd && this.op_dt == calculateTaxResponse.op_dt && Intrinsics.areEqual(this.ownerName, calculateTaxResponse.ownerName) && Intrinsics.areEqual(this.payMode, calculateTaxResponse.payMode) && Intrinsics.areEqual(this.paymentMode, calculateTaxResponse.paymentMode) && Intrinsics.areEqual(this.paymntCollectionBean, calculateTaxResponse.paymntCollectionBean) && Double.compare(this.previousAdjustment, calculateTaxResponse.previousAdjustment) == 0 && this.pur_cd == calculateTaxResponse.pur_cd && Intrinsics.areEqual(this.rcptDate, calculateTaxResponse.rcptDate) && Intrinsics.areEqual(this.rcptNo, calculateTaxResponse.rcptNo) && Intrinsics.areEqual(this.rcpt_dt, calculateTaxResponse.rcpt_dt) && Intrinsics.areEqual(this.regnNo, calculateTaxResponse.regnNo) && Intrinsics.areEqual(this.state_cd, calculateTaxResponse.state_cd) && Intrinsics.areEqual(this.status, calculateTaxResponse.status) && Intrinsics.areEqual(this.taxBreakDetails, calculateTaxResponse.taxBreakDetails) && Intrinsics.areEqual(this.taxGroupDetails, calculateTaxResponse.taxGroupDetails) && Intrinsics.areEqual(this.taxMode, calculateTaxResponse.taxMode) && Intrinsics.areEqual(this.taxPurcdDesc, calculateTaxResponse.taxPurcdDesc) && Intrinsics.areEqual(this.taxhead, calculateTaxResponse.taxhead) && Double.compare(this.totalAmount, calculateTaxResponse.totalAmount) == 0 && Double.compare(this.totalPaybaleInterest, calculateTaxResponse.totalPaybaleInterest) == 0 && Double.compare(this.totalPaybalePenalty, calculateTaxResponse.totalPaybalePenalty) == 0 && Double.compare(this.totalPaybaleRebate, calculateTaxResponse.totalPaybaleRebate) == 0 && Double.compare(this.totalPaybaleSurcharge, calculateTaxResponse.totalPaybaleSurcharge) == 0 && Double.compare(this.totalPaybaleTax, calculateTaxResponse.totalPaybaleTax) == 0 && Double.compare(this.totalPaybaleTax1, calculateTaxResponse.totalPaybaleTax1) == 0 && Double.compare(this.totalPaybaleTax2, calculateTaxResponse.totalPaybaleTax2) == 0 && Intrinsics.areEqual(this.userID, calculateTaxResponse.userID) && Double.compare(this.vtTaxFinalFine, calculateTaxResponse.vtTaxFinalFine) == 0 && Double.compare(this.vtTaxFinalTax, calculateTaxResponse.vtTaxFinalTax) == 0 && Double.compare(this.userChrg, calculateTaxResponse.userChrg) == 0 && Double.compare(this.totalTransactionChrg, calculateTaxResponse.totalTransactionChrg) == 0;
    }

    public final Object getApplNo() {
        return this.applNo;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final String getDeal_cd() {
        return this.deal_cd;
    }

    public final double getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    public final String getFinalTaxFrom() {
        return this.finalTaxFrom;
    }

    public final String getFinalTaxUpto() {
        return this.finalTaxUpto;
    }

    public final int getNo_adv_units() {
        return this.no_adv_units;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final long getOp_dt() {
        return this.op_dt;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final Object getPayMode() {
        return this.payMode;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final List<Object> getPaymntCollectionBean() {
        return this.paymntCollectionBean;
    }

    public final double getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final Object getRcptDate() {
        return this.rcptDate;
    }

    public final Object getRcptNo() {
        return this.rcptNo;
    }

    public final Object getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final Object getStatus() {
        return this.status;
    }

    public final ArrayList<TaxBreakDetail> getTaxBreakDetails() {
        return this.taxBreakDetails;
    }

    public final ArrayList<TaxGroupDetail> getTaxGroupDetails() {
        return this.taxGroupDetails;
    }

    public final Object getTaxMode() {
        return this.taxMode;
    }

    public final Object getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    public final Object getTaxhead() {
        return this.taxhead;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final double getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    public final double getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    public final double getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    public final double getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    public final double getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    public final double getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    public final double getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    public final double getTotalTransactionChrg() {
        return this.totalTransactionChrg;
    }

    public final double getUserChrg() {
        return this.userChrg;
    }

    public final Object getUserID() {
        return this.userID;
    }

    public final double getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    public final double getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.appl_no.hashCode()) * 31) + this.deal_cd.hashCode()) * 31) + Double.hashCode(this.finalTaxAmount)) * 31) + this.finalTaxFrom.hashCode()) * 31) + this.finalTaxUpto.hashCode()) * 31) + Integer.hashCode(this.no_adv_units)) * 31) + Integer.hashCode(this.off_cd)) * 31) + Long.hashCode(this.op_dt)) * 31) + this.ownerName.hashCode()) * 31) + this.payMode.hashCode()) * 31) + this.paymentMode.hashCode()) * 31) + this.paymntCollectionBean.hashCode()) * 31) + Double.hashCode(this.previousAdjustment)) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcptDate.hashCode()) * 31) + this.rcptNo.hashCode()) * 31) + this.rcpt_dt.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.status.hashCode()) * 31) + this.taxBreakDetails.hashCode()) * 31) + this.taxGroupDetails.hashCode()) * 31) + this.taxMode.hashCode()) * 31) + this.taxPurcdDesc.hashCode()) * 31) + this.taxhead.hashCode()) * 31) + Double.hashCode(this.totalAmount)) * 31) + Double.hashCode(this.totalPaybaleInterest)) * 31) + Double.hashCode(this.totalPaybalePenalty)) * 31) + Double.hashCode(this.totalPaybaleRebate)) * 31) + Double.hashCode(this.totalPaybaleSurcharge)) * 31) + Double.hashCode(this.totalPaybaleTax)) * 31) + Double.hashCode(this.totalPaybaleTax1)) * 31) + Double.hashCode(this.totalPaybaleTax2)) * 31) + this.userID.hashCode()) * 31) + Double.hashCode(this.vtTaxFinalFine)) * 31) + Double.hashCode(this.vtTaxFinalTax)) * 31) + Double.hashCode(this.userChrg)) * 31) + Double.hashCode(this.totalTransactionChrg);
    }

    public String toString() {
        return "CalculateTaxResponse(applNo=" + this.applNo + ", appl_no=" + this.appl_no + ", deal_cd=" + this.deal_cd + ", finalTaxAmount=" + this.finalTaxAmount + ", finalTaxFrom=" + this.finalTaxFrom + ", finalTaxUpto=" + this.finalTaxUpto + ", no_adv_units=" + this.no_adv_units + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", ownerName=" + this.ownerName + ", payMode=" + this.payMode + ", paymentMode=" + this.paymentMode + ", paymntCollectionBean=" + this.paymntCollectionBean + ", previousAdjustment=" + this.previousAdjustment + ", pur_cd=" + this.pur_cd + ", rcptDate=" + this.rcptDate + ", rcptNo=" + this.rcptNo + ", rcpt_dt=" + this.rcpt_dt + ", regnNo=" + this.regnNo + ", state_cd=" + this.state_cd + ", status=" + this.status + ", taxBreakDetails=" + this.taxBreakDetails + ", taxGroupDetails=" + this.taxGroupDetails + ", taxMode=" + this.taxMode + ", taxPurcdDesc=" + this.taxPurcdDesc + ", taxhead=" + this.taxhead + ", totalAmount=" + this.totalAmount + ", totalPaybaleInterest=" + this.totalPaybaleInterest + ", totalPaybalePenalty=" + this.totalPaybalePenalty + ", totalPaybaleRebate=" + this.totalPaybaleRebate + ", totalPaybaleSurcharge=" + this.totalPaybaleSurcharge + ", totalPaybaleTax=" + this.totalPaybaleTax + ", totalPaybaleTax1=" + this.totalPaybaleTax1 + ", totalPaybaleTax2=" + this.totalPaybaleTax2 + ", userID=" + this.userID + ", vtTaxFinalFine=" + this.vtTaxFinalFine + ", vtTaxFinalTax=" + this.vtTaxFinalTax + ", userChrg=" + this.userChrg + ", totalTransactionChrg=" + this.totalTransactionChrg + ')';
    }
}
