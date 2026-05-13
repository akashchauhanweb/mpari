package com.nic.mparivahan.FetchChallanLog.PojoChallan;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/FetchChallanLog/PojoChallan/FetchChallanResponse;", "", "logCount", "", "mparEchallanLog", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/FetchChallanLog/PojoChallan/MparEchallanLog;", "Lkotlin/collections/ArrayList;", "statusCode", "", "statusDesc", "(ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getLogCount", "()I", "getMparEchallanLog", "()Ljava/util/ArrayList;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FetchChallanResponse {
    private final int logCount;
    private final ArrayList<MparEchallanLog> mparEchallanLog;
    private final String statusCode;
    private final String statusDesc;

    public FetchChallanResponse(int i, ArrayList<MparEchallanLog> mparEchallanLog, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(mparEchallanLog, "mparEchallanLog");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.logCount = i;
        this.mparEchallanLog = mparEchallanLog;
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchChallanResponse copy$default(FetchChallanResponse fetchChallanResponse, int i, ArrayList arrayList, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fetchChallanResponse.logCount;
        }
        if ((i2 & 2) != 0) {
            arrayList = fetchChallanResponse.mparEchallanLog;
        }
        if ((i2 & 4) != 0) {
            str = fetchChallanResponse.statusCode;
        }
        if ((i2 & 8) != 0) {
            str2 = fetchChallanResponse.statusDesc;
        }
        return fetchChallanResponse.copy(i, arrayList, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLogCount() {
        return this.logCount;
    }

    public final ArrayList<MparEchallanLog> component2() {
        return this.mparEchallanLog;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final FetchChallanResponse copy(int logCount, ArrayList<MparEchallanLog> mparEchallanLog, String statusCode, String statusDesc) {
        Intrinsics.checkNotNullParameter(mparEchallanLog, "mparEchallanLog");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new FetchChallanResponse(logCount, mparEchallanLog, statusCode, statusDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchChallanResponse)) {
            return false;
        }
        FetchChallanResponse fetchChallanResponse = (FetchChallanResponse) other;
        return this.logCount == fetchChallanResponse.logCount && Intrinsics.areEqual(this.mparEchallanLog, fetchChallanResponse.mparEchallanLog) && Intrinsics.areEqual(this.statusCode, fetchChallanResponse.statusCode) && Intrinsics.areEqual(this.statusDesc, fetchChallanResponse.statusDesc);
    }

    public final int getLogCount() {
        return this.logCount;
    }

    public final ArrayList<MparEchallanLog> getMparEchallanLog() {
        return this.mparEchallanLog;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.logCount) * 31) + this.mparEchallanLog.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "FetchChallanResponse(logCount=" + this.logCount + ", mparEchallanLog=" + this.mparEchallanLog + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
