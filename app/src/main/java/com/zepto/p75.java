package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p75 {
    private long serverCurrentTimestamp;

    @xy5("status")
    private String status;

    @xy5("jwtToken")
    private String token;
    private String value;
    private String networkAddress = "";

    @xy5("sslPublicKey")
    private String sslPublicKey = "";

    @xy5("trust")
    private String trust = "";

    public final String getNetworkAddress() {
        return this.networkAddress;
    }

    public final long getServerCurrentTimestamp() {
        return this.serverCurrentTimestamp;
    }

    public final String getSslPublicKey() {
        return this.sslPublicKey;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTrust() {
        return this.trust;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setNetworkAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.networkAddress = str;
    }

    public final void setServerCurrentTimestamp(long j) {
        this.serverCurrentTimestamp = j;
    }

    public final void setSslPublicKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sslPublicKey = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setTrust(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trust = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }
}
