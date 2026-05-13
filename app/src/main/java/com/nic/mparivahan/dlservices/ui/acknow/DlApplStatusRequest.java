package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/acknow/DlApplStatusRequest;", "", "applicationNumber", "", "dateOfBirth", "agentServiceName", "agentId", "agentPwd", "agentIpAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "getAgentIpAddress", "getAgentPwd", "getAgentServiceName", "getApplicationNumber", "getDateOfBirth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlApplStatusRequest {
    private final String agentId;
    private final String agentIpAddress;
    private final String agentPwd;
    private final String agentServiceName;
    private final String applicationNumber;
    private final String dateOfBirth;

    public DlApplStatusRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ DlApplStatusRequest copy$default(DlApplStatusRequest dlApplStatusRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlApplStatusRequest.applicationNumber;
        }
        if ((i & 2) != 0) {
            str2 = dlApplStatusRequest.dateOfBirth;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = dlApplStatusRequest.agentServiceName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = dlApplStatusRequest.agentId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = dlApplStatusRequest.agentPwd;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = dlApplStatusRequest.agentIpAddress;
        }
        return dlApplStatusRequest.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final DlApplStatusRequest copy(String applicationNumber, String dateOfBirth, String agentServiceName, String agentId, String agentPwd, String agentIpAddress) {
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        return new DlApplStatusRequest(applicationNumber, dateOfBirth, agentServiceName, agentId, agentPwd, agentIpAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlApplStatusRequest)) {
            return false;
        }
        DlApplStatusRequest dlApplStatusRequest = (DlApplStatusRequest) other;
        return Intrinsics.areEqual(this.applicationNumber, dlApplStatusRequest.applicationNumber) && Intrinsics.areEqual(this.dateOfBirth, dlApplStatusRequest.dateOfBirth) && Intrinsics.areEqual(this.agentServiceName, dlApplStatusRequest.agentServiceName) && Intrinsics.areEqual(this.agentId, dlApplStatusRequest.agentId) && Intrinsics.areEqual(this.agentPwd, dlApplStatusRequest.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, dlApplStatusRequest.agentIpAddress);
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

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int hashCode() {
        String str = this.applicationNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dateOfBirth;
        return ((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.agentServiceName.hashCode()) * 31) + this.agentId.hashCode()) * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode();
    }

    public String toString() {
        return "DlApplStatusRequest(applicationNumber=" + this.applicationNumber + ", dateOfBirth=" + this.dateOfBirth + ", agentServiceName=" + this.agentServiceName + ", agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ')';
    }

    public DlApplStatusRequest(String str, String str2, String agentServiceName, String agentId, String agentPwd, String agentIpAddress) {
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        this.applicationNumber = str;
        this.dateOfBirth = str2;
        this.agentServiceName = agentServiceName;
        this.agentId = agentId;
        this.agentPwd = agentPwd;
        this.agentIpAddress = agentIpAddress;
    }

    public /* synthetic */ DlApplStatusRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0 ? str2 : null, (i & 4) != 0 ? "sarathiservice" : str3, (i & 8) != 0 ? "mobSARATHI" : str4, (i & 16) != 0 ? "657d1c758e2e95af0014e16f5109f933" : str5, (i & 32) != 0 ? "657d1c758e2e95af0014e16f5109f933" : str6);
    }
}
