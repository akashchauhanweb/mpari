package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/DlRenewalInsertDocUpload;", "", "applicationNumber", "", "stCode", "agentId", "agentPW", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentPW", "setAgentPW", "getApplicationNumber", "setApplicationNumber", "getStCode", "setStCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DlRenewalInsertDocUpload {
    private String agentId;
    private String agentPW;
    private String applicationNumber;
    private String stCode;

    public DlRenewalInsertDocUpload(String applicationNumber, String stCode, String agentId, String agentPW) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPW, "agentPW");
        this.applicationNumber = applicationNumber;
        this.stCode = stCode;
        this.agentId = agentId;
        this.agentPW = agentPW;
    }

    public static /* synthetic */ DlRenewalInsertDocUpload copy$default(DlRenewalInsertDocUpload dlRenewalInsertDocUpload, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlRenewalInsertDocUpload.applicationNumber;
        }
        if ((i & 2) != 0) {
            str2 = dlRenewalInsertDocUpload.stCode;
        }
        if ((i & 4) != 0) {
            str3 = dlRenewalInsertDocUpload.agentId;
        }
        if ((i & 8) != 0) {
            str4 = dlRenewalInsertDocUpload.agentPW;
        }
        return dlRenewalInsertDocUpload.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStCode() {
        return this.stCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgentPW() {
        return this.agentPW;
    }

    public final DlRenewalInsertDocUpload copy(String applicationNumber, String stCode, String agentId, String agentPW) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPW, "agentPW");
        return new DlRenewalInsertDocUpload(applicationNumber, stCode, agentId, agentPW);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlRenewalInsertDocUpload)) {
            return false;
        }
        DlRenewalInsertDocUpload dlRenewalInsertDocUpload = (DlRenewalInsertDocUpload) other;
        return Intrinsics.areEqual(this.applicationNumber, dlRenewalInsertDocUpload.applicationNumber) && Intrinsics.areEqual(this.stCode, dlRenewalInsertDocUpload.stCode) && Intrinsics.areEqual(this.agentId, dlRenewalInsertDocUpload.agentId) && Intrinsics.areEqual(this.agentPW, dlRenewalInsertDocUpload.agentPW);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentPW() {
        return this.agentPW;
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final String getStCode() {
        return this.stCode;
    }

    public int hashCode() {
        return (((((this.applicationNumber.hashCode() * 31) + this.stCode.hashCode()) * 31) + this.agentId.hashCode()) * 31) + this.agentPW.hashCode();
    }

    public final void setAgentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentId = str;
    }

    public final void setAgentPW(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentPW = str;
    }

    public final void setApplicationNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applicationNumber = str;
    }

    public final void setStCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stCode = str;
    }

    public String toString() {
        return "DlRenewalInsertDocUpload(applicationNumber=" + this.applicationNumber + ", stCode=" + this.stCode + ", agentId=" + this.agentId + ", agentPW=" + this.agentPW + ')';
    }
}
