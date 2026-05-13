package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f¢\u0006\u0002\u0010\rJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0019\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fHÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011¨\u0006."}, d2 = {"Lcom/nic/mparivahan/AddCov/PojoClass/SubmitCov;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "applNumber", "applDob", "stCode", "selectedCovsList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getApplDob", "setApplDob", "getApplNumber", "setApplNumber", "getSelectedCovsList", "()Ljava/util/ArrayList;", "getStCode", "setStCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmitCov {
    private String agentId;
    private final String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String applDob;
    private String applNumber;
    private final ArrayList<String> selectedCovsList;
    private String stCode;

    public SubmitCov(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String applNumber, String applDob, String stCode, ArrayList<String> selectedCovsList) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        Intrinsics.checkNotNullParameter(applDob, "applDob");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(selectedCovsList, "selectedCovsList");
        this.agentId = agentId;
        this.agentPwd = agentPwd;
        this.agentIpAddress = agentIpAddress;
        this.agentServiceName = agentServiceName;
        this.applNumber = applNumber;
        this.applDob = applDob;
        this.stCode = stCode;
        this.selectedCovsList = selectedCovsList;
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
    public final String getApplNumber() {
        return this.applNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApplDob() {
        return this.applDob;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStCode() {
        return this.stCode;
    }

    public final ArrayList<String> component8() {
        return this.selectedCovsList;
    }

    public final SubmitCov copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String applNumber, String applDob, String stCode, ArrayList<String> selectedCovsList) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        Intrinsics.checkNotNullParameter(applDob, "applDob");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(selectedCovsList, "selectedCovsList");
        return new SubmitCov(agentId, agentPwd, agentIpAddress, agentServiceName, applNumber, applDob, stCode, selectedCovsList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitCov)) {
            return false;
        }
        SubmitCov submitCov = (SubmitCov) other;
        return Intrinsics.areEqual(this.agentId, submitCov.agentId) && Intrinsics.areEqual(this.agentPwd, submitCov.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, submitCov.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, submitCov.agentServiceName) && Intrinsics.areEqual(this.applNumber, submitCov.applNumber) && Intrinsics.areEqual(this.applDob, submitCov.applDob) && Intrinsics.areEqual(this.stCode, submitCov.stCode) && Intrinsics.areEqual(this.selectedCovsList, submitCov.selectedCovsList);
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

    public final String getApplDob() {
        return this.applDob;
    }

    public final String getApplNumber() {
        return this.applNumber;
    }

    public final ArrayList<String> getSelectedCovsList() {
        return this.selectedCovsList;
    }

    public final String getStCode() {
        return this.stCode;
    }

    public int hashCode() {
        return (((((((((((((this.agentId.hashCode() * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode()) * 31) + this.agentServiceName.hashCode()) * 31) + this.applNumber.hashCode()) * 31) + this.applDob.hashCode()) * 31) + this.stCode.hashCode()) * 31) + this.selectedCovsList.hashCode();
    }

    public final void setAgentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentId = str;
    }

    public final void setAgentPwd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setApplDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applDob = str;
    }

    public final void setApplNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applNumber = str;
    }

    public final void setStCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stCode = str;
    }

    public String toString() {
        return "SubmitCov(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", applNumber=" + this.applNumber + ", applDob=" + this.applDob + ", stCode=" + this.stCode + ", selectedCovsList=" + this.selectedCovsList + ')';
    }
}
