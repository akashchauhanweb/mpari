package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseMessage;", "Ljava/io/Serializable;", "developerMessage", "", "errorCode", "", "messageParam", "message", "statusCode", "", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "getDeveloperMessage", "()Ljava/lang/String;", "getErrorCode", "()Ljava/lang/Object;", "getMessage", "getMessageParam", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseMessage;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ResponseMessage implements Serializable {

    @xy5("developerMessage")
    private final String developerMessage;

    @xy5("errorCode")
    private final Object errorCode;

    @xy5("message")
    private final String message;

    @xy5("messageParam")
    private final Object messageParam;

    @xy5("statusCode")
    private final Integer statusCode;

    public ResponseMessage() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ResponseMessage copy$default(ResponseMessage responseMessage, String str, Object obj, Object obj2, String str2, Integer num, int i, Object obj3) {
        if ((i & 1) != 0) {
            str = responseMessage.developerMessage;
        }
        if ((i & 2) != 0) {
            obj = responseMessage.errorCode;
        }
        Object obj4 = obj;
        if ((i & 4) != 0) {
            obj2 = responseMessage.messageParam;
        }
        Object obj5 = obj2;
        if ((i & 8) != 0) {
            str2 = responseMessage.message;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            num = responseMessage.statusCode;
        }
        return responseMessage.copy(str, obj4, obj5, str3, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getMessageParam() {
        return this.messageParam;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final ResponseMessage copy(String developerMessage, Object errorCode, Object messageParam, String message, Integer statusCode) {
        return new ResponseMessage(developerMessage, errorCode, messageParam, message, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseMessage)) {
            return false;
        }
        ResponseMessage responseMessage = (ResponseMessage) other;
        return Intrinsics.areEqual(this.developerMessage, responseMessage.developerMessage) && Intrinsics.areEqual(this.errorCode, responseMessage.errorCode) && Intrinsics.areEqual(this.messageParam, responseMessage.messageParam) && Intrinsics.areEqual(this.message, responseMessage.message) && Intrinsics.areEqual(this.statusCode, responseMessage.statusCode);
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final Object getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Object getMessageParam() {
        return this.messageParam;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.developerMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.errorCode;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.messageParam;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.statusCode;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ResponseMessage(developerMessage=" + this.developerMessage + ", errorCode=" + this.errorCode + ", messageParam=" + this.messageParam + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }

    public ResponseMessage(String str, Object obj, Object obj2, String str2, Integer num) {
        this.developerMessage = str;
        this.errorCode = obj;
        this.messageParam = obj2;
        this.message = str2;
        this.statusCode = num;
    }

    public /* synthetic */ ResponseMessage(String str, Object obj, Object obj2, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num);
    }
}
