package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlDetails;", "", "dlRequest", "Lcom/nic/mparivahan/dlservices/data/model/DlRequest;", "(Lcom/nic/mparivahan/dlservices/data/model/DlRequest;)V", "getDlRequest", "()Lcom/nic/mparivahan/dlservices/data/model/DlRequest;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlDetails {
    private final DlRequest dlRequest;

    public DlDetails(DlRequest dlRequest) {
        Intrinsics.checkNotNullParameter(dlRequest, "dlRequest");
        this.dlRequest = dlRequest;
    }

    public static /* synthetic */ DlDetails copy$default(DlDetails dlDetails, DlRequest dlRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            dlRequest = dlDetails.dlRequest;
        }
        return dlDetails.copy(dlRequest);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DlRequest getDlRequest() {
        return this.dlRequest;
    }

    public final DlDetails copy(DlRequest dlRequest) {
        Intrinsics.checkNotNullParameter(dlRequest, "dlRequest");
        return new DlDetails(dlRequest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DlDetails) && Intrinsics.areEqual(this.dlRequest, ((DlDetails) other).dlRequest);
    }

    public final DlRequest getDlRequest() {
        return this.dlRequest;
    }

    public int hashCode() {
        return this.dlRequest.hashCode();
    }

    public String toString() {
        return "DlDetails(dlRequest=" + this.dlRequest + ')';
    }
}
