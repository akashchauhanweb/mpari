package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRenewalResponse;", "Ljava/io/Serializable;", "statusDesc", "", "statusCode", "dlresponse", "Lcom/nic/mparivahan/dlservices/data/model/Dlresponse;", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/Dlresponse;)V", "getDlresponse", "()Lcom/nic/mparivahan/dlservices/data/model/Dlresponse;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRenewalResponse implements Serializable {
    private final Dlresponse dlresponse;
    private final String statusCode;
    private final String statusDesc;

    public DlRenewalResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DlRenewalResponse copy$default(DlRenewalResponse dlRenewalResponse, String str, String str2, Dlresponse dlresponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlRenewalResponse.statusDesc;
        }
        if ((i & 2) != 0) {
            str2 = dlRenewalResponse.statusCode;
        }
        if ((i & 4) != 0) {
            dlresponse = dlRenewalResponse.dlresponse;
        }
        return dlRenewalResponse.copy(str, str2, dlresponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Dlresponse getDlresponse() {
        return this.dlresponse;
    }

    public final DlRenewalResponse copy(String statusDesc, String statusCode, Dlresponse dlresponse) {
        return new DlRenewalResponse(statusDesc, statusCode, dlresponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlRenewalResponse)) {
            return false;
        }
        DlRenewalResponse dlRenewalResponse = (DlRenewalResponse) other;
        return Intrinsics.areEqual(this.statusDesc, dlRenewalResponse.statusDesc) && Intrinsics.areEqual(this.statusCode, dlRenewalResponse.statusCode) && Intrinsics.areEqual(this.dlresponse, dlRenewalResponse.dlresponse);
    }

    public final Dlresponse getDlresponse() {
        return this.dlresponse;
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
        String str2 = this.statusCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Dlresponse dlresponse = this.dlresponse;
        return iHashCode2 + (dlresponse != null ? dlresponse.hashCode() : 0);
    }

    public String toString() {
        return "DlRenewalResponse(statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ", dlresponse=" + this.dlresponse + ')';
    }

    public DlRenewalResponse(String str, String str2, Dlresponse dlresponse) {
        this.statusDesc = str;
        this.statusCode = str2;
        this.dlresponse = dlresponse;
    }

    public /* synthetic */ DlRenewalResponse(String str, String str2, Dlresponse dlresponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : dlresponse);
    }
}
