package com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J¥\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u00109\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017¨\u0006>"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/Data;", "", "aadharNo", "", "aadharType", "chasiNo", "dOAadhaarResponse", "Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOAadhaarResponse;", "eKYC", "ipaddress", "lastFourMobileNumber", "mobileNo", "otp", "otpGenerated", "", "purCd", "", "regNo", "stateCd", "txNo", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOAadhaarResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadharNo", "()Ljava/lang/String;", "getAadharType", "getChasiNo", "getDOAadhaarResponse", "()Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOAadhaarResponse;", "getEKYC", "getIpaddress", "getLastFourMobileNumber", "getMobileNo", "getOtp", "getOtpGenerated", "()Z", "getPurCd", "()Ljava/util/List;", "getRegNo", "getStateCd", "getTxNo", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final String aadharNo;
    private final String aadharType;
    private final String chasiNo;
    private final DOAadhaarResponse dOAadhaarResponse;
    private final String eKYC;
    private final String ipaddress;
    private final String lastFourMobileNumber;
    private final String mobileNo;
    private final String otp;
    private final boolean otpGenerated;
    private final List<String> purCd;
    private final String regNo;
    private final String stateCd;
    private final String txNo;
    private final String userId;

    public Data(String aadharNo, String aadharType, String chasiNo, DOAadhaarResponse dOAadhaarResponse, String eKYC, String ipaddress, String lastFourMobileNumber, String mobileNo, String otp, boolean z, List<String> purCd, String regNo, String stateCd, String txNo, String userId) {
        Intrinsics.checkNotNullParameter(aadharNo, "aadharNo");
        Intrinsics.checkNotNullParameter(aadharType, "aadharType");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Intrinsics.checkNotNullParameter(dOAadhaarResponse, "dOAadhaarResponse");
        Intrinsics.checkNotNullParameter(eKYC, "eKYC");
        Intrinsics.checkNotNullParameter(ipaddress, "ipaddress");
        Intrinsics.checkNotNullParameter(lastFourMobileNumber, "lastFourMobileNumber");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(txNo, "txNo");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.aadharNo = aadharNo;
        this.aadharType = aadharType;
        this.chasiNo = chasiNo;
        this.dOAadhaarResponse = dOAadhaarResponse;
        this.eKYC = eKYC;
        this.ipaddress = ipaddress;
        this.lastFourMobileNumber = lastFourMobileNumber;
        this.mobileNo = mobileNo;
        this.otp = otp;
        this.otpGenerated = z;
        this.purCd = purCd;
        this.regNo = regNo;
        this.stateCd = stateCd;
        this.txNo = txNo;
        this.userId = userId;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadharNo() {
        return this.aadharNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getOtpGenerated() {
        return this.otpGenerated;
    }

    public final List<String> component11() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRegNo() {
        return this.regNo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTxNo() {
        return this.txNo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAadharType() {
        return this.aadharType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChasiNo() {
        return this.chasiNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DOAadhaarResponse getDOAadhaarResponse() {
        return this.dOAadhaarResponse;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEKYC() {
        return this.eKYC;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIpaddress() {
        return this.ipaddress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLastFourMobileNumber() {
        return this.lastFourMobileNumber;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMobileNo() {
        return this.mobileNo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    public final Data copy(String aadharNo, String aadharType, String chasiNo, DOAadhaarResponse dOAadhaarResponse, String eKYC, String ipaddress, String lastFourMobileNumber, String mobileNo, String otp, boolean otpGenerated, List<String> purCd, String regNo, String stateCd, String txNo, String userId) {
        Intrinsics.checkNotNullParameter(aadharNo, "aadharNo");
        Intrinsics.checkNotNullParameter(aadharType, "aadharType");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Intrinsics.checkNotNullParameter(dOAadhaarResponse, "dOAadhaarResponse");
        Intrinsics.checkNotNullParameter(eKYC, "eKYC");
        Intrinsics.checkNotNullParameter(ipaddress, "ipaddress");
        Intrinsics.checkNotNullParameter(lastFourMobileNumber, "lastFourMobileNumber");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(txNo, "txNo");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new Data(aadharNo, aadharType, chasiNo, dOAadhaarResponse, eKYC, ipaddress, lastFourMobileNumber, mobileNo, otp, otpGenerated, purCd, regNo, stateCd, txNo, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.aadharNo, data.aadharNo) && Intrinsics.areEqual(this.aadharType, data.aadharType) && Intrinsics.areEqual(this.chasiNo, data.chasiNo) && Intrinsics.areEqual(this.dOAadhaarResponse, data.dOAadhaarResponse) && Intrinsics.areEqual(this.eKYC, data.eKYC) && Intrinsics.areEqual(this.ipaddress, data.ipaddress) && Intrinsics.areEqual(this.lastFourMobileNumber, data.lastFourMobileNumber) && Intrinsics.areEqual(this.mobileNo, data.mobileNo) && Intrinsics.areEqual(this.otp, data.otp) && this.otpGenerated == data.otpGenerated && Intrinsics.areEqual(this.purCd, data.purCd) && Intrinsics.areEqual(this.regNo, data.regNo) && Intrinsics.areEqual(this.stateCd, data.stateCd) && Intrinsics.areEqual(this.txNo, data.txNo) && Intrinsics.areEqual(this.userId, data.userId);
    }

    public final String getAadharNo() {
        return this.aadharNo;
    }

    public final String getAadharType() {
        return this.aadharType;
    }

    public final String getChasiNo() {
        return this.chasiNo;
    }

    public final DOAadhaarResponse getDOAadhaarResponse() {
        return this.dOAadhaarResponse;
    }

    public final String getEKYC() {
        return this.eKYC;
    }

    public final String getIpaddress() {
        return this.ipaddress;
    }

    public final String getLastFourMobileNumber() {
        return this.lastFourMobileNumber;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final boolean getOtpGenerated() {
        return this.otpGenerated;
    }

    public final List<String> getPurCd() {
        return this.purCd;
    }

    public final String getRegNo() {
        return this.regNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getTxNo() {
        return this.txNo;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.aadharNo.hashCode() * 31) + this.aadharType.hashCode()) * 31) + this.chasiNo.hashCode()) * 31) + this.dOAadhaarResponse.hashCode()) * 31) + this.eKYC.hashCode()) * 31) + this.ipaddress.hashCode()) * 31) + this.lastFourMobileNumber.hashCode()) * 31) + this.mobileNo.hashCode()) * 31) + this.otp.hashCode()) * 31;
        boolean z = this.otpGenerated;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((iHashCode + r1) * 31) + this.purCd.hashCode()) * 31) + this.regNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.txNo.hashCode()) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "Data(aadharNo=" + this.aadharNo + ", aadharType=" + this.aadharType + ", chasiNo=" + this.chasiNo + ", dOAadhaarResponse=" + this.dOAadhaarResponse + ", eKYC=" + this.eKYC + ", ipaddress=" + this.ipaddress + ", lastFourMobileNumber=" + this.lastFourMobileNumber + ", mobileNo=" + this.mobileNo + ", otp=" + this.otp + ", otpGenerated=" + this.otpGenerated + ", purCd=" + this.purCd + ", regNo=" + this.regNo + ", stateCd=" + this.stateCd + ", txNo=" + this.txNo + ", userId=" + this.userId + ')';
    }
}
