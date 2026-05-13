package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/TempDetailsModel;", "Ljava/io/Serializable;", "apiMessage", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/ApiMessage;", "data", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Data;", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/ApiMessage;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Data;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/ApiMessage;", "getData", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Data;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TempDetailsModel implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public TempDetailsModel(ApiMessage apiMessage, Data data) {
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ TempDetailsModel copy$default(TempDetailsModel tempDetailsModel, ApiMessage apiMessage, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = tempDetailsModel.apiMessage;
        }
        if ((i & 2) != 0) {
            data = tempDetailsModel.data;
        }
        return tempDetailsModel.copy(apiMessage, data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final TempDetailsModel copy(ApiMessage apiMessage, Data data) {
        return new TempDetailsModel(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TempDetailsModel)) {
            return false;
        }
        TempDetailsModel tempDetailsModel = (TempDetailsModel) other;
        return Intrinsics.areEqual(this.apiMessage, tempDetailsModel.apiMessage) && Intrinsics.areEqual(this.data, tempDetailsModel.data);
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
        return "TempDetailsModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
