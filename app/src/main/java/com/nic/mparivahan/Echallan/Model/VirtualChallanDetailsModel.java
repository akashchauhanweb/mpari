package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/Echallan/Model/VirtualChallanDetailsModel;", "", "status", "", "result", "Lcom/nic/mparivahan/Echallan/Model/VirtualChallanResultModel;", "(Ljava/lang/String;Lcom/nic/mparivahan/Echallan/Model/VirtualChallanResultModel;)V", "getResult", "()Lcom/nic/mparivahan/Echallan/Model/VirtualChallanResultModel;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VirtualChallanDetailsModel {
    private final VirtualChallanResultModel result;
    private final String status;

    public VirtualChallanDetailsModel(String status, VirtualChallanResultModel result) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(result, "result");
        this.status = status;
        this.result = result;
    }

    public static /* synthetic */ VirtualChallanDetailsModel copy$default(VirtualChallanDetailsModel virtualChallanDetailsModel, String str, VirtualChallanResultModel virtualChallanResultModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = virtualChallanDetailsModel.status;
        }
        if ((i & 2) != 0) {
            virtualChallanResultModel = virtualChallanDetailsModel.result;
        }
        return virtualChallanDetailsModel.copy(str, virtualChallanResultModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VirtualChallanResultModel getResult() {
        return this.result;
    }

    public final VirtualChallanDetailsModel copy(String status, VirtualChallanResultModel result) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(result, "result");
        return new VirtualChallanDetailsModel(status, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VirtualChallanDetailsModel)) {
            return false;
        }
        VirtualChallanDetailsModel virtualChallanDetailsModel = (VirtualChallanDetailsModel) other;
        return Intrinsics.areEqual(this.status, virtualChallanDetailsModel.status) && Intrinsics.areEqual(this.result, virtualChallanDetailsModel.result);
    }

    public final VirtualChallanResultModel getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.result.hashCode();
    }

    public String toString() {
        return "VirtualChallanDetailsModel(status=" + this.status + ", result=" + this.result + ')';
    }
}
