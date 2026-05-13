package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/ToCommonModel2/ApiMessage;", "", "developerMessage", "message", "", "messageParam", "statusCode", "", "timeStamp", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/String;)V", "getDeveloperMessage", "()Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getMessageParam", "getStatusCode", "()I", "getTimeStamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApiMessage {
    private final Object developerMessage;
    private final String message;
    private final Object messageParam;
    private final int statusCode;
    private final String timeStamp;

    public ApiMessage(Object developerMessage, String message, Object messageParam, int i, String timeStamp) {
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageParam, "messageParam");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        this.developerMessage = developerMessage;
        this.message = message;
        this.messageParam = messageParam;
        this.statusCode = i;
        this.timeStamp = timeStamp;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, Object obj, String str, Object obj2, int i, String str2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = apiMessage.developerMessage;
        }
        if ((i2 & 2) != 0) {
            str = apiMessage.message;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            obj2 = apiMessage.messageParam;
        }
        Object obj4 = obj2;
        if ((i2 & 8) != 0) {
            i = apiMessage.statusCode;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = apiMessage.timeStamp;
        }
        return apiMessage.copy(obj, str3, obj4, i3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getDeveloperMessage() {
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public final ApiMessage copy(Object developerMessage, String message, Object messageParam, int statusCode, String timeStamp) {
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageParam, "messageParam");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return new ApiMessage(developerMessage, message, messageParam, statusCode, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) other;
        return Intrinsics.areEqual(this.developerMessage, apiMessage.developerMessage) && Intrinsics.areEqual(this.message, apiMessage.message) && Intrinsics.areEqual(this.messageParam, apiMessage.messageParam) && this.statusCode == apiMessage.statusCode && Intrinsics.areEqual(this.timeStamp, apiMessage.timeStamp);
    }

    public final Object getDeveloperMessage() {
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

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((((((this.developerMessage.hashCode() * 31) + this.message.hashCode()) * 31) + this.messageParam.hashCode()) * 31) + Integer.hashCode(this.statusCode)) * 31) + this.timeStamp.hashCode();
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ", timeStamp=" + this.timeStamp + ')';
    }
}
