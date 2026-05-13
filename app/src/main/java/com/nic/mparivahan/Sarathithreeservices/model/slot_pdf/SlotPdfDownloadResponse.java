package com.nic.mparivahan.Sarathithreeservices.model.slot_pdf;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/slot_pdf/SlotPdfDownloadResponse;", "", "Reportdets", "", "status_code", "status_desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReportdets", "()Ljava/lang/String;", "getStatus_code", "getStatus_desc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SlotPdfDownloadResponse {
    private final String Reportdets;
    private final String status_code;
    private final String status_desc;

    public SlotPdfDownloadResponse(String Reportdets, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(Reportdets, "Reportdets");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.Reportdets = Reportdets;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    public static /* synthetic */ SlotPdfDownloadResponse copy$default(SlotPdfDownloadResponse slotPdfDownloadResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotPdfDownloadResponse.Reportdets;
        }
        if ((i & 2) != 0) {
            str2 = slotPdfDownloadResponse.status_code;
        }
        if ((i & 4) != 0) {
            str3 = slotPdfDownloadResponse.status_desc;
        }
        return slotPdfDownloadResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReportdets() {
        return this.Reportdets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final SlotPdfDownloadResponse copy(String Reportdets, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(Reportdets, "Reportdets");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new SlotPdfDownloadResponse(Reportdets, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotPdfDownloadResponse)) {
            return false;
        }
        SlotPdfDownloadResponse slotPdfDownloadResponse = (SlotPdfDownloadResponse) other;
        return Intrinsics.areEqual(this.Reportdets, slotPdfDownloadResponse.Reportdets) && Intrinsics.areEqual(this.status_code, slotPdfDownloadResponse.status_code) && Intrinsics.areEqual(this.status_desc, slotPdfDownloadResponse.status_desc);
    }

    public final String getReportdets() {
        return this.Reportdets;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.Reportdets.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "SlotPdfDownloadResponse(Reportdets=" + this.Reportdets + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
