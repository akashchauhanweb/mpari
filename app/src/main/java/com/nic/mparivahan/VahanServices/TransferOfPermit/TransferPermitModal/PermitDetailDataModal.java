package com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitDetailDataModal;", "", "vtPermit", "Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/VtPermitModal;", "homeAuth", "Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitHomeAuthModal;", "(Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/VtPermitModal;Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitHomeAuthModal;)V", "getHomeAuth", "()Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/PermitHomeAuthModal;", "getVtPermit", "()Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/VtPermitModal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermitDetailDataModal {
    private final PermitHomeAuthModal homeAuth;
    private final VtPermitModal vtPermit;

    public PermitDetailDataModal(VtPermitModal vtPermit, PermitHomeAuthModal homeAuth) {
        Intrinsics.checkNotNullParameter(vtPermit, "vtPermit");
        Intrinsics.checkNotNullParameter(homeAuth, "homeAuth");
        this.vtPermit = vtPermit;
        this.homeAuth = homeAuth;
    }

    public static /* synthetic */ PermitDetailDataModal copy$default(PermitDetailDataModal permitDetailDataModal, VtPermitModal vtPermitModal, PermitHomeAuthModal permitHomeAuthModal, int i, Object obj) {
        if ((i & 1) != 0) {
            vtPermitModal = permitDetailDataModal.vtPermit;
        }
        if ((i & 2) != 0) {
            permitHomeAuthModal = permitDetailDataModal.homeAuth;
        }
        return permitDetailDataModal.copy(vtPermitModal, permitHomeAuthModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VtPermitModal getVtPermit() {
        return this.vtPermit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PermitHomeAuthModal getHomeAuth() {
        return this.homeAuth;
    }

    public final PermitDetailDataModal copy(VtPermitModal vtPermit, PermitHomeAuthModal homeAuth) {
        Intrinsics.checkNotNullParameter(vtPermit, "vtPermit");
        Intrinsics.checkNotNullParameter(homeAuth, "homeAuth");
        return new PermitDetailDataModal(vtPermit, homeAuth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermitDetailDataModal)) {
            return false;
        }
        PermitDetailDataModal permitDetailDataModal = (PermitDetailDataModal) other;
        return Intrinsics.areEqual(this.vtPermit, permitDetailDataModal.vtPermit) && Intrinsics.areEqual(this.homeAuth, permitDetailDataModal.homeAuth);
    }

    public final PermitHomeAuthModal getHomeAuth() {
        return this.homeAuth;
    }

    public final VtPermitModal getVtPermit() {
        return this.vtPermit;
    }

    public int hashCode() {
        return (this.vtPermit.hashCode() * 31) + this.homeAuth.hashCode();
    }

    public String toString() {
        return "PermitDetailDataModal(vtPermit=" + this.vtPermit + ", homeAuth=" + this.homeAuth + ')';
    }
}
