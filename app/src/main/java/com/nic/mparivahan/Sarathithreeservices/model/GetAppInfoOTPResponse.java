package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/GetAppInfoOTPResponse;", "", "recordId", "", "statusDesc", "", "param", "statusCode", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParam", "()Ljava/lang/String;", "getRecordId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/Sarathithreeservices/model/GetAppInfoOTPResponse;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetAppInfoOTPResponse {

    @xy5("param")
    private final String param;

    @xy5("recordId")
    private final Integer recordId;

    @xy5("statusCode")
    private final String statusCode;

    @xy5("statusDesc")
    private final String statusDesc;

    public GetAppInfoOTPResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GetAppInfoOTPResponse copy$default(GetAppInfoOTPResponse getAppInfoOTPResponse, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = getAppInfoOTPResponse.recordId;
        }
        if ((i & 2) != 0) {
            str = getAppInfoOTPResponse.statusDesc;
        }
        if ((i & 4) != 0) {
            str2 = getAppInfoOTPResponse.param;
        }
        if ((i & 8) != 0) {
            str3 = getAppInfoOTPResponse.statusCode;
        }
        return getAppInfoOTPResponse.copy(num, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRecordId() {
        return this.recordId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    public final GetAppInfoOTPResponse copy(Integer recordId, String statusDesc, String param, String statusCode) {
        return new GetAppInfoOTPResponse(recordId, statusDesc, param, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAppInfoOTPResponse)) {
            return false;
        }
        GetAppInfoOTPResponse getAppInfoOTPResponse = (GetAppInfoOTPResponse) other;
        return Intrinsics.areEqual(this.recordId, getAppInfoOTPResponse.recordId) && Intrinsics.areEqual(this.statusDesc, getAppInfoOTPResponse.statusDesc) && Intrinsics.areEqual(this.param, getAppInfoOTPResponse.param) && Intrinsics.areEqual(this.statusCode, getAppInfoOTPResponse.statusCode);
    }

    public final String getParam() {
        return this.param;
    }

    public final Integer getRecordId() {
        return this.recordId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        Integer num = this.recordId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusDesc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.param;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusCode;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "GetAppInfoOTPResponse(recordId=" + this.recordId + ", statusDesc=" + this.statusDesc + ", param=" + this.param + ", statusCode=" + this.statusCode + ')';
    }

    public GetAppInfoOTPResponse(Integer num, String str, String str2, String str3) {
        this.recordId = num;
        this.statusDesc = str;
        this.param = str2;
        this.statusCode = str3;
    }

    public /* synthetic */ GetAppInfoOTPResponse(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
