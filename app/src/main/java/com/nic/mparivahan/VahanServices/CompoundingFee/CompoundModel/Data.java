package com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComModle.Fees;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fHÆ\u0003Jo\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006%"}, d2 = {"Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;", "", "applNo", "", "officeCode", "purposeCode", "regnNo", "stateCode", "feeCharge", "feesList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/ComModle/Fees;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getApplNo", "()Ljava/lang/String;", "getFeeCharge", "getFeesList", "()Ljava/util/ArrayList;", "getOfficeCode", "getPurposeCode", "getRegnNo", "getStateCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data {
    private final String applNo;
    private final String feeCharge;
    private final ArrayList<Fees> feesList;
    private final String officeCode;
    private final String purposeCode;
    private final String regnNo;
    private final String stateCode;

    public Data(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<Fees> arrayList) {
        this.applNo = str;
        this.officeCode = str2;
        this.purposeCode = str3;
        this.regnNo = str4;
        this.stateCode = str5;
        this.feeCharge = str6;
        this.feesList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = data.applNo;
        }
        if ((i & 2) != 0) {
            str2 = data.officeCode;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = data.purposeCode;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = data.regnNo;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = data.stateCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = data.feeCharge;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            arrayList = data.feesList;
        }
        return data.copy(str, str7, str8, str9, str10, str11, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPurposeCode() {
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

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFeeCharge() {
        return this.feeCharge;
    }

    public final ArrayList<Fees> component7() {
        return this.feesList;
    }

    public final Data copy(String applNo, String officeCode, String purposeCode, String regnNo, String stateCode, String feeCharge, ArrayList<Fees> feesList) {
        return new Data(applNo, officeCode, purposeCode, regnNo, stateCode, feeCharge, feesList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.officeCode, data.officeCode) && Intrinsics.areEqual(this.purposeCode, data.purposeCode) && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.stateCode, data.stateCode) && Intrinsics.areEqual(this.feeCharge, data.feeCharge) && Intrinsics.areEqual(this.feesList, data.feesList);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getFeeCharge() {
        return this.feeCharge;
    }

    public final ArrayList<Fees> getFeesList() {
        return this.feesList;
    }

    public final String getOfficeCode() {
        return this.officeCode;
    }

    public final String getPurposeCode() {
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
        String str2 = this.officeCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purposeCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.regnNo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.feeCharge;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ArrayList<Fees> arrayList = this.feesList;
        return iHashCode6 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", officeCode=" + this.officeCode + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", feeCharge=" + this.feeCharge + ", feesList=" + this.feesList + ')';
    }
}
