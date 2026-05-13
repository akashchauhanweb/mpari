package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003JÅ\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\rHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DataX;", "Ljava/io/Serializable;", "applNo", "", "docList", "doclist", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DoclistXX;", "Lkotlin/collections/ArrayList;", "firDate", "", "firNumber", "offCd", "", "pmtNo", "policeStation", "purCd", "reason", "reasonTxt", "regnNo", "stateCd", "status", "updatedOn", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getDocList", "getDoclist", "()Ljava/util/ArrayList;", "getFirDate", "()J", "getFirNumber", "getOffCd", "()I", "getPmtNo", "getPoliceStation", "getPurCd", "getReason", "getReasonTxt", "getRegnNo", "getStateCd", "getStatus", "getUpdatedOn", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DataX implements Serializable {
    private final String applNo;
    private final String docList;
    private final ArrayList<DoclistXX> doclist;
    private final long firDate;
    private final String firNumber;
    private final int offCd;
    private final String pmtNo;
    private final String policeStation;
    private final int purCd;
    private final String reason;
    private final String reasonTxt;
    private final String regnNo;
    private final String stateCd;
    private final String status;
    private final String updatedOn;

    public DataX(String str, String str2, ArrayList<DoclistXX> doclist, long j, String str3, int i, String str4, String str5, int i2, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(doclist, "doclist");
        this.applNo = str;
        this.docList = str2;
        this.doclist = doclist;
        this.firDate = j;
        this.firNumber = str3;
        this.offCd = i;
        this.pmtNo = str4;
        this.policeStation = str5;
        this.purCd = i2;
        this.reason = str6;
        this.reasonTxt = str7;
        this.regnNo = str8;
        this.stateCd = str9;
        this.status = str10;
        this.updatedOn = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getReasonTxt() {
        return this.reasonTxt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getUpdatedOn() {
        return this.updatedOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocList() {
        return this.docList;
    }

    public final ArrayList<DoclistXX> component3() {
        return this.doclist;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getFirDate() {
        return this.firDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirNumber() {
        return this.firNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOffCd() {
        return this.offCd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPmtNo() {
        return this.pmtNo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPoliceStation() {
        return this.policeStation;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    public final DataX copy(String applNo, String docList, ArrayList<DoclistXX> doclist, long firDate, String firNumber, int offCd, String pmtNo, String policeStation, int purCd, String reason, String reasonTxt, String regnNo, String stateCd, String status, String updatedOn) {
        Intrinsics.checkNotNullParameter(doclist, "doclist");
        return new DataX(applNo, docList, doclist, firDate, firNumber, offCd, pmtNo, policeStation, purCd, reason, reasonTxt, regnNo, stateCd, status, updatedOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataX)) {
            return false;
        }
        DataX dataX = (DataX) other;
        return Intrinsics.areEqual(this.applNo, dataX.applNo) && Intrinsics.areEqual(this.docList, dataX.docList) && Intrinsics.areEqual(this.doclist, dataX.doclist) && this.firDate == dataX.firDate && Intrinsics.areEqual(this.firNumber, dataX.firNumber) && this.offCd == dataX.offCd && Intrinsics.areEqual(this.pmtNo, dataX.pmtNo) && Intrinsics.areEqual(this.policeStation, dataX.policeStation) && this.purCd == dataX.purCd && Intrinsics.areEqual(this.reason, dataX.reason) && Intrinsics.areEqual(this.reasonTxt, dataX.reasonTxt) && Intrinsics.areEqual(this.regnNo, dataX.regnNo) && Intrinsics.areEqual(this.stateCd, dataX.stateCd) && Intrinsics.areEqual(this.status, dataX.status) && Intrinsics.areEqual(this.updatedOn, dataX.updatedOn);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getDocList() {
        return this.docList;
    }

    public final ArrayList<DoclistXX> getDoclist() {
        return this.doclist;
    }

    public final long getFirDate() {
        return this.firDate;
    }

    public final String getFirNumber() {
        return this.firNumber;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getPmtNo() {
        return this.pmtNo;
    }

    public final String getPoliceStation() {
        return this.policeStation;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonTxt() {
        return this.reasonTxt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUpdatedOn() {
        return this.updatedOn;
    }

    public int hashCode() {
        String str = this.applNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.docList;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.doclist.hashCode()) * 31) + Long.hashCode(this.firDate)) * 31;
        String str3 = this.firNumber;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        String str4 = this.pmtNo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.policeStation;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str6 = this.reason;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.reasonTxt;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.regnNo;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.stateCd;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.status;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.updatedOn;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "DataX(applNo=" + this.applNo + ", docList=" + this.docList + ", doclist=" + this.doclist + ", firDate=" + this.firDate + ", firNumber=" + this.firNumber + ", offCd=" + this.offCd + ", pmtNo=" + this.pmtNo + ", policeStation=" + this.policeStation + ", purCd=" + this.purCd + ", reason=" + this.reason + ", reasonTxt=" + this.reasonTxt + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", status=" + this.status + ", updatedOn=" + this.updatedOn + ')';
    }
}
