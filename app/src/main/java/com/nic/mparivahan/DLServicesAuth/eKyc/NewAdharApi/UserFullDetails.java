package com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006-"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/UserFullDetails;", "Ljava/io/Serializable;", "dOAuthOTP", "", "dOEkyc", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "ekyid", "finalxml", "reason", "status", "txnNo", "(Ljava/lang/String;Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDOAuthOTP", "()Ljava/lang/String;", "setDOAuthOTP", "(Ljava/lang/String;)V", "getDOEkyc", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "setDOEkyc", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;)V", "getEkyid", "setEkyid", "getFinalxml", "setFinalxml", "getReason", "setReason", "getStatus", "setStatus", "getTxnNo", "setTxnNo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UserFullDetails implements Serializable {
    private String dOAuthOTP;
    private DOEkycX dOEkyc;
    private String ekyid;
    private String finalxml;
    private String reason;
    private String status;
    private String txnNo;

    public UserFullDetails(String dOAuthOTP, DOEkycX dOEkyc, String ekyid, String finalxml, String reason, String status, String txnNo) {
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

    public static /* synthetic */ UserFullDetails copy$default(UserFullDetails userFullDetails, String str, DOEkycX dOEkycX, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userFullDetails.dOAuthOTP;
        }
        if ((i & 2) != 0) {
            dOEkycX = userFullDetails.dOEkyc;
        }
        DOEkycX dOEkycX2 = dOEkycX;
        if ((i & 4) != 0) {
            str2 = userFullDetails.ekyid;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = userFullDetails.finalxml;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = userFullDetails.reason;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = userFullDetails.status;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = userFullDetails.txnNo;
        }
        return userFullDetails.copy(str, dOEkycX2, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DOEkycX getDOEkyc() {
        return this.dOEkyc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEkyid() {
        return this.ekyid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFinalxml() {
        return this.finalxml;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }

    public final UserFullDetails copy(String dOAuthOTP, DOEkycX dOEkyc, String ekyid, String finalxml, String reason, String status, String txnNo) {
        Intrinsics.checkNotNullParameter(dOAuthOTP, "dOAuthOTP");
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        Intrinsics.checkNotNullParameter(ekyid, "ekyid");
        Intrinsics.checkNotNullParameter(finalxml, "finalxml");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(txnNo, "txnNo");
        return new UserFullDetails(dOAuthOTP, dOEkyc, ekyid, finalxml, reason, status, txnNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserFullDetails)) {
            return false;
        }
        UserFullDetails userFullDetails = (UserFullDetails) other;
        return Intrinsics.areEqual(this.dOAuthOTP, userFullDetails.dOAuthOTP) && Intrinsics.areEqual(this.dOEkyc, userFullDetails.dOEkyc) && Intrinsics.areEqual(this.ekyid, userFullDetails.ekyid) && Intrinsics.areEqual(this.finalxml, userFullDetails.finalxml) && Intrinsics.areEqual(this.reason, userFullDetails.reason) && Intrinsics.areEqual(this.status, userFullDetails.status) && Intrinsics.areEqual(this.txnNo, userFullDetails.txnNo);
    }

    public final String getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    public final DOEkycX getDOEkyc() {
        return this.dOEkyc;
    }

    public final String getEkyid() {
        return this.ekyid;
    }

    public final String getFinalxml() {
        return this.finalxml;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTxnNo() {
        return this.txnNo;
    }

    public int hashCode() {
        return (((((((((((this.dOAuthOTP.hashCode() * 31) + this.dOEkyc.hashCode()) * 31) + this.ekyid.hashCode()) * 31) + this.finalxml.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.status.hashCode()) * 31) + this.txnNo.hashCode();
    }

    public final void setDOAuthOTP(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dOAuthOTP = str;
    }

    public final void setDOEkyc(DOEkycX dOEkycX) {
        Intrinsics.checkNotNullParameter(dOEkycX, "<set-?>");
        this.dOEkyc = dOEkycX;
    }

    public final void setEkyid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ekyid = str;
    }

    public final void setFinalxml(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.finalxml = str;
    }

    public final void setReason(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reason = str;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final void setTxnNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.txnNo = str;
    }

    public String toString() {
        return "UserFullDetails(dOAuthOTP=" + this.dOAuthOTP + ", dOEkyc=" + this.dOEkyc + ", ekyid=" + this.ekyid + ", finalxml=" + this.finalxml + ", reason=" + this.reason + ", status=" + this.status + ", txnNo=" + this.txnNo + ')';
    }
}
