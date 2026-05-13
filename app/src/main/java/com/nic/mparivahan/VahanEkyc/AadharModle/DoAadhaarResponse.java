package com.nic.mparivahan.VahanEkyc.AadharModle;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "Ljava/io/Serializable;", "dOAuthOTP", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "dOEkyc", "Lcom/nic/mparivahan/VahanEkyc/Wrapper/EkycResponse/DOEkyc;", "finalxml", "", "regn_no", "status", "txnNo", "(Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;Lcom/nic/mparivahan/VahanEkyc/Wrapper/EkycResponse/DOEkyc;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDOAuthOTP", "()Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "getDOEkyc", "()Lcom/nic/mparivahan/VahanEkyc/Wrapper/EkycResponse/DOEkyc;", "getFinalxml", "()Ljava/lang/String;", "getRegn_no", "getStatus", "getTxnNo", "setTxnNo", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DoAadhaarResponse implements Serializable {
    private final AadarkycVerify.dOEkyc dOAuthOTP;
    private final DOEkyc dOEkyc;
    private final String finalxml;
    private final String regn_no;
    private final String status;
    private String txnNo;

    public DoAadhaarResponse(AadarkycVerify.dOEkyc doekyc, DOEkyc dOEkyc, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        this.dOAuthOTP = doekyc;
        this.dOEkyc = dOEkyc;
        this.finalxml = str;
        this.regn_no = str2;
        this.status = str3;
        this.txnNo = str4;
    }

    public static /* synthetic */ DoAadhaarResponse copy$default(DoAadhaarResponse doAadhaarResponse, AadarkycVerify.dOEkyc doekyc, DOEkyc dOEkyc, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            doekyc = doAadhaarResponse.dOAuthOTP;
        }
        if ((i & 2) != 0) {
            dOEkyc = doAadhaarResponse.dOEkyc;
        }
        DOEkyc dOEkyc2 = dOEkyc;
        if ((i & 4) != 0) {
            str = doAadhaarResponse.finalxml;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = doAadhaarResponse.regn_no;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = doAadhaarResponse.status;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = doAadhaarResponse.txnNo;
        }
        return doAadhaarResponse.copy(doekyc, dOEkyc2, str5, str6, str7, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AadarkycVerify.dOEkyc getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DOEkyc getDOEkyc() {
        return this.dOEkyc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFinalxml() {
        return this.finalxml;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }

    public final DoAadhaarResponse copy(AadarkycVerify.dOEkyc dOAuthOTP, DOEkyc dOEkyc, String finalxml, String regn_no, String status, String txnNo) {
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        return new DoAadhaarResponse(dOAuthOTP, dOEkyc, finalxml, regn_no, status, txnNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoAadhaarResponse)) {
            return false;
        }
        DoAadhaarResponse doAadhaarResponse = (DoAadhaarResponse) other;
        return Intrinsics.areEqual(this.dOAuthOTP, doAadhaarResponse.dOAuthOTP) && Intrinsics.areEqual(this.dOEkyc, doAadhaarResponse.dOEkyc) && Intrinsics.areEqual(this.finalxml, doAadhaarResponse.finalxml) && Intrinsics.areEqual(this.regn_no, doAadhaarResponse.regn_no) && Intrinsics.areEqual(this.status, doAadhaarResponse.status) && Intrinsics.areEqual(this.txnNo, doAadhaarResponse.txnNo);
    }

    public final AadarkycVerify.dOEkyc getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    public final DOEkyc getDOEkyc() {
        return this.dOEkyc;
    }

    public final String getFinalxml() {
        return this.finalxml;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTxnNo() {
        return this.txnNo;
    }

    public int hashCode() {
        AadarkycVerify.dOEkyc doekyc = this.dOAuthOTP;
        int iHashCode = (((doekyc == null ? 0 : doekyc.hashCode()) * 31) + this.dOEkyc.hashCode()) * 31;
        String str = this.finalxml;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regn_no;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.txnNo;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setTxnNo(String str) {
        this.txnNo = str;
    }

    public String toString() {
        return "DoAadhaarResponse(dOAuthOTP=" + this.dOAuthOTP + ", dOEkyc=" + this.dOEkyc + ", finalxml=" + this.finalxml + ", regn_no=" + this.regn_no + ", status=" + this.status + ", txnNo=" + this.txnNo + ')';
    }
}
