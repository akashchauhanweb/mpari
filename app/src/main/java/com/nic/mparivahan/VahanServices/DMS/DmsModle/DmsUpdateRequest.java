package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/DmsUpdateRequest;", "", "appNo", "", "docKey", "fileName", "fileToUpload", "state", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppNo", "()Ljava/lang/String;", "getDocKey", "getFileName", "getFileToUpload", "getState", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DmsUpdateRequest {
    private final String appNo;
    private final String docKey;
    private final String fileName;
    private final String fileToUpload;
    private final String state;

    public DmsUpdateRequest(String appNo, String docKey, String fileName, String fileToUpload, String state) {
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(docKey, "docKey");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileToUpload, "fileToUpload");
        Intrinsics.checkNotNullParameter(state, "state");
        this.appNo = appNo;
        this.docKey = docKey;
        this.fileName = fileName;
        this.fileToUpload = fileToUpload;
        this.state = state;
    }

    public static /* synthetic */ DmsUpdateRequest copy$default(DmsUpdateRequest dmsUpdateRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dmsUpdateRequest.appNo;
        }
        if ((i & 2) != 0) {
            str2 = dmsUpdateRequest.docKey;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dmsUpdateRequest.fileName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = dmsUpdateRequest.fileToUpload;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = dmsUpdateRequest.state;
        }
        return dmsUpdateRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppNo() {
        return this.appNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocKey() {
        return this.docKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileToUpload() {
        return this.fileToUpload;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final DmsUpdateRequest copy(String appNo, String docKey, String fileName, String fileToUpload, String state) {
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(docKey, "docKey");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileToUpload, "fileToUpload");
        Intrinsics.checkNotNullParameter(state, "state");
        return new DmsUpdateRequest(appNo, docKey, fileName, fileToUpload, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DmsUpdateRequest)) {
            return false;
        }
        DmsUpdateRequest dmsUpdateRequest = (DmsUpdateRequest) other;
        return Intrinsics.areEqual(this.appNo, dmsUpdateRequest.appNo) && Intrinsics.areEqual(this.docKey, dmsUpdateRequest.docKey) && Intrinsics.areEqual(this.fileName, dmsUpdateRequest.fileName) && Intrinsics.areEqual(this.fileToUpload, dmsUpdateRequest.fileToUpload) && Intrinsics.areEqual(this.state, dmsUpdateRequest.state);
    }

    public final String getAppNo() {
        return this.appNo;
    }

    public final String getDocKey() {
        return this.docKey;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileToUpload() {
        return this.fileToUpload;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return (((((((this.appNo.hashCode() * 31) + this.docKey.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.fileToUpload.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "DmsUpdateRequest(appNo=" + this.appNo + ", docKey=" + this.docKey + ", fileName=" + this.fileName + ", fileToUpload=" + this.fileToUpload + ", state=" + this.state + ')';
    }
}
