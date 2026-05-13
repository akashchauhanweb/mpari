package com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0001HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/NewAdharResponse;", "", "dOAuthOTP", "dOEkyc", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkyc;", "ekyid", "finalxml", "", "reason", "status", "txnNo", "(Ljava/lang/Object;Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkyc;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "getDOAuthOTP", "()Ljava/lang/Object;", "getDOEkyc", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkyc;", "getEkyid", "getFinalxml", "()Ljava/lang/String;", "getReason", "getStatus", "getTxnNo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NewAdharResponse {
    private final Object dOAuthOTP;
    private final DOEkyc dOEkyc;
    private final Object ekyid;
    private final String finalxml;
    private final Object reason;
    private final String status;
    private final Object txnNo;

    public NewAdharResponse(Object dOAuthOTP, DOEkyc dOEkyc, Object ekyid, String finalxml, Object reason, String status, Object txnNo) {
        Intrinsics.checkNotNullParameter(dOAuthOTP, "dOAuthOTP");
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        Intrinsics.checkNotNullParameter(ekyid, "ekyid");
        Intrinsics.checkNotNullParameter(finalxml, "finalxml");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(txnNo, "txnNo");
        this.dOAuthOTP = dOAuthOTP;
        this.dOEkyc = dOEkyc;
        this.ekyid = ekyid;
        this.finalxml = finalxml;
        this.reason = reason;
        this.status = status;
        this.txnNo = txnNo;
    }

    public static /* synthetic */ NewAdharResponse copy$default(NewAdharResponse newAdharResponse, Object obj, DOEkyc dOEkyc, Object obj2, String str, Object obj3, String str2, Object obj4, int i, Object obj5) {
        if ((i & 1) != 0) {
            obj = newAdharResponse.dOAuthOTP;
        }
        if ((i & 2) != 0) {
            dOEkyc = newAdharResponse.dOEkyc;
        }
        DOEkyc dOEkyc2 = dOEkyc;
        if ((i & 4) != 0) {
            obj2 = newAdharResponse.ekyid;
        }
        Object obj6 = obj2;
        if ((i & 8) != 0) {
            str = newAdharResponse.finalxml;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            obj3 = newAdharResponse.reason;
        }
        Object obj7 = obj3;
        if ((i & 32) != 0) {
            str2 = newAdharResponse.status;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            obj4 = newAdharResponse.txnNo;
        }
        return newAdharResponse.copy(obj, dOEkyc2, obj6, str3, obj7, str4, obj4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DOEkyc getDOEkyc() {
        return this.dOEkyc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getEkyid() {
        return this.ekyid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFinalxml() {
        return this.finalxml;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getTxnNo() {
        return this.txnNo;
    }

    public final NewAdharResponse copy(Object dOAuthOTP, DOEkyc dOEkyc, Object ekyid, String finalxml, Object reason, String status, Object txnNo) {
        Intrinsics.checkNotNullParameter(dOAuthOTP, "dOAuthOTP");
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        Intrinsics.checkNotNullParameter(ekyid, "ekyid");
        Intrinsics.checkNotNullParameter(finalxml, "finalxml");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(txnNo, "txnNo");
        return new NewAdharResponse(dOAuthOTP, dOEkyc, ekyid, finalxml, reason, status, txnNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewAdharResponse)) {
            return false;
        }
        NewAdharResponse newAdharResponse = (NewAdharResponse) other;
        return Intrinsics.areEqual(this.dOAuthOTP, newAdharResponse.dOAuthOTP) && Intrinsics.areEqual(this.dOEkyc, newAdharResponse.dOEkyc) && Intrinsics.areEqual(this.ekyid, newAdharResponse.ekyid) && Intrinsics.areEqual(this.finalxml, newAdharResponse.finalxml) && Intrinsics.areEqual(this.reason, newAdharResponse.reason) && Intrinsics.areEqual(this.status, newAdharResponse.status) && Intrinsics.areEqual(this.txnNo, newAdharResponse.txnNo);
    }

    public final Object getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    public final DOEkyc getDOEkyc() {
        return this.dOEkyc;
    }

    public final Object getEkyid() {
        return this.ekyid;
    }

    public final String getFinalxml() {
        return this.finalxml;
    }

    public final Object getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Object getTxnNo() {
        return this.txnNo;
    }

    public int hashCode() {
        return (((((((((((this.dOAuthOTP.hashCode() * 31) + this.dOEkyc.hashCode()) * 31) + this.ekyid.hashCode()) * 31) + this.finalxml.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.status.hashCode()) * 31) + this.txnNo.hashCode();
    }

    public String toString() {
        return "NewAdharResponse(dOAuthOTP=" + this.dOAuthOTP + ", dOEkyc=" + this.dOEkyc + ", ekyid=" + this.ekyid + ", finalxml=" + this.finalxml + ", reason=" + this.reason + ", status=" + this.status + ", txnNo=" + this.txnNo + ')';
    }
}
