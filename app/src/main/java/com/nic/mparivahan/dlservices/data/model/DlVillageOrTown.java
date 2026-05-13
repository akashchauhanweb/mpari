package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Ja\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006-"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlVillageOrTown;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "stCode", "distCode", "subDistCode", "villageOrTown", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getDistCode", "setDistCode", "getStCode", "setStCode", "getSubDistCode", "setSubDistCode", "getVillageOrTown", "setVillageOrTown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlVillageOrTown {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String distCode;
    private String stCode;
    private String subDistCode;
    private String villageOrTown;

    public DlVillageOrTown(String str, String str2, String str3, String str4, String stCode, String distCode, String subDistCode, String villageOrTown) {
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(distCode, "distCode");
        Intrinsics.checkNotNullParameter(subDistCode, "subDistCode");
        Intrinsics.checkNotNullParameter(villageOrTown, "villageOrTown");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = str4;
        this.stCode = stCode;
        this.distCode = distCode;
        this.subDistCode = subDistCode;
        this.villageOrTown = villageOrTown;
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

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubDistCode() {
        return this.subDistCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVillageOrTown() {
        return this.villageOrTown;
    }

    public final DlVillageOrTown copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String stCode, String distCode, String subDistCode, String villageOrTown) {
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(distCode, "distCode");
        Intrinsics.checkNotNullParameter(subDistCode, "subDistCode");
        Intrinsics.checkNotNullParameter(villageOrTown, "villageOrTown");
        return new DlVillageOrTown(agentId, agentPwd, agentIpAddress, agentServiceName, stCode, distCode, subDistCode, villageOrTown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlVillageOrTown)) {
            return false;
        }
        DlVillageOrTown dlVillageOrTown = (DlVillageOrTown) other;
        return Intrinsics.areEqual(this.agentId, dlVillageOrTown.agentId) && Intrinsics.areEqual(this.agentPwd, dlVillageOrTown.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, dlVillageOrTown.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, dlVillageOrTown.agentServiceName) && Intrinsics.areEqual(this.stCode, dlVillageOrTown.stCode) && Intrinsics.areEqual(this.distCode, dlVillageOrTown.distCode) && Intrinsics.areEqual(this.subDistCode, dlVillageOrTown.subDistCode) && Intrinsics.areEqual(this.villageOrTown, dlVillageOrTown.villageOrTown);
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

    public final String getSubDistCode() {
        return this.subDistCode;
    }

    public final String getVillageOrTown() {
        return this.villageOrTown;
    }

    public int hashCode() {
        String str = this.agentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentPwd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentIpAddress;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentServiceName;
        return ((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.stCode.hashCode()) * 31) + this.distCode.hashCode()) * 31) + this.subDistCode.hashCode()) * 31) + this.villageOrTown.hashCode();
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

    public final void setSubDistCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subDistCode = str;
    }

    public final void setVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.villageOrTown = str;
    }

    public String toString() {
        return "DlVillageOrTown(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", stCode=" + this.stCode + ", distCode=" + this.distCode + ", subDistCode=" + this.subDistCode + ", villageOrTown=" + this.villageOrTown + ')';
    }
}
