package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zk2 {

    @xy5("encryptedResponse")
    private String encryptedResponse;
    private String message;

    @xy5("sslDtls")
    private c66 sslDtls;

    @xy5("status")
    private String status;

    @xy5("statusDesc")
    private String statusDescription;

    @xy5("sslPublicKey")
    private String sslPublicKey = "";

    @xy5("trust")
    private String trust = "";

    public final String getEncryptedResponse() {
        return this.encryptedResponse;
    }

    public final String getMessage() {
        return this.message;
    }

    public final c66 getSslDtls() {
        return this.sslDtls;
    }

    public final String getSslPublicKey() {
        return this.sslPublicKey;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusDescription() {
        return this.statusDescription;
    }

    public final String getTrust() {
        return this.trust;
    }

    public final void setEncryptedResponse(String str) {
        this.encryptedResponse = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSslDtls(c66 c66Var) {
        this.sslDtls = c66Var;
    }

    public final void setSslPublicKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sslPublicKey = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStatusDescription(String str) {
        this.statusDescription = str;
    }

    public final void setTrust(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trust = str;
    }
}
