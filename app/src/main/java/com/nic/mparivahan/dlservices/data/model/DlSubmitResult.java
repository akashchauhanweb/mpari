package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlSubmitResult;", "Ljava/io/Serializable;", "statusCode", "", "statusDesc", "Result", "", "Lcom/nic/mparivahan/dlservices/data/model/ResultItemSubmit;", "ReqStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getReqStatus", "()Ljava/lang/String;", "getResult", "()Ljava/util/List;", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlSubmitResult implements Serializable {

    @xy5("ReqStatus")
    private final String ReqStatus;

    @xy5("Result")
    private final List<ResultItemSubmit> Result;

    @xy5("status_code")
    private final String statusCode;

    @xy5("status_desc")
    private final String statusDesc;

    public DlSubmitResult() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DlSubmitResult copy$default(DlSubmitResult dlSubmitResult, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlSubmitResult.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = dlSubmitResult.statusDesc;
        }
        if ((i & 4) != 0) {
            list = dlSubmitResult.Result;
        }
        if ((i & 8) != 0) {
            str3 = dlSubmitResult.ReqStatus;
        }
        return dlSubmitResult.copy(str, str2, list, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<ResultItemSubmit> component3() {
        return this.Result;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final DlSubmitResult copy(String statusCode, String statusDesc, List<ResultItemSubmit> Result, String ReqStatus) {
        return new DlSubmitResult(statusCode, statusDesc, Result, ReqStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlSubmitResult)) {
            return false;
        }
        DlSubmitResult dlSubmitResult = (DlSubmitResult) other;
        return Intrinsics.areEqual(this.statusCode, dlSubmitResult.statusCode) && Intrinsics.areEqual(this.statusDesc, dlSubmitResult.statusDesc) && Intrinsics.areEqual(this.Result, dlSubmitResult.Result) && Intrinsics.areEqual(this.ReqStatus, dlSubmitResult.ReqStatus);
    }

    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final List<ResultItemSubmit> getResult() {
        return this.Result;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ResultItemSubmit> list = this.Result;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.ReqStatus;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "DlSubmitResult(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", Result=" + this.Result + ", ReqStatus=" + this.ReqStatus + ')';
    }

    public DlSubmitResult(String str, String str2, List<ResultItemSubmit> list, String str3) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.Result = list;
        this.ReqStatus = str3;
    }

    public /* synthetic */ DlSubmitResult(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3);
    }
}
