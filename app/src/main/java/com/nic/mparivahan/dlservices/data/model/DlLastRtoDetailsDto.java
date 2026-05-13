package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlLastRtoDetailsDto;", "", "statusCode", "", "statusDesc", "reqStatus", "result", "", "Lcom/nic/mparivahan/dlservices/data/model/DlLastRtoResultItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getReqStatus", "()Ljava/lang/String;", "getResult", "()Ljava/util/List;", "getStatusCode", "getStatusDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlLastRtoDetailsDto {

    @xy5("ReqStatus")
    private final String reqStatus;

    @xy5("Result")
    private final List<DlLastRtoResultItem> result;

    @xy5("status_code")
    private final String statusCode;

    @xy5("status_desc")
    private final String statusDesc;

    public DlLastRtoDetailsDto() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DlLastRtoDetailsDto copy$default(DlLastRtoDetailsDto dlLastRtoDetailsDto, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlLastRtoDetailsDto.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = dlLastRtoDetailsDto.statusDesc;
        }
        if ((i & 4) != 0) {
            str3 = dlLastRtoDetailsDto.reqStatus;
        }
        if ((i & 8) != 0) {
            list = dlLastRtoDetailsDto.result;
        }
        return dlLastRtoDetailsDto.copy(str, str2, str3, list);
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
    public final String getReqStatus() {
        return this.reqStatus;
    }

    public final List<DlLastRtoResultItem> component4() {
        return this.result;
    }

    public final DlLastRtoDetailsDto copy(String statusCode, String statusDesc, String reqStatus, List<DlLastRtoResultItem> result) {
        return new DlLastRtoDetailsDto(statusCode, statusDesc, reqStatus, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlLastRtoDetailsDto)) {
            return false;
        }
        DlLastRtoDetailsDto dlLastRtoDetailsDto = (DlLastRtoDetailsDto) other;
        return Intrinsics.areEqual(this.statusCode, dlLastRtoDetailsDto.statusCode) && Intrinsics.areEqual(this.statusDesc, dlLastRtoDetailsDto.statusDesc) && Intrinsics.areEqual(this.reqStatus, dlLastRtoDetailsDto.reqStatus) && Intrinsics.areEqual(this.result, dlLastRtoDetailsDto.result);
    }

    public final String getReqStatus() {
        return this.reqStatus;
    }

    public final List<DlLastRtoResultItem> getResult() {
        return this.result;
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
        String str3 = this.reqStatus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DlLastRtoResultItem> list = this.result;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "DlLastRtoDetailsDto(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", reqStatus=" + this.reqStatus + ", result=" + this.result + ')';
    }

    public DlLastRtoDetailsDto(String str, String str2, String str3, List<DlLastRtoResultItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.reqStatus = str3;
        this.result = list;
    }

    public /* synthetic */ DlLastRtoDetailsDto(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }
}
