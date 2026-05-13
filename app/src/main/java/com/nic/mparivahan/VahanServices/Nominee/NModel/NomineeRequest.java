package com.nic.mparivahan.VahanServices.Nominee.NModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Je\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, d2 = {"Lcom/nic/mparivahan/VahanServices/Nominee/NModel/NomineeRequest;", "", "applNo", "", "nominationDt", "nomineeName", "offCd", "", "opdt", "purCd", "regnNo", "relation", "stateCd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getNominationDt", "getNomineeName", "getOffCd", "()I", "getOpdt", "getPurCd", "getRegnNo", "getRelation", "getStateCd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NomineeRequest {
    private final String applNo;
    private final String nominationDt;
    private final String nomineeName;
    private final int offCd;
    private final String opdt;
    private final int purCd;
    private final String regnNo;
    private final int relation;
    private final String stateCd;

    public NomineeRequest(String str, String nominationDt, String nomineeName, int i, String opdt, int i2, String regnNo, int i3, String stateCd) {
        Intrinsics.checkNotNullParameter(nominationDt, "nominationDt");
        Intrinsics.checkNotNullParameter(nomineeName, "nomineeName");
        Intrinsics.checkNotNullParameter(opdt, "opdt");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        this.applNo = str;
        this.nominationDt = nominationDt;
        this.nomineeName = nomineeName;
        this.offCd = i;
        this.opdt = opdt;
        this.purCd = i2;
        this.regnNo = regnNo;
        this.relation = i3;
        this.stateCd = stateCd;
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

    public final NomineeRequest copy(String applNo, String nominationDt, String nomineeName, int offCd, String opdt, int purCd, String regnNo, int relation, String stateCd) {
        Intrinsics.checkNotNullParameter(nominationDt, "nominationDt");
        Intrinsics.checkNotNullParameter(nomineeName, "nomineeName");
        Intrinsics.checkNotNullParameter(opdt, "opdt");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        return new NomineeRequest(applNo, nominationDt, nomineeName, offCd, opdt, purCd, regnNo, relation, stateCd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NomineeRequest)) {
            return false;
        }
        NomineeRequest nomineeRequest = (NomineeRequest) other;
        return Intrinsics.areEqual(this.applNo, nomineeRequest.applNo) && Intrinsics.areEqual(this.nominationDt, nomineeRequest.nominationDt) && Intrinsics.areEqual(this.nomineeName, nomineeRequest.nomineeName) && this.offCd == nomineeRequest.offCd && Intrinsics.areEqual(this.opdt, nomineeRequest.opdt) && this.purCd == nomineeRequest.purCd && Intrinsics.areEqual(this.regnNo, nomineeRequest.regnNo) && this.relation == nomineeRequest.relation && Intrinsics.areEqual(this.stateCd, nomineeRequest.stateCd);
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
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.nominationDt.hashCode()) * 31) + this.nomineeName.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opdt.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.regnNo.hashCode()) * 31) + Integer.hashCode(this.relation)) * 31) + this.stateCd.hashCode();
    }

    public String toString() {
        return "NomineeRequest(applNo=" + this.applNo + ", nominationDt=" + this.nominationDt + ", nomineeName=" + this.nomineeName + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", relation=" + this.relation + ", stateCd=" + this.stateCd + ')';
    }
}
