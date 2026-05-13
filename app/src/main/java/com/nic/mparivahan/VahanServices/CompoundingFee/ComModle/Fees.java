package com.nic.mparivahan.VahanServices.CompoundingFee.ComModle;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0002\u0010\u001cJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\u000bHÆ\u0003J\t\u0010I\u001a\u00020\rHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003JÛ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010M\u001a\u00020\u00032\b\u0010N\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010O\u001a\u00020\u000bHÖ\u0001J\t\u0010P\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 ¨\u0006Q"}, d2 = {"Lcom/nic/mparivahan/VahanServices/CompoundingFee/ComModle/Fees;", "Ljava/io/Serializable;", "disableDropDown", "", "dueDate", "", "dueDateString", "exemptFeesAmount", "", "exemptFineAmount", "feeAmount", "", "feeHeadDescr", "", "fineAmount", "fromDate", "fromDateLable", "noOfApplications", "paymentId", "perRcpt", "perTrans", "purCd", "readOnlyFee", "renderFromDate", "renderUptoDate", "totalAmount", "uptoDate", "uptoDateLable", "(ZLjava/lang/Object;Ljava/lang/Object;DDILjava/lang/String;DLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZIZZZDLjava/lang/Object;Ljava/lang/Object;)V", "getDisableDropDown", "()Z", "getDueDate", "()Ljava/lang/Object;", "getDueDateString", "getExemptFeesAmount", "()D", "getExemptFineAmount", "getFeeAmount", "()I", "getFeeHeadDescr", "()Ljava/lang/String;", "getFineAmount", "getFromDate", "getFromDateLable", "getNoOfApplications", "getPaymentId", "getPerRcpt", "getPerTrans", "getPurCd", "getReadOnlyFee", "getRenderFromDate", "getRenderUptoDate", "getTotalAmount", "getUptoDate", "getUptoDateLable", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Fees implements Serializable {
    private final boolean disableDropDown;
    private final Object dueDate;
    private final Object dueDateString;
    private final double exemptFeesAmount;
    private final double exemptFineAmount;
    private final int feeAmount;
    private final String feeHeadDescr;
    private final double fineAmount;
    private final Object fromDate;
    private final Object fromDateLable;
    private final Object noOfApplications;
    private final Object paymentId;
    private final boolean perRcpt;
    private final boolean perTrans;
    private final int purCd;
    private final boolean readOnlyFee;
    private final boolean renderFromDate;
    private final boolean renderUptoDate;
    private final double totalAmount;
    private final Object uptoDate;
    private final Object uptoDateLable;

    public Fees(boolean z, Object dueDate, Object dueDateString, double d, double d2, int i, String feeHeadDescr, double d3, Object fromDate, Object fromDateLable, Object noOfApplications, Object paymentId, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, double d4, Object uptoDate, Object uptoDateLable) {
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(dueDateString, "dueDateString");
        Intrinsics.checkNotNullParameter(feeHeadDescr, "feeHeadDescr");
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(fromDateLable, "fromDateLable");
        Intrinsics.checkNotNullParameter(noOfApplications, "noOfApplications");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(uptoDate, "uptoDate");
        Intrinsics.checkNotNullParameter(uptoDateLable, "uptoDateLable");
        this.disableDropDown = z;
        this.dueDate = dueDate;
        this.dueDateString = dueDateString;
        this.exemptFeesAmount = d;
        this.exemptFineAmount = d2;
        this.feeAmount = i;
        this.feeHeadDescr = feeHeadDescr;
        this.fineAmount = d3;
        this.fromDate = fromDate;
        this.fromDateLable = fromDateLable;
        this.noOfApplications = noOfApplications;
        this.paymentId = paymentId;
        this.perRcpt = z2;
        this.perTrans = z3;
        this.purCd = i2;
        this.readOnlyFee = z4;
        this.renderFromDate = z5;
        this.renderUptoDate = z6;
        this.totalAmount = d4;
        this.uptoDate = uptoDate;
        this.uptoDateLable = uptoDateLable;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDisableDropDown() {
        return this.disableDropDown;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getFromDateLable() {
        return this.fromDateLable;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getNoOfApplications() {
        return this.noOfApplications;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getPerRcpt() {
        return this.perRcpt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getPerTrans() {
        return this.perTrans;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getReadOnlyFee() {
        return this.readOnlyFee;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getRenderFromDate() {
        return this.renderFromDate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getRenderUptoDate() {
        return this.renderUptoDate;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final double getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getUptoDate() {
        return this.uptoDate;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getUptoDateLable() {
        return this.uptoDateLable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getDueDateString() {
        return this.dueDateString;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getExemptFeesAmount() {
        return this.exemptFeesAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getExemptFineAmount() {
        return this.exemptFineAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getFineAmount() {
        return this.fineAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getFromDate() {
        return this.fromDate;
    }

    public final Fees copy(boolean disableDropDown, Object dueDate, Object dueDateString, double exemptFeesAmount, double exemptFineAmount, int feeAmount, String feeHeadDescr, double fineAmount, Object fromDate, Object fromDateLable, Object noOfApplications, Object paymentId, boolean perRcpt, boolean perTrans, int purCd, boolean readOnlyFee, boolean renderFromDate, boolean renderUptoDate, double totalAmount, Object uptoDate, Object uptoDateLable) {
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(dueDateString, "dueDateString");
        Intrinsics.checkNotNullParameter(feeHeadDescr, "feeHeadDescr");
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(fromDateLable, "fromDateLable");
        Intrinsics.checkNotNullParameter(noOfApplications, "noOfApplications");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(uptoDate, "uptoDate");
        Intrinsics.checkNotNullParameter(uptoDateLable, "uptoDateLable");
        return new Fees(disableDropDown, dueDate, dueDateString, exemptFeesAmount, exemptFineAmount, feeAmount, feeHeadDescr, fineAmount, fromDate, fromDateLable, noOfApplications, paymentId, perRcpt, perTrans, purCd, readOnlyFee, renderFromDate, renderUptoDate, totalAmount, uptoDate, uptoDateLable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fees)) {
            return false;
        }
        Fees fees = (Fees) other;
        return this.disableDropDown == fees.disableDropDown && Intrinsics.areEqual(this.dueDate, fees.dueDate) && Intrinsics.areEqual(this.dueDateString, fees.dueDateString) && Double.compare(this.exemptFeesAmount, fees.exemptFeesAmount) == 0 && Double.compare(this.exemptFineAmount, fees.exemptFineAmount) == 0 && this.feeAmount == fees.feeAmount && Intrinsics.areEqual(this.feeHeadDescr, fees.feeHeadDescr) && Double.compare(this.fineAmount, fees.fineAmount) == 0 && Intrinsics.areEqual(this.fromDate, fees.fromDate) && Intrinsics.areEqual(this.fromDateLable, fees.fromDateLable) && Intrinsics.areEqual(this.noOfApplications, fees.noOfApplications) && Intrinsics.areEqual(this.paymentId, fees.paymentId) && this.perRcpt == fees.perRcpt && this.perTrans == fees.perTrans && this.purCd == fees.purCd && this.readOnlyFee == fees.readOnlyFee && this.renderFromDate == fees.renderFromDate && this.renderUptoDate == fees.renderUptoDate && Double.compare(this.totalAmount, fees.totalAmount) == 0 && Intrinsics.areEqual(this.uptoDate, fees.uptoDate) && Intrinsics.areEqual(this.uptoDateLable, fees.uptoDateLable);
    }

    public final boolean getDisableDropDown() {
        return this.disableDropDown;
    }

    public final Object getDueDate() {
        return this.dueDate;
    }

    public final Object getDueDateString() {
        return this.dueDateString;
    }

    public final double getExemptFeesAmount() {
        return this.exemptFeesAmount;
    }

    public final double getExemptFineAmount() {
        return this.exemptFineAmount;
    }

    public final int getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    public final double getFineAmount() {
        return this.fineAmount;
    }

    public final Object getFromDate() {
        return this.fromDate;
    }

    public final Object getFromDateLable() {
        return this.fromDateLable;
    }

    public final Object getNoOfApplications() {
        return this.noOfApplications;
    }

    public final Object getPaymentId() {
        return this.paymentId;
    }

    public final boolean getPerRcpt() {
        return this.perRcpt;
    }

    public final boolean getPerTrans() {
        return this.perTrans;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final boolean getReadOnlyFee() {
        return this.readOnlyFee;
    }

    public final boolean getRenderFromDate() {
        return this.renderFromDate;
    }

    public final boolean getRenderUptoDate() {
        return this.renderUptoDate;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final Object getUptoDate() {
        return this.uptoDate;
    }

    public final Object getUptoDateLable() {
        return this.uptoDateLable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    public int hashCode() {
        boolean z = this.disableDropDown;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((((((((((((((((((((r0 * 31) + this.dueDate.hashCode()) * 31) + this.dueDateString.hashCode()) * 31) + Double.hashCode(this.exemptFeesAmount)) * 31) + Double.hashCode(this.exemptFineAmount)) * 31) + Integer.hashCode(this.feeAmount)) * 31) + this.feeHeadDescr.hashCode()) * 31) + Double.hashCode(this.fineAmount)) * 31) + this.fromDate.hashCode()) * 31) + this.fromDateLable.hashCode()) * 31) + this.noOfApplications.hashCode()) * 31) + this.paymentId.hashCode()) * 31;
        boolean z2 = this.perRcpt;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z3 = this.perTrans;
        ?? r22 = z3;
        if (z3) {
            r22 = 1;
        }
        int iHashCode2 = (((i + r22) * 31) + Integer.hashCode(this.purCd)) * 31;
        boolean z4 = this.readOnlyFee;
        ?? r23 = z4;
        if (z4) {
            r23 = 1;
        }
        int i2 = (iHashCode2 + r23) * 31;
        boolean z5 = this.renderFromDate;
        ?? r24 = z5;
        if (z5) {
            r24 = 1;
        }
        int i3 = (i2 + r24) * 31;
        boolean z6 = this.renderUptoDate;
        return ((((((i3 + (z6 ? 1 : z6)) * 31) + Double.hashCode(this.totalAmount)) * 31) + this.uptoDate.hashCode()) * 31) + this.uptoDateLable.hashCode();
    }

    public String toString() {
        return "Fees(disableDropDown=" + this.disableDropDown + ", dueDate=" + this.dueDate + ", dueDateString=" + this.dueDateString + ", exemptFeesAmount=" + this.exemptFeesAmount + ", exemptFineAmount=" + this.exemptFineAmount + ", feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", fineAmount=" + this.fineAmount + ", fromDate=" + this.fromDate + ", fromDateLable=" + this.fromDateLable + ", noOfApplications=" + this.noOfApplications + ", paymentId=" + this.paymentId + ", perRcpt=" + this.perRcpt + ", perTrans=" + this.perTrans + ", purCd=" + this.purCd + ", readOnlyFee=" + this.readOnlyFee + ", renderFromDate=" + this.renderFromDate + ", renderUptoDate=" + this.renderUptoDate + ", totalAmount=" + this.totalAmount + ", uptoDate=" + this.uptoDate + ", uptoDateLable=" + this.uptoDateLable + ')';
    }
}
