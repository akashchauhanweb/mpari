package com.nic.mparivahan.FetchVahanLog.Pojo;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/FetchVahanLog/Pojo/VahanPojo;", "", "logCount", "", "statusCode", "", "statusDesc", "vahanLogs", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/FetchVahanLog/Pojo/VahanLog;", "Lkotlin/collections/ArrayList;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getLogCount", "()I", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "getVahanLogs", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VahanPojo {
    private final int logCount;
    private final String statusCode;
    private final String statusDesc;
    private final ArrayList<VahanLog> vahanLogs;

    public VahanPojo(int i, String statusCode, String statusDesc, ArrayList<VahanLog> vahanLogs) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(vahanLogs, "vahanLogs");
        this.logCount = i;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.vahanLogs = vahanLogs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VahanPojo copy$default(VahanPojo vahanPojo, int i, String str, String str2, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = vahanPojo.logCount;
        }
        if ((i2 & 2) != 0) {
            str = vahanPojo.statusCode;
        }
        if ((i2 & 4) != 0) {
            str2 = vahanPojo.statusDesc;
        }
        if ((i2 & 8) != 0) {
            arrayList = vahanPojo.vahanLogs;
        }
        return vahanPojo.copy(i, str, str2, arrayList);
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

    public final ArrayList<VahanLog> component4() {
        return this.vahanLogs;
    }

    public final VahanPojo copy(int logCount, String statusCode, String statusDesc, ArrayList<VahanLog> vahanLogs) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(vahanLogs, "vahanLogs");
        return new VahanPojo(logCount, statusCode, statusDesc, vahanLogs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VahanPojo)) {
            return false;
        }
        VahanPojo vahanPojo = (VahanPojo) other;
        return this.logCount == vahanPojo.logCount && Intrinsics.areEqual(this.statusCode, vahanPojo.statusCode) && Intrinsics.areEqual(this.statusDesc, vahanPojo.statusDesc) && Intrinsics.areEqual(this.vahanLogs, vahanPojo.vahanLogs);
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

    public final ArrayList<VahanLog> getVahanLogs() {
        return this.vahanLogs;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.logCount) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode()) * 31) + this.vahanLogs.hashCode();
    }

    public String toString() {
        return "VahanPojo(logCount=" + this.logCount + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", vahanLogs=" + this.vahanLogs + ')';
    }
}
