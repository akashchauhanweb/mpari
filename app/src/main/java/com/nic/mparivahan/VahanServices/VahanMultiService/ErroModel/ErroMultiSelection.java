package com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/ErroModel/ErroMultiSelection;", "", "apiMessage", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/ErroModel/ApiMessage;", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/ErroModel/ApiMessage;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/ErroModel/ApiMessage;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ErroMultiSelection {
    private final ApiMessage apiMessage;

    public ErroMultiSelection(ApiMessage apiMessage) {
        this.apiMessage = apiMessage;
    }

    public static /* synthetic */ ErroMultiSelection copy$default(ErroMultiSelection erroMultiSelection, ApiMessage apiMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = erroMultiSelection.apiMessage;
        }
        return erroMultiSelection.copy(apiMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final ErroMultiSelection copy(ApiMessage apiMessage) {
        return new ErroMultiSelection(apiMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ErroMultiSelection) && Intrinsics.areEqual(this.apiMessage, ((ErroMultiSelection) other).apiMessage);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public int hashCode() {
        ApiMessage apiMessage = this.apiMessage;
        if (apiMessage == null) {
            return 0;
        }
        return apiMessage.hashCode();
    }

    public String toString() {
        return "ErroMultiSelection(apiMessage=" + this.apiMessage + ')';
    }
}
