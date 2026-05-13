package com.nic.mparivahan.VahanServices.AadharFaceVerification;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/AadharFaceSuccessResponseModal;", "Ljava/io/Serializable;", "doAadhaarResponse", "Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoAadhaarResponseModal;", "(Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoAadhaarResponseModal;)V", "getDoAadhaarResponse", "()Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoAadhaarResponseModal;", "setDoAadhaarResponse", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AadharFaceSuccessResponseModal implements Serializable {
    private DoAadhaarResponseModal doAadhaarResponse;

    public AadharFaceSuccessResponseModal() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AadharFaceSuccessResponseModal copy$default(AadharFaceSuccessResponseModal aadharFaceSuccessResponseModal, DoAadhaarResponseModal doAadhaarResponseModal, int i, Object obj) {
        if ((i & 1) != 0) {
            doAadhaarResponseModal = aadharFaceSuccessResponseModal.doAadhaarResponse;
        }
        return aadharFaceSuccessResponseModal.copy(doAadhaarResponseModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DoAadhaarResponseModal getDoAadhaarResponse() {
        return this.doAadhaarResponse;
    }

    public final AadharFaceSuccessResponseModal copy(DoAadhaarResponseModal doAadhaarResponse) {
        return new AadharFaceSuccessResponseModal(doAadhaarResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AadharFaceSuccessResponseModal) && Intrinsics.areEqual(this.doAadhaarResponse, ((AadharFaceSuccessResponseModal) other).doAadhaarResponse);
    }

    public final DoAadhaarResponseModal getDoAadhaarResponse() {
        return this.doAadhaarResponse;
    }

    public int hashCode() {
        DoAadhaarResponseModal doAadhaarResponseModal = this.doAadhaarResponse;
        if (doAadhaarResponseModal == null) {
            return 0;
        }
        return doAadhaarResponseModal.hashCode();
    }

    public final void setDoAadhaarResponse(DoAadhaarResponseModal doAadhaarResponseModal) {
        this.doAadhaarResponse = doAadhaarResponseModal;
    }

    public String toString() {
        return "AadharFaceSuccessResponseModal(doAadhaarResponse=" + this.doAadhaarResponse + ')';
    }

    public AadharFaceSuccessResponseModal(DoAadhaarResponseModal doAadhaarResponseModal) {
        this.doAadhaarResponse = doAadhaarResponseModal;
    }

    public /* synthetic */ AadharFaceSuccessResponseModal(DoAadhaarResponseModal doAadhaarResponseModal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : doAadhaarResponseModal);
    }
}
