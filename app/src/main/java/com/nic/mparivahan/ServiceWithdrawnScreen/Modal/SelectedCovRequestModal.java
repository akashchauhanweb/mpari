package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/SelectedCovRequestModal;", "", "confirmation", "", "remarks", "appliedService", "appliedCov", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppliedCov", "()Ljava/lang/String;", "getAppliedService", "getConfirmation", "getRemarks", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SelectedCovRequestModal {
    private final String appliedCov;
    private final String appliedService;
    private final String confirmation;
    private final String remarks;
    private final String status;

    public SelectedCovRequestModal(String confirmation, String remarks, String appliedService, String appliedCov, String status) {
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(appliedService, "appliedService");
        Intrinsics.checkNotNullParameter(appliedCov, "appliedCov");
        Intrinsics.checkNotNullParameter(status, "status");
        this.confirmation = confirmation;
        this.remarks = remarks;
        this.appliedService = appliedService;
        this.appliedCov = appliedCov;
        this.status = status;
    }

    public static /* synthetic */ SelectedCovRequestModal copy$default(SelectedCovRequestModal selectedCovRequestModal, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedCovRequestModal.confirmation;
        }
        if ((i & 2) != 0) {
            str2 = selectedCovRequestModal.remarks;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = selectedCovRequestModal.appliedService;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = selectedCovRequestModal.appliedCov;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = selectedCovRequestModal.status;
        }
        return selectedCovRequestModal.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConfirmation() {
        return this.confirmation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppliedService() {
        return this.appliedService;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppliedCov() {
        return this.appliedCov;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final SelectedCovRequestModal copy(String confirmation, String remarks, String appliedService, String appliedCov, String status) {
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(appliedService, "appliedService");
        Intrinsics.checkNotNullParameter(appliedCov, "appliedCov");
        Intrinsics.checkNotNullParameter(status, "status");
        return new SelectedCovRequestModal(confirmation, remarks, appliedService, appliedCov, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedCovRequestModal)) {
            return false;
        }
        SelectedCovRequestModal selectedCovRequestModal = (SelectedCovRequestModal) other;
        return Intrinsics.areEqual(this.confirmation, selectedCovRequestModal.confirmation) && Intrinsics.areEqual(this.remarks, selectedCovRequestModal.remarks) && Intrinsics.areEqual(this.appliedService, selectedCovRequestModal.appliedService) && Intrinsics.areEqual(this.appliedCov, selectedCovRequestModal.appliedCov) && Intrinsics.areEqual(this.status, selectedCovRequestModal.status);
    }

    public final String getAppliedCov() {
        return this.appliedCov;
    }

    public final String getAppliedService() {
        return this.appliedService;
    }

    public final String getConfirmation() {
        return this.confirmation;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.confirmation.hashCode() * 31) + this.remarks.hashCode()) * 31) + this.appliedService.hashCode()) * 31) + this.appliedCov.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SelectedCovRequestModal(confirmation=" + this.confirmation + ", remarks=" + this.remarks + ", appliedService=" + this.appliedService + ", appliedCov=" + this.appliedCov + ", status=" + this.status + ')';
    }
}
