package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlTaluka;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "stCode", "distCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getDistCode", "setDistCode", "getStCode", "setStCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlTaluka {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String distCode;
    private String stCode;

    public DlTaluka(String str, String str2, String str3, String str4, String stCode, String distCode) {
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(distCode, "distCode");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.stCode = stCode;
        this.distCode = distCode;
    }

    public static /* synthetic */ DlTaluka copy$default(DlTaluka dlTaluka, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlTaluka.agentId;
        }
        if ((i & 2) != 0) {
            str2 = dlTaluka.agentPwd;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = dlTaluka.agentIpAddress;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = dlTaluka.agentServiceName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = dlTaluka.stCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = dlTaluka.distCode;
        }
        return dlTaluka.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStCode() {
        return this.stCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDistCode() {
        return this.distCode;
    }

    public final DlTaluka copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String stCode, String distCode) {
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(distCode, "distCode");
        return new DlTaluka(agentId, agentPwd, agentIpAddress, agentServiceName, stCode, distCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlTaluka)) {
            return false;
        }
        DlTaluka dlTaluka = (DlTaluka) other;
        return Intrinsics.areEqual(this.agentId, dlTaluka.agentId) && Intrinsics.areEqual(this.agentPwd, dlTaluka.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, dlTaluka.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, dlTaluka.agentServiceName) && Intrinsics.areEqual(this.stCode, dlTaluka.stCode) && Intrinsics.areEqual(this.distCode, dlTaluka.distCode);
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

    public final String getDistCode() {
        return this.distCode;
    }

    public final String getStCode() {
        return this.stCode;
    }

    public int hashCode() {
        String str = this.agentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentPwd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentIpAddress;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentServiceName;
        return ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.stCode.hashCode()) * 31) + this.distCode.hashCode();
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

    public final void setDistCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.distCode = str;
    }

    public final void setStCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stCode = str;
    }

    public String toString() {
        return "DlTaluka(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", stCode=" + this.stCode + ", distCode=" + this.distCode + ')';
    }
}
