package com.nic.mparivahan.VahanServices.eSign.ModelEsign;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/VahanServices/eSign/ModelEsign/ApiMessage;", "", "developerMessage", "", "message", "messageParam", "statusCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V", "getDeveloperMessage", "()Ljava/lang/String;", "getMessage", "getMessageParam", "()Ljava/lang/Object;", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApiMessage {
    private final String developerMessage;
    private final String message;
    private final Object messageParam;
    private final int statusCode;

    public ApiMessage(String developerMessage, String message, Object messageParam, int i) {
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageParam, "messageParam");
        this.developerMessage = developerMessage;
        this.message = message;
        this.messageParam = messageParam;
        this.statusCode = i;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = apiMessage.message;
        }
        if ((i2 & 4) != 0) {
            obj = apiMessage.messageParam;
        }
        if ((i2 & 8) != 0) {
            i = apiMessage.statusCode;
        }
        return apiMessage.copy(str, str2, obj, i);
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
    public final Object getMessageParam() {
        return this.messageParam;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final ApiMessage copy(String developerMessage, String message, Object messageParam, int statusCode) {
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageParam, "messageParam");
        return new ApiMessage(developerMessage, message, messageParam, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) other;
        return Intrinsics.areEqual(this.developerMessage, apiMessage.developerMessage) && Intrinsics.areEqual(this.message, apiMessage.message) && Intrinsics.areEqual(this.messageParam, apiMessage.messageParam) && this.statusCode == apiMessage.statusCode;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Object getMessageParam() {
        return this.messageParam;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return (((((this.developerMessage.hashCode() * 31) + this.message.hashCode()) * 31) + this.messageParam.hashCode()) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ')';
    }
}
