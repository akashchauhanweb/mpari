package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/MultiSelectRequest;", "", "applNo", "", "officeCode", "", "openDate", "purposeCode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "regnNo", "stateCode", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getOfficeCode", "()I", "getOpenDate", "getPurposeCode", "()Ljava/util/ArrayList;", "getRegnNo", "getStateCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MultiSelectRequest {
    private final String applNo;
    private final int officeCode;
    private final String openDate;
    private final ArrayList<String> purposeCode;
    private final String regnNo;
    private final String stateCode;

    public MultiSelectRequest(String applNo, int i, String openDate, ArrayList<String> purposeCode, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.applNo = applNo;
        this.officeCode = i;
        this.openDate = openDate;
        this.purposeCode = purposeCode;
        this.regnNo = regnNo;
        this.stateCode = stateCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiSelectRequest copy$default(MultiSelectRequest multiSelectRequest, String str, int i, String str2, ArrayList arrayList, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = multiSelectRequest.applNo;
        }
        if ((i2 & 2) != 0) {
            i = multiSelectRequest.officeCode;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = multiSelectRequest.openDate;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            arrayList = multiSelectRequest.purposeCode;
        }
        ArrayList arrayList2 = arrayList;
        if ((i2 & 16) != 0) {
            str3 = multiSelectRequest.regnNo;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = multiSelectRequest.stateCode;
        }
        return multiSelectRequest.copy(str, i3, str5, arrayList2, str6, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<String> component4() {
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

    public final MultiSelectRequest copy(String applNo, int officeCode, String openDate, ArrayList<String> purposeCode, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        return new MultiSelectRequest(applNo, officeCode, openDate, purposeCode, regnNo, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiSelectRequest)) {
            return false;
        }
        MultiSelectRequest multiSelectRequest = (MultiSelectRequest) other;
        return Intrinsics.areEqual(this.applNo, multiSelectRequest.applNo) && this.officeCode == multiSelectRequest.officeCode && Intrinsics.areEqual(this.openDate, multiSelectRequest.openDate) && Intrinsics.areEqual(this.purposeCode, multiSelectRequest.purposeCode) && Intrinsics.areEqual(this.regnNo, multiSelectRequest.regnNo) && Intrinsics.areEqual(this.stateCode, multiSelectRequest.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<String> getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return (((((((((this.applNo.hashCode() * 31) + Integer.hashCode(this.officeCode)) * 31) + this.openDate.hashCode()) * 31) + this.purposeCode.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "MultiSelectRequest(applNo=" + this.applNo + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
