package com.nic.mparivahan.dlservices.ui.dms;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dms/GetCustomRequest;", "", "applNo", "", "stateCode", "transCode", "", "", "agentId", "agentPW", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "getAgentPW", "getApplNo", "getStateCode", "getTransCode", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetCustomRequest {

    @xy5("agentId")
    private final String agentId;

    @xy5("agentPW")
    private final String agentPW;

    @xy5("applNo")
    private final String applNo;

    @xy5("stateCode")
    private final String stateCode;

    @xy5("transCode")
    private final List<Integer> transCode;

    public GetCustomRequest() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCustomRequest copy$default(GetCustomRequest getCustomRequest, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCustomRequest.applNo;
        }
        if ((i & 2) != 0) {
            str2 = getCustomRequest.stateCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = getCustomRequest.transCode;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = getCustomRequest.agentId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = getCustomRequest.agentPW;
        }
        return getCustomRequest.copy(str, str5, list2, str6, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final List<Integer> component3() {
        return this.transCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAgentPW() {
        return this.agentPW;
    }

    public final GetCustomRequest copy(String applNo, String stateCode, List<Integer> transCode, String agentId, String agentPW) {
        return new GetCustomRequest(applNo, stateCode, transCode, agentId, agentPW);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCustomRequest)) {
            return false;
        }
        GetCustomRequest getCustomRequest = (GetCustomRequest) other;
        return Intrinsics.areEqual(this.applNo, getCustomRequest.applNo) && Intrinsics.areEqual(this.stateCode, getCustomRequest.stateCode) && Intrinsics.areEqual(this.transCode, getCustomRequest.transCode) && Intrinsics.areEqual(this.agentId, getCustomRequest.agentId) && Intrinsics.areEqual(this.agentPW, getCustomRequest.agentPW);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentPW() {
        return this.agentPW;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final List<Integer> getTransCode() {
        return this.transCode;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.transCode;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.agentId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentPW;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "GetCustomRequest(applNo=" + this.applNo + ", stateCode=" + this.stateCode + ", transCode=" + this.transCode + ", agentId=" + this.agentId + ", agentPW=" + this.agentPW + ')';
    }

    public GetCustomRequest(String str, String str2, List<Integer> list, String str3, String str4) {
        this.applNo = str;
        this.stateCode = str2;
        this.transCode = list;
        this.agentId = str3;
        this.agentPW = str4;
    }

    public /* synthetic */ GetCustomRequest(String str, String str2, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
