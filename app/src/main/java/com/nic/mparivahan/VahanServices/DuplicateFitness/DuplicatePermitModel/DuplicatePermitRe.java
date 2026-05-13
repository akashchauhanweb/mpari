package com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0019\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J¹\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\fHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitRe;", "", "applNo", "", "docList", "doclist", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/Doclist;", "Lkotlin/collections/ArrayList;", "firDate", "firNumber", "offCd", "", "pmtNo", "policeStation", "prjname", "purCd", "reason", "reasonTxt", "regnNo", "stateCd", "status", "updatedOn", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplNo", "()Ljava/lang/String;", "getDocList", "getDoclist", "()Ljava/util/ArrayList;", "getFirDate", "getFirNumber", "getOffCd", "()I", "getPmtNo", "getPoliceStation", "getPrjname", "getPurCd", "getReason", "getReasonTxt", "getRegnNo", "getStateCd", "getStatus", "getUpdatedOn", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DuplicatePermitRe {
    private final String applNo;
    private final String docList;
    private final ArrayList<Doclist> doclist;
    private final String firDate;
    private final String firNumber;
    private final int offCd;
    private final String pmtNo;
    private final String policeStation;
    private final String prjname;
    private final int purCd;
    private final String reason;
    private final String reasonTxt;
    private final String regnNo;
    private final String stateCd;
    private final String status;
    private final String updatedOn;

    public DuplicatePermitRe(String applNo, String docList, ArrayList<Doclist> doclist, String firDate, String firNumber, int i, String pmtNo, String policeStation, String prjname, int i2, String reason, String reasonTxt, String regnNo, String stateCd, String status, String updatedOn) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(docList, "docList");
        Intrinsics.checkNotNullParameter(doclist, "doclist");
        Intrinsics.checkNotNullParameter(firDate, "firDate");
        Intrinsics.checkNotNullParameter(firNumber, "firNumber");
        Intrinsics.checkNotNullParameter(pmtNo, "pmtNo");
        Intrinsics.checkNotNullParameter(policeStation, "policeStation");
        Intrinsics.checkNotNullParameter(prjname, "prjname");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(reasonTxt, "reasonTxt");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(updatedOn, "updatedOn");
        this.applNo = applNo;
        this.docList = docList;
        this.doclist = doclist;
        this.firDate = firDate;
        this.firNumber = firNumber;
        this.offCd = i;
        this.pmtNo = pmtNo;
        this.policeStation = policeStation;
        this.prjname = prjname;
        this.purCd = i2;
        this.reason = reason;
        this.reasonTxt = reasonTxt;
        this.regnNo = regnNo;
        this.stateCd = stateCd;
        this.status = status;
        this.updatedOn = updatedOn;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPurCd() {
        return this.purCd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getReasonTxt() {
        return this.reasonTxt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRegnNo() {
        return this.regnNo;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUpdatedOn() {
        return this.updatedOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocList() {
        return this.docList;
    }

    public final ArrayList<Doclist> component3() {
        return this.doclist;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFirDate() {
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
    public final String getPrjname() {
        return this.prjname;
    }

    public final DuplicatePermitRe copy(String applNo, String docList, ArrayList<Doclist> doclist, String firDate, String firNumber, int offCd, String pmtNo, String policeStation, String prjname, int purCd, String reason, String reasonTxt, String regnNo, String stateCd, String status, String updatedOn) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(docList, "docList");
        Intrinsics.checkNotNullParameter(doclist, "doclist");
        Intrinsics.checkNotNullParameter(firDate, "firDate");
        Intrinsics.checkNotNullParameter(firNumber, "firNumber");
        Intrinsics.checkNotNullParameter(pmtNo, "pmtNo");
        Intrinsics.checkNotNullParameter(policeStation, "policeStation");
        Intrinsics.checkNotNullParameter(prjname, "prjname");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(reasonTxt, "reasonTxt");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(updatedOn, "updatedOn");
        return new DuplicatePermitRe(applNo, docList, doclist, firDate, firNumber, offCd, pmtNo, policeStation, prjname, purCd, reason, reasonTxt, regnNo, stateCd, status, updatedOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DuplicatePermitRe)) {
            return false;
        }
        DuplicatePermitRe duplicatePermitRe = (DuplicatePermitRe) other;
        return Intrinsics.areEqual(this.applNo, duplicatePermitRe.applNo) && Intrinsics.areEqual(this.docList, duplicatePermitRe.docList) && Intrinsics.areEqual(this.doclist, duplicatePermitRe.doclist) && Intrinsics.areEqual(this.firDate, duplicatePermitRe.firDate) && Intrinsics.areEqual(this.firNumber, duplicatePermitRe.firNumber) && this.offCd == duplicatePermitRe.offCd && Intrinsics.areEqual(this.pmtNo, duplicatePermitRe.pmtNo) && Intrinsics.areEqual(this.policeStation, duplicatePermitRe.policeStation) && Intrinsics.areEqual(this.prjname, duplicatePermitRe.prjname) && this.purCd == duplicatePermitRe.purCd && Intrinsics.areEqual(this.reason, duplicatePermitRe.reason) && Intrinsics.areEqual(this.reasonTxt, duplicatePermitRe.reasonTxt) && Intrinsics.areEqual(this.regnNo, duplicatePermitRe.regnNo) && Intrinsics.areEqual(this.stateCd, duplicatePermitRe.stateCd) && Intrinsics.areEqual(this.status, duplicatePermitRe.status) && Intrinsics.areEqual(this.updatedOn, duplicatePermitRe.updatedOn);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getDocList() {
        return this.docList;
    }

    public final ArrayList<Doclist> getDoclist() {
        return this.doclist;
    }

    public final String getFirDate() {
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

    public final String getPrjname() {
        return this.prjname;
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
        return (((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.docList.hashCode()) * 31) + this.doclist.hashCode()) * 31) + this.firDate.hashCode()) * 31) + this.firNumber.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.pmtNo.hashCode()) * 31) + this.policeStation.hashCode()) * 31) + this.prjname.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.reason.hashCode()) * 31) + this.reasonTxt.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.status.hashCode()) * 31) + this.updatedOn.hashCode();
    }

    public String toString() {
        return "DuplicatePermitRe(applNo=" + this.applNo + ", docList=" + this.docList + ", doclist=" + this.doclist + ", firDate=" + this.firDate + ", firNumber=" + this.firNumber + ", offCd=" + this.offCd + ", pmtNo=" + this.pmtNo + ", policeStation=" + this.policeStation + ", prjname=" + this.prjname + ", purCd=" + this.purCd + ", reason=" + this.reason + ", reasonTxt=" + this.reasonTxt + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", status=" + this.status + ", updatedOn=" + this.updatedOn + ')';
    }
}
