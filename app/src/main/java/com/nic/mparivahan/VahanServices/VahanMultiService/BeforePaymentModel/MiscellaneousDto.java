package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MiscellaneousDto;", "Ljava/io/Serializable;", "feeCharge", "", "officeCode", "purposeCode", "regnNo", "", "stateCode", "(IIILjava/lang/String;Ljava/lang/String;)V", "getFeeCharge", "()I", "getOfficeCode", "getPurposeCode", "getRegnNo", "()Ljava/lang/String;", "getStateCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MiscellaneousDto implements Serializable {
    private final int feeCharge;
    private final int officeCode;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public MiscellaneousDto(int i, int i2, int i3, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.feeCharge = i;
        this.officeCode = i2;
        this.purposeCode = i3;
        this.regnNo = regnNo;
        this.stateCode = stateCode;
    }

    public static /* synthetic */ MiscellaneousDto copy$default(MiscellaneousDto miscellaneousDto, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = miscellaneousDto.feeCharge;
        }
        if ((i4 & 2) != 0) {
            i2 = miscellaneousDto.officeCode;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = miscellaneousDto.purposeCode;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = miscellaneousDto.regnNo;
        }
        String str3 = str;
        if ((i4 & 16) != 0) {
            str2 = miscellaneousDto.stateCode;
        }
        return miscellaneousDto.copy(i, i5, i6, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFeeCharge() {
        return this.feeCharge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final MiscellaneousDto copy(int feeCharge, int officeCode, int purposeCode, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new MiscellaneousDto(feeCharge, officeCode, purposeCode, regnNo, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiscellaneousDto)) {
            return false;
        }
        MiscellaneousDto miscellaneousDto = (MiscellaneousDto) other;
        return this.feeCharge == miscellaneousDto.feeCharge && this.officeCode == miscellaneousDto.officeCode && this.purposeCode == miscellaneousDto.purposeCode && Intrinsics.areEqual(this.regnNo, miscellaneousDto.regnNo) && Intrinsics.areEqual(this.stateCode, miscellaneousDto.stateCode);
    }

    public final int getFeeCharge() {
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
        return (((((((Integer.hashCode(this.feeCharge) * 31) + Integer.hashCode(this.officeCode)) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "MiscellaneousDto(feeCharge=" + this.feeCharge + ", officeCode=" + this.officeCode + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
