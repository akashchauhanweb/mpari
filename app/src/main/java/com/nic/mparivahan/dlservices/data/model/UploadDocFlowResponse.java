package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/UploadDocFlowResponse;", "", "errCode", "devmessage", "", "message", "statusCode", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDevmessage", "()Ljava/lang/String;", "getErrCode", "()Ljava/lang/Object;", "getMessage", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/nic/mparivahan/dlservices/data/model/UploadDocFlowResponse;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UploadDocFlowResponse {

    @xy5("devmessage")
    private final String devmessage;

    @xy5("errCode")
    private final Object errCode;

    @xy5("message")
    private final String message;

    @xy5("statusCode")
    private final Integer statusCode;

    public UploadDocFlowResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ UploadDocFlowResponse copy$default(UploadDocFlowResponse uploadDocFlowResponse, Object obj, String str, String str2, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = uploadDocFlowResponse.errCode;
        }
        if ((i & 2) != 0) {
            str = uploadDocFlowResponse.devmessage;
        }
        if ((i & 4) != 0) {
            str2 = uploadDocFlowResponse.message;
        }
        if ((i & 8) != 0) {
            num = uploadDocFlowResponse.statusCode;
        }
        return uploadDocFlowResponse.copy(obj, str, str2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getErrCode() {
        return this.errCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDevmessage() {
        return this.devmessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final UploadDocFlowResponse copy(Object errCode, String devmessage, String message, Integer statusCode) {
        return new UploadDocFlowResponse(errCode, devmessage, message, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadDocFlowResponse)) {
            return false;
        }
        UploadDocFlowResponse uploadDocFlowResponse = (UploadDocFlowResponse) other;
        return Intrinsics.areEqual(this.errCode, uploadDocFlowResponse.errCode) && Intrinsics.areEqual(this.devmessage, uploadDocFlowResponse.devmessage) && Intrinsics.areEqual(this.message, uploadDocFlowResponse.message) && Intrinsics.areEqual(this.statusCode, uploadDocFlowResponse.statusCode);
    }

    public final String getDevmessage() {
        return this.devmessage;
    }

    public final Object getErrCode() {
        return this.errCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        Object obj = this.errCode;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.devmessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.statusCode;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "UploadDocFlowResponse(errCode=" + this.errCode + ", devmessage=" + this.devmessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }

    public UploadDocFlowResponse(Object obj, String str, String str2, Integer num) {
        this.errCode = obj;
        this.devmessage = str;
        this.message = str2;
        this.statusCode = num;
    }

    public /* synthetic */ UploadDocFlowResponse(Object obj, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}
