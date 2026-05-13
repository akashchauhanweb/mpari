package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlDist;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "stCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getStCode", "setStCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlDist {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String stCode;

    public DlDist(String str, String str2, String str3, String str4, String stCode) {
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.stCode = stCode;
    }

    public static /* synthetic */ DlDist copy$default(DlDist dlDist, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlDist.agentId;
        }
        if ((i & 2) != 0) {
            str2 = dlDist.agentPwd;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dlDist.agentIpAddress;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = dlDist.agentServiceName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = dlDist.stCode;
        }
        return dlDist.copy(str, str6, str7, str8, str5);
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

    public final DlDist copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String stCode) {
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        return new DlDist(agentId, agentPwd, agentIpAddress, agentServiceName, stCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlDist)) {
            return false;
        }
        DlDist dlDist = (DlDist) other;
        return Intrinsics.areEqual(this.agentId, dlDist.agentId) && Intrinsics.areEqual(this.agentPwd, dlDist.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, dlDist.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, dlDist.agentServiceName) && Intrinsics.areEqual(this.stCode, dlDist.stCode);
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
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.stCode.hashCode();
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

    public final void setStCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stCode = str;
    }

    public String toString() {
        return "DlDist(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", stCode=" + this.stCode + ')';
    }
}
