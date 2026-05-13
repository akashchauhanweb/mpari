package com.nic.mparivahan.Echallan.Echallan.Model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanPdfResultModal;", "", "pdf_url", "", "receipt_url", "(Ljava/lang/String;Ljava/lang/String;)V", "getPdf_url", "()Ljava/lang/String;", "getReceipt_url", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallanPdfResultModal {

    @xy5("pdf_url")
    private final String pdf_url;

    @xy5("receipt_url")
    private final String receipt_url;

    public ChallanPdfResultModal(String pdf_url, String receipt_url) {
        Intrinsics.checkNotNullParameter(pdf_url, "pdf_url");
        Intrinsics.checkNotNullParameter(receipt_url, "receipt_url");
        this.pdf_url = pdf_url;
        this.receipt_url = receipt_url;
    }

    public static /* synthetic */ ChallanPdfResultModal copy$default(ChallanPdfResultModal challanPdfResultModal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challanPdfResultModal.pdf_url;
        }
        if ((i & 2) != 0) {
            str2 = challanPdfResultModal.receipt_url;
        }
        return challanPdfResultModal.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPdf_url() {
        return this.pdf_url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReceipt_url() {
        return this.receipt_url;
    }

    public final ChallanPdfResultModal copy(String pdf_url, String receipt_url) {
        Intrinsics.checkNotNullParameter(pdf_url, "pdf_url");
        Intrinsics.checkNotNullParameter(receipt_url, "receipt_url");
        return new ChallanPdfResultModal(pdf_url, receipt_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallanPdfResultModal)) {
            return false;
        }
        ChallanPdfResultModal challanPdfResultModal = (ChallanPdfResultModal) other;
        return Intrinsics.areEqual(this.pdf_url, challanPdfResultModal.pdf_url) && Intrinsics.areEqual(this.receipt_url, challanPdfResultModal.receipt_url);
    }

    public final String getPdf_url() {
        return this.pdf_url;
    }

    public final String getReceipt_url() {
        return this.receipt_url;
    }

    public int hashCode() {
        return (this.pdf_url.hashCode() * 31) + this.receipt_url.hashCode();
    }

    public String toString() {
        return "ChallanPdfResultModal(pdf_url=" + this.pdf_url + ", receipt_url=" + this.receipt_url + ')';
    }
}
