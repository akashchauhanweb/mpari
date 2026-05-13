package com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.MessageParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/ApiMessage;", "", "developerMessage", "", "message", "messageParam", "", "Lcom/nic/mparivahan/VahanEkyc/Wrapper/EkycResponse/MessageParam;", "statusCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getDeveloperMessage", "()Ljava/lang/String;", "getMessage", "getMessageParam", "()Ljava/util/List;", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApiMessage {
    private final String developerMessage;
    private final String message;
    private final List<MessageParam> messageParam;
    private final int statusCode;

    public ApiMessage(String developerMessage, String message, List<MessageParam> messageParam, int i) {
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageParam, "messageParam");
        this.developerMessage = developerMessage;
        this.message = message;
        this.messageParam = messageParam;
        this.statusCode = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = apiMessage.message;
        }
        if ((i2 & 4) != 0) {
            list = apiMessage.messageParam;
        }
        if ((i2 & 8) != 0) {
            i = apiMessage.statusCode;
        }
        return apiMessage.copy(str, str2, list, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<MessageParam> component3() {
        return this.messageParam;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final ApiMessage copy(String developerMessage, String message, List<MessageParam> messageParam, int statusCode) {
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

    public final List<MessageParam> getMessageParam() {
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
