package com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ju\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "Ljava/io/Serializable;", "stateCd", "", "offCd", "", "applNo", "purCd", "regNo", "releaseDt", "relFileRefNo", "relApprovedBy", "relOpDt", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getApplNo", "()Ljava/lang/String;", "getOffCd", "()Ljava/lang/Object;", "getPurCd", "getRegNo", "getRelApprovedBy", "getRelFileRefNo", "getRelOpDt", "getReleaseDt", "getStateCd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Data implements Serializable {
    private final String applNo;
    private final Object offCd;
    private final Object purCd;
    private final String regNo;
    private final String relApprovedBy;
    private final String relFileRefNo;
    private final Object relOpDt;
    private final String releaseDt;
    private final String stateCd;

    public Data(String str, Object obj, String str2, Object obj2, String str3, String str4, String str5, String str6, Object obj3) {
        this.stateCd = str;
        this.offCd = obj;
        this.applNo = str2;
        this.purCd = obj2;
        this.regNo = str3;
        this.releaseDt = str4;
        this.relFileRefNo = str5;
        this.relApprovedBy = str6;
        this.relOpDt = obj3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegNo() {
        return this.regNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReleaseDt() {
        return this.releaseDt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRelFileRefNo() {
        return this.relFileRefNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRelApprovedBy() {
        return this.relApprovedBy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getRelOpDt() {
        return this.relOpDt;
    }

    public final Data copy(String stateCd, Object offCd, String applNo, Object purCd, String regNo, String releaseDt, String relFileRefNo, String relApprovedBy, Object relOpDt) {
        return new Data(stateCd, offCd, applNo, purCd, regNo, releaseDt, relFileRefNo, relApprovedBy, relOpDt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.stateCd, data.stateCd) && Intrinsics.areEqual(this.offCd, data.offCd) && Intrinsics.areEqual(this.applNo, data.applNo) && Intrinsics.areEqual(this.purCd, data.purCd) && Intrinsics.areEqual(this.regNo, data.regNo) && Intrinsics.areEqual(this.releaseDt, data.releaseDt) && Intrinsics.areEqual(this.relFileRefNo, data.relFileRefNo) && Intrinsics.areEqual(this.relApprovedBy, data.relApprovedBy) && Intrinsics.areEqual(this.relOpDt, data.relOpDt);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final Object getOffCd() {
        return this.offCd;
    }

    public final Object getPurCd() {
        return this.purCd;
    }

    public final String getRegNo() {
        return this.regNo;
    }

    public final String getRelApprovedBy() {
        return this.relApprovedBy;
    }

    public final String getRelFileRefNo() {
        return this.relFileRefNo;
    }

    public final Object getRelOpDt() {
        return this.relOpDt;
    }

    public final String getReleaseDt() {
        return this.releaseDt;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        String str = this.stateCd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.offCd;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.applNo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.purCd;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.regNo;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.releaseDt;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.relFileRefNo;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.relApprovedBy;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj3 = this.relOpDt;
        return iHashCode8 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return "Data(stateCd=" + this.stateCd + ", offCd=" + this.offCd + ", applNo=" + this.applNo + ", purCd=" + this.purCd + ", regNo=" + this.regNo + ", releaseDt=" + this.releaseDt + ", relFileRefNo=" + this.relFileRefNo + ", relApprovedBy=" + this.relApprovedBy + ", relOpDt=" + this.relOpDt + ')';
    }
}
