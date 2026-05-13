package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\bf\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0002\u0010(J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\rHÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\rHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\rHÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003Jñ\u0002\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u0003HÆ\u0001J\u0013\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010v\u001a\u00020\rHÖ\u0001J\t\u0010w\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0011\u0010\u0019\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010*R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010*R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010*R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010*R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010*R\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010*¨\u0006x"}, d2 = {"Lcom/nic/mparivahan/Tax/Model/Afterpayment;", "", "bank_CODE", "", "bank_FILE_NAME", "bankdesc", "cart_NAME", "cart_TRANS_DATE", "chassis", "deal_CD", "exceptionheader", "is_MULTIPLE_PAYMENT", "off_CD", "", "off_descr", "owner_name", "pay_MODE", "pgidecyresp", "pgidesc", "pgiencyresp", "pur_CD", "rcp_dt", "rcpt_AMT", "rcpt_DT", "rcpt_NO", "rcpt_amt", "regn_NO", "regn_date", "response_CODE", "return_RCPT_NO", "state_CD", "state_header", "status_DESC", "tax_FROM", "tax_MODE", "tax_UPTO", "trans_NO", "treasury_FLAG", "treasury_REF_NO", "vh_class", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBank_CODE", "()Ljava/lang/String;", "getBank_FILE_NAME", "getBankdesc", "getCart_NAME", "getCart_TRANS_DATE", "getChassis", "getDeal_CD", "getExceptionheader", "getOff_CD", "()I", "getOff_descr", "getOwner_name", "getPay_MODE", "getPgidecyresp", "getPgidesc", "getPgiencyresp", "getPur_CD", "getRcp_dt", "getRcpt_AMT", "getRcpt_DT", "getRcpt_NO", "getRcpt_amt", "getRegn_NO", "getRegn_date", "getResponse_CODE", "getReturn_RCPT_NO", "getState_CD", "getState_header", "getStatus_DESC", "getTax_FROM", "getTax_MODE", "getTax_UPTO", "getTrans_NO", "getTreasury_FLAG", "getTreasury_REF_NO", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Afterpayment {
    private final String bank_CODE;
    private final String bank_FILE_NAME;
    private final String bankdesc;
    private final String cart_NAME;
    private final String cart_TRANS_DATE;
    private final String chassis;
    private final String deal_CD;
    private final String exceptionheader;
    private final String is_MULTIPLE_PAYMENT;
    private final int off_CD;
    private final String off_descr;
    private final String owner_name;
    private final String pay_MODE;
    private final String pgidecyresp;
    private final String pgidesc;
    private final String pgiencyresp;
    private final int pur_CD;
    private final String rcp_dt;
    private final int rcpt_AMT;
    private final String rcpt_DT;
    private final String rcpt_NO;
    private final int rcpt_amt;
    private final String regn_NO;
    private final String regn_date;
    private final String response_CODE;
    private final String return_RCPT_NO;
    private final String state_CD;
    private final String state_header;
    private final String status_DESC;
    private final String tax_FROM;
    private final String tax_MODE;
    private final String tax_UPTO;
    private final String trans_NO;
    private final String treasury_FLAG;
    private final String treasury_REF_NO;
    private final String vh_class;

    public Afterpayment(String bank_CODE, String bank_FILE_NAME, String bankdesc, String cart_NAME, String cart_TRANS_DATE, String chassis, String deal_CD, String exceptionheader, String is_MULTIPLE_PAYMENT, int i, String off_descr, String owner_name, String pay_MODE, String pgidecyresp, String pgidesc, String pgiencyresp, int i2, String rcp_dt, int i3, String rcpt_DT, String rcpt_NO, int i4, String regn_NO, String regn_date, String response_CODE, String return_RCPT_NO, String state_CD, String state_header, String status_DESC, String tax_FROM, String tax_MODE, String tax_UPTO, String trans_NO, String treasury_FLAG, String treasury_REF_NO, String vh_class) {
        Intrinsics.checkNotNullParameter(bank_CODE, "bank_CODE");
        Intrinsics.checkNotNullParameter(bank_FILE_NAME, "bank_FILE_NAME");
        Intrinsics.checkNotNullParameter(bankdesc, "bankdesc");
        Intrinsics.checkNotNullParameter(cart_NAME, "cart_NAME");
        Intrinsics.checkNotNullParameter(cart_TRANS_DATE, "cart_TRANS_DATE");
        Intrinsics.checkNotNullParameter(chassis, "chassis");
        Intrinsics.checkNotNullParameter(deal_CD, "deal_CD");
        Intrinsics.checkNotNullParameter(exceptionheader, "exceptionheader");
        Intrinsics.checkNotNullParameter(is_MULTIPLE_PAYMENT, "is_MULTIPLE_PAYMENT");
        Intrinsics.checkNotNullParameter(off_descr, "off_descr");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(pay_MODE, "pay_MODE");
        Intrinsics.checkNotNullParameter(pgidecyresp, "pgidecyresp");
        Intrinsics.checkNotNullParameter(pgidesc, "pgidesc");
        Intrinsics.checkNotNullParameter(pgiencyresp, "pgiencyresp");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_DT, "rcpt_DT");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(regn_NO, "regn_NO");
        Intrinsics.checkNotNullParameter(regn_date, "regn_date");
        Intrinsics.checkNotNullParameter(response_CODE, "response_CODE");
        Intrinsics.checkNotNullParameter(return_RCPT_NO, "return_RCPT_NO");
        Intrinsics.checkNotNullParameter(state_CD, "state_CD");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status_DESC, "status_DESC");
        Intrinsics.checkNotNullParameter(tax_FROM, "tax_FROM");
        Intrinsics.checkNotNullParameter(tax_MODE, "tax_MODE");
        Intrinsics.checkNotNullParameter(tax_UPTO, "tax_UPTO");
        Intrinsics.checkNotNullParameter(trans_NO, "trans_NO");
        Intrinsics.checkNotNullParameter(treasury_FLAG, "treasury_FLAG");
        Intrinsics.checkNotNullParameter(treasury_REF_NO, "treasury_REF_NO");
        Intrinsics.checkNotNullParameter(vh_class, "vh_class");
        this.bank_CODE = bank_CODE;
        this.bank_FILE_NAME = bank_FILE_NAME;
        this.bankdesc = bankdesc;
        this.cart_NAME = cart_NAME;
        this.cart_TRANS_DATE = cart_TRANS_DATE;
        this.chassis = chassis;
        this.deal_CD = deal_CD;
        this.exceptionheader = exceptionheader;
        this.is_MULTIPLE_PAYMENT = is_MULTIPLE_PAYMENT;
        this.off_CD = i;
        this.off_descr = off_descr;
        this.owner_name = owner_name;
        this.pay_MODE = pay_MODE;
        this.pgidecyresp = pgidecyresp;
        this.pgidesc = pgidesc;
        this.pgiencyresp = pgiencyresp;
        this.pur_CD = i2;
        this.rcp_dt = rcp_dt;
        this.rcpt_AMT = i3;
        this.rcpt_DT = rcpt_DT;
        this.rcpt_NO = rcpt_NO;
        this.rcpt_amt = i4;
        this.regn_NO = regn_NO;
        this.regn_date = regn_date;
        this.response_CODE = response_CODE;
        this.return_RCPT_NO = return_RCPT_NO;
        this.state_CD = state_CD;
        this.state_header = state_header;
        this.status_DESC = status_DESC;
        this.tax_FROM = tax_FROM;
        this.tax_MODE = tax_MODE;
        this.tax_UPTO = tax_UPTO;
        this.trans_NO = trans_NO;
        this.treasury_FLAG = treasury_FLAG;
        this.treasury_REF_NO = treasury_REF_NO;
        this.vh_class = vh_class;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBank_CODE() {
        return this.bank_CODE;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOff_CD() {
        return this.off_CD;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOff_descr() {
        return this.off_descr;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPay_MODE() {
        return this.pay_MODE;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPgidecyresp() {
        return this.pgidecyresp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPgidesc() {
        return this.pgidesc;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPgiencyresp() {
        return this.pgiencyresp;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getPur_CD() {
        return this.pur_CD;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getRcpt_AMT() {
        return this.rcpt_AMT;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBank_FILE_NAME() {
        return this.bank_FILE_NAME;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRcpt_DT() {
        return this.rcpt_DT;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRegn_NO() {
        return this.regn_NO;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getRegn_date() {
        return this.regn_date;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getResponse_CODE() {
        return this.response_CODE;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getReturn_RCPT_NO() {
        return this.return_RCPT_NO;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getState_CD() {
        return this.state_CD;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getStatus_DESC() {
        return this.status_DESC;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBankdesc() {
        return this.bankdesc;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getTax_FROM() {
        return this.tax_FROM;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTax_MODE() {
        return this.tax_MODE;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getTax_UPTO() {
        return this.tax_UPTO;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getTrans_NO() {
        return this.trans_NO;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getTreasury_FLAG() {
        return this.treasury_FLAG;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCart_NAME() {
        return this.cart_NAME;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCart_TRANS_DATE() {
        return this.cart_TRANS_DATE;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChassis() {
        return this.chassis;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeal_CD() {
        return this.deal_CD;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getExceptionheader() {
        return this.exceptionheader;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIs_MULTIPLE_PAYMENT() {
        return this.is_MULTIPLE_PAYMENT;
    }

    public final Afterpayment copy(String bank_CODE, String bank_FILE_NAME, String bankdesc, String cart_NAME, String cart_TRANS_DATE, String chassis, String deal_CD, String exceptionheader, String is_MULTIPLE_PAYMENT, int off_CD, String off_descr, String owner_name, String pay_MODE, String pgidecyresp, String pgidesc, String pgiencyresp, int pur_CD, String rcp_dt, int rcpt_AMT, String rcpt_DT, String rcpt_NO, int rcpt_amt, String regn_NO, String regn_date, String response_CODE, String return_RCPT_NO, String state_CD, String state_header, String status_DESC, String tax_FROM, String tax_MODE, String tax_UPTO, String trans_NO, String treasury_FLAG, String treasury_REF_NO, String vh_class) {
        Intrinsics.checkNotNullParameter(bank_CODE, "bank_CODE");
        Intrinsics.checkNotNullParameter(bank_FILE_NAME, "bank_FILE_NAME");
        Intrinsics.checkNotNullParameter(bankdesc, "bankdesc");
        Intrinsics.checkNotNullParameter(cart_NAME, "cart_NAME");
        Intrinsics.checkNotNullParameter(cart_TRANS_DATE, "cart_TRANS_DATE");
        Intrinsics.checkNotNullParameter(chassis, "chassis");
        Intrinsics.checkNotNullParameter(deal_CD, "deal_CD");
        Intrinsics.checkNotNullParameter(exceptionheader, "exceptionheader");
        Intrinsics.checkNotNullParameter(is_MULTIPLE_PAYMENT, "is_MULTIPLE_PAYMENT");
        Intrinsics.checkNotNullParameter(off_descr, "off_descr");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(pay_MODE, "pay_MODE");
        Intrinsics.checkNotNullParameter(pgidecyresp, "pgidecyresp");
        Intrinsics.checkNotNullParameter(pgidesc, "pgidesc");
        Intrinsics.checkNotNullParameter(pgiencyresp, "pgiencyresp");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_DT, "rcpt_DT");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(regn_NO, "regn_NO");
        Intrinsics.checkNotNullParameter(regn_date, "regn_date");
        Intrinsics.checkNotNullParameter(response_CODE, "response_CODE");
        Intrinsics.checkNotNullParameter(return_RCPT_NO, "return_RCPT_NO");
        Intrinsics.checkNotNullParameter(state_CD, "state_CD");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status_DESC, "status_DESC");
        Intrinsics.checkNotNullParameter(tax_FROM, "tax_FROM");
        Intrinsics.checkNotNullParameter(tax_MODE, "tax_MODE");
        Intrinsics.checkNotNullParameter(tax_UPTO, "tax_UPTO");
        Intrinsics.checkNotNullParameter(trans_NO, "trans_NO");
        Intrinsics.checkNotNullParameter(treasury_FLAG, "treasury_FLAG");
        Intrinsics.checkNotNullParameter(treasury_REF_NO, "treasury_REF_NO");
        Intrinsics.checkNotNullParameter(vh_class, "vh_class");
        return new Afterpayment(bank_CODE, bank_FILE_NAME, bankdesc, cart_NAME, cart_TRANS_DATE, chassis, deal_CD, exceptionheader, is_MULTIPLE_PAYMENT, off_CD, off_descr, owner_name, pay_MODE, pgidecyresp, pgidesc, pgiencyresp, pur_CD, rcp_dt, rcpt_AMT, rcpt_DT, rcpt_NO, rcpt_amt, regn_NO, regn_date, response_CODE, return_RCPT_NO, state_CD, state_header, status_DESC, tax_FROM, tax_MODE, tax_UPTO, trans_NO, treasury_FLAG, treasury_REF_NO, vh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Afterpayment)) {
            return false;
        }
        Afterpayment afterpayment = (Afterpayment) other;
        return Intrinsics.areEqual(this.bank_CODE, afterpayment.bank_CODE) && Intrinsics.areEqual(this.bank_FILE_NAME, afterpayment.bank_FILE_NAME) && Intrinsics.areEqual(this.bankdesc, afterpayment.bankdesc) && Intrinsics.areEqual(this.cart_NAME, afterpayment.cart_NAME) && Intrinsics.areEqual(this.cart_TRANS_DATE, afterpayment.cart_TRANS_DATE) && Intrinsics.areEqual(this.chassis, afterpayment.chassis) && Intrinsics.areEqual(this.deal_CD, afterpayment.deal_CD) && Intrinsics.areEqual(this.exceptionheader, afterpayment.exceptionheader) && Intrinsics.areEqual(this.is_MULTIPLE_PAYMENT, afterpayment.is_MULTIPLE_PAYMENT) && this.off_CD == afterpayment.off_CD && Intrinsics.areEqual(this.off_descr, afterpayment.off_descr) && Intrinsics.areEqual(this.owner_name, afterpayment.owner_name) && Intrinsics.areEqual(this.pay_MODE, afterpayment.pay_MODE) && Intrinsics.areEqual(this.pgidecyresp, afterpayment.pgidecyresp) && Intrinsics.areEqual(this.pgidesc, afterpayment.pgidesc) && Intrinsics.areEqual(this.pgiencyresp, afterpayment.pgiencyresp) && this.pur_CD == afterpayment.pur_CD && Intrinsics.areEqual(this.rcp_dt, afterpayment.rcp_dt) && this.rcpt_AMT == afterpayment.rcpt_AMT && Intrinsics.areEqual(this.rcpt_DT, afterpayment.rcpt_DT) && Intrinsics.areEqual(this.rcpt_NO, afterpayment.rcpt_NO) && this.rcpt_amt == afterpayment.rcpt_amt && Intrinsics.areEqual(this.regn_NO, afterpayment.regn_NO) && Intrinsics.areEqual(this.regn_date, afterpayment.regn_date) && Intrinsics.areEqual(this.response_CODE, afterpayment.response_CODE) && Intrinsics.areEqual(this.return_RCPT_NO, afterpayment.return_RCPT_NO) && Intrinsics.areEqual(this.state_CD, afterpayment.state_CD) && Intrinsics.areEqual(this.state_header, afterpayment.state_header) && Intrinsics.areEqual(this.status_DESC, afterpayment.status_DESC) && Intrinsics.areEqual(this.tax_FROM, afterpayment.tax_FROM) && Intrinsics.areEqual(this.tax_MODE, afterpayment.tax_MODE) && Intrinsics.areEqual(this.tax_UPTO, afterpayment.tax_UPTO) && Intrinsics.areEqual(this.trans_NO, afterpayment.trans_NO) && Intrinsics.areEqual(this.treasury_FLAG, afterpayment.treasury_FLAG) && Intrinsics.areEqual(this.treasury_REF_NO, afterpayment.treasury_REF_NO) && Intrinsics.areEqual(this.vh_class, afterpayment.vh_class);
    }

    public final String getBank_CODE() {
        return this.bank_CODE;
    }

    public final String getBank_FILE_NAME() {
        return this.bank_FILE_NAME;
    }

    public final String getBankdesc() {
        return this.bankdesc;
    }

    public final String getCart_NAME() {
        return this.cart_NAME;
    }

    public final String getCart_TRANS_DATE() {
        return this.cart_TRANS_DATE;
    }

    public final String getChassis() {
        return this.chassis;
    }

    public final String getDeal_CD() {
        return this.deal_CD;
    }

    public final String getExceptionheader() {
        return this.exceptionheader;
    }

    public final int getOff_CD() {
        return this.off_CD;
    }

    public final String getOff_descr() {
        return this.off_descr;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getPay_MODE() {
        return this.pay_MODE;
    }

    public final String getPgidecyresp() {
        return this.pgidecyresp;
    }

    public final String getPgidesc() {
        return this.pgidesc;
    }

    public final String getPgiencyresp() {
        return this.pgiencyresp;
    }

    public final int getPur_CD() {
        return this.pur_CD;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final int getRcpt_AMT() {
        return this.rcpt_AMT;
    }

    public final String getRcpt_DT() {
        return this.rcpt_DT;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getRegn_NO() {
        return this.regn_NO;
    }

    public final String getRegn_date() {
        return this.regn_date;
    }

    public final String getResponse_CODE() {
        return this.response_CODE;
    }

    public final String getReturn_RCPT_NO() {
        return this.return_RCPT_NO;
    }

    public final String getState_CD() {
        return this.state_CD;
    }

    public final String getState_header() {
        return this.state_header;
    }

    public final String getStatus_DESC() {
        return this.status_DESC;
    }

    public final String getTax_FROM() {
        return this.tax_FROM;
    }

    public final String getTax_MODE() {
        return this.tax_MODE;
    }

    public final String getTax_UPTO() {
        return this.tax_UPTO;
    }

    public final String getTrans_NO() {
        return this.trans_NO;
    }

    public final String getTreasury_FLAG() {
        return this.treasury_FLAG;
    }

    public final String getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.bank_CODE.hashCode() * 31) + this.bank_FILE_NAME.hashCode()) * 31) + this.bankdesc.hashCode()) * 31) + this.cart_NAME.hashCode()) * 31) + this.cart_TRANS_DATE.hashCode()) * 31) + this.chassis.hashCode()) * 31) + this.deal_CD.hashCode()) * 31) + this.exceptionheader.hashCode()) * 31) + this.is_MULTIPLE_PAYMENT.hashCode()) * 31) + Integer.hashCode(this.off_CD)) * 31) + this.off_descr.hashCode()) * 31) + this.owner_name.hashCode()) * 31) + this.pay_MODE.hashCode()) * 31) + this.pgidecyresp.hashCode()) * 31) + this.pgidesc.hashCode()) * 31) + this.pgiencyresp.hashCode()) * 31) + Integer.hashCode(this.pur_CD)) * 31) + this.rcp_dt.hashCode()) * 31) + Integer.hashCode(this.rcpt_AMT)) * 31) + this.rcpt_DT.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Integer.hashCode(this.rcpt_amt)) * 31) + this.regn_NO.hashCode()) * 31) + this.regn_date.hashCode()) * 31) + this.response_CODE.hashCode()) * 31) + this.return_RCPT_NO.hashCode()) * 31) + this.state_CD.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status_DESC.hashCode()) * 31) + this.tax_FROM.hashCode()) * 31) + this.tax_MODE.hashCode()) * 31) + this.tax_UPTO.hashCode()) * 31) + this.trans_NO.hashCode()) * 31) + this.treasury_FLAG.hashCode()) * 31) + this.treasury_REF_NO.hashCode()) * 31) + this.vh_class.hashCode();
    }

    public final String is_MULTIPLE_PAYMENT() {
        return this.is_MULTIPLE_PAYMENT;
    }

    public String toString() {
        return "Afterpayment(bank_CODE=" + this.bank_CODE + ", bank_FILE_NAME=" + this.bank_FILE_NAME + ", bankdesc=" + this.bankdesc + ", cart_NAME=" + this.cart_NAME + ", cart_TRANS_DATE=" + this.cart_TRANS_DATE + ", chassis=" + this.chassis + ", deal_CD=" + this.deal_CD + ", exceptionheader=" + this.exceptionheader + ", is_MULTIPLE_PAYMENT=" + this.is_MULTIPLE_PAYMENT + ", off_CD=" + this.off_CD + ", off_descr=" + this.off_descr + ", owner_name=" + this.owner_name + ", pay_MODE=" + this.pay_MODE + ", pgidecyresp=" + this.pgidecyresp + ", pgidesc=" + this.pgidesc + ", pgiencyresp=" + this.pgiencyresp + ", pur_CD=" + this.pur_CD + ", rcp_dt=" + this.rcp_dt + ", rcpt_AMT=" + this.rcpt_AMT + ", rcpt_DT=" + this.rcpt_DT + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", regn_NO=" + this.regn_NO + ", regn_date=" + this.regn_date + ", response_CODE=" + this.response_CODE + ", return_RCPT_NO=" + this.return_RCPT_NO + ", state_CD=" + this.state_CD + ", state_header=" + this.state_header + ", status_DESC=" + this.status_DESC + ", tax_FROM=" + this.tax_FROM + ", tax_MODE=" + this.tax_MODE + ", tax_UPTO=" + this.tax_UPTO + ", trans_NO=" + this.trans_NO + ", treasury_FLAG=" + this.treasury_FLAG + ", treasury_REF_NO=" + this.treasury_REF_NO + ", vh_class=" + this.vh_class + ')';
    }
}
