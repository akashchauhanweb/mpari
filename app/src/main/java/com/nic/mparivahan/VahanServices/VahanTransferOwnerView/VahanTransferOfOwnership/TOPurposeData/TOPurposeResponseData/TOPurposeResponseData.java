package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J3\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeResponseData/TOPurposeResponseData;", "", "apiMessage", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeResponseData/ApiMessage;", "data", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeResponseData/Data;", "Lkotlin/collections/ArrayList;", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeResponseData/ApiMessage;Ljava/util/ArrayList;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeResponseData/ApiMessage;", "getData", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TOPurposeResponseData {
    private final ApiMessage apiMessage;
    private final ArrayList<Data> data;

    public TOPurposeResponseData(ApiMessage apiMessage, ArrayList<Data> arrayList) {
        this.apiMessage = apiMessage;
        this.data = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TOPurposeResponseData copy$default(TOPurposeResponseData tOPurposeResponseData, ApiMessage apiMessage, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = tOPurposeResponseData.apiMessage;
        }
        if ((i & 2) != 0) {
            arrayList = tOPurposeResponseData.data;
        }
        return tOPurposeResponseData.copy(apiMessage, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final ArrayList<Data> component2() {
        return this.data;
    }

    public final TOPurposeResponseData copy(ApiMessage apiMessage, ArrayList<Data> data) {
        return new TOPurposeResponseData(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TOPurposeResponseData)) {
            return false;
        }
        TOPurposeResponseData tOPurposeResponseData = (TOPurposeResponseData) other;
        return Intrinsics.areEqual(this.apiMessage, tOPurposeResponseData.apiMessage) && Intrinsics.areEqual(this.data, tOPurposeResponseData.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final ArrayList<Data> getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage = this.apiMessage;
        int iHashCode = (apiMessage == null ? 0 : apiMessage.hashCode()) * 31;
        ArrayList<Data> arrayList = this.data;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "TOPurposeResponseData(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
