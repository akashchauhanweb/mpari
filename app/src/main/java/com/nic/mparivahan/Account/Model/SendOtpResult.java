package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/Account/Model/SendOtpResult;", "", "param", "", "recordId", "", "statusCode", "statusDesc", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getParam", "()Ljava/lang/String;", "getRecordId", "()I", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SendOtpResult {
    private final String param;
    private final int recordId;
    private final String statusCode;
    private final String statusDesc;

    public SendOtpResult(String param, int i, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.param = param;
        this.recordId = i;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ SendOtpResult copy$default(SendOtpResult sendOtpResult, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sendOtpResult.param;
        }
        if ((i2 & 2) != 0) {
            i = sendOtpResult.recordId;
        }
        if ((i2 & 4) != 0) {
            str2 = sendOtpResult.statusCode;
        }
        if ((i2 & 8) != 0) {
            str3 = sendOtpResult.statusDesc;
        }
        return sendOtpResult.copy(str, i, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecordId() {
        return this.recordId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final SendOtpResult copy(String param, int recordId, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new SendOtpResult(param, recordId, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendOtpResult)) {
            return false;
        }
        SendOtpResult sendOtpResult = (SendOtpResult) other;
        return Intrinsics.areEqual(this.param, sendOtpResult.param) && this.recordId == sendOtpResult.recordId && Intrinsics.areEqual(this.statusCode, sendOtpResult.statusCode) && Intrinsics.areEqual(this.statusDesc, sendOtpResult.statusDesc);
    }

    public final String getParam() {
        return this.param;
    }

    public final int getRecordId() {
        return this.recordId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((this.param.hashCode() * 31) + Integer.hashCode(this.recordId)) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "SendOtpResult(param=" + this.param + ", recordId=" + this.recordId + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }

    public /* synthetic */ SendOtpResult(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "  " : str, i, str2, str3);
    }
}
