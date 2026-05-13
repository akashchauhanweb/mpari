package com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/FeeModel/Fees;", "", "feeAmount", "", "feeHeadDescr", "", "fineAmount", "purCd", "servicecharge", "totalAmount", "(ILjava/lang/String;IILjava/lang/String;I)V", "getFeeAmount", "()I", "getFeeHeadDescr", "()Ljava/lang/String;", "getFineAmount", "getPurCd", "getServicecharge", "getTotalAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Fees {
    private final int feeAmount;
    private final String feeHeadDescr;
    private final int fineAmount;
    private final int purCd;
    private final String servicecharge;
    private final int totalAmount;

    public Fees(int i, String str, int i2, int i3, String str2, int i4) {
        this.feeAmount = i;
        this.feeHeadDescr = str;
        this.fineAmount = i2;
        this.purCd = i3;
        this.servicecharge = str2;
        this.totalAmount = i4;
    }

    public static /* synthetic */ Fees copy$default(Fees fees, int i, String str, int i2, int i3, String str2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = fees.feeAmount;
        }
        if ((i5 & 2) != 0) {
            str = fees.feeHeadDescr;
        }
        String str3 = str;
        if ((i5 & 4) != 0) {
            i2 = fees.fineAmount;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = fees.purCd;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            str2 = fees.servicecharge;
        }
        String str4 = str2;
        if ((i5 & 32) != 0) {
            i4 = fees.totalAmount;
        }
        return fees.copy(i, str3, i6, i7, str4, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFineAmount() {
        return this.fineAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getServicecharge() {
        return this.servicecharge;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public final Fees copy(int feeAmount, String feeHeadDescr, int fineAmount, int purCd, String servicecharge, int totalAmount) {
        return new Fees(feeAmount, feeHeadDescr, fineAmount, purCd, servicecharge, totalAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fees)) {
            return false;
        }
        Fees fees = (Fees) other;
        return this.feeAmount == fees.feeAmount && Intrinsics.areEqual(this.feeHeadDescr, fees.feeHeadDescr) && this.fineAmount == fees.fineAmount && this.purCd == fees.purCd && Intrinsics.areEqual(this.servicecharge, fees.servicecharge) && this.totalAmount == fees.totalAmount;
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

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getServicecharge() {
        return this.servicecharge;
    }

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.feeAmount) * 31;
        String str = this.feeHeadDescr;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.fineAmount)) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str2 = this.servicecharge;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.totalAmount);
    }

    public String toString() {
        return "Fees(feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", fineAmount=" + this.fineAmount + ", purCd=" + this.purCd + ", servicecharge=" + this.servicecharge + ", totalAmount=" + this.totalAmount + ')';
    }
}
