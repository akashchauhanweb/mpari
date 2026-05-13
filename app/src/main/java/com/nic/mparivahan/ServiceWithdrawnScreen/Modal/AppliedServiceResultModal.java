package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/AppliedServiceResultModal;", "", "previousWithDrawn", "", "appliedService", "appliedCov", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppliedCov", "()Ljava/lang/String;", "getAppliedService", "getPreviousWithDrawn", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AppliedServiceResultModal {

    @xy5("Applied Cov")
    private final String appliedCov;

    @xy5("Applied Service")
    private final String appliedService;

    @xy5("Previous Withdrawn ")
    private final String previousWithDrawn;

    @xy5("status")
    private final String status;

    public AppliedServiceResultModal() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AppliedServiceResultModal copy$default(AppliedServiceResultModal appliedServiceResultModal, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appliedServiceResultModal.previousWithDrawn;
        }
        if ((i & 2) != 0) {
            str2 = appliedServiceResultModal.appliedService;
        }
        if ((i & 4) != 0) {
            str3 = appliedServiceResultModal.appliedCov;
        }
        if ((i & 8) != 0) {
            str4 = appliedServiceResultModal.status;
        }
        return appliedServiceResultModal.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPreviousWithDrawn() {
        return this.previousWithDrawn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppliedService() {
        return this.appliedService;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppliedCov() {
        return this.appliedCov;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final AppliedServiceResultModal copy(String previousWithDrawn, String appliedService, String appliedCov, String status) {
        Intrinsics.checkNotNullParameter(previousWithDrawn, "previousWithDrawn");
        Intrinsics.checkNotNullParameter(appliedService, "appliedService");
        Intrinsics.checkNotNullParameter(appliedCov, "appliedCov");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AppliedServiceResultModal(previousWithDrawn, appliedService, appliedCov, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppliedServiceResultModal)) {
            return false;
        }
        AppliedServiceResultModal appliedServiceResultModal = (AppliedServiceResultModal) other;
        return Intrinsics.areEqual(this.previousWithDrawn, appliedServiceResultModal.previousWithDrawn) && Intrinsics.areEqual(this.appliedService, appliedServiceResultModal.appliedService) && Intrinsics.areEqual(this.appliedCov, appliedServiceResultModal.appliedCov) && Intrinsics.areEqual(this.status, appliedServiceResultModal.status);
    }

    public final String getAppliedCov() {
        return this.appliedCov;
    }

    public final String getAppliedService() {
        return this.appliedService;
    }

    public final String getPreviousWithDrawn() {
        return this.previousWithDrawn;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.previousWithDrawn.hashCode() * 31) + this.appliedService.hashCode()) * 31) + this.appliedCov.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "AppliedServiceResultModal(previousWithDrawn=" + this.previousWithDrawn + ", appliedService=" + this.appliedService + ", appliedCov=" + this.appliedCov + ", status=" + this.status + ')';
    }

    public AppliedServiceResultModal(String previousWithDrawn, String appliedService, String appliedCov, String status) {
        Intrinsics.checkNotNullParameter(previousWithDrawn, "previousWithDrawn");
        Intrinsics.checkNotNullParameter(appliedService, "appliedService");
        Intrinsics.checkNotNullParameter(appliedCov, "appliedCov");
        Intrinsics.checkNotNullParameter(status, "status");
        this.previousWithDrawn = previousWithDrawn;
        this.appliedService = appliedService;
        this.appliedCov = appliedCov;
        this.status = status;
    }

    public /* synthetic */ AppliedServiceResultModal(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
