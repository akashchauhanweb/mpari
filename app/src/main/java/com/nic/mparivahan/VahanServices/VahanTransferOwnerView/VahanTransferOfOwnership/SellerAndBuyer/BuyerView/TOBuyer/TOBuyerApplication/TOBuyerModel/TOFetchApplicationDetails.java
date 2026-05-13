package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "Ljava/io/Serializable;", "apiMessage", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/ApiMessageX;", "data", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/DataX;", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/ApiMessageX;Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/DataX;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/ApiMessageX;", "getData", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/DataX;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TOFetchApplicationDetails implements Serializable {
    private final ApiMessageX apiMessage;
    private final DataX data;

    public TOFetchApplicationDetails(ApiMessageX apiMessageX, DataX dataX) {
        this.apiMessage = apiMessageX;
        this.data = dataX;
    }

    public static /* synthetic */ TOFetchApplicationDetails copy$default(TOFetchApplicationDetails tOFetchApplicationDetails, ApiMessageX apiMessageX, DataX dataX, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessageX = tOFetchApplicationDetails.apiMessage;
        }
        if ((i & 2) != 0) {
            dataX = tOFetchApplicationDetails.data;
        }
        return tOFetchApplicationDetails.copy(apiMessageX, dataX);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessageX getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataX getData() {
        return this.data;
    }

    public final TOFetchApplicationDetails copy(ApiMessageX apiMessage, DataX data) {
        return new TOFetchApplicationDetails(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TOFetchApplicationDetails)) {
            return false;
        }
        TOFetchApplicationDetails tOFetchApplicationDetails = (TOFetchApplicationDetails) other;
        return Intrinsics.areEqual(this.apiMessage, tOFetchApplicationDetails.apiMessage) && Intrinsics.areEqual(this.data, tOFetchApplicationDetails.data);
    }

    public final ApiMessageX getApiMessage() {
        return this.apiMessage;
    }

    public final DataX getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessageX apiMessageX = this.apiMessage;
        int iHashCode = (apiMessageX == null ? 0 : apiMessageX.hashCode()) * 31;
        DataX dataX = this.data;
        return iHashCode + (dataX != null ? dataX.hashCode() : 0);
    }

    public String toString() {
        return "TOFetchApplicationDetails(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
