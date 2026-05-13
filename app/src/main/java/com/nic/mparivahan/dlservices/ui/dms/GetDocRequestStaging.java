package com.nic.mparivahan.dlservices.ui.dms;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dms/GetDocRequestStaging;", "", "servicecode", "", "applNo", "stateCode", "applicantCategory", "agentId", "agentPW", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "getAgentPW", "getApplNo", "getApplicantCategory", "getServicecode", "getStateCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetDocRequestStaging {

    @xy5("agentId")
    private final String agentId;

    @xy5("agentPW")
    private final String agentPW;

    @xy5("applNo")
    private final String applNo;

    @xy5("applicantCategory")
    private final String applicantCategory;

    @xy5("servicecode")
    private final String servicecode;

    @xy5("stateCode")
    private final String stateCode;

    public GetDocRequestStaging() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ GetDocRequestStaging copy$default(GetDocRequestStaging getDocRequestStaging, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getDocRequestStaging.servicecode;
        }
        if ((i & 2) != 0) {
            str2 = getDocRequestStaging.applNo;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getDocRequestStaging.stateCode;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getDocRequestStaging.applicantCategory;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getDocRequestStaging.agentId;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getDocRequestStaging.agentPW;
        }
        return getDocRequestStaging.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServicecode() {
        return this.servicecode;
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
    public final String getApplicantCategory() {
        return this.applicantCategory;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAgentPW() {
        return this.agentPW;
    }

    public final GetDocRequestStaging copy(String servicecode, String applNo, String stateCode, String applicantCategory, String agentId, String agentPW) {
        return new GetDocRequestStaging(servicecode, applNo, stateCode, applicantCategory, agentId, agentPW);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDocRequestStaging)) {
            return false;
        }
        GetDocRequestStaging getDocRequestStaging = (GetDocRequestStaging) other;
        return Intrinsics.areEqual(this.servicecode, getDocRequestStaging.servicecode) && Intrinsics.areEqual(this.applNo, getDocRequestStaging.applNo) && Intrinsics.areEqual(this.stateCode, getDocRequestStaging.stateCode) && Intrinsics.areEqual(this.applicantCategory, getDocRequestStaging.applicantCategory) && Intrinsics.areEqual(this.agentId, getDocRequestStaging.agentId) && Intrinsics.areEqual(this.agentPW, getDocRequestStaging.agentPW);
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

    public final String getApplicantCategory() {
        return this.applicantCategory;
    }

    public final String getServicecode() {
        return this.servicecode;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.servicecode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applicantCategory;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.agentId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agentPW;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "GetDocRequestStaging(servicecode=" + this.servicecode + ", applNo=" + this.applNo + ", stateCode=" + this.stateCode + ", applicantCategory=" + this.applicantCategory + ", agentId=" + this.agentId + ", agentPW=" + this.agentPW + ')';
    }

    public GetDocRequestStaging(String str, String str2, String str3, String str4, String str5, String str6) {
        this.servicecode = str;
        this.applNo = str2;
        this.stateCode = str3;
        this.applicantCategory = str4;
        this.agentId = str5;
        this.agentPW = str6;
    }

    public /* synthetic */ GetDocRequestStaging(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
