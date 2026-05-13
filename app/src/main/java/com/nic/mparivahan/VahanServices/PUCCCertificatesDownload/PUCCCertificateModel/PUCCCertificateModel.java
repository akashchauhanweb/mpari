package com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/VahanServices/PUCCCertificatesDownload/PUCCCertificateModel/PUCCCertificateModel;", "", "pdfData", "", "statusCode", "statusDescr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPdfData", "()Ljava/lang/String;", "getStatusCode", "getStatusDescr", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PUCCCertificateModel {
    private final String pdfData;
    private final String statusCode;
    private final String statusDescr;

    public PUCCCertificateModel(String pdfData, String statusCode, String statusDescr) {
        Intrinsics.checkNotNullParameter(pdfData, "pdfData");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDescr, "statusDescr");
        this.pdfData = pdfData;
        this.statusCode = statusCode;
        this.statusDescr = statusDescr;
    }

    public static /* synthetic */ PUCCCertificateModel copy$default(PUCCCertificateModel pUCCCertificateModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pUCCCertificateModel.pdfData;
        }
        if ((i & 2) != 0) {
            str2 = pUCCCertificateModel.statusCode;
        }
        if ((i & 4) != 0) {
            str3 = pUCCCertificateModel.statusDescr;
        }
        return pUCCCertificateModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPdfData() {
        return this.pdfData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDescr() {
        return this.statusDescr;
    }

    public final PUCCCertificateModel copy(String pdfData, String statusCode, String statusDescr) {
        Intrinsics.checkNotNullParameter(pdfData, "pdfData");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDescr, "statusDescr");
        return new PUCCCertificateModel(pdfData, statusCode, statusDescr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PUCCCertificateModel)) {
            return false;
        }
        PUCCCertificateModel pUCCCertificateModel = (PUCCCertificateModel) other;
        return Intrinsics.areEqual(this.pdfData, pUCCCertificateModel.pdfData) && Intrinsics.areEqual(this.statusCode, pUCCCertificateModel.statusCode) && Intrinsics.areEqual(this.statusDescr, pUCCCertificateModel.statusDescr);
    }

    public final String getPdfData() {
        return this.pdfData;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDescr() {
        return this.statusDescr;
    }

    public int hashCode() {
        return (((this.pdfData.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDescr.hashCode();
    }

    public String toString() {
        return "PUCCCertificateModel(pdfData=" + this.pdfData + ", statusCode=" + this.statusCode + ", statusDescr=" + this.statusDescr + ')';
    }
}
