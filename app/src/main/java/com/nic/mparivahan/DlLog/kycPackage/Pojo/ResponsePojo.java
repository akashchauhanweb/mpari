package com.nic.mparivahan.DlLog.kycPackage.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/DlLog/kycPackage/Pojo/ResponsePojo;", "", "alerMessage", "", "statusCode", "statusDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlerMessage", "()Ljava/lang/String;", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ResponsePojo {
    private final String alerMessage;
    private final String statusCode;
    private final String statusDesc;

    public ResponsePojo(String alerMessage, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(alerMessage, "alerMessage");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.alerMessage = alerMessage;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ ResponsePojo copy$default(ResponsePojo responsePojo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responsePojo.alerMessage;
        }
        if ((i & 2) != 0) {
            str2 = responsePojo.statusCode;
        }
        if ((i & 4) != 0) {
            str3 = responsePojo.statusDesc;
        }
        return responsePojo.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlerMessage() {
        return this.alerMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ResponsePojo copy(String alerMessage, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(alerMessage, "alerMessage");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new ResponsePojo(alerMessage, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponsePojo)) {
            return false;
        }
        ResponsePojo responsePojo = (ResponsePojo) other;
        return Intrinsics.areEqual(this.alerMessage, responsePojo.alerMessage) && Intrinsics.areEqual(this.statusCode, responsePojo.statusCode) && Intrinsics.areEqual(this.statusDesc, responsePojo.statusDesc);
    }

    public final String getAlerMessage() {
        return this.alerMessage;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.alerMessage.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "ResponsePojo(alerMessage=" + this.alerMessage + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
