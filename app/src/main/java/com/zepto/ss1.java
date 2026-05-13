package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ss1 {
    private String cloudProjectNum;
    private ij1 deviceRecognitionVerdict;
    private Boolean isUpdateRequired;
    private String isblacklisting;
    private String networkAddress = "";
    private String rootStatus;
    private Boolean ruleUpdateFlag;
    private long serverCurrentTimestamp;
    private String sessionId;
    private String status;
    private String statusDesc;

    public ss1() {
        Boolean bool = Boolean.FALSE;
        this.isUpdateRequired = bool;
        this.cloudProjectNum = "";
        this.ruleUpdateFlag = bool;
    }

    public final String getCloudProjectNum() {
        return this.cloudProjectNum;
    }

    public final ij1 getDeviceRecognitionVerdict() {
        return this.deviceRecognitionVerdict;
    }

    public final String getIsblacklisting() {
        return this.isblacklisting;
    }

    public final String getNetworkAddress() {
        return this.networkAddress;
    }

    public final String getRootStatus() {
        return this.rootStatus;
    }

    public final Boolean getRuleUpdateFlag() {
        return this.ruleUpdateFlag;
    }

    public final long getServerCurrentTimestamp() {
        return this.serverCurrentTimestamp;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final Boolean isUpdateRequired() {
        return this.isUpdateRequired;
    }

    public final void setCloudProjectNum(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cloudProjectNum = str;
    }

    public final void setDeviceRecognitionVerdict(ij1 ij1Var) {
        this.deviceRecognitionVerdict = ij1Var;
    }

    public final void setIsblacklisting(String str) {
        this.isblacklisting = str;
    }

    public final void setNetworkAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.networkAddress = str;
    }

    public final void setRootStatus(String str) {
        this.rootStatus = str;
    }

    public final void setRuleUpdateFlag(Boolean bool) {
        this.ruleUpdateFlag = bool;
    }

    public final void setServerCurrentTimestamp(long j) {
        this.serverCurrentTimestamp = j;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public final void setUpdateRequired(Boolean bool) {
        this.isUpdateRequired = bool;
    }
}
