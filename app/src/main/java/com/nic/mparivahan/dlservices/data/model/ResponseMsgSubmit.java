package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/ResponseMsgSubmit;", "Ljava/io/Serializable;", "developerMessage", "", "message", "statusCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDeveloperMessage", "()Ljava/lang/String;", "getMessage", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/nic/mparivahan/dlservices/data/model/ResponseMsgSubmit;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ResponseMsgSubmit implements Serializable {

    @xy5("developerMessage")
    private final String developerMessage;

    @xy5("message")
    private final String message;

    @xy5("statusCode")
    private final Integer statusCode;

    public ResponseMsgSubmit() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ResponseMsgSubmit copy$default(ResponseMsgSubmit responseMsgSubmit, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseMsgSubmit.developerMessage;
        }
        if ((i & 2) != 0) {
            str2 = responseMsgSubmit.message;
        }
        if ((i & 4) != 0) {
            num = responseMsgSubmit.statusCode;
        }
        return responseMsgSubmit.copy(str, str2, num);
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
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final ResponseMsgSubmit copy(String developerMessage, String message, Integer statusCode) {
        return new ResponseMsgSubmit(developerMessage, message, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseMsgSubmit)) {
            return false;
        }
        ResponseMsgSubmit responseMsgSubmit = (ResponseMsgSubmit) other;
        return Intrinsics.areEqual(this.developerMessage, responseMsgSubmit.developerMessage) && Intrinsics.areEqual(this.message, responseMsgSubmit.message) && Intrinsics.areEqual(this.statusCode, responseMsgSubmit.statusCode);
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.developerMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.statusCode;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ResponseMsgSubmit(developerMessage=" + this.developerMessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }

    public ResponseMsgSubmit(String str, String str2, Integer num) {
        this.developerMessage = str;
        this.message = str2;
        this.statusCode = num;
    }

    public /* synthetic */ ResponseMsgSubmit(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
