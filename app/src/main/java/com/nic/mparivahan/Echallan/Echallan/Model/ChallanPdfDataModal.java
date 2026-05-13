package com.nic.mparivahan.Echallan.Echallan.Model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanPdfDataModal;", "", "status", "", "message", "", "results", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanPdfResultModal;", "(ILjava/lang/String;Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanPdfResultModal;)V", "getMessage", "()Ljava/lang/String;", "getResults", "()Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanPdfResultModal;", "getStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallanPdfDataModal {

    @xy5("message")
    private final String message;

    @xy5("results")
    private final ChallanPdfResultModal results;

    @xy5("status")
    private final int status;

    public ChallanPdfDataModal(int i, String message, ChallanPdfResultModal results) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(results, "results");
        this.status = i;
        this.message = message;
        this.results = results;
    }

    public static /* synthetic */ ChallanPdfDataModal copy$default(ChallanPdfDataModal challanPdfDataModal, int i, String str, ChallanPdfResultModal challanPdfResultModal, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = challanPdfDataModal.status;
        }
        if ((i2 & 2) != 0) {
            str = challanPdfDataModal.message;
        }
        if ((i2 & 4) != 0) {
            challanPdfResultModal = challanPdfDataModal.results;
        }
        return challanPdfDataModal.copy(i, str, challanPdfResultModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChallanPdfResultModal getResults() {
        return this.results;
    }

    public final ChallanPdfDataModal copy(int status, String message, ChallanPdfResultModal results) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(results, "results");
        return new ChallanPdfDataModal(status, message, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallanPdfDataModal)) {
            return false;
        }
        ChallanPdfDataModal challanPdfDataModal = (ChallanPdfDataModal) other;
        return this.status == challanPdfDataModal.status && Intrinsics.areEqual(this.message, challanPdfDataModal.message) && Intrinsics.areEqual(this.results, challanPdfDataModal.results);
    }

    public final String getMessage() {
        return this.message;
    }

    public final ChallanPdfResultModal getResults() {
        return this.results;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.message.hashCode()) * 31) + this.results.hashCode();
    }

    public String toString() {
        return "ChallanPdfDataModal(status=" + this.status + ", message=" + this.message + ", results=" + this.results + ')';
    }

    public /* synthetic */ ChallanPdfDataModal(int i, String str, ChallanPdfResultModal challanPdfResultModal, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, challanPdfResultModal);
    }
}
