package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bE\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003Jå\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0005HÆ\u0001J\u0013\u0010L\u001a\u00020\u00032\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\bHÖ\u0001J\t\u0010P\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001f¨\u0006Q"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/Fees;", "Ljava/io/Serializable;", "disableDropDown", "", "dueDate", "", "dueDateString", "exemptFeesAmount", "", "exemptFineAmount", "feeAmount", "feeHeadDescr", "fineAmount", "fromDate", "fromDateLable", "noOfApplications", "paymentId", "perRcpt", "perTrans", "purCd", "readOnlyFee", "renderFromDate", "renderUptoDate", "servicecharge", "totalAmount", "uptoDate", "uptoDateLable", "(ZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZZIILjava/lang/String;Ljava/lang/String;)V", "getDisableDropDown", "()Z", "getDueDate", "()Ljava/lang/String;", "getDueDateString", "getExemptFeesAmount", "()I", "getExemptFineAmount", "getFeeAmount", "getFeeHeadDescr", "getFineAmount", "getFromDate", "getFromDateLable", "getNoOfApplications", "getPaymentId", "getPerRcpt", "getPerTrans", "getPurCd", "getReadOnlyFee", "getRenderFromDate", "getRenderUptoDate", "getServicecharge", "getTotalAmount", "getUptoDate", "getUptoDateLable", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Fees implements Serializable {
    private final boolean disableDropDown;
    private final String dueDate;
    private final String dueDateString;
    private final int exemptFeesAmount;
    private final int exemptFineAmount;
    private final int feeAmount;
    private final String feeHeadDescr;
    private final int fineAmount;
    private final String fromDate;
    private final String fromDateLable;
    private final String noOfApplications;
    private final String paymentId;
    private final boolean perRcpt;
    private final boolean perTrans;
    private final int purCd;
    private final boolean readOnlyFee;
    private final boolean renderFromDate;
    private final boolean renderUptoDate;
    private final int servicecharge;
    private final int totalAmount;
    private final String uptoDate;
    private final String uptoDateLable;

    public Fees(boolean z, String dueDate, String dueDateString, int i, int i2, int i3, String feeHeadDescr, int i4, String fromDate, String fromDateLable, String noOfApplications, String paymentId, boolean z2, boolean z3, int i5, boolean z4, boolean z5, boolean z6, int i6, int i7, String uptoDate, String uptoDateLable) {
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
        this.exemptFeesAmount = i;
        this.exemptFineAmount = i2;
        this.feeAmount = i3;
        this.feeHeadDescr = feeHeadDescr;
        this.fineAmount = i4;
        this.fromDate = fromDate;
        this.fromDateLable = fromDateLable;
        this.noOfApplications = noOfApplications;
        this.paymentId = paymentId;
        this.perRcpt = z2;
        this.perTrans = z3;
        this.purCd = i5;
        this.readOnlyFee = z4;
        this.renderFromDate = z5;
        this.renderUptoDate = z6;
        this.servicecharge = i6;
        this.totalAmount = i7;
        this.uptoDate = uptoDate;
        this.uptoDateLable = uptoDateLable;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDisableDropDown() {
        return this.disableDropDown;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFromDateLable() {
        return this.fromDateLable;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNoOfApplications() {
        return this.noOfApplications;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPaymentId() {
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
    public final int getServicecharge() {
        return this.servicecharge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getUptoDate() {
        return this.uptoDate;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getUptoDateLable() {
        return this.uptoDateLable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDueDateString() {
        return this.dueDateString;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getExemptFeesAmount() {
        return this.exemptFeesAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getExemptFineAmount() {
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
    public final int getFineAmount() {
        return this.fineAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFromDate() {
        return this.fromDate;
    }

    public final Fees copy(boolean disableDropDown, String dueDate, String dueDateString, int exemptFeesAmount, int exemptFineAmount, int feeAmount, String feeHeadDescr, int fineAmount, String fromDate, String fromDateLable, String noOfApplications, String paymentId, boolean perRcpt, boolean perTrans, int purCd, boolean readOnlyFee, boolean renderFromDate, boolean renderUptoDate, int servicecharge, int totalAmount, String uptoDate, String uptoDateLable) {
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(dueDateString, "dueDateString");
        Intrinsics.checkNotNullParameter(feeHeadDescr, "feeHeadDescr");
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(fromDateLable, "fromDateLable");
        Intrinsics.checkNotNullParameter(noOfApplications, "noOfApplications");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(uptoDate, "uptoDate");
        Intrinsics.checkNotNullParameter(uptoDateLable, "uptoDateLable");
        return new Fees(disableDropDown, dueDate, dueDateString, exemptFeesAmount, exemptFineAmount, feeAmount, feeHeadDescr, fineAmount, fromDate, fromDateLable, noOfApplications, paymentId, perRcpt, perTrans, purCd, readOnlyFee, renderFromDate, renderUptoDate, servicecharge, totalAmount, uptoDate, uptoDateLable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fees)) {
            return false;
        }
        Fees fees = (Fees) other;
        return this.disableDropDown == fees.disableDropDown && Intrinsics.areEqual(this.dueDate, fees.dueDate) && Intrinsics.areEqual(this.dueDateString, fees.dueDateString) && this.exemptFeesAmount == fees.exemptFeesAmount && this.exemptFineAmount == fees.exemptFineAmount && this.feeAmount == fees.feeAmount && Intrinsics.areEqual(this.feeHeadDescr, fees.feeHeadDescr) && this.fineAmount == fees.fineAmount && Intrinsics.areEqual(this.fromDate, fees.fromDate) && Intrinsics.areEqual(this.fromDateLable, fees.fromDateLable) && Intrinsics.areEqual(this.noOfApplications, fees.noOfApplications) && Intrinsics.areEqual(this.paymentId, fees.paymentId) && this.perRcpt == fees.perRcpt && this.perTrans == fees.perTrans && this.purCd == fees.purCd && this.readOnlyFee == fees.readOnlyFee && this.renderFromDate == fees.renderFromDate && this.renderUptoDate == fees.renderUptoDate && this.servicecharge == fees.servicecharge && this.totalAmount == fees.totalAmount && Intrinsics.areEqual(this.uptoDate, fees.uptoDate) && Intrinsics.areEqual(this.uptoDateLable, fees.uptoDateLable);
    }

    public final boolean getDisableDropDown() {
        return this.disableDropDown;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getDueDateString() {
        return this.dueDateString;
    }

    public final int getExemptFeesAmount() {
        return this.exemptFeesAmount;
    }

    public final int getExemptFineAmount() {
        return this.exemptFineAmount;
    }

    public final int getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    public final int getFineAmount() {
        return this.fineAmount;
    }

    public final String getFromDate() {
        return this.fromDate;
    }

    public final String getFromDateLable() {
        return this.fromDateLable;
    }

    public final String getNoOfApplications() {
        return this.noOfApplications;
    }

    public final String getPaymentId() {
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

    public final int getServicecharge() {
        return this.servicecharge;
    }

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public final String getUptoDate() {
        return this.uptoDate;
    }

    public final String getUptoDateLable() {
        return this.uptoDateLable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
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
        int iHashCode = ((((((((((((((((((((((r0 * 31) + this.dueDate.hashCode()) * 31) + this.dueDateString.hashCode()) * 31) + Integer.hashCode(this.exemptFeesAmount)) * 31) + Integer.hashCode(this.exemptFineAmount)) * 31) + Integer.hashCode(this.feeAmount)) * 31) + this.feeHeadDescr.hashCode()) * 31) + Integer.hashCode(this.fineAmount)) * 31) + this.fromDate.hashCode()) * 31) + this.fromDateLable.hashCode()) * 31) + this.noOfApplications.hashCode()) * 31) + this.paymentId.hashCode()) * 31;
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
        return ((((((((i3 + (z6 ? 1 : z6)) * 31) + Integer.hashCode(this.servicecharge)) * 31) + Integer.hashCode(this.totalAmount)) * 31) + this.uptoDate.hashCode()) * 31) + this.uptoDateLable.hashCode();
    }

    public String toString() {
        return "Fees(disableDropDown=" + this.disableDropDown + ", dueDate=" + this.dueDate + ", dueDateString=" + this.dueDateString + ", exemptFeesAmount=" + this.exemptFeesAmount + ", exemptFineAmount=" + this.exemptFineAmount + ", feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", fineAmount=" + this.fineAmount + ", fromDate=" + this.fromDate + ", fromDateLable=" + this.fromDateLable + ", noOfApplications=" + this.noOfApplications + ", paymentId=" + this.paymentId + ", perRcpt=" + this.perRcpt + ", perTrans=" + this.perTrans + ", purCd=" + this.purCd + ", readOnlyFee=" + this.readOnlyFee + ", renderFromDate=" + this.renderFromDate + ", renderUptoDate=" + this.renderUptoDate + ", servicecharge=" + this.servicecharge + ", totalAmount=" + this.totalAmount + ", uptoDate=" + this.uptoDate + ", uptoDateLable=" + this.uptoDateLable + ')';
    }
}
