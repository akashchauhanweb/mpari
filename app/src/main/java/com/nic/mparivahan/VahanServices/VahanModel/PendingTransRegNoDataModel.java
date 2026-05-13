package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/PendingTransRegNoDataModel;", "", "offCD", "", "transactionID", "transactionDesc", "regnNo", "stateCD", "purCD", "transactionAMT", "transactionDate", "chassisNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChassisNo", "()Ljava/lang/String;", "getOffCD", "getPurCD", "getRegnNo", "getStateCD", "getTransactionAMT", "getTransactionDate", "getTransactionDesc", "getTransactionID", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PendingTransRegNoDataModel {
    private final String chassisNo;
    private final String offCD;
    private final String purCD;
    private final String regnNo;
    private final String stateCD;
    private final String transactionAMT;
    private final String transactionDate;
    private final String transactionDesc;
    private final String transactionID;

    public PendingTransRegNoDataModel(String offCD, String transactionID, String transactionDesc, String regnNo, String stateCD, String purCD, String transactionAMT, String transactionDate, String str) {
        Intrinsics.checkNotNullParameter(offCD, "offCD");
        Intrinsics.checkNotNullParameter(transactionID, "transactionID");
        Intrinsics.checkNotNullParameter(transactionDesc, "transactionDesc");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCD, "stateCD");
        Intrinsics.checkNotNullParameter(purCD, "purCD");
        Intrinsics.checkNotNullParameter(transactionAMT, "transactionAMT");
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        this.offCD = offCD;
        this.transactionID = transactionID;
        this.transactionDesc = transactionDesc;
        this.regnNo = regnNo;
        this.stateCD = stateCD;
        this.purCD = purCD;
        this.transactionAMT = transactionAMT;
        this.transactionDate = transactionDate;
        this.chassisNo = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOffCD() {
        return this.offCD;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionID() {
        return this.transactionID;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransactionDesc() {
        return this.transactionDesc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStateCD() {
        return this.stateCD;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPurCD() {
        return this.purCD;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransactionAMT() {
        return this.transactionAMT;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final PendingTransRegNoDataModel copy(String offCD, String transactionID, String transactionDesc, String regnNo, String stateCD, String purCD, String transactionAMT, String transactionDate, String chassisNo) {
        Intrinsics.checkNotNullParameter(offCD, "offCD");
        Intrinsics.checkNotNullParameter(transactionID, "transactionID");
        Intrinsics.checkNotNullParameter(transactionDesc, "transactionDesc");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCD, "stateCD");
        Intrinsics.checkNotNullParameter(purCD, "purCD");
        Intrinsics.checkNotNullParameter(transactionAMT, "transactionAMT");
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        return new PendingTransRegNoDataModel(offCD, transactionID, transactionDesc, regnNo, stateCD, purCD, transactionAMT, transactionDate, chassisNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingTransRegNoDataModel)) {
            return false;
        }
        PendingTransRegNoDataModel pendingTransRegNoDataModel = (PendingTransRegNoDataModel) other;
        return Intrinsics.areEqual(this.offCD, pendingTransRegNoDataModel.offCD) && Intrinsics.areEqual(this.transactionID, pendingTransRegNoDataModel.transactionID) && Intrinsics.areEqual(this.transactionDesc, pendingTransRegNoDataModel.transactionDesc) && Intrinsics.areEqual(this.regnNo, pendingTransRegNoDataModel.regnNo) && Intrinsics.areEqual(this.stateCD, pendingTransRegNoDataModel.stateCD) && Intrinsics.areEqual(this.purCD, pendingTransRegNoDataModel.purCD) && Intrinsics.areEqual(this.transactionAMT, pendingTransRegNoDataModel.transactionAMT) && Intrinsics.areEqual(this.transactionDate, pendingTransRegNoDataModel.transactionDate) && Intrinsics.areEqual(this.chassisNo, pendingTransRegNoDataModel.chassisNo);
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final String getOffCD() {
        return this.offCD;
    }

    public final String getPurCD() {
        return this.purCD;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCD() {
        return this.stateCD;
    }

    public final String getTransactionAMT() {
        return this.transactionAMT;
    }

    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public final String getTransactionDesc() {
        return this.transactionDesc;
    }

    public final String getTransactionID() {
        return this.transactionID;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.offCD.hashCode() * 31) + this.transactionID.hashCode()) * 31) + this.transactionDesc.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCD.hashCode()) * 31) + this.purCD.hashCode()) * 31) + this.transactionAMT.hashCode()) * 31) + this.transactionDate.hashCode()) * 31;
        String str = this.chassisNo;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PendingTransRegNoDataModel(offCD=" + this.offCD + ", transactionID=" + this.transactionID + ", transactionDesc=" + this.transactionDesc + ", regnNo=" + this.regnNo + ", stateCD=" + this.stateCD + ", purCD=" + this.purCD + ", transactionAMT=" + this.transactionAMT + ", transactionDate=" + this.transactionDate + ", chassisNo=" + this.chassisNo + ')';
    }
}
