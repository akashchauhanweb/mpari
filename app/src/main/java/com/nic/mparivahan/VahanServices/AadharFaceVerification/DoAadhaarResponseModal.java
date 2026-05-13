package com.nic.mparivahan.VahanServices.AadharFaceVerification;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoAadhaarResponseModal;", "Ljava/io/Serializable;", "status", "", "dOEkyc", "Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoEkycResponseModal;", "(Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoEkycResponseModal;)V", "getDOEkyc", "()Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoEkycResponseModal;", "setDOEkyc", "(Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoEkycResponseModal;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DoAadhaarResponseModal implements Serializable {
    private DoEkycResponseModal dOEkyc;
    private String status;

    public DoAadhaarResponseModal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DoAadhaarResponseModal copy$default(DoAadhaarResponseModal doAadhaarResponseModal, String str, DoEkycResponseModal doEkycResponseModal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = doAadhaarResponseModal.status;
        }
        if ((i & 2) != 0) {
            doEkycResponseModal = doAadhaarResponseModal.dOEkyc;
        }
        return doAadhaarResponseModal.copy(str, doEkycResponseModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DoEkycResponseModal getDOEkyc() {
        return this.dOEkyc;
    }

    public final DoAadhaarResponseModal copy(String status, DoEkycResponseModal dOEkyc) {
        return new DoAadhaarResponseModal(status, dOEkyc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoAadhaarResponseModal)) {
            return false;
        }
        DoAadhaarResponseModal doAadhaarResponseModal = (DoAadhaarResponseModal) other;
        return Intrinsics.areEqual(this.status, doAadhaarResponseModal.status) && Intrinsics.areEqual(this.dOEkyc, doAadhaarResponseModal.dOEkyc);
    }

    public final DoEkycResponseModal getDOEkyc() {
        return this.dOEkyc;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DoEkycResponseModal doEkycResponseModal = this.dOEkyc;
        return iHashCode + (doEkycResponseModal != null ? doEkycResponseModal.hashCode() : 0);
    }

    public final void setDOEkyc(DoEkycResponseModal doEkycResponseModal) {
        this.dOEkyc = doEkycResponseModal;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "DoAadhaarResponseModal(status=" + this.status + ", dOEkyc=" + this.dOEkyc + ')';
    }

    public DoAadhaarResponseModal(String str, DoEkycResponseModal doEkycResponseModal) {
        this.status = str;
        this.dOEkyc = doEkycResponseModal;
    }

    public /* synthetic */ DoAadhaarResponseModal(String str, DoEkycResponseModal doEkycResponseModal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : doEkycResponseModal);
    }
}
