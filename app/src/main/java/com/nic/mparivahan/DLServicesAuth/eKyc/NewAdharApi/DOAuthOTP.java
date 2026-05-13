package com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0001HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0001HÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOAuthOTP;", "", "actionErrorCode", "email", "errorCode", "last_four_mobile", "", "mobileverify", "", "reason", "status", "uidtkn", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "getActionErrorCode", "()Ljava/lang/Object;", "getEmail", "getErrorCode", "getLast_four_mobile", "()Ljava/lang/String;", "getMobileverify", "()Z", "getReason", "getStatus", "getUidtkn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DOAuthOTP {
    private final Object actionErrorCode;
    private final Object email;
    private final Object errorCode;
    private final String last_four_mobile;
    private final boolean mobileverify;
    private final Object reason;
    private final String status;
    private final Object uidtkn;

    public DOAuthOTP(Object actionErrorCode, Object email, Object errorCode, String last_four_mobile, boolean z, Object reason, String status, Object uidtkn) {
        Intrinsics.checkNotNullParameter(actionErrorCode, "actionErrorCode");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(last_four_mobile, "last_four_mobile");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(uidtkn, "uidtkn");
        this.actionErrorCode = actionErrorCode;
        this.email = email;
        this.errorCode = errorCode;
        this.last_four_mobile = last_four_mobile;
        this.mobileverify = z;
        this.reason = reason;
        this.status = status;
        this.uidtkn = uidtkn;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getActionErrorCode() {
        return this.actionErrorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLast_four_mobile() {
        return this.last_four_mobile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMobileverify() {
        return this.mobileverify;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getUidtkn() {
        return this.uidtkn;
    }

    public final DOAuthOTP copy(Object actionErrorCode, Object email, Object errorCode, String last_four_mobile, boolean mobileverify, Object reason, String status, Object uidtkn) {
        Intrinsics.checkNotNullParameter(actionErrorCode, "actionErrorCode");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(last_four_mobile, "last_four_mobile");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(uidtkn, "uidtkn");
        return new DOAuthOTP(actionErrorCode, email, errorCode, last_four_mobile, mobileverify, reason, status, uidtkn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DOAuthOTP)) {
            return false;
        }
        DOAuthOTP dOAuthOTP = (DOAuthOTP) other;
        return Intrinsics.areEqual(this.actionErrorCode, dOAuthOTP.actionErrorCode) && Intrinsics.areEqual(this.email, dOAuthOTP.email) && Intrinsics.areEqual(this.errorCode, dOAuthOTP.errorCode) && Intrinsics.areEqual(this.last_four_mobile, dOAuthOTP.last_four_mobile) && this.mobileverify == dOAuthOTP.mobileverify && Intrinsics.areEqual(this.reason, dOAuthOTP.reason) && Intrinsics.areEqual(this.status, dOAuthOTP.status) && Intrinsics.areEqual(this.uidtkn, dOAuthOTP.uidtkn);
    }

    public final Object getActionErrorCode() {
        return this.actionErrorCode;
    }

    public final Object getEmail() {
        return this.email;
    }

    public final Object getErrorCode() {
        return this.errorCode;
    }

    public final String getLast_four_mobile() {
        return this.last_four_mobile;
    }

    public final boolean getMobileverify() {
        return this.mobileverify;
    }

    public final Object getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Object getUidtkn() {
        return this.uidtkn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.actionErrorCode.hashCode() * 31) + this.email.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.last_four_mobile.hashCode()) * 31;
        boolean z = this.mobileverify;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((iHashCode + r1) * 31) + this.reason.hashCode()) * 31) + this.status.hashCode()) * 31) + this.uidtkn.hashCode();
    }

    public String toString() {
        return "DOAuthOTP(actionErrorCode=" + this.actionErrorCode + ", email=" + this.email + ", errorCode=" + this.errorCode + ", last_four_mobile=" + this.last_four_mobile + ", mobileverify=" + this.mobileverify + ", reason=" + this.reason + ", status=" + this.status + ", uidtkn=" + this.uidtkn + ')';
    }
}
