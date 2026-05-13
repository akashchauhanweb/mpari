package com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.ApiMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitDetailModal;", "", "apiMessage", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/ApiMessage;", "data", "Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitDetailDataModal;", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/ApiMessage;Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitDetailDataModal;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/ApiMessage;", "getData", "()Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitDetailDataModal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermitDetailModal {
    private final ApiMessage apiMessage;
    private final PermitDetailDataModal data;

    public PermitDetailModal(ApiMessage apiMessage, PermitDetailDataModal data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ PermitDetailModal copy$default(PermitDetailModal permitDetailModal, ApiMessage apiMessage, PermitDetailDataModal permitDetailDataModal, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = permitDetailModal.apiMessage;
        }
        if ((i & 2) != 0) {
            permitDetailDataModal = permitDetailModal.data;
        }
        return permitDetailModal.copy(apiMessage, permitDetailDataModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PermitDetailDataModal getData() {
        return this.data;
    }

    public final PermitDetailModal copy(ApiMessage apiMessage, PermitDetailDataModal data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new PermitDetailModal(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermitDetailModal)) {
            return false;
        }
        PermitDetailModal permitDetailModal = (PermitDetailModal) other;
        return Intrinsics.areEqual(this.apiMessage, permitDetailModal.apiMessage) && Intrinsics.areEqual(this.data, permitDetailModal.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final PermitDetailDataModal getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage = this.apiMessage;
        return ((apiMessage == null ? 0 : apiMessage.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "PermitDetailModal(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
