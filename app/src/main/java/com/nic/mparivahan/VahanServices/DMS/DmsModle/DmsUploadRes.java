package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/DmsUploadRes;", "", "dmsFileDetails", "", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/DmsFileDetailX;", "statusCode", "", "statusDesc", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDmsFileDetails", "()Ljava/util/List;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DmsUploadRes {
    private final List<DmsFileDetailX> dmsFileDetails;
    private final String statusCode;
    private final String statusDesc;

    public DmsUploadRes(List<DmsFileDetailX> dmsFileDetails, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(dmsFileDetails, "dmsFileDetails");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.dmsFileDetails = dmsFileDetails;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DmsUploadRes copy$default(DmsUploadRes dmsUploadRes, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dmsUploadRes.dmsFileDetails;
        }
        if ((i & 2) != 0) {
            str = dmsUploadRes.statusCode;
        }
        if ((i & 4) != 0) {
            str2 = dmsUploadRes.statusDesc;
        }
        return dmsUploadRes.copy(list, str, str2);
    }

    public final List<DmsFileDetailX> component1() {
        return this.dmsFileDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final DmsUploadRes copy(List<DmsFileDetailX> dmsFileDetails, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(dmsFileDetails, "dmsFileDetails");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new DmsUploadRes(dmsFileDetails, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DmsUploadRes)) {
            return false;
        }
        DmsUploadRes dmsUploadRes = (DmsUploadRes) other;
        return Intrinsics.areEqual(this.dmsFileDetails, dmsUploadRes.dmsFileDetails) && Intrinsics.areEqual(this.statusCode, dmsUploadRes.statusCode) && Intrinsics.areEqual(this.statusDesc, dmsUploadRes.statusDesc);
    }

    public final List<DmsFileDetailX> getDmsFileDetails() {
        return this.dmsFileDetails;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.dmsFileDetails.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "DmsUploadRes(dmsFileDetails=" + this.dmsFileDetails + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
