package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zy {
    private String atteatationStatus;
    private String attestationApplicationId;
    private String attestationResInfo;
    private String authorizationListDigests;
    private String authorizationListPurpose;

    public zy(String str, String str2, String purpose, String digests, String applicationId) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(digests, "digests");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.atteatationStatus = str;
        this.attestationResInfo = str2;
        this.authorizationListPurpose = purpose;
        this.authorizationListDigests = digests;
        this.attestationApplicationId = applicationId;
    }

    public final String getAtteatationStatus() {
        return this.atteatationStatus;
    }

    public final String getAttestationApplicationId() {
        return this.attestationApplicationId;
    }

    public final String getAttestationResInfo() {
        return this.attestationResInfo;
    }

    public final String getAuthorizationListDigests() {
        return this.authorizationListDigests;
    }

    public final String getAuthorizationListPurpose() {
        return this.authorizationListPurpose;
    }

    public final void setAtteatationStatus(String str) {
        this.atteatationStatus = str;
    }

    public final void setAttestationApplicationId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.attestationApplicationId = str;
    }

    public final void setAttestationResInfo(String str) {
        this.attestationResInfo = str;
    }

    public final void setAuthorizationListDigests(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authorizationListDigests = str;
    }

    public final void setAuthorizationListPurpose(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authorizationListPurpose = str;
    }
}
