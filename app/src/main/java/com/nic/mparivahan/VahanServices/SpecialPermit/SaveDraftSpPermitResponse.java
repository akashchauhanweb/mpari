package com.nic.mparivahan.VahanServices.SpecialPermit;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/SpecialPermit/SaveDraftSpPermitResponse;", "Ljava/io/Serializable;", "apiMessage", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/ApiMessage;", "data", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/ApiMessage;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/ApiMessage;", "getData", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SaveDraftSpPermitResponse implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public SaveDraftSpPermitResponse(ApiMessage apiMessage, Data data) {
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ SaveDraftSpPermitResponse copy$default(SaveDraftSpPermitResponse saveDraftSpPermitResponse, ApiMessage apiMessage, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = saveDraftSpPermitResponse.apiMessage;
        }
        if ((i & 2) != 0) {
            data = saveDraftSpPermitResponse.data;
        }
        return saveDraftSpPermitResponse.copy(apiMessage, data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final SaveDraftSpPermitResponse copy(ApiMessage apiMessage, Data data) {
        return new SaveDraftSpPermitResponse(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveDraftSpPermitResponse)) {
            return false;
        }
        SaveDraftSpPermitResponse saveDraftSpPermitResponse = (SaveDraftSpPermitResponse) other;
        return Intrinsics.areEqual(this.apiMessage, saveDraftSpPermitResponse.apiMessage) && Intrinsics.areEqual(this.data, saveDraftSpPermitResponse.data);
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
        return "SaveDraftSpPermitResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
