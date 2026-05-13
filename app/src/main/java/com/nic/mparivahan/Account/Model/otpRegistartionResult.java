package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/Account/Model/otpRegistartionResult;", "", "mparCitizenUser", "Lcom/nic/mparivahan/Account/Model/MparCitizenUserX;", "param", "", "statusCode", "statusDesc", "(Lcom/nic/mparivahan/Account/Model/MparCitizenUserX;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMparCitizenUser", "()Lcom/nic/mparivahan/Account/Model/MparCitizenUserX;", "getParam", "()Ljava/lang/String;", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class otpRegistartionResult {
    private final MparCitizenUserX mparCitizenUser;
    private final String param;
    private final String statusCode;
    private final String statusDesc;

    public otpRegistartionResult(MparCitizenUserX mparCitizenUserX, String str, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.mparCitizenUser = mparCitizenUserX;
        this.param = str;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ otpRegistartionResult copy$default(otpRegistartionResult otpregistartionresult, MparCitizenUserX mparCitizenUserX, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            mparCitizenUserX = otpregistartionresult.mparCitizenUser;
        }
        if ((i & 2) != 0) {
            str = otpregistartionresult.param;
        }
        if ((i & 4) != 0) {
            str2 = otpregistartionresult.statusCode;
        }
        if ((i & 8) != 0) {
            str3 = otpregistartionresult.statusDesc;
        }
        return otpregistartionresult.copy(mparCitizenUserX, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MparCitizenUserX getMparCitizenUser() {
        return this.mparCitizenUser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final otpRegistartionResult copy(MparCitizenUserX mparCitizenUser, String param, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new otpRegistartionResult(mparCitizenUser, param, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof otpRegistartionResult)) {
            return false;
        }
        otpRegistartionResult otpregistartionresult = (otpRegistartionResult) other;
        return Intrinsics.areEqual(this.mparCitizenUser, otpregistartionresult.mparCitizenUser) && Intrinsics.areEqual(this.param, otpregistartionresult.param) && Intrinsics.areEqual(this.statusCode, otpregistartionresult.statusCode) && Intrinsics.areEqual(this.statusDesc, otpregistartionresult.statusDesc);
    }

    public final MparCitizenUserX getMparCitizenUser() {
        return this.mparCitizenUser;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        MparCitizenUserX mparCitizenUserX = this.mparCitizenUser;
        int iHashCode = (mparCitizenUserX == null ? 0 : mparCitizenUserX.hashCode()) * 31;
        String str = this.param;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "otpRegistartionResult(mparCitizenUser=" + this.mparCitizenUser + ", param=" + this.param + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
