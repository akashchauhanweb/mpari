package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class ks0 {

    @xy5("errCode")
    private String errCode;

    @xy5("errDesc")
    private String errDesc;

    @x62
    @xy5("isSafetyNetDone")
    private String isSafetyNetDone;

    @x62
    @xy5("isUpdateRequired")
    private String isUpdateRequired;

    @x62
    @xy5("requestInfo")
    private qc5 requestInfo;

    @xy5("ruleChainObj")
    private if5 ruleConfigure;

    @xy5("server_token")
    private String serverToken;

    @x62
    @xy5("status")
    private String status;

    @x62
    @xy5("statusDesc")
    private String statusDesc;

    public final String getErrCode() {
        return this.errCode;
    }

    public final String getErrDesc() {
        return this.errDesc;
    }

    public final qc5 getRequestInfo() {
        return this.requestInfo;
    }

    public final if5 getRuleConfigure() {
        return this.ruleConfigure;
    }

    public final String getServerToken() {
        return this.serverToken;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final String isSafetyNetDone() {
        return this.isSafetyNetDone;
    }

    public final String isUpdateRequired() {
        return this.isUpdateRequired;
    }

    public final void setErrCode(String str) {
        this.errCode = str;
    }

    public final void setErrDesc(String str) {
        this.errDesc = str;
    }

    public final void setRequestInfo(qc5 qc5Var) {
        this.requestInfo = qc5Var;
    }

    public final void setRuleConfigure(if5 if5Var) {
        this.ruleConfigure = if5Var;
    }

    public final void setSafetyNetDone(String str) {
        this.isSafetyNetDone = str;
    }

    public final void setServerToken(String str) {
        this.serverToken = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public final void setUpdateRequired(String str) {
        this.isUpdateRequired = str;
    }
}
