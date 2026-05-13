package com.nic.mparivahan.DLServicesAuth.eKyc.Pojo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/Pojo/SubmitAdharApi;", "", "alerMessage", "statusCode", "", "statusDesc", "ekycId", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;J)V", "getAlerMessage", "()Ljava/lang/Object;", "getEkycId", "()J", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmitAdharApi {
    private final Object alerMessage;
    private final long ekycId;
    private final String statusCode;
    private final String statusDesc;

    public SubmitAdharApi(Object alerMessage, String statusCode, String statusDesc, long j) {
        Intrinsics.checkNotNullParameter(alerMessage, "alerMessage");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.alerMessage = alerMessage;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.ekycId = j;
    }

    public static /* synthetic */ SubmitAdharApi copy$default(SubmitAdharApi submitAdharApi, Object obj, String str, String str2, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = submitAdharApi.alerMessage;
        }
        if ((i & 2) != 0) {
            str = submitAdharApi.statusCode;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = submitAdharApi.statusDesc;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            j = submitAdharApi.ekycId;
        }
        return submitAdharApi.copy(obj, str3, str4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getAlerMessage() {
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEkycId() {
        return this.ekycId;
    }

    public final SubmitAdharApi copy(Object alerMessage, String statusCode, String statusDesc, long ekycId) {
        Intrinsics.checkNotNullParameter(alerMessage, "alerMessage");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new SubmitAdharApi(alerMessage, statusCode, statusDesc, ekycId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitAdharApi)) {
            return false;
        }
        SubmitAdharApi submitAdharApi = (SubmitAdharApi) other;
        return Intrinsics.areEqual(this.alerMessage, submitAdharApi.alerMessage) && Intrinsics.areEqual(this.statusCode, submitAdharApi.statusCode) && Intrinsics.areEqual(this.statusDesc, submitAdharApi.statusDesc) && this.ekycId == submitAdharApi.ekycId;
    }

    public final Object getAlerMessage() {
        return this.alerMessage;
    }

    public final long getEkycId() {
        return this.ekycId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((this.alerMessage.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode()) * 31) + Long.hashCode(this.ekycId);
    }

    public String toString() {
        return "SubmitAdharApi(alerMessage=" + this.alerMessage + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", ekycId=" + this.ekycId + ')';
    }
}
