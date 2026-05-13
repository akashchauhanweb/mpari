package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/ApiMessage;", "", "data", "", "developerMessage", "message", "messageParam", "statusCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V", "getData", "()Ljava/lang/String;", "getDeveloperMessage", "getMessage", "getMessageParam", "()Ljava/lang/Object;", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApiMessage {
    private final String data;
    private final String developerMessage;
    private final String message;
    private final Object messageParam;
    private final int statusCode;

    public ApiMessage(String str, String str2, String str3, Object obj, int i) {
        this.data = str;
        this.developerMessage = str2;
        this.message = str3;
        this.messageParam = obj;
        this.statusCode = i;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, String str3, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = apiMessage.data;
        }
        if ((i2 & 2) != 0) {
            str2 = apiMessage.developerMessage;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = apiMessage.message;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            obj = apiMessage.messageParam;
        }
        Object obj3 = obj;
        if ((i2 & 16) != 0) {
            i = apiMessage.statusCode;
        }
        return apiMessage.copy(str, str4, str5, obj3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getMessageParam() {
        return this.messageParam;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final ApiMessage copy(String data, String developerMessage, String message, Object messageParam, int statusCode) {
        return new ApiMessage(data, developerMessage, message, messageParam, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) other;
        return Intrinsics.areEqual(this.data, apiMessage.data) && Intrinsics.areEqual(this.developerMessage, apiMessage.developerMessage) && Intrinsics.areEqual(this.message, apiMessage.message) && Intrinsics.areEqual(this.messageParam, apiMessage.messageParam) && this.statusCode == apiMessage.statusCode;
    }

    public final String getData() {
        return this.data;
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
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.developerMessage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.messageParam;
        return ((iHashCode3 + (obj != null ? obj.hashCode() : 0)) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ApiMessage(data=" + this.data + ", developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ')';
    }
}
