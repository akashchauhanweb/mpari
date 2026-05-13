package com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitHomeAuthModal;", "", "regnNo", "", "previousPermitNo", "perviousAuthNo", "previousAuthFrom", "previousAuthUpto", "purposeCode", "", "previousIssueDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getPerviousAuthNo", "()Ljava/lang/String;", "getPreviousAuthFrom", "getPreviousAuthUpto", "getPreviousIssueDate", "getPreviousPermitNo", "getPurposeCode", "()I", "getRegnNo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermitHomeAuthModal {
    private final String perviousAuthNo;
    private final String previousAuthFrom;
    private final String previousAuthUpto;
    private final String previousIssueDate;
    private final String previousPermitNo;
    private final int purposeCode;
    private final String regnNo;

    public PermitHomeAuthModal() {
        this(null, null, null, null, null, 0, null, 127, null);
    }

    public static /* synthetic */ PermitHomeAuthModal copy$default(PermitHomeAuthModal permitHomeAuthModal, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = permitHomeAuthModal.regnNo;
        }
        if ((i2 & 2) != 0) {
            str2 = permitHomeAuthModal.previousPermitNo;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = permitHomeAuthModal.perviousAuthNo;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = permitHomeAuthModal.previousAuthFrom;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = permitHomeAuthModal.previousAuthUpto;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            i = permitHomeAuthModal.purposeCode;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            str6 = permitHomeAuthModal.previousIssueDate;
        }
        return permitHomeAuthModal.copy(str, str7, str8, str9, str10, i3, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreviousPermitNo() {
        return this.previousPermitNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPerviousAuthNo() {
        return this.perviousAuthNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPreviousAuthFrom() {
        return this.previousAuthFrom;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPreviousAuthUpto() {
        return this.previousAuthUpto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPreviousIssueDate() {
        return this.previousIssueDate;
    }

    public final PermitHomeAuthModal copy(String regnNo, String previousPermitNo, String perviousAuthNo, String previousAuthFrom, String previousAuthUpto, int purposeCode, String previousIssueDate) {
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(previousPermitNo, "previousPermitNo");
        Intrinsics.checkNotNullParameter(perviousAuthNo, "perviousAuthNo");
        Intrinsics.checkNotNullParameter(previousAuthFrom, "previousAuthFrom");
        Intrinsics.checkNotNullParameter(previousAuthUpto, "previousAuthUpto");
        Intrinsics.checkNotNullParameter(previousIssueDate, "previousIssueDate");
        return new PermitHomeAuthModal(regnNo, previousPermitNo, perviousAuthNo, previousAuthFrom, previousAuthUpto, purposeCode, previousIssueDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermitHomeAuthModal)) {
            return false;
        }
        PermitHomeAuthModal permitHomeAuthModal = (PermitHomeAuthModal) other;
        return Intrinsics.areEqual(this.regnNo, permitHomeAuthModal.regnNo) && Intrinsics.areEqual(this.previousPermitNo, permitHomeAuthModal.previousPermitNo) && Intrinsics.areEqual(this.perviousAuthNo, permitHomeAuthModal.perviousAuthNo) && Intrinsics.areEqual(this.previousAuthFrom, permitHomeAuthModal.previousAuthFrom) && Intrinsics.areEqual(this.previousAuthUpto, permitHomeAuthModal.previousAuthUpto) && this.purposeCode == permitHomeAuthModal.purposeCode && Intrinsics.areEqual(this.previousIssueDate, permitHomeAuthModal.previousIssueDate);
    }

    public final String getPerviousAuthNo() {
        return this.perviousAuthNo;
    }

    public final String getPreviousAuthFrom() {
        return this.previousAuthFrom;
    }

    public final String getPreviousAuthUpto() {
        return this.previousAuthUpto;
    }

    public final String getPreviousIssueDate() {
        return this.previousIssueDate;
    }

    public final String getPreviousPermitNo() {
        return this.previousPermitNo;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public int hashCode() {
        return (((((((((((this.regnNo.hashCode() * 31) + this.previousPermitNo.hashCode()) * 31) + this.perviousAuthNo.hashCode()) * 31) + this.previousAuthFrom.hashCode()) * 31) + this.previousAuthUpto.hashCode()) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.previousIssueDate.hashCode();
    }

    public String toString() {
        return "PermitHomeAuthModal(regnNo=" + this.regnNo + ", previousPermitNo=" + this.previousPermitNo + ", perviousAuthNo=" + this.perviousAuthNo + ", previousAuthFrom=" + this.previousAuthFrom + ", previousAuthUpto=" + this.previousAuthUpto + ", purposeCode=" + this.purposeCode + ", previousIssueDate=" + this.previousIssueDate + ')';
    }

    public PermitHomeAuthModal(String regnNo, String previousPermitNo, String perviousAuthNo, String previousAuthFrom, String previousAuthUpto, int i, String previousIssueDate) {
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(previousPermitNo, "previousPermitNo");
        Intrinsics.checkNotNullParameter(perviousAuthNo, "perviousAuthNo");
        Intrinsics.checkNotNullParameter(previousAuthFrom, "previousAuthFrom");
        Intrinsics.checkNotNullParameter(previousAuthUpto, "previousAuthUpto");
        Intrinsics.checkNotNullParameter(previousIssueDate, "previousIssueDate");
        this.regnNo = regnNo;
        this.previousPermitNo = previousPermitNo;
        this.perviousAuthNo = perviousAuthNo;
        this.previousAuthFrom = previousAuthFrom;
        this.previousAuthUpto = previousAuthUpto;
        this.purposeCode = i;
        this.previousIssueDate = previousIssueDate;
    }

    public /* synthetic */ PermitHomeAuthModal(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? "" : str6);
    }
}
