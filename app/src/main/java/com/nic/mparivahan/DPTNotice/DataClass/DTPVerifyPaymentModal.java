package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/DataClass/DTPVerifyPaymentModal;", "", "status", "", "message", "resason", "pgiUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPgiUrl", "getResason", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DTPVerifyPaymentModal {

    @xy5("message")
    private final String message;

    @xy5("pgi_url")
    private final String pgiUrl;

    @xy5("reason")
    private final String resason;

    @xy5("status")
    private final String status;

    public DTPVerifyPaymentModal() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DTPVerifyPaymentModal copy$default(DTPVerifyPaymentModal dTPVerifyPaymentModal, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dTPVerifyPaymentModal.status;
        }
        if ((i & 2) != 0) {
            str2 = dTPVerifyPaymentModal.message;
        }
        if ((i & 4) != 0) {
            str3 = dTPVerifyPaymentModal.resason;
        }
        if ((i & 8) != 0) {
            str4 = dTPVerifyPaymentModal.pgiUrl;
        }
        return dTPVerifyPaymentModal.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResason() {
        return this.resason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPgiUrl() {
        return this.pgiUrl;
    }

    public final DTPVerifyPaymentModal copy(String status, String message, String resason, String pgiUrl) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(resason, "resason");
        Intrinsics.checkNotNullParameter(pgiUrl, "pgiUrl");
        return new DTPVerifyPaymentModal(status, message, resason, pgiUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DTPVerifyPaymentModal)) {
            return false;
        }
        DTPVerifyPaymentModal dTPVerifyPaymentModal = (DTPVerifyPaymentModal) other;
        return Intrinsics.areEqual(this.status, dTPVerifyPaymentModal.status) && Intrinsics.areEqual(this.message, dTPVerifyPaymentModal.message) && Intrinsics.areEqual(this.resason, dTPVerifyPaymentModal.resason) && Intrinsics.areEqual(this.pgiUrl, dTPVerifyPaymentModal.pgiUrl);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPgiUrl() {
        return this.pgiUrl;
    }

    public final String getResason() {
        return this.resason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.resason.hashCode()) * 31) + this.pgiUrl.hashCode();
    }

    public String toString() {
        return "DTPVerifyPaymentModal(status=" + this.status + ", message=" + this.message + ", resason=" + this.resason + ", pgiUrl=" + this.pgiUrl + ')';
    }

    public DTPVerifyPaymentModal(String status, String message, String resason, String pgiUrl) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(resason, "resason");
        Intrinsics.checkNotNullParameter(pgiUrl, "pgiUrl");
        this.status = status;
        this.message = message;
        this.resason = resason;
        this.pgiUrl = pgiUrl;
    }

    public /* synthetic */ DTPVerifyPaymentModal(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
