package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003JË\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017¨\u0006@"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/GenerateUserVerify;", "Ljava/io/Serializable;", "aadharNo", "", "aadharType", "chasiNo", "did", "eKYC", "ipaddress", "mid", "mobileNo", "otp", "otpGenerated", "", "purCd", "", "regNo", "stateCd", "tid", "txNo", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadharNo", "()Ljava/lang/String;", "getAadharType", "getChasiNo", "getDid", "getEKYC", "getIpaddress", "getMid", "getMobileNo", "getOtp", "getOtpGenerated", "()Z", "getPurCd", "()Ljava/util/List;", "getRegNo", "getStateCd", "getTid", "getTxNo", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GenerateUserVerify implements Serializable {
    private final String aadharNo;
    private final String aadharType;
    private final String chasiNo;
    private final String did;
    private final String eKYC;
    private final String ipaddress;
    private final String mid;
    private final String mobileNo;
    private final String otp;
    private final boolean otpGenerated;
    private final List<String> purCd;
    private final String regNo;
    private final String stateCd;
    private final String tid;
    private final String txNo;
    private final String userId;

    public GenerateUserVerify(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, List<String> purCd, String str10, String str11, String str12, String str13, String str14) {
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        this.aadharNo = str;
        this.aadharType = str2;
        this.chasiNo = str3;
        this.did = str4;
        this.eKYC = str5;
        this.ipaddress = str6;
        this.mid = str7;
        this.mobileNo = str8;
        this.otp = str9;
        this.otpGenerated = z;
        this.purCd = purCd;
        this.regNo = str10;
        this.stateCd = str11;
        this.tid = str12;
        this.txNo = str13;
        this.userId = str14;
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
    public final String getTid() {
        return this.tid;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTxNo() {
        return this.txNo;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
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
    public final String getDid() {
        return this.did;
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
    public final String getMid() {
        return this.mid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMobileNo() {
        return this.mobileNo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    public final GenerateUserVerify copy(String aadharNo, String aadharType, String chasiNo, String did, String eKYC, String ipaddress, String mid, String mobileNo, String otp, boolean otpGenerated, List<String> purCd, String regNo, String stateCd, String tid, String txNo, String userId) {
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        return new GenerateUserVerify(aadharNo, aadharType, chasiNo, did, eKYC, ipaddress, mid, mobileNo, otp, otpGenerated, purCd, regNo, stateCd, tid, txNo, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateUserVerify)) {
            return false;
        }
        GenerateUserVerify generateUserVerify = (GenerateUserVerify) other;
        return Intrinsics.areEqual(this.aadharNo, generateUserVerify.aadharNo) && Intrinsics.areEqual(this.aadharType, generateUserVerify.aadharType) && Intrinsics.areEqual(this.chasiNo, generateUserVerify.chasiNo) && Intrinsics.areEqual(this.did, generateUserVerify.did) && Intrinsics.areEqual(this.eKYC, generateUserVerify.eKYC) && Intrinsics.areEqual(this.ipaddress, generateUserVerify.ipaddress) && Intrinsics.areEqual(this.mid, generateUserVerify.mid) && Intrinsics.areEqual(this.mobileNo, generateUserVerify.mobileNo) && Intrinsics.areEqual(this.otp, generateUserVerify.otp) && this.otpGenerated == generateUserVerify.otpGenerated && Intrinsics.areEqual(this.purCd, generateUserVerify.purCd) && Intrinsics.areEqual(this.regNo, generateUserVerify.regNo) && Intrinsics.areEqual(this.stateCd, generateUserVerify.stateCd) && Intrinsics.areEqual(this.tid, generateUserVerify.tid) && Intrinsics.areEqual(this.txNo, generateUserVerify.txNo) && Intrinsics.areEqual(this.userId, generateUserVerify.userId);
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

    public final String getDid() {
        return this.did;
    }

    public final String getEKYC() {
        return this.eKYC;
    }

    public final String getIpaddress() {
        return this.ipaddress;
    }

    public final String getMid() {
        return this.mid;
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

    public final String getTid() {
        return this.tid;
    }

    public final String getTxNo() {
        return this.txNo;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v54 */
    public int hashCode() {
        String str = this.aadharNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aadharType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chasiNo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.did;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eKYC;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ipaddress;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mid;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mobileNo;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.otp;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        boolean z = this.otpGenerated;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode10 = (((iHashCode9 + r2) * 31) + this.purCd.hashCode()) * 31;
        String str10 = this.regNo;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.stateCd;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tid;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.txNo;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.userId;
        return iHashCode14 + (str14 != null ? str14.hashCode() : 0);
    }

    public String toString() {
        return "GenerateUserVerify(aadharNo=" + this.aadharNo + ", aadharType=" + this.aadharType + ", chasiNo=" + this.chasiNo + ", did=" + this.did + ", eKYC=" + this.eKYC + ", ipaddress=" + this.ipaddress + ", mid=" + this.mid + ", mobileNo=" + this.mobileNo + ", otp=" + this.otp + ", otpGenerated=" + this.otpGenerated + ", purCd=" + this.purCd + ", regNo=" + this.regNo + ", stateCd=" + this.stateCd + ", tid=" + this.tid + ", txNo=" + this.txNo + ", userId=" + this.userId + ')';
    }
}
