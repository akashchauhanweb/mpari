package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/DmsFileDetail;", "", "apiFile", "", "docCatgId", "docId", "fileName", "uploaded", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getApiFile", "()Ljava/lang/String;", "getDocCatgId", "getDocId", "getFileName", "getUploaded", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DmsFileDetail {
    private final String apiFile;
    private final String docCatgId;
    private final String docId;
    private final String fileName;
    private final boolean uploaded;

    public DmsFileDetail(String apiFile, String docCatgId, String docId, String fileName, boolean z) {
        Intrinsics.checkNotNullParameter(apiFile, "apiFile");
        Intrinsics.checkNotNullParameter(docCatgId, "docCatgId");
        Intrinsics.checkNotNullParameter(docId, "docId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.apiFile = apiFile;
        this.docCatgId = docCatgId;
        this.docId = docId;
        this.fileName = fileName;
        this.uploaded = z;
    }

    public static /* synthetic */ DmsFileDetail copy$default(DmsFileDetail dmsFileDetail, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dmsFileDetail.apiFile;
        }
        if ((i & 2) != 0) {
            str2 = dmsFileDetail.docCatgId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = dmsFileDetail.docId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = dmsFileDetail.fileName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = dmsFileDetail.uploaded;
        }
        return dmsFileDetail.copy(str, str5, str6, str7, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApiFile() {
        return this.apiFile;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocCatgId() {
        return this.docCatgId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    public final DmsFileDetail copy(String apiFile, String docCatgId, String docId, String fileName, boolean uploaded) {
        Intrinsics.checkNotNullParameter(apiFile, "apiFile");
        Intrinsics.checkNotNullParameter(docCatgId, "docCatgId");
        Intrinsics.checkNotNullParameter(docId, "docId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new DmsFileDetail(apiFile, docCatgId, docId, fileName, uploaded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DmsFileDetail)) {
            return false;
        }
        DmsFileDetail dmsFileDetail = (DmsFileDetail) other;
        return Intrinsics.areEqual(this.apiFile, dmsFileDetail.apiFile) && Intrinsics.areEqual(this.docCatgId, dmsFileDetail.docCatgId) && Intrinsics.areEqual(this.docId, dmsFileDetail.docId) && Intrinsics.areEqual(this.fileName, dmsFileDetail.fileName) && this.uploaded == dmsFileDetail.uploaded;
    }

    public final String getApiFile() {
        return this.apiFile;
    }

    public final String getDocCatgId() {
        return this.docCatgId;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.apiFile.hashCode() * 31) + this.docCatgId.hashCode()) * 31) + this.docId.hashCode()) * 31) + this.fileName.hashCode()) * 31;
        boolean z = this.uploaded;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        return "DmsFileDetail(apiFile=" + this.apiFile + ", docCatgId=" + this.docCatgId + ", docId=" + this.docId + ", fileName=" + this.fileName + ", uploaded=" + this.uploaded + ')';
    }
}
