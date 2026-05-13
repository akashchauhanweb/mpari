package com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCModel/DFCModel;", "", "apiMessage", "Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCModel/ApiMessage;", "data", "", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCModel/ApiMessage;Ljava/lang/String;)V", "getApiMessage", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCModel/ApiMessage;", "getData", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DFCModel {
    private final ApiMessage apiMessage;
    private final String data;

    public DFCModel(ApiMessage apiMessage, String data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        this.apiMessage = apiMessage;
        this.data = data;
    }

    public static /* synthetic */ DFCModel copy$default(DFCModel dFCModel, ApiMessage apiMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMessage = dFCModel.apiMessage;
        }
        if ((i & 2) != 0) {
            str = dFCModel.data;
        }
        return dFCModel.copy(apiMessage, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final DFCModel copy(ApiMessage apiMessage, String data) {
        Intrinsics.checkNotNullParameter(apiMessage, "apiMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        return new DFCModel(apiMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DFCModel)) {
            return false;
        }
        DFCModel dFCModel = (DFCModel) other;
        return Intrinsics.areEqual(this.apiMessage, dFCModel.apiMessage) && Intrinsics.areEqual(this.data, dFCModel.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "DFCModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
