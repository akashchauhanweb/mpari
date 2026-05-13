package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\tj\b\u0012\u0004\u0012\u00020\u0006`\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00060\tj\b\u0012\u0004\u0012\u00020\u0006`\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003Ju\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\tj\b\u0012\u0004\u0012\u00020\u0006`\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\tj\b\u0012\u0004\u0012\u00020\u0006`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006+"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Model/DoorStepReq;", "", "applNo", "", "authType", "officeCode", "", "opDate", "purCd", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "regnNo", "stateCode", "status", "userCode", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getApplNo", "()Ljava/lang/String;", "getAuthType", "getOfficeCode", "()I", "getOpDate", "getPurCd", "()Ljava/util/ArrayList;", "getRegnNo", "getStateCode", "getStatus", "getUserCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DoorStepReq {
    private final String applNo;
    private final String authType;
    private final int officeCode;
    private final String opDate;
    private final ArrayList<Integer> purCd;
    private final String regnNo;
    private final String stateCode;
    private final String status;
    private final int userCode;

    public DoorStepReq(String str, String authType, int i, String opDate, ArrayList<Integer> purCd, String regnNo, String stateCode, String status, int i2) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(opDate, "opDate");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(status, "status");
        this.applNo = str;
        this.authType = authType;
        this.officeCode = i;
        this.opDate = opDate;
        this.purCd = purCd;
        this.regnNo = regnNo;
        this.stateCode = stateCode;
        this.status = status;
        this.userCode = i2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthType() {
        return this.authType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOpDate() {
        return this.opDate;
    }

    public final ArrayList<Integer> component5() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUserCode() {
        return this.userCode;
    }

    public final DoorStepReq copy(String applNo, String authType, int officeCode, String opDate, ArrayList<Integer> purCd, String regnNo, String stateCode, String status, int userCode) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(opDate, "opDate");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(status, "status");
        return new DoorStepReq(applNo, authType, officeCode, opDate, purCd, regnNo, stateCode, status, userCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoorStepReq)) {
            return false;
        }
        DoorStepReq doorStepReq = (DoorStepReq) other;
        return Intrinsics.areEqual(this.applNo, doorStepReq.applNo) && Intrinsics.areEqual(this.authType, doorStepReq.authType) && this.officeCode == doorStepReq.officeCode && Intrinsics.areEqual(this.opDate, doorStepReq.opDate) && Intrinsics.areEqual(this.purCd, doorStepReq.purCd) && Intrinsics.areEqual(this.regnNo, doorStepReq.regnNo) && Intrinsics.areEqual(this.stateCode, doorStepReq.stateCode) && Intrinsics.areEqual(this.status, doorStepReq.status) && this.userCode == doorStepReq.userCode;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpDate() {
        return this.opDate;
    }

    public final ArrayList<Integer> getPurCd() {
        return this.purCd;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        String str = this.applNo;
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.authType.hashCode()) * 31) + Integer.hashCode(this.officeCode)) * 31) + this.opDate.hashCode()) * 31) + this.purCd.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.userCode);
    }

    public String toString() {
        return "DoorStepReq(applNo=" + this.applNo + ", authType=" + this.authType + ", officeCode=" + this.officeCode + ", opDate=" + this.opDate + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", status=" + this.status + ", userCode=" + this.userCode + ')';
    }
}
