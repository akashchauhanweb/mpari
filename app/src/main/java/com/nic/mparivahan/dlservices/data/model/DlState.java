package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlState;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlState {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;

    public DlState(String str, String str2, String str3, String str4) {
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
    }

    public static /* synthetic */ DlState copy$default(DlState dlState, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlState.agentId;
        }
        if ((i & 2) != 0) {
            str2 = dlState.agentPwd;
        }
        if ((i & 4) != 0) {
            str3 = dlState.agentIpAddress;
        }
        if ((i & 8) != 0) {
            str4 = dlState.agentServiceName;
        }
        return dlState.copy(str, str2, str3, str4);
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

    public final DlState copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName) {
        return new DlState(agentId, agentPwd, agentIpAddress, agentServiceName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlState)) {
            return false;
        }
        DlState dlState = (DlState) other;
        return Intrinsics.areEqual(this.agentId, dlState.agentId) && Intrinsics.areEqual(this.agentPwd, dlState.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, dlState.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, dlState.agentServiceName);
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

    public int hashCode() {
        String str = this.agentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentPwd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentIpAddress;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentServiceName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
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

    public String toString() {
        return "DlState(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ')';
    }
}
