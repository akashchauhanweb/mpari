package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/FeesModleItem;", "", "feeAmount", "", "feeHeadDescr", "", "servicecharge", "fineAmount", "", "purCd", "totalAmount", "(ILjava/lang/String;Ljava/lang/String;DID)V", "getFeeAmount", "()I", "getFeeHeadDescr", "()Ljava/lang/String;", "getFineAmount", "()D", "getPurCd", "getServicecharge", "getTotalAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FeesModleItem {
    private final int feeAmount;
    private final String feeHeadDescr;
    private final double fineAmount;
    private final int purCd;
    private final String servicecharge;
    private final double totalAmount;

    public FeesModleItem(int i, String feeHeadDescr, String str, double d, int i2, double d2) {
        Intrinsics.checkNotNullParameter(feeHeadDescr, "feeHeadDescr");
        this.feeAmount = i;
        this.feeHeadDescr = feeHeadDescr;
        this.servicecharge = str;
        this.fineAmount = d;
        this.purCd = i2;
        this.totalAmount = d2;
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
    public final String getServicecharge() {
        return this.servicecharge;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getFineAmount() {
        return this.fineAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final FeesModleItem copy(int feeAmount, String feeHeadDescr, String servicecharge, double fineAmount, int purCd, double totalAmount) {
        Intrinsics.checkNotNullParameter(feeHeadDescr, "feeHeadDescr");
        return new FeesModleItem(feeAmount, feeHeadDescr, servicecharge, fineAmount, purCd, totalAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeesModleItem)) {
            return false;
        }
        FeesModleItem feesModleItem = (FeesModleItem) other;
        return this.feeAmount == feesModleItem.feeAmount && Intrinsics.areEqual(this.feeHeadDescr, feesModleItem.feeHeadDescr) && Intrinsics.areEqual(this.servicecharge, feesModleItem.servicecharge) && Double.compare(this.fineAmount, feesModleItem.fineAmount) == 0 && this.purCd == feesModleItem.purCd && Double.compare(this.totalAmount, feesModleItem.totalAmount) == 0;
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

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getServicecharge() {
        return this.servicecharge;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.feeAmount) * 31) + this.feeHeadDescr.hashCode()) * 31;
        String str = this.servicecharge;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.fineAmount)) * 31) + Integer.hashCode(this.purCd)) * 31) + Double.hashCode(this.totalAmount);
    }

    public String toString() {
        return "FeesModleItem(feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", servicecharge=" + this.servicecharge + ", fineAmount=" + this.fineAmount + ", purCd=" + this.purCd + ", totalAmount=" + this.totalAmount + ')';
    }

    public /* synthetic */ FeesModleItem(int i, String str, String str2, double d, int i2, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i3 & 4) != 0 ? "0.0" : str2, d, i2, d2);
    }
}
