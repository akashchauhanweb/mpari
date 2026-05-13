package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/GetAppInfoResendResponse;", "", "statusDesc", "", "param", "statusCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParam", "()Ljava/lang/String;", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetAppInfoResendResponse {

    @xy5("param")
    private final String param;

    @xy5("statusCode")
    private final String statusCode;

    @xy5("statusDesc")
    private final String statusDesc;

    public GetAppInfoResendResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ GetAppInfoResendResponse copy$default(GetAppInfoResendResponse getAppInfoResendResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAppInfoResendResponse.statusDesc;
        }
        if ((i & 2) != 0) {
            str2 = getAppInfoResendResponse.param;
        }
        if ((i & 4) != 0) {
            str3 = getAppInfoResendResponse.statusCode;
        }
        return getAppInfoResendResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    public final GetAppInfoResendResponse copy(String statusDesc, String param, String statusCode) {
        return new GetAppInfoResendResponse(statusDesc, param, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAppInfoResendResponse)) {
            return false;
        }
        GetAppInfoResendResponse getAppInfoResendResponse = (GetAppInfoResendResponse) other;
        return Intrinsics.areEqual(this.statusDesc, getAppInfoResendResponse.statusDesc) && Intrinsics.areEqual(this.param, getAppInfoResendResponse.param) && Intrinsics.areEqual(this.statusCode, getAppInfoResendResponse.statusCode);
    }

    public final String getParam() {
        return this.param;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusDesc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.param;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusCode;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "GetAppInfoResendResponse(statusDesc=" + this.statusDesc + ", param=" + this.param + ", statusCode=" + this.statusCode + ')';
    }

    public GetAppInfoResendResponse(String str, String str2, String str3) {
        this.statusDesc = str;
        this.param = str2;
        this.statusCode = str3;
    }

    public /* synthetic */ GetAppInfoResendResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
