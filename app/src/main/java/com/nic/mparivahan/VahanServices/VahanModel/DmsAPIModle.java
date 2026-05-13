package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/DmsAPIModle;", "", "statusCode", "", "statusDesc", "uploadDataDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/UploadDataDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/UploadDataDto;)V", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "getUploadDataDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/UploadDataDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DmsAPIModle {
    private final String statusCode;
    private final String statusDesc;
    private final UploadDataDto uploadDataDto;

    public DmsAPIModle(String statusCode, String statusDesc, UploadDataDto uploadDataDto) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(uploadDataDto, "uploadDataDto");
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.uploadDataDto = uploadDataDto;
    }

    public static /* synthetic */ DmsAPIModle copy$default(DmsAPIModle dmsAPIModle, String str, String str2, UploadDataDto uploadDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dmsAPIModle.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = dmsAPIModle.statusDesc;
        }
        if ((i & 4) != 0) {
            uploadDataDto = dmsAPIModle.uploadDataDto;
        }
        return dmsAPIModle.copy(str, str2, uploadDataDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UploadDataDto getUploadDataDto() {
        return this.uploadDataDto;
    }

    public final DmsAPIModle copy(String statusCode, String statusDesc, UploadDataDto uploadDataDto) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(uploadDataDto, "uploadDataDto");
        return new DmsAPIModle(statusCode, statusDesc, uploadDataDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DmsAPIModle)) {
            return false;
        }
        DmsAPIModle dmsAPIModle = (DmsAPIModle) other;
        return Intrinsics.areEqual(this.statusCode, dmsAPIModle.statusCode) && Intrinsics.areEqual(this.statusDesc, dmsAPIModle.statusDesc) && Intrinsics.areEqual(this.uploadDataDto, dmsAPIModle.uploadDataDto);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final UploadDataDto getUploadDataDto() {
        return this.uploadDataDto;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.uploadDataDto.hashCode();
    }

    public String toString() {
        return "DmsAPIModle(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", uploadDataDto=" + this.uploadDataDto + ')';
    }
}
