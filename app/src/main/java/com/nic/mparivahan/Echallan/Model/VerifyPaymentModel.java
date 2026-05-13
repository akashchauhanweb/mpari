package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/Echallan/Model/VerifyPaymentModel;", "", "status", "", "message", "reason", "pgiUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getPgiUrl", "setPgiUrl", "getReason", "setReason", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VerifyPaymentModel {

    @xy5("message")
    private String message;

    @xy5("pgi_url")
    private String pgiUrl;

    @xy5("reason")
    private String reason;

    @xy5("status")
    private String status;

    public VerifyPaymentModel(String status, String message, String reason, String pgiUrl) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(pgiUrl, "pgiUrl");
        this.status = status;
        this.message = message;
        this.reason = reason;
        this.pgiUrl = pgiUrl;
    }

    public static /* synthetic */ VerifyPaymentModel copy$default(VerifyPaymentModel verifyPaymentModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyPaymentModel.status;
        }
        if ((i & 2) != 0) {
            str2 = verifyPaymentModel.message;
        }
        if ((i & 4) != 0) {
            str3 = verifyPaymentModel.reason;
        }
        if ((i & 8) != 0) {
            str4 = verifyPaymentModel.pgiUrl;
        }
        return verifyPaymentModel.copy(str, str2, str3, str4);
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
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPgiUrl() {
        return this.pgiUrl;
    }

    public final VerifyPaymentModel copy(String status, String message, String reason, String pgiUrl) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(pgiUrl, "pgiUrl");
        return new VerifyPaymentModel(status, message, reason, pgiUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPaymentModel)) {
            return false;
        }
        VerifyPaymentModel verifyPaymentModel = (VerifyPaymentModel) other;
        return Intrinsics.areEqual(this.status, verifyPaymentModel.status) && Intrinsics.areEqual(this.message, verifyPaymentModel.message) && Intrinsics.areEqual(this.reason, verifyPaymentModel.reason) && Intrinsics.areEqual(this.pgiUrl, verifyPaymentModel.pgiUrl);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPgiUrl() {
        return this.pgiUrl;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.pgiUrl.hashCode();
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setPgiUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pgiUrl = str;
    }

    public final void setReason(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reason = str;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public String toString() {
        return "VerifyPaymentModel(status=" + this.status + ", message=" + this.message + ", reason=" + this.reason + ", pgiUrl=" + this.pgiUrl + ')';
    }

    public /* synthetic */ VerifyPaymentModel(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
