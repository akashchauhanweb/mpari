package com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewService/NewServPojo/ResponseMsg;", "", "developerMessage", "", "message", "statusCode", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDeveloperMessage", "()Ljava/lang/String;", "getMessage", "getStatusCode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ResponseMsg {
    private final String developerMessage;
    private final String message;
    private final int statusCode;

    public ResponseMsg(String developerMessage, String message, int i) {
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        this.developerMessage = developerMessage;
        this.message = message;
        this.statusCode = i;
    }

    public static /* synthetic */ ResponseMsg copy$default(ResponseMsg responseMsg, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = responseMsg.developerMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = responseMsg.message;
        }
        if ((i2 & 4) != 0) {
            i = responseMsg.statusCode;
        }
        return responseMsg.copy(str, str2, i);
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
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final ResponseMsg copy(String developerMessage, String message, int statusCode) {
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ResponseMsg(developerMessage, message, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseMsg)) {
            return false;
        }
        ResponseMsg responseMsg = (ResponseMsg) other;
        return Intrinsics.areEqual(this.developerMessage, responseMsg.developerMessage) && Intrinsics.areEqual(this.message, responseMsg.message) && this.statusCode == responseMsg.statusCode;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return (((this.developerMessage.hashCode() * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ResponseMsg(developerMessage=" + this.developerMessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }
}
