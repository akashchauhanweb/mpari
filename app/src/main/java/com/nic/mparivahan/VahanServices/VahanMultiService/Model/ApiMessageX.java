package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ApiMessageX;", "", "developerMessage", "", "message", "messageParam", "statusCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDeveloperMessage", "()Ljava/lang/String;", "getMessage", "getMessageParam", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApiMessageX {
    private final String developerMessage;
    private final String message;
    private final String messageParam;
    private final int statusCode;

    public ApiMessageX(String str, String str2, String str3, int i) {
        this.developerMessage = str;
        this.message = str2;
        this.messageParam = str3;
        this.statusCode = i;
    }

    public static /* synthetic */ ApiMessageX copy$default(ApiMessageX apiMessageX, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = apiMessageX.developerMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = apiMessageX.message;
        }
        if ((i2 & 4) != 0) {
            str3 = apiMessageX.messageParam;
        }
        if ((i2 & 8) != 0) {
            i = apiMessageX.statusCode;
        }
        return apiMessageX.copy(str, str2, str3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageParam() {
        return this.messageParam;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final ApiMessageX copy(String developerMessage, String message, String messageParam, int statusCode) {
        return new ApiMessageX(developerMessage, message, messageParam, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMessageX)) {
            return false;
        }
        ApiMessageX apiMessageX = (ApiMessageX) other;
        return Intrinsics.areEqual(this.developerMessage, apiMessageX.developerMessage) && Intrinsics.areEqual(this.message, apiMessageX.message) && Intrinsics.areEqual(this.messageParam, apiMessageX.messageParam) && this.statusCode == apiMessageX.statusCode;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageParam() {
        return this.messageParam;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.developerMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageParam;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ApiMessageX(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ')';
    }
}
