package com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPModel/MFPRequestModel;", "", "applNo", "", "feeCharge", "", "officeCode", "", "purposeCode", "regnNo", "stateCode", "(Ljava/lang/String;DIILjava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getFeeCharge", "()D", "getOfficeCode", "()I", "getPurposeCode", "getRegnNo", "getStateCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MFPRequestModel {
    private final String applNo;
    private final double feeCharge;
    private final int officeCode;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public MFPRequestModel(String str, double d, int i, int i2, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.applNo = str;
        this.feeCharge = d;
        this.officeCode = i;
        this.purposeCode = i2;
        this.regnNo = regnNo;
        this.stateCode = stateCode;
    }

    public static /* synthetic */ MFPRequestModel copy$default(MFPRequestModel mFPRequestModel, String str, double d, int i, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mFPRequestModel.applNo;
        }
        if ((i3 & 2) != 0) {
            d = mFPRequestModel.feeCharge;
        }
        double d2 = d;
        if ((i3 & 4) != 0) {
            i = mFPRequestModel.officeCode;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = mFPRequestModel.purposeCode;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str2 = mFPRequestModel.regnNo;
        }
        String str4 = str2;
        if ((i3 & 32) != 0) {
            str3 = mFPRequestModel.stateCode;
        }
        return mFPRequestModel.copy(str, d2, i4, i5, str4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getFeeCharge() {
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

    public final MFPRequestModel copy(String applNo, double feeCharge, int officeCode, int purposeCode, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new MFPRequestModel(applNo, feeCharge, officeCode, purposeCode, regnNo, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MFPRequestModel)) {
            return false;
        }
        MFPRequestModel mFPRequestModel = (MFPRequestModel) other;
        return Intrinsics.areEqual(this.applNo, mFPRequestModel.applNo) && Double.compare(this.feeCharge, mFPRequestModel.feeCharge) == 0 && this.officeCode == mFPRequestModel.officeCode && this.purposeCode == mFPRequestModel.purposeCode && Intrinsics.areEqual(this.regnNo, mFPRequestModel.regnNo) && Intrinsics.areEqual(this.stateCode, mFPRequestModel.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final double getFeeCharge() {
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
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.feeCharge)) * 31) + Integer.hashCode(this.officeCode)) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "MFPRequestModel(applNo=" + this.applNo + ", feeCharge=" + this.feeCharge + ", officeCode=" + this.officeCode + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
