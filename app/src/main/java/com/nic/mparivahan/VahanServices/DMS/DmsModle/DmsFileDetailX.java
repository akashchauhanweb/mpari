package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/DmsFileDetailX;", "", "docCatgId", "", "docId", "", "fileName", "objectId", "uploaded", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getDocCatgId", "()Ljava/lang/String;", "getDocId", "()I", "getFileName", "getObjectId", "getUploaded", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DmsFileDetailX {
    private final String docCatgId;
    private final int docId;
    private final String fileName;
    private final String objectId;
    private final boolean uploaded;

    public DmsFileDetailX(String docCatgId, int i, String fileName, String objectId, boolean z) {
        Intrinsics.checkNotNullParameter(docCatgId, "docCatgId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        this.docCatgId = docCatgId;
        this.docId = i;
        this.fileName = fileName;
        this.objectId = objectId;
        this.uploaded = z;
    }

    public static /* synthetic */ DmsFileDetailX copy$default(DmsFileDetailX dmsFileDetailX, String str, int i, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dmsFileDetailX.docCatgId;
        }
        if ((i2 & 2) != 0) {
            i = dmsFileDetailX.docId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = dmsFileDetailX.fileName;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = dmsFileDetailX.objectId;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            z = dmsFileDetailX.uploaded;
        }
        return dmsFileDetailX.copy(str, i3, str4, str5, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocCatgId() {
        return this.docCatgId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    public final DmsFileDetailX copy(String docCatgId, int docId, String fileName, String objectId, boolean uploaded) {
        Intrinsics.checkNotNullParameter(docCatgId, "docCatgId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        return new DmsFileDetailX(docCatgId, docId, fileName, objectId, uploaded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DmsFileDetailX)) {
            return false;
        }
        DmsFileDetailX dmsFileDetailX = (DmsFileDetailX) other;
        return Intrinsics.areEqual(this.docCatgId, dmsFileDetailX.docCatgId) && this.docId == dmsFileDetailX.docId && Intrinsics.areEqual(this.fileName, dmsFileDetailX.fileName) && Intrinsics.areEqual(this.objectId, dmsFileDetailX.objectId) && this.uploaded == dmsFileDetailX.uploaded;
    }

    public final String getDocCatgId() {
        return this.docCatgId;
    }

    public final int getDocId() {
        return this.docId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.docCatgId.hashCode() * 31) + Integer.hashCode(this.docId)) * 31) + this.fileName.hashCode()) * 31) + this.objectId.hashCode()) * 31;
        boolean z = this.uploaded;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        return "DmsFileDetailX(docCatgId=" + this.docCatgId + ", docId=" + this.docId + ", fileName=" + this.fileName + ", objectId=" + this.objectId + ", uploaded=" + this.uploaded + ')';
    }
}
