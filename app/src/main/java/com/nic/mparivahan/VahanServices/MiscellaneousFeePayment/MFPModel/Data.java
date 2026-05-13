package com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J^\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006("}, d2 = {"Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPModel/Data;", "Ljava/io/Serializable;", "applNo", "", "offCd", "", "opDt", "", "purCd", "regnNo", "feeCharge", "stateCd", "(Ljava/lang/String;Ljava/lang/Integer;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getFeeCharge", "getOffCd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOpDt", "()J", "getPurCd", "()I", "getRegnNo", "getStateCd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPModel/Data;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String applNo;
    private final String feeCharge;
    private final Integer offCd;
    private final long opDt;
    private final int purCd;
    private final String regnNo;
    private final String stateCd;

    public Data(String str, Integer num, long j, int i, String str2, String str3, String str4) {
        this.applNo = str;
        this.offCd = num;
        this.opDt = j;
        this.purCd = i;
        this.regnNo = str2;
        this.feeCharge = str3;
        this.stateCd = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getOpDt() {
        return this.opDt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFeeCharge() {
        return this.feeCharge;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    public final Data copy(String applNo, Integer offCd, long opDt, int purCd, String regnNo, String feeCharge, String stateCd) {
        return new Data(applNo, offCd, opDt, purCd, regnNo, feeCharge, stateCd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.offCd, data.offCd) && this.opDt == data.opDt && this.purCd == data.purCd && Intrinsics.areEqual(this.regnNo, data.regnNo) && Intrinsics.areEqual(this.feeCharge, data.feeCharge) && Intrinsics.areEqual(this.stateCd, data.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getFeeCharge() {
        return this.feeCharge;
    }

    public final Integer getOffCd() {
        return this.offCd;
    }

    public final long getOpDt() {
        return this.opDt;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.offCd;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.opDt)) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str2 = this.regnNo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feeCharge;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stateCd;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", feeCharge=" + this.feeCharge + ", stateCd=" + this.stateCd + ')';
    }
}
