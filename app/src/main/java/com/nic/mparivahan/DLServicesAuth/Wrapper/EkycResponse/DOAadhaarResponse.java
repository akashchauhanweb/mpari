package com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00063"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOAadhaarResponse;", "Landroid/os/Parcelable;", "biodeviceinfo", "", "dOAuthOTP", "Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOAuthOTP;", "dOEkyc", "Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOEkyc;", "finalxml", "pur_cd", "", "reason", "regn_no", "status", "txnNo", "(Ljava/lang/String;Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOAuthOTP;Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOEkyc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBiodeviceinfo", "()Ljava/lang/String;", "getDOAuthOTP", "()Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOAuthOTP;", "getDOEkyc", "()Lcom/nic/mparivahan/DLServicesAuth/Wrapper/EkycResponse/DOEkyc;", "getFinalxml", "getPur_cd", "()I", "getReason", "getRegn_no", "getStatus", "getTxnNo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DOAadhaarResponse implements Parcelable {
    public static final Parcelable.Creator<DOAadhaarResponse> CREATOR = new a();
    private final String biodeviceinfo;
    private final DOAuthOTP dOAuthOTP;
    private final DOEkyc dOEkyc;
    private final String finalxml;
    private final int pur_cd;
    private final String reason;
    private final String regn_no;
    private final String status;
    private final String txnNo;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DOAadhaarResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DOAadhaarResponse(parcel.readString(), DOAuthOTP.CREATOR.createFromParcel(parcel), DOEkyc.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DOAadhaarResponse[] newArray(int i) {
            return new DOAadhaarResponse[i];
        }
    }

    public DOAadhaarResponse(String biodeviceinfo, DOAuthOTP dOAuthOTP, DOEkyc dOEkyc, String finalxml, int i, String reason, String regn_no, String status, String txnNo) {
        Intrinsics.checkNotNullParameter(biodeviceinfo, "biodeviceinfo");
        Intrinsics.checkNotNullParameter(dOAuthOTP, "dOAuthOTP");
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        Intrinsics.checkNotNullParameter(finalxml, "finalxml");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(txnNo, "txnNo");
        this.biodeviceinfo = biodeviceinfo;
        this.dOAuthOTP = dOAuthOTP;
        this.dOEkyc = dOEkyc;
        this.finalxml = finalxml;
        this.pur_cd = i;
        this.reason = reason;
        this.regn_no = regn_no;
        this.status = status;
        this.txnNo = txnNo;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiodeviceinfo() {
        return this.biodeviceinfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DOAuthOTP getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DOEkyc getDOEkyc() {
        return this.dOEkyc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFinalxml() {
        return this.finalxml;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }

    public final DOAadhaarResponse copy(String biodeviceinfo, DOAuthOTP dOAuthOTP, DOEkyc dOEkyc, String finalxml, int pur_cd, String reason, String regn_no, String status, String txnNo) {
        Intrinsics.checkNotNullParameter(biodeviceinfo, "biodeviceinfo");
        Intrinsics.checkNotNullParameter(dOAuthOTP, "dOAuthOTP");
        Intrinsics.checkNotNullParameter(dOEkyc, "dOEkyc");
        Intrinsics.checkNotNullParameter(finalxml, "finalxml");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(txnNo, "txnNo");
        return new DOAadhaarResponse(biodeviceinfo, dOAuthOTP, dOEkyc, finalxml, pur_cd, reason, regn_no, status, txnNo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DOAadhaarResponse)) {
            return false;
        }
        DOAadhaarResponse dOAadhaarResponse = (DOAadhaarResponse) other;
        return Intrinsics.areEqual(this.biodeviceinfo, dOAadhaarResponse.biodeviceinfo) && Intrinsics.areEqual(this.dOAuthOTP, dOAadhaarResponse.dOAuthOTP) && Intrinsics.areEqual(this.dOEkyc, dOAadhaarResponse.dOEkyc) && Intrinsics.areEqual(this.finalxml, dOAadhaarResponse.finalxml) && this.pur_cd == dOAadhaarResponse.pur_cd && Intrinsics.areEqual(this.reason, dOAadhaarResponse.reason) && Intrinsics.areEqual(this.regn_no, dOAadhaarResponse.regn_no) && Intrinsics.areEqual(this.status, dOAadhaarResponse.status) && Intrinsics.areEqual(this.txnNo, dOAadhaarResponse.txnNo);
    }

    public final String getBiodeviceinfo() {
        return this.biodeviceinfo;
    }

    public final DOAuthOTP getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    public final DOEkyc getDOEkyc() {
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
        return (((((((((((((((this.biodeviceinfo.hashCode() * 31) + this.dOAuthOTP.hashCode()) * 31) + this.dOEkyc.hashCode()) * 31) + this.finalxml.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.status.hashCode()) * 31) + this.txnNo.hashCode();
    }

    public String toString() {
        return "DOAadhaarResponse(biodeviceinfo=" + this.biodeviceinfo + ", dOAuthOTP=" + this.dOAuthOTP + ", dOEkyc=" + this.dOEkyc + ", finalxml=" + this.finalxml + ", pur_cd=" + this.pur_cd + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", status=" + this.status + ", txnNo=" + this.txnNo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.biodeviceinfo);
        this.dOAuthOTP.writeToParcel(parcel, flags);
        this.dOEkyc.writeToParcel(parcel, flags);
        parcel.writeString(this.finalxml);
        parcel.writeInt(this.pur_cd);
        parcel.writeString(this.reason);
        parcel.writeString(this.regn_no);
        parcel.writeString(this.status);
        parcel.writeString(this.txnNo);
    }
}
