package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;", "Ljava/io/Serializable;", "applNo", "", "authMode", "mobileNo", "officeCode", "", "openDate", "purposeCode", "regnNo", "stateCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getAuthMode", "getMobileNo", "getOfficeCode", "()I", "getOpenDate", "getPurposeCode", "getRegnNo", "getStateCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String applNo;
    private final String authMode;
    private final String mobileNo;
    private final int officeCode;
    private final String openDate;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public Data(String str, String str2, String str3, int i, String str4, int i2, String str5, String str6) {
        this.applNo = str;
        this.authMode = str2;
        this.mobileNo = str3;
        this.officeCode = i;
        this.openDate = str4;
        this.purposeCode = i2;
        this.regnNo = str5;
        this.stateCode = str6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthMode() {
        return this.authMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMobileNo() {
        return this.mobileNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPurposeCode() {
        return this.purposeCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final Data copy(String applNo, String authMode, String mobileNo, int officeCode, String openDate, int purposeCode, String regnNo, String stateCode) {
        return new Data(applNo, authMode, mobileNo, officeCode, openDate, purposeCode, regnNo, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.authMode, data.authMode) && Intrinsics.areEqual(this.mobileNo, data.mobileNo) && this.officeCode == data.officeCode && Intrinsics.areEqual(this.openDate, data.openDate) && this.purposeCode == data.purposeCode && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.stateCode, data.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
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
        String str2 = this.authMode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mobileNo;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str4 = this.openDate;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.purposeCode)) * 31;
        String str5 = this.regnNo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stateCode;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", authMode=" + this.authMode + ", mobileNo=" + this.mobileNo + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
