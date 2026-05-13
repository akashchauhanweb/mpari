package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/MultiSelectionResp;", "", "apiMessage", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ApiMessage;", "data", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ApiMessage;Ljava/lang/Object;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ApiMessage;", "getData", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MultiSelectionResp {
    private final ApiMessage apiMessage;
    private final Object data;

    public MultiSelectionResp(ApiMessage apiMessage, Object obj) {
        this.apiMessage = apiMessage;
        this.data = obj;
    }

    public static /* synthetic */ MultiSelectionResp copy$default(MultiSelectionResp multiSelectionResp, ApiMessage apiMessage, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            apiMessage = multiSelectionResp.apiMessage;
        }
        if ((i & 2) != 0) {
            obj = multiSelectionResp.data;
        }
        return multiSelectionResp.copy(apiMessage, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    public final MultiSelectionResp copy(ApiMessage apiMessage, Object data) {
        return new MultiSelectionResp(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiSelectionResp)) {
            return false;
        }
        MultiSelectionResp multiSelectionResp = (MultiSelectionResp) other;
        return Intrinsics.areEqual(this.apiMessage, multiSelectionResp.apiMessage) && Intrinsics.areEqual(this.data, multiSelectionResp.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Object getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage = this.apiMessage;
        int iHashCode = (apiMessage == null ? 0 : apiMessage.hashCode()) * 31;
        Object obj = this.data;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "MultiSelectionResp(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
