package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/FeeDobj;", "", "feeAmount", "", "feeHeadDescr", "fineAmount", "purCd", "", "totalAmount", "servicecharge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getFeeAmount", "()Ljava/lang/String;", "getFeeHeadDescr", "getFineAmount", "getPurCd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServicecharge", "getTotalAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/FeeDobj;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FeeDobj {
    private final String feeAmount;
    private final String feeHeadDescr;
    private final String fineAmount;
    private final Integer purCd;
    private final String servicecharge;
    private final String totalAmount;

    public FeeDobj(String str, String str2, String str3, Integer num, String str4, String str5) {
        this.feeAmount = str;
        this.feeHeadDescr = str2;
        this.fineAmount = str3;
        this.purCd = num;
        this.totalAmount = str4;
        this.servicecharge = str5;
    }

    public static /* synthetic */ FeeDobj copy$default(FeeDobj feeDobj, String str, String str2, String str3, Integer num, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeDobj.feeAmount;
        }
        if ((i & 2) != 0) {
            str2 = feeDobj.feeHeadDescr;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = feeDobj.fineAmount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            num = feeDobj.purCd;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = feeDobj.totalAmount;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = feeDobj.servicecharge;
        }
        return feeDobj.copy(str, str6, str7, num2, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFineAmount() {
        return this.fineAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getServicecharge() {
        return this.servicecharge;
    }

    public final FeeDobj copy(String feeAmount, String feeHeadDescr, String fineAmount, Integer purCd, String totalAmount, String servicecharge) {
        return new FeeDobj(feeAmount, feeHeadDescr, fineAmount, purCd, totalAmount, servicecharge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeDobj)) {
            return false;
        }
        FeeDobj feeDobj = (FeeDobj) other;
        return Intrinsics.areEqual(this.feeAmount, feeDobj.feeAmount) && Intrinsics.areEqual(this.feeHeadDescr, feeDobj.feeHeadDescr) && Intrinsics.areEqual(this.fineAmount, feeDobj.fineAmount) && Intrinsics.areEqual(this.purCd, feeDobj.purCd) && Intrinsics.areEqual(this.totalAmount, feeDobj.totalAmount) && Intrinsics.areEqual(this.servicecharge, feeDobj.servicecharge);
    }

    public final String getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    public final String getFineAmount() {
        return this.fineAmount;
    }

    public final Integer getPurCd() {
        return this.purCd;
    }

    public final String getServicecharge() {
        return this.servicecharge;
    }

    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        String str = this.feeAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feeHeadDescr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fineAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.purCd;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.totalAmount;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.servicecharge;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "FeeDobj(feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", fineAmount=" + this.fineAmount + ", purCd=" + this.purCd + ", totalAmount=" + this.totalAmount + ", servicecharge=" + this.servicecharge + ')';
    }
}
