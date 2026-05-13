package com.nic.mparivahan.VahanServices.Nominee.NModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, d2 = {"Lcom/nic/mparivahan/VahanServices/Nominee/NModel/DataX;", "", "applNo", "", "nominationDt", "nomineeName", "offCd", "", "opdt", "purCd", "regnNo", "relation", "stateCd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getNominationDt", "getNomineeName", "getOffCd", "()I", "getOpdt", "getPurCd", "getRegnNo", "getRelation", "getStateCd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DataX {
    private final String applNo;
    private final String nominationDt;
    private final String nomineeName;
    private final int offCd;
    private final String opdt;
    private final int purCd;
    private final String regnNo;
    private final int relation;
    private final String stateCd;

    public DataX(String str, String str2, String str3, int i, String str4, int i2, String str5, int i3, String str6) {
        this.applNo = str;
        this.nominationDt = str2;
        this.nomineeName = str3;
        this.offCd = i;
        this.opdt = str4;
        this.purCd = i2;
        this.regnNo = str5;
        this.relation = i3;
        this.stateCd = str6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNominationDt() {
        return this.nominationDt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNomineeName() {
        return this.nomineeName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOpdt() {
        return this.opdt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRelation() {
        return this.relation;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    public final DataX copy(String applNo, String nominationDt, String nomineeName, int offCd, String opdt, int purCd, String regnNo, int relation, String stateCd) {
        return new DataX(applNo, nominationDt, nomineeName, offCd, opdt, purCd, regnNo, relation, stateCd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataX)) {
            return false;
        }
        DataX dataX = (DataX) other;
        return Intrinsics.areEqual(this.applNo, dataX.applNo) && Intrinsics.areEqual(this.nominationDt, dataX.nominationDt) && Intrinsics.areEqual(this.nomineeName, dataX.nomineeName) && this.offCd == dataX.offCd && Intrinsics.areEqual(this.opdt, dataX.opdt) && this.purCd == dataX.purCd && Intrinsics.areEqual(this.regnNo, dataX.regnNo) && this.relation == dataX.relation && Intrinsics.areEqual(this.stateCd, dataX.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getNominationDt() {
        return this.nominationDt;
    }

    public final String getNomineeName() {
        return this.nomineeName;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpdt() {
        return this.opdt;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final int getRelation() {
        return this.relation;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nominationDt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nomineeName;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        String str4 = this.opdt;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str5 = this.regnNo;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.relation)) * 31;
        String str6 = this.stateCd;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "DataX(applNo=" + this.applNo + ", nominationDt=" + this.nominationDt + ", nomineeName=" + this.nomineeName + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", relation=" + this.relation + ", stateCd=" + this.stateCd + ')';
    }
}
