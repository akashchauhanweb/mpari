package com.nic.mparivahan.VahanServices.DMS.DmsModle;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/DmsUploadReq;", "", "appNo", "", "dmsFileDetails", "", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/DmsFileDetail;", "state", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAppNo", "()Ljava/lang/String;", "getDmsFileDetails", "()Ljava/util/List;", "getState", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DmsUploadReq {
    private final String appNo;
    private final List<DmsFileDetail> dmsFileDetails;
    private final String state;

    public DmsUploadReq(String appNo, List<DmsFileDetail> dmsFileDetails, String state) {
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(dmsFileDetails, "dmsFileDetails");
        Intrinsics.checkNotNullParameter(state, "state");
        this.appNo = appNo;
        this.dmsFileDetails = dmsFileDetails;
        this.state = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DmsUploadReq copy$default(DmsUploadReq dmsUploadReq, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dmsUploadReq.appNo;
        }
        if ((i & 2) != 0) {
            list = dmsUploadReq.dmsFileDetails;
        }
        if ((i & 4) != 0) {
            str2 = dmsUploadReq.state;
        }
        return dmsUploadReq.copy(str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppNo() {
        return this.appNo;
    }

    public final List<DmsFileDetail> component2() {
        return this.dmsFileDetails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final DmsUploadReq copy(String appNo, List<DmsFileDetail> dmsFileDetails, String state) {
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(dmsFileDetails, "dmsFileDetails");
        Intrinsics.checkNotNullParameter(state, "state");
        return new DmsUploadReq(appNo, dmsFileDetails, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DmsUploadReq)) {
            return false;
        }
        DmsUploadReq dmsUploadReq = (DmsUploadReq) other;
        return Intrinsics.areEqual(this.appNo, dmsUploadReq.appNo) && Intrinsics.areEqual(this.dmsFileDetails, dmsUploadReq.dmsFileDetails) && Intrinsics.areEqual(this.state, dmsUploadReq.state);
    }

    public final String getAppNo() {
        return this.appNo;
    }

    public final List<DmsFileDetail> getDmsFileDetails() {
        return this.dmsFileDetails;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return (((this.appNo.hashCode() * 31) + this.dmsFileDetails.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "DmsUploadReq(appNo=" + this.appNo + ", dmsFileDetails=" + this.dmsFileDetails + ", state=" + this.state + ')';
    }
}
