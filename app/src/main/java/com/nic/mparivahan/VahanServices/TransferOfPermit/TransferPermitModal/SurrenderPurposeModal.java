package com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.ApiMessage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/SurrenderPurposeModal;", "", "apiMessage", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/ApiMessage;", "data", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/SurrenderPurposeDetailModal;", "Lkotlin/collections/ArrayList;", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/ApiMessage;Ljava/util/ArrayList;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/FeeModel/ApiMessage;", "getData", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SurrenderPurposeModal {
    private final ApiMessage apiMessage;
    private final ArrayList<SurrenderPurposeDetailModal> data;

    public SurrenderPurposeModal(ApiMessage apiMessage, ArrayList<SurrenderPurposeDetailModal> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.apiMessage = apiMessage;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurrenderPurposeModal copy$default(SurrenderPurposeModal surrenderPurposeModal, ApiMessage apiMessage, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = surrenderPurposeModal.apiMessage;
        }
        if ((i & 2) != 0) {
            arrayList = surrenderPurposeModal.data;
        }
        return surrenderPurposeModal.copy(apiMessage, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final ArrayList<SurrenderPurposeDetailModal> component2() {
        return this.data;
    }

    public final SurrenderPurposeModal copy(ApiMessage apiMessage, ArrayList<SurrenderPurposeDetailModal> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new SurrenderPurposeModal(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurrenderPurposeModal)) {
            return false;
        }
        SurrenderPurposeModal surrenderPurposeModal = (SurrenderPurposeModal) other;
        return Intrinsics.areEqual(this.apiMessage, surrenderPurposeModal.apiMessage) && Intrinsics.areEqual(this.data, surrenderPurposeModal.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final ArrayList<SurrenderPurposeDetailModal> getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage = this.apiMessage;
        return ((apiMessage == null ? 0 : apiMessage.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "SurrenderPurposeModal(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
