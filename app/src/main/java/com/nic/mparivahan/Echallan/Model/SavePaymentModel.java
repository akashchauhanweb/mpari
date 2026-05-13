package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/Echallan/Model/SavePaymentModel;", "", "status", "", "message", "reason", "pageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPageUrl", "getReason", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SavePaymentModel {

    @xy5("message")
    private final String message;

    @xy5("pgi_url")
    private final String pageUrl;

    @xy5("reason")
    private final String reason;

    @xy5("status")
    private final String status;

    public SavePaymentModel(String status, String message, String reason, String pageUrl) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        this.status = status;
        this.message = message;
        this.reason = reason;
        this.pageUrl = pageUrl;
    }

    public static /* synthetic */ SavePaymentModel copy$default(SavePaymentModel savePaymentModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savePaymentModel.status;
        }
        if ((i & 2) != 0) {
            str2 = savePaymentModel.message;
        }
        if ((i & 4) != 0) {
            str3 = savePaymentModel.reason;
        }
        if ((i & 8) != 0) {
            str4 = savePaymentModel.pageUrl;
        }
        return savePaymentModel.copy(str, str2, str3, str4);
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
    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final SavePaymentModel copy(String status, String message, String reason, String pageUrl) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        return new SavePaymentModel(status, message, reason, pageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavePaymentModel)) {
            return false;
        }
        SavePaymentModel savePaymentModel = (SavePaymentModel) other;
        return Intrinsics.areEqual(this.status, savePaymentModel.status) && Intrinsics.areEqual(this.message, savePaymentModel.message) && Intrinsics.areEqual(this.reason, savePaymentModel.reason) && Intrinsics.areEqual(this.pageUrl, savePaymentModel.pageUrl);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.pageUrl.hashCode();
    }

    public String toString() {
        return "SavePaymentModel(status=" + this.status + ", message=" + this.message + ", reason=" + this.reason + ", pageUrl=" + this.pageUrl + ')';
    }

    public /* synthetic */ SavePaymentModel(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
