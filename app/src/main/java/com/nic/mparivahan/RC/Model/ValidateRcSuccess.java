package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/RC/Model/ValidateRcSuccess;", "", "statusCode", "", "statusDesc", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ValidateRcSuccess {
    private final String statusCode;
    private final String statusDesc;

    public ValidateRcSuccess(String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ ValidateRcSuccess copy$default(ValidateRcSuccess validateRcSuccess, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateRcSuccess.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = validateRcSuccess.statusDesc;
        }
        return validateRcSuccess.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ValidateRcSuccess copy(String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new ValidateRcSuccess(statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateRcSuccess)) {
            return false;
        }
        ValidateRcSuccess validateRcSuccess = (ValidateRcSuccess) other;
        return Intrinsics.areEqual(this.statusCode, validateRcSuccess.statusCode) && Intrinsics.areEqual(this.statusDesc, validateRcSuccess.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (this.statusCode.hashCode() * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "ValidateRcSuccess(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
