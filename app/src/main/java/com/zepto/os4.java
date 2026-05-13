package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class os4 {

    @xy5("safetyNetResponse")
    private final String safetyNetResp;

    @xy5("status")
    private String status;

    @xy5("statusDesc")
    private String statusDesc;

    public os4() {
        this(null, null, null, 7, null);
    }

    public final String getSafetyNetResp() {
        return this.safetyNetResp;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public os4(String str, String str2, String str3) {
        this.status = str;
        this.statusDesc = str2;
        this.safetyNetResp = str3;
    }

    public /* synthetic */ os4(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
