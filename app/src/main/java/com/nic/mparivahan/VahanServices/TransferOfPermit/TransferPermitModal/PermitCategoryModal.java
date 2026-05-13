package com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitCategoryModal;", "", "stateCd", "", "permitCatgCode", "", "permitCatgDescr", "permitType", "pmtOfferFlag", "", "(Ljava/lang/String;ILjava/lang/String;IZ)V", "getPermitCatgCode", "()I", "getPermitCatgDescr", "()Ljava/lang/String;", "getPermitType", "getPmtOfferFlag", "()Z", "getStateCd", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermitCategoryModal {
    private final int permitCatgCode;
    private final String permitCatgDescr;
    private final int permitType;
    private final boolean pmtOfferFlag;
    private final String stateCd;

    public PermitCategoryModal() {
        this(null, 0, null, 0, false, 31, null);
    }

    public static /* synthetic */ PermitCategoryModal copy$default(PermitCategoryModal permitCategoryModal, String str, int i, String str2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = permitCategoryModal.stateCd;
        }
        if ((i3 & 2) != 0) {
            i = permitCategoryModal.permitCatgCode;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = permitCategoryModal.permitCatgDescr;
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            i2 = permitCategoryModal.permitType;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z = permitCategoryModal.pmtOfferFlag;
        }
        return permitCategoryModal.copy(str, i4, str3, i5, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPermitCatgCode() {
        return this.permitCatgCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPermitCatgDescr() {
        return this.permitCatgDescr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPermitType() {
        return this.permitType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPmtOfferFlag() {
        return this.pmtOfferFlag;
    }

    public final PermitCategoryModal copy(String stateCd, int permitCatgCode, String permitCatgDescr, int permitType, boolean pmtOfferFlag) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(permitCatgDescr, "permitCatgDescr");
        return new PermitCategoryModal(stateCd, permitCatgCode, permitCatgDescr, permitType, pmtOfferFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermitCategoryModal)) {
            return false;
        }
        PermitCategoryModal permitCategoryModal = (PermitCategoryModal) other;
        return Intrinsics.areEqual(this.stateCd, permitCategoryModal.stateCd) && this.permitCatgCode == permitCategoryModal.permitCatgCode && Intrinsics.areEqual(this.permitCatgDescr, permitCategoryModal.permitCatgDescr) && this.permitType == permitCategoryModal.permitType && this.pmtOfferFlag == permitCategoryModal.pmtOfferFlag;
    }

    public final int getPermitCatgCode() {
        return this.permitCatgCode;
    }

    public final String getPermitCatgDescr() {
        return this.permitCatgDescr;
    }

    public final int getPermitType() {
        return this.permitType;
    }

    public final boolean getPmtOfferFlag() {
        return this.pmtOfferFlag;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.stateCd.hashCode() * 31) + Integer.hashCode(this.permitCatgCode)) * 31) + this.permitCatgDescr.hashCode()) * 31) + Integer.hashCode(this.permitType)) * 31;
        boolean z = this.pmtOfferFlag;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        return "PermitCategoryModal(stateCd=" + this.stateCd + ", permitCatgCode=" + this.permitCatgCode + ", permitCatgDescr=" + this.permitCatgDescr + ", permitType=" + this.permitType + ", pmtOfferFlag=" + this.pmtOfferFlag + ')';
    }

    public PermitCategoryModal(String stateCd, int i, String permitCatgDescr, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(permitCatgDescr, "permitCatgDescr");
        this.stateCd = stateCd;
        this.permitCatgCode = i;
        this.permitCatgDescr = permitCatgDescr;
        this.permitType = i2;
        this.pmtOfferFlag = z;
    }

    public /* synthetic */ PermitCategoryModal(String str, int i, String str2, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z);
    }
}
