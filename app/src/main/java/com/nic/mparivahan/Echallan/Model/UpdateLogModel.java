package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/Echallan/Model/UpdateLogModel;", "", "logCount", "", "statusCode", "", "statusDesc", "(ILjava/lang/String;Ljava/lang/String;)V", "getLogCount", "()I", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UpdateLogModel {
    private final int logCount;
    private final String statusCode;
    private final String statusDesc;

    public UpdateLogModel(int i, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.logCount = i;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public static /* synthetic */ UpdateLogModel copy$default(UpdateLogModel updateLogModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = updateLogModel.logCount;
        }
        if ((i2 & 2) != 0) {
            str = updateLogModel.statusCode;
        }
        if ((i2 & 4) != 0) {
            str2 = updateLogModel.statusDesc;
        }
        return updateLogModel.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLogCount() {
        return this.logCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final UpdateLogModel copy(int logCount, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new UpdateLogModel(logCount, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateLogModel)) {
            return false;
        }
        UpdateLogModel updateLogModel = (UpdateLogModel) other;
        return this.logCount == updateLogModel.logCount && Intrinsics.areEqual(this.statusCode, updateLogModel.statusCode) && Intrinsics.areEqual(this.statusDesc, updateLogModel.statusDesc);
    }

    public final int getLogCount() {
        return this.logCount;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.logCount) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "UpdateLogModel(logCount=" + this.logCount + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
