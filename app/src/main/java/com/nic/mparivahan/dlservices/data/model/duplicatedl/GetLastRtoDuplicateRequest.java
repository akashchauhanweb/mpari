package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\b\u0010$\u001a\u00020\u0003H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/GetLastRtoDuplicateRequest;", "", "dlno", "", "dob", "agentId", "agentPwd", "agentIpAddress", "agentServiceName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getDlno", "setDlno", "getDob", "setDob", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetLastRtoDuplicateRequest {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String dlno;
    private String dob;

    public GetLastRtoDuplicateRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        this.dlno = str;
        this.dob = str2;
        this.agentId = str3;
        this.agentPwd = str4;
        this.agentIpAddress = str5;
        this.agentServiceName = str6;
    }

    public static /* synthetic */ GetLastRtoDuplicateRequest copy$default(GetLastRtoDuplicateRequest getLastRtoDuplicateRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLastRtoDuplicateRequest.dlno;
        }
        if ((i & 2) != 0) {
            str2 = getLastRtoDuplicateRequest.dob;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getLastRtoDuplicateRequest.agentId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getLastRtoDuplicateRequest.agentPwd;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getLastRtoDuplicateRequest.agentIpAddress;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getLastRtoDuplicateRequest.agentServiceName;
        }
        return getLastRtoDuplicateRequest.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDlno() {
        return this.dlno;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final GetLastRtoDuplicateRequest copy(String dlno, String dob, String agentId, String agentPwd, String agentIpAddress, String agentServiceName) {
        return new GetLastRtoDuplicateRequest(dlno, dob, agentId, agentPwd, agentIpAddress, agentServiceName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetLastRtoDuplicateRequest)) {
            return false;
        }
        GetLastRtoDuplicateRequest getLastRtoDuplicateRequest = (GetLastRtoDuplicateRequest) other;
        return Intrinsics.areEqual(this.dlno, getLastRtoDuplicateRequest.dlno) && Intrinsics.areEqual(this.dob, getLastRtoDuplicateRequest.dob) && Intrinsics.areEqual(this.agentId, getLastRtoDuplicateRequest.agentId) && Intrinsics.areEqual(this.agentPwd, getLastRtoDuplicateRequest.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, getLastRtoDuplicateRequest.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, getLastRtoDuplicateRequest.agentServiceName);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public int hashCode() {
        String str = this.dlno;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dob;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentPwd;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.agentIpAddress;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agentServiceName;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        this.agentServiceName = str;
    }

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public String toString() {
        return "{\"dlno\":\"" + this.dlno + "\", \"dob\":\"" + this.dob + "\", \"agentId\":\"" + this.agentId + "\", \"agentPwd\":\"" + this.agentPwd + "\", \"agentIpAddress\":\"" + this.agentIpAddress + "\", \"agentServiceName\":\"" + this.agentServiceName + "\"}";
    }
}
