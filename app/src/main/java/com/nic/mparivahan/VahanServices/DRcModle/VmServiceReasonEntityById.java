package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DRcModle/VmServiceReasonEntityById;", "", "pur_cd", "", "reason_cd", "(Ljava/lang/String;Ljava/lang/String;)V", "getPur_cd", "()Ljava/lang/String;", "getReason_cd", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VmServiceReasonEntityById {
    private final String pur_cd;
    private final String reason_cd;

    public VmServiceReasonEntityById(String pur_cd, String reason_cd) {
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(reason_cd, "reason_cd");
        this.pur_cd = pur_cd;
        this.reason_cd = reason_cd;
    }

    public static /* synthetic */ VmServiceReasonEntityById copy$default(VmServiceReasonEntityById vmServiceReasonEntityById, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmServiceReasonEntityById.pur_cd;
        }
        if ((i & 2) != 0) {
            str2 = vmServiceReasonEntityById.reason_cd;
        }
        return vmServiceReasonEntityById.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason_cd() {
        return this.reason_cd;
    }

    public final VmServiceReasonEntityById copy(String pur_cd, String reason_cd) {
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(reason_cd, "reason_cd");
        return new VmServiceReasonEntityById(pur_cd, reason_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VmServiceReasonEntityById)) {
            return false;
        }
        VmServiceReasonEntityById vmServiceReasonEntityById = (VmServiceReasonEntityById) other;
        return Intrinsics.areEqual(this.pur_cd, vmServiceReasonEntityById.pur_cd) && Intrinsics.areEqual(this.reason_cd, vmServiceReasonEntityById.reason_cd);
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getReason_cd() {
        return this.reason_cd;
    }

    public int hashCode() {
        return (this.pur_cd.hashCode() * 31) + this.reason_cd.hashCode();
    }

    public String toString() {
        return "VmServiceReasonEntityById(pur_cd=" + this.pur_cd + ", reason_cd=" + this.reason_cd + ')';
    }
}
