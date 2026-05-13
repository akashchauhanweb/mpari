package com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/RCCancellationResponse;", "Ljava/io/Serializable;", "apiMessage", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/ApiMessage;", "data", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/ApiMessage;Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/ApiMessage;", "getData", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RCCancellationResponse implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public RCCancellationResponse(ApiMessage apiMessage, Data data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ RCCancellationResponse copy$default(RCCancellationResponse rCCancellationResponse, ApiMessage apiMessage, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = rCCancellationResponse.apiMessage;
        }
        if ((i & 2) != 0) {
            data = rCCancellationResponse.data;
        }
        return rCCancellationResponse.copy(apiMessage, data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final RCCancellationResponse copy(ApiMessage apiMessage, Data data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        return new RCCancellationResponse(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RCCancellationResponse)) {
            return false;
        }
        RCCancellationResponse rCCancellationResponse = (RCCancellationResponse) other;
        return Intrinsics.areEqual(this.apiMessage, rCCancellationResponse.apiMessage) && Intrinsics.areEqual(this.data, rCCancellationResponse.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "RCCancellationResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
