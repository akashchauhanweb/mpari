package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/idp/GetNatVisaIssbleForNatCodeResponse;", "", "statusCode", "", "statusDesc", "nationsMaster", "", "Lcom/nic/mparivahan/dlservices/data/model/idp/NationsMasterItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getNationsMaster", "()Ljava/util/List;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetNatVisaIssbleForNatCodeResponse {

    @xy5("NationsMaster")
    private final List<NationsMasterItem> nationsMaster;

    @xy5("status_code")
    private final String statusCode;

    @xy5("status_desc")
    private final String statusDesc;

    public GetNatVisaIssbleForNatCodeResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetNatVisaIssbleForNatCodeResponse copy$default(GetNatVisaIssbleForNatCodeResponse getNatVisaIssbleForNatCodeResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getNatVisaIssbleForNatCodeResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = getNatVisaIssbleForNatCodeResponse.statusDesc;
        }
        if ((i & 4) != 0) {
            list = getNatVisaIssbleForNatCodeResponse.nationsMaster;
        }
        return getNatVisaIssbleForNatCodeResponse.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<NationsMasterItem> component3() {
        return this.nationsMaster;
    }

    public final GetNatVisaIssbleForNatCodeResponse copy(String statusCode, String statusDesc, List<NationsMasterItem> nationsMaster) {
        return new GetNatVisaIssbleForNatCodeResponse(statusCode, statusDesc, nationsMaster);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetNatVisaIssbleForNatCodeResponse)) {
            return false;
        }
        GetNatVisaIssbleForNatCodeResponse getNatVisaIssbleForNatCodeResponse = (GetNatVisaIssbleForNatCodeResponse) other;
        return Intrinsics.areEqual(this.statusCode, getNatVisaIssbleForNatCodeResponse.statusCode) && Intrinsics.areEqual(this.statusDesc, getNatVisaIssbleForNatCodeResponse.statusDesc) && Intrinsics.areEqual(this.nationsMaster, getNatVisaIssbleForNatCodeResponse.nationsMaster);
    }

    public final List<NationsMasterItem> getNationsMaster() {
        return this.nationsMaster;
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
        List<NationsMasterItem> list = this.nationsMaster;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "GetNatVisaIssbleForNatCodeResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", nationsMaster=" + this.nationsMaster + ')';
    }

    public GetNatVisaIssbleForNatCodeResponse(String str, String str2, List<NationsMasterItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.nationsMaster = list;
    }

    public /* synthetic */ GetNatVisaIssbleForNatCodeResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
