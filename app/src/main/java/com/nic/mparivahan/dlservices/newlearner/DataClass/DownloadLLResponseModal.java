package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/DataClass/DownloadLLResponseModal;", "", "status_code", "", "status_desc", "LLPrintStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLLPrintStatus", "()Ljava/lang/String;", "getStatus_code", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DownloadLLResponseModal {

    @xy5("LLPrintStatus")
    private final String LLPrintStatus;

    @xy5("status_code")
    private final String status_code;

    @xy5("status_desc")
    private final String status_desc;

    public DownloadLLResponseModal() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DownloadLLResponseModal copy$default(DownloadLLResponseModal downloadLLResponseModal, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadLLResponseModal.status_code;
        }
        if ((i & 2) != 0) {
            str2 = downloadLLResponseModal.status_desc;
        }
        if ((i & 4) != 0) {
            str3 = downloadLLResponseModal.LLPrintStatus;
        }
        return downloadLLResponseModal.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLLPrintStatus() {
        return this.LLPrintStatus;
    }

    public final DownloadLLResponseModal copy(String status_code, String status_desc, String LLPrintStatus) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(LLPrintStatus, "LLPrintStatus");
        return new DownloadLLResponseModal(status_code, status_desc, LLPrintStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadLLResponseModal)) {
            return false;
        }
        DownloadLLResponseModal downloadLLResponseModal = (DownloadLLResponseModal) other;
        return Intrinsics.areEqual(this.status_code, downloadLLResponseModal.status_code) && Intrinsics.areEqual(this.status_desc, downloadLLResponseModal.status_desc) && Intrinsics.areEqual(this.LLPrintStatus, downloadLLResponseModal.LLPrintStatus);
    }

    public final String getLLPrintStatus() {
        return this.LLPrintStatus;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31) + this.LLPrintStatus.hashCode();
    }

    public String toString() {
        return "DownloadLLResponseModal(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", LLPrintStatus=" + this.LLPrintStatus + ')';
    }

    public DownloadLLResponseModal(String status_code, String status_desc, String LLPrintStatus) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(LLPrintStatus, "LLPrintStatus");
        this.status_code = status_code;
        this.status_desc = status_desc;
        this.LLPrintStatus = LLPrintStatus;
    }

    public /* synthetic */ DownloadLLResponseModal(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
