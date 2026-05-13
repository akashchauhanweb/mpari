package com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/TokenGeneration;", "", "authorization", "", "reason", "serviceId", "status", "traceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorization", "()Ljava/lang/String;", "getReason", "getServiceId", "getStatus", "getTraceId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TokenGeneration {
    private final String authorization;
    private final String reason;
    private final String serviceId;
    private final String status;
    private final String traceId;

    public TokenGeneration(String authorization, String reason, String serviceId, String status, String traceId) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        this.authorization = authorization;
        this.reason = reason;
        this.serviceId = serviceId;
        this.status = status;
        this.traceId = traceId;
    }

    public static /* synthetic */ TokenGeneration copy$default(TokenGeneration tokenGeneration, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenGeneration.authorization;
        }
        if ((i & 2) != 0) {
            str2 = tokenGeneration.reason;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = tokenGeneration.serviceId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = tokenGeneration.status;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = tokenGeneration.traceId;
        }
        return tokenGeneration.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    public final TokenGeneration copy(String authorization, String reason, String serviceId, String status, String traceId) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        return new TokenGeneration(authorization, reason, serviceId, status, traceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenGeneration)) {
            return false;
        }
        TokenGeneration tokenGeneration = (TokenGeneration) other;
        return Intrinsics.areEqual(this.authorization, tokenGeneration.authorization) && Intrinsics.areEqual(this.reason, tokenGeneration.reason) && Intrinsics.areEqual(this.serviceId, tokenGeneration.serviceId) && Intrinsics.areEqual(this.status, tokenGeneration.status) && Intrinsics.areEqual(this.traceId, tokenGeneration.traceId);
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return (((((((this.authorization.hashCode() * 31) + this.reason.hashCode()) * 31) + this.serviceId.hashCode()) * 31) + this.status.hashCode()) * 31) + this.traceId.hashCode();
    }

    public String toString() {
        return "TokenGeneration(authorization=" + this.authorization + ", reason=" + this.reason + ", serviceId=" + this.serviceId + ", status=" + this.status + ", traceId=" + this.traceId + ')';
    }
}
