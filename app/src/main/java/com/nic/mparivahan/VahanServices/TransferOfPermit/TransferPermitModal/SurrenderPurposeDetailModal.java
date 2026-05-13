package com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/SurrenderPurposeDetailModal;", "", "purCd", "", "descr", "", "feeType", "inwardAppl", "amtFromWsdl", "", "balanceFee", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAmtFromWsdl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBalanceFee", "getDescr", "()Ljava/lang/String;", "getFeeType", "getInwardAppl", "getPurCd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/SurrenderPurposeDetailModal;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SurrenderPurposeDetailModal {
    private final Boolean amtFromWsdl;
    private final Boolean balanceFee;
    private final String descr;
    private final String feeType;
    private final String inwardAppl;
    private final Integer purCd;

    public SurrenderPurposeDetailModal() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SurrenderPurposeDetailModal copy$default(SurrenderPurposeDetailModal surrenderPurposeDetailModal, Integer num, String str, String str2, String str3, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = surrenderPurposeDetailModal.purCd;
        }
        if ((i & 2) != 0) {
            str = surrenderPurposeDetailModal.descr;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = surrenderPurposeDetailModal.feeType;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = surrenderPurposeDetailModal.inwardAppl;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            bool = surrenderPurposeDetailModal.amtFromWsdl;
        }
        Boolean bool3 = bool;
        if ((i & 32) != 0) {
            bool2 = surrenderPurposeDetailModal.balanceFee;
        }
        return surrenderPurposeDetailModal.copy(num, str4, str5, str6, bool3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescr() {
        return this.descr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeeType() {
        return this.feeType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInwardAppl() {
        return this.inwardAppl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getAmtFromWsdl() {
        return this.amtFromWsdl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getBalanceFee() {
        return this.balanceFee;
    }

    public final SurrenderPurposeDetailModal copy(Integer purCd, String descr, String feeType, String inwardAppl, Boolean amtFromWsdl, Boolean balanceFee) {
        return new SurrenderPurposeDetailModal(purCd, descr, feeType, inwardAppl, amtFromWsdl, balanceFee);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurrenderPurposeDetailModal)) {
            return false;
        }
        SurrenderPurposeDetailModal surrenderPurposeDetailModal = (SurrenderPurposeDetailModal) other;
        return Intrinsics.areEqual(this.purCd, surrenderPurposeDetailModal.purCd) && Intrinsics.areEqual(this.descr, surrenderPurposeDetailModal.descr) && Intrinsics.areEqual(this.feeType, surrenderPurposeDetailModal.feeType) && Intrinsics.areEqual(this.inwardAppl, surrenderPurposeDetailModal.inwardAppl) && Intrinsics.areEqual(this.amtFromWsdl, surrenderPurposeDetailModal.amtFromWsdl) && Intrinsics.areEqual(this.balanceFee, surrenderPurposeDetailModal.balanceFee);
    }

    public final Boolean getAmtFromWsdl() {
        return this.amtFromWsdl;
    }

    public final Boolean getBalanceFee() {
        return this.balanceFee;
    }

    public final String getDescr() {
        return this.descr;
    }

    public final String getFeeType() {
        return this.feeType;
    }

    public final String getInwardAppl() {
        return this.inwardAppl;
    }

    public final Integer getPurCd() {
        return this.purCd;
    }

    public int hashCode() {
        Integer num = this.purCd;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.descr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.feeType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inwardAppl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.amtFromWsdl;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.balanceFee;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "SurrenderPurposeDetailModal(purCd=" + this.purCd + ", descr=" + this.descr + ", feeType=" + this.feeType + ", inwardAppl=" + this.inwardAppl + ", amtFromWsdl=" + this.amtFromWsdl + ", balanceFee=" + this.balanceFee + ')';
    }

    public SurrenderPurposeDetailModal(Integer num, String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.purCd = num;
        this.descr = str;
        this.feeType = str2;
        this.inwardAppl = str3;
        this.amtFromWsdl = bool;
        this.balanceFee = bool2;
    }

    public /* synthetic */ SurrenderPurposeDetailModal(Integer num, String str, String str2, String str3, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? Boolean.FALSE : bool2);
    }
}
