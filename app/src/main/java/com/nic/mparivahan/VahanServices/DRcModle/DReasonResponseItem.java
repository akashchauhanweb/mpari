package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DRcModle/DReasonResponseItem;", "", "reason_desc", "", "vmServiceReasonEntityById", "Lcom/nic/mparivahan/VahanServices/DRcModle/VmServiceReasonEntityById;", "(Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/DRcModle/VmServiceReasonEntityById;)V", "getReason_desc", "()Ljava/lang/String;", "getVmServiceReasonEntityById", "()Lcom/nic/mparivahan/VahanServices/DRcModle/VmServiceReasonEntityById;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DReasonResponseItem {
    private final String reason_desc;
    private final VmServiceReasonEntityById vmServiceReasonEntityById;

    public DReasonResponseItem(String str, VmServiceReasonEntityById vmServiceReasonEntityById) {
        this.reason_desc = str;
        this.vmServiceReasonEntityById = vmServiceReasonEntityById;
    }

    public static /* synthetic */ DReasonResponseItem copy$default(DReasonResponseItem dReasonResponseItem, String str, VmServiceReasonEntityById vmServiceReasonEntityById, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dReasonResponseItem.reason_desc;
        }
        if ((i & 2) != 0) {
            vmServiceReasonEntityById = dReasonResponseItem.vmServiceReasonEntityById;
        }
        return dReasonResponseItem.copy(str, vmServiceReasonEntityById);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReason_desc() {
        return this.reason_desc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VmServiceReasonEntityById getVmServiceReasonEntityById() {
        return this.vmServiceReasonEntityById;
    }

    public final DReasonResponseItem copy(String reason_desc, VmServiceReasonEntityById vmServiceReasonEntityById) {
        return new DReasonResponseItem(reason_desc, vmServiceReasonEntityById);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DReasonResponseItem)) {
            return false;
        }
        DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) other;
        return Intrinsics.areEqual(this.reason_desc, dReasonResponseItem.reason_desc) && Intrinsics.areEqual(this.vmServiceReasonEntityById, dReasonResponseItem.vmServiceReasonEntityById);
    }

    public final String getReason_desc() {
        return this.reason_desc;
    }

    public final VmServiceReasonEntityById getVmServiceReasonEntityById() {
        return this.vmServiceReasonEntityById;
    }

    public int hashCode() {
        String str = this.reason_desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        VmServiceReasonEntityById vmServiceReasonEntityById = this.vmServiceReasonEntityById;
        return iHashCode + (vmServiceReasonEntityById != null ? vmServiceReasonEntityById.hashCode() : 0);
    }

    public String toString() {
        return "DReasonResponseItem(reason_desc=" + this.reason_desc + ", vmServiceReasonEntityById=" + this.vmServiceReasonEntityById + ')';
    }
}
