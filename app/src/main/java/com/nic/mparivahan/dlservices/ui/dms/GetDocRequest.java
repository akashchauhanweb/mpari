package com.nic.mparivahan.dlservices.ui.dms;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dms/GetDocRequest;", "", "serviceCode", "", "", "applNo", "", "stateCode", "applicantCatg", "agentId", "agentPW", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "getAgentPW", "getApplNo", "getApplicantCatg", "getServiceCode", "()Ljava/util/List;", "getStateCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetDocRequest {

    @xy5("agentId")
    private final String agentId;

    @xy5("agentPW")
    private final String agentPW;

    @xy5("applNo")
    private final String applNo;

    @xy5("applicantCatg")
    private final String applicantCatg;

    @xy5("serviceCode")
    private final List<Integer> serviceCode;

    @xy5("stateCode")
    private final String stateCode;

    public GetDocRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetDocRequest copy$default(GetDocRequest getDocRequest, List list, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getDocRequest.serviceCode;
        }
        if ((i & 2) != 0) {
            str = getDocRequest.applNo;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = getDocRequest.stateCode;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = getDocRequest.applicantCatg;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = getDocRequest.agentId;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = getDocRequest.agentPW;
        }
        return getDocRequest.copy(list, str6, str7, str8, str9, str5);
    }

    public final List<Integer> component1() {
        return this.serviceCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplicantCatg() {
        return this.applicantCatg;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAgentPW() {
        return this.agentPW;
    }

    public final GetDocRequest copy(List<Integer> serviceCode, String applNo, String stateCode, String applicantCatg, String agentId, String agentPW) {
        return new GetDocRequest(serviceCode, applNo, stateCode, applicantCatg, agentId, agentPW);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDocRequest)) {
            return false;
        }
        GetDocRequest getDocRequest = (GetDocRequest) other;
        return Intrinsics.areEqual(this.serviceCode, getDocRequest.serviceCode) && Intrinsics.areEqual(this.applNo, getDocRequest.applNo) && Intrinsics.areEqual(this.stateCode, getDocRequest.stateCode) && Intrinsics.areEqual(this.applicantCatg, getDocRequest.applicantCatg) && Intrinsics.areEqual(this.agentId, getDocRequest.agentId) && Intrinsics.areEqual(this.agentPW, getDocRequest.agentPW);
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

    public final String getApplicantCatg() {
        return this.applicantCatg;
    }

    public final List<Integer> getServiceCode() {
        return this.serviceCode;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        List<Integer> list = this.serviceCode;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.applNo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stateCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applicantCatg;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.agentPW;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "GetDocRequest(serviceCode=" + this.serviceCode + ", applNo=" + this.applNo + ", stateCode=" + this.stateCode + ", applicantCatg=" + this.applicantCatg + ", agentId=" + this.agentId + ", agentPW=" + this.agentPW + ')';
    }

    public GetDocRequest(List<Integer> list, String str, String str2, String str3, String str4, String str5) {
        this.serviceCode = list;
        this.applNo = str;
        this.stateCode = str2;
        this.applicantCatg = str3;
        this.agentId = str4;
        this.agentPW = str5;
    }

    public /* synthetic */ GetDocRequest(List list, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
