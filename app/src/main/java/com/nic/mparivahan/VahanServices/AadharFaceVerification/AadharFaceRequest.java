package com.nic.mparivahan.VahanServices.AadharFaceVerification;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0017¨\u0006*"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/AadharFaceRequest;", "Ljava/io/Serializable;", "dOEkyc", "Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoEkycResponseModal;", "finalxml", "", "regn_no", "status", "txnNo", "reason", "pur_cd", "", "(Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoEkycResponseModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDOEkyc", "()Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/DoEkycResponseModal;", "getFinalxml", "()Ljava/lang/String;", "getPur_cd", "()I", "setPur_cd", "(I)V", "getReason", "setReason", "(Ljava/lang/String;)V", "getRegn_no", "getStatus", "getTxnNo", "setTxnNo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AadharFaceRequest implements Serializable {
    private final DoEkycResponseModal dOEkyc;
    private final String finalxml;
    private int pur_cd;
    private String reason;
    private final String regn_no;
    private final String status;
    private String txnNo;

    public AadharFaceRequest(DoEkycResponseModal dOEkyc, String str, String str2, String str3, String str4, String str5, int i) {
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        this.dOEkyc = dOEkyc;
        this.finalxml = str;
        this.regn_no = str2;
        this.status = str3;
        this.txnNo = str4;
        this.reason = str5;
        this.pur_cd = i;
    }

    public static /* synthetic */ AadharFaceRequest copy$default(AadharFaceRequest aadharFaceRequest, DoEkycResponseModal doEkycResponseModal, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            doEkycResponseModal = aadharFaceRequest.dOEkyc;
        }
        if ((i2 & 2) != 0) {
            str = aadharFaceRequest.finalxml;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = aadharFaceRequest.regn_no;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = aadharFaceRequest.status;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = aadharFaceRequest.txnNo;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = aadharFaceRequest.reason;
        }
        String str10 = str5;
        if ((i2 & 64) != 0) {
            i = aadharFaceRequest.pur_cd;
        }
        return aadharFaceRequest.copy(doEkycResponseModal, str6, str7, str8, str9, str10, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DoEkycResponseModal getDOEkyc() {
        return this.dOEkyc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFinalxml() {
        return this.finalxml;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final AadharFaceRequest copy(DoEkycResponseModal dOEkyc, String finalxml, String regn_no, String status, String txnNo, String reason, int pur_cd) {
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        return new AadharFaceRequest(dOEkyc, finalxml, regn_no, status, txnNo, reason, pur_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AadharFaceRequest)) {
            return false;
        }
        AadharFaceRequest aadharFaceRequest = (AadharFaceRequest) other;
        return Intrinsics.areEqual(this.dOEkyc, aadharFaceRequest.dOEkyc) && Intrinsics.areEqual(this.finalxml, aadharFaceRequest.finalxml) && Intrinsics.areEqual(this.regn_no, aadharFaceRequest.regn_no) && Intrinsics.areEqual(this.status, aadharFaceRequest.status) && Intrinsics.areEqual(this.txnNo, aadharFaceRequest.txnNo) && Intrinsics.areEqual(this.reason, aadharFaceRequest.reason) && this.pur_cd == aadharFaceRequest.pur_cd;
    }

    public final DoEkycResponseModal getDOEkyc() {
        return this.dOEkyc;
    }

    public final String getFinalxml() {
        return this.finalxml;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getReason() {
        return this.reason;
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
        int iHashCode = this.dOEkyc.hashCode() * 31;
        String str = this.finalxml;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regn_no;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.txnNo;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.reason;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.pur_cd);
    }

    public final void setPur_cd(int i) {
        this.pur_cd = i;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setTxnNo(String str) {
        this.txnNo = str;
    }

    public String toString() {
        return "AadharFaceRequest(dOEkyc=" + this.dOEkyc + ", finalxml=" + this.finalxml + ", regn_no=" + this.regn_no + ", status=" + this.status + ", txnNo=" + this.txnNo + ", reason=" + this.reason + ", pur_cd=" + this.pur_cd + ')';
    }
}
