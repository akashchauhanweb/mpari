package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/ApiMessage;", "", "developerMessage", "", "message", "messageParam", "statusCode", "", "timeStamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getDeveloperMessage", "()Ljava/lang/String;", "getMessage", "getMessageParam", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeStamp", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/ApiMessage;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApiMessage {
    private final String developerMessage;
    private final String message;
    private final String messageParam;
    private final Integer statusCode;
    private final String timeStamp;

    public ApiMessage(String str, String str2, String str3, Integer num, String str4) {
        this.developerMessage = str;
        this.message = str2;
        this.messageParam = str3;
        this.statusCode = num;
        this.timeStamp = str4;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        if ((i & 2) != 0) {
            str2 = apiMessage.message;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = apiMessage.messageParam;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = apiMessage.statusCode;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = apiMessage.timeStamp;
        }
        return apiMessage.copy(str, str5, str6, num2, str4);
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
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public final ApiMessage copy(String developerMessage, String message, String messageParam, Integer statusCode, String timeStamp) {
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
        return Intrinsics.areEqual(this.developerMessage, apiMessage.developerMessage) && Intrinsics.areEqual(this.message, apiMessage.message) && Intrinsics.areEqual(this.messageParam, apiMessage.messageParam) && Intrinsics.areEqual(this.statusCode, apiMessage.statusCode) && Intrinsics.areEqual(this.timeStamp, apiMessage.timeStamp);
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

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        String str = this.developerMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageParam;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.timeStamp;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ", timeStamp=" + this.timeStamp + ')';
    }
}
