package com.nic.mparivahan.dlservices.data.model.savelog;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/savelog/SaveLogResponse;", "", "logCount", "", "statusDesc", "", "statusCode", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getLogCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/dlservices/data/model/savelog/SaveLogResponse;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SaveLogResponse {

    @xy5("logCount")
    private final Integer logCount;

    @xy5("statusCode")
    private final String statusCode;

    @xy5("statusDesc")
    private final String statusDesc;

    public SaveLogResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SaveLogResponse copy$default(SaveLogResponse saveLogResponse, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = saveLogResponse.logCount;
        }
        if ((i & 2) != 0) {
            str = saveLogResponse.statusDesc;
        }
        if ((i & 4) != 0) {
            str2 = saveLogResponse.statusCode;
        }
        return saveLogResponse.copy(num, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLogCount() {
        return this.logCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    public final SaveLogResponse copy(Integer logCount, String statusDesc, String statusCode) {
        return new SaveLogResponse(logCount, statusDesc, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveLogResponse)) {
            return false;
        }
        SaveLogResponse saveLogResponse = (SaveLogResponse) other;
        return Intrinsics.areEqual(this.logCount, saveLogResponse.logCount) && Intrinsics.areEqual(this.statusDesc, saveLogResponse.statusDesc) && Intrinsics.areEqual(this.statusCode, saveLogResponse.statusCode);
    }

    public final Integer getLogCount() {
        return this.logCount;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        Integer num = this.logCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusDesc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusCode;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SaveLogResponse(logCount=" + this.logCount + ", statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ')';
    }

    public SaveLogResponse(Integer num, String str, String str2) {
        this.logCount = num;
        this.statusDesc = str;
        this.statusCode = str2;
    }

    public /* synthetic */ SaveLogResponse(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
