package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/Account/Model/OtpVerifyResult;", "", "mparCitizenUser", "Lcom/nic/mparivahan/Account/Model/MparCitizenUser;", "param", "recordId", "statusCode", "", "statusDesc", "(Lcom/nic/mparivahan/Account/Model/MparCitizenUser;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getMparCitizenUser", "()Lcom/nic/mparivahan/Account/Model/MparCitizenUser;", "getParam", "()Ljava/lang/Object;", "getRecordId", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OtpVerifyResult {
    private final MparCitizenUser mparCitizenUser;
    private final Object param;
    private final Object recordId;
    private final String statusCode;
    private final String statusDesc;

    public OtpVerifyResult(MparCitizenUser mparCitizenUser, Object obj, Object obj2, String str, String str2) {
        this.mparCitizenUser = mparCitizenUser;
        this.param = obj;
        this.recordId = obj2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ OtpVerifyResult copy$default(OtpVerifyResult otpVerifyResult, MparCitizenUser mparCitizenUser, Object obj, Object obj2, String str, String str2, int i, Object obj3) {
        if ((i & 1) != 0) {
            mparCitizenUser = otpVerifyResult.mparCitizenUser;
        }
        if ((i & 2) != 0) {
            obj = otpVerifyResult.param;
        }
        Object obj4 = obj;
        if ((i & 4) != 0) {
            obj2 = otpVerifyResult.recordId;
        }
        Object obj5 = obj2;
        if ((i & 8) != 0) {
            str = otpVerifyResult.statusCode;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = otpVerifyResult.statusDesc;
        }
        return otpVerifyResult.copy(mparCitizenUser, obj4, obj5, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MparCitizenUser getMparCitizenUser() {
        return this.mparCitizenUser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getParam() {
        return this.param;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getRecordId() {
        return this.recordId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final OtpVerifyResult copy(MparCitizenUser mparCitizenUser, Object param, Object recordId, String statusCode, String statusDesc) {
        return new OtpVerifyResult(mparCitizenUser, param, recordId, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpVerifyResult)) {
            return false;
        }
        OtpVerifyResult otpVerifyResult = (OtpVerifyResult) other;
        return Intrinsics.areEqual(this.mparCitizenUser, otpVerifyResult.mparCitizenUser) && Intrinsics.areEqual(this.param, otpVerifyResult.param) && Intrinsics.areEqual(this.recordId, otpVerifyResult.recordId) && Intrinsics.areEqual(this.statusCode, otpVerifyResult.statusCode) && Intrinsics.areEqual(this.statusDesc, otpVerifyResult.statusDesc);
    }

    public final MparCitizenUser getMparCitizenUser() {
        return this.mparCitizenUser;
    }

    public final Object getParam() {
        return this.param;
    }

    public final Object getRecordId() {
        return this.recordId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        MparCitizenUser mparCitizenUser = this.mparCitizenUser;
        int iHashCode = (mparCitizenUser == null ? 0 : mparCitizenUser.hashCode()) * 31;
        Object obj = this.param;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.recordId;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str = this.statusCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDesc;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "OtpVerifyResult(mparCitizenUser=" + this.mparCitizenUser + ", param=" + this.param + ", recordId=" + this.recordId + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
