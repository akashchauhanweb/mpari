package com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JN\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006#"}, d2 = {"Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/CompoundRequest;", "", "applNo", "", "feeCharge", "", "officeCode", "", "purposeCode", "regnNo", "stateCode", "(Ljava/lang/String;Ljava/lang/Double;IILjava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getFeeCharge", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOfficeCode", "()I", "getPurposeCode", "getRegnNo", "getStateCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Double;IILjava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/CompoundRequest;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CompoundRequest {
    private final String applNo;
    private final Double feeCharge;
    private final int officeCode;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public CompoundRequest(String str, Double d, int i, int i2, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.applNo = str;
        this.feeCharge = d;
        this.officeCode = i;
        this.purposeCode = i2;
        this.regnNo = regnNo;
        this.stateCode = stateCode;
    }

    public static /* synthetic */ CompoundRequest copy$default(CompoundRequest compoundRequest, String str, Double d, int i, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = compoundRequest.applNo;
        }
        if ((i3 & 2) != 0) {
            d = compoundRequest.feeCharge;
        }
        Double d2 = d;
        if ((i3 & 4) != 0) {
            i = compoundRequest.officeCode;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = compoundRequest.purposeCode;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str2 = compoundRequest.regnNo;
        }
        String str4 = str2;
        if ((i3 & 32) != 0) {
            str3 = compoundRequest.stateCode;
        }
        return compoundRequest.copy(str, d2, i4, i5, str4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getFeeCharge() {
        return this.feeCharge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final CompoundRequest copy(String applNo, Double feeCharge, int officeCode, int purposeCode, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new CompoundRequest(applNo, feeCharge, officeCode, purposeCode, regnNo, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompoundRequest)) {
            return false;
        }
        CompoundRequest compoundRequest = (CompoundRequest) other;
        return Intrinsics.areEqual(this.applNo, compoundRequest.applNo) && Intrinsics.areEqual((Object) this.feeCharge, (Object) compoundRequest.feeCharge) && this.officeCode == compoundRequest.officeCode && this.purposeCode == compoundRequest.purposeCode && Intrinsics.areEqual(this.regnNo, compoundRequest.regnNo) && Intrinsics.areEqual(this.stateCode, compoundRequest.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final Double getFeeCharge() {
        return this.feeCharge;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.feeCharge;
        return ((((((((iHashCode + (d != null ? d.hashCode() : 0)) * 31) + Integer.hashCode(this.officeCode)) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "CompoundRequest(applNo=" + this.applNo + ", feeCharge=" + this.feeCharge + ", officeCode=" + this.officeCode + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
