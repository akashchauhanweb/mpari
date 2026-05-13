package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftResponse/DraftResponse;", "", "apiMessage", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftResponse/ApiMessage;", "data", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftResponse/Data;", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftResponse/ApiMessage;Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftResponse/Data;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftResponse/ApiMessage;", "getData", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftResponse/Data;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DraftResponse {
    private final ApiMessage apiMessage;
    private final Data data;

    public DraftResponse(ApiMessage apiMessage, Data data) {
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ DraftResponse copy$default(DraftResponse draftResponse, ApiMessage apiMessage, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = draftResponse.apiMessage;
        }
        if ((i & 2) != 0) {
            data = draftResponse.data;
        }
        return draftResponse.copy(apiMessage, data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final DraftResponse copy(ApiMessage apiMessage, Data data) {
        return new DraftResponse(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftResponse)) {
            return false;
        }
        DraftResponse draftResponse = (DraftResponse) other;
        return Intrinsics.areEqual(this.apiMessage, draftResponse.apiMessage) && Intrinsics.areEqual(this.data, draftResponse.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage = this.apiMessage;
        int iHashCode = (apiMessage == null ? 0 : apiMessage.hashCode()) * 31;
        Data data = this.data;
        return iHashCode + (data != null ? data.hashCode() : 0);
    }

    public String toString() {
        return "DraftResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
