package com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddModel;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddModel/Result;", "", "ReqStatus", "", "Result", "", "Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddModel/ResultX;", "status_code", "status_desc", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getReqStatus", "()Ljava/lang/String;", "getResult", "()Ljava/util/List;", "getStatus_code", "getStatus_desc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Result {
    private final String ReqStatus;
    private final List<ResultX> Result;
    private final String status_code;
    private final String status_desc;

    public Result(String ReqStatus, List<ResultX> Result, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(ReqStatus, "ReqStatus");
        Intrinsics.checkNotNullParameter(Result, "Result");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        this.ReqStatus = ReqStatus;
        this.Result = Result;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Result copy$default(Result result, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = result.ReqStatus;
        }
        if ((i & 2) != 0) {
            list = result.Result;
        }
        if ((i & 4) != 0) {
            str2 = result.status_code;
        }
        if ((i & 8) != 0) {
            str3 = result.status_desc;
        }
        return result.copy(str, list, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final List<ResultX> component2() {
        return this.Result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final Result copy(String ReqStatus, List<ResultX> Result, String status_code, String status_desc) {
        Intrinsics.checkNotNullParameter(ReqStatus, "ReqStatus");
        Intrinsics.checkNotNullParameter(Result, "Result");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        return new Result(ReqStatus, Result, status_code, status_desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return Intrinsics.areEqual(this.ReqStatus, result.ReqStatus) && Intrinsics.areEqual(this.Result, result.Result) && Intrinsics.areEqual(this.status_code, result.status_code) && Intrinsics.areEqual(this.status_desc, result.status_desc);
    }

    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final List<ResultX> getResult() {
        return this.Result;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((((this.ReqStatus.hashCode() * 31) + this.Result.hashCode()) * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "Result(ReqStatus=" + this.ReqStatus + ", Result=" + this.Result + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
