package com.nic.mparivahan.DLServicesAuth.Model.RTO;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Model/RTO/DlLastRtoDetailsDto;", "", "Result", "", "Lcom/nic/mparivahan/DLServicesAuth/Model/RTO/Result;", "status_code", "", "status_desc", "ReqStatus", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReqStatus", "()Ljava/lang/String;", "setReqStatus", "(Ljava/lang/String;)V", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "getStatus_code", "setStatus_code", "getStatus_desc", "setStatus_desc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlLastRtoDetailsDto {
    private String ReqStatus;
    private List<Result> Result;
    private String status_code;
    private String status_desc;

    public DlLastRtoDetailsDto(List<Result> Result, String status_code, String status_desc, String ReqStatus) {
        Intrinsics.checkNotNullParameter(Result, "Result");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(ReqStatus, "ReqStatus");
        this.Result = Result;
        this.status_code = status_code;
        this.status_desc = status_desc;
        this.ReqStatus = ReqStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DlLastRtoDetailsDto copy$default(DlLastRtoDetailsDto dlLastRtoDetailsDto, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dlLastRtoDetailsDto.Result;
        }
        if ((i & 2) != 0) {
            str = dlLastRtoDetailsDto.status_code;
        }
        if ((i & 4) != 0) {
            str2 = dlLastRtoDetailsDto.status_desc;
        }
        if ((i & 8) != 0) {
            str3 = dlLastRtoDetailsDto.ReqStatus;
        }
        return dlLastRtoDetailsDto.copy(list, str, str2, str3);
    }

    public final List<Result> component1() {
        return this.Result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final DlLastRtoDetailsDto copy(List<Result> Result, String status_code, String status_desc, String ReqStatus) {
        Intrinsics.checkNotNullParameter(Result, "Result");
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(ReqStatus, "ReqStatus");
        return new DlLastRtoDetailsDto(Result, status_code, status_desc, ReqStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlLastRtoDetailsDto)) {
            return false;
        }
        DlLastRtoDetailsDto dlLastRtoDetailsDto = (DlLastRtoDetailsDto) other;
        return Intrinsics.areEqual(this.Result, dlLastRtoDetailsDto.Result) && Intrinsics.areEqual(this.status_code, dlLastRtoDetailsDto.status_code) && Intrinsics.areEqual(this.status_desc, dlLastRtoDetailsDto.status_desc) && Intrinsics.areEqual(this.ReqStatus, dlLastRtoDetailsDto.ReqStatus);
    }

    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final List<Result> getResult() {
        return this.Result;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((((this.Result.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode()) * 31) + this.ReqStatus.hashCode();
    }

    public final void setReqStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ReqStatus = str;
    }

    public final void setResult(List<Result> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.Result = list;
    }

    public final void setStatus_code(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status_code = str;
    }

    public final void setStatus_desc(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status_desc = str;
    }

    public String toString() {
        return "DlLastRtoDetailsDto(Result=" + this.Result + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", ReqStatus=" + this.ReqStatus + ')';
    }
}
