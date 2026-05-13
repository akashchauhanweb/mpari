package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DRcModle/DMSViewDocModle;", "", "fileContent", "", "fileExt", "fileName", "mimeType", "statusCode", "statusDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileContent", "()Ljava/lang/String;", "getFileExt", "getFileName", "getMimeType", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DMSViewDocModle {
    private final String fileContent;
    private final String fileExt;
    private final String fileName;
    private final String mimeType;
    private final String statusCode;
    private final String statusDesc;

    public DMSViewDocModle(String fileContent, String fileExt, String fileName, String mimeType, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(fileContent, "fileContent");
        Intrinsics.checkNotNullParameter(fileExt, "fileExt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.fileContent = fileContent;
        this.fileExt = fileExt;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ DMSViewDocModle copy$default(DMSViewDocModle dMSViewDocModle, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dMSViewDocModle.fileContent;
        }
        if ((i & 2) != 0) {
            str2 = dMSViewDocModle.fileExt;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = dMSViewDocModle.fileName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = dMSViewDocModle.mimeType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = dMSViewDocModle.statusCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = dMSViewDocModle.statusDesc;
        }
        return dMSViewDocModle.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileContent() {
        return this.fileContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileExt() {
        return this.fileExt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final DMSViewDocModle copy(String fileContent, String fileExt, String fileName, String mimeType, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(fileContent, "fileContent");
        Intrinsics.checkNotNullParameter(fileExt, "fileExt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new DMSViewDocModle(fileContent, fileExt, fileName, mimeType, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DMSViewDocModle)) {
            return false;
        }
        DMSViewDocModle dMSViewDocModle = (DMSViewDocModle) other;
        return Intrinsics.areEqual(this.fileContent, dMSViewDocModle.fileContent) && Intrinsics.areEqual(this.fileExt, dMSViewDocModle.fileExt) && Intrinsics.areEqual(this.fileName, dMSViewDocModle.fileName) && Intrinsics.areEqual(this.mimeType, dMSViewDocModle.mimeType) && Intrinsics.areEqual(this.statusCode, dMSViewDocModle.statusCode) && Intrinsics.areEqual(this.statusDesc, dMSViewDocModle.statusDesc);
    }

    public final String getFileContent() {
        return this.fileContent;
    }

    public final String getFileExt() {
        return this.fileExt;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((((((this.fileContent.hashCode() * 31) + this.fileExt.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "DMSViewDocModle(fileContent=" + this.fileContent + ", fileExt=" + this.fileExt + ", fileName=" + this.fileName + ", mimeType=" + this.mimeType + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
